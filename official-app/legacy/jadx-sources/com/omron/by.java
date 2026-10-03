package com.omron;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class by implements Serializable {
    private int a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f8856c;

    public by() {
    }

    public by(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.f8856c = bArr;
    }

    public byte[] a() {
        return this.f8856c;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public String toString() {
        return String.format("ADStructure(Length=%d,Type=0x%02X)", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
