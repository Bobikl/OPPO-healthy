package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import com.support.appcompat.R$attr;

/* JADX INFO: loaded from: classes13.dex */
public class ej2 extends wmi {
    public static final float DEFAULT_SPRING_BOUNCE = 0.0f;
    public static final float DEFAULT_SPRING_RESPONSE = 0.3f;
    public static final int MASK_EFFECT_TYPE_CONTAINER_WIDGET = 1;
    public static final int MASK_EFFECT_TYPE_WIDGET_WITH_BACKGROUND = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f10948j;
    public final rmi k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rmi f10949l;
    public final rmi m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10950n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public float s;
    public float t;
    public float u;
    public Path v;
    public RectF w;
    public xmi x;

    public ej2(Context context, int i) {
        super("COUIMaskEffectDrawable");
        this.f10948j = new Paint(1);
        this.f10950n = true;
        this.o = true;
        this.p = true;
        this.q = true;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.7f;
        this.x = null;
        this.r = i;
        rmi rmiVar = new rmi(this, "hover", 0, lh2.a(context, R$attr.couiColorHover));
        this.k = rmiVar;
        rmi rmiVar2 = new rmi(this, "focus", 0, lh2.a(context, R$attr.couiColorFocus));
        this.f10949l = rmiVar2;
        rmi rmiVar3 = new rmi(this, "press", 0, lh2.a(context, R$attr.couiColorPress));
        this.m = rmiVar3;
        rmiVar.l(0.3f);
        rmiVar.k(0.0f);
        rmiVar2.l(0.3f);
        rmiVar2.k(0.0f);
        rmiVar3.l(0.3f);
        rmiVar3.k(0.0f);
    }

    public int A() {
        return ColorUtils.compositeColors(this.m.g(), ColorUtils.compositeColors(this.f10949l.g(), this.k.g()));
    }

    public void B(boolean z, boolean z2, boolean z3) {
        d(16843623, z, z2, z3);
    }

    public void C(boolean z) {
        this.q = z;
    }

    public void D(Path path) {
        this.v = path;
    }

    public void E(RectF rectF, float f, float f2) {
        this.w = rectF;
        this.s = f;
        this.t = f2;
    }

    public void F(int i) {
        this.r = i;
    }

    public void G(float f) {
        if (f < 0.0f || f > 1.0f) {
            bj2.c("COUIMaskEffectDrawable", "Touch enter min progress should be within range [0, 1]");
        } else {
            this.u = f;
        }
    }

    public void H(xmi xmiVar) {
        this.x = xmiVar;
    }

    public void I(boolean z, boolean z2, boolean z3) {
        d(1, z, z2, z3);
    }

    @Override // com.oplus.aiunit.vision.wmi, com.oplus.aiunit.vision.c56
    public void d(int i, boolean z, boolean z2, boolean z3) {
        super.d(i, z, z2, z3);
        if (i == 1) {
            this.m.d(z2 ? 10000.0f : 0.0f, z3);
        }
        if (i == 16843623) {
            this.k.d(z2 ? 10000.0f : 0.0f, z3);
        }
        if (i == 16842908) {
            this.f10949l.d(z2 ? 10000.0f : 0.0f, z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (l()) {
            int i = this.r;
            if (i == 0) {
                x(canvas);
            } else {
                if (i != 1) {
                    return;
                }
                v(canvas);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c56
    public void e(int i) {
        if (i == 16842910 && !m()) {
            this.m.d(0.0f, false);
            this.k.d(0.0f, false);
            this.f10949l.d(0.0f, false);
            return;
        }
        if (m()) {
            if (i == 1 && !q(1)) {
                int iK = k();
                if (iK != 0) {
                    if (iK != 1) {
                        return;
                    }
                    this.m.d(r() ? 10000.0f : 0.0f, false);
                    return;
                } else if (r()) {
                    this.m.d(10000.0f, true);
                    return;
                } else {
                    this.m.e(0.0f, this.u * 10000.0f);
                    return;
                }
            }
            if (i == 16843623 && !q(16843623)) {
                this.k.d(o() ? 10000.0f : 0.0f, this.f10950n);
                return;
            }
            if (this.p && i == 16842908 && !q(16842908)) {
                if (this.r == 1) {
                    this.f10949l.d(n() ? 10000.0f : 0.0f, this.f10950n);
                }
            } else if (this.o && i == 16842913 && !q(16842913) && this.r == 1) {
                this.f10949l.d(p() ? 10000.0f : 0.0f, this.f10950n);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void g(boolean z) {
        this.f10950n = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void h(Context context) {
        this.k.i(lh2.a(context, R$attr.couiColorHover));
        this.f10949l.i(lh2.a(context, R$attr.couiColorFocus));
        this.m.i(lh2.a(context, R$attr.couiColorPress));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        xmi xmiVar = this.x;
        if (xmiVar != null) {
            xmiVar.a();
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void reset() {
        this.k.d(0.0f, false);
        this.f10949l.d(0.0f, false);
        this.m.d(0.0f, false);
    }

    @Override // com.oplus.aiunit.vision.wmi
    public void s(boolean z) {
        super.s(z);
        if (z) {
            return;
        }
        this.m.d(0.0f, false);
        this.k.d(0.0f, false);
        this.f10949l.d(0.0f, false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void v(Canvas canvas) {
        if (this.k.g() != 0) {
            this.f10948j.setColor(this.k.g());
            w(canvas);
        }
        if (this.f10949l.g() != 0) {
            this.f10948j.setColor(this.f10949l.g());
            w(canvas);
        }
        if (this.m.g() != 0) {
            this.f10948j.setColor(this.m.g());
            w(canvas);
        }
    }

    public final void w(Canvas canvas) {
        Path path = this.v;
        if (path != null) {
            canvas.drawPath(path, this.f10948j);
            return;
        }
        RectF rectF = this.w;
        if (rectF != null) {
            canvas.drawRoundRect(rectF, this.s, this.t, this.f10948j);
            return;
        }
        Rect bounds = getBounds();
        float fMax = this.q ? Math.max(0, Math.min(bounds.width(), bounds.height())) / 2.0f : 0.0f;
        canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, fMax, fMax, this.f10948j);
    }

    public final void x(Canvas canvas) {
        if (this.k.g() != 0) {
            this.f10948j.setColor(this.k.g());
            w(canvas);
        }
        if (this.m.g() != 0) {
            this.f10948j.setColor(this.m.g());
            w(canvas);
        }
    }

    public void y(boolean z) {
        this.p = z;
    }

    public void z(boolean z) {
        this.o = z;
    }
}
