package com.lifesense.android.bluetooth.core.protocol.stack;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public b a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<byte[]> f8624c;

    public a(b bVar, byte[] bArr) {
        a(bVar);
        a(bArr);
    }

    public static a a(b bVar, byte[] bArr) {
        return new a(bVar, bArr);
    }

    public String toString() {
        return "ProtocolMessage [operatingDirective=" + this.a + ", commandData=" + Arrays.toString(this.b) + ", packets=" + this.f8624c + "]";
    }

    public b a() {
        return this.a;
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public void a(byte[] bArr) {
        this.b = bArr;
    }
}
