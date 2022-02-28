

public class Factory {
	public static AbstractClass create (String choice) {
		if(choice.equals("A"))
			return new ConcreteClassA();
		else
			return new ConcreteClassB();
	}
}
