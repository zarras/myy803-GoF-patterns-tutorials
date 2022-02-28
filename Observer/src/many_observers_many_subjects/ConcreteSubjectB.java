package many_observers_many_subjects;

public class ConcreteSubjectB extends Subject {
	private int stateB;
	
	public void changeState(int newState) {
		stateB = newState;
		notifyObservers();
	}
	
	public int getState() {
		return stateB;		
	}
}
