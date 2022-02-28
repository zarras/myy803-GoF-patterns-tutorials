package choosing_between_subclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcretePrototypeA implements Prototype {
	private String stateA; 
	
	public ConcretePrototypeA(String configuration) {
		stateA = configuration; 
	}

	public void doWork() {
		// .....
	}
	
	// deep copy
	public Prototype clone() {
		return new ConcretePrototypeA(
					new String(this.stateA)
				);
		// new ConcretePrototypeA(stateA);
	}

//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		ActionListener copie = (ActionListener) this.clone();
//		//replayManager.add(copie); 
//	}
	
}
