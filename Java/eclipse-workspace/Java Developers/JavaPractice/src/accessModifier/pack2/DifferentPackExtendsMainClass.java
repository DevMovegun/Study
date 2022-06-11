package accessModifier.pack2;

import accessModifier.pack1.MainClass;

public class DifferentPackExtendsMainClass extends MainClass {
	
	public void print() {
		
		System.out.println("In DifferentPackExtendsMainClass");
		System.out.println("public a : " + a);
		System.out.println("protected b : " + b);
		
		// error syntax
		// System.out.println("default c : " + c);
		// System.out.println("private d : " + d);
		System.out.println("Can not use default c");
		System.out.println("Can not use private d");
		
		System.out.println();
		
	}

}
