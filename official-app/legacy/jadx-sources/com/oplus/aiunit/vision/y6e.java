package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.os.OplusBuild;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a5\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0010\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0012\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013\u001a\u0016\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000\"\u0014\u0010\u0019\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0014\u0010!\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001a\"\u0014\u0010\"\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001a\"\u0014\u0010#\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001a\"\u0014\u0010$\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001a\"\u0014\u0010%\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001a\"\u0014\u0010&\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001a\"\u0014\u0010'\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006("}, d2 = {"", "currentString", "i", "Landroid/content/Context;", "context", "packageName", "key", "", "defaultValue", "b", ExifInterface.GPS_DIRECTION_TRUE, "metaName", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "providerAuthority", "d", "f", b2n.g, "Ljava/lang/Class;", "clazz", "", b2n.f, TraceConstants.KEY_PKG_NAME, "a", "PACKAGE_NAME_UMS", "Ljava/lang/String;", "PACKAGE_NAME_ASSISTANT_SCREEN", "PACKAGE_NAME_LAUNCHER", "META_DATA_SCENE_SUPPORT", "META_DATA_GCP_LAUNCHER_SCENE_SUPPORT_MIN_OS", "PATH_GROUP_CARD_PLUGIN", "PACKAGE_NAME_HEALTH_EXPORT", "PROVIDER_HEALTH", "PROVIDER_HEALTH_EXPORT", "METANAME_HEALTH_EXPORT", "PACKAGE_NAME_LINK_DOMESTIC", "PACKAGE_NAME_LINK_EXPORT", "PROVIDER_REALME_LINKCN", "PROVIDER_REALME_LINK", "foundation-internal_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPantanalUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantanalUtils.kt\ncom/pantanal/fundation/internal/utils/PantanalUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class y6e {

    @NotNull
    public static final String METANAME_HEALTH_EXPORT = "health.fluid.export";

    @NotNull
    public static final String META_DATA_GCP_LAUNCHER_SCENE_SUPPORT_MIN_OS = "gcpLauncherSceneSupportMinOS";

    @NotNull
    public static final String META_DATA_SCENE_SUPPORT = "com.android.launcher.support.isSupportGroupCardSceneAbility";

    @NotNull
    public static final String PACKAGE_NAME_ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PACKAGE_NAME_HEALTH_EXPORT = "com.heytap.health.international";

    @NotNull
    public static final String PACKAGE_NAME_LAUNCHER = "com.android.launcher";

    @NotNull
    public static final String PACKAGE_NAME_LINK_DOMESTIC = "com.realme.linkcn";

    @NotNull
    public static final String PACKAGE_NAME_LINK_EXPORT = "com.realme.link";

    @NotNull
    public static final String PACKAGE_NAME_UMS = "com.oplus.pantanal.ums";

    @NotNull
    public static final String PATH_GROUP_CARD_PLUGIN = "/card_group_plugin/PantanalCardGroupSdk.apk";

    @NotNull
    public static final String PROVIDER_HEALTH = "com.oplus.card.server.health.provider";

    @NotNull
    public static final String PROVIDER_HEALTH_EXPORT = "com.oplus.card.server.health.international.provider";

    @NotNull
    public static final String PROVIDER_REALME_LINK = "com.realme.link.pantanal.card.provider";

    @NotNull
    public static final String PROVIDER_REALME_LINKCN = "com.realme.linkcn.pantanal.card.provider";

    @NotNull
    public static final String a(@NotNull Context context, @NotNull String pkgName) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(context.getPackageManager().getPackageInfo(pkgName, 0).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, "PantanalUtils", "getAppVersion: error:" + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = "unknown";
        }
        String versionName = (String) objM5287constructorimpl;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        bs9.a.c(t6e.INSTANCE, "PantanalUtils", "getAppVersionName pkgName:" + pkgName + " versionName:" + versionName + ", costTime:" + jCurrentTimeMillis2, false, null, false, 0, false, null, 252, null);
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        return versionName;
    }

    public static final boolean b(@NotNull Context context, @NotNull String packageName, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(key, "key");
        bs9.a.c(t6e.INSTANCE, "PantanalUtils", "getBooleanMetaValue: ", false, null, false, 0, false, null, 252, null);
        try {
            return context.getPackageManager().getApplicationInfo(packageName, 128).metaData.getBoolean(key);
        } catch (Exception e2) {
            bs9.a.b(t6e.INSTANCE, "PantanalUtils", "getMetaInt NameNotFoundException:" + e2.getMessage(), false, null, false, 0, false, null, 252, null);
            return z;
        }
    }

    public static final <T> T c(@NotNull Context context, @NotNull String packageName, @Nullable String str, T t) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.INSTANCE;
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            Object obj = null;
            Object obj2 = bundle != null ? bundle.get(str) : null;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == null) {
                obj = t;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, "PantanalUtils", "Failed to get meta data for " + str + " in " + packageName, false, null, false, 0, false, thM5290exceptionOrNullimpl, 124, null);
        }
        return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? (T) objM5287constructorimpl : t;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    @NotNull
    public static final String d(@Nullable Context context, @Nullable String str) {
        String packageName = context != null ? context.getPackageName() : null;
        if (context != null) {
            if (!(packageName == null || packageName.length() == 0) && Intrinsics.areEqual(str, PROVIDER_HEALTH)) {
                int iHashCode = packageName.hashCode();
                if (iHashCode != -2087464379) {
                    if (iHashCode != -1333369834) {
                        if (iHashCode == -303537808 && packageName.equals(PACKAGE_NAME_LINK_DOMESTIC)) {
                            str = PROVIDER_REALME_LINKCN;
                        }
                    } else if (packageName.equals("com.heytap.health.international")) {
                        if (e(context)) {
                            str = PROVIDER_HEALTH_EXPORT;
                        } else if (str == null) {
                            str = "";
                        }
                    }
                } else if (packageName.equals(PACKAGE_NAME_LINK_EXPORT)) {
                    str = PROVIDER_REALME_LINK;
                }
            } else if (str == null) {
                str = "";
            }
        } else if (str == null) {
            str = "";
        }
        bs9.a.c(t6e.INSTANCE, "PantanalUtils", "providerAuthority:" + str + ",pkgName:" + packageName, false, null, false, 0, false, null, 252, null);
        return str;
    }

    public static final boolean e(@NotNull Context context) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            int iIntValue = ((Number) c(context, "com.heytap.health.international", METANAME_HEALTH_EXPORT, -1)).intValue();
            bs9.a.c(t6e.INSTANCE, "PantanalUtils", "health.fluid.export:" + iIntValue + " ,metaValue=" + iIntValue + " Type=" + Integer.TYPE.getSimpleName(), false, null, false, 0, false, null, 252, null);
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(Intrinsics.areEqual(String.valueOf(iIntValue), "1")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }

    public static final boolean f(@NotNull Context context) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!(OplusBuild.VERSION.SDK_VERSION >= 30)) {
                bs9.a.c(t6e.INSTANCE, "PantanalUtils", "below OS14, card service not running in UMS", false, null, false, 0, false, null, 252, null);
                return false;
            }
            if (!b(context, "com.oplus.pantanal.ums", Constants.META_DATA_CARD_SERVICE_SUPPORT, false)) {
                bs9.a.c(t6e.INSTANCE, "PantanalUtils", "UMS not support card service", false, null, false, 0, false, null, 252, null);
                return false;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
                bs9.a.c(t6e.INSTANCE, "PantanalUtils", "onFailure below OS14, card service not running in UMS", false, null, false, 0, false, null, 252, null);
                return false;
            }
            bs9.a.c(t6e.INSTANCE, "PantanalUtils", "UMS support card service", false, null, false, 0, false, null, 252, null);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void g(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ClassLoader classLoader = clazz.getClassLoader();
        int i = 0;
        bs9.a.c(t6e.INSTANCE, "PantanalUtils", "printClassLoaderTree, the classloader of class(" + clazz + ") is= " + classLoader + "@" + (classLoader != null ? classLoader.hashCode() : 0), false, null, false, 0, false, null, 252, null);
        while (classLoader != null) {
            bs9.a.c(t6e.INSTANCE, "PantanalUtils", "printClassLoaderTree,step = " + i + ",classLoader is= " + classLoader, false, null, false, 0, false, null, 252, null);
            classLoader = classLoader.getParent();
            i++;
        }
    }

    @NotNull
    public static final String h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, ",", " ", false, 4, (Object) null), HttpUtils.EQUAL_SIGN, ":", false, 4, (Object) null);
    }

    @Nullable
    public static final String i(@Nullable String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i % 2 == 0) {
                cCharAt = '*';
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }
}
