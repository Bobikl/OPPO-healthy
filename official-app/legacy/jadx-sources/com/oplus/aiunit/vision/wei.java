package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/wei;", "", "Lcom/oplus/aiunit/vision/ky9;", "oneTimeSport", "Lcom/oplus/aiunit/vision/ky9;", "a", "()Lcom/oplus/aiunit/vision/ky9;", "b", "(Lcom/oplus/aiunit/vision/ky9;)V", "<init>", "()V", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
public final class wei {

    @NotNull
    public static final wei INSTANCE = new wei();
    public static ky9 oneTimeSport;

    @NotNull
    public final ky9 a() {
        ky9 ky9Var = oneTimeSport;
        if (ky9Var != null) {
            return ky9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oneTimeSport");
        return null;
    }

    public final void b(@NotNull ky9 ky9Var) {
        Intrinsics.checkNotNullParameter(ky9Var, "<set-?>");
        oneTimeSport = ky9Var;
    }
}
