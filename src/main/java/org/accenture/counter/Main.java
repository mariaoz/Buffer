package org.accenture.counter;

public class Main {
    public static void main(String[] args) {
	/*Counter counter= new Counter();
	System.out.println(counter2.getCounter());
	System.out.println(counter.getCounter());
	System.out.println(counter.getCounter());
	System.out.println(counter.getCounter());
	
	System.out.println("----------------");
	Counter counter2= new Counter();
	System.out.println(counter2.getCounter());
	System.out.println(counter2.getCounter());
	*/
	SingletonCounter counter=SingletonCounter.getInstance();
	System.out.println(counter.getCounter());
	System.out.println(counter.getCounter());
	SingletonCounter counter2=SingletonCounter.getInstance();
	System.out.println(counter2.getCounter());
	System.out.println(counter2.getCounter());
	
	
	
    }

}
