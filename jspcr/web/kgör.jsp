<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Görüntüle</title>  
</head>  
<body>  
  
<%@page import="com.vt.kullanicivt,com.users.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Liste</h1>  
  
<%  
List<Kullanici> list=kullanicivt.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>AD:</th><th>Şifre:</th><th>Email</th>  
<th>Cinsiyet</th><th>Düzenle</th><th>Sil</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td>  
<td>${u.getEmail()}</td><td>${u.getcins()}</td> 
<td><a href="kdüzenle.jsp?id=${u.getId()}">Düzenle</a></td>  
<td><a href="sil.jsp?id=${u.getId()}">Sil</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="keklemeform.jsp">Ekle </a>  
  
</body>  
</html>