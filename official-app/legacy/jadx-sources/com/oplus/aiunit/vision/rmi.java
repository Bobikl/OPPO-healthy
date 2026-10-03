package com.oplus.aiunit.vision;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;

/* JADX INFO: loaded from: classes13.dex */
public class rmi {
    public static final float DEFAULT_ANIMATE_FACTOR = 10000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArgbEvaluator f16259l = new ArgbEvaluator();
    public final String a;
    public final FloatPropertyCompat<rmi> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final COUIDynamicAnimation.q f16260c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16261e;
    public int f;
    public float g;
    public float h;
    public com.coui.appcompat.animation.dynamicanimation.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f16262j;
    public View k;

    public class a implements COUIDynamicAnimation.q {
        public a() {
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            rmi.this.d(0.0f, true);
            cOUIDynamicAnimation.removeEndListener(rmi.this.f16260c);
        }
    }

    public class b extends FloatPropertyCompat<rmi> {
        public b(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(rmi rmiVar) {
            return rmiVar.h();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(rmi rmiVar, float f) {
            rmiVar.j(f);
        }
    }

    public rmi(Drawable drawable, String str, int i, int i2) {
        this(drawable, null, str, i, i2);
    }

    public void d(float f, boolean z) {
        f();
        this.i.removeEndListener(this.f16260c);
        if (z) {
            this.i.r(this.g);
            this.i.x(f);
        } else {
            if (this.i.i()) {
                this.i.x(f);
                this.i.C();
            }
            j(f);
        }
        this.h = Float.MAX_VALUE;
    }

    public void e(float f, float f2) {
        f();
        this.i.removeEndListener(this.f16260c);
        if (!this.i.i()) {
            this.i.r(this.g);
            this.i.x(f);
            this.h = f2;
        } else {
            float f3 = this.g;
            if (f3 <= f2) {
                this.h = f2;
            } else {
                this.i.r(f3);
                this.i.x(f);
            }
        }
    }

    public final void f() {
        if (this.i != null) {
            return;
        }
        com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, this.b);
        this.i = bVar;
        bVar.E(new com.coui.appcompat.animation.dynamicanimation.c());
    }

    public int g() {
        return this.d;
    }

    public final float h() {
        return this.g;
    }

    public void i(int i) {
        this.f16261e = i;
    }

    public final void j(float f) {
        this.g = f;
        this.d = ((Integer) f16259l.evaluate(f / 10000.0f, Integer.valueOf(this.f), Integer.valueOf(this.f16261e))).intValue();
        Drawable drawable = this.f16262j;
        if (drawable != null) {
            drawable.invalidateSelf();
        }
        View view = this.k;
        if (view != null) {
            view.invalidate();
        }
        float f2 = this.g;
        if (f2 > this.h) {
            this.h = Float.MAX_VALUE;
            if (f2 >= 10000.0f) {
                this.i.a(this.f16260c);
            } else {
                d(0.0f, true);
            }
        }
    }

    public void k(float f) {
        f();
        this.i.A().i(f);
    }

    public void l(float f) {
        f();
        this.i.A().l(f);
    }

    public rmi(View view, String str, int i, int i2) {
        this(null, view, str, i, i2);
    }

    public rmi(Drawable drawable, View view, String str, int i, int i2) {
        this.f16260c = new a();
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.f16262j = drawable;
        this.k = view;
        this.a = str;
        this.b = new b(str);
        f();
        this.f = i;
        this.f16261e = i2;
    }
}
