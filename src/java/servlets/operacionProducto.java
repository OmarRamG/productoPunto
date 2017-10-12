/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class operacionProducto extends HttpServlet {
    int num1,num2,num3,num4,res1,res2;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        num1 = Integer.parseInt(request.getParameter("num1"));
        num2 = Integer.parseInt(request.getParameter("num2"));
        num3 = Integer.parseInt(request.getParameter("num3"));
        num4 = Integer.parseInt(request.getParameter("num4"));
        int[][] vectores = {
                            {num1,num2},
                            {num3,num4},
                        };
        res1 = vectores[0][0] * vectores[1][0]; 
        res2 = vectores[0][1] * vectores[1][1];
        PrintWriter out = new PrintWriter(response.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Resultado</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>El resultado es:"+res1+" +"+res2+"="+(res1 + res2)+"</center></h1></p>");
        out.println("</body></html>");
        out.close();
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
