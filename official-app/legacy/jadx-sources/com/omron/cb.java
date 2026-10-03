package com.omron;

/* JADX INFO: loaded from: classes5.dex */
class cb implements bz {
    @Override // com.omron.bz
    public by a(int i, int i2, byte[] bArr) {
        if (bArr == null || bArr.length < 3 || (bArr[0] & 255) != 170 || (bArr[1] & 255) != 254) {
            return null;
        }
        int i3 = bArr[2] & 240;
        if (i3 == 0) {
            return new ce(i, i2, bArr);
        }
        if (i3 == 16) {
            return new cf(i, i2, bArr);
        }
        if (i3 == 32) {
            return new cd(i, i2, bArr);
        }
        if (i3 != 48) {
            return null;
        }
        return new cc(i, i2, bArr);
    }
}
