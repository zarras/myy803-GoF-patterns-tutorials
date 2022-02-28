

import subsystem.A;
import subsystem.B;
import subsystem.C;
import subsystem.Facade;

/*
 * INTENT: 
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * 
 * BENEFITS: 
 * It shields clients from subsystem components, thereby reducing the number
 * of objects that clients deal with and making the subsystem easier to use.
 * 
 * It promotes weak coupling between the subsystem and its clients. Often 
 * the components in a subsystem are strongly coupled. 
 * 
 * Weak coupling lets you vary
 * the components of the subsystem without affecting its clients. Facades help
 * 
 * LIABILITIES
 * One more level of indirection
 */
public class Client {
	Facade facade = new Facade();
	
	public void operation1() {
		// .....
		facade.combineABC();
		// .....
		// .....
	}
	
	public void operation2() {
		facade.combineABC();
	}
	
	public void operation3() {
		// .....
		facade.combineAC();
		// .....
		// .....
	}
}
