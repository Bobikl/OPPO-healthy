package com.score.rahasak.utils;

/* JADX INFO: loaded from: classes9.dex */
public interface IEncoder {
    void close();

    int encode(byte[] bArr, int i, byte[] bArr2);

    void init(int i, int i2, int i3);

    void reset();

    void setBitrate(int i);

    void setComplexity(int i);
}
