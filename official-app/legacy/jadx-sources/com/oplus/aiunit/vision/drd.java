package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class drd {
    public int a = 0;
    public Map b = null;

    public drd() {
    }

    public void a(int i) throws XMPException {
    }

    public final void b(int i) throws XMPException {
        int i2 = (~e()) & i;
        if (i2 == 0) {
            a(i);
            return;
        }
        throw new XMPException("The option bit(s) 0x" + Integer.toHexString(i2) + " are invalid!", 103);
    }

    public boolean c(int i) {
        return (this.a & i) != 0;
    }

    public int d() {
        return this.a;
    }

    public abstract int e();

    public boolean equals(Object obj) {
        return d() == ((drd) obj).d();
    }

    public void f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.a;
        } else {
            i2 = (~i) & this.a;
        }
        this.a = i2;
    }

    public void g(int i) throws XMPException {
        b(i);
        this.a = i;
    }

    public int hashCode() {
        return d();
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.a);
    }

    public drd(int i) throws XMPException {
        b(i);
        g(i);
    }
}
