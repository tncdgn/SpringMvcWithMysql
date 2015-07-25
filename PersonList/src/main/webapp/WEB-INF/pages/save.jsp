<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<link rel='stylesheet' type='text/css' media='screen' href='<c:url value="/resources/css/datatable.css"/>'/>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Success</title>
</head>
<body>
<div align="center">
    <table border="0">
        <tr>
            <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <h3>Thank you for registering! Here's the review of your details:</h3>
            </td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td>${person2.selectedPerson}</td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td>${person2.address}</td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td>${person2.phoneNumber}</td>
        </tr>
        <tr>
            <td>Profession:</td>
            <td>${person2.surname}</td>
        </tr>

    </table>


</div>
</body>
</html>