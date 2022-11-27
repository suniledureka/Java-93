<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y =5;
 //int y = 0;
 int[] marks = new int[10];
%>
<h2>
<%
 int res = x / y;
 out.println(x + " / " + y + " = " + res + "<br>"); 
%>
<%=marks[19] %>
</h2> 