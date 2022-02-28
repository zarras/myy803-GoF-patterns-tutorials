package dynamic_loading_prototypes;


public class Prototype {
	private String state; 
	
	public Prototype(String configuration) {
		state = configuration; 
	}

	public void changeState(String newState) {
		// .....
	}
	
	/*
	 * Deep vs shallow copy has to do with how we handle references to other constituent objects
	 * see below in the case of String state
	 * 
	 * In deep copy the referenced constituent objects are also cloned
	 * So the clone and the original refer to different constituent objects 
	 * 
	 * In shallow copy the referenced constituent objects are NOT cloned
	 * Hence, the clone and the original refer to the same constituent objects 
	 * 
	 */
	public Prototype clone() {
		/*
		 *  Deep copy: 
		 *  clone() creates copies of the objects that are 
		 *  referenced by the Prototype object
		 */
		
		return new Prototype(
				new String(this.state)
				);
	}
	
	public Prototype cloneShallow() {
		/*
		 *  Shallow copy: 
		 *  clone() referenced objects are not copied 
		 */
		
		return new Prototype(this.state);
	}
}
