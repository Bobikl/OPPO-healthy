package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes13.dex */
public class ht9 {
    public final ContentReference a;

    @Deprecated
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JsonEncoding f12261c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z72 f12262e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public char[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char[] f12263j;
    public char[] k;

    public ht9(z72 z72Var, ContentReference contentReference, boolean z) {
        this.f12262e = z72Var;
        this.a = contentReference;
        this.b = contentReference.getRawContent();
        this.d = z;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw v();
        }
    }

    public final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw v();
        }
    }

    public byte[] d() {
        a(this.h);
        byte[] bArrA = this.f12262e.a(3);
        this.h = bArrA;
        return bArrA;
    }

    public char[] e() {
        a(this.f12263j);
        char[] cArrC = this.f12262e.c(1);
        this.f12263j = cArrC;
        return cArrC;
    }

    public char[] f(int i) {
        a(this.k);
        char[] cArrD = this.f12262e.d(3, i);
        this.k = cArrD;
        return cArrD;
    }

    public byte[] g() {
        a(this.f);
        byte[] bArrA = this.f12262e.a(0);
        this.f = bArrA;
        return bArrA;
    }

    public char[] h() {
        a(this.i);
        char[] cArrC = this.f12262e.c(0);
        this.i = cArrC;
        return cArrC;
    }

    public char[] i(int i) {
        a(this.i);
        char[] cArrD = this.f12262e.d(0, i);
        this.i = cArrD;
        return cArrD;
    }

    public byte[] j() {
        a(this.g);
        byte[] bArrA = this.f12262e.a(1);
        this.g = bArrA;
        return bArrA;
    }

    public gsj k() {
        return new gsj(this.f12262e);
    }

    public ContentReference l() {
        return this.a;
    }

    public JsonEncoding m() {
        return this.f12261c;
    }

    public boolean n() {
        return this.d;
    }

    public void o(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.h);
            this.h = null;
            this.f12262e.i(3, bArr);
        }
    }

    public void p(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f12263j);
            this.f12263j = null;
            this.f12262e.j(1, cArr);
        }
    }

    public void q(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.k);
            this.k = null;
            this.f12262e.j(3, cArr);
        }
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f);
            this.f = null;
            this.f12262e.i(0, bArr);
        }
    }

    public void s(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.i);
            this.i = null;
            this.f12262e.j(0, cArr);
        }
    }

    public void t(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.g);
            this.g = null;
            this.f12262e.i(1, bArr);
        }
    }

    public void u(JsonEncoding jsonEncoding) {
        this.f12261c = jsonEncoding;
    }

    public final IllegalArgumentException v() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
