package jp.co.axiz.app;

public class DartsGameApp extends GameApp{

	public DartsGameApp() {
		super();
	}
	public DartsGameApp(String play) {
		super(play);
		setPlayTime(10);
		}
	protected String play() {

		return "10回投げて合計点を競います。";
	}

}
