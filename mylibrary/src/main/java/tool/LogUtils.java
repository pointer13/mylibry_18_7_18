package tool;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/7/17.
 */

public class LogUtils {

    private static String tag = "";

    /**
     * @param log 打印内容
     */
    public static void setLog(String log) {
        Log.d(tag, log);
    }

    /**
     * @param tag 过滤字符
     * @param log 打印内容
     */
    public static void setLog(String tag, String log) {
        Log.d(tag, log);
    }


}
