package Employee;

public class Contractor extends Employee {
	private int money;
	private int hour;
	private int salary;
	Contractor(int money, int hour)
	{
		super("harsha",100,"obsuqra");
		this.money=money;
		this.hour=hour;
		System.out.println(getEmpName());
		
	}

public void calculateSalary()
{
	salary= money* hour;
	
}
public void displayDetails()
{
	System.out.println("COMPANY NAME : "+ getCompanyName());
	System.out.println("EMPLOYEE NAME : "+ getEmpName());
	System.out.println("EMPLOYEE ID : "+ getEmpId());
	System.out.println("SALARY : "+ salary);
}
}

