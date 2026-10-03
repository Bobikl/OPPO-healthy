package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ftf {
    public final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final etf<T> b;

        public a(@NonNull Class<T> cls, @NonNull etf<T> etfVar) {
            this.a = cls;
            this.b = etfVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull etf<Z> etfVar) {
        this.a.add(new a<>(cls, etfVar));
    }

    @Nullable
    public synchronized <Z> etf<Z> b(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (etf<Z>) aVar.b;
            }
        }
        return null;
    }
}
