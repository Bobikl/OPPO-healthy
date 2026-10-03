package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public final class bze extends drd {
    public static final int ARRAY = 512;
    public static final int ARRAY_ALTERNATE = 2048;
    public static final int ARRAY_ALT_TEXT = 4096;
    public static final int ARRAY_ORDERED = 1024;
    public static final int DELETE_EXISTING = 536870912;
    public static final int HAS_LANGUAGE = 64;
    public static final int HAS_QUALIFIERS = 16;
    public static final int HAS_TYPE = 128;
    public static final int NO_OPTIONS = 0;
    public static final int QUALIFIER = 32;
    public static final int SCHEMA_NODE = Integer.MIN_VALUE;
    public static final int STRUCT = 256;
    public static final int URI = 2;

    public bze() {
    }

    public bze(int i) throws XMPException {
        super(i);
    }

    public bze A(boolean z) {
        f(Integer.MIN_VALUE, z);
        return this;
    }

    public bze B(boolean z) {
        f(256, z);
        return this;
    }

    public bze C(boolean z) {
        f(2, z);
        return this;
    }

    @Override // com.oplus.aiunit.vision.drd
    public void a(int i) throws XMPException {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((i & 2) > 0 && (i & 768) > 0) {
            throw new XMPException("Structs and arrays can't have \"value\" options", 103);
        }
    }

    @Override // com.oplus.aiunit.vision.drd
    public int e() {
        return -2147475470;
    }

    public boolean h() {
        return c(64);
    }

    public boolean i() {
        return c(512);
    }

    public boolean j() {
        return c(4096);
    }

    public boolean k() {
        return c(2048);
    }

    public boolean l() {
        return c(1024);
    }

    public boolean m() {
        return (d() & 768) > 0;
    }

    public boolean n() {
        return c(32);
    }

    public boolean o() {
        return c(Integer.MIN_VALUE);
    }

    public boolean p() {
        return (d() & 768) == 0;
    }

    public boolean q() {
        return c(256);
    }

    public void r(bze bzeVar) throws XMPException {
        if (bzeVar != null) {
            g(bzeVar.d() | d());
        }
    }

    public bze s(boolean z) {
        f(512, z);
        return this;
    }

    public bze t(boolean z) {
        f(4096, z);
        return this;
    }

    public bze u(boolean z) {
        f(2048, z);
        return this;
    }

    public bze v(boolean z) {
        f(1024, z);
        return this;
    }

    public bze w(boolean z) {
        f(64, z);
        return this;
    }

    public bze x(boolean z) {
        f(16, z);
        return this;
    }

    public bze y(boolean z) {
        f(128, z);
        return this;
    }

    public bze z(boolean z) {
        f(32, z);
        return this;
    }
}
