
public class DecoratorD extends Decorator {
	
	public DecoratorD(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		addedOperation();
		super.operation();
	}
	
	private void addedOperation() {
		// ....
		// ....
	}

}
