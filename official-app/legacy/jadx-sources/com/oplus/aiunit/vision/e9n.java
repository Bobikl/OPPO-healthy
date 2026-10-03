package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class e9n {
    public static final e9n d = new e9n(0, new int[0], new Object[0]);
    public final int a;
    public final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10834c;

    public e9n() {
        this(0, new int[8], new Object[8]);
    }

    public static e9n a(e9n e9nVar, e9n e9nVar2) {
        int i = e9nVar.a + e9nVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(e9nVar.b, i);
        System.arraycopy(e9nVar2.b, 0, iArrCopyOf, e9nVar.a, e9nVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(e9nVar.f10834c, i);
        System.arraycopy(e9nVar2.f10834c, 0, objArrCopyOf, e9nVar.a, e9nVar2.a);
        return new e9n(i, iArrCopyOf, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e9n)) {
            return false;
        }
        e9n e9nVar = (e9n) obj;
        return this.a == e9nVar.a && Arrays.equals(this.b, e9nVar.b) && Arrays.deepEquals(this.f10834c, e9nVar.f10834c);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f10834c) + ((Arrays.hashCode(this.b) + ((this.a + 527) * 31)) * 31);
    }

    public e9n(int i, int[] iArr, Object[] objArr) {
        this.a = i;
        this.b = iArr;
        this.f10834c = objArr;
    }
}
