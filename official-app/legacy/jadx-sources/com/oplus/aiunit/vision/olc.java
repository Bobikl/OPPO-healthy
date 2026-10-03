package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.OplusBaseConfiguration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.IdRes;
import androidx.annotation.StyleRes;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$style;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import oplus.content.res.OplusExtraConfiguration;

/* JADX INFO: loaded from: classes18.dex */
public class olc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f14977c;
    public static int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f14978e;
    public static boolean f;
    public static boolean g;
    public SparseIntArray a = new SparseIntArray();
    public HashMap<String, WeakReference<Boolean>> b = new HashMap<>();

    public static class a {
        public static final olc a = new olc();
    }

    static {
        f14977c = c() ? "com.oplus.inner.content.res.ConfigurationWrapper" : khc.c().b();
        f14978e = n();
        g = p();
        f = o() && cmc.b() > 0;
        d = e();
    }

    public static boolean c() {
        try {
            Class.forName("com.oplus.inner.content.res.ConfigurationWrapper");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int e() {
        int i = 0;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class);
            String str = (String) method.invoke(null, "ro.oplus.theme.version");
            int i2 = !TextUtils.isEmpty(str) ? Integer.parseInt(str.trim()) : 0;
            if (i2 != 0) {
                return i2;
            }
            try {
                String str2 = (String) method.invoke(null, khc.c().f());
                return !TextUtils.isEmpty(str2) ? Integer.parseInt(str2.trim()) : i2;
            } catch (Exception e2) {
                e = e2;
                i = i2;
                fjc.b("NearThemeOverlay", "getCompatVersion e: " + e);
                return i;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static olc g() {
        return a.a;
    }

    public static boolean n() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{'O', 'P', 'P', 'O'})) || str.equals(String.valueOf(new char[]{'O', 'p', 'p', 'o'}));
    }

    public static boolean o() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{'O', 'n', 'e', 'P', 'l', 'u', 's'})) || str.equals(String.valueOf(new char[]{'O', 'N', 'E', 'P', rnb.MATRIX_TYPE_RANDOM_LT, rnb.MATRIX_TYPE_RANDOM_UT, 'S'})) || str.equals(String.valueOf(new char[]{'G', 'A', rnb.MATRIX_TYPE_RANDOM_LT, 'I', rnb.MATRIX_TYPE_RANDOM_LT, 'E', 'I'})) || str.equals(String.valueOf(new char[]{'g', 'a', 'l', 'i', 'l', 'e', 'i'})) || str.equals(String.valueOf(new char[]{'F', 'A', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'A', 'D', 'A', 'Y'})) || str.equals(String.valueOf(new char[]{'f', 'a', 'r', 'a', 'd', 'a', 'y'}));
    }

    public static boolean p() {
        String str = Build.MANUFACTURER;
        return str.equals(String.valueOf(new char[]{rnb.MATRIX_TYPE_RANDOM_REGULAR, 'E', 'A', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'E'})) || str.equals(String.valueOf(new char[]{rnb.MATRIX_TYPE_RANDOM_REGULAR, 'e', 'a', 'l', 'm', 'e'})) || str.equals(String.valueOf(new char[]{'r', 'e', 'a', 'l', 'm', 'e'}));
    }

    public void a(Context context) {
        d();
        q(context);
        for (int i = 0; i < this.a.size(); i++) {
            context.setTheme(this.a.valueAt(i));
        }
    }

    public final boolean b() {
        try {
            Class.forName("android.content.res.OplusBaseConfiguration");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        this.a.clear();
    }

    public final OplusExtraConfiguration f(Configuration configuration) {
        OplusBaseConfiguration oplusBaseConfiguration = (OplusBaseConfiguration) s(OplusBaseConfiguration.class, configuration);
        if (oplusBaseConfiguration == null) {
            return null;
        }
        return oplusBaseConfiguration.mOplusExtraConfiguration;
    }

    public long h(Configuration configuration) {
        if (!b()) {
            return 0L;
        }
        OplusExtraConfiguration oplusExtraConfigurationF = f(configuration);
        if (oplusExtraConfigurationF != null) {
            return oplusExtraConfigurationF.mMaterialColor;
        }
        try {
            Class<?> cls = Class.forName(f14977c);
            if (cls.newInstance() != null) {
                return ((Long) cls.getMethod("getMaterialColor", Configuration.class).invoke(null, configuration)).longValue();
            }
            return 0L;
        } catch (Exception e2) {
            fjc.b("NearThemeOverlay", "getNearTheme e: " + e2);
            return 0L;
        }
    }

    public final int i(Context context, String str, String str2) {
        if (context.getResources() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(context.getPackageName())) {
            return 0;
        }
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public final int j(Context context, int i, int i2) {
        int resourceId = 0;
        if (i > 0 && context.getResources() != null) {
            Resources resources = context.getResources();
            int i3 = d;
            if (i3 > 12000) {
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R$array.nx_theme_arrays_ids);
                resourceId = typedArrayObtainTypedArray.length() >= i ? typedArrayObtainTypedArray.getResourceId(i - 1, 0) : 0;
                typedArrayObtainTypedArray.recycle();
            } else if (i3 == 12000) {
                int i4 = i(context, g ? "nx_theme_arrays_ids_patch_r" : "nx_theme_arrays_ids_patch_o", "array");
                if (f14978e && i2 == 1048576) {
                    i4 = R$array.nx_theme_arrays_ids;
                }
                if (f && Build.VERSION.SDK_INT == 31) {
                    i4 = R$array.nx_theme_arrays_ids_for_oneplus;
                }
                if (i4 != 0) {
                    TypedArray typedArrayObtainTypedArray2 = resources.obtainTypedArray(i4);
                    resourceId = typedArrayObtainTypedArray2.length() >= i ? typedArrayObtainTypedArray2.getResourceId(i - 1, 0) : 0;
                    typedArrayObtainTypedArray2.recycle();
                }
            } else {
                int i5 = i(context, g ? "nx_theme_arrays_ids_repatch_r" : "nx_theme_arrays_ids_repatch_o", "array");
                if (i5 != 0) {
                    TypedArray typedArrayObtainTypedArray3 = resources.obtainTypedArray(i5);
                    resourceId = typedArrayObtainTypedArray3.length() >= i ? typedArrayObtainTypedArray3.getResourceId(i - 1, 0) : 0;
                    typedArrayObtainTypedArray3.recycle();
                }
            }
        }
        return resourceId;
    }

    public final boolean k(Context context) {
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

    public final boolean l(Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        OplusExtraConfiguration oplusExtraConfigurationF = f(context.getResources().getConfiguration());
        int i = oplusExtraConfigurationF != null ? oplusExtraConfigurationF.mUserId : 0;
        String str = "data/theme/";
        if (i > 0) {
            str = "data/theme/" + i;
        }
        return new File(str, packageName).exists();
    }

    public boolean m(Context context) {
        long jLongValue;
        boolean zK;
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration == null || !b()) {
            return false;
        }
        OplusExtraConfiguration oplusExtraConfigurationF = f(context.getResources().getConfiguration());
        if (oplusExtraConfigurationF != null) {
            jLongValue = oplusExtraConfigurationF.mThemeChangedFlags;
        } else {
            try {
                Class<?> cls = Class.forName(f14977c);
                jLongValue = cls.newInstance() != null ? ((Long) cls.getMethod("getThemeChangedFlags", Configuration.class).invoke(null, configuration)).longValue() : 0L;
            } catch (Exception e2) {
                fjc.b("NearThemeOverlay", "isRejectTheme e: " + e2);
            }
        }
        if ((1 & jLongValue) != 0) {
            zK = (jLongValue & 256) != 0 ? k(context) : l(context);
        } else {
            zK = false;
        }
        return zK && (configuration.uiMode & 48) != 32;
    }

    public final void q(Context context) {
        int iJ;
        int i;
        if (context == null || m(context)) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R$attr.nxThemeIdentifier});
        int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        long jH = h(context.getResources().getConfiguration());
        int i2 = (int) (xnl.PAYLOAD_SHORT_MAX & jH);
        int i3 = (int) (16711680 & jH);
        boolean z = d < 12000;
        if (jH != 0) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (i3 == 131072) {
                r(R$id.nx_global_theme, R$style.NearOverlay_Theme_Single_First);
                return;
            }
            if (i3 != 65536) {
                if (i3 == 262144) {
                    iJ = R$array.nx_theme_arrays_default_patch;
                } else if (i3 == 0 || i3 == 1048576) {
                    iJ = j(context, i2, i3);
                } else {
                    i = 0;
                    i2 = -1;
                }
                int i4 = integer - 1;
                i = iJ;
                i2 = i4;
            } else if (f) {
                i = i(context, z ? "nx_theme_arrays_single_repatch_p" : "nx_theme_arrays_single_patch_p", "array");
            } else {
                i = R$array.nx_theme_arrays_single;
            }
            if (i == 0 || i2 == -1) {
                return;
            }
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
            if (typedArrayObtainTypedArray.length() > i2) {
                int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                context.getResources().getResourceEntryName(resourceId);
                r(R$id.nx_global_theme, resourceId);
            }
            typedArrayObtainTypedArray.recycle();
        }
    }

    public void r(@IdRes int i, @StyleRes int i2) {
        this.a.put(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T s(Class<T> cls, Object obj) {
        if (obj == 0 || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }
}
