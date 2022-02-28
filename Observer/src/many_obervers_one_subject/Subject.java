package many_obervers_one_subject;

import java.util.ArrayList;

/*
 * INTENT: 
 * Define a general interaction protocol to realize the one-to-many dependency between 
 * objects so that when one object changes state, all its dependents are notified and 
 * updated automatically.
 * 
 * 
 * BENEFITS: 
 * 
 * The Observer pattern lets you vary subjects and observers independently. You can
 * reuse subjects without reusing their observers, and vice versa. It lets you add 
 * observers without modifying the subject or other observers.
 * 
 * Use the Observer pattern in any of the following situations:
 * 
 * When an abstraction has two aspects, one dependent on the other.
 * Encapsulating these aspects in separate objects lets you vary and
 * reuse them independently.
 * 
 * When a change to one object requires changing others, and you don't know how many 
 * objects need to be changed.
 * 
 * When an object should be able to notify other objects without making 
 * assumptions about who these objects are. In other words, you don't want these 
 * objects tightly coupled.
 * 
 * LIABILITIES
 * 
 * Unexpected/useless updates.
 * A seemingly innocuous operation on the subject may cause a cascade of updates to 
 * observers and their dependent objects. This problem is aggravated by the fact that 
 * the simple update protocol provides no details on what changed in the subject. Without 
 * additional protocol to help observers discover what changed, they maybe forced to 
 * work hard to deduce the changes.
 */
public class Subject {
	private String state = new String("");
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void changeState(String newState) {
		state = newState;
		notifyObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	private void notifyObservers() {
		for(Observer observer : observers)
			observer.update();
	}

	public String getState() {
		return state;		
	}
}
