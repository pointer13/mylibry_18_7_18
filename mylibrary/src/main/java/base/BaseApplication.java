package base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2018/7/17.
 */

public class BaseApplication extends Application {
    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getApplicationCotext() {
        return context;

    }
}
