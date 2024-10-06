<%@ page import="abc.Student" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>ABC Page ------</h1>

  <% Student std = (Student)request.getAttribute("student"); %>

  Name: <%= std.name %><br /><br />
  Age: <%= std.age %><br /><br />
  College: <%= std.college %>
 </body>
</html>
