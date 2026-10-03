package com.oplus.aiunit.vision;

import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public class g1 {
    public final Vector a = new Vector();

    public void a(f1 f1Var) {
        this.a.addElement(f1Var);
    }

    public f1 b(int i) {
        return (f1) this.a.elementAt(i);
    }

    public int c() {
        return this.a.size();
    }
}
