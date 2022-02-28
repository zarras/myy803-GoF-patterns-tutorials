

/*
 * INTENT: 
 * Ensure a class only has one instance, and provide a global point of access to it.
 * 
 * BENEFITS:
 * Use the Singleton pattern when there must be exactly one instance of a class, 
 * and it must be accessible to clients from a well-known access point.
 * 
 * LIABILITIES:
 * Difficult to fake a singleton object if needed for testing purposes
 * 
 */
// Singleton.getInstance();
public class Singleton {
	private static Singleton singleInstance = null;
	
	private String singletonData;
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		if(singleInstance == null)
			singleInstance = new Singleton();
		return singleInstance;
	}
	
	public void setSingletonData(String data){
		singletonData = data;
	}
	
	public String getSingletonData() {
		return singletonData;
	}
}
