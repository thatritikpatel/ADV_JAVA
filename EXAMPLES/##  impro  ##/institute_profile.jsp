<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="models.Institute" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/common.css" />
  <link rel="stylesheet" type="text/css" href="css/profile.css" />
  <script src="js/institute_profile.js"></script>
  <title>Document</title>
 </head>
 <body>

	<% 
		int iam = 0;
		String i_am = request.getParameter("iam"); 
		if(i_am!=null){
			iam = Integer.parseInt(i_am);
		}else{
			iam = (Integer)request.getAttribute("iam");
		}			
	%>
	
	<div id="container">
		<c:import url="header.jsp" />
		
		<%@ include file="institute_menu.jsp"  %>

		<div id="main_body">
			<h1 id="inst_title">&emsp;::<u>${institute.instituteName}</u>::</h1>
			<table id="prof_box">
				<tr>
					<%
						Institute institute = (Institute)session.getAttribute("institute");

						if(institute.getInstDp()!=null){
					%>
						<input type="hidden" id="dphd" value="yes" />		
						<input type="hidden" id="instid" value="${institute.instituteId}" />		
					<% } %>

					<td id="lft_box">
						<img src="images/institute.png" id="inst_pic" />
						<form action="dp_upload.do" method="post" enctype="multipart/form-data">
							<input type="file" name="dp" />
							<input type="hidden" name="iam" value="<%= iam %>" />
							<input type="submit" value="Upload" />
						</form>
					</td>
					<td id="rht_box">
						<table>
							<tr>
								<td>Institute Name : </td>
								<td>${institute.instituteName}</td>
							</tr>
							<tr>
								<td>Email : </td>
								<td>${institute.email}</td>
							</tr>
							<tr>
								<td>Contact : </td>
								<td>${institute.contact}</td>
							</tr>
							<tr>
								<td>City : </td>
								<td>${institute.city.cityName}</td>
							</tr>
							<tr>
								<td>Address : </td>
								<td>${institute.address}</td>
							</tr>
							<tr>
								<td>About Us : </td>
								<td>${institute.aboutUs}</td>
							</tr>
						</table>					
					</td>
				</tr>
			</table>
		</div>

		<c:import url="footer.jsp" />
	</div>

 </body>
</html>
