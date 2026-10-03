package com.oplus.aiunit.vision;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/w6e;", "", "Landroid/content/Context;", "context", "", "a", "Ljava/lang/Boolean;", "isUmsSupportCardService", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class w6e {

    @NotNull
    public static final w6e INSTANCE = new w6e();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Boolean isUmsSupportCardService;

    @JvmStatic
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = isUmsSupportCardService;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(y6e.f(context));
        isUmsSupportCardService = boolValueOf;
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }
}
