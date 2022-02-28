

public class Main {
	public static void main(String[] args) {
			Context c = new Context();
			c.configureContext(new StrategyA());
			c.doWork();
			c.configureContext(new StrategyB());
			c.doWork();
		}
}

