package accessModifier.pack1;

public class MainClass {
	
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	public void print() {
		
		System.out.println("In MainClass");
		System.out.println("public a : " + a);
		System.out.println("protected b : " + b);
		System.out.println("default c : " + c);
		System.out.println("private d : " + d);
		System.out.println();
	}

}
