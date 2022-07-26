package practice.java8.optional;

import java.util.Optional;

import practice.java8.dataMembers.Employee;

public class OptionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Optional<Employee> e1=		
				Optional.of(new Employee()
		.setId(1001)
		.setGender("Female")
		.setName("Eena")
		.setAge(32)
		.setSalary(10000)
		.build());
		

		Employee e2= new Employee()
		.setId(1002)
		.setGender("Female")
		.setName("Meena")
		.setAge(30)
		.setSalary(11000)
		.build();
		
		System.out.println(e1);
		System.out.println(e2);
		
		//Null Pointer Exception
		//System.out.println(e1.get().getCity().substring(2));
		//System.out.println(e2.getCity().substring(2));
		
		System.out.println("-------------");
		
		/*Does not work this way
		 * Optional.empty().ifPresent(x->System.out.println("Empty"));
		 * System.out.println("city: "+city);//null
		 * Optional.of(city).ifPresent(c->System.out.println(c.substring(2)));
		 */
		
		Optional<String> city =Optional.ofNullable(e2.getCity());
		System.out.println("city: "+city);
		city.ifPresent(c->System.out.println(c.substring(2)));
		city.ifPresentOrElse(c->System.out.println(c.substring(2)),
				()->System.out.println("city is null"));
		
		
		
		
	}

}
