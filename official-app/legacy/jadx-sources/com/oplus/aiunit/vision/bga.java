package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/bga;", "Lcom/oplus/aiunit/vision/pn9;", "Landroid/content/Context;", "context", "", "a", "Ljava/lang/String;", "validItems", "<init>", "(Ljava/lang/String;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class bga implements pn9 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String validItems;

    public bga(@Nullable String str) {
        this.validItems = str;
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        t23 t23Var = t23.INSTANCE;
        String str = this.validItems;
        if (str == null) {
            str = "";
        }
        return t23Var.c(context, str, true);
    }
}
