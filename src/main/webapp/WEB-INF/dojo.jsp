<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<body>
	<form:form method="POST" action="/dojos/new" modelAttribute="newDojo">
		<form:hidden path="id"/>
     <form:label path="name">Name
     	<form:input path="name"/>
     </form:label><br>
     
      <input type="submit" name="" value="Create">
    </form:form>
</body>
</html>