<%@page import="com.vt.kullanicivt"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="u" class="com.users.Kullanici"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
kullanicivt.delete(u);  
response.sendRedirect("kgör.jsp");
%>