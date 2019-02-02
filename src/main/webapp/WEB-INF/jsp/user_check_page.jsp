<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>FLFE</title>
</head>
<body>
<spring:form modelAttribute="userFromServer" method="post" action="/budgetcheckerweb/users/check">
    <spring:input path="email"/>
    <spring:input path="password"/>
    <spring:button>check user</spring:button>
</spring:form>
</body>
</html>
