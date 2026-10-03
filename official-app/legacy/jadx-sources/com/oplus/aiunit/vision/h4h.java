package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class h4h<T> implements usf<T> {
    public final T i;

    public h4h(@NonNull T t) {
        this.i = (T) cpe.d(t);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<T> a() {
        return (Class<T>) this.i.getClass();
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public final T get() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.usf
    public final int getSize() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
    }
}
