package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Student;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/plain")
	public String localService() {
		return "India Customer Service Center @ edureka";
	}

	@POST
	@Produces("text/plain")
	public String localService1() {
		return "India Customer Service Center @ edureka for POST";
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalService() {
		return "<h2 style=color:blue>International Customer Service Center @ edureka</h2>";
	}	
	
	/*
	@POST
	@Produces("text/html")
	@Path("/register")
	public String registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
										@FormParam("addr_field") String address) {
		//--logic to save the student to database
		String response = "<p style=font-size:20px;line-height:2>";
		response += "Name - "+name+"<br>";
		response += "Age - "+age+"<br>";
		response += "Address - "+address+"</p>";
		
		return response;
	}
	*/

	@POST
	@Produces("application/json")
	@Path("/register")
	public Student registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
										@FormParam("addr_field") String address) {
		//--logic to save the student to database
		Student st = new Student();
		st.setStudentName(name);
		st.setStudentAge(age);
		st.setStudentAddress(address);
		
		return st;
	}	
}
