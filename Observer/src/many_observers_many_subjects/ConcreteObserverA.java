package many_observers_many_subjects;

import many_obervers_one_subject.Subject;

public class ConcreteObserverA implements Observer {
	private ConcreteSubjectA subjectA;
		
	public ConcreteObserverA(ConcreteSubjectA subjectA) {
		this.subjectA = subjectA;
		subjectA.attach(this);
	}
	
	public void update() {
		subjectA.getState();
		// do stuff with state based on ConcreteObserverA functionality
	}

}
