package com.coui.appcompat.edittext;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.oplus.aiunit.vision.sh2;
import com.oplus.aiunit.vision.vi2;
import com.support.appcompat.R$dimen;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    public static final Rect v = new Rect();
    public final EditText a;
    public final com.coui.appcompat.edittext.a.C0200a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f1728c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1729e;
    public int f;
    public com.coui.appcompat.edittext.a g;
    public ColorStateList h;
    public ColorStateList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f1730j;
    public Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f1731l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<COUIEditText.h> f1732n;
    public boolean o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b.this.E(false, false, false);
            Editable text = b.this.a.getText();
            int length = text.length();
            b bVar = b.this;
            bVar.t = bVar.a.getPaint().measureText(text, 0, length);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (b.this.u <= 0.0f) {
                b bVar = b.this;
                bVar.u = bVar.a.getHeight();
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.coui.appcompat.edittext.b$b, reason: collision with other inner class name */
    public class C0201b implements ValueAnimator.AnimatorUpdateListener {
        public C0201b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (b.this.p) {
                b.this.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
            b.this.a.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (b.this.p) {
                b.this.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        }
    }

    public class e implements Animator.AnimatorListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.u = bVar.a.getHeight();
            }
        }

        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.F(true, true, true);
            b.this.y(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.a.setSelection(b.this.a.length());
            if (b.this.u <= 0.0f) {
                b.this.a.post(new a());
            }
        }
    }

    public static class f implements Interpolator {
        public static final float[] b = {0.0f, -1.0f, 0.5f, -0.5f, 0.0f};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f1733c;
        public static final float[] d;
        public final Interpolator a;

        static {
            int[] iArr = {83, 133, 117, 117};
            f1733c = iArr;
            d = new float[iArr.length + 1];
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = f1733c;
                if (i >= iArr2.length) {
                    return;
                }
                i2 += iArr2[i];
                i++;
                d[i] = i2 / 450.0f;
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = 1;
            while (true) {
                float[] fArr = d;
                if (i >= fArr.length) {
                    return 0.0f;
                }
                float f2 = fArr[i];
                if (f <= f2) {
                    int i2 = i - 1;
                    float f3 = fArr[i2];
                    float interpolation = this.a.getInterpolation((f - f3) / (f2 - f3));
                    float[] fArr2 = b;
                    return (fArr2[i2] * (1.0f - interpolation)) + (fArr2[i] * interpolation);
                }
                i++;
            }
        }

        public f() {
            this.a = new sh2();
        }
    }

    public b(@NonNull EditText editText, int i) {
        this.a = editText;
        com.coui.appcompat.edittext.a.C0200a c0200a = new com.coui.appcompat.edittext.a.C0200a(editText);
        this.b = c0200a;
        c0200a.U(i);
        c0200a.a0(new vi2());
        c0200a.X(new vi2());
        c0200a.O(8388659);
    }

    public void A(int i, ColorStateList colorStateList) {
        this.b.M(i, colorStateList);
    }

    public void B(int i) {
        this.f1729e = i;
    }

    public void C(boolean z) {
        D(z, true);
    }

    public final void D(boolean z, boolean z2) {
        E(z, z2, true);
    }

    public final void E(boolean z, boolean z2, boolean z3) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        z(z);
        if (z2) {
            G(z, z3);
        } else {
            H(z, z3);
        }
    }

    public final void F(boolean z, boolean z2, boolean z3) {
        this.o = false;
        if (!z) {
            this.a.setTextColor(this.f1728c);
            this.a.setHighlightColor(this.d);
            return;
        }
        if (z2) {
            this.a.setTextColor(this.f1728c);
        }
        this.a.setHighlightColor(r(0.3f));
        if (z3) {
            EditText editText = this.a;
            editText.setSelection(0, editText.getText().length());
        }
    }

    public final void G(boolean z, boolean z2) {
        if (!z) {
            l();
            F(false, false, z2);
            return;
        }
        l();
        this.a.setTextColor(0);
        this.a.setHighlightColor(0);
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.o = true;
        this.p = this.a.isFocused();
        this.f1731l.start();
    }

    public final void H(boolean z, boolean z2) {
        if (!z) {
            F(false, false, z2);
            return;
        }
        this.q = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        F(true, false, z2);
    }

    public void I(com.coui.appcompat.edittext.a.C0200a c0200a) {
        this.b.Z(c0200a.z());
    }

    public void J(ColorStateList colorStateList) {
        this.f1728c = colorStateList;
    }

    public void K(com.coui.appcompat.edittext.a.C0200a c0200a) {
        this.h = c0200a.o();
        this.i = c0200a.u();
        this.b.N(this.h);
        this.b.Q(this.i);
    }

    public void addOnErrorStateChangedListener(COUIEditText.h hVar) {
        if (this.f1732n == null) {
            this.f1732n = new ArrayList<>();
        }
        if (this.f1732n.contains(hVar)) {
            return;
        }
        this.f1732n.add(hVar);
    }

    public final void l() {
        if (this.f1731l.isStarted()) {
            this.f1731l.cancel();
        }
    }

    public void m(Canvas canvas, int i, int i2, int i3, Paint paint, Paint paint2) {
        this.f1730j.setColor(q(paint.getColor(), this.f1729e, this.q));
        float f2 = i;
        canvas.drawRect(0.0f, i - this.f, i2, f2, this.f1730j);
        this.f1730j.setColor(q(paint2.getColor(), this.f1729e, this.q));
        canvas.drawRect(0.0f, i - this.f, i3, f2, this.f1730j);
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable, int i) {
        this.g.setBounds(gradientDrawable.getBounds());
        if (gradientDrawable instanceof com.coui.appcompat.edittext.a) {
            this.g.h(((com.coui.appcompat.edittext.a) gradientDrawable).a());
        }
        this.g.setStroke(this.f, q(i, this.f1729e, this.q));
        this.g.draw(canvas);
    }

    public void o(int[] iArr) {
        this.b.Y(iArr);
    }

    public final Layout.Alignment p() {
        switch (this.a.getTextAlignment()) {
            case 1:
                int gravity = this.a.getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
                if (gravity == 1) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (gravity == 3) {
                    return v() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                }
                if (gravity == 5) {
                    return v() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
                if (gravity != 8388611 && gravity == 8388613) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
                return Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return Layout.Alignment.ALIGN_CENTER;
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            case 6:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    public final int q(int i, int i2, float f2) {
        if (f2 <= 0.0f) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i2;
        }
        float f3 = 1.0f - f2;
        int iAlpha = (int) ((Color.alpha(i) * f3) + (Color.alpha(i2) * f2));
        int iRed = (int) ((Color.red(i) * f3) + (Color.red(i2) * f2));
        int iGreen = (int) ((Color.green(i) * f3) + (Color.green(i2) * f2));
        int iBlue = (int) ((Color.blue(i) * f3) + (Color.blue(i2) * f2));
        if (iAlpha > 255) {
            iAlpha = 255;
        }
        if (iRed > 255) {
            iRed = 255;
        }
        if (iGreen > 255) {
            iGreen = 255;
        }
        if (iBlue > 255) {
            iBlue = 255;
        }
        return Color.argb(iAlpha, iRed, iGreen, iBlue);
    }

    public final int r(float f2) {
        return Color.argb((int) (f2 * 255.0f), Color.red(this.f1729e), Color.green(this.f1729e), Color.blue(this.f1729e));
    }

    public void removeOnErrorStateChangedListener(@Nullable COUIEditText.h hVar) {
        ArrayList<COUIEditText.h> arrayList = this.f1732n;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(hVar);
    }

    public void s(int i, int i2, int i3, float[] fArr, com.coui.appcompat.edittext.a.C0200a c0200a) {
        this.f1728c = this.a.getTextColors();
        this.d = this.a.getHighlightColor();
        this.f1729e = i;
        this.f = i2;
        if (i3 == 2) {
            this.b.b0(Typeface.create("sans-serif-medium", 0));
        }
        this.b.S(c0200a.w());
        this.b.O(c0200a.p());
        this.b.R(c0200a.v());
        com.coui.appcompat.edittext.a aVar = new com.coui.appcompat.edittext.a();
        this.g = aVar;
        aVar.setCornerRadii(fArr);
        this.f1730j = new Paint();
        this.k = new Paint();
        t();
        this.a.addTextChangedListener(new a());
        I(c0200a);
        K(c0200a);
    }

    public final void t() {
        float dimension = this.a.getResources().getDimension(R$dimen.coui_edit_text_shake_amplitude);
        sh2 sh2Var = new sh2();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(sh2Var);
        valueAnimatorOfFloat.setDuration(217L);
        valueAnimatorOfFloat.addUpdateListener(new C0201b());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, dimension);
        valueAnimatorOfFloat2.setInterpolator(new f(null));
        valueAnimatorOfFloat2.setDuration(450L);
        valueAnimatorOfFloat2.addUpdateListener(new c());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 0.3f);
        valueAnimatorOfFloat3.setInterpolator(sh2Var);
        valueAnimatorOfFloat3.setDuration(133L);
        valueAnimatorOfFloat3.setStartDelay(80L);
        valueAnimatorOfFloat3.addUpdateListener(new d());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1731l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        this.f1731l.addListener(new e());
    }

    public boolean u() {
        return this.m;
    }

    public final boolean v() {
        return this.a.getLayoutDirection() == 1;
    }

    public void w(Canvas canvas) {
        float f2;
        float f3;
        if (this.o && this.m) {
            int iSave = canvas.save();
            if (v()) {
                canvas.translate(-this.r, 0.0f);
            } else {
                canvas.translate(this.r, 0.0f);
            }
            int compoundPaddingStart = this.a.getCompoundPaddingStart();
            int compoundPaddingEnd = this.a.getCompoundPaddingEnd();
            int width = this.a.getWidth();
            int i = width - compoundPaddingEnd;
            int i2 = i - compoundPaddingStart;
            float x = i + this.a.getX() + this.a.getScrollX();
            float f4 = i2;
            float scrollX = (this.t - this.a.getScrollX()) - f4;
            EditText editText = this.a;
            Rect rect = v;
            editText.getLineBounds(0, rect);
            int iSave2 = canvas.save();
            if (v()) {
                canvas.translate(compoundPaddingEnd, rect.top);
            } else {
                canvas.translate(compoundPaddingStart, rect.top);
            }
            int iSave3 = canvas.save();
            if (this.a.getBottom() - this.a.getTop() == this.u && this.t > f4) {
                if (v()) {
                    canvas.clipRect(this.a.getScrollX() + i2, 0.0f, this.a.getScrollX(), this.u);
                } else {
                    canvas.translate(-scrollX, 0.0f);
                    canvas.clipRect(this.a.getScrollX(), 0.0f, x, this.u);
                }
            }
            Layout layout = this.a.getLayout();
            layout.getPaint().setColor(this.f1728c.getDefaultColor());
            layout.draw(canvas);
            canvas.restoreToCount(iSave3);
            canvas.restoreToCount(iSave2);
            Layout.Alignment alignmentP = p();
            this.k.setColor(r(this.s));
            if ((alignmentP != Layout.Alignment.ALIGN_NORMAL || v()) && (!(alignmentP == Layout.Alignment.ALIGN_OPPOSITE && v()) && (!(alignmentP == Layout.Alignment.ALIGN_NORMAL && v()) && (alignmentP != Layout.Alignment.ALIGN_OPPOSITE || v())))) {
                float f5 = ((compoundPaddingStart + width) - compoundPaddingEnd) / 2.0f;
                float f6 = this.t;
                float f7 = f5 - (f6 / 2.0f);
                f2 = f7;
                f3 = f7 + f6;
            } else {
                f2 = compoundPaddingStart;
                f3 = f2;
            }
            canvas.drawRect(f2, rect.top, f3, rect.bottom, this.k);
            canvas.restoreToCount(iSave);
        }
    }

    public void x(com.coui.appcompat.edittext.a.C0200a c0200a) {
        Rect rectT = c0200a.t();
        Rect rectM = c0200a.m();
        this.b.P(rectT.left, rectT.top, rectT.right, rectT.bottom);
        this.b.L(rectM.left, rectM.top, rectM.right, rectM.bottom);
        this.b.J();
    }

    public final void y(boolean z) {
        if (this.f1732n != null) {
            for (int i = 0; i < this.f1732n.size(); i++) {
                this.f1732n.get(i).onErrorStateChangeAnimationEnd(z);
            }
        }
    }

    public final void z(boolean z) {
        if (this.f1732n != null) {
            for (int i = 0; i < this.f1732n.size(); i++) {
                this.f1732n.get(i).onErrorStateChanged(z);
            }
        }
    }
}
