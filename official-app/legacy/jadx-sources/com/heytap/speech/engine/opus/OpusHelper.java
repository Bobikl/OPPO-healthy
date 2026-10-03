package com.heytap.speech.engine.opus;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.t7b;
import com.score.rahasak.utils.IEncoder;
import com.score.rahasak.utils.OpusEncoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class OpusHelper {
    private static int BITRATE = 16000;
    private static int BYTE_BUFFER_SIZE = 262144;
    private static int NUM_CHANNELS = 1;
    private static int RESULT_ENCODE_SIZE = 51200;
    private static int SAMPLE_RATE = 16000;
    private static final String TAG = "OpusHelper";
    public static final String VERSION_DUI = "dui_1.2.1";
    public static final String VERSION_OPUS = "opus_1.2.1";
    public static int mBlockSize = 640;
    private static int mFrameSize = 320;
    private byte[] encodeBuf;
    private IEncoder opusEncoder;
    private byte[] pcmByte;
    private byte[] result;
    private final byte[] defResult = new byte[0];
    private ByteBuffer mStreamCacheBuffer = null;

    public OpusHelper(String str) {
        init(str);
    }

    private byte[] encodeByArray(byte[] bArr) {
        int length = bArr.length % mBlockSize;
        if (length > 0) {
            byte[] bArr2 = new byte[bArr.length - length];
            System.arraycopy(bArr, length, bArr2, 0, bArr.length - length);
            bArr = bArr2;
        }
        if (this.pcmByte == null) {
            this.pcmByte = new byte[mBlockSize];
        }
        if (this.encodeBuf == null) {
            this.encodeBuf = new byte[mBlockSize];
        }
        if (this.result == null) {
            this.result = new byte[mBlockSize * 10];
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = mBlockSize;
            int i4 = i * i3;
            if (i4 >= bArr.length) {
                break;
            }
            System.arraycopy(bArr, i4, this.pcmByte, 0, i3);
            IEncoder iEncoder = this.opusEncoder;
            int iEncode = iEncoder != null ? iEncoder.encode(this.pcmByte, mFrameSize, this.encodeBuf) : 0;
            int i5 = i2 + iEncode;
            byte[] bArr3 = this.result;
            if (i5 > bArr3.length) {
                byte[] bArr4 = new byte[bArr3.length * 5];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                this.result = bArr4;
            }
            System.arraycopy(this.encodeBuf, 0, this.result, i2, iEncode);
            i++;
            i2 = i5;
        }
        return i2 > 0 ? Arrays.copyOf(this.result, i2) : this.defResult;
    }

    private byte[] encodeByBuffer(byte[] bArr) {
        this.mStreamCacheBuffer.put(bArr);
        if (this.mStreamCacheBuffer.position() < mBlockSize) {
            return this.defResult;
        }
        this.mStreamCacheBuffer.flip();
        if (this.pcmByte == null) {
            this.pcmByte = new byte[mBlockSize];
        }
        if (this.encodeBuf == null) {
            this.encodeBuf = new byte[mBlockSize];
        }
        if (this.result == null) {
            this.result = new byte[mBlockSize * 10];
        }
        int i = 0;
        int iEncode = 0;
        while (true) {
            int iRemaining = this.mStreamCacheBuffer.remaining();
            int i2 = mBlockSize;
            if (iRemaining < i2) {
                break;
            }
            this.mStreamCacheBuffer.get(this.pcmByte, 0, i2);
            IEncoder iEncoder = this.opusEncoder;
            if (iEncoder != null) {
                iEncode = iEncoder.encode(this.pcmByte, mFrameSize, this.encodeBuf);
            }
            int i3 = i + iEncode;
            byte[] bArr2 = this.result;
            if (i3 > bArr2.length) {
                byte[] bArr3 = new byte[bArr2.length * 5];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                this.result = bArr3;
            }
            System.arraycopy(this.encodeBuf, 0, this.result, i, iEncode);
            i = i3;
        }
        if (this.mStreamCacheBuffer.remaining() > 0) {
            this.mStreamCacheBuffer.compact();
        } else {
            this.mStreamCacheBuffer.clear();
        }
        return i > 0 ? Arrays.copyOf(this.result, i) : this.defResult;
    }

    private byte[] encodeLargeBuffer(byte[] bArr) {
        byte[] bArr2 = new byte[RESULT_ENCODE_SIZE];
        int i = 0;
        int length = 0;
        while (i < bArr.length) {
            int iMin = Math.min(this.mStreamCacheBuffer.remaining(), bArr.length - i);
            byte[] bArr3 = new byte[iMin];
            System.arraycopy(bArr, i, bArr3, 0, iMin);
            byte[] bArrEncodeByBuffer = encodeByBuffer(bArr3);
            if (bArrEncodeByBuffer.length + length > bArr2.length) {
                byte[] bArr4 = new byte[(int) (((double) bArr2.length) * 1.5d)];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                bArr2 = bArr4;
            }
            System.arraycopy(bArrEncodeByBuffer, 0, bArr2, length, bArrEncodeByBuffer.length);
            i += iMin;
            length += bArrEncodeByBuffer.length;
        }
        return Arrays.copyOf(bArr2, length);
    }

    private void init(String str) {
        t7b.INSTANCE.b(TAG, "init type=" + str);
        this.opusEncoder = (VERSION_OPUS.equals(str) || TextUtils.isEmpty(str)) ? new BreenoOpusEncoder() : new OpusEncoder();
        this.opusEncoder.init(SAMPLE_RATE, NUM_CHANNELS, 2049);
        this.opusEncoder.setComplexity(8);
        this.opusEncoder.setBitrate(BITRATE);
        this.mStreamCacheBuffer = ByteBuffer.allocate(BYTE_BUFFER_SIZE);
    }

    private void resetByteBuffer() {
        if (this.mStreamCacheBuffer != null) {
            t7b.INSTANCE.b(TAG, "mStreamCacheBuffer.clear");
            this.mStreamCacheBuffer.clear();
        }
    }

    @NonNull
    public byte[] encode(byte[] bArr) {
        ByteBuffer byteBuffer = this.mStreamCacheBuffer;
        if (byteBuffer == null) {
            return encodeByArray(bArr);
        }
        return bArr.length > byteBuffer.remaining() ? encodeLargeBuffer(bArr) : encodeByBuffer(bArr);
    }

    public int getFrameSize() {
        return mFrameSize;
    }

    public void release() {
        IEncoder iEncoder = this.opusEncoder;
        if (iEncoder != null) {
            iEncoder.close();
            this.opusEncoder = null;
        }
        resetByteBuffer();
        if (this.mStreamCacheBuffer != null) {
            this.mStreamCacheBuffer = null;
        }
    }

    public void resetEncoder() {
        IEncoder iEncoder = this.opusEncoder;
        if (iEncoder != null) {
            iEncoder.reset();
        }
    }

    public void setComplexity(int i) {
        if (this.opusEncoder != null) {
            t7b.INSTANCE.b(TAG, "setComplexity： " + i);
            this.opusEncoder.setComplexity(i);
        }
    }

    public void setFrameSize(int i) {
        if (i == 40 || i == 80 || i == 160 || i == 320 || i == 640 || i == 960) {
            mFrameSize = i;
            mBlockSize = i * NUM_CHANNELS * 2;
            t7b.INSTANCE.b(TAG, "setFrameSize mFrameSize=" + mFrameSize);
        }
    }

    public void start() {
        resetByteBuffer();
    }

    public void stop() {
        resetByteBuffer();
    }
}
