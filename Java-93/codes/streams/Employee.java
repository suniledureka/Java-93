package co.edureka.util.streams;

public class Employee {
	private Integer employeeNo;
	private String employeeName;
	private String employeeDept;
	private Float employeeSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeNo, String employeeName, String employeeDept, Float employeeSal) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSal = employeeSal;
	}

	public Integer getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public Float getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(Float employeeSal) {
		this.employeeSal = employeeSal;
	}

	@Override
	public String toString() {
		return String.format("Employee [%-3d | %-8s | %-3s | %.2f]",employeeNo , employeeName, employeeDept, employeeSal);
	}

}
