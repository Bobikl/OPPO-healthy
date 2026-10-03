package com.google.android.gms.internal.mlkit_vision_barcode;

import com.heytap.store.base.core.http.HttpUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes13.dex */
abstract class zzbs implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzax.zza(getKey(), entry.getKey()) && zzax.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return String.valueOf(getKey()) + HttpUtils.EQUAL_SIGN + String.valueOf(getValue());
    }
}
