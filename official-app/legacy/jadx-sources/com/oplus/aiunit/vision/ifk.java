package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class ifk {
    public static final int ANIM_LEVEL_HIGN_END = 1;
    public static final int ANIM_LEVEL_INVALID = -1;
    public static final int ANIM_LEVEL_LOW_END = 3;
    public static final int ANIM_LEVEL_MID_END = 2;
    public static final int ANIM_LEVEL_ULTRA_LOW_END = 4;
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
    public static final int DIRECTION_BOTTOM = 3;
    public static final int DIRECTION_END = 4;
    public static final int DIRECTION_LEFT = 0;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_START = 5;
    public static final int DIRECTION_TOP = 1;
    public static final int INT_TWENTY_FOUR = 24;
    public static final int LARGE_WIDTH_DP = 840;
    public static final int MEDIUM_WIDTH_DP = 600;
    public static final int TWO_FIVE_FIVE = 255;
    public static SparseArray<String> a;
    public static final AnimLevel ANIM_LEVEL_SUPPORT_BLUR_MIN = AnimLevel.MID_END;
    public static int b = -1;

    public static float[] a(@ColorInt int i) {
        return new float[]{((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f};
    }

    public static boolean b(AnimLevel animLevel) {
        if (b == -1) {
            b = g();
        }
        return b <= animLevel.getIntValue() && b != -1;
    }

    public static Activity c(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int d(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    public static int e(MotionEvent motionEvent, int i) {
        return Math.min(Math.max(0, i), motionEvent.getPointerCount() - 1);
    }

    public static int f() {
        if (b == -1) {
            b = g();
        }
        return b;
    }

    public static int g() {
        try {
            String str = (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, "persist.sys.oplus.anim_level");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str.trim());
        } catch (Exception e2) {
            bj2.c("UIUtil", "getAnimLevelVersion e: " + e2);
            return -1;
        }
    }

    public static ColorStateList h(Context context, int i) {
        return context.getResources().getColorStateList(i, context.getTheme());
    }

    public static final float i(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public static int j(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int k(Context context) {
        return l(context).y;
    }

    public static Point l(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        Point point = new Point();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    public static int m(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int n(Context context) {
        return l(context).x;
    }

    public static String o(Context context, int i) {
        if (a == null) {
            a = new SparseArray<>();
        }
        String str = a.get(i);
        if (str != null) {
            return str;
        }
        String string = context.getString(i);
        a.put(i, string);
        return string;
    }

    public static boolean p(View view) {
        return view.getLocalVisibleRect(new Rect()) && view.getVisibility() == 0 && view.isShown();
    }

    public static int q(Context context, int i) {
        return Math.round(i / context.getResources().getDisplayMetrics().density);
    }

    public static void r(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.forceHasOverlappingRendering(z);
    }

    public static void s(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (i == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                } else if (i == 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
                } else if (i == 2) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
                } else if (i == 3) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
                } else if (i == 4) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i2);
                } else if (i == 5) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i2);
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
