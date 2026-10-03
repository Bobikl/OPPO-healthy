package com.oplus.aiunit.vision;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 21)
public class lkc extends RippleDrawable {
    public Bitmap A;
    public Drawable B;
    public final Rect C;
    public float D;
    public jkc i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mkc f13742j;
    public mkc[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13743l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13744n;
    public boolean o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public boolean s;
    public Paint t;
    public ColorStateList u;
    public boolean v;
    public PorterDuffColorFilter w;
    public Matrix x;
    public BitmapShader y;
    public Canvas z;

    public lkc(@NotNull ColorStateList colorStateList, @Nullable Drawable drawable, @Nullable Drawable drawable2) {
        super(colorStateList, drawable, drawable2);
        this.f13743l = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.C = new Rect();
        this.D = 0.12f;
        this.u = colorStateList;
        this.B = findDrawableByLayerId(R.id.mask);
    }

    public final void a() {
        int i = this.f13743l;
        mkc[] mkcVarArr = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            mkcVarArr[i2].s();
        }
        if (mkcVarArr != null) {
            Arrays.fill(mkcVarArr, 0, i, (Object) null);
        }
        this.f13743l = 0;
        invalidateSelf();
    }

    public final void b() {
        mkc mkcVar = this.f13742j;
        if (mkcVar != null) {
            mkcVar.s();
            this.f13742j = null;
            this.s = false;
        }
        jkc jkcVar = this.i;
        if (jkcVar != null) {
            jkcVar.l(false, false, false);
        }
        a();
    }

    public final void c(Canvas canvas) {
        mkc mkcVar = this.f13742j;
        jkc jkcVar = this.i;
        int i = this.f13743l;
        if (mkcVar == null && i <= 0 && jkcVar == null) {
            return;
        }
        float fExactCenterX = this.C.exactCenterX();
        float fExactCenterY = this.C.exactCenterY();
        canvas.translate(fExactCenterX, fExactCenterY);
        Paint paintG = g();
        if (jkcVar != null) {
            jkcVar.i(canvas, paintG);
        }
        if (i > 0) {
            mkc[] mkcVarArr = this.k;
            for (int i2 = 0; i2 < i; i2++) {
                mkcVarArr[i2].q(canvas, paintG);
            }
        }
        if (mkcVar != null) {
            mkcVar.q(canvas, paintG);
        }
        canvas.translate(-fExactCenterX, -fExactCenterY);
    }

