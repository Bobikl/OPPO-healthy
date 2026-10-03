package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class pgb {
    public static final float[] x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    public final int a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15359c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15360e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15361j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15362l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Typeface f15363n;
    public final Typeface o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final Typeface t;
    public final float[] u;
    public final int v;
    public final int w;

    public static class a {
        public int a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15364c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15365e;
        public int f;
        public int g;
        public int h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15366j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15367l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Typeface f15368n;
        public Typeface o;
        public int p;
        public int q;
        public int s;
        public Typeface t;
        public float[] u;
        public int v;
        public boolean b = true;
        public int r = -1;
        public int w = -1;

        @NonNull
        public a A(@Px int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public a B(@Px int i) {
            this.m = i;
            return this;
        }

        @NonNull
        public a C(@Px int i) {
            this.r = i;
            return this;
        }

        @NonNull
        public a D(@NonNull Typeface typeface) {
            this.t = typeface;
            return this;
        }

        @NonNull
        public a E(@Px int i) {
            this.w = i;
            return this;
        }

        @NonNull
        public a x(@Px int i) {
            this.f15364c = i;
            return this;
        }

        @NonNull
        public a y(@Px int i) {
            this.d = i;
            return this;
        }

        @NonNull
        public pgb z() {
            return new pgb(this);
        }
    }

    public pgb(@NonNull a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.f15359c = aVar.f15364c;
        this.d = aVar.d;
        this.f15360e = aVar.f15365e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.f15361j = aVar.f15366j;
        this.k = aVar.k;
        this.f15362l = aVar.f15367l;
        this.m = aVar.m;
        this.f15363n = aVar.f15368n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    @NonNull
    public static a j(@NonNull Context context) {
        bt5 bt5VarA = bt5.a(context);
        return new a().B(bt5VarA.b(8)).x(bt5VarA.b(24)).y(bt5VarA.b(4)).A(bt5VarA.b(1)).C(bt5VarA.b(1)).E(bt5VarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f15360e;
        if (iA == 0) {
            iA = kl3.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i = this.f15361j;
        if (i == 0) {
            i = this.i;
        }
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.o;
        if (typeface == null) {
            typeface = this.f15363n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.q;
            if (i2 <= 0) {
                i2 = this.p;
            }
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.q;
        if (i3 <= 0) {
            i3 = this.p;
        }
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i = this.i;
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.f15363n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.p;
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.p;
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.s;
        if (iA == 0) {
            iA = kl3.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i = this.r;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void e(@NonNull Paint paint, @IntRange(from = 1, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i) {
        Typeface typeface = this.t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.u;
        if (fArr == null) {
            fArr = x;
        }
        if (fArr == null || fArr.length < i) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i - 1]);
    }

    public void f(@NonNull Paint paint) {
        paint.setUnderlineText(this.b);
        int i = this.a;
        if (i != 0) {
            paint.setColor(i);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    public void g(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i = this.a;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void h(@NonNull Paint paint) {
        int color = this.f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i = this.g;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void i(@NonNull Paint paint) {
        int iA = this.v;
        if (iA == 0) {
            iA = kl3.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i = this.w;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public int k() {
        return this.f15359c;
    }

    public int l() {
        int i = this.d;
        return i == 0 ? (int) ((this.f15359c * 0.25f) + 0.5f) : i;
    }

    public int m(int i) {
        int iMin = Math.min(this.f15359c, i) / 2;
        int i2 = this.h;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    public int n(@NonNull Paint paint) {
        int i = this.k;
        return i != 0 ? i : kl3.a(paint.getColor(), 25);
    }

    public int o(@NonNull Paint paint) {
        int i = this.f15362l;
        if (i == 0) {
            i = this.k;
        }
        return i != 0 ? i : kl3.a(paint.getColor(), 25);
    }

    public int p() {
        return this.m;
    }
}
