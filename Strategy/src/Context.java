

/*
 * INTENT:
 * Define a family of algorithms, encapsulate each one in its own class, and make them interchangeable. 
 * 
 * BENEFITS:
 * 
 * Strategies eliminate conditional statements.The Strategy pattern offers 
 * an alternative to conditional statements for selecting desired behavior.
 * When different behaviors are lumped into one class, it's hard to avoid using
 * conditional statements to select the right behavior. Encapsulating the
 * behavior in separate Strategy classes eliminates these conditional
 * statements.
 * 
 * Strategy lets the algorithm vary independently from the Context that use it.
 *
 * LIABILITIES: 
 * Communication overhead between Strategy and Context.
 * 
 * The Strategy interface
 * is shared by all concrete classes that implement it whether the algorithms they 
 * implement are trivial or complex. Hence it's likely that some concrete strategies 
 * won't use all the information passed to them through this
 * interface.
 *  
 * Increased number of objects.Strategies increase the number of objects in
 * an application.
 */

public class Context {
	private Strategy strategy;
	
	public void configureContext(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void doWork() {
		// .....
		// .....
		strategy.executeAlgorithm();
		// .....
		// .....
	}
}
