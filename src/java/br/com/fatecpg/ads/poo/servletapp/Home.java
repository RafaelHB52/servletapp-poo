package br.com.fatecpg.ads.poo.servletapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Home", urlPatterns = {"/home.html"})
public class Home extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<title>Home</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">");
                out.println("<a class=\"navbar-brand\" href=\"#\">Navbar</a>");
                out.println("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
                out.println("<span class=\"navbar-toggler-icon\"></span>");
            out.println("</button>");
            out.println("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">");
                out.println("<ul class=\"navbar-nav mr-auto\">");
                    out.println("<li class=\"nav-item active\">");
                        out.println("<a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>");
                    out.println("</li>");
                    out.println("<li class=\"nav-item\">");
                        out.println("<a class=\"nav-link\" href=\"#\">Juros Simples</a>");
                    out.println("</li>");
                    out.println("<li class=\"nav-item\">");
                        out.println("<a class=\"nav-link\" href=\"#\">Juros Compostos</a>");
                    out.println("</li>");
                out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            
            out.println("<div class=\"card\" style=\"width: 18rem;\">");
                out.println("<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">");
                out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\">Card title</h5>");
                    out.println("<p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"card\" style=\"width: 18rem;\">");
                out.println("<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">");
                out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\">Card title</h5>");
                    out.println("<p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
