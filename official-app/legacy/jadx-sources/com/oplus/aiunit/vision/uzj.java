package com.oplus.aiunit.vision;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class uzj<T> {
    public final T a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f17647c;

    public uzj(T t, long j2, TimeUnit timeUnit) {
        this.a = t;
        this.b = j2;
        this.f17647c = (TimeUnit) abd.d(timeUnit, "unit is null");
    }

    public long a() {
        return this.b;
    }

    public T b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uzj)) {
            return false;
        }
        uzj uzjVar = (uzj) obj;
        return abd.c(this.a, uzjVar.a) && this.b == uzjVar.b && abd.c(this.f17647c, uzjVar.f17647c);
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j2 = this.b;
        return (((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 31) + this.f17647c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.f17647c + ", value=" + this.a + "]";
    }
}
