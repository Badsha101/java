<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
        // Retrieve the session object
        HttpSession currsession = request.getSession(false);

        // Check if the session is not null and the username attribute is set
        if (currsession != null) {
            currsession.invalidate();
            
            // Redirect to the index page after logout
            response.sendRedirect("index.html");
        }
    %>

     
</body>
</html>