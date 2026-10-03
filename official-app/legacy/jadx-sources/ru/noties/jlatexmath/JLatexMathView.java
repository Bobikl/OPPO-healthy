package ru.noties.jlatexmath;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.lk3;
import com.oplus.aiunit.vision.pha;
import ru.noties.jlatexmath.android.R$styleable;

/* JADX INFO: loaded from: classes11.dex */
public class JLatexMathView extends View {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_END = 2;
    public static final int ALIGN_START = 0;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20836j;
    public Drawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20837l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f20838n;
    public float o;
    public float p;
    public float q;

    public JLatexMathView(Context context) {
        super(context);
        d(context, null);
    }

    public static float b(int i, float f) {
        if (i == 0) {
            return 0.0f;
        }
        return 1 == i ? f / 2.0f : f;
    }

    @NonNull
    public JLatexMathView a(int i, int i2) {
        this.f20837l = i;
        this.m = i2;
        return this;
    }

    @NonNull
    public JLatexMathView c(@Nullable Drawable drawable) {
        this.k = drawable;
        return this;
    }

    public final void d(Context context, @Nullable AttributeSet attributeSet) {
        Drawable colorDrawable;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.JLatexMathView);
        try {
            int i = R$styleable.JLatexMathView_jlmv_background;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i, 0);
            if (resourceId != 0) {
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                if (ResourcesUtil.ResourceType.DRAWABLE.equals(resourceTypeName)) {
                    colorDrawable = typedArrayObtainStyledAttributes.getDrawable(i);
                } else {
                    if (!"color".equals(resourceTypeName)) {
                        throw new IllegalStateException(String.format("Unexpected background reference: %s is of type: %s. Supported: drawable, color", context.getResources().getResourceName(resourceId), resourceTypeName));
                    }
                    colorDrawable = new ColorDrawable(typedArrayObtainStyledAttributes.getColor(i, 0));
                }
            } else {
                colorDrawable = null;
            }
            f(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.JLatexMathView_jlmv_textSize, 0)).e(typedArrayObtainStyledAttributes.getColor(R$styleable.JLatexMathView_jlmv_textColor, lk3.black.b())).c(colorDrawable).a(typedArrayObtainStyledAttributes.getInteger(R$styleable.JLatexMathView_jlmv_alignVertical, 0), typedArrayObtainStyledAttributes.getInteger(R$styleable.JLatexMathView_jlmv_alignHorizontal, 0));
            typedArrayObtainStyledAttributes.recycle();
            if (isInEditMode()) {
                pha.c(context);
                setLatex((((((((("\\begin{array}{l}\\forall\\varepsilon\\in\\mathbb{R}_+^*\\ \\exists\\eta>0\\ |x-x_0|\\leq\\eta\\Longrightarrow|f(x)-f(x_0)|\\leq\\varepsilon\\\\") + "\\det\\begin{bmatrix}a_{11}&a_{12}&\\cdots&a_{1n}\\\\a_{21}&\\ddots&&\\vdots\\\\\\vdots&&\\ddots&\\vdots\\\\a_{n1}&\\cdots&\\cdots&a_{nn}\\end{bmatrix}\\overset{\\mathrm{def}}{=}\\sum_{\\sigma\\in\\mathfrak{S}_n}\\varepsilon(\\sigma)\\prod_{k=1}^n a_{k\\sigma(k)}\\\\") + "\\sideset{_\\alpha^\\beta}{_\\gamma^\\delta}{\\begin{pmatrix}a&b\\\\c&d\\end{pmatrix}}\\\\") + "\\int_0^\\infty{x^{2n} e^{-a x^2}\\,dx} = \\frac{2n-1}{2a} \\int_0^\\infty{x^{2(n-1)} e^{-a x^2}\\,dx} = \\frac{(2n-1)!!}{2^{n+1}} \\sqrt{\\frac{\\pi}{a^{2n+1}}}\\\\") + "\\int_a^b{f(x)\\,dx} = (b - a) \\sum\\limits_{n = 1}^\\infty  {\\sum\\limits_{m = 1}^{2^n  - 1} {\\left( { - 1} \\right)^{m + 1} } } 2^{ - n} f(a + m\\left( {b - a} \\right)2^{-n} )\\\\") + "\\int_{-\\pi}^{\\pi} \\sin(\\alpha x) \\sin^n(\\beta x) dx = \\textstyle{\\left \\{ \\begin{array}{cc} (-1)^{(n+1)/2} (-1)^m \\frac{2 \\pi}{2^n} \\binom{n}{m} & n \\mbox{ odd},\\ \\alpha = \\beta (2m-n) \\\\ 0 & \\mbox{otherwise} \\\\ \\end{array} \\right .}\\\\") + "L = \\int_a^b \\sqrt{ \\left|\\sum_{i,j=1}^ng_{ij}(\\gamma(t))\\left(\\frac{d}{dt}x^i\\circ\\gamma(t)\\right)\\left(\\frac{d}{dt}x^j\\circ\\gamma(t)\\right)\\right|}\\,dt\\\\") + "\\begin{array}{rl} s &= \\int_a^b\\left\\|\\frac{d}{dt}\\vec{r}\\,(u(t),v(t))\\right\\|\\,dt \\\\ &= \\int_a^b \\sqrt{u'(t)^2\\,\\vec{r}_u\\cdot\\vec{r}_u + 2u'(t)v'(t)\\, \\vec{r}_u\\cdot\\vec{r}_v+ v'(t)^2\\,\\vec{r}_v\\cdot\\vec{r}_v}\\,\\,\\, dt. \\end{array}\\\\") + "\\end{array}");
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @NonNull
    public JLatexMathView e(@Px int i) {
        this.f20836j = i;
        return this;
    }

    @NonNull
    public JLatexMathView f(@Px int i) {
        this.i = i;
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f20838n == null) {
            return;
        }
        int iSave = canvas.save();
        try {
            float f = this.p;
            if (f > 0.0f) {
                canvas.translate(f, 0.0f);
            }
            float f2 = this.q;
            if (f2 > 0.0f) {
                canvas.translate(0.0f, f2);
            }
            float f3 = this.o;
            if (f3 > 0.0f && Float.compare(f3, 1.0f) != 0) {
                float f4 = this.o;
                canvas.scale(f4, f4);
            }
            this.f20838n.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f20838n == null) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int intrinsicWidth = this.f20838n.getIntrinsicWidth();
        int intrinsicHeight = this.f20838n.getIntrinsicHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (1073741824 != mode) {
            int paddingRight = intrinsicWidth + paddingLeft + getPaddingRight();
            size = size > 0 ? Math.min(size, paddingRight) : paddingRight;
        }
        if (1073741824 != mode2) {
            int paddingBottom = intrinsicHeight + paddingTop + getPaddingBottom();
            size2 = size2 > 0 ? Math.min(size2, paddingBottom) : paddingBottom;
        }
        int paddingRight2 = (size - paddingLeft) - getPaddingRight();
        int paddingBottom2 = (size2 - paddingTop) - getPaddingBottom();
        float fMin = (intrinsicWidth >= paddingRight2 || intrinsicHeight >= paddingBottom2) ? Math.min(paddingRight2 / intrinsicWidth, paddingBottom2 / intrinsicHeight) : 1.0f;
        int i3 = (int) ((intrinsicWidth * fMin) + 0.5f);
        int i4 = (int) ((intrinsicHeight * fMin) + 0.5f);
        if (1073741824 != mode) {
            size = i3 + paddingLeft + getPaddingRight();
        }
        if (1073741824 != mode2) {
            size2 = i4 + paddingTop + getPaddingBottom();
        }
        float fB = b(this.m, ((size - paddingLeft) - getPaddingRight()) - i3);
        float fB2 = b(this.f20837l, ((size2 - paddingTop) - getPaddingBottom()) - i4);
        this.o = fMin;
        this.p = paddingLeft + fB;
        this.q = paddingTop + fB2;
        setMeasuredDimension(size, size2);
    }

    public void setLatex(@NonNull String str) {
        setLatexDrawable(a.a(str).l(this.i).j(this.f20836j).h(this.k).k(false).i());
    }

    public void setLatexDrawable(@NonNull a aVar) {
        this.f20838n = aVar;
        requestLayout();
    }

    public JLatexMathView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }
}
