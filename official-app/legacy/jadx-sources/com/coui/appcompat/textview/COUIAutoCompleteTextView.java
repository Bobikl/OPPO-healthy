package com.coui.appcompat.textview;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.core.view.ViewCompat;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.ti2;
import com.oplus.aiunit.vision.vi2;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$style;
import com.support.appcompat.R$styleable;
import com.support.textview.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class COUIAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public static final int MODE_BACKGROUND_LINE = 1;
    public static final int MODE_BACKGROUND_NONE = 0;
    public static final int MODE_BACKGROUND_RECT = 2;
    public ColorStateList A;
    public ColorStateList B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public ValueAnimator H;
    public ValueAnimator I;
    public ValueAnimator J;
    public boolean K;
    public boolean L;
    public Paint M;
    public Paint N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final com.coui.appcompat.edittext.a.C0200a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Interpolator f2131j;
    public Interpolator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2132l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f2133n;
    public boolean o;
    public GradientDrawable p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public float v;
    public int w;
    public int x;
    public int y;
    public RectF z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIAutoCompleteTextView.this.P = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            COUIAutoCompleteTextView.this.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIAutoCompleteTextView.this.O = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            COUIAutoCompleteTextView.this.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIAutoCompleteTextView.this.i.T(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public COUIAutoCompleteTextView(Context context) {
        this(context, null);
    }

    private int getBoundsTop() {
        int i = this.r;
        if (i == 1) {
            return this.R;
        }
        if (i != 2) {
            return 0;
        }
        return (int) (this.i.q() / 2.0f);
    }

    private Drawable getBoxBackground() {
        int i = this.r;
        if (i == 1 || i == 2) {
            return this.p;
        }
        return null;
    }

    private float[] getCornerRadiiAsArray() {
        float f = this.t;
        float f2 = this.s;
        float f3 = this.v;
        float f4 = this.u;
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    private int getModePaddingTop() {
        int iY;
        int iQ;
        int i = this.r;
        if (i == 1) {
            iY = this.R + ((int) this.i.y());
            iQ = this.S;
        } else {
            if (i != 2) {
                return 0;
            }
            iY = this.Q;
            iQ = (int) (this.i.q() / 2.0f);
        }
        return iY + iQ;
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2133n)) {
            return;
        }
        this.f2133n = charSequence;
        this.i.Z(charSequence);
        if (this.F) {
            return;
        }
        openCutout();
    }

    public final void animateToExpansionFraction(float f) {
        if (this.i.x() == f) {
            return;
        }
        if (this.H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.H = valueAnimator;
            valueAnimator.setInterpolator(this.f2131j);
            this.H.setDuration(200L);
            this.H.addUpdateListener(new c());
        }
        this.H.setFloatValues(this.i.x(), f);
        this.H.start();
    }

    public final void animateToHideBackground() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(this.k);
            this.J.setDuration(250L);
            this.J.addUpdateListener(new b());
        }
        this.J.setIntValues(255, 0);
        this.J.start();
        this.L = false;
    }

    public final void animateToShowBackground() {
        if (this.I == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I = valueAnimator;
            valueAnimator.setInterpolator(this.k);
            this.I.setDuration(250L);
            this.I.addUpdateListener(new a());
        }
        this.O = 255;
        this.I.setIntValues(0, getWidth());
        this.I.start();
        this.L = true;
    }

    public final void applyBoxAttributes() {
        int i;
        if (this.p == null) {
            return;
        }
        setBoxAttributes();
        int i2 = this.w;
        if (i2 > -1 && (i = this.y) != 0) {
            this.p.setStroke(i2, i);
        }
        this.p.setCornerRadii(getCornerRadiiAsArray());
        invalidate();
    }

    public final void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.q;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    public final void assignBoxBackgroundByMode() {
        int i = this.r;
        if (i == 0) {
            this.p = null;
            return;
        }
        if (i == 2 && this.m && !(this.p instanceof com.coui.appcompat.edittext.a)) {
            this.p = new com.coui.appcompat.edittext.a();
        } else if (this.p == null) {
            this.p = new GradientDrawable();
        }
    }

    public final int calculateCollapsedTextTopBounds() {
        int i = this.r;
        if (i != 1) {
            return i != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - calculateLabelMarginTop();
        }
        return getBoxBackground().getBounds().top;
    }

    public final int calculateLabelMarginTop() {
        return (int) (this.i.q() / 2.0f);
    }

    public final void closeCutout() {
        if (cutoutEnabled()) {
            ((com.coui.appcompat.edittext.a) this.p).e();
        }
    }

    public final void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H.cancel();
        }
        if (z && this.G) {
            animateToExpansionFraction(1.0f);
        } else {
            this.i.T(1.0f);
        }
        this.F = false;
        if (cutoutEnabled()) {
            openCutout();
        }
    }

    public final boolean cutoutEnabled() {
        return this.m && !TextUtils.isEmpty(this.f2133n) && (this.p instanceof com.coui.appcompat.edittext.a);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.m) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.i.k(canvas);
            if (this.p != null && this.r == 2) {
                if (getScrollX() != 0) {
                    updateTextInputBoxBounds();
                }
                this.p.draw(canvas);
            }
            if (this.r == 1) {
                float height = getHeight() - ((int) ((((double) this.x) / 2.0d) + 0.5d));
                canvas.drawLine(0.0f, height, getWidth(), height, this.N);
                this.M.setAlpha(this.O);
                canvas.drawLine(0.0f, height, this.P, height, this.M);
            }
            canvas.restoreToCount(iSave);
        }
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (!this.m) {
            super.drawableStateChanged();
            return;
        }
        if (this.K) {
            return;
        }
        this.K = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        updateLabelState(ViewCompat.isLaidOut(this) && isEnabled());
        updateLineModeBackground();
        updateTextInputBoxBounds();
        updateTextInputBoxState();
        com.coui.appcompat.edittext.a.C0200a c0200a = this.i;
        if (c0200a != null ? c0200a.Y(drawableState) | false : false) {
            invalidate();
        }
        this.K = false;
    }

    public final void expandHint(boolean z) {
        if (this.p != null) {
            Log.d("AutoCompleteTextView", "mBoxBackground: " + this.p.getBounds());
        }
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H.cancel();
        }
        if (z && this.G) {
            animateToExpansionFraction(0.0f);
        } else {
            this.i.T(0.0f);
        }
        if (cutoutEnabled() && ((com.coui.appcompat.edittext.a) this.p).b()) {
            closeCutout();
        }
        this.F = true;
    }

    public int getBoxStrokeColor() {
        return this.D;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        if (this.m) {
            return this.f2133n;
        }
        return null;
    }

    public final void initHintMode(Context context, AttributeSet attributeSet, int i) {
        this.i.a0(new vi2());
        this.i.X(new vi2());
        this.i.O(8388659);
        this.f2131j = new hj2();
        this.k = new ti2();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIEditText, i, R$style.Widget_COUI_EditText_HintAnim_Line);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_couiHintEnabled, false);
        this.m = z;
        if (!z) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        setBackgroundDrawable(null);
        setTopHint(typedArrayObtainStyledAttributes.getText(R$styleable.COUIEditText_android_hint));
        this.G = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_couiHintAnimationEnabled, true);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIEditText_rectModePaddingTop, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIEditText_cornerRadius, 0.0f);
        this.s = dimension;
        this.t = dimension;
        this.u = dimension;
        this.v = dimension;
        int i2 = R$styleable.COUIEditText_couiStrokeColor;
        this.D = typedArrayObtainStyledAttributes.getColor(i2, -16711936);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIEditText_couiStrokeWidth, 0);
        this.w = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.q = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_label_cutout_padding);
        this.R = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_line_padding_top);
        this.S = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_line_padding_middle);
        this.T = context.getResources().getDimensionPixelOffset(com.support.textview.R$dimen.coui_textview_rect_padding_middle);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIEditText_couiBackgroundMode, 0);
        setBoxBackgroundMode(i3);
        int i4 = R$styleable.COUIEditText_android_textColorHint;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i4);
            this.B = colorStateList;
            this.A = colorStateList;
        }
        this.C = context.getResources().getColor(R$color.coui_textview_stroke_color_default);
        this.E = context.getResources().getColor(com.support.appcompat.R$color.coui_textinput_stroke_color_disabled);
        setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIEditText_collapsedTextSize, 0), typedArrayObtainStyledAttributes.getColorStateList(i2));
        if (i3 == 2) {
            this.i.b0(Typeface.create("sans-serif-medium", 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.N = paint;
        paint.setColor(this.C);
        this.N.setStrokeWidth(this.w);
        Paint paint2 = new Paint();
        this.M = paint2;
        paint2.setColor(this.D);
        this.M.setStrokeWidth(this.w);
        setEditText();
    }

    public final boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    public final void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateTextInputBoxBounds();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.m) {
            if (this.p != null) {
                updateTextInputBoxBounds();
            }
            updateModePadding();
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int width = getWidth() - getCompoundPaddingRight();
            int iCalculateCollapsedTextTopBounds = calculateCollapsedTextTopBounds();
            this.i.P(compoundPaddingLeft, getCompoundPaddingTop(), width, getHeight() - getCompoundPaddingBottom());
            this.i.L(compoundPaddingLeft, iCalculateCollapsedTextTopBounds, width, getHeight() - getCompoundPaddingBottom());
            this.i.J();
            if (!cutoutEnabled() || this.F) {
                return;
            }
            openCutout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.z;
            this.i.n(rectF);
            applyCutoutPadding(rectF);
            ((com.coui.appcompat.edittext.a) this.p).h(rectF);
        }
    }

    public final void setBoxAttributes() {
        int i = this.r;
        if (i == 1) {
            this.w = 0;
        } else if (i == 2 && this.D == 0) {
            this.D = this.B.getColorForState(getDrawableState(), this.B.getDefaultColor());
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        onApplyBoxBackgroundMode();
    }

    public void setBoxStrokeColor(int i) {
        if (this.D != i) {
            this.D = i;
            updateTextInputBoxState();
        }
    }

    public void setCollapsedTextAppearance(int i, ColorStateList colorStateList) {
        this.i.M(i, colorStateList);
        this.B = this.i.o();
        updateLabelState(false);
    }

    public final void setEditText() {
        onApplyBoxBackgroundMode();
        this.i.S(getTextSize());
        int gravity = getGravity();
        this.i.O((gravity & ErrorInfo.OC_OPTION_ERROR_DIR) | 48);
        this.i.R(gravity);
        if (this.A == null) {
            this.A = getHintTextColors();
        }
        if (this.m) {
            setHint((CharSequence) null);
            if (TextUtils.isEmpty(this.f2133n)) {
                CharSequence hint = getHint();
                this.f2132l = hint;
                setTopHint(hint);
                setHint((CharSequence) null);
            }
            this.o = true;
        }
        updateLabelState(false, true);
        updateModePadding();
    }

    public void setHintEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            if (!z) {
                this.o = false;
                if (!TextUtils.isEmpty(this.f2133n) && TextUtils.isEmpty(getHint())) {
                    setHint(this.f2133n);
                }
                setHintInternal(null);
                return;
            }
            CharSequence hint = getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f2133n)) {
                    setTopHint(hint);
                }
                setHint((CharSequence) null);
            }
            this.o = true;
        }
    }

    public void setTopHint(CharSequence charSequence) {
        if (this.m) {
            setHintInternal(charSequence);
        }
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.G = z;
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public final void updateLineModeBackground() {
        if (this.r != 1) {
            return;
        }
        if (!isEnabled()) {
            this.P = 0;
            return;
        }
        if (hasFocus()) {
            if (this.L) {
                return;
            }
            animateToShowBackground();
        } else if (this.L) {
            animateToHideBackground();
        }
    }

    public final void updateModePadding() {
        ViewCompat.setPaddingRelative(this, isRtlMode() ? getPaddingRight() : getPaddingLeft(), getModePaddingTop(), isRtlMode() ? getPaddingLeft() : getPaddingRight(), getPaddingBottom());
    }

    public final void updateTextInputBoxBounds() {
        if (this.r == 0 || this.p == null || getRight() == 0) {
            return;
        }
        this.p.setBounds(0, getBoundsTop(), getWidth(), getHeight());
        applyBoxAttributes();
    }

    public final void updateTextInputBoxState() {
        int i;
        if (this.p == null || (i = this.r) == 0 || i != 2) {
            return;
        }
        if (!isEnabled()) {
            this.y = this.E;
        } else if (hasFocus()) {
            this.y = this.D;
        } else {
            this.y = this.C;
        }
        applyBoxAttributes();
    }

    public COUIAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public final void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        boolean zIsEnabled = isEnabled();
        boolean z3 = !TextUtils.isEmpty(getText());
        ColorStateList colorStateList2 = this.A;
        if (colorStateList2 != null) {
            this.i.N(colorStateList2);
            this.i.Q(this.A);
        }
        if (!zIsEnabled) {
            this.i.N(ColorStateList.valueOf(this.E));
            this.i.Q(ColorStateList.valueOf(this.E));
        } else if (hasFocus() && (colorStateList = this.B) != null) {
            this.i.N(colorStateList);
        }
        if (z3 || (isEnabled() && hasFocus())) {
            if (z2 || this.F) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.F) {
            expandHint(z);
        }
    }

    public COUIAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new com.coui.appcompat.edittext.a.C0200a(this);
        this.w = 3;
        this.z = new RectF();
        initHintMode(context, attributeSet, i);
    }
}
