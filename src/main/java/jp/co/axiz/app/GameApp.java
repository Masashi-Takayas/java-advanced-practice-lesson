package jp.co.axiz.app;

public abstract class GameApp implements App{

	private String item;
	private int playTime;//実行時間
	
	public GameApp() {
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String getItem(String item) {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
    public int getPlayTime(int playTime) {
        return this.playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
    
	protected abstract String play(); // 抽象メソッド

	public String start(String name) {
		return  name+"さんと"+item+"でゲームを開始します。"+play();
	}

}

