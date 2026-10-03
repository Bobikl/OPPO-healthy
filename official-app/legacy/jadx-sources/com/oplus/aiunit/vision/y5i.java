package com.oplus.aiunit.vision;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/y5i;", "", "", "tag", "msg", "", "tr", "", "a", "d", "c", "", "Z", "getOpenLog", "()Z", "setOpenLog", "(Z)V", "openLog", "<init>", "()V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
public final class y5i {

    @NotNull
    public static final y5i INSTANCE = new y5i();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean openLog = true;

    public static /* synthetic */ void b(y5i y5iVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        y5iVar.a(str, str2, th);
    }

    public static /* synthetic */ void e(y5i y5iVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        y5iVar.d(str, str2, th);
    }

    public final void a(@NotNull String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (openLog) {
            Log.d(tag, msg, tr);
        }
    }

    public final void c(@NotNull String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.e(tag, msg, tr);
    }

    public final void d(@NotNull String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.w(tag, msg, tr);
    }
}
