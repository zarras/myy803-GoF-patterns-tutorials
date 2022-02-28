package many_observers_many_subjects;

public class ConcreteObserverB2 implements Observer {
	private ConcreteSubjectB subjectB;
	
	public ConcreteObserverB2(ConcreteSubjectB subjectB) {
		this.subjectB = subjectB;
		subjectB.attach(this);
	}	
	
	public void update() {
		subjectB.getState();
		// do stuff with state based on ConcreteObserverB functionality		
	}

}
