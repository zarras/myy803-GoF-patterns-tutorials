

/*
 * INTENT:
 * Convert the interface of a class into another interface clients expect. Adapter
 * lets classes work together that couldn't otherwise because of incompatible
 * interfaces.
 * 
 * BENEFITS:
 * To reuse Adaptee we dont have to change the code of the Client. 
 * Coupling and complexity of the Client remain the same
 * 
 * A single ObjectAdapter can work with the Adaptee itself and all of its subclasses (if any). 
 *
 * LIABILITIES: 
 * Num. of objects used in the application increases
 */
public class ObjectAdapter implements Target {
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request(int data) {
		String adaptedData = new Integer(data).toString();
		adaptee.specificRequest(adaptedData);
	}

}
