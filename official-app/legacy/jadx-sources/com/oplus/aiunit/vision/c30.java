package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class c30 implements ona {
    public final int a;
    public final ona b;

    public c30(int i, ona onaVar) {
        this.a = i;
        this.b = onaVar;
    }

    @NonNull
    public static ona a(@NonNull Context context) {
        return new c30(context.getResources().getConfiguration().uiMode & 48, ef0.c(context));
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof c30)) {
            return false;
        }
        c30 c30Var = (c30) obj;
        return this.a == c30Var.a && this.b.equals(c30Var.b);
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return uqk.q(this.b, this.a);
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.a).array());
    }
}
