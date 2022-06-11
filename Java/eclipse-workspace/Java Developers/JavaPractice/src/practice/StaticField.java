package practice;

class A {
	int m = 3;
	static int n;
	
	static {
		System.out.println("class A loaded");
		System.out.println();
		n = 4;
	}
}

public class StaticField {
	
	int a = 10;
	static int b = 20;
	
	public static void staticField01() {
		
		System.out.println("1. static method staticField01");
		
		A a1 = new A();
		System.out.println("instance field m : " + a1.m);
		System.out.println("static field n : " + A.n);
		// == System.out.println("static field n : " + a1.n);
		
		System.out.println("Can not use intance a");
		System.out.println("static b : " + b);
		
		/* error syntax
		 * System.out.println("instance a : " + this.a);
		 * System.out.println("static b : " + this.b);
		 */
		
		System.out.println();
		
	}
	
	public void staticField02() {
		
		System.out.println("2. instance method staticField02");
		
		A a1 = new A();
		A a2 = new A();
		
		a1.m = 10;
		a2.m = 20;
		
		a1.n = 50;
		a2.n = 100;
		
		System.out.printf("a1.m : %d, a1.n : %d\n", a1.m, a1.n);
		System.out.printf("a2.m : %d, a2.n : %d\n", a2.m, a2.n);
		
		System.out.println("instance a : " + this.a);
		System.out.println("static b : " + this.b);
		System.out.println();
		
	}

}
