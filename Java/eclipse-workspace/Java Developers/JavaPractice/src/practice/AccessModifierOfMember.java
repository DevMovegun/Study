package practice;

import accessModifier.pack1.*;
import accessModifier.pack2.*;

public class AccessModifierOfMember {
	public static void accessModifierOfMember () {
		
		MainClass m_C = new MainClass();
		SamePackClass sP_C = new SamePackClass();
		DifferentPackClass dP_C = new DifferentPackClass();
		DifferentPackExtendsMainClass dP_eM_C = new DifferentPackExtendsMainClass();
		
		m_C.print();
		sP_C.print();
		dP_C.print();
		dP_eM_C.print();
		
	}

}
