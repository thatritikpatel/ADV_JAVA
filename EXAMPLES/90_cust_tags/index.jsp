<%@ taglib prefix="t" uri="ganesh" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Index Page</h1>
  <hr />
  <!-- Case 1: -->
  <%--<t:help>Mohan Kumar Ji ######</t:help>--%>
	
  <!-- Case 2: -->
  <%--
  <% request.setAttribute("abc",56); %>
  <t:help>${abc}</t:help>--%>

  <!-- Case 3: -->
  <%--<t:help><c:out value="mohan" /></t:help>--%>

  <!-- Case 4: -->
  <%--<t:help><%= 12+34 %></t:help>--%>

	
 </body>
</html>
