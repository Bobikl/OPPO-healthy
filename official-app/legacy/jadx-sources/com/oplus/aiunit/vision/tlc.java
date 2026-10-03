package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes18.dex */
public class tlc {
    public static final int CONSTANT_COLOR_MASK = 16777215;
    public static final int CONSTANT_INT_EIGHT = 8;
    public static final int CONSTANT_INT_EIGHTEEN = 18;
    public static final int CONSTANT_INT_ELEVEN = 11;
    public static final int CONSTANT_INT_FIFTEEN = 15;
    public static final int CONSTANT_INT_FIVE = 5;
    public static final int CONSTANT_INT_FORE = 4;
    public static final int CONSTANT_INT_FOURTEEN = 14;
    public static final int CONSTANT_INT_NINE = 9;
    public static final int CONSTANT_INT_NINETY = 90;
    public static final int CONSTANT_INT_ONE_HUNDRED = 100;
    public static final int CONSTANT_INT_ONE_HUNDRED_TEENTY = 120;
    public static final int CONSTANT_INT_ONE_THOUSAND = 1000;
    public static final int CONSTANT_INT_SEVEN = 7;
    public static final int CONSTANT_INT_SIX = 6;
    public static final int CONSTANT_INT_SIXTEEN = 16;
    public static final int CONSTANT_INT_SIXTY = 60;
    public static final int CONSTANT_INT_TEN = 10;
    public static final int CONSTANT_INT_THIRTEEN = 13;
    public static final int CONSTANT_INT_THIRTY = 30;
    public static final int CONSTANT_INT_THREE = 3;
    public static final int CONSTANT_INT_THREE_HUNDRED = 300;
    public static final int CONSTANT_INT_THTEE_HUNDRED_THIRTY = 330;
    public static final int CONSTANT_INT_TWELVE = 12;
    public static final int CONSTANT_INT_TWO_HUNDRED_SEVENTY = 270;
    public static final boolean DEBUG = false;
    public static final int INT_TWENTY_FOUR = 24;
    public static final int TWO_FIVE_FIVE = 255;

    public static int a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int b(Context context) {
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            try {
                return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }
}
