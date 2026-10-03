package com.heytap.health;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class EcgProcessHelper {
    static {
        System.loadLibrary("ecgprocess");
    }

    public static native int offline_QRSDet_process(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int i4, int i5, EcgResult ecgResult);
}
