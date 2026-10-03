package com.oplus.aiunit.vision;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class vzj<T> {
    public final T a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f18063c;

    public vzj(T t, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(t, "value is null");
        this.a = t;
        this.b = j2;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f18063c = timeUnit;
    }

    public long a() {
        return this.b;
    }

    public T b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vzj)) {
            return false;
        }
        vzj vzjVar = (vzj) obj;
        return Objects.equals(this.a, vzjVar.a) && this.b == vzjVar.b && Objects.equals(this.f18063c, vzjVar.f18063c);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j2 = this.b;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 31)))) * 31) + this.f18063c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.f18063c + ", value=" + this.a + "]";
    }
}
