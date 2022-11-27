<%!
 String companyName = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
Company Name = <%=companyName %>
<br>
<%="sum = " + add(12,31) %>
</h2>