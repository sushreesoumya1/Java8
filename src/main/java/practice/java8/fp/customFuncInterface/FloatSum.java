package practice.java8.fp.customFuncInterface;

public class FloatSum implements Arithmatic<Float,Float,Float>{

	@Override
	public Float operation(Float t1, Float t2) {
		return t1+t2;
	}

}
