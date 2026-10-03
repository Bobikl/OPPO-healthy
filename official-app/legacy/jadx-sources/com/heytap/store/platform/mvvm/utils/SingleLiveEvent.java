package com.heytap.store.platform.mvvm.utils;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0000\u0012\u0004\u0018\u00018\u00000\fH\u0017J\u0019\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/mvvm/utils/SingleLiveEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "Companion", "MVVM_release"}, k = 1, mv = {1, 1, 15})
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    private static final String TAG = "SingleLiveEvent";
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "t", "onChanged", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Observer f8283j;

        public a(Observer observer) {
            this.f8283j = observer;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable T t) {
            if (SingleLiveEvent.this.mPending.compareAndSet(true, false)) {
                this.f8283j.onChanged(t);
            }
        }
    }

    @MainThread
    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super T> observer) {
        Intrinsics.checkParameterIsNotNull(owner, "owner");
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (hasActiveObservers()) {
            Log.w(TAG, "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, new a(observer));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@androidx.annotation.Nullable @Nullable T t) {
        this.mPending.set(true);
        super.setValue(t);
    }
}
