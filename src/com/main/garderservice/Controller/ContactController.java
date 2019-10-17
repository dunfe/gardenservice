package com.main.garderservice.Controller;

import com.main.garderservice.DAO.ContactDAO;
import com.main.garderservice.Model.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactController", urlPatterns = "/ContactController")
public class ContactController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message  = request.getParameter("message");
        boolean addSuccess = false;
        try {
            ContactDAO contactDAO = new ContactDAO();
            addSuccess = contactDAO.addMessage(name, email, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (addSuccess){
            System.out.println("ok");
        } else System.out.println("fail");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ContactDAO contactDAO = new ContactDAO();
            Contact contact = contactDAO.getContact();
            request.setAttribute("contact", contact);
            request.getRequestDispatcher("contact.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
