package com.oplus.aiunit.vision;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/mxc;", "", "Landroid/content/Context;", "context", "", "b", "a", "c", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class mxc {

    @NotNull
    public static final mxc INSTANCE = new mxc();

    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).isKeyguardLocked();
    }

    public final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        if (!((PowerManager) systemService).isInteractive()) {
            return true;
        }
        Object systemService2 = context.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService2).isKeyguardLocked();
    }

    public final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isInteractive();
    }
}
