package practice;

class SuperA {
	
	SuperA() {
		this(3);
		System.out.println("SuperA() constructor");
	}
	
	SuperA(int a) {
		System.out.println("SuperA(int a) constructor");
	}
	
	void print() {
		System.out.println("SuperA.print() method");
	}
	
}

class SuperB extends SuperA { // 자식 클래스는 부모의 기본 생성자를 처음에 호출하고 시작함.
	
	SuperB() {
		this(3);
		System.out.println("SuperB() constructor");
	}
	
	SuperB(int b) {
		// 컴파일러가 자동으로 superA(); 를 추가해줌 
		System.out.println("SuperB(int b) constructor");
	}
	
	void print() {
		super.print();
		System.out.println("SuperB.print() method");
	}
}

public class SuperMethod {
	
	public static void superMethod() {
		
		System.out.println("1. create a1");
		SuperA a1 = new SuperA();
		System.out.println();
		
		System.out.println("2. create a2");
		SuperA a2 = new SuperA(3);
		System.out.println();
		
		System.out.println("3. create b1");
		SuperB b1 = new SuperB();
		System.out.println();
		
		System.out.println("4. create b2");
		SuperB b2 = new SuperB(3);
		System.out.println();
		
		System.out.println("5. result to call b1.print");
		b1.print();
		
	}
}
