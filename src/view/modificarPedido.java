package view;


import controller.Utilerias;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.mFavoritos;
import model.mOrden;
import pruebatiket.Ticket;

public class modificarPedido extends javax.swing.JFrame {
String user,cliente,cantidad;
public String imprimir,pedido;
DefaultTableModel table;
    public modificarPedido(String user, String cliente) {
        initComponents();
        this.user=user;
        this.cliente=cliente;
        jLabel2.setText(cliente);
        cantidad="0.0";
        setTitle("Modificar Pedido");
        setVisible(true);
        cargarProductos();
        jTextField1.setText(cantidad);
        jTable1.setDefaultRenderer(Object.class,new Render());
        table=(DefaultTableModel)jTable1.getModel();
        imprimir="Cabaña";
        jComboBox1.setVisible(false);
        loadOrder();
    }
private void cargarProductos(){
    ArrayList product=new mFavoritos().productList(cliente);
    ArrayList product1=(ArrayList)product.get(0);
    ArrayList product2=(ArrayList)product.get(1);
    ArrayList product3=(ArrayList)product.get(2);
    ArrayList product4=(ArrayList)product.get(3);
    ArrayList product5=(ArrayList)product.get(4);                           
    jButton1.setText(product1.get(1).toString());
    jButton1.setName(product1.get(2).toString());
    jButton2.setText(product2.get(1).toString());
    jButton2.setName(product2.get(2).toString());
    jButton3.setText(product3.get(1).toString());
    jButton3.setName(product3.get(2).toString());
    jButton4.setText(product4.get(1).toString());
    jButton4.setName(product4.get(2).toString());
    jButton5.setText(product5.get(1).toString());
    jButton5.setName(product5.get(2).toString());
    
    }
private void loadOrder(){
ArrayList data=new mOrden().orders(cliente,new Utilerias().fecha());
if(data.size()>1){
jComboBox1.removeAllItems();
    for (Object o:data) {
       jComboBox1.addItem(o.toString());
    }
    jComboBox1.setVisible(true);
}else{
if(!data.isEmpty()){
pedido=data.get(0).toString();
llenarTabla(data.get(0).toString());
}
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cantidad");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 102, 0));
        jTextField1.setText("0.0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Cliente");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("super ultra re contra largo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(188, 209, 209));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton6.setText("1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(188, 209, 209));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(188, 209, 209));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton8.setText("4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(188, 209, 209));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton9.setText("3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(188, 209, 209));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton10.setText("6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(188, 209, 209));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton11.setText("5");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(188, 209, 209));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(188, 209, 209));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton13.setText("8");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cantidad", "Producto", "Precio", "Subtotal", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jButton14.setBackground(new java.awt.Color(188, 209, 209));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton14.setText("0");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(188, 209, 209));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton15.setText("9");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(188, 209, 209));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/retroceso.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(188, 209, 209));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton17.setText(".");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/impresora.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setText("Cabaña");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void llenarTabla(String id){
ArrayList tab=new mOrden().orderProducts(id);
for (Object o:tab) {
       ArrayList row=(ArrayList)o;
       JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(30,30));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        table.addRow(new Object[]{row.get(0).toString(),row.get(4).toString(),row.get(1).toString(),row.get(2).toString(),row.get(3).toString(),note});
    }
}
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton6.getText();
        }else{
        cantidad+=jButton6.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if(cantidad.equals("0.0")){
        JOptionPane.showMessageDialog(null, "Debes poner la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        Float precio=Float.parseFloat(jButton5.getName());
        Float subTotal=precio*Float.parseFloat(cantidad);
        JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(40,40));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        String idRow=new mOrden().insertRowModifyOrder(jButton5.getText(),jButton5.getName(),cantidad,subTotal.toString(),pedido);
        table.addRow(new Object[]{idRow,cantidad,jButton5.getText(),jButton5.getName(),subTotal,note});  
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton7.getText();
        }else{
        cantidad+=jButton7.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton9.getText();
        }else{
        cantidad+=jButton9.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if(cantidad.equals("0.0")){
        cantidad=jButton8.getText();
        }else{
        cantidad+=jButton8.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton11.getText();
        }else{
        cantidad+=jButton11.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton10.getText();
        }else{
        cantidad+=jButton10.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       if(cantidad.equals("0.0")){
        cantidad=jButton12.getText();
        }else{
        cantidad+=jButton12.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton13.getText();
        }else{
        cantidad+=jButton13.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton15.getText();
        }else{
        cantidad+=jButton15.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton14.getText();
        }else{
        cantidad+=jButton14.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(cantidad.equals("0.0")){
        cantidad=jButton17.getText();
        }else{
        cantidad+=jButton17.getText();
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(cantidad.equals("0.0")||cantidad.length()==0){
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }else{
        cantidad = cantidad.substring(0,cantidad.length() - 1);
        }
        jTextField1.setText(cantidad);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(cantidad.equals("0.0")){
        JOptionPane.showMessageDialog(null, "Debes poner la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        Float precio=Float.parseFloat(jButton2.getName());
        Float subTotal=precio*Float.parseFloat(cantidad);
        JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(30,30));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        String idRow=new mOrden().insertRowModifyOrder(jButton2.getText(),jButton2.getName(),cantidad,subTotal.toString(),pedido);
        table.addRow(new Object[]{idRow,cantidad,jButton2.getText(),jButton2.getName(),subTotal,note});      
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cantidad.equals("0.0")){
        JOptionPane.showMessageDialog(null, "Debes poner la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        Float precio=Float.parseFloat(jButton1.getName());
        Float subTotal=precio*Float.parseFloat(cantidad);
        JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(30,30));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        String idRow=new mOrden().insertRowModifyOrder(jButton1.getText(),jButton1.getName(),cantidad,subTotal.toString(),pedido);
        table.addRow(new Object[]{idRow,cantidad,jButton1.getText(),jButton1.getName(),subTotal,note});  
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if(cantidad.equals("0.0")){
        JOptionPane.showMessageDialog(null, "Debes poner la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        Float precio=Float.parseFloat(jButton4.getName());
        Float subTotal=precio*Float.parseFloat(cantidad);
        JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(30,30));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        String idRow=new mOrden().insertRowModifyOrder(jButton4.getText(),jButton4.getName(),cantidad,subTotal.toString(),pedido);
        table.addRow(new Object[]{idRow,cantidad,jButton4.getText(),jButton4.getName(),subTotal,note});  
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(cantidad.equals("0.0")){
        JOptionPane.showMessageDialog(null, "Debes poner la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        Float precio=Float.parseFloat(jButton3.getName());
        Float subTotal=precio*Float.parseFloat(cantidad);
        JButton note=new JButton();
        note.setName("note");
        note.setSize(new Dimension(30,30));
        note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete2.png")));
        String idRow=new mOrden().insertRowModifyOrder(jButton3.getText(),jButton3.getName(),cantidad,subTotal.toString(),pedido);
        table.addRow(new Object[]{idRow,cantidad,jButton3.getText(),jButton3.getName(),subTotal,note});  
        cantidad="0.0";
        jTextField1.setText(cantidad);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int columna=jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila=evt.getY()/jTable1.getRowHeight();
         if(fila < jTable1.getRowCount() && fila >= 0 && columna < jTable1.getColumnCount() && columna >= 0){
            Object value = jTable1.getValueAt(fila, columna);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                if(boton.getName().equals("note")){
                    String id=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
                    new mOrden().delete(id);
                    table.removeRow(jTable1.getSelectedRow());
                                       
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new DirectorioV2(user);
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed
    private ArrayList loadData(){
     ArrayList data = new ArrayList();
        for (int i = 0; i < this.jTable1.getRowCount(); i++) {
            ArrayList row = new ArrayList();
            String cantidad=table.getValueAt(i, 1).toString();
            while(cantidad.length()<15){
            cantidad+=" ";
            }
            imprimir+=cantidad+table.getValueAt(i, 2).toString()+"\n";
            row.add(table.getValueAt(i, 1).toString());
            row.add(table.getValueAt(i, 2).toString());
            row.add(table.getValueAt(i, 0).toString());
            row.add(table.getValueAt(i, 3).toString());
            data.add(row);
        }
        return data;
    }
    
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    Ticket ticket = new Ticket();
    
    imprimir ="Cliente:"+cliente+"\n" +"Fecha:"+new Utilerias().fecha()+"\n\n" +"Cantidad       Producto\n" ;  
    loadData();
    imprimir+="Atendió: "+user+"\n \\027\\033\\008TITULO EN NEGRITA\\027\\033\\000\\n OBSERVACION: "+jTextField2.getText();
    Ticket.AddSubCabecera(imprimir);
    Ticket.ImprimirDocumento();
    
//new DirectorioV2(user);
    //this.dispose();			
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
    
    }//GEN-LAST:event_jComboBox1MouseEntered

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
    llenarTabla(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables



public class Imp implements Printable {
    
       //Se obtienen las lineas de texto del JTextArea, la linea de texto finaliza cuando se encuentra el caracter de nueva linea \n
       StringTokenizer lineasdetexto = new StringTokenizer(imprimir, "\n",true);
       //Se obtiene el total de lineas de texto
       int totallineas = lineasdetexto.countTokens();

    int[] paginas;  // Arreglo de número de paginas que se necesitaran para imprimir todo el texto 

    String[] textoLineas; //Lineas de texto que se imprimiran en cada hoja

    //Metodo que se crea por default cuando una clase implementa a Printable
    public int print(Graphics g, PageFormat pf, int pageIndex)
             throws PrinterException {
        //Se establece la fuente, el tipo, el tamaño, la metrica según la fuente asignada, 
        //obtiene la altura de cada linea de texto para que todas queden iguales
        Font font = new Font("Serif", Font.PLAIN,8);
        FontMetrics metrics = g.getFontMetrics(font);
        int altodelinea = metrics.getHeight();
        //Calcula el número de lineas por pagina y el total de paginas
        if (paginas == null) {
            initTextoLineas();
            //Calcula las lineas que le caben a cada página dividiendo la altura imprimible entre la altura de la linea de texto
            int lineasPorPagina = (int)(pf.getImageableHeight()/altodelinea);
            //Calcula el numero de páginas dividiendo el total de lineas entre el numero de lineas por página
            int numeroPaginas = (textoLineas.length-1)/lineasPorPagina;
            paginas = new int[numeroPaginas];
            for (int b=0; b<numeroPaginas; b++) {
                paginas[b] = (b+1)*lineasPorPagina; 
            }
        }
        //Si se recibe un indice de página mayor que el total de páginas calculadas entonces 
        //retorna NO_SUCH_PAGE para indicar que tal pagina no existe 
        if (pageIndex > paginas.length) {
            return NO_SUCH_PAGE;
        }
        /*Por lo regular cuando dibujamos algun objeto lo coloca en la coordenada (0,0), esta coordenada 
         * se encuentra fuera del área imprimible, por tal motivo se debe trasladar la posicion de las lineas de texto
         * según el área imprimible del eje X y el eje Y 
         */
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY()-20);
        /*Dibujamos cada línea de texto en cada página,
         * se aumenta a la posición 'y' la altura de la línea a cada línea de texto para evitar la saturación de texto 
         */

        int y = 0; 
        int start = (pageIndex == 0) ? 0 : paginas[pageIndex-1];
        int end   = (pageIndex == paginas.length) ? textoLineas.length : paginas[pageIndex];
        for (int line=start; line<end; line++) {
            y += altodelinea;
            g.drawString(textoLineas[line], 0, y);
        }
        /* Retorna PAGE_EXISTS para indicar al invocador que esta página es parte del documento impreso
         */
        return PAGE_EXISTS;
    }
    
     /* Agrega las lineas de texto al arreglo */
    public void initTextoLineas() {
        if (textoLineas == null) {
            int numLineas=totallineas;
            textoLineas = new String[numLineas];
            //Se llena el arreglo que contiene todas las lineas de texto
            while(lineasdetexto.hasMoreTokens()){
            for (int i=0;i<numLineas;i++) {
                textoLineas[i] = lineasdetexto.nextToken();
            }
            }
        }
    }
    
    //Este metodo crea un objeto Printerjob el cual es inicializado y asociado con la impresora por default
    public void imprimirnomina() {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         //Si el usuario presiona imprimir en el dialogo de impresión, 
         //entonces intenta imprimir todas las lineas de texto
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }
}}