package com.oplus.aiunit.vision;

import android.view.View;
import androidx.core.view.ViewCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/fmc;", "", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class fmc {

    @NotNull
    public static final fmc INSTANCE = new fmc();

    @JvmStatic
    public static final boolean a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewCompat.getLayoutDirection(view) == 1;
    }
}
