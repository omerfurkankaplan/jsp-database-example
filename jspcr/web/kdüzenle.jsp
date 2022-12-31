<%@page import="com.vt.kullanicivt"%>  
<jsp:useBean id="u" class="com.users.Kullanici"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=kullanicivt.update(u);  
response.sendRedirect("edit.jsp");  
%>