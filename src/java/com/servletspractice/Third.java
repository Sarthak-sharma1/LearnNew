package com.servletspractice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class Third extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
              System.out.println("HttpServlet.");
              response.setContentType("text/html");
              PrintWriter write = response.getWriter();
              write.println("This Servlet is Using httpServlet.");
              write.println("<h2>Hii Users.</h2>" + new Date().toString());
    }
    
}
