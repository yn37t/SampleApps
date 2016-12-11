package jp.yn37t.util;

/**
 * Created by yosuke.nakanishi on 2016/12/04.
 */

public class YnUtil {

    static public void waitMilisec(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {}
    }
}
