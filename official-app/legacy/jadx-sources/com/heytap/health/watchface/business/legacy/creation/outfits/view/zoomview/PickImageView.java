package com.heytap.health.watchface.business.legacy.creation.outfits.view.zoomview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.heytap.health.watchface.R$drawable;
import com.oplus.aiunit.vision.cg1;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"AppCompatCustomView"})
public class PickImageView extends ImageView implements View.OnTouchListener {
    public static final int C = Color.parseColor("#66000000");
    public static final float DP_OFFSET = 0.5f;
    public static final int FINGER_COUNT_2 = 2;
    public static final int MAX_SCALE = 3;
    public static final double MIN_SCALE = 0.33d;
    public boolean A;
    public a B;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f6913j;
    public Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f6914l;
    public Matrix m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PointF f6915n;
    public final PointF o;
    public final PointF p;
    public final PointF q;
    public ShapeDrawable r;
    public int s;
    public float[] t;
    public float[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public float z;

    public interface a {
        void O0(Bitmap bitmap, int i, int i2, int i3);
    }

    public PickImageView(Context context) {
        this(context, null);
    }

    public static int c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public final void a() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float[] fArr = this.u;
        float f6 = fArr[8];
        int i2 = this.y;
        float f7 = 0.0f;
        if (f6 - i2 >= 0.0f) {
            float f8 = i2 + f6;
            int i3 = this.v;
            if (f8 > i3) {
                f6 += i2;
                f2 = i3;
            } else {
                f = 0.0f;
            }
            f3 = fArr[9];
            if (f3 - i2 < 0.0f) {
                f4 = i2 + f3;
                i = this.w;
                if (f4 > i) {
                    f3 += i2;
                    f5 = i;
                }
                this.f6914l.postTranslate(-f, -f7);
            }
            f5 = i2;
            f7 = f3 - f5;
            this.f6914l.postTranslate(-f, -f7);
        }
        f2 = i2;
        f = f6 - f2;
        f3 = fArr[9];
        if (f3 - i2 < 0.0f) {
            f4 = i2 + f3;
            i = this.w;
            if (f4 > i) {
                f3 += i2;
                f5 = i;
            }
            this.f6914l.postTranslate(-f, -f7);
        }
        f5 = i2;
        f7 = f3 - f5;
        this.f6914l.postTranslate(-f, -f7);
    }

    public final float b(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public final void d(MotionEvent motionEvent) {
        this.f6915n.set(motionEvent.getX(0), motionEvent.getY(0));
        this.o.set(motionEvent.getX(1), motionEvent.getY(1));
        float fB = b(this.f6915n, this.o);
        float f = fB / this.z;
        float f2 = this.x;
        if (f2 * f < 3.0f && f2 * f > 0.33d) {
            this.x = f2 * f;
            this.y = (int) (c(this.i, 60.0f) * this.x);
            a();
            i(f, f);
        }
        this.z = fB;
    }

    public final void e(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.q.x;
        float y = motionEvent.getY() - this.q.y;
        float[] fArr = this.u;
        int i = (int) (fArr[8] + x);
        int i2 = (int) (fArr[9] + y);
        int i3 = this.y;
        if (i - i3 < 0 || i + i3 > this.v) {
            x = 0.0f;
        }
        if (i2 - i3 < 0 || i2 + i3 > this.w) {
            y = 0.0f;
        }
        j(x, y);
        this.q.set(motionEvent.getX(), motionEvent.getY());
    }

    public final void f(Context context) {
        this.i = context;
        this.y = c(context, 60.0f);
        setOnTouchListener(this);
        this.f6914l = new Matrix();
        this.m = new Matrix();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_zoom_bg_small);
        this.k = bitmapDecodeResource;
        float[] fArr = {0.0f, 0.0f, bitmapDecodeResource.getWidth(), 0.0f, this.k.getWidth(), this.k.getHeight(), 0.0f, this.k.getHeight(), this.k.getWidth() / 2.0f, this.k.getHeight() / 2.0f};
        this.t = fArr;
        this.u = (float[]) fArr.clone();
    }

