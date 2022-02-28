

public class CommandB implements Command {
	private ReceiverB receiverB = new ReceiverB();

	@Override
	public void execute() {
		receiverB.processDataB1();
		receiverB.processDataB2();
	}

}
