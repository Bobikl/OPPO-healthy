package com.lifesense.android.bluetooth.core.business.ota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    BLE(4, 32),
    SOC(8, 64),
    WIFI(9, 96);

    public int a;
    public int b;

    b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static List<a> b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : values()) {
            a aVarA = bVar.a(bArr);
            if (aVarA.a() != 0) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    public int a() {
        return this.a;
    }

    public a a(byte[] bArr) {
        a aVar = new a();
        aVar.a(this);
        aVar.b(new String(com.lifesense.android.bluetooth.core.tools.b.a(bArr, this.b, 4)));
        aVar.d(com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, this.b + 4, 4)));
        aVar.a(com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, this.b + 8, 4)));
        aVar.c(com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, this.b + 12, 4)));
        aVar.a(new String(com.lifesense.android.bluetooth.core.tools.b.a(bArr, this.b + 16, 16)));
        ArrayList arrayList = new ArrayList();
        byte[] bArrA = com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, aVar.a(), aVar.e()), com.lifesense.android.bluetooth.core.tools.b.a(aVar.c()));
        int i = 0;
        while (i < bArrA.length - 20) {
            int i2 = i + 20;
            arrayList.add(Arrays.copyOfRange(bArrA, i, i2));
            i = i2;
        }
        arrayList.add(Arrays.copyOfRange(bArrA, i, bArrA.length));
        aVar.a(arrayList);
        aVar.b(bArrA.length);
        return aVar;
    }
}
