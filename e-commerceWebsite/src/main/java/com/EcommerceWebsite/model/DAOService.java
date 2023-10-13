package com.EcommerceWebsite.model;
import java.sql.ResultSet;
public interface DAOService {
		public void connectDB(); 
		public boolean login(String username, String password);
		public boolean existByEmail(String email);
		public boolean existByMobile(String mobile);
		ResultSet getAllRegistrations();
		public void savesignup(String name, String mobile, String email, String password);		

	}
