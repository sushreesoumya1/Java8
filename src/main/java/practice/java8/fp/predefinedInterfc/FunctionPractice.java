package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

public class FunctionPractice {
	public static void main(String[] args) {
	
	CreateEmployeeList createEmployeeList= new CreateEmployeeList();
	List<Employee> employeeList= createEmployeeList.create();
	Function<Employee, Employee> incrementSalaryFunction = e->e.setSalary(e.getSalary()+5000);

	List<Employee> incrementedSalaryList= map(employeeList, incrementSalaryFunction);
	System.out.println(incrementedSalaryList.toString());
	}
	private static List<Employee> map(List<Employee> employeeList, Function<Employee, Employee> function) {
		List<Employee> newList= new ArrayList<Employee>();
		for(Employee e: employeeList) {
			newList.add(function.apply(e));
		}
		return newList;
	}
	
}
