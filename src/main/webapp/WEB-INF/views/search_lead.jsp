<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


       <table>
           
           
     <tr>
     
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>City</th>
<th>mobile</th>
<th>Delete</th>


 </tr>
 
<c:forEach var="lead" items="${leads}">

    <tr>
    
<td>${lead.id}</td>
<td>${lead.firstname}</td>
<td>${lead.lastname}</td>
<td>${lead.email }</td>
<td>${lead.city}</td>
<td>${lead.mobile}</td>
<td><a href="Delete?id=${lead.id}">delete</a></td>
<td><a href="getLeadInfo?id=${lead.id}">edit</a></td>



     </tr>
    
      
</c:forEach>


 
</table>
</body>
</html>