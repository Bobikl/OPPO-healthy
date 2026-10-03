package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/sm0;", "", "Landroid/content/Context;", "context", "", "a", "c", "", "b", "META_KEY_AUTH_STYLE", "Ljava/lang/String;", "AUTH_STYLE_INNER", "metaAuthStyle", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class sm0 {

    @NotNull
    public static final String AUTH_STYLE_INNER = "0";

    @NotNull
    public static final sm0 INSTANCE = new sm0();

    @NotNull
    public static final String META_KEY_AUTH_STYLE = "com.oplus.aiunit.auth_style";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String metaAuthStyle;

    @JvmStatic
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.checkSelfPermission("com.oppo.permission.safe.AUTHENTICATE") == 0 || context.checkSelfPermission("com.oplus.permission.safe.AUTHENTICATE") == 0 || context.checkSelfPermission("oppo.permission.OPPO_COMPONENT_SAFE") == 0 || context.checkSelfPermission(AbsCallInterceptionHandlerKt.OPLUS_COMPONENT_SAFE) == 0;
    }

    @JvmStatic
    @NotNull
    public static final String b(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = metaAuthStyle;
        if (str != null) {
            return str;
        }
        String strD = p0.d(context, META_KEY_AUTH_STYLE);
        metaAuthStyle = strD;
        return strD;
    }

    @JvmStatic
    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.areEqual(b(context), "0");
    }
}
