package com.coui.appcompat.poplist;

import android.view.View;
import com.oplus.aiunit.vision.tne;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public InterfaceC0204a a = null;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1873c;
    public View d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tne f1874e;

    /* JADX INFO: renamed from: com.coui.appcompat.poplist.a$a, reason: collision with other inner class name */
    public interface InterfaceC0204a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();

        void j();
    }

    public void a() {
    }

    public void b(tne tneVar) {
        this.f1874e = tneVar;
    }

    public void c(View view) {
        this.f1873c = view;
    }

    public void d(View view) {
        this.b = view;
    }

    public void e(View view) {
        this.d = view;
    }

    public final void f() {
        g(true);
    }

    public void g(boolean z) {
    }

    public final void h() {
        i(true);
    }

    public void i(boolean z) {
    }

    public final void j() {
        k(true);
    }

    public void k(boolean z) {
    }

    public final void l() {
        m(true);
    }

    public void m(boolean z) {
    }

    public void n() {
    }

    public void setOnSubMenuStateChangedListener(InterfaceC0204a interfaceC0204a) {
        this.a = interfaceC0204a;
    }
}
