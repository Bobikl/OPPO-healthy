package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.OplusBaseConfiguration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.StyleRes;
import com.oplus.smartenginehelper.ParserTag;
import com.support.appcompat.R$array;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$id;
import com.support.appcompat.R$style;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import oplus.content.res.OplusExtraConfiguration;

/* JADX INFO: loaded from: classes13.dex */
public class sm2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16646c;
    public static int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f16647e;
    public static boolean f;
    public static boolean g;
    public SparseIntArray a = new SparseIntArray();
    public HashMap<String, WeakReference<Boolean>> b = new HashMap<>();

    public static class a {
        public static final sm2 a = new sm2();
    }

    static {
        f16646c = d() ? "com.oplus.inner.content.res.ConfigurationWrapper" : kh2.c().b();
        f16647e = p();
        g = r();
        f = q() && bn2.c() > 0;
        d = g();
    }

    public static boolean d() {
        try {
            Class.forName("com.oplus.inner.content.res.ConfigurationWrapper");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g() {
        int i = 0;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class);
            String str = (String) method.invoke(null, "ro.oplus.theme.version");
            int i2 = !TextUtils.isEmpty(str) ? Integer.parseInt(str.trim()) : 0;
            if (i2 != 0) {
                return i2;
            }
            try {
                String str2 = (String) method.invoke(null, kh2.c().f());
                return !TextUtils.isEmpty(str2) ? Integer.parseInt(str2.trim()) : i2;
            } catch (Exception e2) {
                e = e2;
                i = i2;
                bj2.c("COUIThemeOverlay", "getCompatVersion e: " + e);
                return i;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static sm2 i() {
        return a.a;
    }

    public static boolean p() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{'O', 'P', 'P', 'O'})) || str.equals(String.valueOf(new char[]{'O', 'p', 'p', 'o'}));
    }

    public static boolean q() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{'O', 'n', 'e', 'P', 'l', 'u', 's'})) || str.equals(String.valueOf(new char[]{'O', 'N', 'E', 'P', rnb.MATRIX_TYPE_RANDOM_LT, rnb.MATRIX_TYPE_RANDOM_UT, 'S'})) || str.equals(String.valueOf(new char[]{'G', 'A', rnb.MATRIX_TYPE_RANDOM_LT, 'I', rnb.MATRIX_TYPE_RANDOM_LT, 'E', 'I'})) || str.equals(String.valueOf(new char[]{'g', 'a', 'l', 'i', 'l', 'e', 'i'})) || str.equals(String.valueOf(new char[]{'F', 'A', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'A', 'D', 'A', 'Y'})) || str.equals(String.valueOf(new char[]{'f', 'a', 'r', 'a', 'd', 'a', 'y'}));
    }

    public static boolean r() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{rnb.MATRIX_TYPE_RANDOM_REGULAR, 'E', 'A', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'E'})) || str.equals(String.valueOf(new char[]{rnb.MATRIX_TYPE_RANDOM_REGULAR, 'e', 'a', 'l', 'm', 'e'})) || str.equals(String.valueOf(new char[]{'r', 'e', 'a', 'l', 'm', 'e'}));
    }

    public void a(Context context, ImageView imageView, boolean z) {
        Drawable drawable;
        if (imageView == null || o(context)) {
            return;
        }
        if ((i().n(context) || z) && (drawable = imageView.getDrawable()) != null) {
            if (drawable instanceof LayerDrawable) {
                vm2.b(((LayerDrawable) drawable).getDrawable(0), lh2.a(context, R$attr.couiColorPrimaryText));
            } else {
                vm2.b(drawable, lh2.a(context, R$attr.couiColorPrimaryText));
            }
            ph2.c(imageView, false);
            imageView.setImageDrawable(drawable);
        }
    }

    public void b(Context context) {
        synchronized (this.a) {
            e();
            s(context);
            for (int i = 0; i < this.a.size(); i++) {
                context.setTheme(this.a.valueAt(i));
            }
        }
    }

    public final boolean c() {
        try {
            Class.forName("android.content.res.OplusBaseConfiguration");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void e() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public long f(Configuration configuration) {
        if (!c()) {
            return 0L;
        }
        OplusExtraConfiguration oplusExtraConfigurationH = h(configuration);
        if (oplusExtraConfigurationH != null) {
            return oplusExtraConfigurationH.mMaterialColor;
        }
        try {
            Class<?> cls = Class.forName(f16646c);
            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null) {
                return ((Long) cls.getMethod("getMaterialColor", Configuration.class).invoke(null, configuration)).longValue();
            }
            return 0L;
        } catch (Exception e2) {
            bj2.c("COUIThemeOverlay", "getCOUITheme e: " + e2);
            return 0L;
        }
    }

    public final OplusExtraConfiguration h(Configuration configuration) {
        OplusBaseConfiguration oplusBaseConfiguration = (OplusBaseConfiguration) u(OplusBaseConfiguration.class, configuration);
        if (oplusBaseConfiguration == null) {
            return null;
        }
        return oplusBaseConfiguration.mOplusExtraConfiguration;
    }

    public final int j(Context context, String str, String str2) {
        if (context.getResources() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(context.getPackageName())) {
            return 0;
        }
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public final int k(Context context, int i, int i2) {
        int resourceId = 0;
        if (i > 0 && context.getResources() != null) {
            Resources resources = context.getResources();
            int i3 = d;
            if (i3 > 12000) {
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R$array.coui_theme_arrays_ids);
                resourceId = typedArrayObtainTypedArray.length() >= i ? typedArrayObtainTypedArray.getResourceId(i - 1, 0) : 0;
                typedArrayObtainTypedArray.recycle();
            } else if (i3 == 12000) {
                int iJ = j(context, g ? "coui_theme_arrays_ids_patch_r" : "coui_theme_arrays_ids_patch_o", "array");
                if (f16647e && i2 == 1048576) {
                    iJ = R$array.coui_theme_arrays_ids;
                }
                if (iJ != 0) {
                    TypedArray typedArrayObtainTypedArray2 = resources.obtainTypedArray(iJ);
                    resourceId = typedArrayObtainTypedArray2.length() >= i ? typedArrayObtainTypedArray2.getResourceId(i - 1, 0) : 0;
                    typedArrayObtainTypedArray2.recycle();
                }
            } else {
                int iJ2 = j(context, g ? "coui_theme_arrays_ids_repatch_r" : "coui_theme_arrays_ids_repatch_o", "array");
                if (iJ2 != 0) {
                    TypedArray typedArrayObtainTypedArray3 = resources.obtainTypedArray(iJ2);
                    resourceId = typedArrayObtainTypedArray3.length() >= i ? typedArrayObtainTypedArray3.getResourceId(i - 1, 0) : 0;
                    typedArrayObtainTypedArray3.recycle();
                }
            }
        }
        return resourceId;
    }

    public final boolean l(Context context) {
        String packageName = context.getPackageName();
        File file = new File("my_company/media/theme/");
        if (!file.exists() || TextUtils.isEmpty(packageName)) {
            return false;
        }
        if (new File(file, packageName).exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return false;
        }
        String string = Settings.System.getString(context.getContentResolver(), "custom_theme_path_setting");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        return new File(string, packageName).exists();
    }

    public final boolean m(Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        OplusExtraConfiguration oplusExtraConfigurationH = h(context.getResources().getConfiguration());
        int i = oplusExtraConfigurationH != null ? oplusExtraConfigurationH.mUserId : 0;
        String str = "data/theme/";
        if (i > 0) {
            str = "data/theme/" + i;
        }
        return new File(str, packageName).exists();
    }

    public boolean n(Context context) {
        long jF = f(context.getResources().getConfiguration());
        return jF > 0 && (jF & 2147483647L) != 0;
    }

    public boolean o(Context context) {
        OplusExtraConfiguration oplusExtraConfigurationH;
        long jLongValue;
        boolean zL;
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration == null || !c()) {
            return false;
        }
        try {
            oplusExtraConfigurationH = h(context.getResources().getConfiguration());
            try {
                jLongValue = oplusExtraConfigurationH instanceof OplusExtraConfiguration ? oplusExtraConfigurationH.mThemeChangedFlags : 0L;
            } catch (Exception e2) {
                e = e2;
                Log.d("COUIThemeOverlay", "get extra config failed : " + e.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            oplusExtraConfigurationH = null;
        }
        if (oplusExtraConfigurationH == null) {
            try {
                Class<?> cls = Class.forName(f16646c);
                if (cls.newInstance() != null) {
                    jLongValue = ((Long) cls.getMethod("getThemeChangedFlags", Configuration.class).invoke(null, configuration)).longValue();
                }
            } catch (Exception e4) {
                bj2.c("COUIThemeOverlay", "isRejectTheme e: " + e4);
            }
        }
        if ((1 & jLongValue) != 0) {
            zL = (jLongValue & 256) != 0 ? l(context) : m(context);
        } else {
            zL = false;
        }
        return zL && (configuration.uiMode & 48) != 32;
    }

    public final void s(Context context) {
        int iK;
        int iJ;
        if (context == null || o(context)) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R$attr.couiThemeIdentifier});
        int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        long jF = f(context.getResources().getConfiguration());
        int i = (int) (xnl.PAYLOAD_SHORT_MAX & jF);
        int i2 = (int) (16711680 & jF);
        boolean z = d < 12000;
        if (jF != 0) {
            if (i == 0 && i2 == 0) {
                return;
            }
            if (i2 == 131072) {
                t(R$id.coui_global_theme, R$style.COUIOverlay_Theme_Single_First);
                return;
            }
            if (i2 != 65536) {
                if (i2 == 262144) {
                    iK = R$array.coui_theme_arrays_default_patch;
                } else if (i2 == 0 || i2 == 1048576) {
                    iK = k(context, i, i2);
                } else {
                    iJ = 0;
                    i = -1;
                }
                int i3 = integer - 1;
                iJ = iK;
                i = i3;
            } else if (f) {
                iJ = j(context, z ? "coui_theme_arrays_single_repatch_p" : "coui_theme_arrays_single_patch_p", "array");
            } else {
                iJ = R$array.coui_theme_arrays_single;
            }
            if (iJ == 0 || i == -1) {
                return;
            }
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(iJ);
            if (typedArrayObtainTypedArray.length() > i) {
                t(R$id.coui_global_theme, typedArrayObtainTypedArray.getResourceId(i, 0));
            }
            typedArrayObtainTypedArray.recycle();
        }
    }

    public void t(@IdRes int i, @StyleRes int i2) {
        synchronized (this.a) {
            this.a.put(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T u(Class<T> cls, Object obj) {
        if (obj == 0 || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }
}
