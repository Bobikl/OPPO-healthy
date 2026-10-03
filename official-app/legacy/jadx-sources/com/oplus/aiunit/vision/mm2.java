package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class mm2 extends wmi {
    public static final int TYPE_INNER = 1;
    public static final int TYPE_OUTER = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f14125j;
    public final Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rmi f14126l;
    public RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Path f14127n;
    public float o;
    public float p;
    public boolean q;
    public xmi r;
    public int s;

    public mm2(Context context) {
        super("COUIStrokeDrawable");
        Paint paint = new Paint(1);
        this.f14125j = paint;
        this.k = new Path();
        this.q = true;
        this.r = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelOffset(R$dimen.default_focus_stroke_radius) * 2);
        rmi rmiVar = new rmi(this, "focus", 0, lh2.a(context, R$attr.couiColorFocusOutline));
        this.f14126l = rmiVar;
        rmiVar.k(0.0f);
        rmiVar.l(0.3f);
        this.s = 0;
    }

    @Override // com.oplus.aiunit.vision.wmi, com.oplus.aiunit.vision.c56
    public void d(int i, boolean z, boolean z2, boolean z3) {
        super.d(i, z, z2, z3);
        if (i == 16842908) {
            this.f14126l.d(z2 ? 10000.0f : 0.0f, z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!l() || this.f14126l.g() == 0) {
            return;
        }
        this.f14125j.setColor(this.f14126l.g());
        canvas.save();
        Path path = this.f14127n;
        if (path != null) {
            if (this.s == 1) {
                canvas.clipPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            canvas.drawPath(this.f14127n, this.f14125j);
        } else if (this.m != null) {
            this.k.reset();
            this.k.addRoundRect(this.m, this.o, this.p, Path.Direction.CCW);
            if (this.s == 1) {
                canvas.clipPath(this.k);
            } else {
                canvas.clipPath(this.k, Region.Op.DIFFERENCE);
            }
            canvas.drawPath(this.k, this.f14125j);
        } else {
            Rect bounds = getBounds();
            float fMax = Math.max(0, Math.min(bounds.width(), bounds.height())) / 2.0f;
            this.k.reset();
            this.k.addRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, fMax, fMax, Path.Direction.CCW);
            if (this.s == 1) {
                canvas.clipPath(this.k);
            } else {
                canvas.clipPath(this.k, Region.Op.DIFFERENCE);
            }
            canvas.drawPath(this.k, this.f14125j);
        }
        canvas.restore();
    }

    @Override // com.oplus.aiunit.vision.c56
    public void e(int i) {
        if (i == 16842910 && !m()) {
            this.f14126l.d(0.0f, false);
        } else if (m() && i == 16842908) {
            this.f14126l.d(n() ? 10000.0f : 0.0f, this.q);
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void g(boolean z) {
        this.q = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void h(Context context) {
        this.f14126l.i(lh2.a(context, R$attr.couiColorFocusOutline));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        xmi xmiVar = this.r;
        if (xmiVar != null) {
            xmiVar.a();
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void reset() {
        this.f14126l.d(0.0f, false);
    }

    @Override // com.oplus.aiunit.vision.wmi
    public void s(boolean z) {
        super.s(z);
        if (z) {
            return;
        }
        this.f14126l.d(0.0f, false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void v(xmi xmiVar) {
        this.r = xmiVar;
    }

    public void w(Path path) {
        this.f14127n = path;
    }

    public void x(RectF rectF, float f, float f2) {
        this.m = rectF;
        this.o = f;
        this.p = f2;
    }

    public void y(int i) {
        this.s = i;
    }
}
