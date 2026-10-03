package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class vc2 implements xg0<byte[]> {
    @Override // com.oplus.aiunit.vision.xg0
    public int b() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.xg0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.oplus.aiunit.vision.xg0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // com.oplus.aiunit.vision.xg0
    public String getTag() {
        return "ByteArrayPool";
    }
}
