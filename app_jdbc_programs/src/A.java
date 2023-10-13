

import java.sql.*;

public class A {
	
   	//I am using JDBC technique to connect MYSQL which is running in local host port no.3306 and the database name now URL Consists all these things.
	//jdbc:mysql://localhost:3306/db_name
	
	public static void main(String[] args) {
		try{
          // step1: DB Connection
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root" , "test"); // to connect with data base we will write here
			System.out.println(con);
			
		 // step2:  Execute SQl Queries
		  Statement stmnt = con.createStatement();
		  stmnt.executeUpdate("insert into registration values('stallin', 'lko', 'stallin@12gmail.com', '9743224500') ");
			
		//step 3:   Close connection
		  con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
