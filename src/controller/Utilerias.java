/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.rowset.internal.Row;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.scene.control.Cell;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author softlution
 */
public class Utilerias {
   public String fecha(){
   java.text.SimpleDateFormat fecha = new java.text.SimpleDateFormat("yyyy-MM-dd");
   java.util.Date date = new java.util.Date();
   return fecha.format(date);
   
   }
public String usuario(){
try {
        BufferedReader fr = new BufferedReader(new FileReader("usuario.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}
public String local(){
    try {
        BufferedReader fr = new BufferedReader(new FileReader("local.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}

public String leerRfc(){
try {
        BufferedReader fr = new BufferedReader(new FileReader("rfc.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}
public String telefono(){
try {
        BufferedReader fr = new BufferedReader(new FileReader("telefono.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}
public String direccion(){
try {
        BufferedReader fr = new BufferedReader(new FileReader("direccion.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}
public String permiso(){
try {
        BufferedReader fr = new BufferedReader(new FileReader("permiso.txt")); 
        String local="";
        while(fr.ready()){
        local=fr.readLine();
        }
        fr.close();
        return local;
    } catch (Exception e) {
        System.out.println(e);
        return"Error";
    }
}
public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    org.apache.poi.ss.usermodel.Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        org.apache.poi.ss.usermodel.Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    org.apache.poi.ss.usermodel.Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        org.apache.poi.ss.usermodel.Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
public String moneda(Double cantidad){
 Locale locale = new Locale("es","MX"); // elegimos México
 NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
 return nf.format(cantidad);
}
}
