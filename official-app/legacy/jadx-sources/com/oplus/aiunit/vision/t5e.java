package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes4.dex */
public final class t5e<A, B> {
    public final A a;
    public final B b;

    public t5e(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> t5e<A, B> a(A a, B b) {
        return new t5e<>(a, b);
    }

    public A b() {
        return this.a;
    }

    public B c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t5e.class != obj.getClass()) {
            return false;
        }
        t5e t5eVar = (t5e) obj;
        A a = this.a;
        if (a == null) {
            if (t5eVar.a != null) {
                return false;
            }
        } else if (!a.equals(t5eVar.a)) {
            return false;
        }
        B b = this.b;
        if (b == null) {
            if (t5eVar.b != null) {
                return false;
            }
        } else if (!b.equals(t5eVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.a;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "first = " + this.a + " , second = " + this.b;
    }
}
