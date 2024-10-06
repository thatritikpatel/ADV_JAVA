<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="models.Institute" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/common.css" />
  <link rel="stylesheet" type="text/css" href="css/categories.css" />
  <script src="js/categories.js"></script>
  <title>Document</title>
 </head>
 <body>
	
	<div id="container">
		<c:import url="header.jsp" />
		
		<%@ include file="institute_menu.jsp"  %>

		<div id="main_body">
			<h1 id="inst_title">&emsp;::<u>${institute.instituteName}</u>::</h1>
			<table id="prof_box">
				<tr>
					<td id="lft_box">
						<h2>Categories</h2>
						<ul id="all_cats">
							
						</ul>
					</td>
					<td id="mdl_box">
						<img src="images/right_arrow.png" id="add_cat" class="arrow" />
						
					</td>
					<td id="rht_box">
						<h2>Institute Categories</h2>					
						<ul id="inst_cats">
							
						</ul>
						<input type="button" value="Save" id="save_btn" disabled="disabled" />
					</td>
				</tr>
			</table>
		</div>

		<c:import url="footer.jsp" />
	</div>

 </body>
</html>
