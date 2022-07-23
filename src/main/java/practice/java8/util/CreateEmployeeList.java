package practice.java8.util;

import java.util.ArrayList;
import java.util.List;

import practice.java8.dataMembers.Employee;

public class CreateEmployeeList {
	
	public List<Employee> list = new ArrayList<Employee>();
	
	Employee e1=		
			new Employee()
			.setId(1001)
			.setAge(30)
			.setCity("Bangalore")
			.setGender("Female")
			.setName("Eena")
			.setSalary(10000)
			.build();
	Employee e2=		
			new Employee()
			.setId(1002)
			.setAge(30)
			.setCity("Bangalore")
			.setGender("Female")
			.setName("Meena")
			.setSalary(5000)
			.build();
	Employee e3=		
			new Employee()
			.setId(1003)
			.setAge(30)
			.setCity("Hyderabad")
			.setGender("Female")
			.setName("Deeka")
			.setSalary(11000)
			.build();	
	Employee e4=		
			new Employee()
			.setId(1004)
			.setAge(30)
			.setCity("Pune")
			.setGender("Male")
			.setName("Tom")
			.setSalary(9000)
			.build();	

	Employee e5=		
			new Employee()
			.setId(1005)
			.setAge(30)
			.setCity("Pune")
			.setGender("Male")
			.setName("Dick")
			.setSalary(9000)
			.build();
	
	Employee e6=		
			new Employee()
			.setId(1006)
			.setAge(32)
			.setCity("Hyderabad")
			.setGender("Male")
			.setName("Harry")
			.setSalary(12000)
			.build();
	
	public List<Employee> create(){
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		return list;
	}
	
	
}
