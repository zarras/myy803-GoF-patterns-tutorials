 package maximal_common_interface;

import java.util.ArrayList;

/*
 * INTENT:
 * This pattern allows treating individual objects and compositions of objects uniformly.
 * Component provides a uniform set of methods with default implementations. 
 * Primitive and Composite extend this class and override the appropriate methods.
 * The client (Composite) handles a uniform list of objects without worrying about their type. It calls 
 * the same methods; the Primitive objects execute the default method implementation that 
 * do nothing!     
 * 
 * BENEFITS:
 * The Primitive and Composite objects are treated uniformly because they provide a common interface.
 * The code of Composite is simpler 
 *
 * Easier to add new kinds of components. Newly defined Composite or Primitive subclasses work automatically 
 * with existing structures and client code. Clients don't have to be changed for new Component classes. 
 * 
*
 * LIABILITIES: 
 * Can make the design overly general. This could be risky in some cases...
 * 
 * The disadvantage of making it easy to add new components is that it makes it 
 * harder to restrict the components of a composite. Sometimes you want a 
 * composite to have only certain components. With this pattern, you can't rely on the 
 * type system to enforce those constraints for you. You'll have to use run-time 
 * checks instead.
 */
public class Composite extends Component {
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
		components.add(component);
		for(Component compo : components)
			compo.addRecursivelly(component);
	}
}
