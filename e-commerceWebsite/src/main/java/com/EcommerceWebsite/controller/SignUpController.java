package com.EcommerceWebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EcommerceWebsite.model.DAOService;
import com.EcommerceWebsite.model.DAOServiceImpl;


@WebServlet("/SignUp")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SignUpController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
		rd.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		boolean statusOfEmail = service.existByEmail(email);
		boolean statusOfMobile = service.existByMobile(mobile);
		
		if(statusOfEmail) {
			request.setAttribute("msg", "Email Id Exists!!");
		}
		else if(statusOfMobile) {
			request.setAttribute("msg", "Mobile No Exists!!");
		}
		else {
	    service.savesignup(name, mobile, email, password); 
		request.setAttribute("msg", "Record is saved");
        }
		
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		rd.forward(request, response);

	}

}
