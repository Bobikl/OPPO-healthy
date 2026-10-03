package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class g0n {
    @Nullable
    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        try {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
            return bArr;
        } catch (NumberFormatException e2) {
            Log.e("b", e2.getLocalizedMessage());
            return null;
        }
    }
}
