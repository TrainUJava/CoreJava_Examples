<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE> New Document </TITLE>

</HEAD>

<BODY>
<%@page import="java.util.Date"%>
<%
out.println(new Date().toString());
%>
<%! int a =20;
	int b=30;%>

<h1> Today's Date is&nbsp&nbsp&nbsp&nbsp<%=new Date().toString()%><BR>

The Sum of <%=a%> and
<%=b%> is <%=(a+b)%>
</BODY>
</HTML>
