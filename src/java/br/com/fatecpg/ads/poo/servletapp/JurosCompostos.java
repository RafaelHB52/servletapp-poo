package br.com.fatecpg.ads.poo.servletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "JurosCompostos", urlPatterns = {"/compostos.php"})
public class JurosCompostos extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            /* CSS */
            out.println("<meta charset=\"utf-8\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Quicksand|Varela+Round\" rel=\"stylesheet\">");
            out.println("<link rel=\"stylesheet\" href=\"css/css.css\">");
            
            out.println("<title>Juros Easy</title>");            
            out.println("</head>");
            out.println("<body>");
            
            /* INICIO NAVBAR */
            out.println("<nav class=\"navbar navbar-dark bg-dark\">");
                out.println("<a class=\"navbar-brand\" href='home.html'>");
                out.println("Juros Easy");
                out.println("</a>");
            out.println("</nav>");
            /* FIM NAVBAR */
            
                out.println("<a href=\"home.html\"><img border=\"0\" alt=\"voltar\" src=\"imagens/voltar.jpg\" width=\"168\" height=\"86\"></a><hr>");
            
            /* INICIO CARD */
            out.println("<center><div class='col-sm-6'>");
                out.println("<div class='card' style='width: 100%'>");
                    out.println("<div class=\"card-body\">");
                        out.println("<h5 class=\"card-title h5fonte\">Juros Composto</h5>");
                        out.println("<h4 class=\"card-text h4fonte\">Insira os dados pedidos abaixo para que o cálculo do juros seja realizado.</h4>");
                        out.println("<form>");
                        out.println("<table>");
                            out.println("<tr><td><input type='text' name='capital' placeholder='Insira o capital'/></tr></td>");
                            out.println("<tr><td><input type='text' name='taxa' placeholder='Insira a taxa de juros'/></tr></td>");
                            out.println("<tr><td><input type='text' name='tempo' placeholder='Insira o período (meses)'/></tr></td>");
                        out.println("</table>");
                        out.println("<br><input class=\"h4fonte btn btn-primary\" type='submit' value='Calcular' />");
                    out.println("</form>");
                    out.println("</div>");
                out.println("</div>");
            out.println("</div></center><hr>"); 
            /* FIM CARD */
            
            /* CÁLCULO DO JUROS SIMPLES */
            try{
             double c = Double.parseDouble(request.getParameter("capital"));
             double tx = Double.parseDouble(request.getParameter("taxa"));
             double p = Double.parseDouble(request.getParameter("tempo"));
                
            tx = tx / 100;
            double juros = c * ((Math.pow((1 + tx),p)) - 1);
            double total = c + juros; 
                    
            DecimalFormat x = new DecimalFormat("#.00");
            String jurosTotal = x.format(juros);
            String valorTotal = x.format(total);
                
            out.println("<h4 class='h4fonte'>Valor do Juros: R$" + jurosTotal);
            out.println("<h4 class='h4fonte'>Valor total a ser pago: R$" + valorTotal);
                
            }catch(Exception ex){
                out.println("<h4 class='h4fonte'>Entrar com um valor válido acima.</h4>");
            }
            /* FIM DO CÁLCULO */
            
            /* INICIO RODAPÉ */
            out.println("<hr>");
            out.println("<footer class='foot2'>");
                out.println("<h4 class='h4fonte'>Gostou do aplicativo? Nos mande a sua opinião: <a href=\"mailto:example@example.com\">juroseasy@outlook.com</a></h4>");
                out.println("<h4 class='h4fonte'>Desenvolvido em: Março/2018</h4>");
            out.println("</footer>");
            
            /* FIM RODAPÉ */
            
            /* SCRIPTS */
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
