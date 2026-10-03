package com.coui.appcompat.edittext;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.core.view.GravityCompat;
import com.oplus.aiunit.vision.gg2;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class a extends GradientDrawable {
    public final Paint a = new Paint(1);
    public final RectF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1722c;

    /* JADX INFO: renamed from: com.coui.appcompat.edittext.a$a, reason: collision with other inner class name */
    public static final class C0200a {
        public static final int DEFAULT_HINT_LINES = 1;
        public static final boolean L = false;
        public static final Paint M = null;
        public static final int MAX_HINT_LINES = 3;
        public Paint A;
        public float B;
        public float C;
        public float D;
        public float E;
        public int[] F;
        public boolean G;
        public Interpolator H;
        public Interpolator I;
        public float J;
        public final View a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f1723c;
        public final RectF d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextPaint f1724e;
        public final TextPaint f;
        public boolean g;
        public float h;
        public ColorStateList m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ColorStateList f1727n;
        public float o;
        public float p;
        public float q;
        public float r;
        public float s;
        public float t;
        public CharSequence u;
        public CharSequence v;
        public boolean x;
        public boolean y;
        public Bitmap z;
        public int i = 16;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1725j = 16;
        public float k = 30.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1726l = 30.0f;
        public ArrayList<CharSequence> w = new ArrayList<>();
        public int K = 1;

        public C0200a(View view) {
            this.a = view;
            TextPaint textPaint = new TextPaint(129);
            this.f1724e = textPaint;
            this.f = new TextPaint(textPaint);
            this.f1723c = new Rect();
            this.b = new Rect();
            this.d = new RectF();
        }

        public static boolean D(float f, float f2) {
            return Math.abs(f - f2) < 0.001f;
        }

        public static float G(float f, float f2, float f3) {
            return f + (f3 * (f2 - f));
        }

        public static float H(float f, float f2, float f3, Interpolator interpolator) {
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f3);
            }
            return G(f, f2, f3);
        }

        public static boolean K(Rect rect, int i, int i2, int i3, int i4) {
            return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
        }

        public static int a(int i, int i2, float f) {
            float f2 = 1.0f - f;
            return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
        }

        public final TextDirectionHeuristic A() {
            return E() ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }

        public final void B(TextPaint textPaint) {
            textPaint.setTextSize(this.f1726l);
        }

        public final void C(float f) {
            this.d.left = H(this.b.left, this.f1723c.left, f, this.H);
            this.d.top = H(this.o, this.p, f, this.H);
            this.d.right = H(this.b.right, this.f1723c.right, f, this.H);
            this.d.bottom = H(this.b.bottom, this.f1723c.bottom, f, this.H);
        }

        public final boolean E() {
            return this.a.getLayoutDirection() == 1;
        }

        public final boolean F() {
            ColorStateList colorStateList;
            ColorStateList colorStateList2 = this.f1727n;
            return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.m) != null && colorStateList.isStateful());
        }

        public final void I() {
            this.g = this.f1723c.width() > 0 && this.f1723c.height() > 0 && this.b.width() > 0 && this.b.height() > 0;
        }

        public void J() {
            if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
                return;
            }
            b();
            d();
        }

        public void L(int i, int i2, int i3, int i4) {
            if (K(this.f1723c, i, i2, i3, i4)) {
                return;
            }
            this.f1723c.set(i, i2, i3, i4);
            this.G = true;
            I();
            Log.d("COUICollapseTextHelper", "setCollapsedBounds: " + this.f1723c);
        }

        public void M(int i, ColorStateList colorStateList) {
            this.f1727n = colorStateList;
            this.f1726l = i;
            J();
        }

        public void N(ColorStateList colorStateList) {
            if (this.f1727n != colorStateList) {
                this.f1727n = colorStateList;
                J();
            }
        }

        public void O(int i) {
            if (this.f1725j != i) {
                this.f1725j = i;
                J();
            }
        }

        public void P(int i, int i2, int i3, int i4) {
            if (K(this.b, i, i2, i3, i4)) {
                return;
            }
            this.b.set(i, i2, i3, i4);
            this.G = true;
            I();
            Log.d("COUICollapseTextHelper", "setExpandedBounds: " + this.b);
        }

        public void Q(ColorStateList colorStateList) {
            if (this.m != colorStateList) {
                this.m = colorStateList;
                J();
            }
        }

        public void R(int i) {
            if (this.i != i) {
                this.i = i;
                J();
            }
        }

        public void S(float f) {
            if (this.k != f) {
                this.k = f;
                J();
            }
        }

        public void T(float f) {
            float fJ = j(f, 0.0f, 1.0f);
            if (fJ != this.h) {
                this.h = fJ;
                d();
            }
        }

        public void U(int i) {
            this.K = Math.min(3, Math.max(1, i));
        }

        public void V(float f) {
            if (f > 0.0f) {
                this.J = f;
            }
        }

        public final void W(float f) {
            h(f);
            boolean z = L && this.D != 1.0f;
            this.y = z;
            if (z) {
                l();
            }
            this.a.postInvalidate();
        }

        public void X(Interpolator interpolator) {
            this.H = interpolator;
            J();
        }

        public final boolean Y(int[] iArr) {
            this.F = iArr;
            if (!F()) {
                return false;
            }
            J();
            return true;
        }

        public void Z(CharSequence charSequence) {
            if (charSequence == null || !charSequence.equals(this.u)) {
                this.u = charSequence;
                this.v = null;
                this.w.clear();
                i();
                J();
            }
        }

        public void a0(Interpolator interpolator) {
            this.I = interpolator;
            J();
        }

        public final void b() {
            int i;
            float f = this.E;
            h(this.f1726l);
            float fG = g();
            int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f1725j, this.x ? 1 : 0);
            if (this.K <= 1) {
                int i2 = absoluteGravity & 112;
                if (i2 != 48) {
                    if (i2 != 80) {
                        this.p = this.f1723c.centerY() + (((this.f1724e.descent() - this.f1724e.ascent()) / 2.0f) - this.f1724e.descent());
                    } else {
                        this.p = this.f1723c.bottom;
                    }
                } else if (Locale.getDefault().getLanguage().equals("my")) {
                    this.p = this.f1723c.top - (this.f1724e.ascent() * 1.3f);
                } else {
                    this.p = this.f1723c.top - this.f1724e.ascent();
                }
            } else if (Locale.getDefault().getLanguage().equals("my")) {
                this.p = this.f1723c.top - (this.f1724e.ascent() * 1.3f);
            } else {
                this.p = this.f1723c.top - this.f1724e.ascent();
            }
            int i3 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i3 == 1) {
                this.r = this.f1723c.centerX() - (fG / 2.0f);
            } else if (i3 != 5) {
                this.r = this.f1723c.left;
            } else {
                this.r = this.f1723c.right - fG;
            }
            h(this.k);
            float fG2 = g();
            int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.i, this.x ? 1 : 0);
            if (this.K > 1 || (i = absoluteGravity2 & 112) == 48) {
                this.o = this.b.top - this.f1724e.ascent();
            } else if (i != 80) {
                this.o = this.b.centerY() + (((this.f1724e.getFontMetrics().bottom - this.f1724e.getFontMetrics().top) / 2.0f) - this.f1724e.getFontMetrics().bottom);
            } else {
                this.o = this.b.bottom;
            }
            int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i4 == 1) {
                this.q = this.b.centerX() - (fG2 / 2.0f);
            } else if (i4 != 5) {
                this.q = this.b.left;
            } else {
                this.q = this.b.right - fG2;
            }
            i();
            W(f);
        }

        public void b0(Typeface typeface) {
            gg2.a(this.f1724e, true);
            gg2.a(this.f, true);
            J();
        }

        public float c() {
            if (this.u == null) {
                return 0.0f;
            }
            B(this.f);
            TextPaint textPaint = this.f;
            CharSequence charSequence = this.u;
            return textPaint.measureText(charSequence, 0, charSequence.length());
        }

        public final void d() {
            f(this.h);
        }

        public final boolean e(CharSequence charSequence) {
            return E();
        }

        public final void f(float f) {
            C(f);
            this.s = H(this.q, this.r, f, this.H);
            this.t = H(this.o, this.p, f, this.H);
            W(H(this.k, this.f1726l, f, this.I));
            if (this.f1727n != this.m) {
                this.f1724e.setColor(a(s(), r(), f));
            } else {
                this.f1724e.setColor(r());
            }
            this.a.postInvalidate();
        }

        public final float g() {
            CharSequence charSequence = this.v;
            float fMeasureText = charSequence != null ? this.f1724e.measureText(charSequence, 0, charSequence.length()) : 0.0f;
            return (this.K <= 1 || this.v == null || this.w.isEmpty()) ? fMeasureText : Math.max(this.f1724e.measureText(this.w.get(0).toString()), fMeasureText);
        }

        public final void h(float f) {
            float f2;
            boolean z;
            if (this.u == null) {
                return;
            }
            float fWidth = this.f1723c.width();
            float fWidth2 = this.b.width();
            if (D(f, this.f1726l)) {
                f2 = this.f1726l;
                this.D = 1.0f;
            } else {
                float f3 = this.k;
                if (D(f, f3)) {
                    this.D = 1.0f;
                } else {
                    this.D = f / this.k;
                }
                float f4 = this.f1726l / this.k;
                fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
                f2 = f3;
            }
            if (fWidth > 0.0f) {
                z = this.E != f2 || this.G;
                this.E = f2;
                this.G = false;
            } else {
                z = false;
            }
            if (this.v == null || z) {
                this.f1724e.setTextSize(this.E);
                this.f1724e.setLinearText(this.D != 1.0f);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.u, this.f1724e, fWidth - this.J, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(charSequenceEllipsize, this.v)) {
                    this.v = charSequenceEllipsize;
                }
            }
            this.x = E();
        }

        public final void i() {
            Bitmap bitmap = this.z;
            if (bitmap != null) {
                bitmap.recycle();
                this.z = null;
            }
        }

        public final float j(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }

        public void k(Canvas canvas) {
            float fAscent;
            int iSave = canvas.save();
            float lineSpacingExtra = 0.0f;
            if (this.v == null || !this.g) {
                canvas.drawText(" ", 0.0f, 0.0f, this.f1724e);
            } else {
                float f = this.s;
                float f2 = this.t;
                boolean z = this.y && this.z != null;
                if (z) {
                    fAscent = this.B * this.D;
                } else {
                    fAscent = this.f1724e.ascent() * this.D;
                    this.f1724e.descent();
                }
                if (z) {
                    f2 += fAscent;
                }
                float f3 = this.D;
                float lineSpacingMultiplier = 1.0f;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (z) {
                    canvas.drawBitmap(this.z, f, f2, this.A);
                } else {
                    View view = this.a;
                    if (view instanceof EditText) {
                        EditText editText = (EditText) view;
                        lineSpacingExtra = editText.getLineSpacingExtra();
                        lineSpacingMultiplier = editText.getLineSpacingMultiplier();
                    }
                    CharSequence charSequence = this.K > 1 ? this.u : this.v;
                    StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1724e, (int) this.d.width()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setEllipsize(TextUtils.TruncateAt.END).setTextDirection(A()).setMaxLines(this.K).setLineSpacing(lineSpacingExtra, lineSpacingMultiplier).build();
                    if (staticLayoutBuild != null) {
                        canvas.save();
                        canvas.translate(this.x ? this.d.left - this.J : this.d.left + this.J, f2 - staticLayoutBuild.getLineBaseline(0));
                        staticLayoutBuild.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            canvas.restoreToCount(iSave);
        }

        public final void l() {
            if (this.z != null || this.b.isEmpty() || TextUtils.isEmpty(this.v)) {
                return;
            }
            f(0.0f);
            this.B = this.f1724e.ascent();
            this.C = this.f1724e.descent();
            TextPaint textPaint = this.f1724e;
            CharSequence charSequence = this.v;
            int iRound = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int iRound2 = Math.round(this.C - this.B);
            if (iRound <= 0 || iRound2 <= 0) {
                return;
            }
            this.z = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.z);
            CharSequence charSequence2 = this.v;
            canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, iRound2 - this.f1724e.descent(), this.f1724e);
            if (this.A == null) {
                this.A = new Paint(3);
            }
        }

        public Rect m() {
            return this.f1723c;
        }

        public void n(RectF rectF) {
            boolean zE = e(this.u);
            float fC = !zE ? this.f1723c.left : this.f1723c.right - c();
            rectF.left = fC;
            Rect rect = this.f1723c;
            rectF.top = rect.top;
            rectF.right = !zE ? fC + c() : rect.right;
            rectF.bottom = this.f1723c.top + q();
        }

        public ColorStateList o() {
            return this.f1727n;
        }

        public int p() {
            return this.f1725j;
        }

        public float q() {
            B(this.f);
            return Locale.getDefault().getLanguage().equals("my") ? (-this.f.ascent()) * 1.3f : -this.f.ascent();
        }

        public int r() {
            ColorStateList colorStateList = this.f1727n;
            if (colorStateList == null) {
                return 0;
            }
            int[] iArr = this.F;
            return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
        }

        public final int s() {
            int[] iArr = this.F;
            return iArr != null ? this.m.getColorForState(iArr, 0) : this.m.getDefaultColor();
        }

        public Rect t() {
            return this.b;
        }

        public ColorStateList u() {
            return this.m;
        }

        public int v() {
            return this.i;
        }

        public float w() {
            return this.k;
        }

        public float x() {
            return this.h;
        }

        public float y() {
            B(this.f);
            float fDescent = this.f.descent() - this.f.ascent();
            return Locale.getDefault().getLanguage().equals("my") ? fDescent * 1.3f : fDescent;
        }

        public CharSequence z() {
            return this.u;
        }
    }

    public a() {
        i();
        this.b = new RectF();
    }

    public RectF a() {
        return this.b;
    }

    public boolean b() {
        return !this.b.isEmpty();
    }

    public final void c(Canvas canvas) {
        if (j(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f1722c);
    }

    public final void d(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (j(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            f(canvas);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        d(canvas);
        super.draw(canvas);
        canvas.drawRect(this.b, this.a);
        c(canvas);
    }

    public void e() {
        g(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void f(Canvas canvas) {
        this.f1722c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    public void g(float f, float f2, float f3, float f4) {
        RectF rectF = this.b;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void h(RectF rectF) {
        g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void i() {
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setColor(-1);
        this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean j(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
