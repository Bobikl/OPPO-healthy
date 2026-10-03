package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ca extends cq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f8860e;

    public enum a {
        UID,
        URL,
        TLM,
        EID
    }

    public ca(int i, int i2, byte[] bArr, a aVar) {
        super(i, i2, bArr);
        this.f8860e = aVar;
    }
}
