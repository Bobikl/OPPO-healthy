package com.oplus.aiunit.vision;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/j94;", "", "", "count", "Lkotlin/Function0;", "", "task", "a", "I", "CLICK_COUNT", "", "b", "J", "DURATION", "", "c", "[J", "mClickArray", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class j94 {

    @NotNull
    public static final j94 INSTANCE = new j94();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final int CLICK_COUNT = 5;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long DURATION = 2500;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static long[] mClickArray = new long[5];

    public final void a(int count, @NotNull Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        long[] jArr = mClickArray;
        System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
        long[] jArr2 = mClickArray;
        jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
        if (mClickArray[0] >= SystemClock.uptimeMillis() - DURATION) {
            mClickArray = new long[CLICK_COUNT];
            task.invoke();
        }
    }
}
