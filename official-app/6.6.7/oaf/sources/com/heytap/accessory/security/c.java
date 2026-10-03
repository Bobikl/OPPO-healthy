package com.heytap.accessory.security;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public long a;
    public long b;

    public c(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.b;
        long j2 = cVar.b;
        if (j == j2 && this.a == cVar.a) {
            return true;
        }
        return j == cVar.a && this.a == j2;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a + this.b));
    }

    @NonNull
    public String toString() {
        return this.b + ";" + this.a;
    }
}
