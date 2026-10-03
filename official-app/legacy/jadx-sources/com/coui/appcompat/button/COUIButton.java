package com.coui.appcompat.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.ej2;
import com.oplus.aiunit.vision.ejd;
import com.oplus.aiunit.vision.fj2;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.i95;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.mm2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.sk2;
import com.oplus.aiunit.vision.xid;
import com.oplus.aiunit.vision.xl2;
import com.oplus.graphics.OplusOutlineAdapter;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIButton extends AppCompatButton {
    public static final int BORDERLESS_BUTTON_ANIM = 0;
    public static final int COMMON_ROUND = 1;
    public static final float DEFAULT_RADIUS = -1.0f;
    public static final int DIALOG_BORDERLESS_BUTTON_ANIM = 2;
    public static final int FILL_BUTTON_ANIM = 1;
    public static final int RADIUS_HALF_HEIGHT = -1;
    public static final int SMOOTH_ROUND = 0;
    public static String c0 = "COUIButton";
    public float A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public RectF K;
    public RectF L;
    public float[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public OplusOutlineAdapter U;
    public Rect V;
    public xid W;
    public ejd a0;
    public float b0;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Path f1608j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hm2 f1609l;
    public ej2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public mm2 f1610n;
    public fj2 o;
    public boolean p;
    public int q;
    public int r;
    public final Paint s;
    public int t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            COUIButton.this.U = new OplusOutlineAdapter(outline, 1);
            COUIButton.this.V.left = (int) COUIButton.this.K.left;
            COUIButton.this.V.top = (int) COUIButton.this.K.top;
            COUIButton.this.V.right = (int) COUIButton.this.K.right;
            COUIButton.this.V.bottom = (int) COUIButton.this.K.bottom;
            COUIButton.this.U.setSmoothRoundRect(COUIButton.this.V, COUIButton.this.getDrawableRadius());
        }
    }

    public COUIButton(Context context) {
        this(context, null);
    }

    private int getAnimatorColor() {
        return !isEnabled() ? this.u : ColorUtils.compositeColors(this.m.A(), this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(i(charSequence.toString()), bufferType);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getActionMasked() == 9) {
            this.m.c();
        }
        if (motionEvent.getActionMasked() == 10 && isHovered()) {
            this.m.i();
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        w();
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ej2 ej2Var = this.m;
        if (ej2Var != null) {
            ej2Var.setState(getDrawableState());
        }
        mm2 mm2Var = this.f1610n;
        if (mm2Var != null) {
            mm2Var.setState(getDrawableState());
        }
    }

    public final void f(TypedArray typedArray) {
        Context context = getContext();
        int i = R$attr.couiColorDisable;
        int iF = lh2.f(context, i, 0);
        int i2 = R$styleable.COUIButton_disabledColor;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (iF == 0 || iF != resourceId) {
            this.u = typedArray.getColor(i2, 0);
        } else {
            this.u = lh2.a(getContext(), i);
        }
    }

    public final void g(Canvas canvas) {
        if (this.p) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.s.setStyle(Paint.Style.FILL);
            this.s.setAntiAlias(true);
            if (this.q == 1) {
                this.s.setColor(isEnabled() ? this.t : this.u);
            } else {
                this.s.setColor(getStrokeButtonAnimatorColor(this.t));
            }
            if (this.r == 1) {
                float drawableRadius = getDrawableRadius();
                canvas.drawRoundRect(this.K, drawableRadius, drawableRadius, this.s);
                if (this.q != 1) {
                    float fK = (k(this.L) + this.A) - this.z;
                    this.s.setColor(isEnabled() ? this.C : this.u);
                    this.s.setStrokeWidth(this.z);
                    this.s.setStyle(Paint.Style.STROKE);
                    canvas.drawRoundRect(this.L, fK, fK, this.s);
                }
            } else if (o()) {
                canvas.drawRect(this.J, this.s);
                if (this.q == 0) {
                    canvas.save();
                    Path path = this.f1608j;
                    RectF rectF = this.L;
                    xl2.c(path, rectF, k(rectF), this.b0);
                    canvas.clipOutPath(this.f1608j);
                    canvas.drawColor(isEnabled() ? this.C : this.u);
                    canvas.restore();
                }
            } else {
                canvas.drawPath(this.i, this.s);
                if (this.q != 1) {
                    this.s.setColor(isEnabled() ? this.C : this.u);
                    this.s.setStrokeWidth(this.z);
                    this.s.setStyle(Paint.Style.STROKE);
                    sk2 sk2VarA = sk2.a();
                    RectF rectF2 = this.L;
                    canvas.drawPath(sk2VarA.d(rectF2, (k(rectF2) + this.A) - this.z), this.s);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    public String getDescText() {
        return this.R;
    }

    public int getDrawableColor() {
        return this.t;
    }

    public float getDrawableRadius() {
        return j(this.J);
    }

    public int getMeasureMaxHeight() {
        return this.G;
    }

    public int getMeasureMaxWidth() {
        return this.F;
    }

    public int getRoundType() {
        return this.r;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return (this.p && this.q == 1) ? getAnimatorColor() : super.getSolidColor();
    }

    public final int getStrokeButtonAnimatorColor(int i) {
        return 0;
    }

    public float getStrokeWidth() {
        return this.z;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        return m() ? this.Q : super.getText();
    }

    public final void h(Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        this.m.draw(canvas);
        this.f1610n.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final SpannableString i(String str) {
        i95 i95Var = new i95(getContext(), str, this.R, (this.F - getPaddingStart()) - getPaddingRight(), (this.I - getPaddingStart()) - getPaddingRight(), (this.H - getPaddingBottom()) - getPaddingTop(), getCurrentTextColor(), getPaint(), isLayoutRTL());
        SpannableString spannableString = new SpannableString("  ");
        spannableString.setSpan(i95Var, spannableString.length() - 1, spannableString.length(), 33);
        return spannableString;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    public final boolean isLayoutRTL() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final float j(@NonNull Rect rect) {
        if (this.v < 0.0f && v()) {
            return rect.height() / 2.0f;
        }
        float f = this.v;
        return f < 0.0f ? (rect.height() / 2.0f) - this.A : f;
    }

    public final float k(@NonNull RectF rectF) {
        if (this.v < 0.0f && v()) {
            return rectF.height() / 2.0f;
        }
        float f = this.v;
        return f < 0.0f ? (rectF.height() / 2.0f) - this.A : f;
    }

    public final void l(Context context) {
        this.B = context.getResources().getDimension(R$dimen.default_focus_stroke_radius);
        Drawable background = getBackground();
        ej2 ej2Var = new ej2(context, 0);
        this.m = ej2Var;
        ej2Var.D(this.i);
        this.m.setCallback(this);
        mm2 mm2Var = new mm2(context);
        this.f1610n = mm2Var;
        mm2Var.w(this.i);
        this.f1610n.setCallback(this);
        fj2 fj2Var = new fj2(context);
        this.o = fj2Var;
        fj2Var.v();
        this.o.w(this.i);
        Drawable[] drawableArr = new Drawable[2];
        if (background == null) {
            background = new ColorDrawable(0);
        }
        drawableArr[0] = background;
        drawableArr[1] = this.o;
        this.f1609l = new hm2(drawableArr);
        setScaleEnable(this.k);
        super.setBackground(this.f1609l);
        setAnimType(this.q);
    }

    public boolean m() {
        return (!this.O || TextUtils.isEmpty(this.Q) || TextUtils.isEmpty(this.R)) ? false : true;
    }

    public boolean n() {
        return this.P;
    }

    public final boolean o() {
        return byf.a() == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        g(canvas);
        h(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            this.f1610n.j();
            this.m.j();
        } else {
            this.f1610n.b();
            this.m.b();
        }
        ViewParent parent = getParent();
        if (this.q == 1 && (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren()) {
            bj2.g(c0, "Button parent view should set clip children false to make drawing focused stroke effect works.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.J.right = getWidth();
        this.J.bottom = getHeight();
        this.K.set(this.J);
        if (v()) {
            RectF rectF = this.L;
            Rect rect = this.J;
            float f = rect.top;
            float f2 = this.z;
            rectF.top = f + f2;
            rectF.left = rect.left + f2;
            rectF.right = rect.right - f2;
            rectF.bottom = rect.bottom - f2;
            return;
        }
        RectF rectF2 = this.L;
        Rect rect2 = this.J;
        float f3 = rect2.top;
        float f4 = this.z;
        rectF2.top = f3 + (f4 / 2.0f);
        rectF2.left = rect2.left + (f4 / 2.0f);
        rectF2.right = rect2.right - (f4 / 2.0f);
        rectF2.bottom = rect2.bottom - (f4 / 2.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        this.F = View.MeasureSpec.getSize(i);
        this.G = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == 1073741824) {
            this.I = this.F;
        } else {
            this.I = 0;
        }
        if (mode == 1073741824) {
            this.H = this.G;
        } else {
            this.H = 0;
        }
        int iQ = q(mode2);
        if (iQ != 0) {
            i = iQ;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        xid xidVar = this.W;
        if (xidVar != null) {
            xidVar.a(this, i, i2, i3, i4);
        }
        if (m()) {
            setText(this.Q);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ejd ejdVar = this.a0;
        if (ejdVar != null) {
            ejdVar.b(this, charSequence, i, i2, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.p) {
            int action = motionEvent.getAction();
            if (action == 0) {
                r();
                this.m.a();
                this.f1609l.i(true);
            } else if (action == 1 || action == 3) {
                r();
                this.m.f();
                this.f1609l.i(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final int q(int i) {
        if (!this.T || i == 0 || getLayoutParams() == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i2 = this.F;
        int i3 = this.S;
        if (i2 <= i3) {
            return 0;
        }
        layoutParams.width = i3;
        return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    public final void r() {
        if (this.N) {
            performHapticFeedback(302);
        }
    }

    public void s(boolean z, String str) {
        if (!z || TextUtils.isEmpty(getText()) || TextUtils.isEmpty(str)) {
            return;
        }
        this.O = true;
        this.R = str;
        t();
        setText(getText());
    }

    public void setAnimEnable(boolean z) {
        this.p = z;
    }

    public void setAnimType(int i) {
        this.q = i;
        if (i == 1 || i == 0) {
            this.m.s(true);
            this.m.F(0);
            this.f1610n.s(true);
            this.o.q(false);
        } else if (i == 2) {
            this.m.s(true);
            this.m.F(1);
            this.f1610n.s(false);
            this.o.q(false);
        }
        w();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        hm2 hm2Var = this.f1609l;
        if (hm2Var == null) {
            super.setBackground(drawable);
        } else if (drawable == null) {
            hm2Var.j(new ColorDrawable(0));
        } else {
            hm2Var.j(drawable);
        }
    }

    public void setDescText(String str) {
        this.R = str;
        if (m()) {
            setText(getText());
        }
    }

    public void setDisabledColor(int i) {
        this.u = i;
    }

    public void setDrawableColor(int i) {
        this.t = i;
    }

    public void setDrawableRadius(int i) {
        this.v = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (z != isEnabled() && m()) {
            setText(this.Q);
        }
        super.setEnabled(z);
    }

    public void setIsNeedVibrate(boolean z) {
        this.N = z;
    }

    public void setLimitHeight(boolean z) {
        this.P = z;
    }

    public void setMaxBrightness(int i) {
        this.w = i;
    }

    @Override // android.widget.TextView
    public void setMinHeight(int i) {
        int dimensionPixelSize;
        if (m() && i < (dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_btn_large_height_min))) {
            i = dimensionPixelSize;
        }
        super.setMinHeight(i);
    }

    public void setNeedLimitMaxWidth(boolean z) {
        this.T = z;
    }

    public void setOnSizeChangeListener(xid xidVar) {
        this.W = xidVar;
    }

    public void setOnTextChangeListener(ejd ejdVar) {
        this.a0 = ejdVar;
    }

    public void setRoundType(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid roundType" + i);
        }
        if (this.r != i) {
            this.r = i;
            invalidate();
        }
    }

    public void setScaleEnable(boolean z) {
        this.k = z;
        hm2 hm2Var = this.f1609l;
        if (hm2Var != null) {
            if (z) {
                hm2Var.c(this, 2);
            } else {
                hm2Var.a();
            }
        }
    }

    public void setStrokeColor(int i) {
        this.C = i;
    }

    public void setStrokeWidth(@Px float f) {
        this.z = f;
    }

    @Override // android.widget.TextView
    public void setText(final CharSequence charSequence, final TextView.BufferType bufferType) {
        if (!this.O || TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(this.R)) {
            super.setText(charSequence, bufferType);
        } else {
            post(new Runnable() { // from class: com.oplus.aiunit.vision.zf2
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.p(charSequence, bufferType);
                }
            });
        }
        this.Q = charSequence == null ? null : charSequence.toString();
    }

    public final void t() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_padding_horizontal);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_padding_vertical);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setGravity(17);
        int iE = (int) gg2.e(getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_height_min), getResources().getConfiguration().fontScale);
        setMinHeight(iE);
        setMinimumHeight(iE);
        setMinWidth(0);
        setMinimumWidth(0);
        requestLayout();
    }

    public final void u() {
        if (this.q == 1) {
            setBackgroundDrawable(null);
        }
    }

    public final boolean v() {
        return o() && this.r == 0;
    }

    public final void w() {
        xl2.a(this.i, this.K, getDrawableRadius());
    }

    public COUIButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public COUIButton(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.i = new Path();
        this.f1608j = new Path();
        this.k = true;
        this.s = new Paint(1);
        this.v = 21.0f;
        this.x = 1.0f;
        this.y = 1.0f;
        this.E = 0;
        this.J = new Rect();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new float[3];
        this.P = true;
        this.T = false;
        this.V = new Rect();
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.D = attributeSet.getStyleAttribute();
        } else {
            this.D = i;
        }
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIButton, i, 0);
        this.p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_animEnable, false);
        this.q = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIButton_animType, 1);
        this.r = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIButton_couiRoundType, 0);
        this.N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_needVibrate, true);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_scaleEnable, this.k);
        if (this.p) {
            this.w = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUIButton_brightness, 0.8f);
            this.v = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIButton_drawableRadius, -1.0f);
            f(typedArrayObtainStyledAttributes);
            this.t = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIButton_drawableColor, 0);
            this.C = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIButton_strokeColor, 0);
            this.E = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIButton_pressColor, 0);
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_closeLimitTextSize, false);
            u();
        } else {
            z = false;
        }
        this.z = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIButton_strokeWidth, context.getResources().getDimension(R$dimen.coui_bordless_btn_stroke_width));
        this.S = getResources().getDimensionPixelSize(R$dimen.coui_single_larger_btn_width);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_isDescType, false);
        this.O = z2;
        if (z2 && !TextUtils.isEmpty(getText())) {
            this.R = typedArrayObtainStyledAttributes.getString(R$styleable.COUIButton_descText);
            this.Q = getText().toString();
            if (m()) {
                s(this.O, this.R);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.A = getResources().getDimension(R$dimen.coui_button_radius_offset);
        if (!z) {
            gg2.c(this, 4);
        }
        l(context);
        if (v()) {
            setOutlineProvider(new a());
            setClipToOutline(true);
            byg.b(this);
            this.b0 = lh2.e(getContext(), R$attr.couiRoundCornerXXLWeight);
        }
    }
}
