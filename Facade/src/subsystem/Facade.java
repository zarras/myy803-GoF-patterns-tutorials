package subsystem;


public class Facade {
	// ....
	public void combineABC() {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.ma1();
		b.mb2();
		c.mc3();
	}

	public void combineAC() {
		A a = new A();
		C c = new C();
		
		a.ma2();
		c.mc1();		
	}
	// ....
}
