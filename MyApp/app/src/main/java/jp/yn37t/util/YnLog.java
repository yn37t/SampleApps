package jp.yn37t.util;

import android.util.Log;

/**
 * Created by yosuke.nakanishi on 2016/12/03.
 */

public class YnLog {
    static String tag_ = "YnLog";
    static public void setTag(String tag) {tag_ = tag;}

    static public void v(String tag, String log) {Log.v(tag, log);}
    static public void d(String tag, String log) {Log.d(tag, log);}
    static public void i(String tag, String log) {Log.i(tag, log);}
    static public void w(String tag, String log) {Log.w(tag, log);}
    static public void e(String tag, String log) {Log.e(tag, log);}

    static public void v(String log) {v(tag_, log);}
    static public void d(String log) {d(tag_, log);}
    static public void i(String log) {i(tag_, log);}
    static public void w(String log) {w(tag_, log);}
    static public void e(String log) {e(tag_, log);}
}
