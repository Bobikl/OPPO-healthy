package com.coui.appcompat.poplist;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.tne;
import com.support.poplist.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class d extends com.coui.appcompat.poplist.a {
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.coui.appcompat.animation.dynamicanimation.b f1882j;
    public com.coui.appcompat.animation.dynamicanimation.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.coui.appcompat.animation.dynamicanimation.b f1883l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1884n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float w;
    public float x;
    public float y;
    public static final FloatPropertyCompat<d> z = new a("subMenuTransition");
    public static final FloatPropertyCompat<d> A = new b("mainMenuTScaletransition");
    public static final FloatPropertyCompat<d> B = new c("mainMenuAlphaTransition");
    public final COUIDynamicAnimation.q h = new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.trh
        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z2, float f, float f2) {
            this.a.D(cOUIDynamicAnimation, z2, f, f2);
        }
    };
    public final COUIDynamicAnimation.q i = new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.urh
        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z2, float f, float f2) {
            this.a.E(cOUIDynamicAnimation, z2, f, f2);
        }
    };
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public float v = 1.0f;

    public class a extends FloatPropertyCompat<d> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(d dVar) {
            return dVar.C();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(d dVar, float f) {
            dVar.H(f);
        }
    }

    public class b extends FloatPropertyCompat<d> {
        public b(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(d dVar) {
            return dVar.B();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(d dVar, float f) {
            dVar.G(f);
        }
    }

    public class c extends FloatPropertyCompat<d> {
        public c(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(d dVar) {
            return dVar.A();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(d dVar, float f) {
            dVar.F(f);
        }
    }

    public d(Context context) {
        this.f = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_min_gap_to_top);
        this.g = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_padding_vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(COUIDynamicAnimation cOUIDynamicAnimation, boolean z2, float f, float f2) {
        if (z2) {
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
    public /* synthetic */ void E(COUIDynamicAnimation cOUIDynamicAnimation, boolean z2, float f, float f2) {
        if (z2) {
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
        return this.t;
    }

    public final float B() {
        return this.s;
    }

    public final float C() {
        return this.u;
    }

    public final void F(float f) {
        this.t = f;
        float f2 = f / 10000.0f;
        View view = this.f1873c;
        if (view == null) {
            Log.w("PopupMenuAnimCtrl-S", "No main menu root view! Skip animation update");
            return;
        }
        if (view.getVisibility() != 0) {
            this.f1873c.setVisibility(0);
        }
        float fI = ifk.i(0.01f, 1.0f, f2);
        this.v = fI;
        this.b.setAlpha(fI);
        View view2 = this.f1873c;
        if ((view2 instanceof RoundFrameLayout) && ((RoundFrameLayout) view2).getUseBackgroundBlur()) {
            this.f1873c.setAlpha(this.v);
        }
        View view3 = this.d;
        if ((view3 instanceof RoundFrameLayout) && ((RoundFrameLayout) view3).getUseBackgroundBlur()) {
            this.d.setAlpha(this.v);
        }
    }

    public final void G(float f) {
        if (this.s != 0.0f && this.t == 0.0f && this.f1882j.y()) {
            this.s = 0.0f;
        } else {
            this.s = f;
        }
        float f2 = this.s / 10000.0f;
        View view = this.f1873c;
        if (view == null) {
            Log.w("PopupMenuAnimCtrl-S", "No main menu root view! Skip animation update");
            return;
        }
        if (view.getVisibility() != 0) {
            this.f1873c.setVisibility(0);
        }
        this.b.setScaleX(ifk.i(0.0f, 1.0f, f2));
        this.b.setScaleY(ifk.i(0.0f, 1.0f, f2));
    }

    public final void H(float f) {
        this.u = f;
        float f2 = f / 10000.0f;
        int iRound = Math.round(ifk.i(this.m, this.f1884n, f2));
        View view = this.d;
        if (view instanceof RoundFrameLayout) {
            if (view.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            this.d.setTranslationY(iRound);
            int i = (int) ifk.i(this.o, this.p, f2);
            ((RoundFrameLayout) this.d).s(0, i, this.f1874e.f17072e.width(), i + ((int) ifk.i(this.q, this.r, f2)), f2);
            View childAt = ((RoundFrameLayout) this.d).getChildAt(0);
            if (childAt instanceof ListView) {
                int i2 = 1;
                while (true) {
                    ListView listView = (ListView) childAt;
                    if (i2 > listView.getChildCount()) {
                        break;
                    }
                    View childAt2 = listView.getChildAt(i2);
                    if (childAt2 != null) {
                        childAt2.setAlpha(f2);
                    }
                    i2++;
                }
            }
        }
        View view2 = this.f1873c;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).getChildAt(0).setAlpha(ifk.i(1.0f, this.w, f2));
        }
        this.f1873c.setScaleX(ifk.i(1.0f, this.x, f2));
        this.f1873c.setScaleY(ifk.i(1.0f, this.y, f2));
        I(f2, iRound);
    }

    public final void I(float f, int i) {
        if (this.f1874e.f17072e.isEmpty()) {
            this.f1873c.setTranslationY(0.0f);
            return;
        }
        tne tneVar = this.f1874e;
        int i2 = tneVar.f17071c.top;
        int i3 = this.f;
        int i4 = i2 + i3;
        int i5 = tneVar.f17072e.top;
        if (i4 > i5) {
            this.f1873c.setTranslationY((int) ifk.i(0.0f, (i5 - i3) - i2, f));
        } else if (i2 + i3 > i5 + i) {
            this.f1873c.setTranslationY((i5 + i) - (i2 + i3));
        } else {
            this.f1873c.setTranslationY(0.0f);
        }
    }

    @Override // com.coui.appcompat.poplist.a
    public void a() {
        View view = this.d;
        if (view instanceof RoundFrameLayout) {
            view.setTranslationY(0.0f);
            ((RoundFrameLayout) this.d).m();
        }
    }

    @Override // com.coui.appcompat.poplist.a
    public void c(View view) {
        y();
        this.s = 0.0f;
        this.t = 0.0f;
        super.c(view);
    }

    @Override // com.coui.appcompat.poplist.a
    public void e(View view) {
        z();
        if (this.f1883l.i() && this.f1883l.y()) {
            if (view == this.d) {
                this.f1883l.c();
            } else {
                this.f1883l.F();
            }
        }
        tne tneVar = this.f1874e;
        int i = tneVar.g.top - tneVar.f17072e.top;
        this.m = i;
        if (!tneVar.f17074l) {
            this.m = i - this.g;
        }
        this.f1884n = 0;
        super.e(view);
    }

    @Override // com.coui.appcompat.poplist.a
    public void g(boolean z2) {
        if (this.f1873c == null) {
            Log.w("PopupMenuAnimCtrl-S", "No main menu root view! Set a main menu view before starting animation!");
            return;
        }
        this.b.setTranslationY(0.0f);
        this.b.setPivotX(this.f1874e.e());
        this.b.setPivotY(this.f1874e.f());
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.j();
        }
        this.f1882j.A().l(0.35f);
        this.f1882j.A().i(0.2f);
        this.f1882j.r(this.s);
        this.f1882j.x(10000.0f);
        if (!z2 && this.f1882j.y()) {
            this.f1882j.F();
        }
        this.k.A().l(0.35f);
        this.k.A().i(0.2f);
        this.k.r(this.t);
        this.k.x(10000.0f);
        if (z2 || !this.k.y()) {
            return;
        }
        this.k.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void i(boolean z2) {
        if (this.f1873c == null) {
            Log.w("PopupMenuAnimCtrl-S", "No main menu root view! Set a main menu view before starting animation!");
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.f();
        }
        this.f1882j.A().l(0.3f);
        this.f1882j.A().i(0.0f);
        this.f1882j.r(this.s);
        this.f1882j.x(0.0f);
        if (!z2 && this.f1882j.y()) {
            this.f1882j.F();
        }
        this.k.A().l(0.25f);
        this.k.A().i(0.0f);
        this.k.r(this.t);
        this.k.x(0.0f);
        if (z2 || !this.k.y()) {
            return;
        }
        this.k.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void k(boolean z2) {
        if (this.f1873c == null) {
            Log.e("PopupMenuAnimCtrl-S", "No main menu view! Add a main menu view before showing sub menu!");
            return;
        }
        if (this.d == null) {
            Log.w("PopupMenuAnimCtrl-S", "No sub menu root view! Set a sub menu view before starting animation!");
            return;
        }
        w();
        x();
        this.d.setAlpha(this.v);
        this.f1883l.r(this.u);
        this.f1883l.x(10000.0f);
        if (z2 || !this.f1883l.y()) {
            return;
        }
        this.f1883l.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void m(boolean z2) {
        z();
        if (this.f1883l.i()) {
            Log.w("PopupMenuAnimCtrl-S", "Sub menu is exiting!");
        }
        if (this.d == null) {
            Log.w("PopupMenuAnimCtrl-S", "No sub menu root view! Set a sub menu view before starting animation!");
            return;
        }
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.c();
        }
        this.f1883l.r(this.u);
        this.f1883l.x(0.0f);
        if (z2 || !this.f1883l.y()) {
            return;
        }
        this.f1883l.F();
    }

    @Override // com.coui.appcompat.poplist.a
    public void n() {
        com.coui.appcompat.animation.dynamicanimation.b bVar = this.f1882j;
        if (bVar != null) {
            bVar.c();
            G(0.0f);
            F(0.0f);
        }
        com.coui.appcompat.animation.dynamicanimation.b bVar2 = this.f1883l;
        if (bVar2 != null) {
            bVar2.c();
            H(0.0f);
        }
    }

    public final void w() {
        this.w = 0.3f;
        float fWidth = this.f1874e.d.width() / this.f1874e.f17071c.width();
        this.x = fWidth;
        this.y = fWidth;
        tne tneVar = this.f1874e;
        Rect rect = tneVar.f17071c;
        int i = rect.left;
        Rect rect2 = tneVar.d;
        if (i == rect2.left) {
            this.f1873c.setPivotX(0.0f);
        } else if (rect.right == rect2.right) {
            View view = this.f1873c;
            view.setPivotX(view.getWidth());
        } else {
            View view2 = this.f1873c;
            view2.setPivotX(view2.getWidth() / 2.0f);
        }
        this.f1873c.setPivotY(0.0f);
    }

    public final void x() {
        com.coui.appcompat.poplist.a.InterfaceC0204a interfaceC0204a = this.a;
        if (interfaceC0204a != null) {
            interfaceC0204a.e();
        }
        this.o = this.g * 2;
        this.p = 0;
        this.q = this.f1874e.g.height() - this.o;
        this.r = this.f1874e.f17072e.height();
        View view = this.d;
        if (view instanceof RoundFrameLayout) {
            ((RoundFrameLayout) view).s(0, this.o, this.f1874e.f17072e.width(), this.q, 1.0f);
        }
    }

    public final void y() {
        if (this.f1882j == null || this.k == null) {
            com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar.i(0.2f);
            cVar.l(0.35f);
            com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, A);
            this.f1882j = bVar;
            bVar.E(cVar);
            com.coui.appcompat.animation.dynamicanimation.c cVar2 = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar2.i(0.2f);
            cVar2.l(0.35f);
            com.coui.appcompat.animation.dynamicanimation.b bVar2 = new com.coui.appcompat.animation.dynamicanimation.b(this, B);
            this.k = bVar2;
            bVar2.E(cVar2);
            this.k.a(this.h);
        }
    }

    public final void z() {
        if (this.f1883l != null) {
            return;
        }
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.35f);
        com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, z);
        this.f1883l = bVar;
        bVar.E(cVar);
        this.f1883l.a(this.i);
    }
}
