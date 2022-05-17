package jp.co.axiz.util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil {

	public static boolean isGameApp(App app) {
		if(app instanceof GameApp) {
			return true;		
		}
		else {
			return false;
		}
	}
	public static boolean isCardGameApp(App app) {
		if(app instanceof CardGameApp) {
			return true;		
		}
		else {
			return false;
		}
	}
	public static boolean isDartsGameApp(App app) {
		if(app instanceof DartsGameApp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isClockApp(App app) {
		if(app instanceof ClockApp) {
			return true;		
		}
		else {
			return false;
		}
	}
	
	
	public static String getAppName(App app) {
		String appName = "";

		if(isGameApp(app)) {
			appName = "ゲーム:";		
			if(isCardGameApp(app)) 
			{
				appName +=  "カード";
			}
			else if(isDartsGameApp(app))
			{
				appName +=  "ダーツ";
			}
		}
		else if(isClockApp(app)){
			appName =  "時計";
		}
		return appName;
	}
}
