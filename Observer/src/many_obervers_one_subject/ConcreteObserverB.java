package many_obervers_one_subject;

public class ConcreteObserverB implements Observer {
	private Subject subject;

	public ConcreteObserverB(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void update() {
		subject.getState();
		// do stuff with state based on ConcreteObserverB functionality		
	}

}
