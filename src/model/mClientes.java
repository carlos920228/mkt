
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class mClientes {
   public boolean insert(ArrayList datos){
   Conexion conexion=new Conexion();
   conexion.conectar();
       try {
           Statement sql=conexion.getConexion().createStatement();
           sql.executeUpdate("insert into clientesPedidos (nombre,telefono,direccion,horario,descanso) "
                   + "values ('"+datos.get(0).toString()+"','"+datos.get(1).toString()+"','"+datos.get(2).toString()+"'"
                           + ",'"+datos.get(3).toString()+"','"+datos.get(4).toString()+"')");
           conexion.getConexion().close();
           return true;
       } catch (Exception e) {
           System.out.println("error insertal cliente"+e);
           return false;
       }
       
   }
   public ArrayList clientesList(){
   ArrayList datas= new ArrayList();
   Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            Statement sql = conexion.getConexion().createStatement();
            ResultSet result = sql.executeQuery("select nombre from clientesPedidos");
//select a.nombre,a.telefono,a.horario,IFNULL((SELECT bitacoraMKT.observacion FROM bitacoraMKT, clientesPedidos WHERE clientesPedidos.nombre=bitacoraMKT.cliente AND bitacoraMKT.fecha='2019-02-06' order by bitacoraMKT.id DESC LIMIT 1),'0') AS 'Observ' from clientesPedidos as a
            while (result.next()) {
               ArrayList data= new ArrayList();
               datas.add(result.getString("nombre"));
            }
            conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println("Error consult Repartidores List " + e);
        }
        return datas;
   }
   public ArrayList directory(String date){
   ArrayList data= new ArrayList();
   Conexion conexion = new Conexion();
        conexion.conectar();
        try {
            Statement sql = conexion.getConexion().createStatement();
            ResultSet result = sql.executeQuery("select a.nombre,a.telefono,a.horario,IFNULL((SELECT bitacoraMKT.observacion FROM bitacoraMKT, "
                    + "clientesPedidos WHERE a.nombre=bitacoraMKT.cliente AND bitacoraMKT.fecha='"+date+"' order by bitacoraMKT.id DESC LIMIT 1),'N/A') AS 'Observ' from clientesPedidos as a");
            while (result.next()) {
               ArrayList row= new ArrayList();
               row.add(result.getString("nombre"));
               row.add(result.getString("telefono"));
               row.add(result.getString("horario"));
               row.add(result.getString("Observ"));
               data.add(row);
            }
            conexion.getConexion().close();
        } catch (Exception e) {
            System.out.println("Error consult Repartidores List " + e);
        }
        return data;
   }
}
