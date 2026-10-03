package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class xmj extends ReplacementSpan {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    public final bnj i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<d> f18681j;
    public final List<Layout> k;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f18683n;
    public int q;
    public int r;
    public e s;
    public final Rect o = new Rect();
    public final Paint p = new Paint(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextPaint f18682l = new TextPaint();

    public class a implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f18684j;
        public final /* synthetic */ d k;

        public a(int i, int i2, d dVar) {
            this.i = i;
            this.f18684j = i2;
            this.k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = xmj.this.s;
            if (eVar != null) {
                xmj.this.k.remove(this.i);
                xmj.this.g(this.i, this.f18684j, this.k);
                eVar.invalidate();
            }
        }
    }

    public class b extends c {
        public final /* synthetic */ Runnable i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(null);
            this.i = runnable;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.i.run();
        }
    }

    public static abstract class c implements Drawable.Callback {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        }
    }

    public static class d {
        public final int a;
        public final CharSequence b;

        public d(int i, CharSequence charSequence) {
            this.a = i;
            this.b = charSequence;
        }

        @NonNull
        public String toString() {
            return "Cell{alignment=" + this.a + ", text=" + ((Object) this.b) + '}';
        }
    }

    public interface e {
        void invalidate();
    }

    public xmj(@NonNull bnj bnjVar, @NonNull List<d> list, boolean z, boolean z2) {
        this.i = bnjVar;
        this.f18681j = list;
        this.k = new ArrayList(list.size());
        this.m = z;
        this.f18683n = z2;
    }

    @SuppressLint({"SwitchIntDef"})
    public static Layout.Alignment d(int i) {
        if (i != 1) {
            return i != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        boolean z;
        e eVar;
        boolean z2;
        float f2 = f;
        int iA = h5i.a(canvas, charSequence);
        if (i(iA)) {
            this.q = iA;
            if (paint instanceof TextPaint) {
                this.f18682l.set((TextPaint) paint);
            } else {
                this.f18682l.set(paint);
            }
            h();
        }
        int iF = this.i.f();
        int size = this.k.size();
        int iE = e(size);
        int i6 = iE - (this.q / size);
        if (this.m) {
            this.i.c(this.p);
        } else if (this.f18683n) {
            this.i.d(this.p);
        } else {
            this.i.b(this.p);
        }
        if (this.p.getColor() != 0) {
            int iSave = canvas.save();
            try {
                this.o.set(0, 0, this.q, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(this.o, this.p);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        this.p.set(paint);
        this.i.a(this.p);
        int iE2 = this.i.e(this.p);
        boolean z3 = iE2 > 0;
        int i7 = i5 - i3;
        int i8 = (i7 - this.r) / 4;
        if (z3) {
            zmj[] zmjVarArr = (zmj[]) ((Spanned) charSequence).getSpans(i, i2, zmj.class);
            if (zmjVarArr == null || zmjVarArr.length <= 0 || !fva.b(i, charSequence, zmjVarArr[0])) {
                z2 = false;
            } else {
                this.o.set((int) f2, i3, this.q, i3 + iE2);
                canvas.drawRect(this.o, this.p);
                z2 = true;
            }
            this.o.set((int) f2, i5 - iE2, this.q, i5);
            canvas.drawRect(this.o, this.p);
            z = z2;
        } else {
            z = false;
        }
        int i9 = iE2 / 2;
        int i10 = z ? iE2 : 0;
        int i11 = i7 - iE2;
        int i12 = 0;
        int height = 0;
        while (i12 < size) {
            Layout layout = this.k.get(i12);
            int iSave2 = canvas.save();
            try {
                canvas.translate((i12 * iE) + f2, i3);
                if (z3) {
                    if (i12 == 0) {
                        this.o.set(0, i10, iE2, i11);
                    } else {
                        this.o.set(-i9, i10, i9, i11);
                    }
                    canvas.drawRect(this.o, this.p);
                    if (i12 == size - 1) {
                        this.o.set((iE - iE2) - i6, i10, iE - i6, i11);
                        canvas.drawRect(this.o, this.p);
                    }
                }
                int i13 = iF;
                canvas.translate(i13, i13 + i8);
                layout.draw(canvas);
                if (layout.getHeight() > height) {
                    height = layout.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i12++;
                f2 = f;
                iF = i13;
                i9 = i9;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        if (this.r == height || (eVar = this.s) == null) {
            return;
        }
        eVar.invalidate();
    }

    public int e(int i) {
        return (int) (((this.q * 1.0f) / i) + 0.5f);
    }

    public void f(@Nullable e eVar) {
        this.s = eVar;
    }

    public final void g(int i, int i2, @NonNull d dVar) {
        a aVar = new a(i, i2, dVar);
        CharSequence charSequence = dVar.b;
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(dVar.b);
        StaticLayout staticLayout = new StaticLayout(spannableString, this.f18682l, i2, d(dVar.a), 1.0f, 0.0f, false);
        ctj.a(spannableString, staticLayout);
        j(spannableString, aVar);
        this.k.add(i, staticLayout);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (this.k.size() > 0 && fontMetricsInt != null) {
            Iterator<Layout> it = this.k.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = it.next().getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.r = i3;
            int i4 = -(i3 + (this.i.f() * 2));
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.q;
    }

    public final void h() {
        this.f18682l.setFakeBoldText(this.m);
        int size = this.f18681j.size();
        int iE = e(size) - (this.i.f() * 2);
        this.k.clear();
        int size2 = this.f18681j.size();
        for (int i = 0; i < size2; i++) {
            g(i, iE, this.f18681j.get(i));
        }
    }

    public final boolean i(int i) {
        return this.q != i;
    }

    public final void j(@NonNull Spannable spannable, @NonNull Runnable runnable) {
        xi0[] xi0VarArr = (xi0[]) spannable.getSpans(0, spannable.length(), xi0.class);
        if (xi0VarArr == null || xi0VarArr.length <= 0) {
            return;
        }
        for (xi0 xi0Var : xi0VarArr) {
            ti0 ti0VarA = xi0Var.a();
            if (!ti0VarA.i()) {
                ti0VarA.l(new b(runnable));
            }
        }
    }
}
