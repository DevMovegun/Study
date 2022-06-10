package practice;

public class RefDataType {
	public static void refDataType() {
		
		System.out.println();
		
		// 참조 자료형 등가 비교
		String str1 = "HI";
		String str2 = "HI";
		System.out.println(str1 == str2); // true		  
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");		
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true
		
	}

}
