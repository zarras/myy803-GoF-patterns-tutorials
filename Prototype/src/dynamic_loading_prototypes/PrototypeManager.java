package dynamic_loading_prototypes;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class PrototypeManager {
	private static final int ID = 0;
	private static final int STATE = 1;
	
	HashMap <String, Prototype> map = new HashMap <String, Prototype>();
	
	public PrototypeManager() {
		dynamicallyLoadPrototypes("prototype-specs.txt");
	}
	
	public void dynamicallyLoadPrototypes(String prototypeSpecsFileName) {
		try {
			BufferedReader prototypeSpecsReader = new BufferedReader(
					new FileReader (prototypeSpecsFileName)
					);
			
			String currrentSpec;
			while ((currrentSpec = prototypeSpecsReader.readLine()) != null) {
				String keyStateConfigPair[] = currrentSpec.split(" ");
				map.put(
						keyStateConfigPair[ID],
						new Prototype(keyStateConfigPair[STATE])
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Prototype getPrototype(String prototypeID) {
		Prototype proto = map.get(prototypeID);
		// A clone of the Prototype object is created and returned to the Client 
		return proto.clone();
	}

}
