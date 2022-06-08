package practice;

public class ShortCircuit {
	static void shortCircuit () {
		
		// 쇼트 서킷 (short circuit)
		
		//논리 연산자로 논리 연산
		int a, b, c; a = 3; b = 3; c = 3;
		
		System.out.println(false && ++a > 5); // false
		System.out.println(true || ++b > 5); // true
		System.out.println(true ^ ++c > 5); // true
		System.out.printf("a = %d, b = %d, c = %d\n\n", a, b, c); // a = 3, b = 3, c = 4
		
		// 비트 연산자로 논리 연산
		a = 3; b = 3; c = 3;
		
		System.out.println(false & ++a > 5); // false
		System.out.println(true | ++b > 5); // true
		System.out.println(true ^ ++c > 5); // true
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c); // a = 4, b = 4, c = 4
		
	}

}