package Employee;

public class EmployeeDetails {

	public static void main(String[] args) {
		Contractor c=new Contractor(1500,3);
	    c.calculateSalary();
	    c.displayDetails();
	    FullTimeEmployee f= new FullTimeEmployee(2000);
	    f.calculateSalary();
	    f.display();


	}

}
