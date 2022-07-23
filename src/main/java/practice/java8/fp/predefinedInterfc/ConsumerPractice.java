package practice.java8.fp.predefinedInterfc;

import java.util.List;
import java.util.function.Consumer;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

public class ConsumerPractice {

	static CreateEmployeeList createEmployeeList= new CreateEmployeeList();
	static List employeeList= createEmployeeList.create();
	static EmployeeOperation employeeOperation= new EmployeeOperation();
	
	public static void main(String[] args) {

		Consumer<Employee> printEmployees= e-> System.out.println(e);
		
		employeeOperation.printEmployees("employeeList",employeeList, printEmployees);
		
	}

}
