package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/duc;", "", "Landroid/os/Looper;", "a", "Landroid/os/Looper;", "sLooper", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class duc {

    @NotNull
    public static final duc INSTANCE = new duc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static volatile Looper sLooper;

    @NotNull
    public final Looper a() {
        Looper looper;
        Looper looper2 = sLooper;
        if (looper2 == null) {
            synchronized (duc.class) {
                HandlerThread handlerThread = new HandlerThread("non-block");
                handlerThread.start();
                looper = handlerThread.getLooper();
                Unit unit = Unit.INSTANCE;
            }
            looper2 = looper;
        }
        Intrinsics.checkNotNull(looper2);
        return looper2;
    }
}
