public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ABC", 10000, 2000);
		Manager m1 = new Manager(2, "MGR", 10000, 2000);
		MarketingExecutive mar1 = new MarketingExecutive(3, "MAR", 10000, 2000, 50);
		
		Employee arr[] = { e1, m1, mar1,new Employee(),new Employee(6, "mno", 5000, 1200) };

		for(Employee temp:arr) {
			temp.printEmployee();
		}
		
		final int  a[]= {10,20,30,40};
		a[3] = 20;
		System.out.println(a[3]);
		
		final int b = 9;
		System.out.println(b);
		//int b = 10;
		System.out.println(b);
		
		

	}

}