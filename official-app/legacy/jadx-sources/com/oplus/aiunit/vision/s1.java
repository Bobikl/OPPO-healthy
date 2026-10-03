package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s1 extends r1 implements Iterable {
    public Vector i;

    public s1() {
        this.i = new Vector();
    }

    public static s1 m(y1 y1Var, boolean z) {
        if (z) {
            if (y1Var.p()) {
                return n(y1Var.n().c());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (y1Var.p()) {
            return y1Var instanceof up0 ? new qp0(y1Var.n()) : new sk4(y1Var.n());
        }
        if (y1Var.n() instanceof s1) {
            return (s1) y1Var.n();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + y1Var.getClass().getName());
    }

    public static s1 n(Object obj) {
        if (obj == null || (obj instanceof s1)) {
            return (s1) obj;
        }
        if (obj instanceof t1) {
            return n(((t1) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return n(r1.i((byte[]) obj));
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e2.getMessage());
            }
        }
        if (obj instanceof f1) {
            r1 r1VarC = ((f1) obj).c();
            if (r1VarC instanceof s1) {
                return (s1) r1VarC;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (!(r1Var instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) r1Var;
        if (size() != s1Var.size()) {
            return false;
        }
        Enumeration enumerationQ = q();
        Enumeration enumerationQ2 = s1Var.q();
        while (enumerationQ.hasMoreElements()) {
            f1 f1VarO = o(enumerationQ);
            f1 f1VarO2 = o(enumerationQ2);
            r1 r1VarC = f1VarO.c();
            r1 r1VarC2 = f1VarO2.c();
            if (r1VarC != r1VarC2 && !r1VarC.equals(r1VarC2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        Enumeration enumerationQ = q();
        int size = size();
        while (enumerationQ.hasMoreElements()) {
            size = (size * 17) ^ o(enumerationQ).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<f1> iterator() {
        return new eh0.a(r());
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 k() {
        xj4 xj4Var = new xj4();
        xj4Var.i = this.i;
        return xj4Var;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 l() {
        sk4 sk4Var = new sk4();
        sk4Var.i = this.i;
        return sk4Var;
    }

    public final f1 o(Enumeration enumeration) {
        return (f1) enumeration.nextElement();
    }

    public f1 p(int i) {
        return (f1) this.i.elementAt(i);
    }

    public Enumeration q() {
        return this.i.elements();
    }

    public f1[] r() {
        f1[] f1VarArr = new f1[size()];
        for (int i = 0; i != size(); i++) {
            f1VarArr[i] = p(i);
        }
        return f1VarArr;
    }

    public int size() {
        return this.i.size();
    }

    public String toString() {
        return this.i.toString();
    }

    public s1(f1 f1Var) {
        Vector vector = new Vector();
        this.i = vector;
        vector.addElement(f1Var);
    }

    public s1(g1 g1Var) {
        this.i = new Vector();
        for (int i = 0; i != g1Var.c(); i++) {
            this.i.addElement(g1Var.b(i));
        }
    }

    public s1(f1[] f1VarArr) {
        this.i = new Vector();
        for (int i = 0; i != f1VarArr.length; i++) {
            this.i.addElement(f1VarArr[i]);
        }
    }
}
