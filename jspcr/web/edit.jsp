<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.vt.kullanicivt,com.users.Kullanici"%>  

<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Düzenleme</title>  
</head>  
<body>  
  
<%  
String id=request.getParameter("id");  
    Kullanici k=kullanicivt.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Düzenle</h1>  
<form action="kdüzenle.jsp" method="post">  
<input type="hidden" name="id" value="<%=k.getId() %>"/>  
<table>  
<tr><td>Ad:</td><td>  
<input type="text" name="name" value="<%= k.getName()%>"/></td></tr>  
<tr><td>Şifre</td><td>  
<input type="password" name="password" value="<%= k.getPassword()%>"/></td></tr>  
<tr><td>Email:</td><td>  
<input type="email" name="email" value="<%= k.getEmail()%>"/></td></tr>  
<tr><td>Cinsiyet:</td><td>  
<input type="radio" name="cins" value="erkek"/>Erkek   
<input type="radio" name="cins" value="kadın"/>Kadın </td></tr>  
 
<tr><td colspan="2"><input type="submit" value="Kullanıcı Düzenle"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>