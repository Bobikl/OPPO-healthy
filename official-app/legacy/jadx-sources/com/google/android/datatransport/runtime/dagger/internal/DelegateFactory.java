package com.google.android.datatransport.runtime.dagger.internal;

import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private b2f<T> delegate;

    public static <T> void setDelegate(b2f<T> b2fVar, b2f<T> b2fVar2) {
        Preconditions.checkNotNull(b2fVar2);
        DelegateFactory delegateFactory = (DelegateFactory) b2fVar;
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = b2fVar2;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public T get() {
        b2f<T> b2fVar = this.delegate;
        if (b2fVar != null) {
            return b2fVar.get();
        }
        throw new IllegalStateException();
    }

    public b2f<T> getDelegate() {
        return (b2f) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(b2f<T> b2fVar) {
        setDelegate(this, b2fVar);
    }
}
