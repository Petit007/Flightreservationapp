<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flight</title>
</head>
<body>
<h2>Find flights</h2>
<form action="findflight" method="POST">
FROM:<input type="text" name="from"/>
TO:<input type="text" name="to"/>
DEPATURE DATE:<input type="text" name="departureDate"/>
<input TYPE="SUBMIT" value="Search"/>


</form>
</body>
</html>