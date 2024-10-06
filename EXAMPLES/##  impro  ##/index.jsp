<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="css/common.css" />  
  <link rel="stylesheet" type="text/css" href="css/index.css" />  

  <script src="js/index.js"> </script>

  <title>Document</title>
 </head>
 <body>
	<div id="container">
		<c:import url="header.jsp" />
		
		<%@ include file="menu.jsp"  %>
		
		<!-- ####################### -->
		<div id="main_body"></div>
		<!-- ####################### -->
				
		<c:import url="footer.jsp" />
	</div>	
 </body>
</html>
