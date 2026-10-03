package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class ks4 implements ona {
    public final ona a;
    public final ona b;

    public ks4(ona onaVar, ona onaVar2) {
        this.a = onaVar;
        this.b = onaVar2;
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof ks4)) {
            return false;
        }
        ks4 ks4Var = (ks4) obj;
        return this.a.equals(ks4Var.a) && this.b.equals(ks4Var.b);
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.a + ", signature=" + this.b + '}';
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.a.updateDiskCacheKey(messageDigest);
        this.b.updateDiskCacheKey(messageDigest);
    }
}
