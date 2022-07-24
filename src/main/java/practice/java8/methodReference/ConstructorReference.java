package practice.java8.methodReference;

import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {
		
		//Thread creation in the traditional way:
		Thread thread = new Thread(new MyRunnable());
		thread.start();

		//Functional way:
		
		Function<Runnable, Thread> createThread= Thread:: new;
		createThread.apply(new MyRunnable()).start();
		
		//Another way:
		createThread
			.apply(()->System.out.println("Functional Way"))
			.start();
	}

}
