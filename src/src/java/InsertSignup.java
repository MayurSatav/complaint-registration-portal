import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 



// Servlet Name 
@WebServlet("/InsertSignup") 
public class InsertSignup extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) 
		throws ServletException, IOException 
	{ 
		try {
                    String name = request.getParameter("name");
                    String email = request.getParameter("email");
                    String uname = request.getParameter("uname");
                    String pass = request.getParameter("pass");
                    
                    //String  id = request.getParameter("id");
                    //String string1 = request.getParameter("string");
                    //int num = Integer.parseInt(id);
                    
                    Connection con = dataconn.initializeDatabase(); 
                    PreparedStatement st = con.prepareStatement("insert into user(name, email, uname, password) values('"+name+"','"+email+"','"+uname+"','"+pass+"')");  
                   // String updateSQL = "update employee set Empname='" + Empname + "',Emp_desig='" + Emp_desig + "',Emp_J_Date='" + Emp_J_Date + "',Emp_Salary=" + Emp_Salary + " where EmpId=" + EmpId;
                    
                   // PreparedStatement stx = con.prepareStatement("update student set string1="+string1+"where num="+id);  

                    st.executeUpdate(); 
                    st.close(); 
                    con.close();  
                    PrintWriter out = response.getWriter(); 
                    response.sendRedirect("login.html");  
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
