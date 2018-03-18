package command;

public class Stereo {
	public void on(){
		System.out.println("音响打开了");
	}
	public void off(){
		System.out.println("音响关闭了");
	}
	public void setCd(){
		System.out.println("放入CD");
	}
	public void setDvd(){
		System.out.println("放入DVD");
	}
	public void setRadio(){
		System.out.println("放入Radio");
	}
	public void setVolume(int i){
		System.out.println("调整音量");
	}
}
