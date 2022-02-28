

public class Main {

	public static void main(String[] args) {
		AbstractClass algorithm = Factory.create(args[0]);
		algorithm.templateMethod();
	}

}
