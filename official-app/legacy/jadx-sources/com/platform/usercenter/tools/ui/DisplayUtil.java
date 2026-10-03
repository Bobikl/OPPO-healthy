package com.platform.usercenter.tools.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class DisplayUtil {
    public static float RATIO = 0.95f;

    public static int dip2px(Context context, float f) {
        return (int) ((f * getScreenDendity(context)) + 0.5f);
    }

    public static int dip2pxRatio(Context context, float f) {
        return (int) ((f * getScreenDendity(context) * RATIO) + 0.5f);
    }

    public static int dp2px(Context context, int i) {
        int iApplyDimension = (int) (TypedValue.applyDimension(1, i, getDisplayMetrics(context)) + 0.5f);
        if (iApplyDimension != 0) {
            return iApplyDimension;
        }
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }

    public static int dpToPx(Context context, int i) {
        return Math.round(i * getPixelScaleFactor(context));
    }

    public static int getColor(Context context, int i) {
        return context.getColor(i);
    }

    public static boolean getDarkLightStatus(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static final int getDp(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static Resources getFontNoScaleResource(Context context, Resources resources) {
        try {
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics == null) {
                return resources;
            }
            if (configuration.fontScale == 1.0f && displayMetrics.scaledDensity == displayMetrics.density * 1.0f) {
                return resources;
            }
            configuration.fontScale = 1.0f;
            Resources resources2 = context.createConfigurationContext(configuration).getResources();
            displayMetrics.scaledDensity = displayMetrics.density * configuration.fontScale;
            return resources2;
        } catch (Exception e2) {
            UCLogUtil.w("FontNoScale", e2.getMessage());
            return resources;
        }
    }

    public static InputFilter getNoWhitespacefilter() {
        return new InputFilter() { // from class: com.platform.usercenter.tools.ui.DisplayUtil.1
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                StringBuilder sb = new StringBuilder(i2 - i);
                boolean z = true;
                for (int i5 = i; i5 < i2; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (Character.isWhitespace(cCharAt)) {
                        z = false;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                if (z) {
                    return null;
                }
                if (!(charSequence instanceof Spanned)) {
                    return sb;
                }
                SpannableString spannableString = new SpannableString(sb);
                try {
                    TextUtils.copySpansFrom((Spanned) charSequence, i, i2, null, spannableString, 0);
                } catch (Exception unused) {
                }
                return spannableString;
            }
        };
    }

    public static double getPhysicalSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
    }

    public static float getPixelScaleFactor(Context context) {
        return context.getResources().getDisplayMetrics().xdpi / 160.0f;
    }

    public static final int getPx(Context context, float f) {
        return (int) TypedValue.applyDimension(0, f, context.getResources().getDisplayMetrics());
    }

    public static int getRealScreenHeight(Context context) {
        int iHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Version.hasR()) {
            iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iHeight = point.y;
        }
        UCLogUtil.e("realScreenHeight = " + iHeight);
        return iHeight;
    }

    public static int getRealScreenWidth(Context context) {
        int iWidth;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Version.hasR()) {
            iWidth = windowManager.getMaximumWindowMetrics().getBounds().width();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iWidth = point.x;
        }
        UCLogUtil.e("realScreenWidth = " + iWidth);
        return iWidth;
    }

    public static float getScreenDendity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getScreenDisplayHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!Version.hasR()) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
    }

    public static int getScreenDisplayWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!Version.hasR()) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }

    @Deprecated
    public static int getScreenHeight(Context context) {
        return getScreenDisplayHeight(context);
    }

    public static int getScreenHeightDp(Context context) {
        return (int) (context.getResources().getDisplayMetrics().heightPixels / getScreenDendity(context));
    }

    @Deprecated
    public static int getScreenWidth(Context context) {
        return getScreenDisplayWidth(context);
    }

    public static int getScreenWidthDp(Context context) {
        return (int) (context.getResources().getDisplayMetrics().widthPixels / getScreenDendity(context));
    }

    public static int getStatusBarHeight(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return -1;
        }
    }

    public static String getString(Context context, int i) {
        return context.getString(i);
    }

    public static String getStringByLocal(Context context, int i, Locale locale) {
        if (!Version.hasJellyBeanMR1()) {
            return null;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getString(i);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / getScreenDendity(context)) + 0.5f);
    }

    public static int px2dipRatio(Context context, float f) {
        return (int) ((f / (getScreenDendity(context) * RATIO)) + 0.5f);
    }

    public static int pxToDp(Context context, int i) {
        return Math.round(i / getPixelScaleFactor(context));
    }

    public static int getColor(String str) {
        return Color.parseColor(str);
    }
}
