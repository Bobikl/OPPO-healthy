package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class c7c {
    public Class<?> a;
    public Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f9979c;

    public c7c() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.f9979c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c7c c7cVar = (c7c) obj;
        return this.a.equals(c7cVar.a) && this.b.equals(c7cVar.b) && uqk.e(this.f9979c, c7cVar.f9979c);
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.f9979c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public c7c(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
