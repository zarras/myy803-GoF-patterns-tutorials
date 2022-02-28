package choosing_between_subclasses;

import java.util.HashMap;

/*
 * 
 * INTENT: 
 * for each different class create once and for all 
 * a prototypical Prototype object.
 * 
 * Create new objects by making copies of the prototypical instances.
 * 
 * Have a PrototypeManager that manages a Map of prototypes
 * 
 * BENEFITS:
 * The creation logic is separated from the Client.
 * The complex creation conditional logic is now hidden behind the map
 * The map can be dynamically populated with new Prototype objects
 *
 * LIABILITIES: 
 * the implementation of the clone method is not always easy 
 * (deep vs shallow copies, circular references, ...)
 * 
 */
public class Client {	
	private HashMap<String, Prototype> protos;
	
	public Client(HashMap<String, Prototype> protos) {
		this.protos = protos;
	}
	
	public void doSomething(String prototypeID) {
		Prototype copie = protos.get(prototypeID).clone();
		// ..............
		// ..............
		copie.doWork();
		// ..............
	}
}
