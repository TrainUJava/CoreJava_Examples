<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE> New Document </TITLE>

</HEAD>

<BODY>
<%! public int add(int a, int b)
{
	return (a+b);
}
%>

<h3>The sum =<%
out.println(add(6,7));
%></h3><BR>

<h2>The sum =<%=add(7,8)
%></h2>
</BODY>
</HTML>
