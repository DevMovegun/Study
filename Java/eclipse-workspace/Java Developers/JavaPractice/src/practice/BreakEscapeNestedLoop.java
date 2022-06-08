package practice;

public class BreakEscapeNestedLoop {
	static void breakEscape () {
		
		System.out.println("1. variable i, outer loop variable, sets a large number.");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j == 2) {
					i = 100; // sets a large number
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		// break + Label을 이용한 다중 반복문 한번에 탈출
		System.out.println("2. Use break + Label");
		LABEL: // anything name
			for(int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(j == 2) {
						break LABEL;
					}
					System.out.println(i + ", " + j);
				}
			}
		System.out.println("same continue keyword");
	}

}
