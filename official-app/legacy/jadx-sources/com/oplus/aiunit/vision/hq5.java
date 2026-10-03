package com.oplus.aiunit.vision;

import com.oplus.wrapper.os.SystemProperties;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/hq5;", "", "", "key", "", "defaultValue", "a", "", "b", "d", "c", "Ljava/lang/String;", "characteristics", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class hq5 {

    @NotNull
    public static final hq5 INSTANCE = new hq5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static volatile String characteristics = "";

    @JvmStatic
    public static final boolean a(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return SystemProperties.getBoolean(key, defaultValue);
        } catch (Exception e2) {
            f7b.d(qug.TAG, Intrinsics.stringPlus("getStringProperty: exception msg = ", e2.getMessage()));
            return defaultValue;
        }
    }

    @JvmStatic
    public static final int b(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return SystemProperties.getInt(key, defaultValue);
        } catch (Exception e2) {
            f7b.d(qug.TAG, Intrinsics.stringPlus("getStringProperty: exception msg = ", e2.getMessage()));
            return defaultValue;
        }
    }

    @JvmStatic
    @NotNull
    public static final String c(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            String str = SystemProperties.get(key, defaultValue);
            Intrinsics.checkNotNullExpressionValue(str, "{\n            SystemProp…, defaultValue)\n        }");
            return str;
        } catch (Exception e2) {
            f7b.d(qug.TAG, Intrinsics.stringPlus("getStringProperty: exception msg = ", e2.getMessage()));
            return defaultValue;
        }
    }

    @JvmStatic
    public static final boolean d() {
        if (characteristics.length() == 0) {
            f7b.d(qug.TAG, "real get characteristics");
            String str = SystemProperties.get("ro.build.characteristics");
            Intrinsics.checkNotNullExpressionValue(str, "get(\"ro.build.characteristics\")");
            characteristics = str;
        }
        if (characteristics.length() == 0) {
            return false;
        }
        f7b.d(qug.TAG, Intrinsics.stringPlus("characteristics = ", characteristics));
        return StringsKt__StringsKt.contains$default((CharSequence) characteristics, (CharSequence) "tablet", false, 2, (Object) null);
    }
}
