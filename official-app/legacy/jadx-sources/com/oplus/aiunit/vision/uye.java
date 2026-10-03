package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class uye<T> {
    public final String a;

    public uye(@NonNull String str) {
        this.a = str;
    }

    @NonNull
    public static <T> uye<T> b(@NonNull String str) {
        return new uye<>(str);
    }

    @Nullable
    public T a(@NonNull kpf kpfVar) {
        return (T) kpfVar.a(this);
    }

    @NonNull
    public T c(@NonNull kpf kpfVar) {
        T tA = a(kpfVar);
        if (tA != null) {
            return tA;
        }
        throw new NullPointerException(this.a);
    }

    public void d(@NonNull kpf kpfVar, @Nullable T t) {
        kpfVar.b(this, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((uye) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.a + "'}";
    }
}
