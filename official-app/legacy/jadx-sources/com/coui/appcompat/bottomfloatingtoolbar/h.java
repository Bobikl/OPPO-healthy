package com.coui.appcompat.bottomfloatingtoolbar;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.sm9;

/* JADX INFO: loaded from: classes13.dex */
public class h implements sm9 {
    public final COUIBottomFloatingToolbarMenuView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.coui.appcompat.animation.dynamicanimation.b f1603l;
    public com.coui.appcompat.animation.dynamicanimation.b m;
    public COUIBottomFloatingToolbar.b o;
    public boolean q;
    public final RectF i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f1602j = new RectF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1604n = true;
    public float p = 0.0f;

    public class a extends FloatPropertyCompat<h> {
        public final /* synthetic */ c a;
        public final /* synthetic */ d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, c cVar, d dVar) {
            super(str);
            this.a = cVar;
            this.b = dVar;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(h hVar) {
            return this.a.a(hVar);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(h hVar, float f) {
            this.b.a(hVar, f);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int i;

        public b(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h.this.k.getParent();
            if (parent instanceof COUIBottomFloatingToolbar) {
                h.this.o = ((COUIBottomFloatingToolbar) parent).getAnimationCounter();
            }
            if (!h.this.f1603l.i() && h.this.o != null) {
                h.this.o.h(true, "HorizontalAnimation from doHorizontalAnim");
            }
            h.this.f1603l.r(h.this.i.left);
            h.this.f1603l.x(this.i);
            h.this.f1604n = false;
        }
    }

    public interface c<T extends h> {
        float a(T t);
    }

    public interface d<T extends h> {
        void a(T t, float f);
    }

    public h(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        this.k = cOUIBottomFloatingToolbarMenuView;
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
        COUIBottomFloatingToolbar.b bVar = this.o;
        if (bVar != null) {
            bVar.g(true, "HorizontalAnimation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
        A(f);
        COUIBottomFloatingToolbar.b bVar = this.o;
        if (bVar != null) {
            bVar.g(true, "ScaleAnimation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(boolean z) {
        COUIBottomFloatingToolbar.b bVar;
        if (!this.m.i() && (bVar = this.o) != null) {
            bVar.h(true, "ScaleAnimation from updateAttachState");
        }
        this.m.A().l(z ? 0.5f : 0.25f);
        this.m.A().i(z ? 0.4f : 0.0f);
        this.m.r(this.k.getScaleX() * 10000.0f);
        this.m.x(z ? 10000.0f : 0.0f);
    }

    public final void A(float f) {
        if (f == 0.0f) {
            this.k.b();
            ViewParent parent = this.k.getParent();
            if (parent instanceof COUIBottomFloatingToolbar) {
                ((COUIBottomFloatingToolbar) parent).t(this.k);
            }
            this.f1602j.setEmpty();
            this.i.setEmpty();
        }
    }

    public final void B() {
        this.f1603l = t("horizontal", new com.coui.appcompat.animation.dynamicanimation.c().l(0.5f).i(0.4f), new c() { // from class: com.oplus.aiunit.vision.gwb
            @Override // com.coui.appcompat.bottomfloatingtoolbar.h.c
            public final float a(com.coui.appcompat.bottomfloatingtoolbar.h hVar) {
                return hVar.w();
            }
        }, new d() { // from class: com.oplus.aiunit.vision.hwb
            @Override // com.coui.appcompat.bottomfloatingtoolbar.h.d
            public final void a(com.coui.appcompat.bottomfloatingtoolbar.h hVar, float f) {
                hVar.K(f);
            }
        }, null, new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.iwb
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
            public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                this.a.H(cOUIDynamicAnimation, z, f, f2);
            }
        });
        this.m = t("scale", new com.coui.appcompat.animation.dynamicanimation.c().l(0.5f).i(0.4f), new c() { // from class: com.oplus.aiunit.vision.jwb
            @Override // com.coui.appcompat.bottomfloatingtoolbar.h.c
            public final float a(com.coui.appcompat.bottomfloatingtoolbar.h hVar) {
                return hVar.z();
            }
        }, new d() { // from class: com.oplus.aiunit.vision.kwb
            @Override // com.coui.appcompat.bottomfloatingtoolbar.h.d
            public final void a(com.coui.appcompat.bottomfloatingtoolbar.h hVar, float f) {
                hVar.L(f);
            }
        }, null, new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.lwb
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
            public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                this.a.I(cOUIDynamicAnimation, z, f, f2);
            }
        });
    }

    public final void C() {
        if (this.k.getParent() instanceof View) {
            ((View) this.k.getParent()).invalidate();
        }
    }

    public final boolean D(float f, int i, int i2) {
        return E(f) && F(i) && G(i2);
    }

    public final boolean E(float f) {
        return (this.f1602j.centerX() == f || this.i.centerX() == f) ? false : true;
    }

    public final boolean F(int i) {
        float f = i;
        return (this.f1602j.left == f || this.i.left == f) ? false : true;
    }

    public final boolean G(int i) {
        float f = i;
        return (this.f1602j.right == f || this.i.right == f) ? false : true;
    }

    public final void K(float f) {
        RectF rectF = this.i;
        rectF.offsetTo(f, rectF.top);
        this.k.setX(this.i.left);
        C();
    }

    public final void L(float f) {
        this.p = f / 10000.0f;
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = this.k;
        cOUIBottomFloatingToolbarMenuView.setPivotX(cOUIBottomFloatingToolbarMenuView.getWidth() / 2.0f);
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView2 = this.k;
        cOUIBottomFloatingToolbarMenuView2.setPivotY(cOUIBottomFloatingToolbarMenuView2.getHeight() / 2.0f);
        this.k.setScaleX(this.p);
        this.k.setScaleY(this.p);
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void a(final boolean z, boolean z2) {
        this.q = z;
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = this.k;
        cOUIBottomFloatingToolbarMenuView.setPivotX(cOUIBottomFloatingToolbarMenuView.getWidth() / 2.0f);
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView2 = this.k;
        cOUIBottomFloatingToolbarMenuView2.setPivotY(cOUIBottomFloatingToolbarMenuView2.getHeight() / 2.0f);
        if (!z2) {
            this.k.setScaleX(z ? 1.0f : 0.0f);
            this.k.setScaleY(z ? 1.0f : 0.0f);
            return;
        }
        ViewParent parent = this.k.getParent();
        if (parent instanceof COUIBottomFloatingToolbar) {
            this.o = ((COUIBottomFloatingToolbar) parent).getAnimationCounter();
        }
        this.k.m();
        this.k.C(new Runnable() { // from class: com.oplus.aiunit.vision.mwb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.J(z);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void b() {
        this.f1602j.setEmpty();
        this.i.setEmpty();
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void c(int i, int i2, int i3, int i4, boolean z) {
        this.f1604n = true;
        RectF rectF = this.f1602j;
        float f = i;
        if (rectF.left == f && rectF.top == i2 && rectF.right == i3 && rectF.bottom == i4) {
            this.k.y = true;
            return;
        }
        float f2 = (i + i3) / 2.0f;
        if (rectF.isEmpty()) {
            this.i.set(f, i2, i3, i4);
        } else {
            COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = this.k;
            if (cOUIBottomFloatingToolbarMenuView.y) {
                ViewParent parent = cOUIBottomFloatingToolbarMenuView.getParent();
                boolean z2 = false;
                if ((parent instanceof COUIBottomFloatingToolbar) && ((COUIBottomFloatingToolbar) parent).getGroupAlignStyle() == 1) {
                    z2 = true;
                }
                if (z2 && z) {
                    u(i);
                } else if (z && D(f2, i, i3)) {
                    u(i);
                }
            } else {
                this.i.set(f, i2, i3, i4);
            }
        }
        this.f1602j.set(f, i2, i3, i4);
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView2 = this.k;
        cOUIBottomFloatingToolbarMenuView2.y = true;
        if (cOUIBottomFloatingToolbarMenuView2.A) {
            return;
        }
        cOUIBottomFloatingToolbarMenuView2.setRight((int) this.f1602j.right);
    }

    public void q() {
        if (this.f1603l.i()) {
            this.f1603l.c();
            K(this.f1602j.left);
        }
    }

    public void r() {
        q();
        s();
    }

    public void s() {
        if (this.m.i()) {
            this.m.c();
            float f = this.q ? 10000.0f : 0.0f;
            L(f);
            A(f);
        }
    }

    public final com.coui.appcompat.animation.dynamicanimation.b t(@NonNull String str, @NonNull com.coui.appcompat.animation.dynamicanimation.c cVar, @NonNull c<h> cVar2, @NonNull d<h> dVar, COUIDynamicAnimation.r rVar, COUIDynamicAnimation.q qVar) {
        com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, new a(str, cVar2, dVar));
        bVar.E(cVar);
        if (rVar != null) {
            bVar.b(rVar);
        }
        if (qVar != null) {
            bVar.a(qVar);
        }
        return bVar;
    }

    public final void u(int i) {
        this.k.setX(this.i.left);
        this.k.F(new b(i));
    }

    public RectF v() {
        return this.i;
    }

    public final float w() {
        return this.i.left;
    }

    public boolean x() {
        return this.f1604n;
    }

    public RectF y() {
        return this.f1602j;
    }

    public final float z() {
        return this.p * 10000.0f;
    }
}
