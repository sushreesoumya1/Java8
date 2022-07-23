package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
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

}
