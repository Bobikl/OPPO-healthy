package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class y43 {
    public static y43 sCentralManagerHelper;

    public static synchronized y43 a() {
        if (sCentralManagerHelper == null) {
            sCentralManagerHelper = new y43();
        }
        return sCentralManagerHelper;
    }

    public void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }
}
