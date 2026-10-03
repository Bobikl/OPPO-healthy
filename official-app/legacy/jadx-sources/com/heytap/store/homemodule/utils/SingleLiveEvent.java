package com.heytap.store.homemodule.utils;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.store.homemodule.utils.SingleLiveEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0000\u0012\u0004\u0018\u00018\u00000\fH\u0017J\u0019\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/homemodule/utils/SingleLiveEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {

    @NotNull
    private static final String TAG = "SingleLiveEvent";

    @NotNull
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observe$lambda-0, reason: not valid java name */
    public static final void m4979observe$lambda0(SingleLiveEvent this$0, Observer observer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        if (this$0.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @MainThread
    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner owner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (hasActiveObservers()) {
            Log.w(TAG, "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, new Observer() { // from class: com.oplus.aiunit.vision.j6h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvent.m4979observe$lambda0(this.i, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable @org.jetbrains.annotations.Nullable T t) {
        this.mPending.set(true);
        super.setValue(t);
    }
}
