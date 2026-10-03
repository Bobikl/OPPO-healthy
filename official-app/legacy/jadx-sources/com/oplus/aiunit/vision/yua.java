package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class yua implements Enumeration {
    public j1 a;
    public Object b = a();

    public yua(byte[] bArr) {
        this.a = new j1(bArr, true);
    }

    public final Object a() {
        try {
            return this.a.s();
        } catch (IOException e2) {
            throw new ASN1ParsingException("malformed DER construction: " + e2, e2);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.b;
        this.b = a();
        return obj;
    }
}
