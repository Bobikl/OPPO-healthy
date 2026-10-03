package com.coui.appcompat.edittext;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ti2;
import com.oplus.aiunit.vision.vi2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$string;
import com.support.appcompat.R$style;
import com.support.appcompat.R$styleable;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIEditText extends AppCompatEditText {
    public static final int MODE_BACKGROUND_LINE = 1;
    public static final int MODE_BACKGROUND_NONE = 0;
    public static final int MODE_BACKGROUND_NO_LINE = 3;
    public static final int MODE_BACKGROUND_RECT = 2;
    public boolean A;
    public Runnable A0;
    public GradientDrawable B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public RectF L;
    public ColorStateList M;
    public ColorStateList N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public ValueAnimator U;
    public ValueAnimator V;
    public ValueAnimator W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public Paint d0;
    public Paint e0;
    public Paint f0;
    public Paint g0;
    public TextPaint h0;
    public final com.coui.appcompat.edittext.a.C0200a i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Interpolator f1714j;
    public float j0;
    public Interpolator k;
    public int k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1715l;
    public int l0;
    public Drawable m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f1716n;
    public int n0;
    public boolean o;
    public int o0;
    public boolean p;
    public int p0;
    public boolean q;
    public boolean q0;
    public int r;
    public boolean r0;
    public Context s;
    public String s0;
    public boolean t;
    public int t0;
    public AccessibilityTouchHelper u;
    public View.OnFocusChangeListener u0;
    public String v;
    public View.OnTouchListener v0;
    public f w;
    public boolean w0;
    public CharSequence x;
    public boolean x0;
    public boolean y;
    public com.coui.appcompat.edittext.b y0;
    public CharSequence z;
    public Runnable z0;

    public class AccessibilityTouchHelper extends ExploreByTouchHelper implements View.OnClickListener {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Rect f1717j;
        public Rect k;

        public AccessibilityTouchHelper(View view) {
            super(view);
            this.f1717j = null;
            this.k = null;
            this.i = view;
        }

        public final Rect getItemBounds(int i) {
            if (i != 0) {
                return new Rect();
            }
            if (this.f1717j == null) {
                initUninstallRect();
            }
            return this.f1717j;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            if (this.f1717j == null) {
                initUninstallRect();
            }
            Rect rect = this.f1717j;
            return (f < ((float) rect.left) || f > ((float) rect.right) || f2 < ((float) rect.top) || f2 > ((float) rect.bottom) || !COUIEditText.this.z()) ? Integer.MIN_VALUE : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            if (COUIEditText.this.z()) {
                list.add(0);
            }
        }

        public final void initUninstallRect() {
            Rect rect = new Rect();
            this.f1717j = rect;
            rect.left = COUIEditText.this.getDeleteButtonLeft();
            this.f1717j.right = COUIEditText.this.getWidth();
            Rect rect2 = this.f1717j;
            rect2.top = 0;
            rect2.bottom = COUIEditText.this.getHeight();
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i != 0 || !COUIEditText.this.z()) {
                return true;
            }
            COUIEditText.this.I();
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(COUIEditText.this.v);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i == 0) {
                accessibilityNodeInfoCompat.setContentDescription(COUIEditText.this.v);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                accessibilityNodeInfoCompat.addAction(16);
            }
            accessibilityNodeInfoCompat.setBoundsInParent(getItemBounds(i));
        }
    }

    public static class COUISavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<COUISavedState> CREATOR = new a();
        String mText;

        public class a implements Parcelable.Creator<COUISavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public COUISavedState createFromParcel(Parcel parcel) {
                return new COUISavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public COUISavedState[] newArray(int i) {
                return new COUISavedState[i];
            }
        }

        public /* synthetic */ COUISavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel parcel) {
            this.mText = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mText);
        }

        public COUISavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private COUISavedState(Parcel parcel) {
            super(parcel);
            this.mText = parcel.readString();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIEditText.this.setCompoundDrawables(null, null, null, null);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIEditText cOUIEditText = COUIEditText.this;
            cOUIEditText.setCompoundDrawables(null, null, cOUIEditText.m, null);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIEditText.this.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUIEditText.this.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIEditText.this.i0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            COUIEditText.this.invalidate();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIEditText.this.i.T(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            COUIEditText cOUIEditText = COUIEditText.this;
            cOUIEditText.P(cOUIEditText.hasFocus());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public /* synthetic */ f(COUIEditText cOUIEditText, a aVar) {
            this();
        }
    }

    public interface g {
    }

    public interface h {
        void onErrorStateChangeAnimationEnd(boolean z);

        void onErrorStateChanged(boolean z);
    }

    public interface i {
    }

    public interface j {
    }

    public COUIEditText(Context context) {
        this(context, null);
    }

    private boolean F() {
        return getLayoutDirection() == 1;
    }

    private void H() {
        r();
        U();
    }

    private void J() {
        if (v()) {
            RectF rectF = this.L;
            this.i.n(rectF);
            q(rectF);
            ((com.coui.appcompat.edittext.a) this.B).h(rectF);
        }
    }

    private void L() {
        if (this.D == 2 && this.P == 0) {
            this.P = this.N.getColorForState(getDrawableState(), this.N.getDefaultColor());
        }
    }

    private void N() {
        H();
        this.i.S(getTextSize());
        int gravity = getGravity();
        this.i.O((gravity & ErrorInfo.OC_OPTION_ERROR_DIR) | 48);
        this.i.R(gravity);
        if (this.M == null) {
            this.M = getHintTextColors();
        }
        boolean zEquals = Locale.getDefault().getLanguage().equals("my");
        if (!zEquals) {
            setHint(this.y ? null : "");
        }
        if (TextUtils.isEmpty(this.z) && !zEquals) {
            CharSequence hint = getHint();
            this.x = hint;
            setTopHint(hint);
            setHint(this.y ? null : "");
        }
        this.A = !zEquals;
        R(false, true);
        if (this.y) {
            T();
        }
    }

    private void R(boolean z, boolean z2) {
        com.coui.appcompat.edittext.a.C0200a c0200a;
        ColorStateList colorStateList;
        boolean zIsEnabled = isEnabled();
        boolean z3 = !TextUtils.isEmpty(getText());
        if (this.M != null) {
            this.M = getHintTextColors();
            com.coui.appcompat.edittext.a.C0200a c0200a2 = this.i;
            if (c0200a2 != null) {
                c0200a2.N(this.N);
                this.i.Q(this.M);
            }
        }
        com.coui.appcompat.edittext.a.C0200a c0200a3 = this.i;
        if (c0200a3 != null) {
            if (!zIsEnabled) {
                c0200a3.N(ColorStateList.valueOf(this.Q));
                this.i.Q(ColorStateList.valueOf(this.Q));
            } else if (hasFocus() && (colorStateList = this.N) != null) {
                this.i.N(colorStateList);
            }
        }
        if (z3 || (isEnabled() && hasFocus())) {
            if (z2 || this.S) {
                u(z);
            }
        } else if ((z2 || !this.S) && E()) {
            w(z);
        }
        com.coui.appcompat.edittext.b bVar = this.y0;
        if (bVar == null || (c0200a = this.i) == null) {
            return;
        }
        bVar.K(c0200a);
    }

    private void S() {
        if (this.D != 1) {
            return;
        }
        if (!isEnabled()) {
            this.j0 = 0.0f;
            return;
        }
        if (hasFocus()) {
            if (this.c0) {
                return;
            }
            o();
        } else if (this.c0) {
            n();
        }
    }

    private void T() {
        ViewCompat.setPaddingRelative(this, F() ? getPaddingRight() : getPaddingLeft(), getModePaddingTop(), F() ? getPaddingLeft() : getPaddingRight(), getPaddingBottom());
    }

    private void U() {
        if (this.D == 0 || this.B == null || getRight() == 0) {
            return;
        }
        this.B.setBounds(0, getBoundsTop(), getWidth(), getHeight());
        p();
    }

    private void V() {
        int i2;
        if (this.B == null || (i2 = this.D) == 0 || i2 != 2) {
            return;
        }
        if (!isEnabled()) {
            this.K = this.Q;
        } else if (hasFocus()) {
            this.K = this.P;
        } else {
            this.K = this.O;
        }
        p();
    }

    private int getBoundsTop() {
        int i2 = this.D;
        if (i2 == 1) {
            return this.l0;
        }
        if (i2 == 2 || i2 == 3) {
            return (int) (this.i.q() / 2.0f);
        }
        return 0;
    }

    private Drawable getBoxBackground() {
        int i2 = this.D;
        if (i2 == 1 || i2 == 2) {
            return this.B;
        }
        return null;
    }

    private float[] getCornerRadiiAsArray() {
        float f2 = this.F;
        float f3 = this.E;
        float f4 = this.H;
        float f5 = this.G;
        return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
    }

    private int getModePaddingTop() {
        int iY;
        int iQ;
        int i2 = this.D;
        if (i2 == 1) {
            iY = this.l0 + ((int) this.i.y());
            iQ = this.n0;
        } else {
            if (i2 != 2 && i2 != 3) {
                return 0;
            }
            iY = this.k0;
            iQ = (int) (this.i.q() / 2.0f);
        }
        return iY + iQ;
    }

    private void m(float f2) {
        if (this.i.x() == f2) {
            return;
        }
        if (this.U == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.U = valueAnimator;
            valueAnimator.setInterpolator(this.f1714j);
            this.U.setDuration(200L);
            this.U.addUpdateListener(new e());
        }
        this.U.setFloatValues(this.i.x(), f2);
        this.U.start();
    }

    private void n() {
        if (this.W == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W = valueAnimator;
            valueAnimator.setInterpolator(this.k);
            this.W.setDuration(250L);
            this.W.addUpdateListener(new d());
        }
        this.W.setIntValues(255, 0);
        this.W.start();
        this.c0 = false;
    }

    private void o() {
        if (this.V == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.V = valueAnimator;
            valueAnimator.setInterpolator(this.k);
            this.V.setDuration(250L);
            this.V.addUpdateListener(new c());
        }
        this.i0 = 255;
        this.V.setFloatValues(0.0f, 1.0f);
        ValueAnimator valueAnimator2 = this.W;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.W.cancel();
        }
        this.V.start();
        this.c0 = true;
    }

    private void p() {
        int i2;
        if (this.B == null) {
            return;
        }
        L();
        int i3 = this.I;
        if (i3 > -1 && (i2 = this.K) != 0) {
            this.B.setStroke(i3, i2);
        }
        this.B.setCornerRadii(getCornerRadiiAsArray());
        invalidate();
    }

    private void q(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.C;
        rectF.left = f2 - i2;
        rectF.top -= i2;
        rectF.right += i2;
        rectF.bottom += i2;
    }

    private void r() {
        int i2 = this.D;
        if (i2 == 0) {
            this.B = null;
            return;
        }
        if (i2 == 2 && this.y && !(this.B instanceof com.coui.appcompat.edittext.a)) {
            this.B = new com.coui.appcompat.edittext.a();
        } else if (this.B == null) {
            this.B = new GradientDrawable();
        }
    }

    private int s() {
        int i2 = this.D;
        if (i2 == 1) {
            if (getBoxBackground() != null) {
                return getBoxBackground().getBounds().top;
            }
            return 0;
        }
        if (i2 != 2 && i2 != 3) {
            return getPaddingTop();
        }
        if (getBoxBackground() != null) {
            return getBoxBackground().getBounds().top - getLabelMarginTop();
        }
        return 0;
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.z)) {
            return;
        }
        if (Locale.getDefault().getLanguage().equals("my")) {
            this.z = charSequence;
            super.setHint(charSequence);
            this.i.Z(null);
            return;
        }
        this.z = charSequence;
        this.i.Z(charSequence);
        if (!this.S) {
            J();
        }
        com.coui.appcompat.edittext.b bVar = this.y0;
        if (bVar != null) {
            bVar.I(this.i);
        }
        setContentDescription(charSequence);
    }

    private void t() {
        if (v()) {
            ((com.coui.appcompat.edittext.a) this.B).e();
        }
    }

    private void u(boolean z) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.U.cancel();
        }
        if (z && this.T) {
            m(1.0f);
        } else {
            this.i.T(1.0f);
        }
        this.S = false;
        if (v()) {
            J();
        }
    }

    private boolean v() {
        return this.y && !TextUtils.isEmpty(this.z) && (this.B instanceof com.coui.appcompat.edittext.a);
    }

    private void w(boolean z) {
        if (this.B != null) {
            Log.d("COUIEditText", "mBoxBackground: " + this.B.getBounds());
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.U.cancel();
        }
        if (z && this.T) {
            m(0.0f);
        } else {
            this.i.T(0.0f);
        }
        if (v() && ((com.coui.appcompat.edittext.a) this.B).b()) {
            t();
        }
        this.S = true;
    }

    private boolean x(Rect rect) {
        int compoundPaddingLeft = F() ? (getCompoundPaddingLeft() - this.o0) - getCompoundDrawablePadding() : (getWidth() - getCompoundPaddingRight()) + getCompoundDrawablePadding();
        int i2 = this.o0 + compoundPaddingLeft;
        int height = ((((getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom()) - this.o0) / 2) + getCompoundPaddingTop();
        rect.set(compoundPaddingLeft, height, i2, this.o0 + height);
        return true;
    }

    private void y(Context context, AttributeSet attributeSet, int i2) {
        this.i.a0(new vi2());
        this.i.X(new vi2());
        this.i.O(8388659);
        this.f1714j = new hj2();
        this.k = new ti2();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIEditText, i2, R$style.Widget_COUI_EditText_HintAnim_Line);
        this.y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_couiHintEnabled, false);
        setTopHint(typedArrayObtainStyledAttributes.getText(R$styleable.COUIEditText_android_hint));
        if (this.y) {
            this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_couiHintAnimationEnabled, true);
        }
        this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIEditText_rectModePaddingTop, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIEditText_cornerRadius, 0.0f);
        this.E = dimension;
        this.F = dimension;
        this.G = dimension;
        this.H = dimension;
        this.P = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiStrokeColor, lh2.b(context, R$attr.couiColorPrimary, 0));
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIEditText_couiStrokeWidth, 0);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIEditText_couiFocusStrokeWidth, this.J);
        this.m0 = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_line_padding);
        if (this.y) {
            this.C = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_label_cutout_padding);
            this.l0 = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_line_padding_top);
            this.n0 = context.getResources().getDimensionPixelOffset(R$dimen.coui_textinput_line_padding_middle);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIEditText_couiBackgroundMode, 0);
        setBoxBackgroundMode(i3);
        if (this.D != 0) {
            setBackgroundDrawable(null);
        }
        int i4 = R$styleable.COUIEditText_android_textColorHint;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i4);
            this.M = colorStateList;
            this.N = colorStateList;
        }
        this.O = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiDefaultStrokeColor, 0);
        this.Q = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiDisabledStrokeColor, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUIEditText_couiEditTextNoEllipsisText);
        this.s0 = string;
        setText(string);
        M(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIEditText_collapsedTextSize, 0), typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIEditText_collapsedTextColor));
        if (i3 == 2) {
            this.i.b0(Typeface.create("sans-serif-medium", 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.g0 = new Paint();
        TextPaint textPaint = new TextPaint();
        this.h0 = textPaint;
        textPaint.setTextSize(getTextSize());
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setColor(this.O);
        Paint paint2 = new Paint();
        this.f0 = paint2;
        paint2.setColor(this.Q);
        Paint paint3 = new Paint();
        this.d0 = paint3;
        paint3.setColor(this.P);
        N();
    }

    public final boolean A(String str) {
        if (str == null) {
            return false;
        }
        return TextUtils.isEmpty(str);
    }

    public boolean B() {
        return this.y0.u();
    }

    public boolean C() {
        return this.p;
    }

    public final boolean D() {
        return (getGravity() & 7) == 1;
    }

    public boolean E() {
        return this.y;
    }

    public boolean G() {
        return this.w0;
    }

    public void I() {
        Editable text = getText();
        text.delete(0, text.length());
    }

    public void K() {
        TypedArray typedArrayObtainStyledAttributes;
        Drawable drawable;
        String resourceTypeName = getResources().getResourceTypeName(this.f1715l);
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.COUIEditText, this.f1715l, 0);
        } else if (!Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            return;
        } else {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.COUIEditText, 0, this.f1715l);
        }
        int i2 = R$styleable.COUIEditText_android_textColorHint;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i2);
            this.M = colorStateList;
            this.N = colorStateList;
            if (colorStateList == null) {
                this.M = getHintTextColors();
            }
        }
        this.R = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiEditTextErrorColor, lh2.a(getContext(), R$attr.couiColorErrorTextBg));
        this.P = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiStrokeColor, lh2.b(getContext(), R$attr.couiColorPrimary, 0));
        this.O = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiDefaultStrokeColor, 0);
        this.Q = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiDisabledStrokeColor, 0);
        this.y0.B(this.R);
        this.e0.setColor(this.O);
        this.f0.setColor(this.Q);
        this.d0.setColor(this.P);
        this.m = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIEditText_couiEditTextDeleteIconNormal);
        this.f1716n = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIEditText_couiEditTextDeleteIconPressed);
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            this.o0 = drawable2.getIntrinsicWidth();
            int intrinsicHeight = this.m.getIntrinsicHeight();
            this.p0 = intrinsicHeight;
            this.m.setBounds(0, 0, this.o0, intrinsicHeight);
        }
        Drawable drawable3 = this.f1716n;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, this.o0, this.p0);
        }
        if (this.p && this.w0 && !TextUtils.isEmpty(getText()) && hasFocus() && this.q && (drawable = this.m) != null) {
            setCompoundDrawables(null, null, drawable, null);
        }
        V();
        typedArrayObtainStyledAttributes.recycle();
        invalidate();
    }

    public void M(int i2, ColorStateList colorStateList) {
        this.i.M(i2, colorStateList);
        this.N = this.i.o();
        Q(false);
        this.y0.A(i2, colorStateList);
    }

    public final void O() {
        if (isFocused()) {
            if (this.q0) {
                setText(this.s0);
                setSelection(this.t0 >= getSelectionEnd() ? getSelectionEnd() : this.t0);
            }
            this.q0 = false;
            return;
        }
        if (this.h0.measureText(String.valueOf(getText())) <= getWidth() || this.q0) {
            return;
        }
        this.s0 = String.valueOf(getText());
        this.q0 = true;
        setText(TextUtils.ellipsize(getText(), this.h0, getWidth(), TextUtils.TruncateAt.END));
        if (this.b0) {
            setErrorState(true);
        }
    }

    public final void P(boolean z) {
        if (TextUtils.isEmpty(getText().toString())) {
            if (D()) {
                setPaddingRelative(0, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            }
            if (this.q) {
                setCompoundDrawables(null, null, null, null);
            } else {
                post(this.z0);
            }
            this.q = false;
            return;
        }
        if (!z) {
            if (this.q) {
                if (D()) {
                    setPaddingRelative(0, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
                }
                post(this.z0);
                this.q = false;
                return;
            }
            return;
        }
        if (this.m == null || this.q) {
            return;
        }
        if (D()) {
            setPaddingRelative(this.o0 + getCompoundDrawablePadding(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        }
        if (C() && this.w0) {
            post(this.A0);
        }
        this.q = true;
    }

    public void Q(boolean z) {
        R(z, false);
    }

    public void addOnErrorStateChangedListener(h hVar) {
        this.y0.addOnErrorStateChangedListener(hVar);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AccessibilityTouchHelper accessibilityTouchHelper;
        if (z() && (accessibilityTouchHelper = this.u) != null && accessibilityTouchHelper.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        if (this.t) {
            onStartTemporaryDetach();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (getMaxLines() < 2 && this.r0) {
            O();
        }
        if (getHintTextColors() != this.M) {
            Q(false);
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.y || getText().length() == 0) {
            this.i.k(canvas);
        } else {
            canvas.drawText(" ", 0.0f, 0.0f, this.g0);
        }
        if (this.B != null && this.D == 2) {
            if (getScrollX() != 0) {
                U();
            }
            if (this.y0.u()) {
                this.y0.n(canvas, this.B, this.K);
            } else {
                this.B.draw(canvas);
            }
        }
        if (this.D == 1) {
            int height = getHeight();
            this.d0.setAlpha(this.i0);
            if (isEnabled()) {
                if (this.y0.u()) {
                    this.y0.m(canvas, height, getWidth(), (int) (this.j0 * getWidth()), this.e0, this.d0);
                } else {
                    if (!this.x0) {
                        canvas.drawRect(0.0f, height - this.I, getWidth(), height, this.e0);
                    }
                    if (hasFocus()) {
                        canvas.drawRect(0.0f, height - this.J, this.j0 * getWidth(), height, this.d0);
                    }
                }
            } else if (!this.x0) {
                canvas.drawRect(0.0f, height - this.I, getWidth(), height, this.f0);
            }
        }
        canvas.restoreToCount(iSave);
        super.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean zY;
        if (this.a0) {
            return;
        }
        this.a0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.y) {
            Q(ViewCompat.isLaidOut(this) && isEnabled());
        } else {
            Q(false);
        }
        S();
        if (this.y) {
            U();
            V();
            com.coui.appcompat.edittext.a.C0200a c0200a = this.i;
            if (c0200a != null) {
                zY = c0200a.Y(drawableState) | false;
                this.y0.o(drawableState);
            } else {
                zY = false;
            }
        } else {
            zY = false;
        }
        if (zY) {
            invalidate();
        }
        this.a0 = false;
    }

    public Rect getBackgroundRect() {
        int i2 = this.D;
        if ((i2 == 1 || i2 == 2 || i2 == 3) && getBoxBackground() != null) {
            getBoxBackground().getBounds();
        }
        return null;
    }

    public int getBoxStrokeColor() {
        return this.P;
    }

    public String getCouiEditTexttNoEllipsisText() {
        return this.q0 ? this.s0 : String.valueOf(getText());
    }

    public int getDeleteButtonLeft() {
        Drawable drawable = this.m;
        return ((getRight() - getLeft()) - getPaddingRight()) - (drawable != null ? drawable.getIntrinsicWidth() : 0);
    }

    public int getDeleteIconWidth() {
        return this.o0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        if (this.y) {
            return this.z;
        }
        return null;
    }

    public int getLabelMarginTop() {
        if (this.y) {
            return (int) (this.i.q() / 2.0f);
        }
        return 0;
    }

    public j getTextDeleteListener() {
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.y0.w(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.p) {
            P(z);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.u0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!this.p || i2 != 67) {
            return super.onKeyDown(i2, keyEvent);
        }
        super.onKeyDown(i2, keyEvent);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.B != null) {
            U();
        }
        if (this.y) {
            T();
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int width = getWidth() - getCompoundPaddingRight();
        int iS = s();
        this.i.P(compoundPaddingLeft, getCompoundPaddingTop(), width, getHeight() - getCompoundPaddingBottom());
        this.i.L(compoundPaddingLeft, iS, width, getHeight() - getCompoundPaddingBottom());
        this.i.J();
        if (v() && !this.S) {
            J();
        }
        this.y0.x(this.i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        if (getMaxLines() < 2 && this.r0 && (parcelable instanceof COUISavedState) && (str = ((COUISavedState) parcelable).mText) != null) {
            setText(str);
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (getMaxLines() >= 2 || !this.r0 || isFocused()) {
            return parcelableOnSaveInstanceState;
        }
        COUISavedState cOUISavedState = new COUISavedState(parcelableOnSaveInstanceState);
        cOUISavedState.mText = getCouiEditTexttNoEllipsisText();
        return cOUISavedState;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w0 && this.p && !TextUtils.isEmpty(getText()) && hasFocus()) {
            Rect rect = new Rect();
            boolean z = x(rect) && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (this.q && z) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.o = true;
                    return true;
                }
                if (action != 1) {
                    if (action == 2 && this.o) {
                        return true;
                    }
                } else if (this.o) {
                    I();
                    this.o = false;
                    return true;
                }
            }
        }
        View.OnTouchListener onTouchListener = this.v0;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        this.t0 = getSelectionEnd();
        return zOnTouchEvent;
    }

    public void removeOnErrorStateChangedListener(h hVar) {
        this.y0.removeOnErrorStateChangedListener(hVar);
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.D) {
            return;
        }
        this.D = i2;
        H();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.P != i2) {
            this.P = i2;
            this.d0.setColor(i2);
            V();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        if (drawable3 != null) {
            this.r = drawable3.getBounds().width();
        } else {
            this.r = 0;
        }
    }

    public void setCouiEditTexttNoEllipsisText(String str) {
        this.s0 = str;
        setText(str);
    }

    public void setCustomEditTextOnTouchListener(View.OnTouchListener onTouchListener) {
        this.v0 = onTouchListener;
    }

    public void setDefaultStrokeColor(int i2) {
        if (this.O != i2) {
            this.O = i2;
            this.e0.setColor(i2);
            V();
        }
    }

    public void setDisabledStrokeColor(int i2) {
        if (this.Q != i2) {
            this.Q = i2;
            this.f0.setColor(i2);
            V();
        }
    }

    public void setEditFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.u0 = onFocusChangeListener;
    }

    public void setEditTextColor(int i2) {
        setTextColor(i2);
        this.y0.J(getTextColors());
    }

    public void setEditTextDeleteIconNormal(Drawable drawable) {
        if (drawable != null) {
            this.m = drawable;
            this.o0 = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.m.getIntrinsicHeight();
            this.p0 = intrinsicHeight;
            this.m.setBounds(0, 0, this.o0, intrinsicHeight);
            invalidate();
        }
    }

    public void setEditTextDeleteIconPressed(Drawable drawable) {
        if (drawable != null) {
            this.f1716n = drawable;
            drawable.setBounds(0, 0, this.o0, this.p0);
            invalidate();
        }
    }

    public void setEditTextErrorColor(int i2) {
        if (i2 != this.R) {
            this.R = i2;
            this.y0.B(i2);
            invalidate();
        }
    }

    public void setErrorState(boolean z) {
        this.b0 = z;
        this.y0.C(z);
    }

    public void setFastDeletable(boolean z) {
        if (this.p != z) {
            this.p = z;
            if (z && this.w == null) {
                f fVar = new f(this, null);
                this.w = fVar;
                addTextChangedListener(fVar);
            }
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.y) {
            this.y = z;
            if (!z) {
                this.A = false;
                if (!TextUtils.isEmpty(this.z) && TextUtils.isEmpty(getHint())) {
                    setHint(this.z);
                }
                setHintInternal(null);
                return;
            }
            CharSequence hint = getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.z)) {
                    setTopHint(hint);
                }
                setHint((CharSequence) null);
            }
            this.A = true;
        }
    }

    public void setInputConnectionListener(g gVar) {
    }

    public void setIsEllipsisEnabled(boolean z) {
        this.r0 = z;
    }

    public void setJustShowFocusLine(boolean z) {
        this.x0 = z;
    }

    public void setOnTextDeletedListener(j jVar) {
    }

    public void setShowDeleteIcon(boolean z) {
        this.w0 = z;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        Selection.setSelection(getText(), length());
    }

    public void setTextDeletedListener(i iVar) {
    }

    public void setTopHint(CharSequence charSequence) {
        setHintInternal(charSequence);
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.T = z;
    }

    public boolean z() {
        return this.p && !A(getText().toString()) && hasFocus();
    }

    public COUIEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @SuppressLint({"WrongConstant"})
    public COUIEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        com.coui.appcompat.edittext.a.C0200a c0200a = new com.coui.appcompat.edittext.a.C0200a(this);
        this.i = c0200a;
        this.o = false;
        this.p = false;
        this.q = false;
        this.t = false;
        this.v = null;
        this.w = null;
        this.I = 1;
        this.J = 3;
        this.L = new RectF();
        this.q0 = false;
        this.r0 = false;
        this.s0 = "";
        this.t0 = 0;
        this.w0 = true;
        this.x0 = false;
        this.z0 = new a();
        this.A0 = new b();
        if (attributeSet != null) {
            this.f1715l = attributeSet.getStyleAttribute();
        }
        if (this.f1715l == 0) {
            this.f1715l = i2;
        }
        this.s = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIEditText, i2, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_quickDelete, false);
        this.R = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIEditText_couiEditTextErrorColor, lh2.a(context, R$attr.couiColorErrorTextBg));
        this.m = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIEditText_couiEditTextDeleteIconNormal);
        this.f1716n = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIEditText_couiEditTextDeleteIconPressed);
        this.r0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIEditText_couiEditTextIsEllipsis, true);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIEditText_couiEditTextHintLines, 1);
        c0200a.U(i3);
        typedArrayObtainStyledAttributes.recycle();
        setFastDeletable(z);
        Drawable drawable = this.m;
        if (drawable != null) {
            this.o0 = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.m.getIntrinsicHeight();
            this.p0 = intrinsicHeight;
            this.m.setBounds(0, 0, this.o0, intrinsicHeight);
        }
        Drawable drawable2 = this.f1716n;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.o0, this.p0);
        }
        c0200a.V(context.getResources().getDimensionPixelSize(R$dimen.coui_edit_text_hint_start_padding));
        AccessibilityTouchHelper accessibilityTouchHelper = new AccessibilityTouchHelper(this);
        this.u = accessibilityTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityTouchHelper);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.v = this.s.getString(R$string.coui_slide_delete);
        this.u.invalidateRoot();
        this.y0 = new com.coui.appcompat.edittext.b(this, i3);
        y(context, attributeSet, i2);
        this.y0.s(this.R, this.J, this.D, getCornerRadiiAsArray(), c0200a);
    }
}
