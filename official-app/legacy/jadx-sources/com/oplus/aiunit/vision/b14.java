package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class b14 extends InputStream {
    public final w1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9547j = true;
    public InputStream k;

    public b14(w1 w1Var) {
        this.i = w1Var;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        p1 p1Var;
        int i3 = 0;
        if (this.k == null) {
            if (!this.f9547j || (p1Var = (p1) this.i.b()) == null) {
                return -1;
            }
            this.f9547j = false;
            this.k = p1Var.b();
        }
        while (true) {
            int i4 = this.k.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                p1 p1Var2 = (p1) this.i.b();
                if (p1Var2 == null) {
                    this.k = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.k = p1Var2.b();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        p1 p1Var;
        if (this.k == null) {
            if (!this.f9547j || (p1Var = (p1) this.i.b()) == null) {
                return -1;
            }
            this.f9547j = false;
            this.k = p1Var.b();
        }
        while (true) {
            int i = this.k.read();
            if (i >= 0) {
                return i;
            }
            p1 p1Var2 = (p1) this.i.b();
            if (p1Var2 == null) {
                this.k = null;
                return -1;
            }
            this.k = p1Var2.b();
        }
    }
}
