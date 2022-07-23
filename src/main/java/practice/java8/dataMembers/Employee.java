package practice.java8.dataMembers;

public class Employee {
	long id;
	String name;
	String city;
	String gender;
	long salary;
	int age;
	public long getId() {
		return id;
	}
	public Employee setId(long id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Employee setCity(String city) {
		this.city = city;
		return this;
	}
	public String getGender() {
		return gender;
	}
	public Employee setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public long getSalary() {
		return salary;
	}
	public Employee setSalary(long salary) {
		this.salary = salary;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Employee setAge(int age) {
		this.age = age;
		return this;
	}
	
	public Employee build() {
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setAge(age);
		e.setCity(city);
		e.setGender(gender);
		e.setSalary(salary);
		
		return e;
		
	}
	
	public String toString() {
		return "\n"+"Employee: id: "+id+" name: "+name+" city: "+city
				+" gender: "+gender+" salary: "+salary;
		
		
	}

}
