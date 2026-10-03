package com.oplus.aiunit.vision;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/amj;", "", "", "tag", "msg", "", "t", "", "a", "", "Z", "isDebug", "()Z", "setDebug", "(Z)V", "<init>", "()V", "lib_utils_release"}, k = 1, mv = {1, 4, 0})
public final class amj {
    public static final amj INSTANCE = new amj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isDebug;

    public static /* synthetic */ void b(amj amjVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "TLog";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        amjVar.a(str, str2, th);
    }

    public final void a(@NotNull String tag, @NotNull String msg, @NotNull Throwable t) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(msg, "msg");
        Intrinsics.checkParameterIsNotNull(t, "t");
        if (isDebug) {
            Log.w(tag, msg, t);
        }
    }
}
