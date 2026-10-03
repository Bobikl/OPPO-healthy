package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class i18 implements dne {
    public final int[] a;

    public i18(int[] iArr) {
        this.a = eh0.g(iArr);
    }

    @Override // com.oplus.aiunit.vision.dne
    public int[] a() {
        return eh0.g(this.a);
    }

    @Override // com.oplus.aiunit.vision.dne
    public int b() {
        int[] iArr = this.a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i18) {
            return eh0.c(this.a, ((i18) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return eh0.r(this.a);
    }
}
