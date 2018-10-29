<%-- 
    Document   : Footer
    Created on : Aug 23, 2018, 10:02:26 PM
    Author     : NgoQuang
--%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%! public static int year;%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <footer>
        <%
            Calendar cal = Calendar.getInstance();
            year = cal.get(Calendar.YEAR);
        %>
        <p>Copyright &COPY; Ngo Quang Trong - <%=year%></p>
    </footer>
    
</body>
</html>
