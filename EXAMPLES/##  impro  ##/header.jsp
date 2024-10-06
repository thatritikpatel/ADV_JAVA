<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="header">
	<img src="images/logo.png" id="logo" />
	<span id="ctrl">
		<c:choose>
			<c:when test="${institute==null}">
				<a href="#">Sign-Up</a>
				<a href="#">SignIn</a>
			</c:when>
			<c:otherwise>
				<a href="#">Logout</a>
			</c:otherwise>
		</c:choose>
	</span>
</div>

<link rel="stylesheet" type="text/css" href="css/header.css" />