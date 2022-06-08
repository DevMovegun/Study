package practice;

public class main {
	public static void main(String[] args) {
		
		// 참조 자료형 등가 비교
		System.out.println("References Data Type");
		RefDataType ref = new RefDataType();
		ref.refDataType();
		System.out.println();
		
		// 쇼트 서킷 (short circuit)
		System.out.println("Short Circuit");
		ShortCircuit sc = new ShortCircuit();
		sc.shortCircuit();
		System.out.println();
		
		// 논리 시프트 연산
		System.out.println("Logical Right Shift");
		LogRightShift log = new LogRightShift();
		log.logRightShift();
		System.out.println();
	}

}
