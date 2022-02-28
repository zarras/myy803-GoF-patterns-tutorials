package many_obervers_one_subject;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer o1 = new ConcreteObserverA(subject);
		Observer o2 = new ConcreteObserverB(subject);
		Observer o3 = new ConcreteObserverB(subject);

		subject.changeState("new state");
	}

}
