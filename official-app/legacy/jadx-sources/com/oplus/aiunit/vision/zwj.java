package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/zwj;", "", "", "delayMillis", "Lkotlin/Function0;", "", "work", "a", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "<init>", "()V", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
public final class zwj {
    public static final zwj INSTANCE = new zwj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Handler uiHandler = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void b(zwj zwjVar, long j2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = 0;
        }
        zwjVar.a(j2, function0);
    }

    public final void a(long delayMillis, @NotNull Function0<Unit> work) {
        Intrinsics.checkNotNullParameter(work, "work");
        uiHandler.postDelayed(new ywj(work), delayMillis);
    }
}
