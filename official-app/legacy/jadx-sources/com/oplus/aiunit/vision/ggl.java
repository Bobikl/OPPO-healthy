package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.health.watchface.R$drawable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class ggl {
    public static final float SCALE_MID = 0.69f;
    public static final String TAG = "WatchPreviewAdaptHelper";
    public static float a;

    public static void a(Context context, RoundedImageView roundedImageView, View view, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        if (roundedImageView != null) {
            b(context, roundedImageView, proto$DeviceInfo, z);
        }
        if (view != null) {
            c(context, view, proto$DeviceInfo, z);
        }
    }

    public static void b(Context context, RoundedImageView roundedImageView, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        if (proto$DeviceInfo == null) {
            ltl.i(TAG, "[adjustPreviewImageView] deviceInfo == null.");
            return;
        }
        Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
        if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
            roundedImageView.setOval(true);
            p(context, proto$DeviceInfo, roundedImageView, z);
        } else if (screenType == Proto$ScreenType.SCREEN_TYPE_SQUARE) {
            roundedImageView.setOval(false);
            s(context, proto$DeviceInfo, roundedImageView, z);
        }
    }

    public static void c(Context context, View view, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        if (proto$DeviceInfo == null) {
            ltl.i(TAG, "[adjustPreviewImageView] deviceInfo == null");
            return;
        }
        Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
        if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
            view.setBackground((GradientDrawable) context.getDrawable(R$drawable.watch_face_album_circle_item_select_bg));
            n(context, view, z);
        } else if (screenType == Proto$ScreenType.SCREEN_TYPE_SQUARE) {
            view.setBackground((GradientDrawable) context.getDrawable(z ? R$drawable.watch_face_album_item_select_bg : R$drawable.watch_face_album_small_item_select_bg));
            r(context, proto$DeviceInfo, view, z);
        }
    }

    public static int d(Context context, boolean z) {
        return (int) ((z ? 100.0f : 63.33f) * f(context));
    }

    public static int e(Context context, boolean z) {
        return (int) ((z ? 104.0f : 54.87f) * f(context));
    }

    public static float f(Context context) {
        float f = a;
        if (f > 0.0f) {
            return f;
        }
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Method method = cls.getMethod("getWindowManagerService", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
            method2.setAccessible(true);
            float fIntValue = ((Integer) method2.invoke(objInvoke, 0)).intValue() / 160.0f;
            a = fIntValue;
            return fIntValue;
        } catch (Exception e2) {
            ltl.b(TAG, "[getDefaultDisplayDensity] --> error=" + e2.getMessage());
            float f2 = context.getResources().getDisplayMetrics().density;
            a = f2;
            return f2;
        }
    }

    public static GradientDrawable g(Context context, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        if (proto$DeviceInfo == null) {
            ltl.i(TAG, "[adjustPreviewImageView] deviceInfo == null.");
            return (GradientDrawable) context.getDrawable(R$drawable.watch_face_album_item_select_bg);
        }
        int i = R$drawable.watch_face_album_item_select_bg;
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(i);
        Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
        if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
            return (GradientDrawable) context.getDrawable(R$drawable.watch_face_album_circle_item_select_bg);
        }
        if (screenType != Proto$ScreenType.SCREEN_TYPE_SQUARE) {
            return gradientDrawable;
        }
        if (!z) {
            i = R$drawable.watch_face_album_small_item_select_bg;
        }
        GradientDrawable gradientDrawable2 = (GradientDrawable) context.getDrawable(i);
        gradientDrawable2.setCornerRadius(j(context, proto$DeviceInfo, z));
        return gradientDrawable2;
    }

    public static float h(Proto$DeviceInfo proto$DeviceInfo) {
        return proto$DeviceInfo.getScreenHeight() / proto$DeviceInfo.getScreenWidth();
    }

    public static int i(Proto$DeviceInfo proto$DeviceInfo, int i) {
        return (int) (h(proto$DeviceInfo) * i);
    }

    public static int j(Context context, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        return m(context, proto$DeviceInfo, z) + ((int) (f(context) * 4.0f));
    }

    public static float k(Context context, float f, int i, int i2) {
        return (((f / i) * i2) / 3.0f) * f(context);
    }

    public static float l(Context context, Proto$DeviceInfo proto$DeviceInfo, int i) {
        return k(context, i, proto$DeviceInfo.getScreenWidth(), proto$DeviceInfo.getScreenRadius());
    }

    public static int m(Context context, Proto$DeviceInfo proto$DeviceInfo, boolean z) {
        return (int) ((((e(context, z) / proto$DeviceInfo.getScreenWidth()) * proto$DeviceInfo.getScreenRadius()) / 3.0f) * f(context));
    }

    public static void n(Context context, View view, boolean z) {
        float f = f(context);
        int i = ((int) ((z ? 100.0f : 63.33f) * f)) + ((int) ((z ? 4.0f : 3.67f) * f * 2.0f));
        ltl.a(TAG, " -->[setCircleImageOutSize] roundWidth " + i);
        o(view, i, i);
    }

    public static void o(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void p(Context context, Proto$DeviceInfo proto$DeviceInfo, RoundedImageView roundedImageView, boolean z) {
        int iD = d(context, z);
        ltl.a(TAG, " -->[setRoundImageSize] roundSize " + iD);
        o(roundedImageView, iD, iD);
    }

    public static void q(RoundedImageView roundedImageView, int i, int i2, int i3) {
        o(roundedImageView, i, i2);
        roundedImageView.setCornerRadius(i3);
    }

    public static void r(Context context, Proto$DeviceInfo proto$DeviceInfo, View view, boolean z) {
        int iF = (int) (f(context) * 3.67f * 2.0f);
        int iE = e(context, z);
        int i = iE + iF;
        int i2 = i(proto$DeviceInfo, iE) + iF;
        ltl.a(TAG, " -->[setBigRoundImageOutSize] roundWidth " + i + " roundHeight " + i2);
        o(view, i, i2);
    }

    public static void s(Context context, Proto$DeviceInfo proto$DeviceInfo, RoundedImageView roundedImageView, boolean z) {
        int iE = e(context, z);
        q(roundedImageView, iE, i(proto$DeviceInfo, iE), m(context, proto$DeviceInfo, z));
    }
}
