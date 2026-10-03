package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class cs extends by {
    public cs(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
    }

    public int d() {
        byte[] bArrA = a();
        if (bArrA == null || bArrA.length == 0) {
            return 0;
        }
        return bArrA[0];
    }

    @Override // com.omron.by
    public String toString() {
        int iD = d();
        Object[] objArr = new Object[2];
        objArr[0] = iD >= 0 ? "+" : "";
        objArr[1] = Integer.valueOf(iD);
        return String.format("TxPowerLevel(%s%ddBm)", objArr);
    }
}
