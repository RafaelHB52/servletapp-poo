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
            
            out.println("<meta charset=\"utf-8\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Quicksand|Varela+Round\" rel=\"stylesheet\">");
            out.println("<link rel=\"stylesheet\" href=\"css/css.css\">");
            
            out.println("<title>Juros Easy</title>");                
            out.println("</head>");
            out.println("<body>");
            
            out.println("<nav class=\"navbar navbar-dark bg-dark\">");
                out.println("<a class=\"navbar-brand\" href='home.html'>");
                out.println("Juros Easy");
                out.println("</a>");
            out.println("</nav>");
            
            out.println("<br>");     
            out.println("<h4 class='h4fonte'>A <b>Juros Easy</b> é uma aplicação que possui a finalidade de ajudar você no cálculo do juros de forma rápida e eficiente, basta escolher o tipo de juros abaixo e em seguida inserir os valores necessários para que o cálculo seja realizado. :)</h4>");
            out.println("<hr/><br><br><br><br>");
            
            out.println("<div class='container' align='center'>");
                out.println("<div class='row'>");
                    out.println("<div class='col-sm-6'>");
                        out.println("<div class='card' style='width: 100%'>");
                            out.println("<div class=\"card-body\">");
                                out.println("<h5 class=\"card-title h5fonte\">Juros Simples</h5>");
                                out.println("<h4 class=\"card-text h4fonte\">Quer realizar o cálculo do seu juros simples?<br>Clique no botão abaixo:</h4>");
                                out.println("<a class=\"h4fonte btn btn-primary\" href=\"juros-simples.php\" role=\"button\">Clique aqui!</a>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");

                    out.println("<div class='col-sm-6'>");
                        out.println("<div class='card' style='width: 100%'>");
                            out.println("<div class=\"card-body\">");
                                out.println("<h5 class=\"card-title h5fonte\">Juros Compostos</h5>");
                                out.println("<h4 class=\"card-text h4fonte\">Quer realizar o cálculo do seu juros compostos?<br>Clique no botão abaixo:</h4>");
                                out.println("<a class=\"h4fonte btn btn-primary\" href=\"compostos.html\" role=\"button\">Clique aqui!</a>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            out.println("<br><br><br><br><hr>");

            out.println("<div class=\"container\">");
                out.println("<h5 class=\"h5fonte\">Desenvolvido por:</h5>");
            out.println("</div><hr>");
            out.println("<div class=\"card-group\">");
                out.println("<div class=\"card\">");
                    out.println("<br><center><img class=\"rounded-circle img\" src=\"imagens/noimage.png\" alt=\"Alexandre\"></center>");
                    out.println("<div class=\"card-body\">");
                        out.println("<h5 class=\"h5fonte\">Alexandre</h5>");
                        out.println("<h4 class=\"h4fonte\">Estudante de Análise e Desenvolvimento de Sistemas</h4><br>");
                        out.println("<center><a class=\"h4fonte btn btn-outline-dark\" href=\"https://github.com/AlexRFX\" role=\"button\">GitHub</a></center>");
                    out.println("</div>");
                out.println("</div>");
                
                out.println("<div class=\"card\">");
                    out.println("<br><center><img class=\"rounded-circle img\" src=\"imagens/noimage.png\" alt=\"Fernando\"></center>");
                    out.println("<div class=\"card-body\">");
                        out.println("<h5 class=\"h5fonte\">Fernando</h5>");
                        out.println("<h4 class=\"h4fonte\">Estudante de Análise e Desenvolvimento de Sistemas</h4><br>");
                        out.println("<center><a class=\"h4fonte btn btn-outline-dark\" href=\"https://github.com/Fernando0123\" role=\"button\">GitHub</a></center>");
                    out.println("</div>");
                out.println("</div>");
                
                out.println("<div class=\"card\">");
                    out.println("<br><center><img class=\"rounded-circle img\" src=\"imagens/rafael.png\" alt=\"Rafael\"></center>");
                    out.println("<div class=\"card-body\">");
                        out.println("<h5 class=\"h5fonte\">Rafael</h5>");
                        out.println("<h4 class=\"h4fonte\">Estudante de Análise e Desenvolvimento de Sistemas</h4><br>");
                        out.println("<center><a class=\"h4fonte btn btn-outline-dark\" href=\"https://github.com/RafaelHB52\" role=\"button\">GitHub</a></center>");
                    out.println("</div>");
                out.println("</div>");
            out.println("</div><hr>");
            
            out.println("<footer class='foot'>");
                out.println("<h4 class='h4fonte'>Gostou do aplicativo? Nos mande a sua opinião: <a href=\"mailto:example@example.com\">juroseasy@outlook.com</a></h4>");
                out.println("<h4 class='h4fonte'>Desenvolvido em: Março/2018</h4>");
            out.println("</footer>");
                        
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            out.println("<src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
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
