<%!
 String companyName = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
<%
 out.println("Company Name = " + companyName + "<br>");
 out.println("sum = " + add(10,20));
%>
</h2>