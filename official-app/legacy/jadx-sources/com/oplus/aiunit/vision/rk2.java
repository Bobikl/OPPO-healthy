package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class rk2 extends Drawable {
    public Paint a;
    public Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16227c;
    public RectF d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f16228e;
    public Path f;
    public a g;

    @Nullable
    public PorterDuffColorFilter h;

    @Nullable
    public PorterDuffColorFilter i;

    public rk2() {
        this(new a());
    }

    public static int i(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public final void b() {
        this.f16228e = xl2.a(this.f16228e, e(), this.g.i);
    }

    public final void c() {
        this.f = xl2.a(this.f, e(), this.g.i);
    }

    @NonNull
    public final PorterDuffColorFilter d(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.a.setColorFilter(this.h);
        int alpha = this.a.getAlpha();
        this.a.setAlpha(i(alpha, this.g.h));
        this.b.setStrokeWidth(this.g.g);
        this.b.setColorFilter(this.i);
        int alpha2 = this.b.getAlpha();
        this.b.setAlpha(i(alpha2, this.g.h));
        if (this.f16227c) {
            c();
            b();
            this.f16227c = false;
        }
        if (f()) {
            canvas.drawPath(this.f16228e, this.a);
        }
        if (g()) {
            canvas.drawPath(this.f, this.b);
        }
        this.a.setAlpha(alpha);
        this.b.setAlpha(alpha2);
    }

    @NonNull
    public RectF e() {
        this.d.set(getBounds());
        return this.d;
    }

    public final boolean f() {
        Paint paint = this.a;
        return ((paint == null || paint.getColor() == 0) && this.h == null) ? false : true;
    }

    public final boolean g() {
        Paint paint = this.b;
        return ((paint == null || paint.getStrokeWidth() <= 0.0f || this.b.getColor() == 0) && this.i == null) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h() {
        this.f16227c = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f16227c = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.g.f16230e) != null && colorStateList.isStateful()) || (((colorStateList2 = this.g.d) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.g.f16229c) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.g.b) != null && colorStateList4.isStateful())));
    }

    public void j(float f) {
        this.g.i = f;
    }

    public final boolean k(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.g.b == null || color2 == (colorForState2 = this.g.b.getColorForState(iArr, (color2 = this.a.getColor())))) {
            z = false;
        } else {
            this.a.setColor(colorForState2);
            z = true;
        }
        if (this.g.f16229c == null || color == (colorForState = this.g.f16229c.getColorForState(iArr, (color = this.b.getColor())))) {
            return z;
        }
        this.b.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.g = new a(this.g);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f16227c = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zK = k(iArr);
        if (zK) {
            invalidateSelf();
        }
        return zK;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        a aVar = this.g;
        if (aVar.h != i) {
            aVar.h = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        a aVar = this.g;
        if (aVar.a != colorFilter) {
            aVar.a = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        a aVar = this.g;
        aVar.f16230e = colorStateList;
        PorterDuffColorFilter porterDuffColorFilterD = d(colorStateList, aVar.f);
        this.i = porterDuffColorFilterD;
        this.h = porterDuffColorFilterD;
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        a aVar = this.g;
        aVar.f = mode;
        PorterDuffColorFilter porterDuffColorFilterD = d(aVar.f16230e, mode);
        this.i = porterDuffColorFilterD;
        this.h = porterDuffColorFilterD;
        h();
    }

    public rk2(@NonNull a aVar) {
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new RectF();
        this.f16228e = new Path();
        this.f = new Path();
        this.g = aVar;
        this.a.setStyle(Paint.Style.FILL);
        this.b.setStyle(Paint.Style.STROKE);
    }

    public static final class a extends Drawable.ConstantState {

        @Nullable
        public ColorFilter a;

        @Nullable
        public ColorStateList b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorStateList f16229c;

        @Nullable
        public ColorStateList d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f16230e;

        @Nullable
        public PorterDuff.Mode f;
        public float g;
        public int h;
        public float i;

        public a() {
            this.a = null;
            this.b = null;
            this.f16229c = null;
            this.d = null;
            this.f16230e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.h = 255;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            rk2 rk2Var = new rk2(this);
            rk2Var.f16227c = true;
            return rk2Var;
        }

        public a(a aVar) {
            this.a = null;
            this.b = null;
            this.f16229c = null;
            this.d = null;
            this.f16230e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.h = 255;
            this.a = aVar.a;
            this.b = aVar.b;
            this.f16229c = aVar.f16229c;
            this.d = aVar.d;
            this.f16230e = aVar.f16230e;
            this.g = aVar.g;
            this.i = aVar.i;
        }
    }
}
