package com.oplus.aiunit.vision;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ucm<T> implements Closeable {
    public final com.xingin.xhssharesdk.a.g i;

    public ucm(com.xingin.xhssharesdk.a.g.d dVar) {
        this.i = dVar;
    }

    public final void a(tmm tmmVar) {
        try {
            byte[] bArrA = tmmVar.a();
            int i = pim.a;
            byte[] bArr = {(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
            if (bArrA.length > 5242880) {
                throw new IOException("Byte array length exceed! Required: <5242880, but got:" + bArrA.length);
            }
            this.i.y(bArrA.length + 4);
            com.xingin.xhssharesdk.a.g gVar = this.i;
            gVar.getClass();
            gVar.u(bArr, 0, 4);
            com.xingin.xhssharesdk.a.g gVar2 = this.i;
            gVar2.getClass();
            gVar2.u(bArrA, 0, bArrA.length);
            this.i.h();
        } catch (FileNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
