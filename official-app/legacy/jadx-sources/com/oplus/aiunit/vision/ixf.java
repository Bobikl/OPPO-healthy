package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ixf extends RippleDrawable implements c56, oy9 {
    public final b56 i;

    public ixf(String str) {
        super(ColorStateList.valueOf(0), null, null);
        this.i = new b56(str, this);
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void a() {
        this.i.a();
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void b() {
        this.i.b();
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void c() {
        this.i.c();
    }

    public void d(int i, boolean z, boolean z2, boolean z3) {
        this.i.d(i, z, z2, z3);
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void f() {
        this.i.f();
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void i() {
        this.i.i();
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.i.u();
    }

    @Override // com.oplus.aiunit.vision.c56
    public final void j() {
        this.i.j();
    }

    public boolean k() {
        return this.i.m();
    }

    public final boolean l() {
        return this.i.n();
    }

    public final boolean m() {
        return this.i.o();
    }

    public final boolean n() {
        return this.i.p();
    }

    public final boolean o() {
        return this.i.r();
    }

    public boolean p(int i) {
        return this.i.t(i);
    }

    public void q(boolean z) {
        this.i.y(z);
    }
}
