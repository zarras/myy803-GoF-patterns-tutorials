package many_obervers_one_subject;

public class ConcreteObserverA implements Observer {
	private Subject subject;
	
	public ConcreteObserverA(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void update() {
		subject.getState();
		// do stuff with state based on ConcreteObserverA functionality
	}

}
