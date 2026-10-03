package androidx.recyclerview.widget;

import android.view.View;
import com.oplus.aiunit.vision.fjc;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes12.dex */
public class InnerColorViewNative {
    private static final String TAG = "ViewNative";
    private static final boolean USE_WRAPPER = true;
    private static final String VIEW_WRAPPER_PATH = "com.color.inner.view.ViewWrapper";
    private static final String VIEW_WRAPPER_PATH_NEW = "com.oplus.inner.view.ViewWrapper";
    private static String mRealPath = "com.color.inner.view.ViewWrapper";

    private static boolean canReachFrameworkWrapper() {
        try {
            Class.forName(VIEW_WRAPPER_PATH_NEW);
            return true;
        } catch (Exception e2) {
            fjc.a(TAG, e2.toString());
            return false;
        }
    }

    public static void setScrollX(View view, int i) {
        String str = canReachFrameworkWrapper() ? VIEW_WRAPPER_PATH_NEW : VIEW_WRAPPER_PATH;
        mRealPath = str;
        try {
            if (USE_WRAPPER) {
                Class.forName(str).getDeclaredMethod("setScrollXForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
            } else {
                Field declaredField = View.class.getDeclaredField("mScrollX");
                declaredField.setAccessible(true);
                declaredField.setInt(view, i);
            }
        } catch (Throwable th) {
            fjc.a(TAG, th.toString());
        }
    }

    public static void setScrollY(View view, int i) {
        String str = canReachFrameworkWrapper() ? VIEW_WRAPPER_PATH_NEW : VIEW_WRAPPER_PATH;
        mRealPath = str;
        try {
            if (USE_WRAPPER) {
                Class.forName(str).getDeclaredMethod("setScrollYForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
            } else {
                Field declaredField = View.class.getDeclaredField("mScrollY");
                declaredField.setAccessible(true);
                declaredField.setInt(view, i);
            }
        } catch (Throwable th) {
            fjc.a(TAG, th.toString());
        }
    }
}
