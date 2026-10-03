package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class td2 implements usf<byte[]> {
    public final byte[] i;

    public td2(byte[] bArr) {
        this.i = (byte[]) cpe.d(bArr);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<byte[]> a() {
        return byte[].class;
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return this.i.length;
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
    }
}
