package com.coui.appcompat.panel;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class COUINavigationBarUtil {
    private static final String HIDE_NAVIGATION_BAR_ENABLE = "hide_navigationbar_enable";
    private static final String MANUAL_HIDE_NAVIGATION_BAR = "manual_hide_navigationbar";
    private static final String NAVIGATION_BAR_HEIGHT = "navigation_bar_height";
    private static final String NAVIGATION_BAR_IMMERSIVE = "nav_bar_immersive";
    private static final Uri NAVIGATION_BAR_IMMERSIVE_URI = Settings.Secure.getUriFor(NAVIGATION_BAR_IMMERSIVE);
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final int NAV_STATE_SWIPE_UP_GESTURE = 2;
    private static final int NAV_STATE_VIRTUAL_KEY = 0;
    private static final int NAV_STATE_VIRTUAL_KEY_AND_HIDE = 1;
    private static final String TAG = "NavigationBarUtils";

    public interface NavigationBarChangeListener {
        void onNavigationBarChange(boolean z);
    }

    public static class NavigationBarContentObserver extends ContentObserver {
        private Context mContext;
        private NavigationBarChangeListener mListener;

        public NavigationBarContentObserver(Context context, NavigationBarChangeListener navigationBarChangeListener) {
            super(null);
            this.mContext = context;
            this.mListener = navigationBarChangeListener;
        }

        public void clearListener() {
            if (this.mListener != null) {
                this.mListener = null;
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            Context context;
            super.onChange(z, uri);
            if (COUINavigationBarUtil.NAVIGATION_BAR_IMMERSIVE_URI == null || !COUINavigationBarUtil.NAVIGATION_BAR_IMMERSIVE_URI.equals(uri) || (context = this.mContext) == null || this.mListener == null) {
                return;
            }
            this.mListener.onNavigationBarChange(Settings.Secure.getInt(context.getContentResolver(), COUINavigationBarUtil.NAVIGATION_BAR_IMMERSIVE, 0) == 0);
        }
    }

    public static int getNavigationBarHeight(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier(NAVIGATION_BAR_HEIGHT, ResourcesUtil.ResourceType.DIMEN, "android"));
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

    public static boolean isGestureNavigation(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), HIDE_NAVIGATION_BAR_ENABLE, 0) == 3;
    }

    public static boolean isNavigationBarShow(Context context) {
        if (!isSupportNavigationBar(context)) {
            return false;
        }
        int i = Settings.Secure.getInt(context.getContentResolver(), HIDE_NAVIGATION_BAR_ENABLE, 0);
        return i == 0 || (i == 1 && Settings.Secure.getInt(context.getContentResolver(), MANUAL_HIDE_NAVIGATION_BAR, 0) == 0) || Build.VERSION.SDK_INT > 30;
    }

    public static boolean isSupportNavigationBar(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z2 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod(ParserTag.TAG_GET, String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z = "0".equals(str) ? true : z2;
            }
            return z;
        } catch (Exception e2) {
            Log.d(TAG, "fail to get navigation bar status message is " + e2.getMessage());
            return z2;
        }
    }

    public static NavigationBarContentObserver registerObserver(Context context, NavigationBarChangeListener navigationBarChangeListener) {
        if (context == null) {
            return null;
        }
        NavigationBarContentObserver navigationBarContentObserver = new NavigationBarContentObserver(context, navigationBarChangeListener);
        context.getContentResolver().registerContentObserver(NAVIGATION_BAR_IMMERSIVE_URI, false, navigationBarContentObserver);
        return navigationBarContentObserver;
    }

    public static void unregisterObserver(Context context, NavigationBarContentObserver navigationBarContentObserver) {
        if (context == null || navigationBarContentObserver == null) {
            return;
        }
        navigationBarContentObserver.clearListener();
        context.getContentResolver().unregisterContentObserver(navigationBarContentObserver);
    }
}
