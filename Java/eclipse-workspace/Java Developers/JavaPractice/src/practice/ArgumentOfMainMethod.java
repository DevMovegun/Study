package practice;

public class ArgumentOfMainMethod {
	static void argumentOfMainMethod(String[] args) {	
		
		// Main Method에 매개변수 입력 방법
		/*
		 * - eclipse
		 * Run -> Run Configuration
		 * -> 입력하고 싶은 project의 이름을 선택 -> [(x)=Arguments]에 입력
		 * 입력하는 매개변수는 공백(space)를 기준으로 구분됨.
		 * 현재 이 프로젝트에서는 abc 13 12.3 a 를 입력함.
		 */
		
		// Main Method의 매개변수 출력
		System.out.println("\n1. basic print");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();		
		
		//#3. 매개변수 출력 2
		System.out.println("\n2. Use for-each statement");
		for(String s : args) {
			System.out.print(s + " ");
		}
		System.out.println();		
	}

}
