<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 MVC Series - User Manager | viralpatel.net</title>
</head>
<body>
 
<h2>User Manager</h2>
 
<form:form method="post" action="add.html" commandName="user">
 
    <table>
    <tr>
        <td><form:label path="login">login</form:label></td>
        <td><form:input path="login" /></td> 
    </tr>
    <tr>
        <td><form:label path="name">name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="password">password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>

    <tr>
        <td colspan="2">
            <input type="submit" value="Add"/>
        </td>
    </tr>
</table>  
</form:form>
 
     
<h3>Users</h3>
<c:if  test="${!empty userList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Login</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${userList}" var="user">
    <tr>
        <td>${user.name}</td>
        <td>${user.login}</td>
        <td><a href="delete/${user.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>