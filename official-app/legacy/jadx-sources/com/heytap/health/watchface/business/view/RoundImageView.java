package com.heytap.health.watchface.business.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import com.heytap.health.watchface.R$styleable;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"AppCompatCustomView"})
public class RoundImageView extends ImageView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7110j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f7111l;
    public Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Matrix f7112n;
    public RectF o;
    public RectF p;
    public Path q;
    public BitmapShader r;

    public RoundImageView(Context context) {
        this(context, null);
    }

    public final int a(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final void b(Canvas canvas) {
        if (this.f7110j != 0.0f) {
            this.q.reset();
            Path path = this.q;
            RectF rectF = this.o;
            float f = this.k;
            path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
            this.m.setColor(this.i);
            this.m.setStrokeWidth(this.f7110j);
            canvas.drawPath(this.q, this.m);
        }
    }

    public final void c(Canvas canvas) {
        this.q.reset();
        float f = this.k - (this.f7110j / 2.0f);
        this.q.addRoundRect(this.p, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
        canvas.drawPath(this.q, this.f7111l);
    }

    public final Bitmap d(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            ltl.a("RoundImageView", e2.getMessage());
            return null;
        }
    }

    public final void e() {
        this.q = new Path();
        this.f7112n = new Matrix();
        Paint paint = new Paint();
        this.f7111l = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setAntiAlias(true);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void f() {
        Bitmap bitmapD;
        Drawable drawable = getDrawable();
        if (drawable == null || (bitmapD = d(drawable)) == null) {
            return;
        }
        int width = getWidth() - ((int) (this.f7110j * 2.0f));
        int height = getHeight() - ((int) (this.f7110j * 2.0f));
        if (bitmapD.getWidth() != width || bitmapD.getHeight() != height) {
            float fMax = Math.max((width * 1.0f) / bitmapD.getWidth(), (height * 1.0f) / bitmapD.getHeight());
            this.f7112n.setTranslate(-(((bitmapD.getWidth() * fMax) - getWidth()) / 2.0f), -(((fMax * bitmapD.getHeight()) - getHeight()) / 2.0f));
        }
        Bitmap bitmapG = g(bitmapD, width, height);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        this.r = bitmapShader;
        bitmapShader.setLocalMatrix(this.f7112n);
        this.f7111l.setShader(this.r);
    }

    public final Bitmap g(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        f();
        c(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.f7110j;
        float f2 = i;
        float f3 = i2;
        this.o = new RectF(f / 2.0f, f / 2.0f, f2 - (f / 2.0f), f3 - (f / 2.0f));
        float f4 = this.f7110j;
        this.p = new RectF(f4, f4, f2 - f4, f3 - f4);
    }

    public void setBorderColor(int i) {
        if (this.i != i) {
            this.i = i;
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        float fA = a(f);
        if (this.f7110j != fA) {
            this.f7110j = fA;
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        if (this.k != f) {
            this.k = f;
            invalidate();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundImageView, i, 0);
        this.i = typedArrayObtainStyledAttributes.getColor(R$styleable.RoundImageView_border_color, -1);
        this.f7110j = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_border_width, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_corner_radius, a(10.0f));
        typedArrayObtainStyledAttributes.recycle();
        e();
    }
}
