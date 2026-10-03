package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
public abstract class LazyInstanceMap<K, V> {

    @GuardedBy("instances")
    private final Map zza = new HashMap();

    @NonNull
    @KeepForSdk
    public abstract V create(@NonNull K k);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k)) {
                return (V) this.zza.get(k);
            }
            V vCreate = create(k);
            this.zza.put(k, vCreate);
            return vCreate;
        }
    }
}
