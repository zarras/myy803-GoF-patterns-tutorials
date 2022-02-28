

public class DecoratorC extends Decorator {
	private String addedStateC;

	public DecoratorC(Component component, String addedStateC) {
		super(component);
		this.addedStateC = addedStateC;
	}
	
	@Override
	public void operation() {
		// does some additional work with addedStateC
		// and calls operation() on decorated object
		addedStateC.split(" \t");
		// ....
		// ....
		super.operation();
	}

}
