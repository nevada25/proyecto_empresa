package logeo;


import java.sql.*;



public class DBConn {

  	Connection conn;
	String str_driver;	
	
	
	public DBConn() {
	//	this.str_driver=JNDINames.STRING_DRIVER;		
	}


	public DBConn(String str_driver) {
		this.str_driver	= str_driver;		
	}
	
  	public Connection getConnection() throws SQLException, Exception {
 Connection cn=null;
  	        try{
	             Class.forName("oracle.jdbc.driver.OracleDriver");
            cn=DriverManager.getConnection("jdbc:oracle:thin:@GOKU:1522:oracl","proyecto_f","proye");
	        
	        System.out.println("Coneccion Satisfactoria...!!!");
		
			return conn;
						
	    }catch(SQLException e){
    		throw new SQLException("Connect.getConnection "+e.getMessage()+" Intenta de nuevo");
	    }catch(Exception e){
    		throw new Exception("Connect.getConnection "+e.getMessage());
	    }
  	}

	public String close() throws SQLException {
    	try{
       		if(conn!=null) {
       			conn.close(); System.out.println("Cerrar Coneccion...");
       		}
       		return "Close Connection.";
       	}catch(SQLException e){
    		throw new SQLException("Connect.close "+e.getMessage());
    	}
  	}

	public static void main(String[] args) {
		
	  	DBConn sql=new DBConn( );
	  	try{
	  		sql.getConnection();
	  		sql.close();
	  	}catch(SQLException e){		System.out.println("e2:"+ e.getMessage() );
	  	}catch(Exception e){ 		System.out.println("e1:"+e.getMessage() );
	  	}
	  	
	}
}

