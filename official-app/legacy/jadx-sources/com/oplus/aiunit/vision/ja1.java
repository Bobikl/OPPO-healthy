package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.oplus.aiunit.vision.nm9;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ja1<V extends nm9> {
    public WeakReference<V> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xs3 f12814j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() throws Throwable {
        if (j() != null) {
            this.i.get().A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() throws Throwable {
        if (j() != null) {
            this.i.get().K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Throwable th) throws Throwable {
        if (j() != null) {
            this.i.get().K();
        }
    }

    public <T> void f(lbd<T> lbdVar, jv5 jv5Var) {
        if (this.f12814j == null) {
            this.f12814j = new xs3();
        }
        this.f12814j.a(jv5Var);
        lbdVar.L0(su8.c()).L(new Cdo() { // from class: com.oplus.aiunit.vision.ga1
            @Override // com.oplus.aiunit.vision.Cdo
            public final void run() throws Throwable {
                this.i.m();
            }
        }).E(new Cdo() { // from class: com.oplus.aiunit.vision.ha1
            @Override // com.oplus.aiunit.vision.Cdo
            public final void run() throws Throwable {
                this.i.n();
            }
        }).H(new o14() { // from class: com.oplus.aiunit.vision.ia1
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.o((Throwable) obj);
            }
        }).n0(f30.c()).subscribe(jv5Var);
    }

    public void g(V v) {
        this.i = new WeakReference<>(v);
    }

    public void h() {
        WeakReference<V> weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
            this.i = null;
        }
        p();
    }

    public Context i() {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        return (Context) objJ;
    }

    public V j() {
        WeakReference<V> weakReference = this.i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public abstract void k(Intent intent);

    public abstract void l(Bundle bundle);

    public void p() {
        xs3 xs3Var = this.f12814j;
        if (xs3Var != null) {
            xs3Var.dispose();
        }
    }
}
