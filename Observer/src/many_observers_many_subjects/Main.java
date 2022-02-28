package many_observers_many_subjects;

public class Main {

	public static void main(String[] args) {
		ConcreteSubjectA subjectA = new ConcreteSubjectA();
		ConcreteSubjectB subjectB = new ConcreteSubjectB();

		
		Observer o1 = new ConcreteObserverA(subjectA);
		Observer o2 = new ConcreteObserverB(subjectB);
		Observer o3 = new ConcreteObserverB(subjectB);
	

		subjectA.changeState("new state");
	}

}
