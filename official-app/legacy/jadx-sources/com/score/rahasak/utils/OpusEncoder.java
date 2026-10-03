package com.score.rahasak.utils;

import androidx.annotation.IntRange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class OpusEncoder implements IEncoder {
    public static final int OPUS_APPLICATION_AUDIO = 2049;
    public static final int OPUS_APPLICATION_RESTRICTED_LOWDELAY = 2051;
    public static final int OPUS_APPLICATION_VOIP = 2048;
    public static final int OPUS_AUTO = -1;
    public static final int OPUS_BITRATE_MAX = -1;
    public static final int OPUS_COMPLEXITY_MAX = 10;
    private long address;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApplicationType {
    }

    static {
        System.loadLibrary("senz");
    }

    private native int nativeEncodeBytes(byte[] bArr, int i, byte[] bArr2);

    private native int nativeEncodeShorts(short[] sArr, int i, byte[] bArr);

    private native int nativeInitEncoder(int i, int i2, int i3);

    private native boolean nativeReleaseEncoder();

    private native int nativeSetBitrate(int i);

    private native int nativeSetComplexity(@IntRange(from = 0, to = 10) int i);

    @Override // com.score.rahasak.utils.IEncoder
    public void close() {
        nativeReleaseEncoder();
    }

    @Override // com.score.rahasak.utils.IEncoder
    public int encode(byte[] bArr, int i, byte[] bArr2) {
        return nativeEncodeBytes(bArr, i, bArr2);
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void init(int i, int i2, int i3) {
        nativeInitEncoder(i, i2, i3);
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void reset() {
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void setBitrate(int i) {
        nativeSetBitrate(i);
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void setComplexity(int i) {
        nativeSetComplexity(i);
    }

    public int encode(short[] sArr, int i, byte[] bArr) {
        return nativeEncodeShorts(sArr, i, bArr);
    }
}
