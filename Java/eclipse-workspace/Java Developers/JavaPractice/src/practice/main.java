package practice;

public class main {
	public static void main(String[] args) {
		
		// 참조 자료형 등가 비교
		System.out.println("References Data Type");
		RefDataType.refDataType();
		System.out.println();
		
		// 쇼트 서킷 (short circuit)
		System.out.println("Short Circuit");
		ShortCircuit.shortCircuit();
		System.out.println();
		
		// 논리 시프트 연산
		System.out.println("Logical Right Shift");
		LogicalRightShift.logRightShift();
		System.out.println();
		
		// break를 이용한 다중 반복문 탈출 방법 2가지
		System.out.println("Escape Nested Loops by break");
		BreakEscapeNestedLoop.breakEscape();
		System.out.println();
	}

}
