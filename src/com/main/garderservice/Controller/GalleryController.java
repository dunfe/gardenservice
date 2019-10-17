package com.main.garderservice.Controller;

import com.main.garderservice.DAO.GalleryDAO;
import com.main.garderservice.Model.Gallery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GalleryController", urlPatterns = "/GalleryController")
public class GalleryController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            GalleryDAO galleryDAO = new GalleryDAO();
            ArrayList<Gallery> galleries = galleryDAO.getAll();

            request.setAttribute("gallery", galleries);
            request.getRequestDispatcher("gallery.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
