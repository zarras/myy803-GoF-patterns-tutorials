

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
 * Num. of objects used in the application does not increase
 * ClassAdapter can also override the Adaptee behavior  

 *
 * LIABILITIES: 
 * A single ClassAdapter cannot work with the Adaptee itself and all of its subclasses (if any). 
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request(int data) {
		String adaptedData = new Integer(data).toString();
		super.specificRequest(adaptedData);
	}

}
