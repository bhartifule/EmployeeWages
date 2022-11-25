package com.bridgelabz;
//pascal code -> class,interface,enum -> Employeewages
public class EmployeeWages {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wages");
	//0.123 ,0.3423 , 0.567 ,0.423
	//2.23 ,3.423 ,3.67 ,4.23
	//1.0 ,3.0 ,5.0 ,4.0
	
	//double random = Math.random();
//	System.out.println("random");
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
