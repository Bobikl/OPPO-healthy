package com.coui.appcompat.input;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.view.View;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.coui.appcompat.animation.dynamicanimation.b;
import com.coui.appcompat.animation.dynamicanimation.c;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public final Matrix a;
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f1809c;
    public b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RadialGradient f1810e;
    public RadialGradient f;
    public float g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1811j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0202a f1812l;

    /* JADX INFO: renamed from: com.coui.appcompat.input.a$a, reason: collision with other inner class name */
    public interface InterfaceC0202a {
        default void onInnerLightUpdate(float f) {
        }
    }

    public a(View view) {
        this(view, 0.0f, 0.0f, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        this.g = f;
        InterfaceC0202a interfaceC0202a = this.f1812l;
        if (interfaceC0202a != null) {
            interfaceC0202a.onInnerLightUpdate(f);
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        this.h = f;
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
    }

    public void c(Canvas canvas, float f, Path path, Paint paint, float f2, float f3) {
        if (paint == null || this.f1810e == null || this.f == null) {
            return;
        }
        float f4 = this.k;
        float f5 = this.f1811j;
        float f6 = (((this.h / 255.0f) * (f4 - f5)) + f5) / f4;
        this.a.reset();
        this.a.setScale(f6, f6, f2, f3);
        this.f.setLocalMatrix(this.a);
        paint.setShader(this.f);
        paint.setAlpha((int) this.h);
        paint.setBlendMode(BlendMode.LIGHTEN);
        canvas.drawPath(path, paint);
        this.a.reset();
        this.a.setScale(f, f, f2, f3);
        this.f1810e.setLocalMatrix(this.a);
        paint.setShader(this.f1810e);
        paint.setAlpha((int) this.g);
        canvas.drawCircle(f2, f3, this.i * f, paint);
    }

    public final void d() {
        if (this.f1809c == null) {
            c cVar = new c();
            cVar.i(0.0f);
            cVar.l(0.3f);
            b bVar = new b(new FloatValueHolder(this.g));
            this.f1809c = bVar;
            bVar.E(cVar);
            this.f1809c.b(new COUIDynamicAnimation.r() { // from class: com.oplus.aiunit.vision.mwa
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.f(cOUIDynamicAnimation, f, f2);
                }
            });
        }
        if (this.d == null) {
            c cVar2 = new c();
            cVar2.i(0.0f);
            cVar2.l(0.3f);
            b bVar2 = new b(new FloatValueHolder(this.h));
            this.d = bVar2;
            bVar2.E(cVar2);
            this.d.b(new COUIDynamicAnimation.r() { // from class: com.oplus.aiunit.vision.nwa
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.g(cOUIDynamicAnimation, f, f2);
                }
            });
        }
    }

    public void e(boolean z) {
        d();
        this.f1809c.x(z ? 255.0f : 0.0f);
        this.d.A().l(z ? 0.3f : 0.6f);
        this.d.x(z ? 255.0f : 0.0f);
    }

    public void h(InterfaceC0202a interfaceC0202a) {
        this.f1812l = interfaceC0202a;
    }

    public void i(float f, float f2, RadialGradient radialGradient, RadialGradient radialGradient2) {
        this.i = f;
        this.f1811j = 0.6f * f2;
        this.k = f2;
        this.f1810e = radialGradient;
        this.f = radialGradient2;
    }

    public a(View view, float f, float f2, RadialGradient radialGradient, RadialGradient radialGradient2) {
        this.b = view;
        this.a = new Matrix();
        this.i = f;
        this.f1811j = 0.6f * f2;
        this.k = f2;
        this.f1810e = radialGradient;
        this.f = radialGradient2;
    }
}
