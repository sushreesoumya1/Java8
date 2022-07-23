package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

//accepts and returns the same type. It extends Function
public class UnaryOperatorPractice {

	public static void main(String[] args) {

		CreateEmployeeList createEmployeeList = new CreateEmployeeList();
		List<Employee> employeeList= createEmployeeList.create();
		
		UnaryOperator<Employee> salaryIncrementFunction = e->e.setSalary(e.getSalary()+5000);
		List<Employee> incrementedSalaryList= map(employeeList,salaryIncrementFunction);
		System.out.println(incrementedSalaryList.toString());
	}
	
	public static List<Employee> map(List<Employee> employeeList, UnaryOperator<Employee> salaryIncrementFunction){
		List<Employee> newList = new ArrayList<Employee>();
		for(Employee e: employeeList) {
			newList.add(salaryIncrementFunction.apply(e));
		}
		return newList;
	}

}
