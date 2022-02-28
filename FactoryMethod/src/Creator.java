/*
 * INTENT:
 * Make the Creator abstract and let its subclasses decide 
 * which kind of concrete Product objects to create
 * 
 * BENEFITS:
 * The creation logic is separated from the Creator's main logic.
 * 
 * To change the concrete Product class that is used by the Creator the 
 * developer does not have to change the Creator class
 * 
 * Also, to add new concrete Product classes the developer does not have to 
 * mess with the Creator's logic. He just has to ADD new 
 * code.
 *
 * LIABILITIES: 
 * Many small subclasses.
 * 
 */
public abstract class Creator {
	
	public void manageProductLine() {
		
		// .....
		// .....
				
		Product currentProduct1 = factoryMethod();
				
		// .....
		// .....
				
		Product currentProduct2 = factoryMethod();
				
		// ....
		// ....
				
		Product currentProduct3 = factoryMethod();
				
		// ....
		// ....
		
	}
	
	protected abstract Product factoryMethod();
}
