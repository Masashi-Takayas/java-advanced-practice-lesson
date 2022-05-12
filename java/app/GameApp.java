package app;

public abstract class GameApp implements App{

	public String item;
	
	public GameApp() {
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public abstract String play(); // 抽象メソッド

	public String start(String name) {
		return  name+"さんと"+item+"でゲームを開始します。";
	}
}
