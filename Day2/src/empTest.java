
public class empTest {
	public static void main(String[] args) {
		
	Employee e1 = new Employee("ABCD",10000,1500);
	e1.printEmployee();
	
	Employee e2 = new Employee("PQRS",10000,1500);
	e2.printEmployee();
	
	Employee e3 = new Employee("STUV",10000,1500);
	e3.printEmployee();
	
	Employee e4 = new Employee("VWXY",10000,1500);
	e4.printEmployee();
	
	System.out.println("Total Employees :"+(Employee.count-1));
	}
    
	
}
