package practice.java8.methodReference;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import practice.java8.dataMembers.Employee;
import practice.java8.fp.customFuncInterface.FloatSum;
import practice.java8.fp.customFuncInterface.IntegerSum;
import practice.java8.util.CreateEmployeeList;

public class MethodReferencePractice {

	public static void main(String[] args) {
		CreateEmployeeList createEmployeeList=new CreateEmployeeList();
		List<Employee> employeeList= createEmployeeList.create();
		int a=40;
		int b=6;
		float f1=9;
		float f2=7;
		
		Consumer<Employee> consumer= System.out::println;
		Consumer<Integer> intSumConsumer=System.out::println; 
		Consumer<Float> floatSumConsumer=System.out::println; 
		
		for(Employee e: employeeList)
			consumer.accept(e);
		
		
		IntegerSum intSum= new IntegerSum();
		FloatSum floatSum= new FloatSum();
		
		BinaryOperator<Integer> function= intSum::operation;
		intSumConsumer.accept(function.apply(a, b));
		
		BinaryOperator<Float> floatFunc= floatSum::operation;
		floatSumConsumer.accept(floatFunc.apply(f1, f2));
	}

}
