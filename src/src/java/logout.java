//package net.codejava;
 
import java.io.IOException;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
@WebServlet("/logout")
public class logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies){
                
                if(cookie.getName().equals("JSESSIONID")){
                    System.out.println("JSESSIONID=+cookie.getValue()");
                    break;
                }
            }
        }
        //invalidate the session if exists
    	HttpSession session = request.getSession(false);
    	//System.out.println("User="+session.getAttribute("uname"));
    	if(session != null){
    		session.invalidate();
    	}
    	response.sendRedirect("login.html");
    }
}