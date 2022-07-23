package practice.java8.fp.predefinedInterfc;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import practice.java8.dataMembers.Employee;
import practice.java8.util.CreateEmployeeList;

public class PredicatePractice {
	static CreateEmployeeList createEmployeeList = new CreateEmployeeList();
	static EmployeeOperation employeeOperation= new EmployeeOperation();
	static List<Employee> employeeList= createEmployeeList.create();
	 
	public static void main(String[] args) {
		Predicate<Employee> filterFemaleEmployees = e-> "Female".equals(e.getGender());
		Predicate<Employee> filterSalGreterThan10000= e->e.getSalary()>10000;
		Predicate<Employee> filterNameStartsWithD= e-> e.getName().startsWith("D");
		
		Consumer<Employee> printEmployees= e-> System.out.print(e);
		
		Supplier<List<Employee>> employeeList1= ()-> createEmployeeList.create();
		
		/*
		 * for(Employee e: employeeList1.get()) { System.out.println("---"+e); }
		 */
		
		List<Employee> employeesWithSalaryGreaterThan10000=
				employeeOperation.getEmployees(employeeList, filterSalGreterThan10000);
		List<Employee> femaleEmployeeList= 
				employeeOperation.getEmployees(employeeList,filterFemaleEmployees);
		List<Employee> employessWhoseNameStartsWithD=
				employeeOperation.getEmployees(employeeList, filterNameStartsWithD);
	
		employeeOperation.printEmployees("employeesWithSalaryGreaterThan10000",
				employeesWithSalaryGreaterThan10000, printEmployees);
		employeeOperation.printEmployees("femaleEmployeeList", femaleEmployeeList, printEmployees);
		employeeOperation.printEmployees("employessWhoseNameStartsWithD", employessWhoseNameStartsWithD, printEmployees);
		
		//PRINTS TWICE
		employeeOperation.printEmployees("printEmployeesWithSupplier", employeeList1.get(), printEmployees);
		
		
	}
	
	
	

}
