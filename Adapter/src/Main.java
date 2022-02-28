

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		
		Target target = new TargetImplementation();
		client.doWork(target);

		Target objectAdapter = new ObjectAdapter(new Adaptee());
		client.doWork(objectAdapter);
		
		Target classAdapter = new ClassAdapter();
		client.doWork(classAdapter);
		
	}

}
