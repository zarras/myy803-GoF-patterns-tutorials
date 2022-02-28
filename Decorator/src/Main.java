
public class Main {

	public static void main(String[] args) {
		Component a = new ConcreteComponentA();
		Component b = new ConcreteComponentB();
		
		Decorator ca = new DecoratorC(a, "ca");
		ca.operation();

		Decorator da = new DecoratorD(a);
		da.operation();
		
		Decorator cda = new DecoratorC(da, "cda");
		cda.operation();
		
		Decorator cb = new DecoratorC(b, "cb");
		
		cb.operation();

	}

}
