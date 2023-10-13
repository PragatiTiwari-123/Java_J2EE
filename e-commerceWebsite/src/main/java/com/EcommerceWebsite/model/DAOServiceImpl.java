package com.EcommerceWebsite.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_module", "root", "test");
			stmnt = con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public boolean login(String username, String password) {
		try {
			ResultSet result = stmnt.executeQuery("Select * from login where email = '"+username+"'and password = '"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

		@Override
	public boolean existByEmail(String email) {
		try {
			ResultSet result = stmnt.executeQuery("Select * from signup_module where email = '"+email+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}		
			return false;
		
	}

	@Override
	public boolean existByMobile(String mobile) {
		try {
			ResultSet result = stmnt.executeQuery("Select * from registration where mobile = '"+mobile+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}		
			return false;			
	}	
		
    @Override
   public ResultSet getAllRegistrations() {
	   try {
		  ResultSet result = stmnt.executeQuery("Select * from registration");
		  return result;
	   }catch(Exception e) {
		  e.printStackTrace();		
	   }
	       return null;
    }

	
	@Override
	public void savesignup(String name, String mobile,String email, String password) {
		try {
			 stmnt.executeUpdate("insert into registration values('"+name+"', '"+mobile+"', '"+email+"', '"+password+"')");
	     } catch (SQLException e) {
	        e.printStackTrace();			
	}
}	
}