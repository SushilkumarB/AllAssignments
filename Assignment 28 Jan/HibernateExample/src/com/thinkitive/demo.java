package com.thinkitive;

public class demo {
	public static void main(String[] args) {
		MyDbConnection d=new MyDbConnection();
		d.InsertEmployee(11, "ABCD", 10000);
		d.InsertEmployee(23, "PQRS", 12000);
		d.InsertEmployee(13, "MNOP", 19000);
		System.out.println("inserted in to the table");
		d.updateEmployee(11,"ABCD",10000);
		System.out.println("Employee updated");
		d.deleteEmployee(23,"PQRS",12000);
		d.displayEmployee();
	}

}


