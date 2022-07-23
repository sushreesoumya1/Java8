package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import practice.java8.dataMembers.Employee;

public class EmployeeOperation {
	
	public List<Employee> getEmployees(List<Employee> employeeList, Predicate<Employee> filterFemaleEmployees){
		List<Employee> newEmployeeList = new ArrayList<Employee>();
		for(Employee e: employeeList) {
			if(filterFemaleEmployees.test(e))
				newEmployeeList.add(e);
		}
		return newEmployeeList;
	}
	
	public void printEmployees(String type, List<Employee> employeeList, Consumer<Employee> printEmployee) {
		System.out.print(type+":");
		for(Employee e: employeeList)
			printEmployee.accept(e);
		System.out.println("\n");
		
	}

}
