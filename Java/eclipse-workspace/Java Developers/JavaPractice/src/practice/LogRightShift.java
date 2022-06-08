package practice;

public class LogRightShift {
	static void logRightShift() {
		
		int flag = 0b1011011;
		
		System.out.println((flag >>> 0) & 1);
		System.out.println((flag >>> 1) & 1);
		System.out.println((flag >>> 2) & 1);
		System.out.println((flag >>> 3) & 1);
		System.out.println((flag >>> 4) & 1);
		System.out.println((flag >>> 5) & 1);
		System.out.println((flag >>> 6) & 1);
		
	}

}
