package practice;

import java.util.Arrays;

public class MethodOfString {
		static void methodOfString() {		
			
			System.out.println();
			
			String str = "My name is [홍길동]. My age is [29].";
			
			System.out.println("1. indexOf(), lastIndexOf(), substring(), concat()");
			
			//indexOf(), lastIndexOf()
			int nameBeginIdx; int nameEndIdx;
			int ageBeginIdx; int ageEndIdx;
			
			nameBeginIdx = str.indexOf("["); // 11
			nameEndIdx = str.indexOf("]"); // 15
			ageBeginIdx = str.lastIndexOf("["); // 28
			ageEndIdx = str.lastIndexOf("]"); // 31
			
			//substring(), concat()
			String name = new String("name : ");
			String age =  new String("age : ");
			
			name = name.concat(str.substring(nameBeginIdx + 1, nameEndIdx)); // name = "name : 홍길동"
			age = age.concat(str.substring(ageBeginIdx + 1, ageEndIdx)); // age = "age : 29"
			
			String result = name;
			result = name.concat("/");
			result = result.concat(age);
			
			System.out.println(result); // name : 홍길동/age : 29
			System.out.println();
			
			System.out.println("2. toCharArray(), split(), String.join()");
			
			// toCharArray() 문자열 -> char[]
			System.out.println(Arrays.toString(result.toCharArray()));
			// [n, a, m, e,  , :,  , 홍, 길, 동, /, a, g, e,  , :,  , 2, 9]
			
			// split()
			String[] strArr = result.split("/");
			System.out.println(Arrays.toString(strArr)); // [name : 홍길동, age : 29]
			
			// String.join()
			result = String.join(" ", strArr);
			System.out.println(result);
			System.out.println();
			
			System.out.println("3. toLowerCase(), toUpperCase()");
			
			// toLowerCase(), toUpperCase()
			System.out.println(result.toUpperCase()); // NAME : 홍길동 AGE : 29
			System.out.println(result.toLowerCase()); // name : 홍길동 age : 29
			System.out.println();
			
			System.out.println("4. Compare String");
			
			// Compare Memory
			String compStr = new String("name : 홍길동 age : 29");
			System.out.println("compStr : " + "\"" + compStr + "\"");
			System.out.println("result : " + "\"" + result + "\"");
			System.out.println(result == compStr); // false
			
			// equals(), equalsIgnoreCase()
			System.out.println(result.equals(compStr));
			compStr = compStr.toUpperCase();
			System.out.println(result.equals(compStr));
			System.out.println(result.equalsIgnoreCase(compStr));
			System.out.println();
			
			System.out.println("5. replace()");
			
			// replace()
			result = result.replace("name", "이름");
			result = result.replace("age", "나이");
			System.out.println(result); // 이름 : 홍길동 나이 : 29
			
			

			
	}
}
