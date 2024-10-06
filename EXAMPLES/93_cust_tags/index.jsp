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
  <%--<t:help value="34" />--%>

  <!-- Case 2: -->
  <%--<t:help value="${45}" />--%>

  <!-- Case 3: -->
  <%--<t:help value="<c:out value='67' />" />--%>

  <!-- Case 4: -->
  <t:help value='<%= "mohan ji" %>' />

	
 </body>
</html>
