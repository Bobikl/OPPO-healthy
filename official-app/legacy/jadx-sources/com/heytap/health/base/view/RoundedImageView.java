package com.heytap.health.base.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.oyf;

/* JADX INFO: loaded from: classes15.dex */
public class RoundedImageView extends AppCompatImageView {
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final String TAG = "RoundedImageView";
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f3298j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3299l;
    public ColorFilter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3300n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public ImageView.ScaleType v;
    public Shader.TileMode w;
    public Shader.TileMode x;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;
    public static final ImageView.ScaleType[] y = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

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
                a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.i = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.k = ColorStateList.valueOf(-16777216);
        this.f3299l = 0.0f;
        this.m = null;
        this.f3300n = false;
        this.p = false;
        this.q = false;
        this.r = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.w = tileMode;
        this.x = tileMode;
    }

    public static Shader.TileMode b(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    public final void a() {
        Drawable drawable = this.o;
        if (drawable == null || !this.f3300n) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        if (this.p) {
            drawableMutate.setColorFilter(this.m);
        }
    }

    public final Drawable c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.u;
        if (i != 0) {
            try {
                drawable = ResourcesCompat.getDrawable(resources, i, null);
            } catch (Exception e2) {
                a7b.m(TAG, "Unable to find resource: " + this.u + e2);
                this.u = 0;
            }
        }
        return oyf.e(drawable);
    }

    public final Drawable d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.t;
        if (i != 0) {
            try {
                drawable = ResourcesCompat.getDrawable(resources, i, null);
            } catch (Exception e2) {
                a7b.m(TAG, "Unable to find resource: " + this.t + e2);
                this.t = 0;
            }
        }
        return oyf.e(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void e(float f, float f2, float f3, float f4) {
        float[] fArr = this.i;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        h();
        g(false);
        invalidate();
    }

    public final void f(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof oyf) {
            oyf oyfVar = (oyf) drawable;
            oyfVar.n(scaleType).j(this.f3299l).i(this.k).m(this.q).l(this.s).o(this.w).p(this.x);
            float[] fArr = this.i;
            if (fArr != null) {
                oyfVar.k(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                f(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    public final void g(boolean z) {
        if (this.r) {
            if (z) {
                this.f3298j = oyf.e(this.f3298j);
            }
            f(this.f3298j, ImageView.ScaleType.FIT_XY);
        }
    }

    @ColorInt
    public int getBorderColor() {
        return this.k.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.k;
    }

    public float getBorderWidth() {
        return this.f3299l;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.i) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.v;
    }

    public Shader.TileMode getTileModeX() {
        return this.w;
    }

    public Shader.TileMode getTileModeY() {
        return this.x;
    }

    public final void h() {
        f(this.o, this.v);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f3298j = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f3298j = drawable;
        g(true);
        super.setBackgroundDrawable(this.f3298j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.u != i) {
            this.u = i;
            Drawable drawableC = c();
            this.f3298j = drawableC;
            setBackgroundDrawable(drawableC);
        }
    }

    public void setBorderColor(@ColorInt int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderWidth(@DimenRes int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.m != colorFilter) {
            this.m = colorFilter;
            this.p = true;
            this.f3300n = true;
            a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        e(f, f, f, f);
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        e(dimension, dimension, dimension, dimension);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.t = 0;
        this.o = oyf.d(bitmap);
        h();
        super.setImageDrawable(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.t = 0;
        this.o = oyf.e(drawable);
        h();
        super.setImageDrawable(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.t != i) {
            this.t = i;
            this.o = d();
            h();
            super.setImageDrawable(this.o);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.q = z;
        h();
        g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.v != scaleType) {
            this.v = scaleType;
            switch (a.a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            h();
            g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.w == tileMode) {
            return;
        }
        this.w = tileMode;
        h();
        g(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.x == tileMode) {
            return;
        }
        this.x = tileMode;
        h();
        g(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.k.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.k = colorStateList;
        h();
        g(false);
        if (this.f3299l > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f3299l == f) {
            return;
        }
        this.f3299l = f;
        h();
        g(false);
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.i = fArr;
        this.k = ColorStateList.valueOf(-16777216);
        this.f3299l = 0.0f;
        this.m = null;
        this.f3300n = false;
        this.p = false;
        this.q = false;
        this.r = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.w = tileMode;
        this.x = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_RoundedImageView, i, 0);
        if (getScaleType() == null) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_corner_radius, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_corner_radius_top_left, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_corner_radius_top_right, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_corner_radius_bottom_right, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            float[] fArr2 = this.i;
            if (fArr2[i2] < 0.0f) {
                fArr2[i2] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.i.length;
            for (int i3 = 0; i3 < length2; i3++) {
                this.i[i3] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_RoundedImageView_lib_base_riv_border_width, -1);
        this.f3299l = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f3299l = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.lib_base_RoundedImageView_lib_base_riv_border_color);
        this.k = colorStateList;
        if (colorStateList == null) {
            this.k = ColorStateList.valueOf(-16777216);
        }
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_RoundedImageView_lib_base_riv_inner_border, true);
        this.r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_RoundedImageView_lib_base_riv_mutate_background, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_RoundedImageView_lib_base_riv_oval, false);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_RoundedImageView_lib_base_riv_tile_mode, -2);
        if (i4 != -2) {
            setTileModeX(b(i4));
            setTileModeY(b(i4));
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_RoundedImageView_lib_base_riv_tile_mode_x, -2);
        if (i5 != -2) {
            setTileModeX(b(i5));
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_RoundedImageView_lib_base_riv_tile_mode_y, -2);
        if (i6 != -2) {
            setTileModeY(b(i6));
        }
        h();
        g(true);
        if (this.r) {
            super.setBackgroundDrawable(this.f3298j);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
