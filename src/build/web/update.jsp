<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
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
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from post where uid="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="css/index.css">
</head>
<style>


.navbar {
  width: 100%;
  background-color: #313348;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color:#FE9800;
}

.active {
  background-color: #FE9800;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body>
<div class="navbar">
  <a  href="index.html"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a> 
  <a class="active" href="home.html"><i class="fa fa-fw fa-user"></i>Profile</a>
  <a href="index.html" style="float: right;"><i class="fa fa-sign-out"></i>Logout</a>
</div>

<div class="card" >
		<center><h2><b>Update Complaint</b></h2></center>
		<form action="update-process.jsp" method="post" class="w3-container">
			<input type="hidden" name="id" value="<%=resultSet.getString("uid") %>">
                            
            Title<input class="w3-input" type="text" value="<%=resultSet.getString("title") %>"" name="title"/>
			<br/> 
            Department<input class="w3-input" type="text" value="<%=resultSet.getString("deptName") %>" name="dept"/><br>
			<br/>
			Person<input class="w3-input" type="text" value="<%=resultSet.getString("facultyName") %>" name="person"/><br>
			<br/> 			
            Description
			<textarea id="subject" name="descr" placeholder="<%=resultSet.getString("description") %>" style="height:200px; width:100%;resize: vertical;"></textarea>
			<input type="submit" class="button" value="Submit Complaint"/>  			
        </form>
		<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
 </div>
</body>
</html>
