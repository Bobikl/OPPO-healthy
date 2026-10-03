package com.heytap.store.base.core.util.exposure;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/util/exposure/WeakHandler;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Handler;", "reference", "(Ljava/lang/Object;)V", "getReference", "()Ljava/lang/Object;", "weakReference", "Ljava/lang/ref/WeakReference;", "clear", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class WeakHandler<T> extends Handler {

    @NotNull
    private final WeakReference<T> weakReference;

    public WeakHandler(T t) {
        this.weakReference = new WeakReference<>(t);
    }

    public final void clear() {
        this.weakReference.clear();
    }

    @Nullable
    public T getReference() {
        return this.weakReference.get();
    }
}
