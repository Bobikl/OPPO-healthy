package com.heytap.store.platform.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import com.heytap.store.base.core.http.HttpConst;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\b\u0010 \u001a\u00020\u0004H\u0007J\u0006\u0010!\u001a\u00020\u0004J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u0004J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020(H\u0007J\u0012\u0010)\u001a\u00020(2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010*\u001a\u00020(J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/heytap/store/platform/tools/DeviceUtils;", "", "()V", "BRAND_OPPO", "", "BRAND_REALME", "FEATURE_ONE_PLUS_DEVICE", "KEY_ONE_PLUS_SECURITY_UUID", "METHOD_QUERY_ONE_PLUS_SECURITY_UUID", "ONE_PLUS_BRAND", "ONE_PLUS_SECURITY_URI", HttpConst.UDID, "capitalize", "str", "getAndroidId", "getAppPackageName", "getAppVersionCode", "", "packageName", "getAppVersionName", "getBrand", "getDeviceName", "getDeviceUUID", "context", "Landroid/content/Context;", "getIMEI", "getOPSafeUUID", "getOSVersion", "getPhoneModel", "getPhoneName", "getScreenHeight", "getScreenWidth", "getSerialNumber", "getSystemVersion", "getUdid", "prefix", "id", "getUniqueDeviceId", "getUniqueDeviceIdReal", "isOPPOMobile", "", "isOnePlusMobile", "isREALMEMobile", "saveUdid", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class DeviceUtils {
    private static final String BRAND_OPPO = "OPPO";
    private static final String BRAND_REALME = "REALME";
    private static final String FEATURE_ONE_PLUS_DEVICE = "com.oneplus.software.oos";
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final String KEY_ONE_PLUS_SECURITY_UUID = "op_security_uuid";
    private static final String METHOD_QUERY_ONE_PLUS_SECURITY_UUID = "query_oneplus_security_uuid";
    private static final String ONE_PLUS_BRAND = "ONEPLUS";
    private static final String ONE_PLUS_SECURITY_URI = "content://com.oneplus.security.database.SafeProvider";
    private static volatile String udid;

    private DeviceUtils() {
    }

    private final String capitalize(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        String str2 = "";
        boolean z = true;
        for (char c2 : charArray) {
            if (z && Character.isLetter(c2)) {
                str2 = str2 + Character.toUpperCase(c2);
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                str2 = str2 + c2;
            }
        }
        return str2;
    }

    private final String getOPSafeUUID(Context context) {
        String string;
        try {
            Bundle bundleCall = context.getContentResolver().call(Uri.parse(ONE_PLUS_SECURITY_URI), METHOD_QUERY_ONE_PLUS_SECURITY_UUID, (String) null, (Bundle) null);
            if (bundleCall != null && (string = bundleCall.getString(KEY_ONE_PLUS_SECURITY_UUID)) != null) {
                return string;
            }
            return getUniqueDeviceId();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private final String getUdid(String prefix, String id) {
        if (Intrinsics.areEqual(id, "")) {
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "UUID.randomUUID().toString()");
            sb.append(StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Charset charset = Charsets.UTF_8;
        if (id == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = id.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String string2 = UUID.nameUUIDFromBytes(bytes).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "UUID.nameUUIDFromBytes(i…toByteArray()).toString()");
        sb2.append(StringsKt__StringsJVMKt.replace$default(string2, "-", "", false, 4, (Object) null));
        return sb2.toString();
    }

    private final String getUniqueDeviceIdReal(String prefix) {
        try {
            String androidId = getAndroidId();
            if (!TextUtils.isEmpty(androidId)) {
                return saveUdid(prefix + 2, androidId);
            }
        } catch (Exception unused) {
        }
        return saveUdid(prefix + 9, "");
    }

    @JvmStatic
    public static final boolean isOPPOMobile() {
        return StringsKt__StringsJVMKt.equals("OPPO", INSTANCE.getBrand(), true);
    }

    public static /* synthetic */ boolean isOnePlusMobile$default(DeviceUtils deviceUtils, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return deviceUtils.isOnePlusMobile(context);
    }

    private final String saveUdid(String prefix, String id) {
        udid = getUdid(prefix, id);
        String str = udid;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @SuppressLint({"HardwareIds"})
    @NotNull
    public final String getAndroidId() {
        return "";
    }

    @NotNull
    public final String getAppPackageName() {
        String packageName = ContextGetterUtils.INSTANCE.getApp().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getApp().packageName");
        return packageName;
    }

    public final int getAppVersionCode() {
        return getAppVersionCode(getAppPackageName());
    }

    @Nullable
    public final String getAppVersionName() {
        return getAppVersionName(getAppPackageName());
    }

    @NotNull
    public final String getBrand() {
        String str = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str, "Build.BRAND");
        return str;
    }

    @NotNull
    public final String getDeviceName() {
        String str = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(str, "Build.PRODUCT");
        return str;
    }

    @NotNull
    public final String getDeviceUUID(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isOnePlusMobile(context)) {
            String oPSafeUUID = getOPSafeUUID(context);
            return oPSafeUUID == null || StringsKt__StringsJVMKt.isBlank(oPSafeUUID) ? getAndroidId() : oPSafeUUID;
        }
        String uniqueDeviceId = getUniqueDeviceId();
        return uniqueDeviceId != null ? uniqueDeviceId : "";
    }

    @Nullable
    public final String getIMEI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return "";
    }

    @NotNull
    public final String getOSVersion() {
        RomUtils.RomInfo romInfo = RomUtils.INSTANCE.getRomInfo();
        String version = romInfo != null ? romInfo.getVersion() : null;
        return version != null ? version : "";
    }

    @NotNull
    public final String getPhoneModel() {
        String strReplace;
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        return (string == null || (strReplace = new Regex("\\s*").replace(string, "")) == null) ? "" : strReplace;
    }

    @NotNull
    public final String getPhoneName() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(model, "model");
        Intrinsics.checkNotNullExpressionValue(manufacturer, "manufacturer");
        if (StringsKt__StringsJVMKt.startsWith$default(model, manufacturer, false, 2, null)) {
            return capitalize(model);
        }
        return capitalize(manufacturer) + " " + model;
    }

    public final int getScreenHeight() {
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public final int getScreenWidth() {
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    @SuppressLint({"HardwareIds"})
    @NotNull
    public final String getSerialNumber() {
        try {
            Class<?> cls = Class.forName("android.os.Build");
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"android.os.Build\")");
            Method method = cls.getMethod("getSerial", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "buildClass.getMethod(\"getSerial\")");
            Object objInvoke = method.invoke(cls, new Object[0]);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final String getSystemVersion() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "Build.VERSION.RELEASE");
        return str;
    }

    @Nullable
    public final String getUniqueDeviceId() {
        return getUniqueDeviceId("");
    }

    public final boolean isOnePlusMobile(@Nullable Context context) {
        PackageManager packageManager;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            return packageManager.hasSystemFeature(FEATURE_ONE_PLUS_DEVICE);
        }
        String brand = getBrand();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (brand == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = brand.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return StringsKt__StringsJVMKt.startsWith$default(upperCase, ONE_PLUS_BRAND, false, 2, null);
    }

    public final boolean isREALMEMobile() {
        String brand = getBrand();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (brand == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = brand.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return StringsKt__StringsJVMKt.startsWith$default(upperCase, BRAND_REALME, false, 2, null);
    }

    public final int getAppVersionCode(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (StringsKt__StringsJVMKt.isBlank(packageName)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = ContextGetterUtils.INSTANCE.getApp().getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    @Nullable
    public final String getAppVersionName(@Nullable String packageName) {
        if (packageName == null || StringsKt__StringsJVMKt.isBlank(packageName)) {
            return "";
        }
        try {
            PackageInfo packageInfo = ContextGetterUtils.INSTANCE.getApp().getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo != null ? packageInfo.versionName : null;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Nullable
    public final String getUniqueDeviceId(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (udid == null) {
            synchronized (DeviceUtils.class) {
                if (udid == null) {
                    return INSTANCE.getUniqueDeviceIdReal(prefix);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return udid;
    }
}
