package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Session3 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        String item1=request.getParameter("item1");
        String item2=request.getParameter("item2");
        String item3=request.getParameter("item3");
        out.println("<html>");
        out.println("<head><title>Session1</title></head>");
        out.println("<body>");
        out.println(item1+"<br>");
        out.println(item2+"<br>");
        out.println(item3+"<br>");
        
        out.println("</body></html>");
        out.close();
    }

    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, IOException {
                       
                       doGet(request,response);
    
    }
}
