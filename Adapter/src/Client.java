

/*
 * CONTEXT: 
 * Client collaborates with objects that provide the Target interface
 * As an alternative, we want to reuse a pre-existing class Adaptee.
 * However, Adaptee does not provide the interface that is expected by Client
 * 
 * PROBLEMS: 
 * To reuse Adaptee we have to change the code of the Client. 
 * 
 * Coupling will increase 
 * 
 * Complexity will increase
 * 
 * Is there an elegant way to reuse Adaptee w/o making Client more complex and dirty ?
 * 
 */
public class Client {
	private int data;

	public void doWork(Target targetObject) {
		// .....
		targetObject.request(data);
		// .....
	}
}
