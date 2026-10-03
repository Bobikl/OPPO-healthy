package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.ocrclient.utils.Utils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ged {

    @NotNull
    public static final ged INSTANCE = new ged();

    @JvmStatic
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context) || (p0.h(context) && c(context));
    }

    @JvmStatic
    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n0.Companion.k(n0.INSTANCE, context, "offline_ocr", null, 4, null) || Utils.isOcrServiceAndSupportOcr(context);
    }

    @JvmStatic
    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Utils.isCompatOcrSupported(context);
    }
}
