package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Session1 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        String item1=request.getParameter("item1");
        out.println("<html>");
        out.println("<head><title>Session1</title></head>");
        out.println("<body>");
        out.println("<form METHOD=POST action=http://localhost/rewrite/servlet/session2?item1="+item1+">");
        out.println("Enter the Item Name:");
        out.println("<input type=text name =item2>");
        out.println("<br>"+"<input type=submit value=Next Page>");
        out.println("</form>");
		out.println("Item Selected :"+item1);
        out.println("</body></html>");
        out.close();
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, IOException {
                       
                       doGet(request,response);
    
    }
}
