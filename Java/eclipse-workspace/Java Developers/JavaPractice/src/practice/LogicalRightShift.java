package practice;

public class LogicalRightShift {
	static void logRightShift() {
		
		int flag = 0b1011011; // 6th5th4th3rd2nd1st0th
		
		System.out.println((flag >>> 0) & 1); // 0th number
		System.out.println((flag >>> 1) & 1); // 1st number
		System.out.println((flag >>> 2) & 1); // 2nd number
		System.out.println((flag >>> 3) & 1); // 3rd number
		System.out.println((flag >>> 4) & 1); // 4th number
		System.out.println((flag >>> 5) & 1); // 5th number
		System.out.println((flag >>> 6) & 1); // 6th number
		
	}

}
