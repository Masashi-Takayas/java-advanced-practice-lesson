package jp.co.axiz.app;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 時計アプリを表すクラス
 */
public class ClockApp implements App {

    /**
     * アプリを開始するメソッド (オーバーライド)
     */
    public String start(String userName) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return userName + "さん、こんにちは。現在は" + sdf.format(date) + "です。";
    }
}
