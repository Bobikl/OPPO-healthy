package com.heytap.store.platform.tools;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.oplus.aiunit.vision.qbm;
import com.oplus.aiunit.vision.xni;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.smartenginehelper.ParserTag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J1\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0002\u0010+R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/heytap/store/platform/tools/RomUtils;", "", "()V", "ROM_GOOGLE", "", "", "[Ljava/lang/String;", "ROM_LG", "ROM_MEIZU", "ROM_ONEPLUS", "ROM_OPPO", "ROM_REALME", "ROM_SAMSUNG", "ROM_VIVO", "ROM_XIAOMI", LanConstants.OPERATOR_UNKNOWN, "VERSION_PROPERTY_ONEPLUS", "VERSION_PROPERTY_OPLUS", "VERSION_PROPERTY_OPPO", "VERSION_PROPERTY_VIVO", "VERSION_PROPERTY_XIAOMI", "bean", "Lcom/heytap/store/platform/tools/RomUtils$RomInfo;", "colorOsVersion", "getBrand", "getColorOsVersion", "getManufacturer", "getRomInfo", "getRomName", "getRomVersion", "propertyName", "getSystemProperty", "name", "getSystemPropertyByReflect", "key", "getSystemPropertyByShell", "propName", "getSystemPropertyByStream", "isRightRom", "", "brand", "manufacturer", "names", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z", "RomInfo", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class RomUtils {
    private static final String UNKNOWN = "unknown";
    private static final String VERSION_PROPERTY_ONEPLUS = "ro.rom.version";
    private static final String VERSION_PROPERTY_OPLUS = "ro.build.version.oplusrom";
    private static final String VERSION_PROPERTY_OPPO = "ro.build.version.opporom";
    private static final String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";
    private static final String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";
    private static RomInfo bean;
    private static String colorOsVersion;
    public static final RomUtils INSTANCE = new RomUtils();
    private static final String[] ROM_OPPO = {qbm.b};
    private static final String[] ROM_ONEPLUS = {"oneplus"};
    private static final String[] ROM_REALME = {"realme"};
    private static final String[] ROM_XIAOMI = {xni.a.ROM_MIUI};
    private static final String[] ROM_VIVO = {"vivo"};
    private static final String[] ROM_LG = {"lg", "lge"};
    private static final String[] ROM_GOOGLE = {"google"};
    private static final String[] ROM_SAMSUNG = {"samsung"};
    private static final String[] ROM_MEIZU = {"meizu"};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/store/platform/tools/RomUtils$RomInfo;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "version", "getVersion", "setVersion", "toString", "utils_release"}, k = 1, mv = {1, 4, 0})
    public static final class RomInfo {

        @Nullable
        private String name;

        @Nullable
        private String version;

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setVersion(@Nullable String str) {
            this.version = str;
        }

        @NotNull
        public String toString() {
            return "RomInfo{name=" + this.name + ", version=" + this.version + "}";
        }
    }

    private RomUtils() {
    }

    private final String getBrand() {
        try {
            String brand = Build.BRAND;
            if (TextUtils.isEmpty(brand)) {
                return "unknown";
            }
            Intrinsics.checkNotNullExpressionValue(brand, "brand");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (brand == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = brand.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private final String getColorOsVersion() {
        if (colorOsVersion != null) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"android.os.SystemProperties\")");
                Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
                Intrinsics.checkNotNullExpressionValue(method, "c.getMethod(\"get\", Strin…java, String::class.java)");
                Object objInvoke = method.invoke(cls, new Object[]{VERSION_PROPERTY_OPLUS, ""});
                Object obj = null;
                if (!(objInvoke instanceof String)) {
                    objInvoke = null;
                }
                String str = (String) objInvoke;
                colorOsVersion = str;
                if (TextUtils.isEmpty(str)) {
                    Object objInvoke2 = method.invoke(cls, new Object[]{VERSION_PROPERTY_OPPO, ""});
                    if (objInvoke2 instanceof String) {
                        obj = objInvoke2;
                    }
                    colorOsVersion = (String) obj;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String str2 = colorOsVersion;
        return str2 != null ? str2 : "";
    }

    private final String getManufacturer() {
        try {
            String manufacturer = Build.MANUFACTURER;
            if (TextUtils.isEmpty(manufacturer)) {
                return "unknown";
            }
            Intrinsics.checkNotNullExpressionValue(manufacturer, "manufacturer");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (manufacturer == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = manufacturer.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private final String getSystemProperty(String name) throws Throwable {
        String systemPropertyByShell = getSystemPropertyByShell(name);
        if (!TextUtils.isEmpty(systemPropertyByShell)) {
            return systemPropertyByShell;
        }
        String systemPropertyByStream = getSystemPropertyByStream(name);
        TextUtils.isEmpty(systemPropertyByStream);
        return systemPropertyByStream;
    }

    private final String getSystemPropertyByReflect(String key) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"android.os.SystemProperties\")");
            Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "clz.getMethod(\"get\", Str…java, String::class.java)");
            Object objInvoke = method.invoke(cls, key, "");
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return "";
        }
    }

    private final String getSystemPropertyByShell(String propName) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                Process p = Runtime.getRuntime().exec("getprop " + propName);
                Intrinsics.checkNotNullExpressionValue(p, "p");
                bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()), 1024);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        return line;
                    }
                    bufferedReader.close();
                    return "";
                } catch (IOException unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        return "";
                    }
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                return "";
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    private final String getSystemPropertyByStream(String key) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            String property = properties.getProperty(key, "");
            Intrinsics.checkNotNullExpressionValue(property, "prop.getProperty(key, \"\")");
            return property;
        } catch (Exception unused) {
            return "";
        }
    }

    private final boolean isRightRom(String brand, String manufacturer, String... names) {
        for (String str : names) {
            if (StringsKt__StringsKt.contains$default((CharSequence) brand, (CharSequence) str, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) manufacturer, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final RomInfo getRomInfo() {
        RomInfo romInfo = bean;
        if (romInfo != null) {
            return romInfo;
        }
        bean = new RomInfo();
        String brand = getBrand();
        String manufacturer = getManufacturer();
        String[] strArr = ROM_VIVO;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            RomInfo romInfo2 = bean;
            if (romInfo2 != null) {
                romInfo2.setName(strArr[0]);
            }
            RomInfo romInfo3 = bean;
            if (romInfo3 != null) {
                romInfo3.setVersion(getRomVersion(VERSION_PROPERTY_VIVO));
            }
            return bean;
        }
        String[] strArr2 = ROM_XIAOMI;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
            RomInfo romInfo4 = bean;
            if (romInfo4 != null) {
                romInfo4.setName(strArr2[0]);
            }
            RomInfo romInfo5 = bean;
            if (romInfo5 != null) {
                romInfo5.setVersion(getRomVersion(VERSION_PROPERTY_XIAOMI));
            }
            return bean;
        }
        String[] strArr3 = ROM_OPPO;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr3, strArr3.length))) {
            RomInfo romInfo6 = bean;
            if (romInfo6 != null) {
                romInfo6.setName(strArr3[0]);
            }
            RomInfo romInfo7 = bean;
            if (romInfo7 != null) {
                romInfo7.setVersion(getColorOsVersion());
            }
            return bean;
        }
        String[] strArr4 = ROM_ONEPLUS;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr4, strArr4.length))) {
            RomInfo romInfo8 = bean;
            if (romInfo8 != null) {
                romInfo8.setName(strArr4[0]);
            }
            RomInfo romInfo9 = bean;
            if (romInfo9 != null) {
                romInfo9.setVersion(getRomVersion("ro.rom.version"));
            }
            return bean;
        }
        String[] strArr5 = ROM_REALME;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr5, strArr5.length))) {
            RomInfo romInfo10 = bean;
            if (romInfo10 != null) {
                romInfo10.setName(strArr4[0]);
            }
            RomInfo romInfo11 = bean;
            if (romInfo11 != null) {
                romInfo11.setVersion("ColorOS " + getColorOsVersion());
            }
            return bean;
        }
        String[] strArr6 = ROM_LG;
        if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr6, strArr6.length))) {
            RomInfo romInfo12 = bean;
            if (romInfo12 != null) {
                romInfo12.setName(strArr6[0]);
            }
        } else {
            String[] strArr7 = ROM_GOOGLE;
            if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr7, strArr7.length))) {
                RomInfo romInfo13 = bean;
                if (romInfo13 != null) {
                    romInfo13.setName(strArr7[0]);
                }
            } else {
                String[] strArr8 = ROM_SAMSUNG;
                if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr8, strArr8.length))) {
                    RomInfo romInfo14 = bean;
                    if (romInfo14 != null) {
                        romInfo14.setName(strArr8[0]);
                    }
                } else {
                    String[] strArr9 = ROM_MEIZU;
                    if (isRightRom(brand, manufacturer, (String[]) Arrays.copyOf(strArr9, strArr9.length))) {
                        RomInfo romInfo15 = bean;
                        if (romInfo15 != null) {
                            romInfo15.setName(strArr9[0]);
                        }
                    } else {
                        RomInfo romInfo16 = bean;
                        if (romInfo16 != null) {
                            romInfo16.setName(manufacturer);
                        }
                    }
                }
            }
        }
        RomInfo romInfo17 = bean;
        if (romInfo17 != null) {
            romInfo17.setVersion(getRomVersion(""));
        }
        return bean;
    }

    @NotNull
    public final String getRomName() {
        String name;
        RomInfo romInfo = getRomInfo();
        return (romInfo == null || (name = romInfo.getName()) == null) ? "" : name;
    }

    @NotNull
    public final String getRomVersion() {
        String version;
        RomInfo romInfo = getRomInfo();
        return (romInfo == null || (version = romInfo.getVersion()) == null) ? "" : version;
    }

    private final String getRomVersion(String propertyName) {
        String systemProperty = !TextUtils.isEmpty(propertyName) ? getSystemProperty(propertyName) : "";
        if (TextUtils.isEmpty(systemProperty) || Intrinsics.areEqual(systemProperty, "unknown")) {
            try {
                String display = Build.DISPLAY;
                if (!TextUtils.isEmpty(display)) {
                    Intrinsics.checkNotNullExpressionValue(display, "display");
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                    if (display == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = display.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    systemProperty = lowerCase;
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(systemProperty) ? "unknown" : systemProperty;
    }
}
