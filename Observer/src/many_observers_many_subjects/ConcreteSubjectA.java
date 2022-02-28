package many_observers_many_subjects;

public class ConcreteSubjectA extends Subject {
	private String stateA;
	
	public void changeState(String newState) {
		stateA = newState;
		notifyObservers();
	}
	
	public String getState() {
		return stateA;		
	}
}
