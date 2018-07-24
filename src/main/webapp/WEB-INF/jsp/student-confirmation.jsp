<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student confirmation </title>
</head>
<body>
    The student is confirmed : ${student.firstName} ${student.lastName}
    <br><br>
    Country : ${student.country}
    <br><br>
    Favorite Language : ${student.language}
    <br><br>
    Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>