<%@page isErrorPage="true"%>
<p style="font-size:22px;color:blue">
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error ---> " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error ---> " + exception.getMessage());
 else
	 out.println("Internal Server Error");
%>
</p>