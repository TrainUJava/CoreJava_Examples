<jsp:useBean id="languageBean" scope="page" class="com.beans.LanguageBean">
  <jsp:setProperty name="languageBean" property="*"/>
</jsp:useBean>

<html>
  <head>
    <title>useBean action test result</title>
  </head>
  <body>
    <h1>useBean action test result</h1>

    <p>Hello, <jsp:getProperty name="languageBean" property="name"/>.</p>

    <p>Your favorite language is
       <jsp:getProperty name="languageBean" property="language"/>.</p>

    <p>My comments on your language:</p>
    <p><jsp:getProperty name="languageBean" property="languageComments"/>
    </p>
  </body>
</html>