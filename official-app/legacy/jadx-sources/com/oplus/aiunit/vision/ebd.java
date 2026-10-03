package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class ebd implements ona {
    public final Object a;

    public ebd(@NonNull Object obj) {
        this.a = cpe.d(obj);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof ebd) {
            return this.a.equals(((ebd) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.a + '}';
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.a.toString().getBytes(ona.CHARSET));
    }
}
