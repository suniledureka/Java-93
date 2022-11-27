<style>
 body{
   line-height:1.5;
 }
</style>
<p style="font-size:20px;color:blue">
<%
 String uid = request.getParameter("txt_uid");
 String pwd = request.getParameter("txt_pwd");
 
 out.println("User Name : " + uid + "<br>");
 out.println("Password : " + pwd);
%>
</p>
<hr>

<p style="font-size:20px;color:blue">

Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
HTTP Method = <%=request.getMethod() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Size = <%=request.getContentLength() %> <br>
Application Name = <%=request.getContextPath() %>
</p>