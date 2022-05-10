package app;

public class CardGameApp extends GameApp{

	
	public CardGameApp() {
		
	}
	
	public CardGameApp(String item) {
	}
	
	public String start(String name) {
		
		return name+"さんと"+item+"でゲームを開始します。ババ抜きを行います。";
	}

}
