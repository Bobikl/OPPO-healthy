package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class dca implements xg0<int[]> {
    @Override // com.oplus.aiunit.vision.xg0
    public int b() {
        return 4;
    }

    @Override // com.oplus.aiunit.vision.xg0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // com.oplus.aiunit.vision.xg0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // com.oplus.aiunit.vision.xg0
    public String getTag() {
        return "IntegerArrayPool";
    }
}
