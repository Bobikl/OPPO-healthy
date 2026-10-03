package com.coui.appcompat.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.oplus.aiunit.vision.sk2;
import com.support.appcompat.R$color;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$drawable;
import com.support.appcompat.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIRoundImageView extends AppCompatImageView {
    public static final int ICON_LARGE = 3;
    public static final int ICON_LARGE_RADIUS = 16;
    public static final int ICON_MEDIUM = 2;
    public static final int ICON_SMALL = 1;
    public static final int ICON_SMALL_RADIUS = 14;
    public int A;
    public Paint B;
    public Paint C;
    public int D;
    public int E;
    public Matrix F;
    public BitmapShader G;
    public int H;
    public float I;
    public Drawable J;
    public Bitmap K;
    public float L;
    public int M;
    public Paint N;
    public int O;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f1782j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f1783l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1784n;
    public int o;
    public RectF p;
    public RectF q;
    public Drawable r;
    public Bitmap s;
    public int t;
    public int u;
    public int v;
    public int w;
    public BitmapShader x;
    public int y;
    public int z;

    public COUIRoundImageView(Context context) {
        super(context);
        this.i = new RectF();
        this.f1782j = new RectF();
        this.E = 2;
        this.F = new Matrix();
        this.f1783l = context;
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        initBorderPaint();
        Paint paint2 = new Paint();
        this.C = paint2;
        paint2.setAntiAlias(true);
        this.C.setColor(getResources().getColor(R$color.coui_roundimageview_outcircle_color));
        this.C.setStrokeWidth(1.0f);
        this.C.setStyle(Paint.Style.STROKE);
        this.k = 0;
        this.H = getResources().getDimensionPixelSize(R$dimen.coui_roundimageview_default_radius);
        setupShader(getDrawable());
    }

    private void setupShader(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        this.J = drawable2;
        if (drawable2 == null || drawable == null) {
            return;
        }
        if (drawable2 != drawable) {
            this.J = drawable;
        }
        this.y = this.J.getIntrinsicWidth();
        this.z = this.J.getIntrinsicHeight();
        this.K = drawableToBitmap(this.J);
        if (this.k == 2) {
            this.s = createBitmapWithShadow();
            Bitmap bitmap = this.s;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.x = new BitmapShader(bitmap, tileMode, tileMode);
        }
        Bitmap bitmap2 = this.K;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        Bitmap bitmap3 = this.K;
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        this.G = new BitmapShader(bitmap3, tileMode2, tileMode2);
    }

    public Bitmap createBitmapWithShadow() {
        updateShaderMatrix();
        Bitmap bitmap = this.K;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.x = bitmapShader;
        bitmapShader.setLocalMatrix(this.F);
        this.B.setShader(this.x);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.t, this.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.o = this.v / 2;
        canvas.drawPath(sk2.a().d(this.i, this.o), this.B);
        this.r.setBounds(0, 0, this.t, this.u);
        this.r.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.J != null) {
            this.J.setState(getDrawableState());
            setupShader(this.J);
            invalidate();
        }
    }

    public final Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int iMax = Math.max(1, drawable.getIntrinsicHeight());
        int iMax2 = Math.max(1, drawable.getIntrinsicWidth());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax2, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, iMax2, iMax);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void initBorderPaint() {
        Paint paint = new Paint();
        this.N = paint;
        paint.setStrokeWidth(this.E);
        this.N.setStyle(Paint.Style.STROKE);
        this.N.setAntiAlias(true);
        this.N.setColor(getResources().getColor(R$color.coui_border));
    }

    public void initShadow() {
        this.f1782j.set(0.0f, 0.0f, this.t, this.u);
        this.A = this.t - this.v;
        this.i.set(this.f1782j);
        RectF rectF = this.i;
        int i = this.A;
        rectF.inset(i / 2, i / 2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.L = 1.0f;
        Bitmap bitmap = this.K;
        if (bitmap != null && !bitmap.isRecycled()) {
            int i = this.k;
            if (i == 0) {
                int iMin = Math.min(this.K.getWidth(), this.K.getHeight());
                this.M = iMin;
                this.L = (this.H * 1.0f) / iMin;
            } else if (i == 1) {
                this.L = Math.max((getWidth() * 1.0f) / this.K.getWidth(), (getHeight() * 1.0f) / this.K.getHeight());
            } else if (i == 2) {
                this.L = Math.max((getWidth() * 1.0f) / this.t, (getHeight() * 1.0f) / this.u);
                this.F.reset();
                Matrix matrix = this.F;
                float f = this.L;
                matrix.setScale(f, f);
                this.x.setLocalMatrix(this.F);
                this.B.setShader(this.x);
                canvas.drawRect(this.p, this.B);
                return;
            }
            float width = ((float) getWidth()) < ((float) this.K.getWidth()) * this.L ? (getWidth() - (this.K.getWidth() * this.L)) / 2.0f : 0.0f;
            float height = ((float) getHeight()) < ((float) this.K.getHeight()) * this.L ? (getHeight() - (this.K.getHeight() * this.L)) / 2.0f : 0.0f;
            Matrix matrix2 = this.F;
            float f2 = this.L;
            matrix2.setScale(f2, f2);
            this.F.postTranslate(width, height);
            BitmapShader bitmapShader = this.G;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.F);
                this.B.setShader(this.G);
            }
        }
        int i2 = this.k;
        if (i2 == 0) {
            if (!this.m) {
                float f3 = this.I;
                canvas.drawCircle(f3, f3, f3, this.B);
                return;
            } else {
                float f4 = this.I;
                canvas.drawCircle(f4, f4, f4, this.B);
                float f5 = this.I;
                canvas.drawCircle(f5, f5, f5 - 0.5f, this.C);
                return;
            }
        }
        if (i2 == 1) {
            if (this.p == null) {
                this.p = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            }
            if (this.q == null) {
                int i3 = this.E;
                this.q = new RectF(i3 / 2.0f, i3 / 2.0f, getWidth() - (this.E / 2.0f), getHeight() - (this.E / 2.0f));
            }
            if (!this.m) {
                canvas.drawPath(sk2.a().d(this.p, this.o), this.B);
            } else {
                canvas.drawPath(sk2.a().d(this.p, this.o), this.B);
                canvas.drawPath(sk2.a().d(this.q, this.o - (this.E / 2.0f)), this.C);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k == 0) {
            int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
            if (iMin == 0) {
                iMin = this.H;
            }
            this.H = iMin;
            this.I = iMin / 2.0f;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.k;
        if (i5 == 1 || i5 == 2) {
            this.p = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i6 = this.E;
            this.q = new RectF(i6 / 2.0f, i6 / 2.0f, getWidth() - (this.E / 2.0f), getHeight() - (this.E / 2.0f));
        }
    }

    public void setBorderRectRadius(int i) {
        this.o = i;
        invalidate();
    }

    public void setHasBorder(boolean z) {
        this.m = z;
    }

    public void setHasDefaultPic(boolean z) {
        this.f1784n = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setupShader(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setupShader(AppCompatResources.getDrawable(this.f1783l, i));
    }

    public void setOutCircleColor(int i) {
        this.D = i;
        this.C.setColor(i);
        invalidate();
    }

    public void setType(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
                if (iMin == 0) {
                    iMin = this.H;
                }
                this.H = iMin;
                this.I = iMin / 2.0f;
            }
            invalidate();
        }
    }

    public final void updateShaderMatrix() {
        this.F.reset();
        float f = (this.v * 1.0f) / this.y;
        float f2 = (this.w * 1.0f) / this.z;
        if (f <= 1.0f) {
            f = 1.0f;
        }
        float fMax = Math.max(f, f2 > 1.0f ? f2 : 1.0f);
        float f3 = (this.v - (this.y * fMax)) * 0.5f;
        float f4 = (this.w - (this.z * fMax)) * 0.5f;
        this.F.setScale(fMax, fMax);
        Matrix matrix = this.F;
        int i = this.A;
        matrix.postTranslate(((int) (f3 + 0.5f)) + (i / 2.0f), ((int) (f4 + 0.5f)) + (i / 2.0f));
    }

    public COUIRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new RectF();
        this.f1782j = new RectF();
        this.E = 2;
        if (attributeSet != null) {
            this.O = attributeSet.getStyleAttribute();
        }
        this.F = new Matrix();
        this.f1783l = context;
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        this.B.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        initBorderPaint();
        Paint paint2 = new Paint();
        this.C = paint2;
        paint2.setAntiAlias(true);
        this.C.setStrokeWidth(this.E);
        this.C.setStyle(Paint.Style.STROKE);
        Drawable drawable = context.getResources().getDrawable(R$drawable.coui_round_image_view_shadow);
        this.r = drawable;
        this.t = drawable.getIntrinsicWidth();
        this.u = this.r.getIntrinsicHeight();
        int dimension = (int) context.getResources().getDimension(R$dimen.coui_roundimageView_src_width);
        this.v = dimension;
        this.w = dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIRoundImageView);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIRoundImageView_couiBorderRadius, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.k = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIRoundImageView_couiType, 0);
        this.m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIRoundImageView_couiHasBorder, false);
        this.f1784n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIRoundImageView_couiHasDefaultPic, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIRoundImageView_couiRoundImageViewOutCircleColor, getResources().getColor(R$color.coui_roundimageview_outcircle_color_dark));
        this.D = color;
        this.C.setColor(color);
        initShadow();
        setupShader(getDrawable());
        typedArrayObtainStyledAttributes.recycle();
    }

    public COUIRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new RectF();
        this.f1782j = new RectF();
        this.E = 2;
        initShadow();
    }
}
