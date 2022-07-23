package practice.java8.fp.predefinedInterfc;

import java.util.List;
import java.util.function.Supplier;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

public class SupplierPractice {
	static CreateEmployeeList createEmployeeList= new CreateEmployeeList();
	
	public static void main(String[] args) {

		Supplier<String> sayHello= ()-> "Hello";
		Supplier<Integer> maxInt= ()-> Integer.MAX_VALUE;
		Supplier<List<Employee>> employeeList=
				()-> new CreateEmployeeList().create();
		Supplier<List<Employee>> employeeList2=
				()-> createEmployeeList.create();
		
		System.out.println(sayHello.get());
		System.out.println(maxInt.get());
		for(Employee e: employeeList.get())
		System.out.print(e);
		System.out.println("\n------");
		//Prints once--> Need to check PredicatePractice
		for(Employee e: employeeList2.get())
			System.out.print(e);
		
	}

}
