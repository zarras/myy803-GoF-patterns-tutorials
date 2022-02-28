
public class CommandA implements Command {
	private ReceiverA receiverA = new ReceiverA();
	
	@Override
	public void execute() {
		receiverA.doWorkA1();
		receiverA.doWorkA2();
		receiverA.doWorkA3();
	}

}
