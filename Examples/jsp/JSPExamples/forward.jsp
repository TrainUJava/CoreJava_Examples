<%
  if ((request.getParameter("userName").equals("java")) &&
      (request.getParameter("password").equals("java"))) {
%>

<jsp:forward page="forward2.jsp" />

<% } else { %>

<%@ include file="forward.html" %>

<% } %>