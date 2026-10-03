package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.watch.netnumber.callinterception.CallInterceptionHandler;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/a5l;", "", "Landroid/content/Context;", "context", "", "a", "", "TAG", "Ljava/lang/String;", "", "SERVER_ID", "I", "PATH", "<init>", "()V", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class a5l {

    @NotNull
    public static final a5l INSTANCE = new a5l();

    @NotNull
    public static final String PATH = "/contactnetnumber/sync";
    public static final int SERVER_ID = 16;

    @NotNull
    public static final String TAG = "WNNSyncApp";

    @JvmStatic
    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(TAG, "init() called with: context = [" + context + "]");
        CallInterceptionHandler.INSTANCE.e();
        new xhe();
    }
}
