package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.oplus.seedling.sdk.SeedlingSdk;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q6e {

    @NotNull
    public static final q6e INSTANCE = new q6e();

    @JvmStatic
    @WorkerThread
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SeedlingSdk.isSupportFluidCloud(context);
    }
}
