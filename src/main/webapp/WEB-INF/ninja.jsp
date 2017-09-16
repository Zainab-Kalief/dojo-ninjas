<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
	<form:form method="POST" action="/ninjas/new" modelAttribute="newNinja">
	<form:hidden path="id"/>
	
	<%--  <form:select name="dojo">Dojo:
		<form:options items="${ dojos }" itemLabel="name" itemValue="id" />
	</form:select>  --%>
	<select name="dojo">
		<c:forEach items="${ dojos }" var="dojo">
			<option value=<c:out value="${ dojo.id }"/> > <c:out value="${ dojo.name }"/> </option>
			
		</c:forEach>
		
	</select>
     <form:label path="firstName">First Name
     	<form:input path="firstName"/>
     </form:label><br>
     
     <form:label path="lastName">Last Name
     	<form:input path="lastName"/>
     </form:label><br>
     
     <form:label path="age">Age 
     	<form:input path="age" type="number"/>
     </form:label><br>
     
      <input type="submit" name="" value="Create Person">
    </form:form>
</body>

</html>

