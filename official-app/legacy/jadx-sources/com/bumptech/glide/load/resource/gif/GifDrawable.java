package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.i68;
import com.oplus.aiunit.vision.x9k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class GifDrawable extends Drawable implements com.bumptech.glide.load.resource.gif.a.b, Animatable, Animatable2Compat {
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1412j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1413l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1414n;
    public int o;
    public boolean p;
    public Paint q;
    public Rect r;
    public List<Animatable2Compat.AnimationCallback> s;

    public static final class a extends Drawable.ConstantState {

        @VisibleForTesting
        public final com.bumptech.glide.load.resource.gif.a a;

        public a(com.bumptech.glide.load.resource.gif.a aVar) {
            this.a = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, i68 i68Var, x9k<Bitmap> x9kVar, int i, int i2, Bitmap bitmap) {
        this(new a(new com.bumptech.glide.load.resource.gif.a(com.bumptech.glide.a.d(context), i68Var, i, i2, x9kVar, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.a.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f1414n++;
        }
        int i = this.o;
        if (i == -1 || this.f1414n < i) {
            return;
        }
        j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.i.a.b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.s;
        if (list != null) {
            list.clear();
        }
    }

    public final Rect d() {
        if (this.r == null) {
            this.r = new Rect();
        }
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f1413l) {
            return;
        }
        if (this.p) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.p = false;
        }
        canvas.drawBitmap(this.i.a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.i.a.e();
    }

    public int f() {
        return this.i.a.f();
    }

    public int g() {
        return this.i.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i.a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i.a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Paint h() {
        if (this.q == null) {
            this.q = new Paint(2);
        }
        return this.q;
    }

    public int i() {
        return this.i.a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1412j;
    }

    public final void j() {
        List<Animatable2Compat.AnimationCallback> list = this.s;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.s.get(i).onAnimationEnd(this);
            }
        }
    }

    public void k() {
        this.f1413l = true;
        this.i.a.a();
    }

    public final void l() {
        this.f1414n = 0;
    }

    public void m(x9k<Bitmap> x9kVar, Bitmap bitmap) {
        this.i.a.o(x9kVar, bitmap);
    }

    public final void n() {
        cpe.a(!this.f1413l, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.i.a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f1412j) {
                return;
            }
            this.f1412j = true;
            this.i.a.r(this);
            invalidateSelf();
        }
    }

    public final void o() {
        this.f1412j = false;
        this.i.a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.p = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        cpe.a(!this.f1413l, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.m = z;
        if (!z) {
            o();
        } else if (this.k) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.k = true;
        l();
        if (this.m) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.k = false;
        o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.s;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(a aVar) {
        this.m = true;
        this.o = -1;
        this.i = (a) cpe.d(aVar);
    }
}
