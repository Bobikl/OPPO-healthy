package com.oplus.aiunit.vision;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.graphics.OplusPathAdapter;

/* JADX INFO: loaded from: classes13.dex */
public class ll2 extends Drawable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ArgbEvaluator f13758j = new ArgbEvaluator();
    public final Rect a = new Rect();
    public final Path b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f13759c;
    public final Paint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13760e;
    public int f;
    public float g;
    public OplusPathAdapter h;
    public RectF i;

    public ll2() {
        Path path = new Path();
        this.b = path;
        this.f13759c = new Paint(1);
        this.d = new Paint(1);
        this.g = 0.0f;
        if (c()) {
            this.h = new OplusPathAdapter(path, 1);
            this.i = new RectF();
        }
    }

    public int a() {
        return this.f13760e;
    }

    public Path b() {
        return this.b;
    }

    public final boolean c() {
        return byf.a() == 1;
    }

    public void d(Rect rect) {
        if (c()) {
            this.i.set(rect);
            this.b.reset();
            OplusPathAdapter oplusPathAdapter = this.h;
            RectF rectF = this.i;
            oplusPathAdapter.addSmoothRoundRect(rectF, rectF.height() / 2.0f, this.i.height() / 2.0f, Path.Direction.CCW);
        } else {
            xl2.b(this.b, new RectF(rect), (rect.bottom - rect.top) / 2.0f, true, true, true, true);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (c()) {
            canvas.save();
            canvas.clipPath(this.b);
            this.f13759c.setStyle(Paint.Style.FILL);
            this.f13759c.setColor(this.f13760e);
            canvas.drawColor(this.f13759c.getColor());
            canvas.restore();
        } else {
            this.f13759c.setStyle(Paint.Style.FILL);
            this.f13759c.setColor(this.f13760e);
            canvas.drawPath(this.b, this.f13759c);
        }
        this.d.setColor(((Integer) f13758j.evaluate(this.g, 0, Integer.valueOf(this.f))).intValue());
        canvas.drawRect(this.a, this.d);
    }

    public void e(int i) {
        this.f = i;
        invalidateSelf();
    }

    public void f(int i) {
        this.f13760e = i;
        invalidateSelf();
    }

    public void g(float f) {
        this.g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(Rect rect) {
        this.a.set(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        invalidateSelf();
    }
}
