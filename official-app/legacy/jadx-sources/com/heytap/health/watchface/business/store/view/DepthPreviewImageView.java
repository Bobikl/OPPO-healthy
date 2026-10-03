package com.heytap.health.watchface.business.store.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.heytap.health.watchface.R$styleable;
import com.heytap.health.watchface.business.store.util.RegionCalcUtil;
import com.oplus.aiunit.vision.TimeStyleCoverDesc;
import com.oplus.aiunit.vision.cg1;
import com.oplus.aiunit.vision.ltl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"AppCompatCustomView"})
public class DepthPreviewImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public static final String TAG = "ClipImageView";
    public Rect A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public Bitmap F;
    public CoverDirection G;
    public Rect H;
    public Rect I;
    public Bitmap J;
    public boolean K;
    public Region L;
    public boolean M;
    public RegionCalcUtil.OverlapCoverState N;
    public a O;
    public int P;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f7107j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f7108l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7109n;
    public int o;
    public final int p;
    public float q;
    public float r;
    public float s;
    public final float[] t;
    public ScaleGestureDetector u;
    public final Matrix v;
    public float w;
    public float x;
    public boolean y;
    public int z;

    public interface a {
        void a(RegionCalcUtil.OverlapCoverState overlapCoverState);
    }

    public DepthPreviewImageView(Context context) {
        this(context, null);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.v;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    public final void b() {
        float f;
        RectF matrixRectF = getMatrixRectF();
        float f2 = 0.0f;
        if (matrixRectF.width() >= this.A.width()) {
            float f3 = matrixRectF.left;
            Rect rect = this.A;
            int i = rect.left;
            f = f3 > ((float) i) ? (-f3) + i : 0.0f;
            float f4 = matrixRectF.right;
            int i2 = rect.right;
            if (f4 < i2) {
                f = i2 - f4;
            }
        } else {
            f = 0.0f;
        }
        if (matrixRectF.height() >= this.A.height()) {
            float f5 = matrixRectF.top;
            Rect rect2 = this.A;
            int i3 = rect2.top;
            f2 = f5 > ((float) i3) ? (-f5) + i3 : 0.0f;
            float f6 = matrixRectF.bottom;
            int i4 = rect2.bottom;
            if (f6 < i4) {
                f2 = i4 - f6;
            }
        }
        this.v.postTranslate(f, f2);
    }

    public final void c(String str) {
        Bitmap bitmap;
        Rect rect = this.H;
        if (rect == null) {
            return;
        }
        RegionCalcUtil regionCalcUtil = RegionCalcUtil.INSTANCE;
        this.I = regionCalcUtil.d(rect, this.A);
        if (this.L == null || this.J == null || this.A.width() <= 0 || this.A.height() <= 0) {
            return;
        }
        Drawable drawable = getDrawable();
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getWidth() > 0) {
            float[] fArr = new float[9];
            this.v.getValues(fArr);
            float intrinsicWidth = drawable.getIntrinsicWidth() / bitmap.getWidth();
            float f = fArr[0] * intrinsicWidth;
            if (f <= 0.0f) {
                return;
            }
            float f2 = fArr[2];
            float f3 = fArr[5];
            Rect rect2 = this.A;
            int i = (int) (((-f2) + rect2.left) / f);
            int i2 = (int) (((-f3) + rect2.top) / f);
            int iWidth = (int) (rect2.width() / f);
            int iHeight = (int) (this.A.height() / f);
            if (i < 0 || i2 < 0 || iWidth <= 0 || iHeight <= 0) {
                return;
            }
            Rect rect3 = this.H;
            Rect rect4 = new Rect(((int) ((rect3.left * iWidth) / 466.0f)) + i, ((int) ((rect3.top * iHeight) / 466.0f)) + i2, ((int) ((rect3.right * iWidth) / 466.0f)) + i, ((int) ((rect3.bottom * iHeight) / 466.0f)) + i2);
            int width = this.J.getWidth();
            int height = this.J.getHeight();
            ltl.a("ClipImageView", str + " checkRegionValid fgSeq=" + this.P + " bmpHash=" + System.identityHashCode(this.J) + " fgBmp=" + width + "x" + height + " intrinsic=" + drawable.getIntrinsicWidth() + "x" + drawable.getIntrinsicHeight() + " densityFactor=" + intrinsicWidth + " mScale=" + fArr[0] + " effectiveScale=" + f + " transX=" + f2 + " transY=" + f3 + " baseTimeRect=" + this.H + " clipBorder=" + this.A + " timeRectInView=" + this.I + " crop=(" + i + "," + i2 + "," + iWidth + "x" + iHeight + ") timeRectInBitmap=" + rect4 + " fgOpaqueBoundsBmp=" + this.L.getBounds() + " viewClip=" + getWidth() + "x" + getHeight());
            RegionCalcUtil.OverlapCoverState overlapCoverStateA = regionCalcUtil.a(this.L, rect4);
            this.N = overlapCoverStateA;
            this.M = overlapCoverStateA != RegionCalcUtil.OverlapCoverState.EXCEEDS_LIMIT;
            m(overlapCoverStateA);
            ltl.a("ClipImageView", str + " coverState=" + this.N + " isSurfacedValid=" + this.M);
        }
    }

    public Pair<Bitmap, Bitmap> d() {
        Matrix matrix;
        int i;
        Bitmap bitmapK;
        String str;
        Drawable drawable = getDrawable();
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            ltl.i("ClipImageView", "[clip] originalBitmap==null and return.");
            return null;
        }
        float[] fArr = new float[9];
        this.v.getValues(fArr);
        float intrinsicWidth = (fArr[0] * drawable.getIntrinsicWidth()) / bitmap.getWidth();
        float f = fArr[2];
        float f2 = fArr[5];
        Rect rect = this.A;
        int i2 = (int) (((-f) + rect.left) / intrinsicWidth);
        int i3 = (int) (((-f2) + rect.top) / intrinsicWidth);
        int iWidth = (int) (rect.width() / intrinsicWidth);
        int iHeight = (int) (this.A.height() / intrinsicWidth);
        Bitmap bitmap2 = this.J;
        int iIdentityHashCode = bitmap2 != null ? System.identityHashCode(bitmap2) : 0;
        Bitmap bitmap3 = this.J;
        int width = bitmap3 != null ? bitmap3.getWidth() : -1;
        Bitmap bitmap4 = this.J;
        ltl.a("ClipImageView", "[clip] enter fgSeq=" + this.P + " bmpHash=" + iIdentityHashCode + " fgBmp=" + width + "x" + (bitmap4 != null ? bitmap4.getHeight() : -1) + " bgBmp=" + bitmap.getWidth() + "x" + bitmap.getHeight() + " intrinsic=" + drawable.getIntrinsicWidth() + "x" + drawable.getIntrinsicHeight() + " mScaleX=" + fArr[0] + " transX=" + f + " transY=" + f2 + " effectiveScale=" + intrinsicWidth + " clipBorder=" + this.A + " crop=(" + i2 + "," + i3 + "," + iWidth + "x" + iHeight + ") aspect=" + this.f7109n + "x" + this.o);
        if (i2 < 0 || i3 < 0) {
            ltl.i("ClipImageView", "cropX < 0 || cropY < 0,and return.");
            return null;
        }
        int i4 = this.B;
        if (i4 <= 0 || iWidth <= i4) {
            matrix = null;
        } else {
            float f3 = i4 / iWidth;
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f3, f3);
            matrix = matrix2;
        }
        int i5 = i2 + iWidth;
        if (i5 > bitmap.getWidth() || (i = i3 + iHeight) > bitmap.getHeight()) {
            ltl.i("ClipImageView", "x + width must be <= bitmap.width()||y + height must be <= bitmap.height()");
            return null;
        }
        Bitmap bitmapK2 = cg1.K(Bitmap.createBitmap(bitmap, i2, i3, iWidth, iHeight, matrix, false), this.f7109n, this.o);
        Bitmap bitmap5 = this.J;
        if (bitmap5 == null) {
            bitmapK = null;
        } else {
            if (i5 > bitmap5.getWidth() || i > this.J.getHeight()) {
                ltl.i("ClipImageView", "mForegroundBitmap x + width must be <= bitmap.width()||y + height must be <= bitmap.height()");
                return null;
            }
            bitmapK = cg1.K(Bitmap.createBitmap(this.J, i2, i3, iWidth, iHeight, matrix, false), this.f7109n, this.o);
            try {
                str = "ClipImageView";
                try {
                    ltl.a(str, "[clip] result fgSeq=" + this.P + " clippedFg=" + bitmapK.getWidth() + "x" + bitmapK.getHeight() + " clippedFgOpaqueBounds=" + RegionCalcUtil.INSTANCE.c(bitmapK, 128).getBounds());
                } catch (Throwable th) {
                    th = th;
                    ltl.i(str, "[clip] buildOpaqueRegion failed: " + th.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                str = "ClipImageView";
            }
        }
        return new Pair<>(bitmapK2, bitmapK);
    }

    public final void e(Canvas canvas, RectF rectF) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        paint.setColor(0);
        canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), this.i);
        paint.setXfermode(porterDuffXfermode);
        float f = this.C;
        canvas2.drawRoundRect(rectF, f, f, paint);
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            canvas2.drawBitmap(bitmap, (Rect) null, rectF, this.k);
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void f(Canvas canvas, RectF rectF) {
        if (this.E) {
            canvas.drawRect(rectF, this.f7108l);
        }
    }

    public final void g(Canvas canvas, RectF rectF) {
        Bitmap bitmap = this.J;
        if (bitmap == null || bitmap.isRecycled() || !this.K) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.save();
        canvas2.translate(getPaddingLeft(), getPaddingTop());
        canvas2.concat(this.v);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            canvas2.drawBitmap(this.J, (Rect) null, new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), this.k);
        } else {
            canvas2.drawBitmap(this.J, 0.0f, 0.0f, this.k);
        }
        canvas2.restore();
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = this.C;
        canvas3.drawRoundRect(rectF, f, f, paint);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas4 = new Canvas(bitmapCreateBitmap3);
        canvas4.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        canvas4.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
        canvas.drawBitmap(bitmapCreateBitmap3, 0.0f, 0.0f, (Paint) null);
        o(bitmapCreateBitmap);
        o(bitmapCreateBitmap2);
        o(bitmapCreateBitmap3);
    }

    public Rect getClipBorderRect() {
        return this.A;
    }

    public float[] getClipMatrixValues() {
        float[] fArr = new float[9];
        this.v.getValues(fArr);
        return fArr;
    }

    public ClipImageView.CropParams getCropParams() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            ltl.i("ClipImageView", "[clip] originalBitmap==null and return.");
            return null;
        }
        float[] fArr = new float[9];
        this.v.getValues(fArr);
        float intrinsicWidth = (fArr[0] * drawable.getIntrinsicWidth()) / bitmap.getWidth();
        float f = fArr[2];
        float f2 = fArr[5];
        Rect rect = this.A;
        int i = (int) (((-f) + rect.left) / intrinsicWidth);
        int i2 = (int) (((-f2) + rect.top) / intrinsicWidth);
        int iWidth = (int) (rect.width() / intrinsicWidth);
        int iHeight = (int) (this.A.height() / intrinsicWidth);
        ClipImageView.CropParams cropParams = new ClipImageView.CropParams();
        cropParams.previewWidth = bitmap.getWidth();
        cropParams.previewHeight = bitmap.getHeight();
        cropParams.cropPreviewWidth = iWidth;
        cropParams.cropPreviewHeight = iHeight;
        cropParams.cropLeft = i;
        cropParams.cropTop = i2;
        return cropParams;
    }

    public final float getScale() {
        this.v.getValues(this.t);
        return this.t[0];
    }

    public void h(Canvas canvas) {
        Rect rect = this.A;
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        e(canvas, rectF);
        i(canvas);
        g(canvas, rectF);
        f(canvas, rectF);
    }

    public final void i(Canvas canvas) {
    }

    public final boolean j(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 0.0d;
    }

    public boolean k() {
        return this.D;
    }

    public final void m(RegionCalcUtil.OverlapCoverState overlapCoverState) {
        a aVar = this.O;
        if (aVar != null) {
            aVar.a(overlapCoverState);
        }
    }

    public final void n() {
        if (getWidth() != 0) {
            l();
        } else {
            post(new Runnable() { // from class: com.oplus.aiunit.vision.h95
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.l();
                }
            });
        }
    }

    public final void o(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.i.setColor(this.m);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setStrokeWidth(1.0f);
        h(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = this.q;
        if ((scale < f && scaleFactor > 1.0f) || (scale > this.s && scaleFactor < 1.0f)) {
            float f2 = scaleFactor * scale;
            float f3 = this.s;
            if (f2 < f3) {
                scaleFactor = f3 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.v.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            b();
            setImageMatrix(this.v);
            c("onScale");
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.D = true;
        this.u.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        if (pointerCount != this.z) {
            this.y = false;
            this.w = f2;
            this.x = f3;
        }
        this.z = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.z = 0;
        } else if (action == 2) {
            float f4 = f2 - this.w;
            float f5 = f3 - this.x;
            if (!this.y) {
                this.y = j(f4, f5);
            }
            if (this.y && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= this.A.width()) {
                    f4 = 0.0f;
                }
                this.v.postTranslate(f4, matrixRectF.height() > ((float) this.A.height()) ? f5 : 0.0f);
                b();
                setImageMatrix(this.v);
            }
            this.w = f2;
            this.x = f3;
            c("onTouch move");
        } else if (action == 3) {
            this.z = 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void l() {
        float f;
        float f2;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iWidth = this.A.width();
        int iHeight = this.A.height();
        int width = getWidth();
        int height = getHeight();
        if (intrinsicWidth * iHeight > iWidth * intrinsicHeight) {
            f = iHeight;
            f2 = intrinsicHeight;
        } else {
            f = iWidth;
            f2 = intrinsicWidth;
        }
        float f3 = f / f2;
        this.v.setScale(f3, f3);
        this.v.postTranslate((int) (((width - (intrinsicWidth * f3)) * 0.5f) + 0.5f), (int) (((height - (intrinsicHeight * f3)) * 0.5f) + 0.5f));
        setImageMatrix(this.v);
        this.s = f3;
        this.r = 2.0f * f3;
        this.q = f3 * 4.0f;
        this.D = false;
    }

    public void q(int i, int i2) {
        this.f7109n = i;
        this.o = i2;
    }

    public void r(Bitmap bitmap, float[] fArr) {
        super.setImageBitmap(bitmap);
        if (fArr == null) {
            n();
            return;
        }
        t();
        setClipMatrixValues(fArr);
        setImageMatrix(this.v);
        this.D = true;
    }

    public final void s() {
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.A;
        int i = this.p;
        rect.left = i;
        rect.right = width - i;
        int iWidth = (rect.width() * this.o) / this.f7109n;
        Rect rect2 = this.A;
        int i2 = (int) (((height - iWidth) / 2.0f) + 0.5f);
        rect2.top = i2;
        rect2.bottom = i2 + iWidth;
        c("updateBorder");
    }

    public void setClipMatrixValues(float[] fArr) {
        this.v.setValues(fArr);
    }

    public void setFgLayerVisible(boolean z) {
        this.K = z;
        invalidate();
    }

    public void setForegroundBitmap(Bitmap bitmap) {
        this.J = bitmap;
        if (bitmap == null) {
            this.L = null;
            ltl.a("ClipImageView", "setForegroundBitmap seq=" + this.P + " fg=null");
            return;
        }
        this.L = RegionCalcUtil.INSTANCE.c(bitmap, 128);
        this.P++;
        ltl.a("ClipImageView", "setForegroundBitmap seq=" + this.P + " bmpHash=" + System.identityHashCode(this.J) + " fgBmp=" + this.J.getWidth() + "x" + this.J.getHeight() + " alphaThreshold=128 opaqueBounds=" + this.L.getBounds());
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        n();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n();
    }

    public void setMaxOutputWidth(int i) {
        this.B = i;
    }

    public void setOnDragCoverChangedListener(a aVar) {
        this.O = aVar;
    }

    public void setRoundCorner(float f) {
        this.C = f;
    }

    public void setShowBorder(boolean z) {
        this.E = z;
    }

    public void setTimeStyleCoverDesc(TimeStyleCoverDesc timeStyleCoverDesc) {
        this.F = BitmapFactory.decodeFile(timeStyleCoverDesc.getSource());
        this.G = timeStyleCoverDesc.getCoverDirection();
        List<Rect> listB = timeStyleCoverDesc.b();
        if (listB != null && !listB.isEmpty()) {
            this.H = timeStyleCoverDesc.b().get(0);
        }
        invalidate();
    }

    public final void t() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iWidth = this.A.width();
        int iHeight = this.A.height();
        if (iWidth <= 0 || iHeight <= 0 || intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth * iHeight > iWidth * intrinsicHeight ? iHeight / intrinsicHeight : iWidth / intrinsicWidth;
        this.s = f;
        this.r = 2.0f * f;
        this.q = f * 4.0f;
    }

    public DepthPreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 4.0f;
        this.r = 2.0f;
        this.s = 1.0f;
        this.t = new float[9];
        this.u = null;
        this.v = new Matrix();
        this.A = new Rect();
        this.B = 0;
        this.E = true;
        this.K = true;
        this.N = RegionCalcUtil.OverlapCoverState.NO_INTERSECT;
        this.P = 0;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.u = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f7107j = paint2;
        paint2.setColor(Color.parseColor("#22FF0000"));
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setColor(-1);
        Paint paint4 = new Paint(1);
        this.f7108l = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        this.f7108l.setColor(-1);
        this.f7108l.setStrokeWidth(9.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClipImageView);
        this.f7109n = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClipImageView_civWidth, 1);
        this.o = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClipImageView_civHeight, 1);
        ltl.a("ClipImageView", "[ClipImageView] mAspectX " + this.f7109n + " mAspectY " + this.o);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipImageView_civClipPadding, 0);
        this.m = typedArrayObtainStyledAttributes.getColor(R$styleable.ClipImageView_civMaskColor, Color.parseColor("#8C000000"));
        this.C = typedArrayObtainStyledAttributes.getDimension(R$styleable.ClipImageView_civClipRoundCorner, 0.0f);
        paint.setTextSize((float) typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipImageView_civTipTextSize, 24));
        typedArrayObtainStyledAttributes.recycle();
        paint.setDither(true);
    }
}
