package com.heytap.connect_dns;

import android.annotation.SuppressLint;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect_dns/ContextHolder;", "", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"StaticFieldLeak"})
public final class ContextHolder {

    @NotNull
    public static final ContextHolder INSTANCE = new ContextHolder();
    public static Context context;

    private ContextHolder() {
    }

    @NotNull
    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        throw null;
    }

    public final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        context = context2;
    }
}
