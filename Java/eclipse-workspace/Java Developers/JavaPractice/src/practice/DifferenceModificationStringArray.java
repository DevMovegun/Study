package practice;

import java.util.Arrays; // Use Arrays class

public class DifferenceModificationStringArray {
	static void diffModifyOfStringArray() {		
		
		System.out.println("1. modify String");
		
		String str1 = new String("Hi");
		String str2 = str1;
		str1="Hello";
		
		System.out.println(str1); // Hello
		System.out.println(str2); // Hi
		System.out.println();
		
		System.out.println("2. modify Array");
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1)); //[6, 7, 8]
		System.out.println(Arrays.toString(array2)); //[6, 7, 8]
	}
}
