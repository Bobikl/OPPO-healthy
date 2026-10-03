package com.omron;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class cq extends by {
    private final UUID d;

    public cq(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        this.d = a(i2, bArr);
    }

    private UUID a(int i, byte[] bArr) {
        if (i == 22) {
            return cw.b(bArr);
        }
        if (i == 32) {
            return cw.c(bArr);
        }
        if (i != 33) {
            return null;
        }
        return cw.a(bArr);
    }

    @Override // com.omron.by
    public String toString() {
        return String.format("ServiceData(ServiceUUID=%s)", this.d);
    }
}
