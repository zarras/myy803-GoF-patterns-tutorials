package minimal_common_interface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Primitive p1 = new Primitive();
		Primitive p2 = new Primitive();
		Primitive p3 = new Primitive();
		Primitive p4 = new Primitive();
		Primitive p5 = new Primitive();
		Primitive p6 = new Primitive();

		Composite c1 = new Composite();
		c1.add(p1);
		c1.add(p2);
		
		
		Composite c2 = new Composite();
		c1.add(p1);
		c1.add(p3);
		c1.add(p4);
		c2.add(c1);
	
		c1.operation();
		c2.operation();
		c2.addRecursivelly(p5);
		c2.addRecursivelly(p6);
	}

}
