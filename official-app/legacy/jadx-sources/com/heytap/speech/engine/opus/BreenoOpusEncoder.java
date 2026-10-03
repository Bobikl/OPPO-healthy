package com.heytap.speech.engine.opus;

import androidx.annotation.IntRange;
import com.oplus.aiunit.vision.t7b;
import com.score.rahasak.utils.IEncoder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
class BreenoOpusEncoder implements IEncoder {
    public static final int OPUS_APPLICATION_AUDIO = 2049;
    public static final int OPUS_APPLICATION_RESTRICTED_LOWDELAY = 2051;
    public static final int OPUS_APPLICATION_VOIP = 2048;
    public static final int OPUS_AUTO = -1;
    public static final int OPUS_BITRATE_MAX = -1;
    public static final int OPUS_COMPLEXITY_MAX = 10;
    private static final String TAG = "BreenoOpusEncoder";
    private long address;
    private long sHandle = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApplicationType {
    }

    static {
        System.loadLibrary("breeno_opus");
    }

    private native int nativeEncodeBytes(long j2, byte[] bArr, int i, byte[] bArr2);

    private native long nativeInitEncoder(int i, int i2, int i3);

    private native int nativeReleaseEncoder(long j2);

    private native int nativeResetEncoder(long j2);

    private native int nativeSetBitrate(long j2, int i);

    private native int nativeSetComplexity(long j2, @IntRange(from = 0, to = 10) int i);

    @Override // com.score.rahasak.utils.IEncoder
    public void close() {
        long j2 = this.sHandle;
        if (j2 != -1) {
            nativeReleaseEncoder(j2);
        }
    }

    @Override // com.score.rahasak.utils.IEncoder
    public int encode(byte[] bArr, int i, byte[] bArr2) {
        long j2 = this.sHandle;
        if (j2 != -1) {
            return nativeEncodeBytes(j2, bArr, i, bArr2);
        }
        return 0;
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void init(int i, int i2, int i3) {
        t7b.INSTANCE.b(TAG, "init");
        this.sHandle = nativeInitEncoder(i, i2, i3);
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void reset() {
        long j2 = this.sHandle;
        if (j2 != -1) {
            nativeResetEncoder(j2);
        }
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void setBitrate(int i) {
        long j2 = this.sHandle;
        if (j2 != -1) {
            nativeSetBitrate(j2, i);
        }
    }

    @Override // com.score.rahasak.utils.IEncoder
    public void setComplexity(int i) {
        long j2 = this.sHandle;
        if (j2 != -1) {
            nativeSetComplexity(j2, i);
        }
    }
}
