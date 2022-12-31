<%@page import="com.users.Kullanici"%>
<%@page import="com.vt.kullanicivt"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="u" class="com.users.Kullanici"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  

  
<%  
kullanicivt dao = new kullanicivt(); 
	Kullanici employee = new Kullanici(); 
	
	employee.setName(request.getParameter("name")); 
	employee.setPassword(request.getParameter("password")); 
	employee.setEmail(request.getParameter("email")); 
		employee.setcins(request.getParameter("cins")); 

	dao.save(employee); 
%>