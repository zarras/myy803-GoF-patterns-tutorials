package choosing_between_subclasses;


public class ConcretePrototypeB implements Prototype {
	private int stateB; 
	
	public ConcretePrototypeB(int configuration) {
		stateB = configuration; 
	}

	public void doWork() {
		// .....
	}
	
	
	public Prototype clone() {
		return new ConcretePrototypeB(stateB);
	}
	
}
