package practice.java8.fp.customFuncInterface;

public class IntegerSum implements Arithmatic<Integer,Integer,Integer>{

	@Override
	public Integer operation(Integer t1, Integer t2) {
		return t1+t2;
	}

}
