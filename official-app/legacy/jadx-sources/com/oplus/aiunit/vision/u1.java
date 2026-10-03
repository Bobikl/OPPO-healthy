package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u1 extends r1 implements Iterable {
    public Vector i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17241j;

    public u1() {
        this.i = new Vector();
        this.f17241j = false;
    }

    public static u1 n(y1 y1Var, boolean z) {
        if (z) {
            if (y1Var.p()) {
                return (u1) y1Var.n();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (y1Var.p()) {
            return y1Var instanceof up0 ? new sp0(y1Var.n()) : new tk4(y1Var.n());
        }
        if (y1Var.n() instanceof u1) {
            return (u1) y1Var.n();
        }
        if (y1Var.n() instanceof s1) {
            s1 s1Var = (s1) y1Var.n();
            return y1Var instanceof up0 ? new sp0(s1Var.r()) : new tk4(s1Var.r());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + y1Var.getClass().getName());
    }

    public static u1 o(Object obj) {
        if (obj == null || (obj instanceof u1)) {
            return (u1) obj;
        }
        if (obj instanceof v1) {
            return o(((v1) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return o(r1.i((byte[]) obj));
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e2.getMessage());
            }
        }
        if (obj instanceof f1) {
            r1 r1VarC = ((f1) obj).c();
            if (r1VarC instanceof u1) {
                return (u1) r1VarC;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (!(r1Var instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) r1Var;
        if (size() != u1Var.size()) {
            return false;
        }
        Enumeration enumerationR = r();
        Enumeration enumerationR2 = u1Var.r();
        while (enumerationR.hasMoreElements()) {
            f1 f1VarP = p(enumerationR);
            f1 f1VarP2 = p(enumerationR2);
            r1 r1VarC = f1VarP.c();
            r1 r1VarC2 = f1VarP2.c();
            if (r1VarC != r1VarC2 && !r1VarC.equals(r1VarC2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        Enumeration enumerationR = r();
        int size = size();
        while (enumerationR.hasMoreElements()) {
            size = (size * 17) ^ p(enumerationR).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<f1> iterator() {
        return new eh0.a(u());
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 k() {
        if (this.f17241j) {
            zj4 zj4Var = new zj4();
            zj4Var.i = this.i;
            return zj4Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.i.size(); i++) {
            vector.addElement(this.i.elementAt(i));
        }
        zj4 zj4Var2 = new zj4();
        zj4Var2.i = vector;
        zj4Var2.t();
        return zj4Var2;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 l() {
        tk4 tk4Var = new tk4();
        tk4Var.i = this.i;
        return tk4Var;
    }

    public final byte[] m(f1 f1Var) {
        try {
            return f1Var.c().e("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public final f1 p(Enumeration enumeration) {
        f1 f1Var = (f1) enumeration.nextElement();
        return f1Var == null ? rj4.INSTANCE : f1Var;
    }

    public f1 q(int i) {
        return (f1) this.i.elementAt(i);
    }

    public Enumeration r() {
        return this.i.elements();
    }

    public final boolean s(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != iMin; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return iMin == bArr.length;
    }

    public int size() {
        return this.i.size();
    }

    public void t() {
        if (this.f17241j) {
            return;
        }
        this.f17241j = true;
        if (this.i.size() > 1) {
            int size = this.i.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] bArrM = m((f1) this.i.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] bArrM2 = m((f1) this.i.elementAt(i3));
                    if (s(bArrM, bArrM2)) {
                        bArrM = bArrM2;
                    } else {
                        Object objElementAt = this.i.elementAt(i2);
                        Vector vector = this.i;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.i.setElementAt(objElementAt, i3);
                        z = true;
                        i = i2;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    public String toString() {
        return this.i.toString();
    }

    public f1[] u() {
        f1[] f1VarArr = new f1[size()];
        for (int i = 0; i != size(); i++) {
            f1VarArr[i] = q(i);
        }
        return f1VarArr;
    }

    public u1(f1 f1Var) {
        Vector vector = new Vector();
        this.i = vector;
        this.f17241j = false;
        vector.addElement(f1Var);
    }

    public u1(g1 g1Var, boolean z) {
        this.i = new Vector();
        this.f17241j = false;
        for (int i = 0; i != g1Var.c(); i++) {
            this.i.addElement(g1Var.b(i));
        }
        if (z) {
            t();
        }
    }

    public u1(f1[] f1VarArr, boolean z) {
        this.i = new Vector();
        this.f17241j = false;
        for (int i = 0; i != f1VarArr.length; i++) {
            this.i.addElement(f1VarArr[i]);
        }
        if (z) {
            t();
        }
    }
}
