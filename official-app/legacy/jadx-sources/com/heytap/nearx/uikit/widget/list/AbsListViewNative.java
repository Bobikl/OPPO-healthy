package com.heytap.nearx.uikit.widget.list;

import android.util.Log;
import android.widget.AbsListView;
import com.oplus.aiunit.vision.khc;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public class AbsListViewNative {
    private static final String TAG = "AbsListViewNative";
    public static final int TOUCH_MODE_DONE_WAITING = 2;
    public static final int TOUCH_MODE_DOWN = 0;
    public static final int TOUCH_MODE_FLING = 4;
    public static final int TOUCH_MODE_OVERFLING = 6;
    public static final int TOUCH_MODE_OVERSCROLL = 5;
    public static final int TOUCH_MODE_REST = -1;
    public static final int TOUCH_MODE_SCROLL = 3;
    public static final int TOUCH_MODE_TAP = 1;
    private static final boolean USE_WRAPPER = true;
    private static final String VIEW_WRAPPER_PATH_NEW = "com.oplus.inner.widget.AbsListViewWrapper";
    private static String sAbsListViewWrapperName;

    private static boolean canReachFrameworkWrapper() {
        try {
            Class.forName(VIEW_WRAPPER_PATH_NEW);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getTouchMode(AbsListView absListView) {
        int iIntValue;
        String strA = canReachFrameworkWrapper() ? VIEW_WRAPPER_PATH_NEW : khc.c().a();
        sAbsListViewWrapperName = strA;
        try {
            if (USE_WRAPPER) {
                iIntValue = ((Integer) Class.forName(strA).getDeclaredMethod("getTouchMode", AbsListView.class).invoke(null, absListView)).intValue();
            } else {
                Field declaredField = AbsListView.class.getDeclaredField("mTouchMode");
                declaredField.setAccessible(true);
                iIntValue = declaredField.getInt(absListView);
            }
            return iIntValue;
        } catch (Exception e2) {
            Log.d(TAG, e2.toString());
            return -1;
        }
    }

    public static void setTouchMode(AbsListView absListView, int i) {
        String strA = canReachFrameworkWrapper() ? VIEW_WRAPPER_PATH_NEW : khc.c().a();
        sAbsListViewWrapperName = strA;
        try {
            if (USE_WRAPPER) {
                Class.forName(strA).getDeclaredMethod("setTouchMode", AbsListView.class, Integer.TYPE).invoke(null, absListView, Integer.valueOf(i));
            } else {
                Field declaredField = AbsListView.class.getDeclaredField("mTouchMode");
                declaredField.setAccessible(true);
                declaredField.setInt(absListView, i);
            }
        } catch (Exception e2) {
            Log.d(TAG, e2.toString());
        }
    }
}
