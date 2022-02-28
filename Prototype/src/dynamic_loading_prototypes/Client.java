package dynamic_loading_prototypes;


/*
 * 
 * INTENT: 
 * for each different initial state/configuration create once and for all 
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
	PrototypeManager manager = new PrototypeManager();
	
	public void doWork(String prototypeID) {
		Prototype copie = manager.getPrototype(prototypeID);
		// ..............
		// ..............
		// ..............
	}
}
