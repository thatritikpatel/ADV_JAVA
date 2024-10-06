<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>ABC Page ------</h1>

  <%= request.getAttribute("name") %>

  <br /> <br />

  <% int age = (int)request.getAttribute("age"); %>

  <%= age %>
 </body>
</html>
