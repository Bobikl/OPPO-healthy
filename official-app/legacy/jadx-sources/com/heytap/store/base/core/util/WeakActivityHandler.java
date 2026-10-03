package com.heytap.store.base.core.util;

import android.app.Activity;
import com.heytap.store.base.core.util.exposure.WeakHandler;

/* JADX INFO: loaded from: classes3.dex */
public class WeakActivityHandler<T extends Activity> extends WeakHandler<T> {
    public WeakActivityHandler(T t) {
        super(t);
    }

    @Override // com.heytap.store.base.core.util.exposure.WeakHandler
    public T getReference() {
        return (T) super.getReference();
    }
}
