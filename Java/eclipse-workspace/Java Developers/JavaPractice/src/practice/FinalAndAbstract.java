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
		System.out.println("1. 2 way Create ab");
		System.out.println("1) create ab by child class constructor");
		FinalA ab = new FinalB();
		System.out.println();
		
		System.out.println("2) create ab by inner class");
		FinalA aa = new FinalA() {
			
			@Override
			void print3() {
				System.out.println("aa.print3()");
			}
			
		};
		System.out.println();
		
		System.out.println("2. use print()");
		System.out.println("1-1) ab.print1()");
		ab.print1();
		System.out.println();
		
		System.out.println("1-2) aa.print1()");
		aa.print1();
		System.out.println();
		System.out.println();
		
		
		System.out.println("2-1) ab.print2()");
		ab.print2();
		System.out.println();
		
		System.out.println("2-2) aa.print2()");
		aa.print2();
		System.out.println();
		System.out.println();
		
		System.out.println("3-1) ab.print3()");
		ab.print3();
		System.out.println();
		
		System.out.println("3-2) aa.print3()");
		aa.print3();
		
	}

}
