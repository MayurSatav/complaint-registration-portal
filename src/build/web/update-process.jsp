<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/complaintportal";%>
<%!String user = "root";%>
<%!String psw = "root";%>
<%
String id = request.getParameter("id");
String title=request.getParameter("title");
String dept=request.getParameter("dept");
String person=request.getParameter("person");
String descr=request.getParameter("descr");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update post set uid=?,title=?,deptName=?,facultyName=?,description=? where uid="+id;
ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2, title);
ps.setString(3, dept);
ps.setString(4, person);
ps.setString(5, descr);
int i = ps.executeUpdate();
if(i > 0)
{
response.sendRedirect("mycomplaints.jsp");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>