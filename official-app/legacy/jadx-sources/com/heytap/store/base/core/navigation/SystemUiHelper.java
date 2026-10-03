package com.heytap.store.base.core.navigation;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.graphics.ColorUtils;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.gkj;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.vhc;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class SystemUiHelper {
    public static final int SYSTEM_UI_FLAG_OP_STATUS_BAR_TINT = 16;
    public static final int VERSION_COLOROS_3_0 = 6;

    public static int getNavigationBarColor(Activity activity) {
        if (activity == null) {
            return 0;
        }
        return activity.getWindow().getNavigationBarColor();
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void hideNavigationBar(Activity activity) {
        if (activity != null && DeviceInfoUtil.hasNavBar) {
            activity.getWindow().addFlags(134217728);
            activity.getWindow().setNavigationBarColor(0);
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    private static boolean isTranslucentStatusMiUiVersion() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod(ParserTag.TAG_GET, String.class);
            return "V9".equals(declaredMethod.invoke(cls, "ro.miui.ui.version.name")) | "V6".equals(declaredMethod.invoke(cls, "ro.miui.ui.version.name")) | "V7".equals(declaredMethod.invoke(cls, "ro.miui.ui.version.name")) | "V8".equals(declaredMethod.invoke(cls, "ro.miui.ui.version.name"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void setActivityTranslucent(Activity activity) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024 | 8192 | 16);
        window.setStatusBarColor(0);
    }

    public static void setActivityTranslucent3(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 0 | 16 | 8192);
    }

    public static void setFullscreen(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(5376);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(0);
    }

    private static void setLightStatusBar(boolean z, Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        activity.getWindow().getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static void setNavigationBarAndStatusBarColor(Activity activity, int i) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setNavigationBarColor(i);
        activity.getWindow().setStatusBarColor(i);
    }

    public static void setNavigationBarBtnColor(Window window, Boolean bool) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(bool.booleanValue() ? systemUiVisibility & (-17) : systemUiVisibility | 16);
    }

    public static void setNavigationBarColor(Activity activity, int i) {
        if (activity != null && i > 0) {
            activity.getWindow().setNavigationBarColor(activity.getResources().getColor(i));
        }
    }

    public static void setNavigationBarTransparent(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(256, 256);
        activity.getWindow().setFlags(-65537, 65536);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        setNavigationBarColor(activity, R.color.transparent);
    }

    public static void setStatusBarDarkMode(boolean z, Activity activity) {
        if (!isTranslucentStatusMiUiVersion()) {
            if (z) {
                setStatusBarTextBlack(activity);
                return;
            } else {
                setStatusBarTextWhite(activity);
                return;
            }
        }
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
            setLightStatusBar(z, activity);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void setStatusBarHome(Activity activity, gkj gkjVar, boolean z) {
        gkjVar.d(true);
        gkjVar.b(false);
        activity.getWindow().setStatusBarColor(0);
        if (z) {
            setStatusBarTextWhite(activity);
        } else {
            setStatusBarTextBlack(activity);
        }
    }

    public static void setStatusBarTextBlack(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 8208);
    }

    public static void setStatusBarTextColor(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static void setStatusBarTextWhite(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility((activity.getWindow().getDecorView().getSystemUiVisibility() | 256 | 1024) & (~8192));
    }

    @SuppressLint({"NewApi"})
    public static void setStatusBarTint(Activity activity) {
        DeviceInfoUtil.getColorOSVersion();
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 8192);
    }

    @SuppressLint({"NewApi"})
    public static void setStatusBarTintDefBlack(Activity activity, gkj gkjVar, float f) {
        if (gkjVar != null) {
            int colorOSVersion = DeviceInfoUtil.getColorOSVersion();
            gkjVar.d(true);
            gkjVar.b(false);
            gkjVar.c(f);
            if (colorOSVersion >= 6) {
                gkjVar.e(R.color.base_state_text_white_color);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
            } else {
                gkjVar.e(R.color.base_state_text_black_color);
            }
            vhc.a(activity);
            activity.getWindow().setStatusBarColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
        }
    }

    public static void setStatusBarTranslucent(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setStatusBarColor(-16777216);
        activity.getWindow().getDecorView().setSystemUiVisibility(256);
    }

    @SuppressLint({"NewApi"})
    public static void setStatusBarWebView(Activity activity, gkj gkjVar, float f, String str) {
        if (gkjVar != null) {
            int colorOSVersion = DeviceInfoUtil.getColorOSVersion();
            gkjVar.d(true);
            gkjVar.b(false);
            gkjVar.c(f);
            if (colorOSVersion >= 6) {
                gkjVar.e(R.color.base_state_text_white_color);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
            } else {
                gkjVar.e(R.color.base_state_text_black_color);
            }
            boolean zA = vhc.a(activity);
            if (zA) {
                activity.getWindow().setStatusBarColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
            } else {
                activity.getWindow().setStatusBarColor(Color.parseColor(str));
            }
            if (ColorUtils.calculateLuminance(Color.parseColor(str)) >= 0.5d) {
                LogUtils.INSTANCE.d("xiaomin", "是亮色");
                setStatusBarDarkMode(!zA, activity);
                return;
            }
            LogUtils.INSTANCE.d("xiaomin", "是暗色");
            if (zA) {
                activity.getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(256);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void setStatusBarWebView2(Activity activity, gkj gkjVar, float f, String str, boolean z) {
        if (gkjVar != null) {
            int colorOSVersion = DeviceInfoUtil.getColorOSVersion();
            gkjVar.d(true);
            gkjVar.b(false);
            gkjVar.c(f);
            if (colorOSVersion >= 6) {
                gkjVar.e(R.color.base_state_text_white_color);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
            } else {
                gkjVar.e(R.color.base_state_text_black_color);
            }
            if (ColorUtils.calculateLuminance(Color.parseColor(str)) >= 0.5d) {
                LogUtils.INSTANCE.d("xiaomin", "是亮色");
                setStatusBarDarkMode(!z, activity);
                return;
            }
            LogUtils.INSTANCE.d("xiaomin", "是暗色");
            if (z) {
                activity.getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(256);
            }
        }
    }

    @TargetApi(19)
    public static void setTranslucentStatus(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= 67108864;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    public static void setTransparentNavigationBar(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.setNavigationBarContrastEnforced(false);
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 512);
        window.setNavigationBarColor(0);
        setNavigationBarBtnColor(window, Boolean.valueOf(z));
    }

    public static void setTransparentStatusBar(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024 | 256);
        window.setStatusBarColor(0);
        setStatusBarTextColor(window, z);
    }

    public static void setViewPaddingTopBelowAnchor(final View view, final View[] viewArr) {
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.heytap.store.base.core.navigation.SystemUiHelper.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int bottom = view.getBottom();
                    int i = 0;
                    while (true) {
                        View[] viewArr2 = viewArr;
                        if (i >= viewArr2.length) {
                            return false;
                        }
                        View view2 = viewArr2[i];
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop() + bottom, view2.getPaddingRight(), view2.getPaddingBottom());
                        i++;
                    }
                }
            });
        }
    }

    public static void hideNavigationBar(final Window window, final boolean z) {
        window.getDecorView().setSystemUiVisibility(2);
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.heytap.store.base.core.navigation.SystemUiHelper.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                window.getDecorView().setSystemUiVisibility((z ? 1798 : 1794) | 4096);
            }
        });
    }

    public static void setStatusBarTint(Window window) {
        DeviceInfoUtil.getColorOSVersion();
        window.addFlags(Integer.MIN_VALUE);
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 8192);
    }

    @SuppressLint({"NewApi"})
    public static void setStatusBarTint(Activity activity, gkj gkjVar, float f) {
        if (gkjVar != null) {
            int colorOSVersion = DeviceInfoUtil.getColorOSVersion();
            gkjVar.d(true);
            gkjVar.b(false);
            gkjVar.c(f);
            if (colorOSVersion >= 6) {
                gkjVar.e(R.color.base_state_text_white_color);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
            } else {
                gkjVar.e(R.color.base_state_text_black_color);
            }
            boolean zA = vhc.a(activity);
            if (zA) {
                activity.getWindow().setStatusBarColor(Color.argb((int) (255.0f * f), 0, 0, 0));
            } else {
                activity.getWindow().setStatusBarColor(Color.argb((int) (255.0f * f), 255, 255, 255));
            }
            if (f >= 0.6f) {
                setStatusBarDarkMode(!zA, activity);
            } else {
                setStatusBarDarkMode(false, activity);
            }
        }
    }
}
