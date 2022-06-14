package practice;

import java.util.HashMap;

class ObjectA { // not override toString()
	
	int a = 1;
	int b = 2;
	
}

class ObjectB { // override toString()
	
	int a = 1;
	int b = 2;
	String string;
	
	@Override
	public String toString() {
		return "a = " + a + ", b = " + b;
	}
	
}

class ObjectC { // override equals(), toString() and not override hashCode()
	
	String name;
	
	ObjectC(String str) {
		this.name = str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjectC) {
			if (this.name == ((ObjectC) obj).name) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

class ObjectD { // override equals(), toString(), hashCode()
	
	String name;
	
	ObjectD(String str) {
		this.name = str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjectD) {
			if (this.name == ((ObjectD) obj).name) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {		
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}

public class ObjectClass {
	public static void objectClass() {
		
		System.out.println("1. Object.toString()");
		ObjectA a = new ObjectA();
		System.out.println(a);
		System.out.println();
		
		ObjectB b = new ObjectB();
		System.out.println(b);
		System.out.println();
		
		System.out.println("2. Object.eqauls()");
		ObjectC c1 = new ObjectC("Hi");
		ObjectC c2 = new ObjectC("Hi");
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println();
		
		System.out.println("3. Object.hashCode()");
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "Data1");
		hm1.put(1, "Data2");
		hm1.put(2, "Data3");
		System.out.println(hm1);
		
		HashMap<ObjectC, String> hm2 = new HashMap<>();
		hm2.put(new ObjectC("First"), "Data1");
		hm2.put(new ObjectC("First"), "Data2"); /* Object.hashCode()는 객체의 위치값만 비교하므로 
		 Data1이 들어간 객체와, Data2가 들어간 객체는 서로 다른 객체로 판단함 */
		hm2.put(new ObjectC("Second"), "Data3");
		System.out.println(hm2);
		
		HashMap<ObjectD, String> hm3 = new HashMap<>();
		hm3.put(new ObjectD("First"), "Data1");
		hm3.put(new ObjectD("First"), "Data2"); /* Overriding한 ObjectD.hashCode()는 객체의 위치값만 비교하므로 
		 Data1이 들어간 객체와, Data2가 들어간 객체는 서로 같은 객체로 판단함 */
		hm3.put(new ObjectD("Second"), "Data3");
		System.out.println(hm3);
	}

}
