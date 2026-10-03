package com.oplus.web.container.webview.utils;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SingleLiveData<T> extends MutableLiveData<T> {
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Observer observer, Object obj) {
        if (this.a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<? super T> observer) {
        super/*androidx.lifecycle.LiveData*/.observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.y9h
            public final void onChanged(Object obj) {
                this.i.b(observer, obj);
            }
        });
    }

    @MainThread
    public void setValue(@Nullable T t) {
        this.a.set(true);
        super.setValue(t);
    }
}
