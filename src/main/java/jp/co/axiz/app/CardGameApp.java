package jp.co.axiz.app;

public class CardGameApp extends GameApp{


	public CardGameApp() {
		super();
	}

	public CardGameApp(String item) {
		super(item);
		setPlayTime(5);
	}

	protected String play() {

		return "ババ抜きを行います。";
	}

}
