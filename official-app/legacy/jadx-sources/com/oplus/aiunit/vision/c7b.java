package com.oplus.aiunit.vision;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/c7b;", "", "", "tag", "msg", "", "a", "", "Z", "sDebug", "b", "Ljava/lang/String;", "sTagHead", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class c7b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean sDebug;

    @NotNull
    public static final c7b INSTANCE = new c7b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static String sTagHead = "Capsule.Sdk.";

    public final void a(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sDebug) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.d(str, sb.toString());
        }
    }
}
