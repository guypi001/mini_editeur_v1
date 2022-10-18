package commands;

public class Invoker {

	public void invoke(Command c) {
        execute(c);
    }
	
	private void execute(Command c) {
        c.execute();
    }
}
