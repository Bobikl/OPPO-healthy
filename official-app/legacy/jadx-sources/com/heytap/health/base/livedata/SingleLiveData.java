package com.heytap.health.base.livedata;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class SingleLiveData<T> extends MutableLiveData<T> {
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Observer observer, Object obj) {
        if (this.a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Observer observer, Object obj) {
        if (this.a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<? super T> observer) {
        super.observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.i6h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.c(observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NonNull final Observer<? super T> observer) {
        super.observeForever(new Observer() { // from class: com.oplus.aiunit.vision.h6h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.d(observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        this.a.set(true);
        super.postValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t) {
        this.a.set(true);
        super.setValue(t);
    }
}
