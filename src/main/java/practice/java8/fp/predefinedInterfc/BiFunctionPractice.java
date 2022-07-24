package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

public class BiFunctionPractice {

	public static void main(String[] args) {

		CreateEmployeeList createEmployeeList= new CreateEmployeeList();
		List<Employee> employeeList = createEmployeeList.create();
		
		BiFunction<Employee, Integer, Employee> incrementSalaryFunction
			= (e,x)-> e.setSalary(e.getSalary()+x);
		int salaryToIncrement=1000;
		List<Employee> incrementedSalaryList
				= map(employeeList,incrementSalaryFunction,salaryToIncrement);
		System.out.println(incrementedSalaryList.toString());
	}
	
	public static List<Employee> map(List<Employee> employeeList, 
			BiFunction<Employee, Integer, Employee> incrementSalaryFunction,
			int salaryToIncrement){
		
		List<Employee> newList = new ArrayList<Employee>();
		for(Employee e: employeeList) {
			newList.add(incrementSalaryFunction.apply(e, salaryToIncrement));
		}
		return newList;
		
	}

}
