<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  
  <% String errMsg = (String)request.getAttribute("err_msg"); %>

  <% if(errMsg!=null){ %>
  <div style="color:red">
	<%= errMsg %>
  </div>
  <% } %>
  
  <form action="register.do">
	User Name: <input type="text" name="uname" /><br />
	Email: <input type="email" name="email" /><br />
	Password: <input type="password" name="passw" /><br />
	Retype Password: <input type="password" name="repass" /><br />
	<input type="submit" value="Register" />
  </form>
 
 </body>
</html>
