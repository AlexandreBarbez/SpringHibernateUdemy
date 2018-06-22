<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student registration form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        First name : <form:input path="firstName" />

        <br><br>

        Last name : <form:input path="lastName" />

        <input type="submit" value="Submit" />

        <br><br>

        Country:

        <form:select path="country">
            <form:option value="Brazil" label="Brazil" />
            <form:option value="France" label="France" />
            <form:option value="Myanmar" label="Myanmar" />
        </form:select>

    </form:form>

</body>
</html>