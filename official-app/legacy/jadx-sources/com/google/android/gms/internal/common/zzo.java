package com.google.android.gms.internal.common;

import com.heytap.connect.cipher.AESUtil;

/* JADX INFO: loaded from: classes13.dex */
final class zzo extends zzn {
    private final char zza;

    public zzo(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = AESUtil.HEX.charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c2) {
        return c2 == this.zza;
    }
}
