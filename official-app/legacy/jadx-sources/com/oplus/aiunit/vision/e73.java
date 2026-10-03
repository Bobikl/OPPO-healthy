package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e73 {
    public static final int MAX_COMPENSATION = 2;
    public final long a;
    public final int b;

    public e73(long j2, int i) {
        this.a = j2;
        this.b = i;
    }

    @NonNull
    public static e73 a() {
        return new e73(0L, 0);
    }

    @NonNull
    public e73 b(long j2) {
        return new e73(j2, 0);
    }

    @NonNull
    public e73 c(int i) {
        return new e73(this.a, i);
    }

    @NonNull
    public e73 d() {
        return new e73(this.a, Math.max(0, this.b - 1));
    }

    @NonNull
    public e73 e(long j2) {
        return new e73(j2, 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e73.class != obj.getClass()) {
            return false;
        }
        e73 e73Var = (e73) obj;
        return this.a == e73Var.a && this.b == e73Var.b;
    }

    public int hashCode() {
        long j2 = this.a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.b;
    }

    public String toString() {
        return "ChannelGateState{lastSuccessMs=" + this.a + ", compRemain=" + this.b + '}';
    }
}
