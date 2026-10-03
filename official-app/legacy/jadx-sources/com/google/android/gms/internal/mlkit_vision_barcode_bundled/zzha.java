package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import okio.Utf8;

/* JADX INFO: loaded from: classes13.dex */
final class zzha {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzer {
        if (zze(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zze(b3) || zze(b4)) {
            throw new zzer("Protocol message had invalid UTF-8.");
        }
        int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws zzer {
        if (!zze(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!zze(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zze(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!zze(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zze(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            }
        }
        throw new zzer("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) throws zzer {
        if (b < -62 || zze(b2)) {
            throw new zzer("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }
}
