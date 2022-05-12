package app;

public class DartsGameApp extends GameApp{

	public DartsGameApp() {
		super();
	}
	public DartsGameApp(String play) {
		super(play);
	}
	public String play() {

		return "10回投げて合計点を競います。";
	}

}
