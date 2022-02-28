

/*
 * INTENT: 
 * Define the skeleton of an algorithm in an operation, deferring some steps to 
 * subclasses. Template Method lets subclasses redefine certain steps of an algorithm, 
 * without changing the algorithm's structure.
 * 
 * BENEFITS: 
 * Template methods are a fundamental technique for code reuse. They are particularly 
 * important in class libraries, because they are the means for factoring out common 
 * behavior in library classes.
 * 
 * LIABILITIES:
 * 
 */
public abstract class AbstractClass {
	
	public void templateMethod() {
		// .....
		primitiveMethod1();
		
		primitiveMethod2();

		primitiveMethod3();
		
		primitiveMethod4();
		
		// .....
	}

	private void primitiveMethod1() {
		// this step is common for all algorithm variants
		// .....	
	}

	private void primitiveMethod3() {
		// this step is common for all algorithm variants
		// .....		
	}
	
	protected abstract void primitiveMethod2();

	protected abstract void primitiveMethod4();
}
