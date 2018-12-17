<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>

Airlines:${flight.operatingairlines}</br>
Departure:${flight.departurecity}</br>
Arrival:${flight.arrivalcity }</br>

<h2>Passenger Details</h2>
<pre>
<form action="completereservation" method="post">
FIRST NAME:<input type="text" name="paxfirstname"/>
LAST NAME:<input type="text" name="paxlastname"/>
EMAIL:<input type="text" name="email"/>
PHONE:<input type="text" name="phone"/>

<h2>Card details</h2>

NAME ON CARD:<input type="text" name="paxcard"/>
CARD NO:<input type="text" name="cardno"/>
EXPIRY DATE:<input type="text" name="expirydate"/>
THREE DIGIT SEC CODE:<input type="text" name="securitycode"/>
<input type="hidden" name="flightId" value=${flight.id}>
<input type="submit" value="Submit"/>
</form>
</pre>
</body>
</html>