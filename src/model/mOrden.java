package model;

import controller.Utilerias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    
    public String  insertRowModifyOrder(String pro,String pre,String cant,String sub, String id){
    Conexion conexion = new Conexion();
        conexion.conectar();
        String sqlString="insert into productosOrden(producto, precio,cantidad,subtotal,idpedido) values";
        sqlString+="('"+pro+"','"+pre+"','"+cant+"','"+sub+"','"+id+"')";
        sqlString+=";";
        try {
            PreparedStatement sql = conexion.getConexion().prepareStatement(sqlString);
            sql.execute();
            ResultSet r = sql.executeQuery("select LAST_INSERT_ID() as id");
            r.next();
            String idO = r.getString("id");
            conexion.getConexion().close();
            return idO;
        } catch (Exception e) {
            System.out.println("Error en insertarDeparture" + e);
            return "Error";
        }
    }
    public ArrayList orders(String cliente, String fecha){
    ArrayList datas=new ArrayList();
    Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            Statement sql = conexion.getConexion().createStatement();
            ResultSet result = sql.executeQuery("select idpedido from orden where cliente='"+cliente+"' and fecha='"+fecha+"'");
            while (result.next()) {
               datas.add(result.getString("idpedido"));
            }
            conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println("Error consult Repartidores List " + e);
        }
    return datas;
    }
    public ArrayList orderProducts(String id){
     ArrayList datas=new ArrayList();
    Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            Statement sql = conexion.getConexion().createStatement();
            ResultSet result = sql.executeQuery("select *from productosorden where idpedido='"+id+"'");
            while (result.next()) {
               ArrayList data=new ArrayList();
               data.add(result.getString("idproductosPedido"));
               data.add(result.getString("producto"));
               data.add(result.getString("precio"));
               data.add(result.getString("subtotal"));
               data.add(result.getString("cantidad"));
               datas.add(data);
            }
            conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println("Error consult Repartidores List " + e);
        }
    return datas;
    }
    public boolean delete(String id){
        Conexion conexion = new Conexion();
        conexion.conectar();
        try {
        Statement sql=conexion.getConexion().createStatement();
        sql.executeUpdate("delete from productosOrden where idproductosPedido='"+id+"'");
        conexion.getConexion().close();
        return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;}
    }
    
}
