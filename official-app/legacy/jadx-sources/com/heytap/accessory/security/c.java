package com.heytap.accessory.security;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public long a;
    public long b;

    public c(long j2, long j3) {
        this.b = j2;
        this.a = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j2 = this.b;
        long j3 = cVar.b;
        if (j2 == j3 && this.a == cVar.a) {
            return true;
        }
        return j2 == cVar.a && this.a == j3;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a + this.b));
    }

    @NonNull
    public String toString() {
        return this.b + ";" + this.a;
    }
}
