package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes13.dex */
public final class zzep {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i = zzdj.zza;
        try {
            new zzdh(bArr, 0, 0, false, null).zza(0);
        } catch (zzer e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
