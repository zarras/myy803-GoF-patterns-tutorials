public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		invoker.addCommand("CommandA", new CommandA());
		invoker.addCommand("CommandB", new CommandB());

		invoker.issueCommand("CommandA");
		invoker.issueCommand("CommandB");
	}
}
