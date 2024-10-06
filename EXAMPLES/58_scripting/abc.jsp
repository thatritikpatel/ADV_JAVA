<%@ page import="abc.Student" %>
<%@ page import="java.util.ArrayList" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>ABC Page ------</h1>

  <% ArrayList<Student> students = (ArrayList)request.getAttribute("students"); %>

  <table border="1" width="50%" align="center">
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>College</th>
	</tr>
	
	<% for(Student student : students){ %>
		<tr>
			<td><%= student.name %></td>
			<td><%= student.age %></td>
			<td><%= student.college %></td>
		</tr>
	<% } %>


  </table>

 </body>
</html>
