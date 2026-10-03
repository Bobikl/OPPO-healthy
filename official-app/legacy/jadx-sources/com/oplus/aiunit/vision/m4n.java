package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m4n {
    public m4n a;

    public m4n() {
    }

    public int a() {
        m4n m4nVar = this.a;
        return Math.min(Integer.MAX_VALUE, m4nVar != null ? m4nVar.a() : Integer.MAX_VALUE);
    }

    public void b(int i) {
        m4n m4nVar = this.a;
        if (m4nVar != null) {
            m4nVar.b(i);
        }
    }

    public void c(boolean z) {
        m4n m4nVar = this.a;
        if (m4nVar != null) {
            m4nVar.c(z);
        }
    }

    public abstract boolean d();

    public final boolean e() {
        m4n m4nVar = this.a;
        if (m4nVar != null ? m4nVar.e() : true) {
            return d();
        }
        return false;
    }

    public m4n(m4n m4nVar) {
        this.a = m4nVar;
    }
}
