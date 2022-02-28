package choosing_between_subclasses;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Prototype> protos = new HashMap<String, Prototype>();
		protos.put("ConretePrototypeA", new ConcretePrototypeA("state value"));
		protos.put("ConretePrototypeB", new ConcretePrototypeB(123));

		Client c = new Client(protos);
		
		c.doSomething("ConretePrototypeA");
		
		c.doSomething("ConretePrototypeB");

	}

}
