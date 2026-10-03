package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class ti0 extends Drawable {
    public final String a;
    public final ui0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4a f17025c;
    public final Drawable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f17026e;
    public Drawable.Callback f;
    public int g;
    public float h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17027j = false;

    public class a implements Drawable.Callback {
        public final Drawable.Callback i;

        public a(Drawable.Callback callback) {
            this.i = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.i.invalidateDrawable(ti0.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
            this.i.scheduleDrawable(ti0.this, runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.i.unscheduleDrawable(ti0.this, runnable);
        }
    }

    public ti0(@NonNull String str, @NonNull ui0 ui0Var, @NonNull u4a u4aVar, @Nullable s4a s4aVar) {
        this.a = str;
        this.b = ui0Var;
        this.f17025c = u4aVar;
        Drawable drawableD = ui0Var.d(this);
        this.d = drawableD;
        if (drawableD != null) {
            m(drawableD);
        }
    }

    @NonNull
    public static Rect j(@Nullable Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect rectA = h56.a(drawable);
            if (!rectA.isEmpty()) {
                return rectA;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @NonNull
    public String a() {
        return this.a;
    }

    @Nullable
    public s4a b() {
        return null;
    }

    public float c() {
        return this.h;
    }

    public int d() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (f()) {
            this.f17026e.draw(canvas);
        }
    }

    public Drawable e() {
        return this.f17026e;
    }

    public boolean f() {
        return this.f17026e != null;
    }

    public final void g() {
        if (this.g == 0) {
            this.i = true;
            setBounds(j(this.f17026e));
            return;
        }
        this.i = false;
        Rect rectK = k();
        this.f17026e.setBounds(rectK);
        this.f17026e.setCallback(this.f);
        setBounds(rectK);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (f()) {
            return this.f17026e.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (f()) {
            return this.f17026e.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (f()) {
            return this.f17026e.getOpacity();
        }
        return -2;
    }

    public void h(int i, float f) {
        this.g = i;
        this.h = f;
        if (this.i) {
            g();
        }
    }

    public boolean i() {
        return getCallback() != null;
    }

    @NonNull
    public final Rect k() {
        return this.f17025c.a(this);
    }

    public void l(@Nullable Drawable.Callback callback) {
        this.f = callback == null ? null : new a(callback);
        super.setCallback(callback);
        if (this.f == null) {
            Drawable drawable = this.f17026e;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f17026e;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.f17027j = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            this.b.a(this);
            return;
        }
        Drawable drawable2 = this.f17026e;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.f17026e.setCallback(this.f);
        }
        Drawable drawable3 = this.f17026e;
        boolean z = drawable3 == null || drawable3 == this.d;
        if (drawable3 != null) {
            drawable3.setCallback(this.f);
            Object obj2 = this.f17026e;
            if ((obj2 instanceof Animatable) && this.f17027j) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            this.b.b(this);
        }
    }

    public void m(@NonNull Drawable drawable) {
        Drawable drawable2 = this.f17026e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (!bounds.isEmpty()) {
            this.f17026e = drawable;
            drawable.setCallback(this.f);
            setBounds(bounds);
            this.i = false;
            return;
        }
        Rect rectA = h56.a(drawable);
        if (rectA.isEmpty()) {
            drawable.setBounds(0, 0, 1, 1);
        } else {
            drawable.setBounds(rectA);
        }
        setBounds(drawable.getBounds());
        n(drawable);
    }

    public void n(@NonNull Drawable drawable) {
        this.f17027j = false;
        Drawable drawable2 = this.f17026e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f17026e = drawable;
        g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    @NonNull
    public String toString() {
        return "AsyncDrawable{destination='" + this.a + "', imageSize=" + ((Object) null) + ", result=" + this.f17026e + ", canvasWidth=" + this.g + ", textSize=" + this.h + ", waitingForDimensions=" + this.i + '}';
    }
}
