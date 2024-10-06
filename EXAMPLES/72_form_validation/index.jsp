<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/index.css" />
  <script src="js/index.js"></script>
  <title>Document</title>
 </head>
 <body>
  
  <% String errMsg = (String)request.getAttribute("err_msg"); %>

  <% if(errMsg!=null){ %>
  <div style="color:red">
	<%= errMsg %>
  </div>
  <% } %>
  
  <form action="register.do" id="regform">
	User Name: 
		<input type="text" name="uname" id="uname" />
		<span id="unmerr" class="errmsg">Invalid User Name must be at least 3 characters</span><br />
	
	Email: 
		<input type="email" name="email" id="email" />
		<span id="emerr" class="errmsg">Invalid Email!!</span>	
		<br />
	
	
	Password: 
		<input type="password" name="passw" id="passw" />
		<span class="errmsg" id="perr">Password must be at least 6 character and at max 12 characters length</span>
		<br />
		
	
	Retype Password: 
		<input type="password" name="repass" id="repass" />
		<span id="rperr" class="errmsg">Password and RePassword Must Match</span>
		<br />
	<input type="submit" value="Register" />
  </form>
 
 </body>
</html>
