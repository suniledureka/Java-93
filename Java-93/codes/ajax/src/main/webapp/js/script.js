var xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange=stateChanged;
	
	xhr.open("GET", "search?eno="+empno, true); //true - asynchronous communication
	
	xhr.send();
}

function stateChanged(){
	var name = "NO MATCH";
	var sal = "NO MATCH";
	
	if(xhr.readyState==4 && xhr.status==200){
		var text = xhr.responseText;
		if(text.length > 0){
			var obj = JSON.parse(text); //to convert JSON text to JSON object
			name = obj.empname;
			sal = obj.empsal;
		}
		
		document.getElementById("emp-name").innerHTML = name;
		document.getElementById("emp-sal").innerHTML = sal;
	}
}