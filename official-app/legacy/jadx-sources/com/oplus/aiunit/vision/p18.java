package com.oplus.aiunit.vision;

import java.util.Timer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/p18;", "", "", "b", "", "c", "Ljava/util/Timer;", "a", "Ljava/util/Timer;", "timer", "Z", "()Z", "d", "(Z)V", "isNeedResendMessage", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class p18 {

    @NotNull
    public static final p18 INSTANCE = new p18();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Timer timer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isNeedResendMessage;

    public final boolean a() {
        return isNeedResendMessage;
    }

    public final boolean b() {
        return timer != null;
    }

    public final void c() {
        if (timer != null) {
            t7b.INSTANCE.b("GLSBMessageProcessor", "killTimer");
            Timer timer2 = timer;
            if (timer2 != null) {
                timer2.cancel();
            }
            timer = null;
        }
    }

    public final void d(boolean z) {
        isNeedResendMessage = z;
    }
}
