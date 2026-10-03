package com.oplus.aiunit.vision;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class f4n extends g4n {
    public f4n(g4n g4nVar) {
        super(g4nVar);
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] bArrN = w0n.n(stringBuffer.toString());
        byte[] bArr2 = new byte[bArrN.length + bArr.length];
        System.arraycopy(bArrN, 0, bArr2, 0, bArrN.length);
        System.arraycopy(bArr, 0, bArr2, bArrN.length, bArr.length);
        return bArr2;
    }
}
