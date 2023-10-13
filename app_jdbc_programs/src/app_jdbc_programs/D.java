package app_jdbc_programs;

import java.sql.*;
import java.util.Scanner;

public class D{
	
   	//I am using JDBC technique to connect MYSQL which is running in local host port no.3306 and the database name now URL Consists all these things.
	//jdbc:mysql://localhost:3306/db_name
	
	public static void main(String[] args) {
		try{
			
			Scanner scan = new Scanner(System.in);
			  System.out.println("Enter Your Email");
			  String email = scan.next();

          // step1: DB Connection
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root" , "test"); // to connect with data base we will write here
			System.out.println(con);
			
		 // step2:  Execute SQl Queries
		  Statement stmnt = con.createStatement();
		  stmnt.executeUpdate("Delete from registration Where email ='"+email+"'");
		
		//step 3:   Close connection
		  con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
