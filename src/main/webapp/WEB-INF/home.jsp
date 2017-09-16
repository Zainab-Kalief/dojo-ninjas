<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>

<body>

<h2>  <c:out value="${ dojo.name }" /> </h2>

 <c:forEach items="${ ninjas }" var="ninja">
	<div>
	<span> <c:out value="${ ninja.firstName } " /> </span>
	<span> <c:out value="${ ninja.lastName } " /> </span>
	<span> <c:out value="${ ninja.age } " /> </span>
	</div>
			
</c:forEach>
</body>
</html>