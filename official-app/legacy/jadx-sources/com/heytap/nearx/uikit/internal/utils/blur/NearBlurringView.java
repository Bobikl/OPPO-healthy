package com.heytap.nearx.uikit.internal.utils.blur;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.utils.NearDeviceUtil;
import com.oplus.aiunit.vision.egc;
import com.oplus.aiunit.vision.fgc;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.ggc;
import com.oplus.aiunit.vision.x3a;
import com.oplus.aiunit.vision.yu1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class NearBlurringView extends View {
    public static final int CONSTANT_NUM_0 = 0;
    public static final float CONSTANT_NUM_1 = 1.0f;
    public static final String TAG = "NearBlurringView";
    public com.heytap.nearx.uikit.internal.utils.blur.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fgc f7468j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7469l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f7470n;
    public Canvas o;
    public int p;
    public boolean q;
    public int r;
    public ArrayList<ggc> s;
    public yu1 t;
    public int u;
    public boolean v;
    public final ViewTreeObserver.OnPreDrawListener w;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (NearBlurringView.this.isDirty() || !NearBlurringView.this.k.isDirty() || !NearBlurringView.this.isShown()) {
                return true;
            }
            NearBlurringView.this.invalidate();
            return true;
        }
    }

    public NearBlurringView(Context context) {
        this(context, null);
    }

    public final boolean b() {
        int width = this.k.getWidth();
        int height = this.k.getHeight();
        if (width != this.f7469l || height != this.m || this.f7470n == null) {
            this.f7469l = width;
            this.m = height;
            int iB = this.i.b();
            int i = width / iB;
            int i2 = (height / iB) + 1;
            Bitmap bitmap = this.f7470n;
            if (bitmap == null || i != bitmap.getWidth() || i2 != this.f7470n.getHeight() || this.f7470n.isRecycled()) {
                if (i <= 0 || i2 <= 0) {
                    return false;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f7470n = bitmapCreateBitmap;
                if (bitmapCreateBitmap == null) {
                    return false;
                }
            }
            Canvas canvas = new Canvas(this.f7470n);
            this.o = canvas;
            float f = 1.0f / iB;
            canvas.scale(f, f);
        }
        return true;
    }

    public final byte c() {
        return (byte) 111;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i == null) {
            fjc.e(TAG, "onAttachedToWindow: mNearBlurConfig == null");
        }
        this.f7468j = new egc(getContext(), this.i);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.k;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            this.k.getViewTreeObserver().removeOnPreDrawListener(this.w);
        }
        this.f7468j.destroy();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapC;
        if (this.q) {
            if (NearDeviceUtil.b() < 11 || this.v) {
                canvas.drawColor(getResources().getColor(R$color.nx_appbar_default_bg));
                return;
            }
            if (this.k == null || !b()) {
                return;
            }
            if (this.f7470n.isRecycled() || this.o == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("mBitmapToBlur.isRecycled()== ");
                sb.append(this.f7470n.isRecycled());
                sb.append("mBlurringCanva==null ");
                sb.append(this.o == null);
                fjc.b(TAG, sb.toString());
                return;
            }
            if (this.k.getBackground() == null || !(this.k.getBackground() instanceof ColorDrawable)) {
                this.f7470n.eraseColor(-1);
            } else {
                this.f7470n.eraseColor(((ColorDrawable) this.k.getBackground()).getColor());
            }
            this.o.save();
            this.o.translate(-this.k.getScrollX(), -(this.k.getScrollY() + this.k.getTranslationX()));
            this.k.draw(this.o);
            this.o.restore();
            Bitmap bitmapA = this.f7468j.a(this.f7470n, true, this.p);
            if (bitmapA == null || bitmapA.isRecycled() || (bitmapC = x3a.a().c(bitmapA, this.i.c())) == null || bitmapC.isRecycled()) {
                return;
            }
            canvas.save();
            canvas.translate(this.k.getX() - getX(), this.k.getY() - getY());
            canvas.scale(this.i.b(), this.i.b());
            canvas.drawBitmap(bitmapC, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            canvas.drawColor(this.i.d());
            if (this.s.size() != 0) {
                this.t.b(bitmapC);
                this.t.c(this.i.b());
                Iterator<ggc> it = this.s.iterator();
                while (it.hasNext()) {
                    it.next().a(this.t);
                }
            }
        }
    }

    public void setBlurEnable(boolean z) {
        this.q = z;
    }

    public void setBlurRegionHeight(int i) {
        this.r = i;
    }

    public void setNearBlurConfig(com.heytap.nearx.uikit.internal.utils.blur.a aVar) {
        this.i = aVar;
        this.f7468j = new egc(getContext(), aVar);
    }

    public NearBlurringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearBlurringView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 1;
        this.r = 400;
        this.s = new ArrayList<>();
        this.t = new yu1();
        this.u = 4;
        this.w = new a();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.NearBlurringView);
        typedArrayObtainStyledAttributes.getInt(R$styleable.NearBlurringView_NXoverlayColor, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearBlurringView_NXcolor_blur_radius, 10);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearBlurringView_NXdownScaleFactor, 10);
        typedArrayObtainStyledAttributes.recycle();
        this.i = new com.heytap.nearx.uikit.internal.utils.blur.a.b().e(i2).b(i3).d(getResources().getColor(R$color.nx_blur_cover_color)).c(this.u).a();
        this.v = context.getPackageManager().hasSystemFeature(new String(new byte[]{c(), 112, 112, 111}, StandardCharsets.UTF_8) + ".common.performance.animator.support");
    }
}
