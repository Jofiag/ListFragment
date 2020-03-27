package com.jofiagtech.listfragment.Util;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenUtility {
    private Activity mActivity;
    private float displayWidth;
    private float displayHeight;

    public ScreenUtility(Activity activity) {
        mActivity = activity;

        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();

        display.getMetrics(outMetrics);

        float density = activity.getResources().getDisplayMetrics().density;

        displayWidth = outMetrics.widthPixels / density;
        displayHeight = outMetrics.heightPixels / density;
    }

    public float getDisplayWidth() {
        return displayWidth;
    }

    public float getDisplayHeight() {
        return displayHeight;
    }
}
