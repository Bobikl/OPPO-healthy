package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ea7 extends fa7 {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10838c;

    public ea7() {
        this.a = 255;
        this.b = 0;
    }

    @Override // com.oplus.aiunit.vision.fa7
    public int a() {
        return this.b;
    }

    public int b() {
        return this.f10838c;
    }

    public void c(OutputStream outputStream) {
        try {
            outputStream.write(this.a);
            outputStream.write(this.b);
            outputStream.write(this.f10838c);
        } catch (IOException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea7)) {
            return false;
        }
        ea7 ea7Var = (ea7) obj;
        return this.a == ea7Var.a && this.b == ea7Var.b && this.f10838c == ea7Var.f10838c;
    }

    public int hashCode() {
        return ((((47 + new Integer(this.a).hashCode()) * 31) + new Integer(this.b).hashCode()) * 19) + new Integer(this.f10838c).hashCode();
    }

    public ea7(w97 w97Var) {
        this.a = w97Var.S();
        this.b = w97Var.y();
        this.f10838c = w97Var.C();
    }
}
