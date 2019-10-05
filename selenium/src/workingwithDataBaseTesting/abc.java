package workingwithDataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class abc { 
	public static void main(String args[]) throws ClassNotFoundException, SQLException{  
//	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection conn=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/myproject?autoReconnect=true&useSSL=false","root","manoj");  
	PreparedStatement ps=conn.prepareStatement("select * from emp");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getString(2));
	}
	rs.close();
	//here sonoo is database name, root is username and password  
//	Statement stmt=(Statement) con.createStatement();  
//	ResultSet rs=stmt.executeQuery("select * from emp");  
//	while(rs.next())  
//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//	con.close();  
//	}catch(Exception e){ System.out.println(e);}  
	}  
	}  

