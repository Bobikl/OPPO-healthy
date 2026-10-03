package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lpf implements kpf {
    public final Map<uye, Object> a = new HashMap(3);

    @Override // com.oplus.aiunit.vision.kpf
    @Nullable
    public <T> T a(@NonNull uye<T> uyeVar) {
        return (T) this.a.get(uyeVar);
    }

    @Override // com.oplus.aiunit.vision.kpf
    public <T> void b(@NonNull uye<T> uyeVar, @Nullable T t) {
        if (t == null) {
            this.a.remove(uyeVar);
        } else {
            this.a.put(uyeVar, t);
        }
    }
}
