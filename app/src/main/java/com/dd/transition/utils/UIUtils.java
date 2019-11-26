package com.dd.transition.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import com.dd.transition.MApplication;

/**
 * <b>Create Date:</b> 2018/3/5<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class UIUtils {
    public static Context getContext() {
        return MApplication.getInstance().getApplicationContext();
    }

    /**
     * dp转换为px
     */
    public static int dp2px(int dp) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * px转换为dp
     */
    public static int px2dp(int px) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }


    public static Resources getResources() {
        return getContext().getResources();
    }

    /**
     * 获取字符
     * @param id
     * @return
     */
    public static String getString(int id){
        return getResources().getString(id);
    }
    /**
     * 获取字符数组
     *
     * @param id
     * @return
     */
    public static String[] getStringArrays(int id) {
        return getResources().getStringArray(id);
    }

    /**
     * 获取颜色
     */
    public static int getColor(int id) {
        return getResources().getColor(id);
    }

    /**
     * 根据id获取尺寸
     * @param id
     * @return
     */
    public static int getDimens(int id){
        return getResources().getDimensionPixelOffset(id);
    }

    public static View inflate(int id){
        return View.inflate(getContext(),id,null);
    }
}
