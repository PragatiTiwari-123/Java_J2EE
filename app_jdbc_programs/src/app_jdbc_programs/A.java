package app_jdbc_programs;

import java.sql.*;
import java.util.Scanner;

//import java.sql.*;
//import java.util.Scanner;
//
//public class A {
//	
//   	//I am using JDBC technique to connect MYSQL which is running in local host port no.3306 and the database name now URL Consists all these things.
//	//jdbc:mysql://localhost:3306/db_name
//	
//	public static void main(String[] args) {
//		try{
//		  Scanner scan = new Scanner(System.in);
//		  System.out.println("Enter Your Name"); // input dynamically
//		  String name = scan.next();
//		  
//		  System.out.println("Enter Your City");
//		  String city = scan.next();
//		  
//		  System.out.println("Enter Your Email");
//		  String email = scan.next();
//		  
//		  System.out.println("Enter Your Mobile");
//		  String mobile = scan.next();
//
//
//
//          // step1: DB Connection
//	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root" , "test"); // to connect with data base we will write here
//			System.out.println(con);
//			
//		 // step2:  Execute SQl Queries
//		  Statement stmnt = con.createStatement();
//		  stmnt.executeUpdate("insert into registration values('"+name+"', '"+city+"', '"+email+"', '"+mobile+"') ");
//			
//		//step 3:   Close connection
//		  con.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//}
//Practice 3 August
//insert Record
//public class A{
//	public static void main(String[] args) {
//		try {
//			//step 1 : db connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db", "root", "test");
//			   System.out.println(con);
//			//step 2 : execute sql querries
//			Statement stmnt = con.createStatement();
//			stmnt.executeUpdate("insert into student value('4','macky','mcom','70000')");
//			//step3 : close connector
//			con.close();
//		}catch (Exception e){
//			   e.printStackTrace();
//			
//		}
//	}
//}
//Delete Record
//public class A{
//	public static void main(String[] args) {
//		try {
//			//step 1 : db connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db", "root", "test");
//			   System.out.println(con);
//			//step 2 : execute sql querries
//			Statement stmnt = con.createStatement();
//			stmnt.executeUpdate("delete from student where id = '"+2+"'");
//			//step3 : close connector
//			con.close();
//		}catch (Exception e){
//			   e.printStackTrace();
//			
//		}
//	}
//}
//Update record
//public class A{
//public static void main(String[] args) {
//	try {
//		//step 1 : db connection
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db", "root", "test");
//		   System.out.println(con);
//		//step 2 : execute sql querries
//		Statement stmnt = con.createStatement();
//		stmnt.executeUpdate("UPDATE student SET fee = '"+90000+"' Where id ='"+1+"'");
//		//step3 : close connector
//		con.close();
//	}catch (Exception e){
//		   e.printStackTrace();
//		
//	}
//}
//}

//read the data from database

//public class A{
//	public static void main(String[] args) {
//		try {
//			//step 1 : db connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db", "root", "test");
//			   System.out.println(con);
//			//step 2 : execute sql querries
//			Statement stmnt = con.createStatement();
//			ResultSet result = stmnt.executeQuery("Select * from student");
//
//			while(result.next()) {
//				  System.out.println(result.getString(1));
//				  System.out.println(result.getString(2));
//				  System.out.println(result.getString(3));
//				  System.out.println(result.getString(4));
//
//			  }
//
//			//step3 : close connector
//			con.close();
//		}catch (Exception e){
//			   e.printStackTrace();
//			
//		}
//	}
//}

// Combine all query it should be print the msg 'welcome to registration app'

//public class RegistrationApp {
//    public static void main(String[] args) {
//        System.out.println("welcome to registration app!!");
//        System.out.println("options");
//        System.out.println("Add registration");
//        System.out.println("Delete registration");
//        System.out.println("Update registration");
//        System.out.println("Read registration");
//        System.out.println("Enter the option:");
//
//        Scanner scan = new Scanner(System.in);
//        int option = scan.nextInt();
//
//        try {
//            // Step 1: connect to the db
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db_2", "root", "test");
//            System.out.println(con);
//            Statement stmnt = con.createStatement();
//
//            if (option == 1) {
//                System.out.println("Enter the details");
//                System.out.println("Enter your name"); // input dynamically
//                String name = scan.next();
//
//                System.out.println("Enter Your City");
//                String city = scan.next();
//
//                System.out.println("Enter Your Email");
//                String email = scan.next();
//
//                System.out.println("Enter Your Mobile");
//                String mobile = scan.next();
//
//                stmnt.executeUpdate("insert into registration values('" + name + "', '" + city + "','" + email + "','" + mobile + "')");
//            }
//
//            else if (option == 2) {
//            	System.out.println("Delete");
//  			  System.out.println("Enter Your Email");
//  			  String email = scan.next();
//  			  
//  			  stmnt.executeUpdate("Delete from registration Where email ='"+email+"'");
//
//
//            }
//
//            else if (option == 3) {
//                System.out.println("Update");
//              System.out.println("Enter Your Email");
//  			  String email = scan.next();
//
//  			  System.out.println("Enter Your Mobile");
//  			  String mobile = scan.next();
//              
//  			  stmnt.executeUpdate("UPDATE registration SET mobile = '"+mobile+"' Where email ='"+email+"'");
//
//            }
//
//            else if (option == 4) {
//                System.out.println("Read");
//      		  ResultSet result = stmnt.executeQuery("Select * from registration");
//      		  
//      		while(result.next()) {
//  			  System.out.println(result.getString(1));
//  			  System.out.println(result.getString(2));
//  			  System.out.println(result.getString(3));
//  			  System.out.println(result.getString(4));
//            }
//            }
//            
//            else {
//            	System.out.println("invalid input");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}





















































































































