package com.EcommerceWebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reset_password")
public class ForgotPasswordController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ForgotPasswordController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Display the "Forgot Password" form (forgot.jsp)
        RequestDispatcher rd = request.getRequestDispatcher("forgot.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the email entered in the "Forgot Password" form
        String email = request.getParameter("email");

        // TODO: Add your logic here to handle the "Forgot Password" functionality
        // - Generate a unique reset token
        // - Send an email to the user with a link to reset their password
        // - Store the reset token and its expiration date in the database

        // For simplicity, we'll just display a message indicating that a reset email would be sent
        String message = "A password reset email will be sent to your email address if it exists in our system.";
        request.setAttribute("message", message);

        // Forward to a confirmation page (forgot-confirmation.jsp)
        RequestDispatcher rd = request.getRequestDispatcher("forgot-confirmation.jsp");
        rd.forward(request, response);
    }
}