    public final void d(Canvas canvas) {
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getId(i) != 16908334) {
                getDrawable(i).draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        i();
        Rect dirtyBounds = getDirtyBounds();
        int iSave = canvas.save();
        if (getNumberOfLayers() > 0) {
            canvas.clipRect(dirtyBounds);
        }
        d(canvas);
        c(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void e(Canvas canvas) {
        this.B.draw(canvas);
    }

    public final int f() {
        if (this.f13742j == null && this.f13743l <= 0 && this.i == null) {
            return -1;
        }
        Drawable drawable = this.B;
        if (drawable != null) {
            return drawable.getOpacity() == -1 ? 0 : 2;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getDrawable(i).getOpacity() != -1) {
                return 1;
            }
        }
        return 0;
    }

    public final Paint g() {
        if (this.t == null) {
            Paint paint = new Paint();
            this.t = paint;
            paint.setAntiAlias(true);
            this.t.setStyle(Paint.Style.FILL);
        }
        float fExactCenterX = this.C.exactCenterX();
        float fExactCenterY = this.C.exactCenterY();
        int iN = n();
        if (this.y != null) {
            Rect bounds = getBounds();
            this.x.setTranslate(bounds.left - fExactCenterX, bounds.top - fExactCenterY);
            this.y.setLocalMatrix(this.x);
        }
        int colorForState = (this.u.getColorForState(getState(), -16777216) & 16777215) | (((int) (this.D * 255.0f)) << 24);
        Paint paint2 = this.t;
        if (iN == 2 || iN == 1) {
            this.w = new PorterDuffColorFilter(colorForState | (-16777216), PorterDuff.Mode.SRC_IN);
            paint2.setColor(colorForState & (-16777216));
            paint2.setColorFilter(this.w);
            paint2.setShader(this.y);
        } else {
            paint2.setColor(colorForState);
            paint2.setColorFilter(null);
            paint2.setShader(null);
        }
        return paint2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public Rect getDirtyBounds() {
        if (getNumberOfLayers() > 0) {
            return getBounds();
        }
        Rect rect = this.q;
        Rect rect2 = this.r;
        rect2.set(rect);
        rect.setEmpty();
        int iExactCenterX = (int) this.C.exactCenterX();
        int iExactCenterY = (int) this.C.exactCenterY();
        Rect rect3 = this.p;
        mkc[] mkcVarArr = this.k;
        int i = this.f13743l;
        for (int i2 = 0; i2 < i; i2++) {
            mkcVarArr[i2].a(rect3);
            rect3.offset(iExactCenterX, iExactCenterY);
            rect.union(rect3);
        }
        jkc jkcVar = this.i;
        if (jkcVar != null) {
            jkcVar.a(rect3);
            rect3.offset(iExactCenterX, iExactCenterY);
            rect.union(rect3);
        }
        rect2.union(rect);
        rect2.union(super.getDirtyBounds());
        return rect2;
    }

    public final void h() {
        int i = this.f13743l;
        mkc[] mkcVarArr = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            mkcVarArr[i2].e();
        }
        mkc mkcVar = this.f13742j;
        if (mkcVar != null) {
            mkcVar.e();
        }
        jkc jkcVar = this.i;
        if (jkcVar != null) {
            jkcVar.e();
        }
    }

    public final void i() {
        mkc[] mkcVarArr = this.k;
        int i = this.f13743l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (!mkcVarArr[i3].y()) {
                mkcVarArr[i2] = mkcVarArr[i3];
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            mkcVarArr[i4] = null;
        }
        this.f13743l = i2;
    }

    public final void j(boolean z, boolean z2, boolean z3) {
        if (this.i == null && (z3 || z2)) {
            jkc jkcVar = new jkc(this, this.C);
            this.i = jkcVar;
            jkcVar.g(getRadius());
        }
        jkc jkcVar2 = this.i;
        if (jkcVar2 != null) {
            jkcVar2.l(z2, z, z3);
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        mkc mkcVar = this.f13742j;
        if (mkcVar != null) {
            mkcVar.s();
        }
        jkc jkcVar = this.i;
        if (jkcVar != null) {
            jkcVar.j();
        }
        a();
    }

    public final void k(boolean z) {
        if (this.s != z) {
            this.s = z;
            if (z) {
                l();
            } else {
                m();
            }
        }
    }

    public final void l() {
        float fExactCenterX;
        float fExactCenterY;
        if (this.f13743l >= 10) {
            return;
        }
        if (this.f13742j == null) {
            if (this.o) {
                this.o = false;
                fExactCenterX = this.m;
                fExactCenterY = this.f13744n;
            } else {
                fExactCenterX = this.C.exactCenterX();
                fExactCenterY = this.C.exactCenterY();
            }
            this.f13742j = new mkc(this, this.C, fExactCenterX, fExactCenterY);
        }
        this.f13742j.g(getRadius());
        this.f13742j.t();
    }

    public final void m() {
        mkc mkcVar = this.f13742j;
        if (mkcVar != null) {
            if (this.k == null) {
                this.k = new mkc[10];
            }
            mkc[] mkcVarArr = this.k;
            int i = this.f13743l;
            this.f13743l = i + 1;
            mkcVarArr[i] = mkcVar;
            mkcVar.u();
            this.f13742j = null;
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    @NotNull
    public Drawable mutate() {
        super.mutate();
        this.B = findDrawableByLayerId(R.id.mask);
        return this;
    }

    public final int n() {
        int iF = f();
        if (iF == -1) {
            return -1;
        }
        Rect bounds = getBounds();
        if (iF == 0 || bounds.isEmpty()) {
            Bitmap bitmap = this.A;
            if (bitmap != null) {
                bitmap.recycle();
                this.A = null;
                this.y = null;
                this.z = null;
            }
            this.x = null;
            this.w = null;
            return 0;
        }
        Bitmap bitmap2 = this.A;
        if (bitmap2 != null && bitmap2.getWidth() == bounds.width() && this.A.getHeight() == bounds.height()) {
            this.A.eraseColor(0);
        } else {
            Bitmap bitmap3 = this.A;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.A = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ALPHA_8);
            Bitmap bitmap4 = this.A;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.y = new BitmapShader(bitmap4, tileMode, tileMode);
            this.z = new Canvas(this.A);
        }
        Matrix matrix = this.x;
        if (matrix == null) {
            this.x = new Matrix();
        } else {
            matrix.reset();
        }
        int i = bounds.left;
        int i2 = bounds.top;
        this.z.translate(-i, -i2);
        if (iF == 2) {
            e(this.z);
        } else if (iF == 1) {
            d(this.z);
        }
        this.z.translate(i, i2);
        return iF;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (!this.v) {
            this.C.set(rect);
            h();
        }
        int i = this.f13743l;
        mkc[] mkcVarArr = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            mkcVarArr[i2].d();
        }
        jkc jkcVar = this.i;
        if (jkcVar != null) {
            jkcVar.d();
        }
        mkc mkcVar = this.f13742j;
        if (mkcVar != null) {
            mkcVar.d();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842908) {
                z4 = true;
            } else if (i == 16842919) {
                z3 = true;
            } else if (i == 16843623) {
                z5 = true;
            }
        }
        if (z2 && z3) {
            z = true;
        }
        k(z);
        j(z5, z4, z3);
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable
    public boolean setDrawableByLayerId(int i, Drawable drawable) {
        if (!super.setDrawableByLayerId(i, drawable)) {
            return false;
        }
        if (i != 16908334) {
            return true;
        }
        this.B = drawable;
        return true;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        mkc mkcVar = this.f13742j;
        if (mkcVar == null || this.i == null) {
            this.m = f;
            this.f13744n = f2;
            this.o = true;
        }
        if (mkcVar != null) {
            mkcVar.z(f, f2);
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.v = true;
        this.C.set(i, i2, i3, i4);
        h();
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            b();
        } else if (visible) {
            if (this.s) {
                l();
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
