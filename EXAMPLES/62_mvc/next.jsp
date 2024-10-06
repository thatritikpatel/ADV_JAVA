<%@ page import="java.util.ArrayList,models.Student"%>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>

  <% ArrayList<Student> students = (ArrayList)request.getAttribute("students"); %>

  <table border="1">
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>College</th>
		<th>Degree</th>
	</tr>

	<% for(Student student : students){ %>
		<tr>
			<td><%= student.getName() %></td>
			<td><%= student.getAge() %></td>
			<td><%= student.getCollege() %></td>
			<td><%= student.getDegree() %></td>
		</tr>
	<% } %>
  </table>	

 </body>
</html>
