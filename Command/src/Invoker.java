

import java.util.HashMap;

/* INTENT:
 * Encapsulate a command as an object, thereby letting you parameterize 
 * invoker with different commands, queue or log requests, and support undoable operations.
 * 
 * BENEFITS:
 * 
 * Command decouples the object that invokes the operation from the 
 * one that knows how to perform it and reduces complexity.
 * 
 * Commands are first-class objects. They can be manipulated and extended 
 * like any other object.
 * 
 * We can assemble commands into a composite command. 
 * 
 * It's easy to add new Commands, because you don't have to change existing classes.
 * 
 * LIABILITIES: 
 *
 * many small classes
*/

public class Invoker {
	private HashMap<String, Command> commands = new HashMap<String, Command>();
	
	public void addCommand(String commandKey, Command command){
		commands.put(commandKey, command);
	}
	
	public void issueCommand(String commandKey) {
		commands.get(commandKey).execute();
	}
}
