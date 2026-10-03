package com.heytap.nearx.uikit.internal.utils.blur;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.heytap.nearx.uikit.R$color;
import com.oplus.aiunit.vision.egc;
import com.oplus.aiunit.vision.fgc;
import com.oplus.aiunit.vision.ggc;
import com.oplus.aiunit.vision.x3a;
import com.oplus.aiunit.vision.yu1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class b {
    public static final int DOWN_SCALE_FACTOR = 10;
    public static final int RADIUS = 16;
    public static final int SATURATION = 4;
    public com.heytap.nearx.uikit.internal.utils.blur.a a;
    public fgc b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f7473c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7474e;
    public Bitmap f;
    public Canvas g;
    public View i;
    public int h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<ggc> f7475j = new ArrayList<>();
    public yu1 k = new yu1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f7476l = new a();

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (b.this.f7473c == null || b.this.i == null || b.this.i.isDirty() || !b.this.f7473c.isDirty() || !b.this.i.isShown()) {
                return true;
            }
            b.this.i.invalidate();
            return true;
        }
    }

    public b(View view) {
        this.i = view;
        this.a = new com.heytap.nearx.uikit.internal.utils.blur.a.b().e(16).b(10).d(view.getResources().getColor(R$color.nx_blur_cover_color)).c(4).a();
        this.b = new egc(this.i.getContext(), this.a);
    }

    public void c(View view) {
        view.buildDrawingCache();
        View view2 = this.f7473c;
        if (view2 != null && view2 != view && view2.getViewTreeObserver().isAlive()) {
            this.f7473c.getViewTreeObserver().removeOnPreDrawListener(this.f7476l);
        }
        if (this.f7473c.getViewTreeObserver().isAlive()) {
            this.f7473c.getViewTreeObserver().addOnPreDrawListener(this.f7476l);
        }
    }

    public void d() {
        View view = this.f7473c;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            this.f7473c.getViewTreeObserver().removeOnPreDrawListener(this.f7476l);
        }
        ArrayList<ggc> arrayList = this.f7475j;
        if (arrayList != null) {
            arrayList.clear();
            this.f7475j = null;
        }
        this.f7473c = null;
        this.g = null;
        this.i = null;
        Bitmap bitmap = this.f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f.recycle();
            this.f = null;
        }
        yu1 yu1Var = this.k;
        if (yu1Var != null && yu1Var.a() != null && !this.k.a().isRecycled()) {
            this.k.a().recycle();
            this.k = null;
        }
        x3a.a().d();
    }

    public void e(Canvas canvas, int i) {
        Bitmap bitmapC;
        yu1 yu1Var;
        if (this.f7473c == null || !g(i)) {
            return;
        }
        if (this.f7473c.getBackground() == null || !(this.f7473c.getBackground() instanceof ColorDrawable) || ((ColorDrawable) this.f7473c.getBackground()).getColor() == 0) {
            this.f.eraseColor(-1);
        } else {
            this.f.eraseColor(((ColorDrawable) this.f7473c.getBackground()).getColor());
        }
        this.g.save();
        this.g.translate(-this.f7473c.getScrollX(), -(this.f7473c.getScrollY() + this.f7473c.getTranslationY()));
        this.f7473c.draw(this.g);
        this.g.restore();
        Bitmap bitmapA = this.b.a(this.f, true, this.h);
        if (bitmapA == null || bitmapA.isRecycled() || (bitmapC = x3a.a().c(bitmapA, this.a.c())) == null || bitmapC.isRecycled()) {
            return;
        }
        canvas.save();
        canvas.translate(this.f7473c.getX(), 0.0f);
        canvas.scale(this.a.b(), this.a.b());
        canvas.drawBitmap(bitmapC, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        canvas.drawColor(this.a.d());
        ArrayList<ggc> arrayList = this.f7475j;
        if (arrayList == null || arrayList.size() == 0 || (yu1Var = this.k) == null) {
            return;
        }
        yu1Var.b(bitmapC);
        this.k.c(this.a.b());
        Iterator<ggc> it = this.f7475j.iterator();
        while (it.hasNext()) {
            it.next().a(this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(View view) {
        if (view == 0 || !(view instanceof ggc)) {
            return;
        }
        this.f7475j.add((ggc) view);
    }

    public final boolean g(int i) {
        int i2;
        int width = this.f7473c.getWidth();
        int height = this.f7473c.getHeight();
        if (width != this.d || height != this.f7474e || this.f == null) {
            this.d = width;
            this.f7474e = height;
            int iB = this.a.b();
            int i3 = width / iB;
            int i4 = (height / iB) + 1;
            Bitmap bitmap = this.f;
            if (bitmap == null || bitmap.isRecycled() || i3 != this.f.getWidth() || i4 != this.f.getHeight()) {
                if (i3 <= 0 || i4 <= 0 || iB == 0 || (i2 = i / iB) == 0) {
                    return false;
                }
                if (this.f7475j.size() > 0) {
                    this.f = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                } else if (i % iB == 0) {
                    this.f = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                } else {
                    this.f = Bitmap.createBitmap(i3, i2 + 1, Bitmap.Config.ARGB_8888);
                }
                if (this.f == null) {
                    return false;
                }
            }
            Canvas canvas = new Canvas(this.f);
            this.g = canvas;
            float f = 1.0f / iB;
            canvas.scale(f, f);
        }
        return true;
    }

    public void h() {
        View view = this.i;
        if (view != null) {
            view.invalidate();
        }
    }

    public void i(com.heytap.nearx.uikit.internal.utils.blur.a aVar) {
        this.a = aVar;
        this.f = null;
        h();
    }

    public void j(View view) {
        if (view == null) {
            h();
            this.f7473c = null;
        } else {
            this.f7473c = view;
            c(view);
        }
    }
}
