package practice;

import java.util.Arrays; // Use Arrays

public class PrintArray {
	static void printArr() {
		
		// 1차원 배열 초기값 셋팅
		int[] arr1Dim = new int[10];
		for(int i = 0; i < arr1Dim.length; i++) {
			arr1Dim[i] = i;
		}
		System.out.println("\n1. 1 Dimension array\n");
		
		// for-each문 활용
		System.out.println("1) Use for-each statement");
		for(int k : arr1Dim) {
			
			System.out.print(k + " ");
			
			if(k == 9)
				System.out.println();
		}
		System.out.println();
		
		// Arrays.toString(array) 활용
		System.out.println("2) Use Arrays.toString(array)");
		System.out.println(Arrays.toString(arr1Dim));
		
		// 2차원 배열 초기값 셋팅
		int[][] arr2Dim = new int[][] {{1, 2}, {3, 4, 5}};
		
		System.out.println("\n2. 2 dimension array");
		
		// 기본 출력
		System.out.println("\n1) basic print");
		for(int i = 0; i < arr2Dim.length; i++) {
			
			for(int j = 0; j < arr2Dim[i].length; j++)
				System.out.print(arr2Dim[i][j] + " ");
			
			System.out.println();
		}
		System.out.println();
		
		// Arrays.toString(array) 활용
		System.out.println("2) Use Arrays.toString(array[n])");
		for(int i = 0; i < arr2Dim.length; i++) {
			System.out.println(Arrays.toString(arr2Dim[i]));
		}
		System.out.println();
		
		// for-each문 활용
		System.out.println("3) Use for-each statement");
		for(int[] row : arr2Dim) {
			for(int col : row)
				System.out.print(col + " ");
			System.out.println();
		}
		
	}

}
