package com.heytap.health.watchface.business.store.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.heytap.health.watchface.R$styleable;
import com.oplus.aiunit.vision.cg1;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"AppCompatCustomView"})
public class ClipImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public static final String TAG = "ClipImageView";
    public float A;
    public boolean B;
    public boolean C;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f7104j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7105l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7106n;
    public float o;
    public float p;
    public float q;
    public final float[] r;
    public ScaleGestureDetector s;
    public final Matrix t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public Rect y;
    public int z;

    @Keep
    public static class CropParams {
        public boolean cropDone;
        public int cropLeft;
        public int cropPreviewHeight;
        public int cropPreviewWidth;
        public int cropTop;
        public int previewHeight;
        public int previewWidth;

        public String toString() {
            return "CropParams{previewWidth=" + this.previewWidth + ", previewHeight=" + this.previewHeight + ", cropPreviewWidth=" + this.cropPreviewWidth + ", cropPreviewHeight=" + this.cropPreviewHeight + ", cropLeft=" + this.cropLeft + ", cropTop=" + this.cropTop + '}';
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClipImageView.this.g();
        }
    }

    public ClipImageView(Context context) {
        this(context, null);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.t;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    public final void a() {
        float f;
        RectF matrixRectF = getMatrixRectF();
        float f2 = 0.0f;
        if (matrixRectF.width() >= this.y.width()) {
            float f3 = matrixRectF.left;
            Rect rect = this.y;
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
        if (matrixRectF.height() >= this.y.height()) {
            float f5 = matrixRectF.top;
            Rect rect2 = this.y;
            int i3 = rect2.top;
            f2 = f5 > ((float) i3) ? (-f5) + i3 : 0.0f;
            float f6 = matrixRectF.bottom;
            int i4 = rect2.bottom;
            if (f6 < i4) {
                f2 = i4 - f6;
            }
        }
        this.t.postTranslate(f, f2);
    }

    public Bitmap b() {
        Matrix matrix;
        Drawable drawable = getDrawable();
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            ltl.i("ClipImageView", "[clip] originalBitmap==null and return.");
            return null;
        }
        float[] fArr = new float[9];
        this.t.getValues(fArr);
        float intrinsicWidth = (fArr[0] * drawable.getIntrinsicWidth()) / bitmap.getWidth();
        float f = fArr[2];
        float f2 = fArr[5];
        Rect rect = this.y;
        int i = (int) (((-f) + rect.left) / intrinsicWidth);
        int i2 = (int) (((-f2) + rect.top) / intrinsicWidth);
        int iWidth = (int) (rect.width() / intrinsicWidth);
        int iHeight = (int) (this.y.height() / intrinsicWidth);
        if (i < 0 || i2 < 0) {
            ltl.i("ClipImageView", "cropX < 0 || cropY < 0,and return.");
            return null;
        }
        int i3 = this.z;
        if (i3 <= 0 || iWidth <= i3) {
            matrix = null;
        } else {
            float f3 = i3 / iWidth;
            matrix = new Matrix();
            matrix.setScale(f3, f3);
        }
        if (i + iWidth <= bitmap.getWidth() && i2 + iHeight <= bitmap.getHeight()) {
            return cg1.K(Bitmap.createBitmap(bitmap, i, i2, iWidth, iHeight, matrix, false), this.f7105l, this.m);
        }
        ltl.i("ClipImageView", "x + width must be <= bitmap.width()||y + height must be <= bitmap.height()");
        return null;
    }

    public void c(Canvas canvas) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        paint.setColor(0);
        canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), this.i);
        paint.setXfermode(porterDuffXfermode);
        Rect rect = this.y;
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        float f = this.A;
        canvas2.drawRoundRect(rectF, f, f, paint);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        if (this.C) {
            canvas.drawRect(rectF, this.f7104j);
        }
    }

    public final boolean d(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 0.0d;
    }

    public boolean e() {
        return this.B;
    }

    public final void f() {
        if (getWidth() != 0) {
            g();
        } else {
            post(new a());
        }
    }

    public void g() {
        float f;
        float f2;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iWidth = this.y.width();
        int iHeight = this.y.height();
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
        this.t.setScale(f3, f3);
        this.t.postTranslate((int) (((width - (intrinsicWidth * f3)) * 0.5f) + 0.5f), (int) (((height - (intrinsicHeight * f3)) * 0.5f) + 0.5f));
        setImageMatrix(this.t);
        this.q = f3;
        this.p = 2.0f * f3;
        this.o = f3 * 4.0f;
        this.B = false;
    }

    public Rect getClipBorder() {
        return this.y;
    }

    public float[] getClipMatrixValues() {
        float[] fArr = new float[9];
        this.t.getValues(fArr);
        return fArr;
    }

    public CropParams getCropParams() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            ltl.i("ClipImageView", "[clip] originalBitmap==null and return.");
            return null;
        }
        float[] fArr = new float[9];
        this.t.getValues(fArr);
        float intrinsicWidth = (fArr[0] * drawable.getIntrinsicWidth()) / bitmap.getWidth();
        float f = fArr[2];
        float f2 = fArr[5];
        Rect rect = this.y;
        int i = (int) (((-f) + rect.left) / intrinsicWidth);
        int i2 = (int) (((-f2) + rect.top) / intrinsicWidth);
        int iWidth = (int) (rect.width() / intrinsicWidth);
        int iHeight = (int) (this.y.height() / intrinsicWidth);
        CropParams cropParams = new CropParams();
        cropParams.previewWidth = bitmap.getWidth();
        cropParams.previewHeight = bitmap.getHeight();
        cropParams.cropPreviewWidth = iWidth;
        cropParams.cropPreviewHeight = iHeight;
        cropParams.cropLeft = i;
        cropParams.cropTop = i2;
        return cropParams;
    }

    public final float getScale() {
        this.t.getValues(this.r);
        return this.r[0];
    }

    public void h(int i, int i2) {
        this.f7105l = i;
        this.m = i2;
    }

    public void i(Bitmap bitmap, float[] fArr) {
        super.setImageBitmap(bitmap);
        if (fArr == null) {
            f();
        } else {
            setClipMatrixValues(fArr);
            setImageMatrix(this.t);
        }
    }

    public final void j() {
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.y;
        int i = this.f7106n;
        rect.left = i;
        rect.right = width - i;
        int iWidth = (rect.width() * this.m) / this.f7105l;
        Rect rect2 = this.y;
        int i2 = (int) (((height - iWidth) / 2.0f) + 0.5f);
        rect2.top = i2;
        rect2.bottom = i2 + iWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.i.setColor(this.k);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setStrokeWidth(1.0f);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = this.o;
        if ((scale < f && scaleFactor > 1.0f) || (scale > this.q && scaleFactor < 1.0f)) {
            float f2 = scaleFactor * scale;
            float f3 = this.q;
            if (f2 < f3) {
                scaleFactor = f3 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.t.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            a();
            setImageMatrix(this.t);
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

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.B = true;
        this.s.onTouchEvent(motionEvent);
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
        if (pointerCount != this.x) {
            this.w = false;
            this.u = f2;
            this.v = f3;
        }
        this.x = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.x = 0;
        } else if (action == 2) {
            float f4 = f2 - this.u;
            float f5 = f3 - this.v;
            if (!this.w) {
                this.w = d(f4, f5);
            }
            if (this.w && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= this.y.width()) {
                    f4 = 0.0f;
                }
                this.t.postTranslate(f4, matrixRectF.height() > ((float) this.y.height()) ? f5 : 0.0f);
                a();
                setImageMatrix(this.t);
            }
            this.u = f2;
            this.v = f3;
        } else if (action == 3) {
            this.x = 0;
        }
        return true;
    }

    public void setClipMatrixValues(float[] fArr) {
        this.t.setValues(fArr);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        f();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        f();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f();
    }

    public void setMaxOutputWidth(int i) {
        this.z = i;
    }

    public void setRoundCorner(float f) {
        this.A = f;
    }

    public void setShowBorder(boolean z) {
        this.C = z;
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 4.0f;
        this.p = 2.0f;
        this.q = 1.0f;
        this.r = new float[9];
        this.s = null;
        this.t = new Matrix();
        this.y = new Rect();
        this.z = 0;
        this.C = true;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.s = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f7104j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f7104j.setColor(-1);
        this.f7104j.setStrokeWidth(9.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClipImageView);
        this.f7105l = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClipImageView_civWidth, 1);
        this.m = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClipImageView_civHeight, 1);
        ltl.a("ClipImageView", "[ClipImageView] mAspectX " + this.f7105l + " mAspectY " + this.m);
        this.f7106n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipImageView_civClipPadding, 0);
        this.k = typedArrayObtainStyledAttributes.getColor(R$styleable.ClipImageView_civMaskColor, Color.parseColor("#8C000000"));
        this.A = typedArrayObtainStyledAttributes.getDimension(R$styleable.ClipImageView_civClipRoundCorner, 0.0f);
        paint.setTextSize((float) typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipImageView_civTipTextSize, 24));
        typedArrayObtainStyledAttributes.recycle();
        paint.setDither(true);
    }
}
