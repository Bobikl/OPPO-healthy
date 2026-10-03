package com.oplus.aiunit.vision;

import com.score.rahasak.utils.OpusDecoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/krd;", "", "", "origin", "a", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class krd {

    @NotNull
    public static final krd INSTANCE = new krd();

    @Nullable
    public final synchronized byte[] a(@NotNull byte[] origin) {
        byte[] bArrCopyOfRange;
        Intrinsics.checkNotNullParameter(origin, "origin");
        OpusDecoder opusDecoder = new OpusDecoder();
        try {
            opusDecoder.init(16000, 1);
            int length = origin.length / 88;
            int length2 = origin.length * 8;
            int i = length2 / length;
            byte[] bArr = new byte[length2];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                byte[] bArr2 = new byte[80];
                System.arraycopy(origin, (i3 * 88) + 8, bArr2, 0, 80);
                byte[] bArr3 = new byte[i];
                int iDecode = opusDecoder.decode(bArr2, bArr3, i) * 2;
                System.arraycopy(bArr3, 0, bArr, i2, iDecode);
                i2 += iDecode;
            }
            bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, i2);
            opusDecoder.close();
        } catch (Throwable th) {
            try {
                a7b.b("VAM_OpusCodecDemo", th.getMessage());
                return null;
            } finally {
                opusDecoder.close();
            }
        }
        return bArrCopyOfRange;
    }
}
