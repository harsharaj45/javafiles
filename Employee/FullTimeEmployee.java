package Employee;

public class FullTimeEmployee extends Employee {
	static final double WORK_HOUR = 8;
	private double hourPayment;
	private double salary;
	FullTimeEmployee(double hourPayment)
	{
		super("shiva",101,"allianze");
		this.hourPayment=hourPayment;
	}
	public void calculateSalary()
	{
		salary= hourPayment* WORK_HOUR;
	
		
	}
	public void display()
	{
		System.out.println("COMPANY NAME : "+ getCompanyName());
		System.out.println("EMPLOYEE NAME : "+ getEmpName());
		System.out.println("EMPLOYEE ID : "+ getEmpId());
		System.out.println("SALARY : "+ salary);
	}


}

