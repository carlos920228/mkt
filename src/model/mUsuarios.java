package model;

import controller.Utilerias;
import java.sql.Statement;
import java.util.ArrayList;

public class mUsuarios {
public boolean insertar(ArrayList datos){
   Conexion conexion=new Conexion();
   conexion.conectar();
       try {
           Statement sql=conexion.getConexion().createStatement();
           sql.executeUpdate("insert into usuarios (nombre,rol,contra,creacion) "
                   + "values ('"+datos.get(0).toString()+"','"+datos.get(1).toString()+"','"+datos.get(2).toString()+"'"
                           + ",'"+new Utilerias().fecha()+"')");
           conexion.getConexion().close();
           return true;
       } catch (Exception e) {
           System.out.println("error insertal cliente"+e);
           return false;
       }
       
   }    
}
