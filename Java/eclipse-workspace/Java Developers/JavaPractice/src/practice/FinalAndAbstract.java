package practice;

abstract class FinalA {
	int m = 2;
	final int n = 4;
	
	FinalA() {
		/*
		 * error syntax n = 5;
		 */
		System.out.println("FinalA()");
		System.out.printf("m = %d, n = %d\n", m, n);
	}
	
	void print1() {
		System.out.println("FinalA.print1()");
	}
	
	final void print2() {
		System.out.println("FinalA.print2()");
	}
	
	abstract void print3();
}

final class FinalB extends FinalA {
	int m = 3;
	final int n;
	
	FinalB() {
		System.out.println("FinalB()");
		n = 5;
		System.out.printf("m = %d, n = %d\n", m, n);
	}
	
	void print1() {
		System.out.println("FinalB.print1()");
	}
	
	/* error syntax
	 * void print2() {
	 * 
	 * }
	 * */
	
	void print3() {
		System.out.println("FinalB.print3()");
	}
}

/* error syntax
 * class FinalC extends FinalB {
 * 
 * }
 */

public class FinalAndAbstract {
	public static void finalAndAbstract() {
		
		/*
		 * error syntax FinalA a = new FinalA();
		 */
		System.out.println("Create ab");
		FinalA ab = new FinalB();
		System.out.println();
		
		System.out.println("1. ab.print1()");
		ab.print1();
		System.out.println();
		
		System.out.println("2. ab.print2()");
		ab.print2();
		System.out.println();
		
		System.out.println("3. ab.print3()");
		ab.print3();
		
	}

}
