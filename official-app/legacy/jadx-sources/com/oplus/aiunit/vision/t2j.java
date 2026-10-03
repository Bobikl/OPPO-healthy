package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class t2j extends m1 {
    public tz i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kj4 f16868j;

    public t2j(tz tzVar, f1 f1Var) throws IOException {
        this.f16868j = new kj4(f1Var);
        this.i = tzVar;
    }

    public static t2j h(Object obj) {
        if (obj instanceof t2j) {
            return (t2j) obj;
        }
        if (obj != null) {
            return new t2j(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f16868j);
        return new xj4(g1Var);
    }

    public tz f() {
        return this.i;
    }

    public tz g() {
        return this.i;
    }

    public kj4 i() {
        return this.f16868j;
    }

    public r1 j() throws IOException {
        return new j1(this.f16868j.p()).s();
    }

    public t2j(tz tzVar, byte[] bArr) {
        this.f16868j = new kj4(bArr);
        this.i = tzVar;
    }

    public t2j(s1 s1Var) {
        if (s1Var.size() == 2) {
            Enumeration enumerationQ = s1Var.q();
            this.i = tz.g(enumerationQ.nextElement());
            this.f16868j = kj4.r(enumerationQ.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
    }
}
