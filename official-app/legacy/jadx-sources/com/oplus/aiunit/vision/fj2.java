package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.NonNull;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class fj2 extends ixf {
    public static final int RIPPLE_MASK_TYPE_CIRCLE = 0;
    public static final int RIPPLE_MASK_TYPE_CUSTOM_PATH = 1;
    public static final int RIPPLE_TYPE_CHECKBOX_RADIUS = 1;
    public static final int RIPPLE_TYPE_ICON_RADIUS = 0;
    public static final int[] v = {16842910, 16842919};
    public static final int[] w = {16842910};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f11382j;
    public final rmi k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rmi f11383l;
    public final Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f11384n;
    public boolean o;
    public int p;
    public int q;
    public Path r;
    public RectF s;
    public float t;
    public float u;

    public fj2(Context context) {
        super("COUIMaskRippleDrawable");
        this.f11382j = new Path();
        this.m = new Paint(1);
        this.o = true;
        this.t = 0.0f;
        this.u = 0.0f;
        this.f11384n = getBounds();
        int iA = lh2.a(context, R$attr.couiColorPress);
        int i = Build.VERSION.SDK_INT;
        if (i == 34) {
            iA = lh2.a(context, R$attr.couiColorPressBackground);
        } else if (i < 34) {
            iA = lh2.a(context, R$attr.couiColorRipplePressBackground);
        }
        setColor(ColorStateList.valueOf(iA));
        u(0);
        rmi rmiVar = new rmi(this, "hover", 0, lh2.a(context, R$attr.couiColorHover));
        this.k = rmiVar;
        rmi rmiVar2 = new rmi(this, "focus", 0, lh2.a(context, R$attr.couiColorFocus));
        this.f11383l = rmiVar2;
        rmiVar.k(0.0f);
        rmiVar.l(0.3f);
        rmiVar2.k(0.0f);
        rmiVar2.l(0.3f);
    }

    public static int t(Context context, int i) {
        if (i == 0) {
            return context.getResources().getDimensionPixelOffset(R$dimen.icon_ripple_bg_radius);
        }
        if (i == 1) {
            return context.getResources().getDimensionPixelOffset(R$dimen.checkbox_ripple_bg_radius);
        }
        bj2.c("COUIMaskRippleDrawable", "wrong mask type!");
        return 0;
    }

    @Override // com.oplus.aiunit.vision.ixf, com.oplus.aiunit.vision.c56
    public void d(int i, boolean z, boolean z2, boolean z3) {
        super.d(i, z, z2, z3);
        if (i == 16842919) {
            bj2.g("COUIMaskRippleDrawable", "Lock state press in COUIMaskRippleDrawable is not allowed!");
        }
        if (i == 16843623) {
            this.k.d(z2 ? 10000.0f : 0.0f, z3);
        }
        if (i == 16842908) {
            this.f11383l.d(z2 ? 10000.0f : 0.0f, z3);
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (k()) {
            if (this.p == 1) {
                canvas.save();
                r(canvas);
            }
            if (this.k.g() != 0) {
                this.m.setColor(this.k.g());
                s(canvas);
            }
            if (this.f11383l.g() != 0) {
                this.m.setColor(this.f11383l.g());
                s(canvas);
            }
            super.draw(canvas);
            if (this.p == 1) {
                canvas.restore();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c56
    public void e(int i) {
        if (l()) {
            if (i == 16842908 && !p(16842908)) {
                this.f11383l.d(m() ? 10000.0f : 0.0f, this.o);
                return;
            }
            if (i == 16843623 && !p(16843623)) {
                this.k.d(n() ? 10000.0f : 0.0f, this.o);
                return;
            }
            if (i == 16842919) {
                if (o()) {
                    int[] iArr = v;
                    iArr[0] = l() ? 16842910 : -16842910;
                    super.onStateChange(iArr);
                } else {
                    int[] iArr2 = w;
                    iArr2[0] = l() ? 16842910 : -16842910;
                    super.onStateChange(iArr2);
                }
                invalidateSelf();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void g(boolean z) {
        this.o = z;
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void h(Context context) {
        this.k.i(lh2.a(context, R$attr.couiColorHover));
        this.f11383l.i(lh2.a(context, R$attr.couiColorFocus));
        int iA = lh2.a(context, R$attr.couiColorPress);
        int i = Build.VERSION.SDK_INT;
        if (i == 34) {
            iA = lh2.a(context, R$attr.couiColorPressBackground);
        } else if (i < 34) {
            iA = lh2.a(context, R$attr.couiColorRipplePressBackground);
        }
        setColor(ColorStateList.valueOf(iA));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        this.i.x(iArr);
        return false;
    }

    public final void r(Canvas canvas) {
        Path path = this.r;
        if (path != null) {
            canvas.clipPath(path);
            return;
        }
        if (this.s != null) {
            this.f11382j.reset();
            this.f11382j.addRoundRect(this.s, this.t, this.u, Path.Direction.CCW);
            canvas.clipPath(this.f11382j);
        } else {
            Rect bounds = getBounds();
            float fMax = Math.max(0, Math.min(bounds.width(), bounds.height())) / 2.0f;
            this.f11382j.reset();
            this.f11382j.addRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, fMax, fMax, Path.Direction.CCW);
            canvas.clipPath(this.f11382j);
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void reset() {
        this.k.d(0.0f, false);
        this.f11383l.d(0.0f, false);
    }

    public final void s(Canvas canvas) {
        int i = this.p;
        if (i == 0) {
            canvas.drawCircle(this.f11384n.centerX(), this.f11384n.centerY(), this.q, this.m);
            return;
        }
        if (i == 1) {
            Path path = this.r;
            if (path != null) {
                canvas.drawPath(path, this.m);
                return;
            }
            RectF rectF = this.s;
            if (rectF != null) {
                canvas.drawRoundRect(rectF, this.t, this.u, this.m);
                return;
            }
            Rect bounds = getBounds();
            float fMax = Math.max(0, Math.min(bounds.width(), bounds.height())) / 2.0f;
            canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, fMax, fMax, this.m);
        }
    }

    public void u(int i) {
        if (i < 0) {
            bj2.c("COUIMaskRippleDrawable", "radius should larger than 0!");
            return;
        }
        this.p = 0;
        x(i);
        this.q = i;
    }

    public void v() {
        this.p = 1;
        x(-1);
    }

    public void w(Path path) {
        this.r = path;
    }

    public final void x(int i) {
        setRadius(i);
    }
}
