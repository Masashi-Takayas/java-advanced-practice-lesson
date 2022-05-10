package app;

public class GameApp {

	public String item;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String start(String name) {
		return  name+"さんと"+item+"でゲームを開始します";
		
	}
}
