package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class q68 {
    public ByteBuffer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p68 f15641c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public void a() {
        this.b = null;
        this.f15641c = null;
    }

    public final boolean b() {
        return this.f15641c.b != 0;
    }

    @NonNull
    public p68 c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f15641c;
        }
        k();
        if (!b()) {
            h();
            p68 p68Var = this.f15641c;
            if (p68Var.f15208c < 0) {
                p68Var.b = 1;
            }
        }
        return this.f15641c;
    }

    public final int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.f15641c.b = 1;
            return 0;
        }
    }

    public final void e() {
        this.f15641c.d.a = n();
        this.f15641c.d.b = n();
        this.f15641c.d.f14358c = n();
        this.f15641c.d.d = n();
        int iD = d();
        boolean z = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        n68 n68Var = this.f15641c.d;
        n68Var.f14359e = (iD & 64) != 0;
        if (z) {
            n68Var.k = g(iPow);
        } else {
            n68Var.k = null;
        }
        this.f15641c.d.f14360j = this.b.position();
        r();
        if (b()) {
            return;
        }
        p68 p68Var = this.f15641c;
        p68Var.f15208c++;
        p68Var.f15209e.add(p68Var.d);
    }

    public final void f() {
        int iD = d();
        this.d = iD;
        if (iD <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e2);
                }
                this.f15641c.b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f15641c.b = 1;
        }
        return iArr;
    }

    public final void h() {
        i(Integer.MAX_VALUE);
    }

    public final void i(int i) {
        boolean z = false;
        while (!z && !b() && this.f15641c.f15208c <= i) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f15641c.d = new n68();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                p68 p68Var = this.f15641c;
                if (p68Var.d == null) {
                    p68Var.d = new n68();
                }
                e();
            } else if (iD != 59) {
                this.f15641c.b = 1;
            } else {
                z = true;
            }
        }
    }

    public final void j() {
        d();
        int iD = d();
        n68 n68Var = this.f15641c.d;
        int i = (iD & 28) >> 2;
        n68Var.g = i;
        if (i == 0) {
            n68Var.g = 1;
        }
        n68Var.f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        n68 n68Var2 = this.f15641c.d;
        n68Var2.i = iN * 10;
        n68Var2.h = d();
        d();
    }

    public final void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f15641c.b = 1;
            return;
        }
        l();
        if (!this.f15641c.h || b()) {
            return;
        }
        p68 p68Var = this.f15641c;
        p68Var.a = g(p68Var.i);
        p68 p68Var2 = this.f15641c;
        p68Var2.f15211l = p68Var2.a[p68Var2.f15210j];
    }

    public final void l() {
        this.f15641c.f = n();
        this.f15641c.g = n();
        int iD = d();
        p68 p68Var = this.f15641c;
        p68Var.h = (iD & 128) != 0;
        p68Var.i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f15641c.f15210j = d();
        this.f15641c.k = d();
    }

    public final void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.f15641c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int n() {
        return this.b.getShort();
    }

    public final void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.f15641c = new p68();
        this.d = 0;
    }

    public q68 p(@NonNull ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
        int iD;
        do {
            iD = d();
            this.b.position(Math.min(this.b.position() + iD, this.b.limit()));
        } while (iD > 0);
    }

    public final void r() {
        d();
        q();
    }
}
