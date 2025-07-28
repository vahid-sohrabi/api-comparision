<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Result</title></head>
<body>
<h1>Message: <%= request.getAttribute("message") %></h1>
<h2>Request URI: <%= request.getRequestURI() %></h2>
<h2>Request URL: <%= request.getRequestURL() %></h2>
</body>
</html>
