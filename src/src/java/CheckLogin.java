import java.io.IOException; 
import java.io.PrintWriter; 
import static java.lang.System.out;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;



// Servlet Name 
@WebServlet("/CheckLogin") 
public class CheckLogin extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) 
		throws ServletException, IOException 
	{ 
		try {
                    String uname = request.getParameter("uname");
                    String pass = request.getParameter("pass");
                    
                    
                    //String  id = request.getParameter("id");
                    //String string1 = request.getParameter("string");
                    //int num = Integer.parseInt(id);
                    
                    Connection con = dataconn.initializeDatabase(); 
                    PreparedStatement st = con.prepareStatement("select uname,password from user where uname=? and password=?");
                    st.setString(1, uname);
                    st.setString(2, pass);
                   
                    ResultSet rs = st.executeQuery();    
                    
                    while (rs.next()) {
                        HttpSession session = request.getSession();
                        session.setAttribute("uname", uname);
                        session.setMaxInactiveInterval(5*60);
                        Cookie userName = new Cookie("uname",uname);
                        userName.setMaxAge(5*60);
                        response.addCookie(userName);
			response.sendRedirect("profile.jsp");
                        //out.print("Welcome, "+uname);  
                        //HttpSession session=request.getSession();  
                        //session.setAttribute("uname",uname);  
                        //PrintWriter out = response.getWriter(); 
                        //out.println("<html><body><b>Successfully Inserted"+ "</b></body></html>"); 
                        return;
                    }
                    //response.sendRedirect("error.html");
                    PrintWriter out = response.getWriter(); 
                    //out.println("<html><body><b>invalid username or password"+ "</b></body></html>");
                    return;

                    //st.executeUpdate(); 
                    //st.close(); 
                    //con.close();  
                    //PrintWriter out = response.getWriter(); 
                    //out.println("<html><body><b>Successfully Inserted"+ "</b></body></html>"); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
