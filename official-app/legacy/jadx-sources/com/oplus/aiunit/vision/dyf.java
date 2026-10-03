package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.oplus.graphics.OplusOutline;
import com.oplus.graphics.OplusOutlineAdapter;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(21)
public class dyf extends Drawable {
    public float a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10721c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f10722e;
    public final Rect f;
    public float g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f10723j;
    public PorterDuffColorFilter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f10724l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10725n;
    public boolean h = false;
    public boolean i = true;
    public PorterDuff.Mode m = PorterDuff.Mode.SRC_IN;
    public final Paint d = new Paint(5);

    public dyf(ColorStateList colorStateList, float f, float f2, float f3) {
        this.f10725n = false;
        this.b = f;
        this.f10721c = f2;
        this.a = f3;
        k(colorStateList);
        this.f10722e = new RectF();
        this.f = new Rect();
        this.f10725n = byf.f();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean b() {
        return i() || j();
    }

    public final boolean c() {
        return byf.a() == 1 && this.a != 0.0f;
    }

    public float d() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.d;
        if (this.k == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.k);
            z = true;
        }
        canvas.drawColor(paint.getColor());
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public ColorStateList e() {
        return this.f10723j;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (c()) {
            new OplusOutlineAdapter(outline, 1).setSmoothRoundRect(this.f, this.a);
            return;
        }
        if (b()) {
            new OplusOutline(outline).setSmoothRoundRect(this.f, this.b, this.f10721c);
            return;
        }
        Rect rect = this.f;
        float f = this.a;
        if (f == 0.0f) {
            f = this.b;
        }
        outline.setRoundRect(rect, f);
    }

    public float h() {
        return this.f10721c;
    }

    public final boolean i() {
        return (byf.a() != 0 || this.b == 0.0f || this.f10721c == 0.0f) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10724l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f10723j) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final boolean j() {
        return byf.a() == 1 && this.a == 0.0f && this.b != 0.0f && this.f10721c != 0.0f;
    }

    public final void k(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f10723j = colorStateList;
        this.d.setColor(colorStateList.getColorForState(getState(), this.f10723j.getDefaultColor()));
    }

    public void l(float f) {
        if (f == this.a) {
            return;
        }
        this.a = f;
        q(null);
        invalidateSelf();
    }

    public void m(@Nullable ColorStateList colorStateList) {
        k(colorStateList);
        invalidateSelf();
    }

    public void n(float f, boolean z, boolean z2) {
        if (f == this.g && this.h == z && this.i == z2) {
            return;
        }
        this.g = f;
        this.h = z;
        this.i = z2;
        q(null);
        invalidateSelf();
    }

    public void o(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        q(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f10723j;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.d.getColor();
        if (z) {
            this.d.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f10724l;
        if (colorStateList2 == null || (mode = this.m) == null) {
            return z;
        }
        this.k = a(colorStateList2, mode);
        return true;
    }

    public void p(float f) {
        if (f == this.f10721c) {
            return;
        }
        this.f10721c = f;
        q(null);
        invalidateSelf();
    }

    public final void q(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f10722e.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f.set(rect);
        if (this.h) {
            this.f.inset((int) Math.ceil(eyf.a(this.g, this.b, this.i)), (int) Math.ceil(eyf.b(this.g, this.b, this.i)));
            this.f10722e.set(this.f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10724l = colorStateList;
        this.k = a(colorStateList, this.m);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.k = a(this.f10724l, mode);
        invalidateSelf();
    }
}
