package many_observers_many_subjects;

public class ConcreteObserverB implements Observer {
	private ConcreteSubjectB subjectB;
	
	public ConcreteObserverB(ConcreteSubjectB subjectB) {
		this.subjectB = subjectB;
		subjectB.attach(this);
	}
	
	public void update() {
		subjectB.getState();
		// do stuff with state based on ConcreteObserverB functionality		
	}

}
