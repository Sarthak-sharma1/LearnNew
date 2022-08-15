
package com.servletspractice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;


public class First implements Servlet{
    ServletConfig conf;
    // life Cycles Methods
    @Override
    public void init(ServletConfig conf){
     this.conf = conf;
        System.out.println("creating object");
    }
    @Override
    public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException{
        System.out.println("servicing.");
        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();
        write.println("<h1>this is my out put </h1>");
        
    }
    @Override
    public void destroy(){
        System.out.println("going to destroy.");
    }
    // non life cycle methods
    @Override
    public ServletConfig getServletConfig(){
       return this.conf;
    }
    @Override
    public String getServletInfo(){
      return "Created by Sarthak";
    }
}
