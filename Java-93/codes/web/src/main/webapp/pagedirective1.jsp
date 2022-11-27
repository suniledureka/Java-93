<%@page import="java.util.Date" info="this page explains about page directive" language="java"%>
<%!
  Date today = null;
%>
<p style="font-size:20px;color:blue;text-align:center">
<%
 today = new Date();
 out.println(today + "<br><br>");
 out.println(getServletInfo());
%>
</p>