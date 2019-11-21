package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.servlet.http.HttpSession;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String un = (String) session.getAttribute("uname");
String id = request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "complaintportal";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
ResultSet resultSet1 = null;
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>CSS Template</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/navi.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/scrollstyle.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/btnbadge.css\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  background-color: #252636;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two columns/boxes that floats next to each other */\n");
      out.write("nav {\n");
      out.write("  float: left;\n");
      out.write("  width: 20%;\n");
      out.write("  \n");
      out.write("  background: #313348;\n");
      out.write("  padding: 20px;\n");
      out.write("  margin-left: 25px;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the list inside the menu */\n");
      out.write("nav ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article {\n");
      out.write("  float: left;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 75%;\n");
      out.write("  margin-left: 25px;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  background-color: #313348;\n");
      out.write("  height: 600px; /* only for demonstration, should be removed */\n");
      out.write("  color: white;\n");
      out.write("  overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write("section:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("  nav, article {\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  width:40px;\n");
      out.write("  height:40px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write(".button2 {background-color: #f44336;} /* Red */ \n");
      out.write("\n");
      out.write("#sidbutton {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  width: 100%;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"index.html\"><i class=\"fa fa-fw fa-home\"></i> Home</a> \n");
      out.write("  <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Contact</a>\n");
      out.write("  <a class=\"active\" href=\"profile.jsp\"><i class=\"fa fa-fw fa-user\"></i>Profile</a>\n");
      out.write("  <a  href=\"index.html\" style=\"float: right;\"><i class=\"fa fa-sign-out\"></i>Logout</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("  <nav>\n");
      out.write("      <center><i class=\"fa fa-user-circle-o\" style=\"font-size:100px;color:#FE9800\"></i></center>\n");
      out.write("      <center><p>@");
      out.print(un);
      out.write("</p>\n");
      out.write("      \n");
      out.write("      ");
resultSet1 = statement.executeQuery("select count(*),user.name,user.email from user,post where user.uname='"+un+"' and post.uname='"+un+"'");
      while(resultSet1.next()){
      out.write("\n");
      out.write("      <p><i class=\"fa fa-address-card\"style=\"font-size: 20px;margin-right: 10px;\" ></i> ");
      out.print(resultSet1.getString("name"));
      out.write("</p>\n");
      out.write("      <p><i class=\"fa fa-envelope\" style=\"font-size: 20px;margin-right: 10px;\"></i> ");
      out.print(resultSet1.getString("email"));
      out.write("</p>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </center>\n");
      out.write("      <a href=\"addpost.html\" id=\"sidbutton\"><i class=\"fa fa fa-pencil\" style=\"font-size: 20px;margin-right: 10px;\"></i>Register Complaint</a><br><br>\n");
      out.write("      \n");
      out.write("      <a href=\"mycomplaints.jsp\"  id =\"sidbutton\" class=\"badge1\" data-badge=");
      out.print(resultSet1.getString("count(*)"));
      out.write("><i class=\"fa fa fa-clipboard\" style=\"font-size: 20px;margin-right: 10px;\"></i>My Complaints</a>\n");
      out.write("      \n");
      out.write("      ");
}
      out.write("\n");
      out.write("  </nav>\n");
      out.write("  \n");
      out.write("  <article>\n");
      out.write("\n");
      out.write("    <h2>All Complaints</h2>\n");
      out.write("    <br>\n");
      out.write("      <div class=\"w3-container\">\n");
      out.write("          <table class=\"w3-table w3-bordered\">\n");
      out.write("            <tr style=\"color:#FE9800;\">\n");
      out.write("              <th>id</th>\n");
      out.write("              <th>Title</th>\n");
      out.write("              <th>Department</th>\n");
      out.write("              <th>Faculty</th>\n");
      out.write("              <th>Description</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                try{
                
                String sql ="select * from post";
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(resultSet.getString("uid") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("title") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("deptName") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("facultyName") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("description") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("  </article>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
