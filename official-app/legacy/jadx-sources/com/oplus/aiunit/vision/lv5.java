package com.oplus.aiunit.vision;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lv5<T> implements wu7<T>, cv5 {
    public final AtomicReference<c3j> i = new AtomicReference<>();

    public final void a() {
        dispose();
    }

    public void b() {
        this.i.get().request(Long.MAX_VALUE);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final void dispose() {
        SubscriptionHelper.cancel(this.i);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final boolean isDisposed() {
        return this.i.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (kn6.d(this.i, c3jVar, getClass())) {
            b();
        }
    }
}
