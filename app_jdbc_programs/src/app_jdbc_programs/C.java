package app_jdbc_programs;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class C {
	
   	//I am using JDBC technique to connect MYSQL which is running in local host port no.3306 and the database name now URL Consists all these things.
	//jdbc:mysql://localhost:3306/db_name
	//JDBC has a collection called as result set
	
	public static void main(String[] args) {
		try{
          // step1: DB Connection
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root" , "test"); // to connect with data base we will write here
			System.out.println(con);
			
		 // step2:  Execute SQl Queries
		  Statement stmnt = con.createStatement();
		  ResultSet result = stmnt.executeQuery("Select * from registration");
		  
		  while(result.next()) {
			  System.out.println(result.getString(1));
			  System.out.println(result.getString(2));
			  System.out.println(result.getString(3));
			  System.out.println(result.getString(4));

		  }
			
		//step 3:   Close connection
		  con.close();
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
