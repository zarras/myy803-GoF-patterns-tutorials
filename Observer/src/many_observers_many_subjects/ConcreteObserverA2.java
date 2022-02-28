package many_observers_many_subjects;

public class ConcreteObserverA2 implements Observer {
	private ConcreteSubjectA subjectA;
	
	public ConcreteObserverA2(ConcreteSubjectA subjectA) {
		this.subjectA = subjectA;
		subjectA.attach(this);
	}
	
	public void update() {
		subjectA.getState();
		// do stuff with state based on ConcreteObserverA functionality
	}

}
