package practice;

import java.util.Arrays;

class Argument {
	
	void modifyInt(int m) {
		m = 8;
		System.out.println("This is m in modifyInt() : " + m); // 8
	}
	
	void modifyArr(int[] n) {
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
		System.out.println("This is m in modifyArr() : " + Arrays.toString(n)); // [4, 5, 6]
	}
	
	void modifyStr(String k) {
		k = "Hi";
		System.out.println("This is m in modifyString() : " + k); // Hi
	}
	
}

public class EffectOfDataArgument {
	
	public static void effectOfDataArg() {
		
		Argument arg = new Argument();
		
		int m = 5;
		int[] n = {1, 2, 3};
		String k = "Hello";
		
		arg.modifyInt(m);
		System.out.println("This is m in effectOfDataArg() : " + m); // 5
		System.out.println();
		
		arg.modifyArr(n);
		System.out.println("This is n in effectOfDataArg() : " + Arrays.toString(n)); // [4, 5, 6]
		System.out.println();
		
		arg.modifyStr(k);
		System.out.println("This is k in effectOfDataArg() : " + k); // Hello
		
	}

}
