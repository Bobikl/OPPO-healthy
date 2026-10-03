package com.oplus.aiunit.vision;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class nli implements b95 {
    public final char a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<b95> f14551c = new LinkedList<>();

    public nli(char c2) {
        this.a = c2;
    }

    @Override // com.oplus.aiunit.vision.b95
    public char a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.b95
    public int b() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.b95
    public char c() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.b95
    public void d(zrj zrjVar, zrj zrjVar2, int i) {
        g(i).d(zrjVar, zrjVar2, i);
    }

    @Override // com.oplus.aiunit.vision.b95
    public int e(c95 c95Var, c95 c95Var2) {
        return g(c95Var.length()).e(c95Var, c95Var2);
    }

    public void f(b95 b95Var) {
        boolean z;
        int iB = b95Var.b();
        ListIterator<b95> listIterator = this.f14551c.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                z = false;
                break;
            }
            int iB2 = listIterator.next().b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(b95Var);
                z = true;
                break;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iB);
            }
        }
        if (z) {
            return;
        }
        this.f14551c.add(b95Var);
        this.b = iB;
    }

    public final b95 g(int i) {
        for (b95 b95Var : this.f14551c) {
            if (b95Var.b() <= i) {
                return b95Var;
            }
        }
        return this.f14551c.getFirst();
    }
}
