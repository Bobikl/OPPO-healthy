package com.omron;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class bt implements bz {
    private UUID[] b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 2;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = cw.b(bArr, i * 2);
        }
        return uuidArr;
    }

    private UUID[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 4;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = cw.c(bArr, i * 4);
        }
        return uuidArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    @Override // com.omron.bz
    public by a(int i, int i2, byte[] bArr) {
        UUID[] uuidArrB;
        if (i2 == 20) {
            uuidArrB = b(bArr);
        } else if (i2 == 21) {
            uuidArrB = a(bArr);
        } else {
            if (i2 != 31) {
                switch (i2) {
                    case 2:
                    case 3:
                        uuidArrB = b(bArr);
                        break;
                    case 4:
                    case 5:
                        break;
                    case 6:
                    case 7:
                        uuidArrB = a(bArr);
                        break;
                    default:
                        return null;
                }
            }
            uuidArrB = c(bArr);
        }
        return new cu(i, i2, bArr, uuidArrB);
    }

    private UUID[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 16;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = cw.a(bArr, i * 16);
        }
        return uuidArr;
    }
}
