package accessModifier.pack1;

import accessModifier.pack1.MainClass;

public class SamePackClass {
	
	public void print() {
		
		MainClass a = new MainClass();
		
		System.out.println("In SamePackClass");
		System.out.println("public a : " + a.a);
		System.out.println("protected b : " + a.b);
		System.out.println("default c : " + a.c);
		
		// System.out.println("private d : " + a.d); ==> error syntax
		System.out.println("Can not use private d");
		System.out.println();
		
	}

}
