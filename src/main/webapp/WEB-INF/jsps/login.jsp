<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterUser</title>
</head>
<body>
<form action="logins" method="POST">
<h2>Login </h2>
<pre>
User Name:<input type="text" name="email"/>
Password:<input type="text" name="password"/>
<input type="Submit" value="login">


</pre>

</form>
${msg}
</body>
</html>