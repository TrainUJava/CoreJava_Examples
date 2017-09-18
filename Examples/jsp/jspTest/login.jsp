<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE> New Document </TITLE>
<META NAME="Generator" CONTENT="EditPlus">
<META NAME="Author" CONTENT="">
<META NAME="Keywords" CONTENT="">
<META NAME="Description" CONTENT="">
</HEAD>

<BODY>
<form action="">
user name<input type="text" name="t1">
<BR>
password <input type="password" name="t2"><BR>
<input type="submit" value="Login">
</form>

<%
String name=request.getParameter("t1");
String password=request.getParameter("t2");
%>
<h1><%
out.println(name+"  "+password);
%></h1>
</BODY>
</HTML>
