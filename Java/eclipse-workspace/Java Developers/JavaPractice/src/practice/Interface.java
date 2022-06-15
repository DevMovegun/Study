package practice;

interface InterfaceA {
	public static final int m = 4; 
	public abstract void printIA(); 
	
	default void printA() { // default method는 overriding하지 않아도 됨.
		System.out.println("printA()");
	}
}

interface InterfaceB {
	int n = 4; // public static final 자동으로 추가
	void printIB(); // public abstract 자동으로 추가
	
	static void printICA() {
		System.out.println("printB()");
	}
}

interface InterfaceExtendsInterface extends InterfaceB, InterfaceA {
	
}

class InterfaceClassC implements InterfaceA, InterfaceB { // interface는 다중상속 가능
	
	@Override
	public void printIA() { // void printA()는 문법 오류 꼭 public을 붙여야함
		System.out.println("printIA()");
	}
	
	@Override
	public void printIB() {
		System.out.println("printIB()");
	}
	
	void printC() {
		InterfaceA.super.printA(); // 부모 인터페이스명을 적지 않고 그냥 super.x만 하면 Object.x로 인식함
		/* error syntax
		 * InterfaceB.super.printB();
		 */
		System.out.println("printC()");
	}
}

public class Interface {
	public static void practiceInterface() {
		
		System.out.println("1. InterfaceA");
		InterfaceA a = new InterfaceClassC();
		a.printIA();
		a.printA();
		System.out.println();
		
		System.out.println("2. InterfaceB");
		InterfaceB b = new InterfaceClassC();
		b.printIB();
		InterfaceB.printICA(); // static method는 객체로 직접 호출, 참조 변수(b)로 호출 불가
		System.out.println();
		
		System.out.println("3. InterfaceClassA");
		InterfaceClassC c = new InterfaceClassC();
		c.printIA();
		c.printA();
		c.printIB();
		c.printC();
		
	}

}
