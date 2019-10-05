package workingwithDataBaseTesting;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class jag {

		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
			
			
			String url="jdbc:mysql://localhost:3306/"; 
			String dbname="myproject?autoReconnect=true&useSSL=false";
			String DBdriver="com.mysql.cj.jdbc.Driver";
			String username="root";
			String password="manoj";

			Connection conn;
			Class.forName(DBdriver).newInstance();
			conn=DriverManager.getConnection(url+dbname,username,password);
			PreparedStatement ps=conn.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
					System.out.println(rs.getString(1));
				
					
				}	
			
		}
		
		}
	
	
	
