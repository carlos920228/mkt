package model;

import controller.Utilerias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class mOrden {
    public String insertOrder(ArrayList data){
    Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            PreparedStatement sql = conexion.getConexion().prepareStatement("insert into orden (cliente,fecha,observaciones,usuario) values (?,?,?,?)");
            sql.setString(1, data.get(0).toString());
            sql.setString(2, new Utilerias().fecha());
            sql.setString(3, data.get(1).toString());
            sql.setString(4, data.get(2).toString());
            sql.execute();
            ResultSet r = sql.executeQuery("select LAST_INSERT_ID() as id");
            r.next();
            String id = r.getString("id");
            conexion.getConexion().close();
            return id;
        } catch (Exception e) {
            System.out.println("Error en insertarDeparture" + e);
            return "Error";
        }
    }
    public boolean insertRowOrder(ArrayList rows, String id){
    Conexion conexion = new Conexion();
        conexion.conectar();
        String sqlString="insert into productosOrden(producto, precio,cantidad,subtotal,idpedido) values";
        String del="";
        for(Object o:rows){
        ArrayList row=(ArrayList)o;
        sqlString+=del;
        sqlString+="('"+row.get(0).toString()+"','"+row.get(1).toString()+"','"+row.get(2).toString()+"','"+row.get(3).toString()+"','"+id+"')";
        del=",";
        }
        sqlString+=";";
        try {
            PreparedStatement sql = conexion.getConexion().prepareStatement(sqlString);
            sql.execute();
            conexion.getConexion().close();
            return true;
        } catch (Exception e) {
            System.out.println("Error en insertarDeparture" + e);
            return false;
        }
    }
}
