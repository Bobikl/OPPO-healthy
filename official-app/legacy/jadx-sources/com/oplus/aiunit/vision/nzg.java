package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class nzg {
    public static float DEFAULT_VALUE_FLOAT = -1.0f;
    public static int DEFAULT_VALUE_INT;
    public a a;

    public static final class a {
        public Bitmap a;
        public Resources b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14707c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14708e;
        public boolean f;
        public float g;
        public float h;
        public List<Drawable> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<Bitmap> f14709j;
        public List<b> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f14710l;
        public ImageView.ScaleType m;

        public a(Bitmap bitmap) {
            int i = nzg.DEFAULT_VALUE_INT;
            this.f14707c = i;
            this.d = i;
            this.f14708e = 480;
            this.f = true;
            float f = nzg.DEFAULT_VALUE_FLOAT;
            this.g = f;
            this.h = f;
            this.i = new ArrayList();
            this.f14709j = new ArrayList();
            this.k = new ArrayList();
            this.m = null;
            this.a = bitmap;
        }

        public a p(View view) {
            Bitmap bitmapW = w(view);
            if (bitmapW != null) {
                this.f14709j.add(bitmapW);
            }
            return this;
        }

        public a q(b bVar) {
            this.k.add(bVar);
            return this;
        }

        public nzg r() {
            nzg nzgVar = new nzg(this);
            nzgVar.a = this;
            return nzgVar;
        }

        public a s(int i, int i2) {
            this.g = i;
            this.h = i2;
            return this;
        }

        public a t(int i) {
            this.d = i;
            return this;
        }

        public a u(boolean z) {
            this.f = z;
            return this;
        }

        public a v(ImageView.ScaleType scaleType) {
            this.m = scaleType;
            return this;
        }

        public final Bitmap w(View view) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }
    }

    public static class b {
        public Drawable a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14711c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14712e;
        public int f;
        public int g;

        public b(Drawable drawable, int i, int i2, int i3, int i4) {
            this.b = 0;
            this.f14711c = 0;
            this.d = 0;
            this.f14712e = 0;
            int i5 = nzg.DEFAULT_VALUE_INT;
            this.f = i5;
            this.g = i5;
            this.a = drawable;
            this.b = i;
            this.d = i2;
            this.f14711c = i3;
            this.f14712e = i4;
        }

        public b j(int i, int i2) {
            this.f = i;
            this.g = i2;
            return this;
        }
    }

    public final boolean b() {
        return ((this.a.b == null || this.a.f14707c == DEFAULT_VALUE_INT) && this.a.a == null && (this.a.b == null || TextUtils.isEmpty(this.a.f14710l))) ? false : true;
    }

    public final boolean c() {
        return (lza.a(this.a.k) || this.a.a == null) ? false : true;
    }

    public final void d(Canvas canvas, Bitmap bitmap) {
        if (!b()) {
            a7b.b("ShareBgProcessor", "drawBitmapBg resource or bgPic or srcBitmap == null");
            return;
        }
        try {
            if (this.a.f14707c != DEFAULT_VALUE_INT) {
                f(canvas, BitmapFactory.decodeResource(this.a.b, this.a.f14707c), bitmap, (this.a.f14708e / this.a.b.getDisplayMetrics().densityDpi) * ResourcesCompat.getDrawable(this.a.b, this.a.f14707c, null).getIntrinsicWidth(), (this.a.f14708e / this.a.b.getDisplayMetrics().densityDpi) * ResourcesCompat.getDrawable(this.a.b, this.a.f14707c, null).getIntrinsicHeight());
            } else if (!lza.a(this.a.f14709j)) {
                h(canvas, bitmap, this.a.f14709j);
            } else if (lza.a(this.a.i)) {
                a7b.b("ShareBgProcessor", "not valid drawable");
            } else {
                i(canvas, bitmap, this.a.i);
            }
        } catch (Resources.NotFoundException unused) {
            a7b.b("ShareBgProcessor", "can not found this drawable bg!");
        }
    }

    public final void e(Canvas canvas, Bitmap bitmap, Bitmap bitmap2, float f, float f2) {
        float f3;
        float f4;
        float f5;
        if (this.a.m == null || bitmap == null) {
            return;
        }
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        int iRound3 = this.a.g == DEFAULT_VALUE_FLOAT ? Math.round(bitmap2.getWidth()) : Math.round(Math.min(this.a.g, bitmap2.getWidth()));
        int iRound4 = this.a.h == DEFAULT_VALUE_FLOAT ? Math.round(bitmap2.getHeight()) : Math.round(Math.min(this.a.h, bitmap2.getHeight()));
        Matrix matrix = new Matrix();
        matrix.reset();
        if (iRound <= 0 || iRound2 <= 0 || ImageView.ScaleType.FIT_XY == this.a.m) {
            this.a.g = iRound3;
            this.a.h = iRound4;
            return;
        }
        bitmap.setWidth(Math.min(bitmap.getWidth(), iRound));
        bitmap.setHeight(Math.min(bitmap.getHeight(), iRound2));
        if (ImageView.ScaleType.CENTER == this.a.m) {
            matrix.postTranslate(Math.round((iRound3 - iRound) * 0.5f), Math.round((iRound4 - iRound2) * 0.5f));
        } else if (ImageView.ScaleType.CENTER_CROP == this.a.m) {
            if (iRound * iRound4 > iRound3 * iRound2) {
                f5 = iRound4 / iRound2;
                f3 = (iRound3 - (iRound * f5)) * 0.5f;
                f4 = 0.0f;
            } else {
                float f6 = iRound3 / iRound;
                float f7 = (iRound4 - (iRound2 * f6)) * 0.5f;
                f3 = 0.0f;
                f4 = f7;
                f5 = f6;
            }
            matrix.setScale(f5, f5);
            matrix.postTranslate(Math.round(f3), Math.round(f4));
        } else if (ImageView.ScaleType.CENTER_INSIDE == this.a.m) {
            float fMin = (iRound > iRound3 || iRound2 > iRound4) ? Math.min(iRound3 / iRound, iRound4 / iRound2) : 1.0f;
            float fRound = Math.round((iRound3 - (iRound * fMin)) * 0.5f);
            float fRound2 = Math.round((iRound4 - (iRound2 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate(fRound, fRound2);
        }
        if (this.a.g == DEFAULT_VALUE_FLOAT || this.a.h == DEFAULT_VALUE_FLOAT) {
            canvas.drawBitmap(bitmap, matrix, null);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(new RectF(0.0f, 0.0f, this.a.g, this.a.h));
        canvas.drawBitmap(bitmap, matrix, null);
        canvas.restoreToCount(iSave);
    }

    public final void f(Canvas canvas, Bitmap bitmap, Bitmap bitmap2, float f, float f2) {
        if (bitmap == null) {
            return;
        }
        if (this.a.f) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return;
        }
        if (this.a.g == DEFAULT_VALUE_FLOAT) {
            this.a.g = bitmap2.getWidth();
        }
        if (this.a.h == DEFAULT_VALUE_FLOAT) {
            float f3 = this.a.g / f;
            if (f3 < 1.0f) {
                f3 = 1.0f;
            }
            this.a.h = f3 * f2;
        }
        canvas.drawBitmap(bitmap, (Rect) null, new RectF(0.0f, 0.0f, this.a.g, this.a.h), (Paint) null);
    }

    public final void g(Canvas canvas, Bitmap bitmap) {
        if (!c()) {
            a7b.b("ShareBgProcessor", "drawDrawableForeGround resource or bgPic or srcBitmap == null");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        for (b bVar : this.a.k) {
            Drawable drawable = bVar.a;
            Bitmap bitmapCopy = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap().copy(Bitmap.Config.ARGB_8888, true) : null;
            if (bitmapCopy != null) {
                if (bVar.g == DEFAULT_VALUE_INT || bVar.f == DEFAULT_VALUE_INT) {
                    bVar.g = bitmapCopy.getHeight();
                    bVar.f = bitmapCopy.getWidth();
                }
                int i = bVar.b == 0 ? (width - bVar.f14711c) - bVar.f : bVar.b;
                int i2 = bVar.d == 0 ? (height - bVar.f14712e) - bVar.g : bVar.f14711c;
                canvas.drawBitmap(bitmapCopy, (Rect) null, new RectF(i, i2, i + bVar.f, i2 + bVar.g), (Paint) null);
            }
        }
    }

    public final void h(Canvas canvas, Bitmap bitmap, List<Bitmap> list) {
        if (lza.a(list)) {
            return;
        }
        Iterator<Bitmap> it = list.iterator();
        while (it.hasNext()) {
            canvas.drawBitmap(it.next(), 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void i(Canvas canvas, Bitmap bitmap, List<Drawable> list) {
        if (lza.a(list)) {
            return;
        }
        Bitmap bitmapCopy = null;
        for (Drawable drawable : list) {
            if (drawable instanceof BitmapDrawable) {
                bitmapCopy = ((BitmapDrawable) drawable).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
            } else if (drawable instanceof GradientDrawable) {
                drawable.draw(canvas);
            } else if (drawable instanceof ColorDrawable) {
                drawable.draw(canvas);
            } else {
                a7b.b("ShareBgProcessor", "builder.drawBgDrawable convert error!!!");
            }
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            if (this.a.m != null) {
                e(canvas, bitmapCopy, bitmap, intrinsicWidth, intrinsicHeight);
            } else {
                f(canvas, bitmapCopy, bitmap, intrinsicWidth, intrinsicHeight);
            }
        }
    }

    public Bitmap j() {
        Bitmap bitmap = this.a.a;
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        if (this.a.d != DEFAULT_VALUE_INT) {
            canvas.drawColor(this.a.d);
        }
        d(canvas, bitmapCopy);
        canvas.drawBitmap(this.a.a, 0.0f, 0.0f, (Paint) null);
        g(canvas, bitmapCopy);
        return bitmapCopy;
    }

    public nzg(a aVar) {
        this.a = aVar;
    }
}
