<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student registration form</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>

<i>Fill out the form : (*) means required</i>
    <form:form action="processForm" modelAttribute="student">

        First name (*) : <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error"/>

        <br><br>
        Last name (*) : <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error"/>

        <%--

        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countriesOptions}"/>
        </form:select>

        <br><br>
        Favorite Language
        <form:radiobuttons path="language" items="${student.languagesOptions}"/>

        --%>

        <br><br>
        Operating Systems :
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
        Windows <form:checkbox path="operatingSystems" value="MS Windows" />

        <br><br>
        <input type="submit" value="Submit" />
    </form:form>

</body>
</html>