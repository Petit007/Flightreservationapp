<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display location</title>
</head>
<body>
<h2>Location</h2>

<table>
<tr>
<th>operating_airlines</th>
<th>departure_city</th>
<th>arrival_city</th>
<th>date_of_departure</th>
</tr>
<c:forEach items="${fli}" var="flis">
<tr>
<td>${flis.operatingairlines}</td>
<td>${flis.departurecity}</td>
<td>${flis.arrivalcity}</td>
<td>${flis. ESTIMATEDDEPARTURETIME}</td>
<td><a href="showcompletereservation?flightId=${flis.id}">Select</a></td>

</tr>
</c:forEach>
</table>

</body>
</html>