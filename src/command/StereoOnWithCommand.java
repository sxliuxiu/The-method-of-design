package command;

public class StereoOnWithCommand implements Command {
	Stereo stereo;

	public StereoOnWithCommand(Stereo stereo) {
		this.stereo = stereo;
	}



	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
