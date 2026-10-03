package io.reactivex.rxjava3.disposables;

import com.oplus.aiunit.vision.c3j;

/* JADX INFO: loaded from: classes10.dex */
final class SubscriptionDisposable extends ReferenceDisposable<c3j> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(c3j c3jVar) {
        super(c3jVar);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(c3j c3jVar) {
        c3jVar.cancel();
    }
}
