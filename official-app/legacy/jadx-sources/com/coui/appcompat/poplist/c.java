package com.coui.appcompat.poplist;

import android.util.Log;
import android.view.View;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.ifk;

/* JADX INFO: loaded from: classes13.dex */
public class c extends com.coui.appcompat.poplist.a {
    public static final FloatPropertyCompat<c> o = new a("subMenuTransition");
    public static final FloatPropertyCompat<c> p = new b("mainMenuScaleTransition");
    public static final FloatPropertyCompat<c> q = new C0206c("mainMenuAlphaTransition");
    public com.coui.appcompat.animation.dynamicanimation.b h;
    public com.coui.appcompat.animation.dynamicanimation.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.coui.appcompat.animation.dynamicanimation.b f1879j;
    public final COUIDynamicAnimation.q f = new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.q55
        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            this.a.B(cOUIDynamicAnimation, z, f, f2);
        }
    };
    public final COUIDynamicAnimation.q g = new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.r55
        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            this.a.C(cOUIDynamicAnimation, z, f, f2);
        }
    };
    public float k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1880l = 0.0f;
    public float m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1881n = 1.0f;

    public class a extends FloatPropertyCompat<c> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(c cVar) {
            return cVar.A();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(c cVar, float f) {
            cVar.F(f);
        }
    }

    public class b extends FloatPropertyCompat<c> {
        public b(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(c cVar) {
            return cVar.z();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(c cVar, float f) {
            cVar.E(f);
        }
    }

    /* JADX INFO: renamed from: com.coui.appcompat.poplist.c$c, reason: collision with other inner class name */
    public class C0206c extends FloatPropertyCompat<c> {
        public C0206c(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(c cVar) {
            return cVar.y();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(c cVar, float f) {
            cVar.D(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
        if (z) {
            com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
            if (interfaceC0204a != null) {
                interfaceC0204a.b();
                return;
            }
            return;
        }
        if (f == 0.0f) {
            com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a2 = this.a;
            if (interfaceC0204a2 != null) {
                interfaceC0204a2.d();
                return;
            }
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a3 = this.a;
        if (interfaceC0204a3 != null) {
            interfaceC0204a3.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
        if (z) {
            com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
            if (interfaceC0204a != null) {
                interfaceC0204a.h();
                return;
            }
            return;
        }
        if (f == 0.0f) {
            com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a2 = this.a;
            if (interfaceC0204a2 != null) {
                interfaceC0204a2.i();
                return;
            }
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a3 = this.a;
        if (interfaceC0204a3 != null) {
            interfaceC0204a3.a();
        }
    }

    public final float A() {
        return this.m;
    }

    public final void D(float f) {
        this.f1880l = f;
        float f2 = f / 10000.0f;
        View view = this.f1873c;
        if (view == null) {
            Log.w("PopupMenuAnimCtrl-D", "No main menu root view! Skip animation update");
            return;
        }
        if (view.getVisibility() != 0) {
            this.f1873c.setVisibility(0);
        }
        float fI = ifk.i(0.01f, 1.0f, f2);
        this.f1881n = fI;
        this.b.setAlpha(fI);
        View view2 = this.f1873c;
        if ((view2 instanceof RoundFrameLayout) && ((RoundFrameLayout) view2).getUseBackgroundBlur()) {
            this.f1873c.setAlpha(this.f1881n);
        }
        View view3 = this.d;
        if ((view3 instanceof RoundFrameLayout) && ((RoundFrameLayout) view3).getUseBackgroundBlur()) {
            this.d.setAlpha(this.f1881n);
        }
    }

    public final void E(float f) {
        if (this.k != 0.0f && this.f1880l == 0.0f && this.h.y()) {
            this.k = 0.0f;
        } else {
            this.k = f;
        }
        float f2 = this.k / 10000.0f;
        View view = this.f1873c;
        if (view == null) {
            Log.w("PopupMenuAnimCtrl-D", "No main menu root view! Skip animation update");
            return;
        }
        if (view.getVisibility() != 0) {
            this.f1873c.setVisibility(0);
        }
        this.b.setScaleX(ifk.i(0.0f, 1.0f, f2));
        this.b.setScaleY(ifk.i(0.0f, 1.0f, f2));
    }

    public final void F(float f) {
        this.m = f;
        float f2 = f / 10000.0f;
        View view = this.d;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            float fI = ifk.i(0.01f, 1.0f, f2);
            View view2 = this.d;
            if ((view2 instanceof RoundFrameLayout) && ((RoundFrameLayout) view2).getUseBackgroundBlur()) {
                this.d.setVisibility(fI <= 0.1f ? 8 : 0);
            }
            this.d.setAlpha(fI * this.f1881n);
            this.d.setScaleX(ifk.i(0.0f, 1.0f, f2));
            this.d.setScaleY(ifk.i(0.0f, 1.0f, f2));
        }
    }

    @Override // com.coui.appcompat.poplist.a
    public void a() {
        View view = this.d;
        if (view instanceof RoundFrameLayout) {
            view.setAlpha(1.0f);
            this.d.setScaleX(1.0f);
            this.d.setScaleY(1.0f);
        }
    }

    @Override // com.coui.appcompat.poplist.a
    public void c(View view) {
        this.k = 0.0f;
        this.f1880l = 0.0f;
        super.c(view);
        w();
    }

    @Override // com.coui.appcompat.poplist.a
    public void e(View view) {
        x();
        if (this.f1879j.i() && this.f1879j.y()) {
            this.f1879j.c();
        }
        super.e(view);
    }

    @Override // com.coui.appcompat.poplist.a
    public void g(boolean z) {
        if (this.f1873c == null) {
            Log.w("PopupMenuAnimCtrl-D", "No main menu root view! Set a main menu view before starting animation!");
            return;
        }
        this.b.setPivotX(this.f1874e.e());
        this.b.setPivotY(this.f1874e.f());
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.j();
        }
        this.h.A().l(0.35f);
        this.h.A().i(0.2f);
        this.h.r(this.k);
        this.h.x(10000.0f);
        if (!z && this.h.y()) {
            this.h.F();
        }
        this.i.A().l(0.35f);
        this.i.A().i(0.2f);
        this.i.r(this.f1880l);
        this.i.x(10000.0f);
        if (z || !this.i.y()) {
            return;
        }
        this.i.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void i(boolean z) {
        if (this.f1873c == null) {
            Log.w("PopupMenuAnimCtrl-D", "No main menu root view! Set a main menu view before starting animation!");
            return;
        }
        this.b.setPivotX(this.f1874e.e());
        this.b.setPivotY(this.f1874e.f());
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.f();
        }
        this.h.A().l(0.3f);
        this.h.A().i(0.0f);
        this.h.r(this.k);
        this.h.x(0.0f);
        if (!z && this.h.y()) {
            this.h.F();
        }
        this.i.A().l(0.25f);
        this.i.A().i(0.0f);
        this.i.r(this.f1880l);
        this.i.x(0.0f);
        if (z || !this.i.y()) {
            return;
        }
        this.i.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void k(boolean z) {
        if (this.f1873c == null) {
            Log.e("PopupMenuAnimCtrl-D", "No main menu view! Add a main menu view before showing sub menu!");
            return;
        }
        if (this.d == null) {
            Log.w("PopupMenuAnimCtrl-D", "No sub menu root view! Set a sub menu view before starting animation!");
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.e();
        }
        this.d.setPivotX(this.f1874e.g());
        this.d.setPivotY(this.f1874e.h());
        this.f1879j.r(this.m);
        this.f1879j.x(10000.0f);
        if (z || !this.f1879j.y()) {
            return;
        }
        this.f1879j.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void m(boolean z) {
        if (this.f1873c == null) {
            Log.e("PopupMenuAnimCtrl-D", "No main menu view! Add a main menu view before showing sub menu!");
            return;
        }
        if (this.d == null) {
            Log.w("PopupMenuAnimCtrl-D", "No sub menu root view! Set a sub menu view before starting animation!");
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.c();
        }
        x();
        this.f1879j.r(this.m);
        this.f1879j.x(0.0f);
        if (z || !this.f1879j.y()) {
            return;
        }
        this.f1879j.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void n() {
        com.coui.appcompat.animation.dynamicanimation.b bVar = this.h;
        if (bVar != null) {
            bVar.c();
            E(0.0f);
            D(0.0f);
        }
        com.coui.appcompat.animation.dynamicanimation.b bVar2 = this.f1879j;
        if (bVar2 != null) {
            bVar2.c();
            F(0.0f);
        }
    }

    public final void w() {
        if (this.h == null || this.i == null) {
            com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar.i(0.2f);
            cVar.l(0.35f);
            com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, p);
            this.h = bVar;
            bVar.E(cVar);
            com.coui.appcompat.animation.dynamicanimation.c cVar2 = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar2.i(0.2f);
            cVar2.l(0.35f);
            com.coui.appcompat.animation.dynamicanimation.b bVar2 = new com.coui.appcompat.animation.dynamicanimation.b(this, q);
            this.i = bVar2;
            bVar2.E(cVar2);
            this.i.a(this.f);
        }
    }

    public final void x() {
        if (this.f1879j != null) {
            return;
        }
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.35f);
        com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, o);
        this.f1879j = bVar;
        bVar.E(cVar);
        this.f1879j.a(this.g);
    }

    public final float y() {
        return this.f1880l;
    }

    public final float z() {
        return this.k;
    }
}
