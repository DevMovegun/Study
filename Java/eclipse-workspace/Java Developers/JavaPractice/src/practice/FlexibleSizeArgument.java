package practice;

public class FlexibleSizeArgument {
	public static void flexSizeArgs() {		
		
		System.out.println("1. methodInt(int...values)");
		methodInt(1,2);
		methodInt(1,2,3);
		methodInt();
		System.out.println();
		
		System.out.println("2. methodString(String...values)");
		methodString("안녕", "방가");
		methodString("땡큐", "베리", "감사");
		methodString();
	}	
	
	public static void methodInt(int...values) {
		
		System.out.println("배열의 길이: " + values.length);
		
		for(int k: values) {
			System.out.print(k + " ");
		}
		
		System.out.println();		
	}	
	
	public static void methodString(String...values) {
		
		System.out.println("배열의 길이: " + values.length);
		
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		
		System.out.println();		
	}
}
