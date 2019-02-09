
package view;

import controller.Utilerias;
import java.awt.Dimension;
import java.util.ArrayList;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.mClientes;

public class DirectorioV2 extends javax.swing.JFrame {
String user;
DefaultTableModel table;
    public DirectorioV2(String user) {
        initComponents();
        this.user=user;
        setVisible(true);
        setTitle("Directorio");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jTable1.setDefaultRenderer(Object.class,new Render());
        table=(DefaultTableModel)jTable1.getModel();
        loadDirectory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono", "Horario", "Observación", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(800);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int columna=jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila=evt.getY()/jTable1.getRowHeight();
         if(fila < jTable1.getRowCount() && fila >= 0 && columna < jTable1.getColumnCount() && columna >= 0){
            Object value = jTable1.getValueAt(fila, columna);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getName().equals("carro")){
                    Object client = jTable1.getValueAt(fila, 0);
                    System.out.println("vender a:"+client.toString());
                    //EVENTOS MODIFICAR
                }
                if(boton.getName().equals("note")){
                    Object client = jTable1.getValueAt(fila, 0);
                    System.out.println("observacion a"+client.toString());
                    //EVENTOS ELIMINAR
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked
private void loadDirectory(){
JButton note=new JButton();
note.setName("note");
note.setSize(new Dimension(30,30));
note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/note.png")));
note.setOpaque(false);
JButton cpr=new JButton();
cpr.setName("carro");
cpr.setSize(new Dimension(30,30));
cpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/561236.png"))); // NOI18N
ArrayList directory=new mClientes().directory(new Utilerias().fecha());
for(Object o:directory){
    ArrayList row=(ArrayList)o;
    table.addRow(new Object[]{row.get(0).toString(),row.get(1).toString(),row.get(2).toString(),row.get(3).toString(),cpr,note});
}}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
