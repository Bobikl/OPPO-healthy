package com.heytap.sports.move.treadmill.ui.nfc;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.sports.move.treadmill.ui.nfc.SingleEventData;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class SingleEventData extends MutableLiveData<a> {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static class a {
        public int a;
        public Map<String, Object> b;

        public a(int i, Map<String, Object> map) {
            this.a = i;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Observer observer, a aVar) {
        if (this.a.compareAndSet(true, false)) {
            observer.onChanged(aVar);
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void setValue(@Nullable a aVar) {
        this.a.set(true);
        super.setValue(aVar);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<? super a> observer) {
        super.observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.z5h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.b(observer, (SingleEventData.a) obj);
            }
        });
    }
}
