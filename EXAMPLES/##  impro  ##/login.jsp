<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="css/common.css" />  
  <link rel="stylesheet" type="text/css" href="css/login.css" />  
  <link rel="stylesheet" type="text/css" href="css/form.css" />  

  <script src="js/index.js"> </script>

  <title>Document</title>
 </head>
 <body>
	<div id="container">
		<c:import url="header.jsp" />
		
		<%@ include file="menu.jsp"  %>
		
		<!-- ####################### -->
		<div id="main_body">
			
			<% 
				int iam = 0;
				String i_am = request.getParameter("iam"); 
				if(i_am!=null){
					iam = Integer.parseInt(i_am);
				}else{
					iam = (Integer)request.getAttribute("iam");
				}			
			%>

			

			<form action="login.do" method="get">
				<table id="_form_box">
					<caption><%= iam==0?"Institute":iam==1?"Faculty":"Student" %> LOGIN</caption>					
					<tr>
						<td class="lft">Email</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="email" name="email" /></td>
					</tr>
					<tr>
						<td class="lft">Password</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="password" name="password" /></td>
					</tr>
					<tr>
						<td colspan="3" id="btn_box">
							<input type="hidden" name="iam" value="<%= iam %>" />

							<input type="submit" value="SignIn" id="frmbtn" />		
						</td>
					</tr>
				</table>				
			</form>		

			<div id="shsgup_box">
				<a href="show_signup.do?iam=<%= iam %>" id="shsgup">SignUp</a>
			</div>
		</div>
		<!-- ####################### -->
				
		<c:import url="footer.jsp" />
	</div>	
 </body>
</html>
