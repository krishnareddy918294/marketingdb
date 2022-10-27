<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a new Lead</title>
</head>
<body>
<h1>Create  New Registration</h1>


<form action="updateLead"   method="post">
<prev>
Id<input type ="text" name="id"    value="${lead.id}"/>
FirstName <input type="text" name="firstname"   value="${lead.firstname}"/>
lastName <input type="text" name="lastname"   value="${lead.lastname}"/>
email <input type="text" name="email"   value="${lead.email}"/>
cityName <input type="text" name="city"   value="${lead.city}"/>
mobile <input type="text" name="mobile"  value="${lead.mobile}"/>
<input  type ="submit" value="update"/>
</prev>
</form>
${error }

</body>

</html>