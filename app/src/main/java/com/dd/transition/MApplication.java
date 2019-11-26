package com.dd.transition;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * PackageName: com.dd.transition
 * Created by xbzhang on 2019/11/26
 * Description:
 */
public class MApplication extends Application {
    private static MApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        app = this;
    }

    public static Application getInstance(){
        return app;
    }

}
