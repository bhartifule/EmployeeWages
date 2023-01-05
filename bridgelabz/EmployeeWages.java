package com.bridgelabz;
//pascal code -> class,interface,enum -> Employeewages
public class EmployeeWages {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wages");
	
	double random = Math.random();
	// System.out.println("random");
	int employeeChek = (int) Math.floor(Math.random()*10) % 2;
	System.out.println("employeeChek");
	if(employeeChek == 1) {
		System.out.println("Employee is Present");
	}else
	{
		System.out.println("Employee is absent");
	}
}

}
