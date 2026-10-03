package com.oplus.cardwidget.serviceLayer;

import android.content.Context;
import androidx.core.content.FileProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/cardwidget/serviceLayer/Provider;", "Landroidx/core/content/FileProvider;", "()V", "getUri", "", "context", "Landroid/content/Context;", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Provider extends FileProvider {

    @NotNull
    public static final Provider INSTANCE = new Provider();

    private Provider() {
    }

    @NotNull
    public final String getUri(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageName() + "hello";
    }
}
