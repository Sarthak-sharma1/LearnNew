package com.servletspractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Forms extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h2>Welcome Sir/Mam</h2>"+ new Date().toString());
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String gender = request.getParameter("user_gender");
        String company = request.getParameter("user_company");
        
        String condition = request.getParameter("condition");
        if(condition!=null){
          if(condition.equals("checked")){
         writer.println("<h2> Name :" + name +"</h2>" );
         writer.println("<h2> Password :" + password +"</h2>" );
         writer.println("<h2> Geder  :" + gender +"</h2>" );
            writer.println("<h2> Company :" + company +"</h2>" );
            
            RequestDispatcher rd = request.getRequestDispatcher("success");
            rd.forward(request, response);
            
           
          }
          else{
              writer.println("<h2>you haven't checked terms and condition</h2>");
          }
          } 
        else{
              writer.println("<h2>you haven't checked terms and condition</h2>");
              
              RequestDispatcher rd = request.getRequestDispatcher("Home.html");
              rd.include(request, response);
          }
    
    }
    
}
