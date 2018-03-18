package command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("现在没有命令");
	}

}
