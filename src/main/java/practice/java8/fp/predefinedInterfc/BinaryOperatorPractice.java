package practice.java8.fp.predefinedInterfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(4);list.add(4);list.add(5);list.add(7);
		
		BinaryOperator<Integer> function =
				(i1,i2)-> i1+i2;
				
		int toAdd= 10;
		List<Integer> additionList = map(list,function, toAdd );
		System.out.println(additionList.toString());
	}

	private static List<Integer> map(List<Integer> list,BinaryOperator<Integer> function, int toAdd) {
		List<Integer> newList= new ArrayList<Integer>();
		for(int i: list) {
			newList.add(function.apply(i, toAdd));
		}
		return newList;
	}

}
