
/*
 * INTENT:
 * Attach additional responsibilities to an object dynamically. 
 * Decorators provide a flexible alternative to sub-classing for extending 
 * functionality, based on aggregation. 
 * 
 * BENEFITS:
 * 
 * More flexibility than static inheritance. The Decorator pattern provides a more flexible 
 * way to add responsibilities to objects than can be had with static (multiple) inheritance. 
 * 
 * With decorators, responsibilities can be added and removed at run-time simply by attaching 
 * and detaching them. 
 * 
 * In contrast, inheritance requires creating a new class for each additional responsibility 
 * This gives rise to many classes and increases the complexity of a system. 
 * 
 * Avoids feature-laden classes high up in the hierarchy. Decorator offers
 * a pay-as-you-go approach to adding responsibilities. Instead of trying to 
 * support all foreseeable features in a complex, customizable class, you can
 * define a simple class and add functionality incrementally with Decorator
 * objects. Functionality can be composed from simple pieces. As a result,
 * an application needn't pay for features it doesn't use. It's also easy to 
 * define new kinds of Decorators independently from the classes of objects 
 * they extend, even for unforeseen extensions. Extending a complex class tends
 * to expose details unrelated to the responsibilities you're adding.
 * 
 * LIABILITIES: 
 * Lots of little objects. A design that uses Decorator often results in systems
 * composed of lots of little objects that all look alike. The objects differ
 * only in the way they are interconnected, not in their class or in the value
 * of their variables. Although these systems are easy to customize by those
 * who understand them, they can be hard to learn and debug.
 */
public class Decorator implements Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}
}
