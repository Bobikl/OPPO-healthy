package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import feedbackg.feedbackh;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class dxm {

    @NotNull
    public static final Handler feedbacka = new Handler(Looper.getMainLooper());

    public static final void a(@NotNull final feedbackh.feedbacka block, final feedbackh feedbackhVar) {
        Intrinsics.checkNotNullParameter(block, "block");
        feedbacka.post(new Runnable() { // from class: com.oplus.aiunit.vision.bxm
            @Override // java.lang.Runnable
            public final void run() {
                dxm.b(block, feedbackhVar);
            }
        });
    }

    public static final void b(Function1 block, Object obj) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(obj);
    }
}
