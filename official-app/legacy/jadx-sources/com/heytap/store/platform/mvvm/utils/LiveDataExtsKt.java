package com.heytap.store.platform.mvvm.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007¨\u0006\b"}, d2 = {"observeOnce", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "MVVM_release"}, k = 2, mv = {1, 1, 15})
public final class LiveDataExtsKt {
    public static final <T> void observeOnce(@NotNull final LiveData<T> observeOnce, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<T> observer) {
        Intrinsics.checkParameterIsNotNull(observeOnce, "$this$observeOnce");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        observeOnce.observe(lifecycleOwner, new Observer<T>() { // from class: com.heytap.store.platform.mvvm.utils.LiveDataExtsKt.observeOnce.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable T t) {
                observer.onChanged(t);
                observeOnce.removeObserver(this);
            }
        });
    }
}
