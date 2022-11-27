<p style="font-size:20px;color:blue">
<%
 String uid = request.getParameter("txt_uid");
 out.println("Hello " + uid);
 pageContext.setAttribute("uname", uid, PageContext.SESSION_SCOPE);
%>
</p>
<a href="pagecontext2.jsp">Next Page</a>