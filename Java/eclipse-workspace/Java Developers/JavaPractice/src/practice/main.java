package practice;

public class main {
	public static void main(String[] args) {
		
		// 참조 자료형 등가 비교
		System.out.println("# References Data Type");
		RefDataType.refDataType();
		System.out.println();
		
		// 쇼트 서킷 (short circuit)
		System.out.println("# Short Circuit");
		ShortCircuit.shortCircuit();
		System.out.println();
		
		// 논리 시프트 연산
		System.out.println("# Logical Right Shift");
		LogicalRightShift.logRightShift();
		System.out.println();
		
		// break를 이용한 다중 반복문 탈출 방법 2가지
		System.out.println("# Escape Nested Loops by break");
		BreakEscapeNestedLoop.breakEscape();
		System.out.println();
		
		// 배열 출력하는 방법 2가지
		System.out.println("# Print Array");
		PrintArray.printArr();
		System.out.println();
		
		// 메인 메소드의 매개변수 입출력
		System.out.println("# Print argument of main method");
		ArgumentOfMainMethod.argumentOfMainMethod(args);
		System.out.println();
		
		// 배열과 String 객체를 수정했을 때 차이점
		System.out.println("# Differnce Modification Of String and Array");
		DifferenceModificationStringArray.diffModifyOfStringArray();
		System.out.println();
		
		// String 객체의 다양한 메소드
		System.out.println("# Methods of String");
		MethodOfString.methodOfString();
		System.out.println();
		
		// 가변길이 매개변수
		System.out.println("# Flexible Size Arugment");
		FlexibleSizeArgument.flexSizeArgs();
		System.out.println();
		
		// 기본 자료형 입력매개변수와 참조 자료형 입력매개변수의 차이
		System.out.println("# Effect of Data Argument");
		EffectOfDataArgument.effectOfDataArg();
		System.out.println();
		
		// 접근지정자에 따른 사용 가능 범위
		System.out.println("# Access Modifer Of Member");
		AccessModifierOfMember.accessModifierOfMember();
		System.out.println();
		
		// 정적 필드
		System.out.println("# Difference Static Field and Instance Field");
		StaticField.staticField01();
		
		/* error syntax
		 * StaticField.staticField02();
		 */
		
		StaticField sF = new StaticField();
		sF.staticField02();
		System.out.println();
		
	}

}
