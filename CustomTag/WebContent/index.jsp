<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/myfile.tld" prefix="my" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<form>

<input type="number" name="data"><br>
<input type="submit">
</form>

<%!
String s= "0";
%>

<%
s=request.getParameter("data");
if(s==null){
	s="0";
}
%>

<div style="color: blue"><my:hello message="<%=s %>"></my:hello></div>
</body>
</html>