    public final Bitmap g(Bitmap bitmap, int i, int i2, int i3) {
        int i4;
        if (bitmap != null && i3 > 0) {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            int i5 = i3 / 2;
            int i6 = i - i5;
            int i7 = i2 - i5;
            if (i6 < 0) {
                i4 = i6 + i3;
                i6 = 0;
            } else {
                int i8 = i + i5;
                if (i8 > width) {
                    int i9 = i3 - (i8 - width);
                    i6 = width - i9;
                    i4 = i9;
                } else {
                    i4 = i3;
                }
            }
            if (i7 < 0) {
                i3 += i7;
                i7 = 0;
            } else {
                int i10 = i2 + i5;
                if (i10 > height) {
                    i3 -= i10 - height;
                    i7 = height - i3;
                }
            }
            try {
                return Bitmap.createBitmap(bitmap, i6, i7, i4, i3);
            } catch (Exception e2) {
                ltl.a("PickImageView", "[pickCenterSquareBitmap] Exception " + e2.getMessage());
            }
        }
        return null;
    }

    public final void h() {
        this.q.set(0.0f, 0.0f);
        this.z = 0.0f;
        this.s = 0;
    }

    public final void i(float f, float f2) {
        Matrix matrix = this.f6914l;
        PointF pointF = this.p;
        matrix.postScale(f, f2, pointF.x, pointF.y);
        k();
    }

    public final void j(float f, float f2) {
        this.f6914l.postTranslate(f, f2);
        k();
    }

    public final void k() {
        this.f6914l.mapPoints(this.u, this.t);
        PointF pointF = this.p;
        float[] fArr = this.u;
        pointF.set(fArr[8], fArr[9]);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(C);
        float[] fArr = this.u;
        float f = fArr[8];
        float f2 = fArr[9];
        if (this.r == null || !this.A) {
            return;
        }
        Matrix matrix = this.m;
        int i = this.y;
        matrix.setTranslate(i - f, i - f2);
        this.r.getPaint().getShader().setLocalMatrix(this.m);
        ShapeDrawable shapeDrawable = this.r;
        int i2 = this.y;
        shapeDrawable.setBounds((int) (f - i2), (int) (f2 - i2), (int) (f + i2), (int) (f2 + i2));
        this.r.draw(canvas);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.s = 1;
            this.q.set(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            h();
        } else if (action == 2) {
            int i = this.s;
            if (i == 1) {
                e(motionEvent);
            } else if (i == 2 && motionEvent.getPointerCount() == 2) {
                d(motionEvent);
            }
            a aVar = this.B;
            if (aVar != null) {
                Bitmap bitmap = this.f6913j;
                float[] fArr = this.u;
                Bitmap bitmapG = g(bitmap, (int) fArr[8], (int) fArr[9], this.y * 2);
                int i2 = this.y;
                float[] fArr2 = this.u;
                aVar.O0(bitmapG, i2, (int) fArr2[8], (int) fArr2[9]);
            }
        } else if (action == 5 && motionEvent.getPointerCount() == 2) {
            this.s = 2;
            this.f6915n.set(motionEvent.getX(0), motionEvent.getY(0));
            this.o.set(motionEvent.getX(1), motionEvent.getY(1));
            this.z = b(this.f6915n, this.o);
        }
        invalidate();
        return true;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            super.setImageBitmap(bitmap);
        } else {
            super.setImageBitmap(cg1.K(bitmap, measuredWidth, measuredHeight));
        }
        Bitmap bitmap2 = ((BitmapDrawable) getDrawable()).getBitmap();
        this.v = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        this.w = height;
        this.f6913j = Bitmap.createScaledBitmap(bitmap2, this.v, height, true);
        Bitmap bitmap3 = this.f6913j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.r = shapeDrawable;
        shapeDrawable.getPaint().setShader(bitmapShader);
        float[] fArr = this.u;
        int i = this.v;
        fArr[8] = i / 2.0f;
        fArr[9] = this.w / 2.0f;
        float width = (i / 2) - (this.k.getWidth() / 2);
        float width2 = (this.w / 2) - (this.k.getWidth() / 2);
        this.f6914l.setTranslate(width, width2);
        this.m.setTranslate(width, width2);
        this.r.getPaint().getShader().setLocalMatrix(this.m);
        a aVar = this.B;
        if (aVar != null) {
            Bitmap bitmap4 = this.f6913j;
            float[] fArr2 = this.u;
            Bitmap bitmapG = g(bitmap4, (int) fArr2[8], (int) fArr2[9], this.y * 2);
            int i2 = this.y;
            float[] fArr3 = this.u;
            aVar.O0(bitmapG, i2, (int) fArr3[8], (int) fArr3[9]);
        }
    }

    public void setOnPickPictureListener(a aVar) {
        this.B = aVar;
    }

    public void setPickVisible(boolean z) {
        this.A = z;
        invalidate();
    }

    public PickImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PickImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6915n = new PointF();
        this.o = new PointF();
        this.p = new PointF();
        this.q = new PointF();
        this.x = 1.0f;
        this.A = true;
        f(context);
    }
}
