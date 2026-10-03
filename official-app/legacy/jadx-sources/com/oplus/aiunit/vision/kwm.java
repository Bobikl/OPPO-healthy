package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import com.customer.feedback.sdk.activity.FeedbackActivity;
import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.util.LogUtil;
import com.customer.feedback.sdk.widget.ContainerView;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class kwm {
    public static int feedbacka = 0;
    public static final byte[] feedbackb = {111, 112, 112, 111};
    public static final byte[] feedbackc = {67, 79, 76, 79, 82, 79, 83};
    public static final byte[] feedbackd = {111, 110, 101, 112, 108, 117, 115};
    public static boolean feedbacke = false;

    /* JADX INFO: renamed from: feedbackf, reason: collision with root package name */
    public static int f13438feedbackf;

    public static int a(Activity activity) {
        if (activity == null) {
            return -1;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static Context b(Context context, Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    public static /* synthetic */ WindowInsets c(Activity activity, ContainerView containerView, boolean z, View view, WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (systemWindowInsetBottom <= k(activity)) {
            f13438feedbackf = systemWindowInsetBottom;
        }
        boolean z2 = systemWindowInsetBottom - f13438feedbackf > 0;
        if (feedbacke != z2 && (activity instanceof FeedbackActivity)) {
            ((FeedbackActivity) activity).setWebEvaluateJS("javascript:setWebInputState(" + z2 + ")");
        }
        feedbacke = z2;
        if (z2) {
            if (p(activity)) {
                view.setPadding(0, view.getPaddingTop(), 0, 0);
            } else {
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), view.getPaddingTop(), windowInsets.getSystemWindowInsetRight(), 0);
            }
            containerView.setNavigationBarViewHeight(systemWindowInsetBottom);
        } else if (p(activity)) {
            view.setPadding(0, view.getPaddingTop(), 0, 0);
            if (!z) {
                systemWindowInsetBottom = 0;
            }
            containerView.setNavigationBarViewHeight(systemWindowInsetBottom);
        } else {
            view.setPadding(windowInsets.getSystemWindowInsetLeft(), view.getPaddingTop(), windowInsets.getSystemWindowInsetRight(), 0);
            containerView.setNavigationBarViewHeight(systemWindowInsetBottom);
        }
        return windowInsets;
    }

    public static String d(Context context) {
        boolean z = false;
        if (context != null && !TextUtils.isEmpty("com.google.android.documentsui")) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.documentsui", 8192);
                if (applicationInfo != null) {
                    LogUtil.d("FbUtils", "doc package -> " + applicationInfo.packageName);
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                LogUtil.e("FbUtils", "getPackageManager failed", e2);
            }
        }
        return z ? "com.google.android.documentsui" : "com.android.documentsui";
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static String f(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Throwable th) {
            Log.e("FbUtils", "exceptionInfo:" + th);
            return str2;
        }
    }

    public static Locale g() {
        LocaleList localeList = LocaleList.getDefault();
        if (localeList != null && !localeList.isEmpty()) {
            return localeList.get(0);
        }
        LogUtil.e("FbUtils", "getNewLocal  LocaleList is null or empty");
        return Locale.getDefault();
    }

    public static void h(final Activity activity, final ContainerView containerView, final boolean z) {
        containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.iwm
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return kwm.c(activity, containerView, z, view, windowInsets);
            }
        });
    }

    public static void i(boolean z, WebView webView) {
        if (webView == null || webView.getSettings() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (z) {
                webView.getSettings().setAlgorithmicDarkeningAllowed(true);
                return;
            } else {
                webView.getSettings().setAlgorithmicDarkeningAllowed(false);
                return;
            }
        }
        if (z) {
            webView.getSettings().setForceDark(2);
        } else {
            webView.getSettings().setForceDark(0);
        }
    }

    public static boolean j(Intent intent, String str) {
        try {
            return intent.getBooleanExtra(str, false);
        } catch (Exception e2) {
            LogUtil.e("FbUtils", " getBooleanFromIntent error " + e2.getMessage());
            return false;
        }
    }

    public static int k(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics2);
        float f = displayMetrics2.density;
        float f2 = displayMetrics.density;
        if (f == f2) {
            return dimensionPixelSize;
        }
        return (int) ((dimensionPixelSize * (f / f2)) + 0.5f);
    }

    public static boolean l() {
        String strF = f("persist.sys.oem.region", "NOTHING");
        String strF2 = f(fwm.THEME_IS_EXP, "NOTHING");
        if (strF2.equals("NOTHING")) {
            strF2 = f("persist.sys.oplus.region", "NOTHING");
        }
        boolean zEquals = "NOTHING".equals(strF2);
        boolean zEquals2 = "NOTHING".equals(strF);
        if (!(zEquals ^ zEquals2)) {
            return false;
        }
        if (zEquals2) {
            if ("CN".equals(strF2)) {
                return false;
            }
        } else if ("CN".equals(strF)) {
            return false;
        }
        return true;
    }

    public static int m(Context context) {
        int identifier;
        if (feedbacka == 0 && (identifier = context.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android")) > 0) {
            feedbacka = context.getResources().getDimensionPixelSize(identifier);
        }
        return feedbacka;
    }

    public static boolean n() {
        int i = feedbacka.feedbackk;
        LogUtil.d("FbUtils", " isNightMode ,mode = " + i);
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return bwm.d();
        }
        return false;
    }

    public static String o() {
        byte[] bArr = feedbackb;
        return new String(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3]}, StandardCharsets.UTF_8);
    }

    public static boolean p(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            return Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0) == 2 || Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0) == 3;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2;
    }

    public static String q() {
        byte[] bArr = feedbackc;
        return new String(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6]}, StandardCharsets.UTF_8);
    }

    public static String r() {
        byte[] bArr = feedbackd;
        return new String(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6]}, StandardCharsets.UTF_8);
    }
}
