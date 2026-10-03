package com.heytap.health.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.health.ui.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class CircleImageView extends AppCompatImageView {
    public static final ImageView.ScaleType I = ImageView.ScaleType.CENTER_CROP;
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_NORMAL = -1;
    public static final int TYPE_RECTANGLE = 1;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public RectF H;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f6086j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f6087l;
    public final Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f6088n;
    public final Paint o;
    public final Paint p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public CircleImageView(Context context) {
        this(context, null);
    }

    public void a() {
        setImageDrawable(null);
        setImageBitmap(null);
        this.q = -1;
    }

    public final Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public void c(int i, int i2) {
        if (i == this.x && i2 == this.y) {
            return;
        }
        this.x = i;
        this.y = i2;
        d();
    }

    public final void d() {
        if (!this.F) {
            this.G = true;
            return;
        }
        Bitmap bitmapB = b(getDrawable());
        if (bitmapB == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
        this.m.setAntiAlias(true);
        this.m.setShader(bitmapShader);
        this.m.setPathEffect(new CornerPathEffect(this.r));
        int i = this.v / 2;
        this.f6088n.setColor(this.s);
        this.f6088n.setAntiAlias(true);
        this.f6088n.setStrokeWidth(this.v);
        this.f6088n.setStyle(Paint.Style.STROKE);
        this.f6088n.setPathEffect(new CornerPathEffect(this.r + this.w + i));
        if (this.x != 0 && this.y != 0 && this.H != null) {
            this.f6088n.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.H.bottom, this.x, this.y, Shader.TileMode.CLAMP));
        }
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        this.o.setAntiAlias(true);
        this.o.setColor(this.t);
        this.o.setStrokeWidth(this.w + (this.v / 2));
        this.o.setPathEffect(new CornerPathEffect(this.r + (this.w / 2)));
        this.p.setStyle(Paint.Style.FILL);
        this.p.setAntiAlias(true);
        this.p.setColor(this.u);
        this.p.setPathEffect(new CornerPathEffect(this.r));
        this.A = bitmapB.getHeight();
        this.z = bitmapB.getWidth();
        this.f6086j.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.i;
        int i2 = this.v;
        int i3 = this.w;
        rectF.set(i2 + i3, i2 + i3, this.f6086j.width() - (this.v + this.w), this.f6086j.height() - (this.v + this.w));
        int i4 = this.q;
        if (i4 == 0) {
            this.D = (this.f6086j.width() - this.v) / 2.0f;
            this.C = this.i.width() / 2.0f;
            this.E = (((this.f6086j.width() - (this.v * 2)) - this.w) / 2.0f) - 0.5f;
        } else if (i4 == 1) {
            float f = i;
            this.f6086j.set(f, f, getWidth() - i, getHeight() - i);
            int i5 = this.v + (this.w / 2);
            float f2 = i5;
            this.k.set(f2, f2, getWidth() - i5, getHeight() - i5);
        }
        e(bitmapShader);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    public final void e(BitmapShader bitmapShader) {
        float f;
        float fMin;
        float f2;
        float f3;
        float fWidth;
        float fHeight;
        float fWidth2 = this.i.width();
        float fHeight2 = this.i.height();
        int i = this.q;
        float f4 = 1.0f;
        if (i != 0) {
            if (i == 1) {
                f2 = (fWidth2 * 1.0f) / this.z;
                f3 = (fHeight2 * 1.0f) / this.A;
                fMin = Math.min(f2, f3);
            } else {
                f = 1.0f;
                fMin = 1.0f;
            }
            fWidth = 0.0f;
            if (f4 > f) {
                fHeight = (this.i.height() - (this.A * fMin)) * 0.5f;
            } else {
                fWidth = (this.i.width() - (this.z * fMin)) * 0.5f;
                fHeight = 0.0f;
            }
            this.f6087l.set(null);
            this.f6087l.setScale(fMin, fMin);
            Matrix matrix = this.f6087l;
            int i2 = (int) fWidth;
            int i3 = this.v;
            int i4 = this.w;
            matrix.postTranslate(i2 + i3 + i4, ((int) fHeight) + i3 + i4);
            bitmapShader.setLocalMatrix(this.f6087l);
        }
        f2 = (fWidth2 * 1.0f) / this.z;
        f3 = (fHeight2 * 1.0f) / this.A;
        fMin = Math.min(f2, f3);
        float f5 = f3;
        f4 = f2;
        f = f5;
        fWidth = 0.0f;
        if (f4 > f) {
            fHeight = (this.i.height() - (this.A * fMin)) * 0.5f;
        } else {
            fWidth = (this.i.width() - (this.z * fMin)) * 0.5f;
            fHeight = 0.0f;
        }
        this.f6087l.set(null);
        this.f6087l.setScale(fMin, fMin);
        Matrix matrix2 = this.f6087l;
        int i5 = (int) fWidth;
        int i6 = this.v;
        int i7 = this.w;
        matrix2.postTranslate(i5 + i6 + i7, ((int) fHeight) + i6 + i7);
        bitmapShader.setLocalMatrix(this.f6087l);
    }

    public int getBorderColor() {
        return this.s;
    }

    public int getBorderWidth() {
        return this.v;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return I;
    }

    public int getType() {
        return this.q;
    }

    public final void init() {
        super.setScaleType(I);
        this.F = true;
        if (this.G) {
            d();
            this.G = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        int i = this.q;
        if (i == 1) {
            if (this.w != 0) {
                canvas.drawRect(this.k, this.o);
            }
            if (this.v != 0) {
                canvas.drawRect(this.f6086j, this.f6088n);
            }
            if (this.u != 0) {
                canvas.drawRect(this.i, this.p);
            }
            canvas.drawRect(this.i, this.m);
            return;
        }
        if (i == 0) {
            if (this.v != 0) {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.D, this.f6088n);
            }
            if (this.w != 0) {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.E, this.o);
            }
            if (this.u != 0) {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.C, this.p);
            }
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.C, this.m);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.q == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.B = iMin;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.H = new RectF(0.0f, 0.0f, i, i2);
        d();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == this.u) {
            return;
        }
        this.u = i;
        this.p.setColor(i);
        invalidate();
    }

    public void setBorderColor(int i) {
        if (i == this.s) {
            return;
        }
        this.s = i;
        this.f6088n.setColor(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.v) {
            return;
        }
        this.v = i;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d();
    }

    public void setInterBorderColor(int i) {
        if (i == this.t) {
            return;
        }
        this.t = i;
        this.o.setColor(i);
        invalidate();
    }

    public void setInterBorderWidth(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        d();
    }

    public void setRoundRadius(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != I) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public void setType(int i) {
        if (this.q == i) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new RectF();
        this.f6086j = new RectF();
        this.k = new RectF();
        this.f6087l = new Matrix();
        this.m = new Paint();
        this.f6088n = new Paint();
        this.o = new Paint();
        this.p = new Paint();
        this.r = 10;
        this.s = -16777216;
        this.t = -16777216;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleImageView, i, 0);
        this.q = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleImageView_civ_type, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleImageView_civ_round_radius, 10);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleImageView_civ_border_width, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleImageView_civ_inter_border_width, 0);
        this.s = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_border_color, -16777216);
        this.t = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_inter_border_color, -16777216);
        this.u = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_background_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }
}
