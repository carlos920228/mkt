
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mFavoritos {
    public ArrayList productList(String cliente){
   ArrayList data= new ArrayList();
   Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            Statement sql = conexion.getConexion().createStatement();
            ResultSet result = sql.executeQuery("select *from favorito where cliente='"+cliente+"'");
            while (result.next()) {
               ArrayList datas=new ArrayList();
               datas.add(result.getString("id"));
               datas.add(result.getString("producto"));
               datas.add(result.getString("precio"));
               data.add(datas);
            }
            conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println("Error consult favoritos List " + e);
        }
        return data;
   }
    public boolean actualizar(ArrayList o){
        Conexion conexion = new Conexion();
        conexion.conectar();
        try {
        Statement sql=conexion.getConexion().createStatement();
        for(Object e:o){
        ArrayList row=(ArrayList)e;
        sql.executeUpdate("update favorito set producto='"+row.get(1).toString()+"', precio='"+row.get(2).toString()+"' where id='"+row.get(0).toString()+"'");
        } conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println(e);
            return false;}
    return true;
    }
}
