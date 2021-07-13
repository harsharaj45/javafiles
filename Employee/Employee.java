package Employee;
abstract  class Employee {

	public static String companyName;
	private String empName;
	private int empId;
	

	Employee(String empName, int empId,String companyName)
	{
		this.empName=empName;
		this.empId=empId;
		Employee.companyName =companyName;
	}
	abstract void calculateSalary();

	public static String getCompanyName() {
		return companyName;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	

		}
