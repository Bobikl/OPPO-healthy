package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class ProviderOfLazy<T> implements b2f<Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final b2f<T> provider;

    private ProviderOfLazy(b2f<T> b2fVar) {
        this.provider = b2fVar;
    }

    public static <T> b2f<Lazy<T>> create(b2f<T> b2fVar) {
        return new ProviderOfLazy((b2f) Preconditions.checkNotNull(b2fVar));
    }

    @Override // com.oplus.aiunit.vision.b2f
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
