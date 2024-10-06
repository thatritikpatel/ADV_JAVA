<%@ page import="java.util.ArrayList,models.City" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="css/common.css" />  
  <link rel="stylesheet" type="text/css" href="css/signup.css" />  
  <link rel="stylesheet" type="text/css" href="css/form.css" />  

  <script src="js/signup.js"> </script>

  <title>Document</title>
 </head>
 <body>
	<% ArrayList<City> cities = (ArrayList)application.getAttribute("cities"); %>
	<div id="container">
		<c:import url="header.jsp" />
		
		<%@ include file="menu.jsp"  %>
		
		<!-- ####################### -->
		<div id="main_body">
			
			<% int iam = Integer.parseInt(request.getParameter("iam")); %>

			<form action="signup.do" method="get" id="signup_form">
				<table id="_form_box">
					<caption><%= iam==0?"Institute":iam==1?"Faculty":"Student" %> SIGNUP</caption>					
					<tr>
						<td class="lft">Username</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="text" name="username" id="username" /></td>
					</tr>
					<tr>
						<td class="lft">Email</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="email" name="email" id="email" /></td>
					</tr>
					<tr>
						<td class="lft">Password</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="password" name="password" id="password" /></td>
					</tr>
					<tr>
						<td class="lft">Re-Password</td>
						<td class="mdl">:</td>
						<td class="rht"><input class="fld" type="password" name="repassword" id="repassword" /></td>
					</tr>

					<% if(iam==0){ %>
						<tr>
							<td class="lft" valign="top">Address</td>
							<td class="mdl" valign="top">:</td>
							<td class="rht">
								<textarea rows="3" cols="20" name="address" class="fld" id="address"></textarea>
							</td>
						</tr>
						<tr>
							<td class="lft">City</td>
							<td class="mdl">:</td>
							<td class="rht">
								<input type="text" name="city_id" id="city_id" class="fld" />
								<div id="recs"></div>
								<input type="text" name="ctid" id="ctid" />
								
								<%--
								<select name="city_id">
									<option value="0">Select</option>
									<% for(City city : cities){ %>
									<option value="<%= city.getCityId()%>"><%= city.getCityName() %></option>
									<% } %>
								</select>--%>
							</td>
						</tr>
					<% } %>

					<tr>
						<td colspan="3" id="btn_box">
							<input type="hidden" name="iam" value="<%= iam %>" />

							<input type="submit" value="SignUp" id="frmbtn" />		
						</td>
					</tr>
				</table>				
			</form>		

			<div id="shsgup_box">
				<a href="show_signup.do" id="shsgup">SignUp</a>
			</div>
		</div>
		<!-- ####################### -->
				
		<c:import url="footer.jsp" />
	</div>	
 </body>
</html>
