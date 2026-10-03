package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public final class xz extends drd {
    public static final int PROP_ARRAY = 512;
    public static final int PROP_ARRAY_ALTERNATE = 2048;
    public static final int PROP_ARRAY_ALT_TEXT = 4096;
    public static final int PROP_ARRAY_ORDERED = 1024;
    public static final int PROP_DIRECT = 0;

    public xz() {
    }

    public xz(int i) throws XMPException {
        super(i);
    }

    @Override // com.oplus.aiunit.vision.drd
    public int e() {
        return k18.GL_KEEP;
    }

    public boolean h() {
        return c(512);
    }

    public boolean i() {
        return c(4096);
    }

    public boolean j() {
        return d() == 0;
    }

    public xz k(boolean z) {
        f(k18.GL_KEEP, z);
        return this;
    }

    public xz l(boolean z) {
        f(1536, z);
        return this;
    }

    public bze m() throws XMPException {
        return new bze(d());
    }
}
