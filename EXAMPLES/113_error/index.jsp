<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error.jsp" %>


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
  <%--
  <%
	int[] x = {12,56,89};
	System.out.println(x[2]);
  %>--%>


  <!-- Case 2: -->
  
  <c:catch var="e"> 
	  <%
		String s = null;
		System.out.println(s.length());
	  %>
  </c:catch>
  
  

  <h1>#############################</h1>
  

  
  
  <h1>#############################</h1>


 </body>
</html>
