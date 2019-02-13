
package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class Teclado extends JPanel{
 
 JTextField txt;
 String teclas[]={"1","2","3","4","5","6","7","8","9","0","Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Ñ","Z","X","C","V","B","N","M",".",":"};
 ArrayList<JButton> botones=new ArrayList<JButton>();
 JPanel pletras,pespacio;
 JButton next;
 public Teclado(JTextField t, JButton next){
  this.next=next;
  txt=t;
  pletras=new JPanel();
  setLayout(new BorderLayout());
  pletras.setLayout(new GridLayout(4,10,5,5));
  
  
  ActionListener accion=new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    
    if(!b.getText().equalsIgnoreCase(" ")){
     txt.setText(""+txt.getText()+b.getText());
    }else{
     txt.setText(txt.getText()+" ");
    }
   }
   
  };
  txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt.setFocusable(true);
            }
        });
         
  ActionListener delete=new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
        if(txt.getText().length()>0){
         txt.setText(txt.getText().substring(0,txt.getText().length() - 1));}
           }
     };
  ActionListener ocultar=new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    txt.setFocusable(false);
    
           }
     };
  for(int i=0;i<39;i++){
   if(teclas[i].equalsIgnoreCase("Z")){
    JLabel l=new JLabel();
    l.setPreferredSize(new Dimension(50,50));
    pletras.add(l);
   }
   JButton b=new JButton(teclas[i]);
   b.setPreferredSize(new Dimension(50,50));
   b.addActionListener(accion);
   pletras.add(b);
   botones.add(b);
  }
  
  pespacio=new JPanel(new GridLayout(1,3));
  JButton bespacio=new JButton(" ");
  JButton borrar=new JButton(" ");
  JButton enter=new JButton(" ");
  enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enter.jpg")));
  borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/retroceso.png")));
  bespacio.addActionListener(accion);
  borrar.setName("retroceso");
  borrar.addActionListener(delete);
  enter.addActionListener(ocultar);
  pespacio.add(new JLabel());
  pespacio.add(bespacio);
  pespacio.add(new JLabel());
  pespacio.add(borrar);
  pespacio.add(enter);
  add(pletras);
  add(pespacio,BorderLayout.SOUTH); 
 }
}
