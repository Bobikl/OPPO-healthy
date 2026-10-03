package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mv5<T> implements vu7<T>, io.reactivex.rxjava3.disposables.a {
    public final AtomicReference<c3j> i = new AtomicReference<>();

    public final void a() {
        dispose();
    }

    public void b() {
        this.i.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        SubscriptionHelper.cancel(this.i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return this.i.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (jn6.c(this.i, c3jVar, getClass())) {
            b();
        }
    }
}
