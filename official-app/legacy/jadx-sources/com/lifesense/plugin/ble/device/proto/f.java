package com.lifesense.plugin.ble.device.proto;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private a a;
    private byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f8761c;

    public f(a aVar, byte[] bArr) {
        a(aVar);
        a(bArr);
    }

    public a a() {
        return this.a;
    }

    public String toString() {
        return "IProtoMessage [operatingDirective=" + this.a + ", commandData=" + Arrays.toString(this.b) + ", packets=" + this.f8761c + "]";
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void a(byte[] bArr) {
        this.b = bArr;
    }
}
