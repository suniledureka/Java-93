<jsp:useBean id="acc" class="co.edureka.web.model.Account"></jsp:useBean>

<p style="font-size:20px;color:blue;line-height:2">
A/C No: <jsp:getProperty property="accountNo" name="acc"/> <br>
Name : <jsp:getProperty property="accountName" name="acc"/> <br>
Balance: <jsp:getProperty property="accountBal" name="acc"/> <br><br> 

<jsp:setProperty property="accountName" name="acc" value="Sunil Joseph"/>
Name : <jsp:getProperty property="accountName" name="acc"/> <br>
</p>