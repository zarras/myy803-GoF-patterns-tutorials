package minimal_common_interface;

import java.util.ArrayList;


/*
 * A common interface that defines the operations that 
 * are common in Primitive and Composite lets the Composite 
 * class treat them uniformly and simplifies the class
 * 
 * PROBLEMS:
 * Despite the use of the Component interface that defines
 * common methods for Primitive and Composite the Composite should still 
 * treat Primitive and Composite differently so as to perform some operations (addToAll, filterOut) 
 * that are supported only by Composite objects
 * 
 */

// explain that we have one list/add/remove instead of 2, a simpler operation

public class Composite implements Component {
	private ArrayList<Component> components = new ArrayList<Component>();
	
	public void operation() {
		for(Component component : components)
			component.operation();
	}
	
	public void add(Component component) {
		components.add(component);
	}
	
	public Component getComponent(int index) {
		return components.get(index);
	}
	
	public void addRecursivelly(Component component){
		add(component);
		for(Component compo : components)
			if(compo instanceof Composite)
				((Composite)compo).addRecursivelly(component);
	}
}
