package com.main.garderservice.Controller;

import com.main.garderservice.DAO.HomeDAO;
import com.main.garderservice.DAO.ServiceDAO;
import com.main.garderservice.Model.Home;
import com.main.garderservice.Model.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HomeController", urlPatterns = "/HomeController")
public class HomeController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HomeDAO homeDAO = new HomeDAO();
            Home home = homeDAO.getData();
            ServiceDAO serviceDAO = new ServiceDAO();
            ArrayList<Service> serviceArrayList = serviceDAO.getAll();
            request.setAttribute("service", serviceArrayList);
            request.setAttribute("home", home);
            request.getRequestDispatcher("service.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            HomeDAO homeDAO = new HomeDAO();
//            Home home = homeDAO.getData();
//            ServiceDAO serviceDAO = new ServiceDAO();
//            ArrayList<Service> serviceArrayList = serviceDAO.getAll();
//            request.setAttribute("service", serviceArrayList);
//            request.setAttribute("home", home);
//            request.getRequestDispatcher("home.jsp").forward(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {

            int currentPage = 0;
            if (request.getParameter("currentPage") == null){
                currentPage = 1;
            } else{
                currentPage = Integer.parseInt(request.getParameter("currentPage"));
            }
            int recordsPerPage = 3;

            ServiceDAO serviceDAO = new ServiceDAO();
            HomeDAO homeDAO = new HomeDAO();
            Home home = homeDAO.getData();

            List<Service> services = serviceDAO.findService(currentPage, 3);

            request.setAttribute("service", services);

            int rows = serviceDAO.getNumberOfRows();
            int noOfPages = rows / recordsPerPage;

            if (noOfPages % recordsPerPage > 0) {
                noOfPages++;
            }

            request.setAttribute("home", home);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", currentPage);
            request.setAttribute("recordsPerPage", recordsPerPage);

            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
