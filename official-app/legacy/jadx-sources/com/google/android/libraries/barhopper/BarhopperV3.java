package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULLPTR = 0;
    private static final String TAG = "BarhopperV3";
    private long nativePointer;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j2);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j2, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j2, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j2, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j2, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j2, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    private static BarhopperProto$BarhopperResponse toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return BarhopperProto$BarhopperResponse.zzb(bArr, zzds.zza());
        } catch (zzer e2) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j2 = this.nativePointer;
        if (j2 != 0) {
            closeNative(j2);
            this.nativePointer = 0L;
        }
    }

    public void create() {
        if (this.nativePointer != 0) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long jCreateNative = createNative();
        this.nativePointer = jCreateNative;
        if (jCreateNative == 0) {
            throw new IllegalStateException("Failed to create native pointer.");
        }
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, int i3, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j2 = this.nativePointer;
        if (j2 != 0) {
            return toProto(recognizeStridedBufferNative(j2, i, i2, i3, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public void create(@NonNull BarhopperV3Options barhopperV3Options) {
        if (this.nativePointer != 0) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(barhopperV3Options.zzD());
        this.nativePointer = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, int i3, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j2 = this.nativePointer;
        if (j2 != 0) {
            return toProto(recognizeStridedNative(j2, i, i2, i3, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j2 = this.nativePointer;
        if (j2 != 0) {
            return toProto(recognizeBufferNative(j2, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j2 = this.nativePointer;
        if (j2 != 0) {
            return toProto(recognizeNative(j2, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(@NonNull Bitmap bitmap, @NonNull RecognitionOptions recognitionOptions) {
        if (this.nativePointer != 0) {
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                Log.d(TAG, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
            return toProto(recognizeBitmapNative(this.nativePointer, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }
}
