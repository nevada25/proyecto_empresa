/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logeo;
import pro.modelo.entidad.Usuario;

import java.sql.*;
import java.util.*;

public class n_logeo {
    
       //conección a la base de datos
    
    DBConn tran=null;
    Connection conn=null;
    String qry;//almacena la transacción
    public static int val;//definir si la transacción tuvo éxito
    
     Usuario usu= new Usuario();
    
    public n_logeo()
            
            {
                tran=new DBConn();
            }
    private String MError=new String();
           public void setMError(String mensaje)
            {MError=mensaje;}
          public String getMError()
           {return MError;}
          
  public void setUsuario(Usuario usu)
  {usu=usu;}
  public Usuario  geUsuario()
  {return usu;}        
            
  public void mexiste()
  {
      val=0;
      try{
      int i=0;
      conn=tran.getConnection();
      conn.setAutoCommit(false);
      
      qry="select usuario from usuario where login=?";
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(++i,usu.getLogin());
      ResultSet rs=ps.executeQuery();
      
      if(rs.next()){
       i=0;   
         qry="select * from usuario where login=? and password=? and estado='1'";
      PreparedStatement ps2=conn.prepareStatement(qry);
      ps2.setString(++i,usu.getLogin());
      ps2.setString(++i,usu.getPassword());
      ResultSet rs2=ps2.executeQuery();  
            if(rs2.next()){
                val=1;//ingresó correctamente          
            }
            else
            {
                val=2;//contraseña mala
            }
            ps2.close();
            rs2.close();
      }
      else
      {
          val=3;//usuario incorrecto
      }
      ps.close();
      rs.close();      
      }
      catch(SQLException e){
                     try{
                    conn.rollback();
                    setMError(e.getMessage()+"<br>Transaction is being rolled back");
                    }
                    catch(SQLException e2)
                    {
                        setMError(e.getMessage());
                    }
              }
             catch(Exception e){
                    System.out.println(e.getMessage());
                    setMError(e.getMessage());
             }
             finally{
                    try{if(conn!=null) conn.close();}
                    catch(SQLException e){setMError(e.getMessage());}
             } 
  }
    
}