package com.oplus.aiunit.vision;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\"\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/s6b;", "", "", "tag", "msg", "", "b", "a", "c", "message", "d", "", "I", "level", "", "Z", "isDebugMode", "()Z", "setDebugMode", "(Z)V", "<init>", "()V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final class s6b {

    @NotNull
    public static final s6b INSTANCE = new s6b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int level = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isDebugMode = true;

    public final void a(@Nullable String msg) {
        if (isDebugMode && level <= 3) {
            Log.d("sfx_", d(msg));
        }
    }

    public final void b(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (isDebugMode && level <= 3) {
            Log.d("sfx_" + tag, d(msg));
        }
    }

    public final void c(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (isDebugMode && level <= 6) {
            Log.e("sfx_" + tag, d(msg));
        }
    }

    public final String d(String message) {
        return message == null || message.length() == 0 ? "null or empty" : message;
    }
}
