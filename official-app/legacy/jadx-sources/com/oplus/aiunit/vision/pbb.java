package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbb<T, Y> {
    public final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15301c;
    public long d;

    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public pbb(long j2) {
        this.b = j2;
        this.f15301c = j2;
    }

    public void clearMemory() {
        l(0L);
    }

    public final void e() {
        l(this.f15301c);
    }

    @Nullable
    public synchronized Y f(@NonNull T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public synchronized long g() {
        return this.f15301c;
    }

    public int h(@Nullable Y y) {
        return 1;
    }

    public void i(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    public synchronized Y j(@NonNull T t, @Nullable Y y) {
        int iH = h(y);
        long j2 = iH;
        if (j2 >= this.f15301c) {
            i(t, y);
            return null;
        }
        if (y != null) {
            this.d += j2;
        }
        a<Y> aVarPut = this.a.put(t, y == null ? null : new a<>(y, iH));
        if (aVarPut != null) {
            this.d -= (long) aVarPut.b;
            if (!aVarPut.a.equals(y)) {
                i(t, aVarPut.a);
            }
        }
        e();
        return aVarPut != null ? aVarPut.a : null;
    }

    @Nullable
    public synchronized Y k(@NonNull T t) {
        a<Y> aVarRemove = this.a.remove(t);
        if (aVarRemove == null) {
            return null;
        }
        this.d -= (long) aVarRemove.b;
        return aVarRemove.a;
    }

    public synchronized void l(long j2) {
        while (this.d > j2) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= (long) value.b;
            T key = next.getKey();
            it.remove();
            i(key, value.a);
        }
    }
}
