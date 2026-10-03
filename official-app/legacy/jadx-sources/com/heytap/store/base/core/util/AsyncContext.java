package com.heytap.store.base.core.util;

import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/util/AsyncContext;", ExifInterface.GPS_DIRECTION_TRUE, "", "weakRef", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "getWeakRef", "()Ljava/lang/ref/WeakReference;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AsyncContext<T> {

    @NotNull
    private final WeakReference<T> weakRef;

    public AsyncContext(@NotNull WeakReference<T> weakRef) {
        Intrinsics.checkNotNullParameter(weakRef, "weakRef");
        this.weakRef = weakRef;
    }

    @NotNull
    public final WeakReference<T> getWeakRef() {
        return this.weakRef;
    }
}
