package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public class oyf extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";
    public final RectF a = new RectF();
    public final RectF b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f15106c;
    public final Bitmap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f15107e;
    public final int f;
    public final int g;
    public final RectF h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f15108j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Shader.TileMode f15109l;
    public Shader.TileMode m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15110n;
    public float o;
    public final boolean[] p;
    public boolean q;
    public boolean r;
    public float s;
    public ColorStateList t;
    public ImageView.ScaleType u;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public oyf(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f15106c = rectF;
        this.h = new RectF();
        this.f15108j = new Matrix();
        this.k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f15109l = tileMode;
        this.m = tileMode;
        this.f15110n = true;
        this.o = 0.0f;
        this.p = new boolean[]{true, true, true, true};
        this.q = true;
        this.r = false;
        this.s = 0.0f;
        this.t = ColorStateList.valueOf(-16777216);
        this.u = ImageView.ScaleType.FIT_CENTER;
        this.d = bitmap;
        int width = bitmap.getWidth();
        this.f = width;
        int height = bitmap.getHeight();
        this.g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f15107e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.t.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.s);
    }

    public static boolean a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            a7b.b(TAG, "createBitmap error");
            return null;
        }
    }

    public static oyf d(Bitmap bitmap) {
        if (bitmap != null) {
            return new oyf(bitmap);
        }
        return null;
    }

    public static Drawable e(Drawable drawable) {
        if (drawable == null || (drawable instanceof oyf)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapC = c(drawable);
            return bitmapC != null ? new oyf(bitmapC) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), e(layerDrawable.getDrawable(i)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f15110n) {
            BitmapShader bitmapShader = new BitmapShader(this.d, this.f15109l, this.m);
            Shader.TileMode tileMode = this.f15109l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f15108j);
            }
            this.f15107e.setShader(bitmapShader);
            this.f15110n = false;
        }
        if (this.r) {
            if (this.s <= 0.0f) {
                canvas.drawOval(this.b, this.f15107e);
                return;
            } else {
                canvas.drawOval(this.b, this.f15107e);
                canvas.drawOval(this.h, this.i);
                return;
            }
        }
        if (!b(this.p)) {
            canvas.drawRect(this.b, this.f15107e);
            if (this.s > 0.0f) {
                canvas.drawRect(this.h, this.i);
                return;
            }
            return;
        }
        float f = this.o;
        if (this.s <= 0.0f) {
            canvas.drawRoundRect(this.b, f, f, this.f15107e);
            g(canvas);
        } else {
            canvas.drawRoundRect(this.b, f, f, this.f15107e);
            canvas.drawRoundRect(this.h, f, f, this.i);
            g(canvas);
            h(canvas);
        }
    }

    public final RectF f(boolean z, RectF rectF) {
        if (z) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        rectF2.set(this.h);
        float f = this.s;
        rectF2.inset(f, f);
        return rectF2;
    }

    public final void g(Canvas canvas) {
        if (a(this.p) || this.o == 0.0f) {
            return;
        }
        RectF rectF = this.b;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.b.height() + f2;
        float f3 = this.o;
        if (!this.p[0]) {
            this.k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.k, this.f15107e);
        }
        if (!this.p[1]) {
            this.k.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.k, this.f15107e);
        }
        if (!this.p[2]) {
            this.k.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.k, this.f15107e);
        }
        if (this.p[3]) {
            return;
        }
        this.k.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.k, this.f15107e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15107e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f15107e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        float f;
        if (a(this.p) || this.o == 0.0f) {
            return;
        }
        RectF rectF = this.b;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float fWidth = rectF.width() + f2;
        float fHeight = f3 + this.b.height();
        float f4 = this.o;
        float f5 = this.s / 2.0f;
        if (!this.p[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.i);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.i);
        }
        if (!this.p[1]) {
            canvas.drawLine((fWidth - f4) - f5, f3, fWidth, f3, this.i);
            canvas.drawLine(fWidth, f3 - f5, fWidth, f3 + f4, this.i);
        }
        if (this.p[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((fWidth - f4) - f5, fHeight, fWidth + f5, fHeight, this.i);
            canvas.drawLine(fWidth, fHeight - f, fWidth, fHeight, this.i);
        }
        if (this.p[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, fHeight, f2 + f, fHeight, this.i);
        canvas.drawLine(f2, fHeight - f, f2, fHeight, this.i);
    }

    public oyf i(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.t = colorStateList;
        this.i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.t.isStateful();
    }

    public oyf j(float f) {
        this.s = f;
        this.i.setStrokeWidth(f);
        return this;
    }

    public oyf k(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
            }
            this.o = fFloatValue;
        }
        boolean[] zArr = this.p;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public oyf l(boolean z) {
        this.q = z;
        return this;
    }

    public oyf m(boolean z) {
        this.r = z;
        return this;
    }

    public oyf n(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.u != scaleType) {
            this.u = scaleType;
            q();
        }
        return this;
    }

    public oyf o(Shader.TileMode tileMode) {
        if (this.f15109l != tileMode) {
            this.f15109l = tileMode;
            this.f15110n = true;
            invalidateSelf();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
        q();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.t.getColorForState(iArr, 0);
        if (this.i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.i.setColor(colorForState);
        return true;
    }

    public oyf p(Shader.TileMode tileMode) {
        if (this.m != tileMode) {
            this.m = tileMode;
            this.f15110n = true;
            invalidateSelf();
        }
        return this;
    }

    public final void q() {
        float fWidth;
        float fHeight;
        int i = a.a[this.u.ordinal()];
        if (i == 1) {
            this.h.set(this.a);
            RectF rectF = this.h;
            float f = this.s;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f15108j.reset();
            this.f15108j.setTranslate((int) (((this.h.width() - this.f) * 0.5f) + 0.5f), (int) (((this.h.height() - this.g) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.h.set(this.a);
            RectF rectF2 = this.h;
            float f2 = this.s;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f15108j.reset();
            float fWidth2 = 0.0f;
            if (this.f * this.h.height() > this.h.width() * this.g) {
                fWidth = this.h.height() / this.g;
                fHeight = 0.0f;
                fWidth2 = (this.h.width() - (this.f * fWidth)) * 0.5f;
            } else {
                fWidth = this.h.width() / this.f;
                fHeight = (this.h.height() - (this.g * fWidth)) * 0.5f;
            }
            this.f15108j.setScale(fWidth, fWidth);
            Matrix matrix = this.f15108j;
            float f3 = this.s;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.f15108j.reset();
            float fMin = (((float) this.f) > this.a.width() || ((float) this.g) > this.a.height()) ? Math.min(this.a.width() / this.f, this.a.height() / this.g) : 1.0f;
            float fWidth3 = (int) (((this.a.width() - (this.f * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.a.height() - (this.g * fMin)) * 0.5f) + 0.5f);
            this.f15108j.setScale(fMin, fMin);
            this.f15108j.postTranslate(fWidth3, fHeight2);
            this.h.set(this.f15106c);
            this.f15108j.mapRect(this.h);
            RectF rectF3 = this.h;
            float f4 = this.s;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.f15108j.setRectToRect(this.f15106c, f(this.q, this.h), Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.h.set(this.f15106c);
            this.f15108j.setRectToRect(this.f15106c, this.a, Matrix.ScaleToFit.END);
            this.f15108j.mapRect(this.h);
            RectF rectF4 = this.h;
            float f5 = this.s;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.f15108j.setRectToRect(this.f15106c, f(this.q, this.h), Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.h.set(this.f15106c);
            this.f15108j.setRectToRect(this.f15106c, this.a, Matrix.ScaleToFit.START);
            this.f15108j.mapRect(this.h);
            RectF rectF5 = this.h;
            float f6 = this.s;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.f15108j.setRectToRect(this.f15106c, f(this.q, this.h), Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.h.set(this.f15106c);
            this.f15108j.setRectToRect(this.f15106c, this.a, Matrix.ScaleToFit.CENTER);
            this.f15108j.mapRect(this.h);
            RectF rectF6 = this.h;
            float f7 = this.s;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.f15108j.setRectToRect(this.f15106c, f(this.q, this.h), Matrix.ScaleToFit.FILL);
        } else {
            this.h.set(this.a);
            RectF rectF7 = this.h;
            float f8 = this.s;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.f15108j.reset();
            this.f15108j.setRectToRect(this.f15106c, f(this.q, this.h), Matrix.ScaleToFit.FILL);
        }
        this.b.set(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f15107e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15107e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f15107e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f15107e.setFilterBitmap(z);
        invalidateSelf();
    }
}
