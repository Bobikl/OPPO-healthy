package com.platform.usercenter.tools.ui;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.platform.usercenter.tools.UCBasicUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class SizeUtils {

    public interface OnGetSizeListener {
        void onGetSize(View view);
    }

    private SizeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float applyDimension(float f, int i) {
        float f2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            f2 = displayMetrics.density;
        } else if (i == 2) {
            f2 = displayMetrics.scaledDensity;
        } else if (i == 3) {
            f *= displayMetrics.xdpi;
            f2 = 0.013888889f;
        } else if (i == 4) {
            f2 = displayMetrics.xdpi;
        } else {
            if (i != 5) {
                return 0.0f;
            }
            f *= displayMetrics.xdpi;
            f2 = 0.03937008f;
        }
        return f * f2;
    }

    public static int dp2px(float f) {
        return getPxValue(f, Resources.getSystem().getDisplayMetrics().density);
    }

    public static void forceGetViewSize(final View view, final OnGetSizeListener onGetSizeListener) {
        view.post(new Runnable() { // from class: com.platform.usercenter.tools.ui.SizeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                OnGetSizeListener onGetSizeListener2 = onGetSizeListener;
                if (onGetSizeListener2 != null) {
                    onGetSizeListener2.onGetSize(view);
                }
            }
        });
    }

    private static int getDpValue(float f, float f2) {
        return (int) ((f / f2) + 0.5f);
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    private static int getPtValue(float f) {
        return (int) (((double) ((f * 72.0f) / UCBasicUtils.sContext.getResources().getDisplayMetrics().xdpi)) + 0.5d);
    }

    private static int getPxValue(float f, float f2) {
        return (int) ((f * f2) + 0.5f);
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int pt2Px(float f) {
        return (int) (((double) ((f * UCBasicUtils.sContext.getResources().getDisplayMetrics().xdpi) / 72.0f)) + 0.5d);
    }

    public static int px2Pt(float f) {
        return getPtValue(f);
    }

    public static int px2dp(float f) {
        return getDpValue(f, Resources.getSystem().getDisplayMetrics().density);
    }

    public static int px2sp(float f) {
        return getDpValue(f, Resources.getSystem().getDisplayMetrics().scaledDensity);
    }

    public static int sp2px(float f) {
        return getPxValue(f, Resources.getSystem().getDisplayMetrics().density);
    }
}
