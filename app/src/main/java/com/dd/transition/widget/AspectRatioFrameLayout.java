package com.dd.transition.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * 锁定宽高比的CardView
 * Created by xmuSistone on 2016/9/21.
 */
public class AspectRatioFrameLayout extends CardView {

    private float ratio = 1.2f;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (ratio > 0) {
            int ratioHeight = (int) (getMeasuredWidth() * ratio);
            setMeasuredDimension(getMeasuredWidth(), ratioHeight);
            ViewGroup.LayoutParams lp = getLayoutParams();
            lp.height = ratioHeight;
            setLayoutParams(lp);
            setBackgroundColor(Color.TRANSPARENT);
        }
    }
}
