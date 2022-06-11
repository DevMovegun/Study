package accessModifier.pack2;

import accessModifier.pack1.MainClass;

public class DifferentPackClass {

	public void print() {
		
		MainClass a = new MainClass();
		
		System.out.println("In DifferentPackClass");
		System.out.println("public a : " + a.a);
		
		/* error syntax
		 * System.out.println("protected b : " + a.b);
		 * System.out.println("default c : " + a.c);
		 * System.out.println("private d : " + a.d);
		 */
		System.out.println("Can not use protected b");
		System.out.println("Can not use default c");
		System.out.println("Can not use private d");
		
		System.out.println();
		
	}
}
