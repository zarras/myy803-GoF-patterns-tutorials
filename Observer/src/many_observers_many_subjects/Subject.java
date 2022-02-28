package many_observers_many_subjects;

import java.util.ArrayList;

/*
 * MANY SUBJECTS WITH MANY OBSERVERS SITUATION
 */
public class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	protected void notifyObservers() {
		for(Observer observer : observers)
			observer.update();
	}
}
