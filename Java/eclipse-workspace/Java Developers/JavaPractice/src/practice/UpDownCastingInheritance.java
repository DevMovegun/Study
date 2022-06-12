package practice;

class ParentA {
	
	int m = 3;
	
	void print() {
		System.out.println("A class");
	}
	
	void sum(int k) {
		System.out.println(m + k);
	}
	
}

class ChildB extends ParentA {
	
	int n = 4;
	
	@Override
	void print() { // method overriding
		System.out.println("B class");
	}
	
	void sum(int k, int l) { // method overloading
		System.out.println(m + k + l);
	}
	
}

public class UpDownCastingInheritance {
	public static void upDownCastingInheritance() {
		
		ParentA aa = new ParentA();
		ChildB bb = new ChildB();
		ParentA ab = new ChildB();
		
		System.out.println("1. excute print() method");
		System.out.print("aa.print() : "); aa.print();
		System.out.print("bb.print() : "); bb.print();
		System.out.print("ab.print() : "); ab.print();
		System.out.println();
		
		System.out.println("2. Up casting");
		if(bb instanceof ParentA) {
			
			System.out.println("1) bb -> ParentA up casting : " + (bb instanceof ParentA));
		
			ParentA p = (ParentA) bb;
			p.print();
			p.sum(1);
			System.out.println("p.sum(1, 2); is error syntax");
		
		}
		else {
			System.out.println("1) bb -> ParentA up casting : " + (bb instanceof ParentA));
		}
		System.out.println();
		
		if(ab instanceof ParentA) {
			
			System.out.println("2) ab -> ParentA up casting : " + (ab instanceof ParentA));
		
			ParentA p = (ParentA) ab;
			p.print();
			p.sum(1);
			System.out.println("p.sum(1, 2); is error syntax");
		
		}
		else {
			System.out.println("2) ab -> ParentA up casting : " + (ab instanceof ParentA));
		}
		System.out.println();
		
		System.out.println("3. Down casting");
		if(ab instanceof ChildB) {
			
			System.out.println("1) ab -> ChildB down casting : " + (ab instanceof ChildB));
			
			ChildB c = (ChildB) ab;
			c.print();
			c.sum(1);
			c.sum(1, 2);
	
		}
		else {
			System.out.println("1) ab -> ChildB down casting : " + (ab instanceof ChildB));
		}
		System.out.println();
		
		if(aa instanceof ChildB) {
			
			System.out.println("2) aa -> ChildB down casting : " + (aa instanceof ChildB));
	
			ChildB c = (ChildB) aa;
			c.print();
			c.sum(1);
			c.sum(1, 2);
		
		}
		else {
			System.out.println("2) aa -> ChildB down casting : " + (aa instanceof ChildB));
		}

		System.out.println();
		
	}
}
