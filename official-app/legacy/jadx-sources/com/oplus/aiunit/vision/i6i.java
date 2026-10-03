package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class i6i {
    public int a;
    public long b;

    public long a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6i) && this.a == ((i6i) obj).a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }
}
