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
  
  <c:catch var="e"> 
	  <%
		String s = null;
		System.out.println(s.length());
	  %>
  </c:catch>

  <h1>#############################</h1>
  

  <c:if test="${e==null}">
	Hello
  </c:if>
  
  <h1>#############################</h1>


 </body>
</html>
