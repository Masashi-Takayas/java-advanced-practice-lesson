package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

/**
 * AppUtilクラスのテスト用クラス
 */
public class AppUtilTest {

    // isGameAppメソッドのテストケース
    @Test
    public void isGameAppTest1() {
        App app = new CardGameApp();
        boolean result = AppUtil.isGameApp(app);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void isGameAppTest2() {
        App app = new DartsGameApp();
        boolean result = AppUtil.isGameApp(app);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void isGameAppTest3() {
        App app = new ClockApp();
        boolean result = AppUtil.isGameApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    // isCardGameAppメソッドのテストケース
    @Test
    public void isCardGameAppTest1() {
        App app = new CardGameApp();
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void isCardGameAppTest2() {
        App app = new DartsGameApp();
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void isCardGameAppTest3() {
        App app = new ClockApp();
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    // isDartsGameAppメソッドのテストケース
    @Test
    public void isDartsGameAppTest1() {
        App app = new CardGameApp();
        boolean result = AppUtil.isDartsGameApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void isDartsGameAppTest2() {
        App app = new DartsGameApp();
        boolean result = AppUtil.isDartsGameApp(app);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void isDartsGameAppTest3() {
        App app = new ClockApp();
        boolean result = AppUtil.isDartsGameApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    // isClockAppメソッドのテストケース
    @Test
    public void isClockAppTest1() {
        App app = new CardGameApp();
        boolean result = AppUtil.isClockApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void isClockAppTest2() {
        App app = new DartsGameApp();
        boolean result = AppUtil.isClockApp(app);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void isClockAppTest3() {
        App app = new ClockApp();
        boolean result = AppUtil.isClockApp(app);
        boolean expected = true;

        assertEquals(expected, result);
    }

    // getAppNameメソッドのテストケース
    @Test
    public void getAppNameTest1() {
        App app = new CardGameApp();

        String result = AppUtil.getAppName(app);
        String expected = "ゲーム:カード";

        assertEquals(expected, result);
    }

    @Test
    public void getAppNameTest2() {
        App app = new DartsGameApp();

        String result = AppUtil.getAppName(app);
        String expected = "ゲーム:ダーツ";

        assertEquals(expected, result);
    }

    @Test
    public void getAppNameTest3() {
        App app = new ClockApp();

        String result = AppUtil.getAppName(app);
        String expected = "時計";

        assertEquals(expected, result);
    }
}

