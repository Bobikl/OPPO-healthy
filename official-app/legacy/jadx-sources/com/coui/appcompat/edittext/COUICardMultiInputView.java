package com.coui.appcompat.edittext;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oplus.aiunit.vision.lh2;
import com.support.appcompat.R$attr;
import com.support.input.R$dimen;
import com.support.input.R$id;
import com.support.input.R$layout;
import com.support.input.R$style;
import com.support.input.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICardMultiInputView extends ConstraintLayout implements View.OnLayoutChangeListener {
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIEditText f1704j;
    public TextWatcher k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f1705l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1706n;
    public int o;
    public InputMethodManager p;
    public Rect q;
    public int r;
    public int s;
    public boolean t;
    public ValueAnimator u;
    public Runnable v;

    public class a implements View.OnTouchListener {
        public final /* synthetic */ int i;

        public a(int i) {
            this.i = i;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && motionEvent.getX() > this.i && motionEvent.getX() < COUICardMultiInputView.this.getWidth() - this.i) {
                if (COUICardMultiInputView.this.p == null) {
                    COUICardMultiInputView cOUICardMultiInputView = COUICardMultiInputView.this;
                    cOUICardMultiInputView.p = (InputMethodManager) cOUICardMultiInputView.getContext().getSystemService("input_method");
                }
                COUICardMultiInputView.this.f1704j.setFocusable(true);
                COUICardMultiInputView.this.f1704j.requestFocus();
                COUICardMultiInputView.this.p.showSoftInput(COUICardMultiInputView.this.f1704j, 0);
            }
            return true;
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (TextUtils.isEmpty(charSequence)) {
                COUICardMultiInputView.this.f1704j.setMaxLines(3);
                COUICardMultiInputView.this.f1704j.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                COUICardMultiInputView.this.f1704j.setMaxLines(5);
                COUICardMultiInputView.this.f1704j.setEllipsize(null);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUICardMultiInputView.this.f1704j.setPadding(COUICardMultiInputView.this.f1704j.getPaddingLeft(), COUICardMultiInputView.this.f1704j.getPaddingTop(), COUICardMultiInputView.this.f1704j.getPaddingRight(), COUICardMultiInputView.this.m.getMeasuredHeight());
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.length();
            if (length < COUICardMultiInputView.this.o) {
                COUICardMultiInputView.this.m.setText(length + "/" + COUICardMultiInputView.this.o);
                if (COUICardMultiInputView.this.t) {
                    COUICardMultiInputView cOUICardMultiInputView = COUICardMultiInputView.this;
                    cOUICardMultiInputView.q(cOUICardMultiInputView.s, lh2.a(COUICardMultiInputView.this.getContext(), R$attr.couiColorHintNeutral));
                    COUICardMultiInputView.this.f1704j.removeCallbacks(COUICardMultiInputView.this.v);
                }
                COUICardMultiInputView.this.t = false;
                return;
            }
            COUICardMultiInputView.this.m.setText(COUICardMultiInputView.this.o + "/" + COUICardMultiInputView.this.o);
            if (length > COUICardMultiInputView.this.o) {
                COUICardMultiInputView.this.f1704j.setText(editable.subSequence(0, COUICardMultiInputView.this.o));
            }
            COUICardMultiInputView cOUICardMultiInputView2 = COUICardMultiInputView.this;
            cOUICardMultiInputView2.q(cOUICardMultiInputView2.s, lh2.a(COUICardMultiInputView.this.getContext(), R$attr.couiColorError));
            COUICardMultiInputView.this.f1704j.removeCallbacks(COUICardMultiInputView.this.v);
            COUICardMultiInputView.this.f1704j.postDelayed(COUICardMultiInputView.this.v, 1000L);
            COUICardMultiInputView.this.t = true;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (COUICardMultiInputView.this.t) {
                COUICardMultiInputView cOUICardMultiInputView = COUICardMultiInputView.this;
                cOUICardMultiInputView.q(cOUICardMultiInputView.s, lh2.a(COUICardMultiInputView.this.getContext(), R$attr.couiColorHintNeutral));
                COUICardMultiInputView.this.t = false;
            }
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUICardMultiInputView.this.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            COUICardMultiInputView.this.m.setTextColor(COUICardMultiInputView.this.s);
        }
    }

    public COUICardMultiInputView(Context context) {
        this(context, null);
    }

    public COUIEditText getEditText() {
        return this.f1704j;
    }

    public CharSequence getHint() {
        return this.i;
    }

    public int getLayoutResId() {
        return R$layout.coui_multi_input_card_view;
    }

    public final void handleWithCount() {
        if (!this.f1706n || this.o <= 0) {
            this.m.setVisibility(8);
            COUIEditText cOUIEditText = this.f1704j;
            cOUIEditText.setPadding(cOUIEditText.getPaddingLeft(), this.f1704j.getPaddingTop(), this.f1704j.getPaddingRight(), this.f1704j.getPaddingTop());
            return;
        }
        this.m.setVisibility(0);
        this.m.setText(this.f1704j.getText().length() + "/" + this.o);
        this.f1704j.post(new c());
        this.f1704j.addTextChangedListener(new d());
    }

    public final void init() {
        if (this.k == null) {
            this.k = new b();
        }
        this.f1704j.addTextChangedListener(this.k);
        this.f1704j.setTopHint(this.i);
        handleWithCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        p();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.r = (((this.f1705l.getMeasuredHeight() - this.f1705l.getPaddingTop()) - this.f1705l.getPaddingBottom()) - this.f1704j.getPaddingTop()) - this.f1704j.getPaddingBottom();
            boolean z = this.f1704j.getLineCount() * this.f1704j.getLineHeight() > this.r;
            if (this.q.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && z && this.f1704j.getLineCount() >= 1) {
                this.f1705l.requestDisallowInterceptTouchEvent(true);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = this.q;
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        this.q.bottom = getMeasuredHeight() - this.f1705l.getPaddingBottom();
    }

    public final void p() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.u.cancel();
    }

    public final void q(int i, int i2) {
        p();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.u = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new f());
        this.u.setDuration(250L);
        this.u.setEvaluator(new ArgbEvaluator());
        this.u.start();
    }

    public COUIEditText r(Context context, AttributeSet attributeSet) {
        context.getTheme().applyStyle(R$style.COUIMultiInputViewStyle, true);
        return new COUIEditText(context, attributeSet, com.support.input.R$attr.couiCardMultiInputEditTextStyle);
    }

    public final void s() {
        Runnable runnable;
        COUIEditText cOUIEditText = this.f1704j;
        if (cOUIEditText == null || (runnable = this.v) == null) {
            return;
        }
        cOUIEditText.removeCallbacks(runnable);
    }

    public void setHint(CharSequence charSequence) {
        this.i = charSequence;
        this.f1704j.setTopHint(charSequence);
    }

    public void setMaxCount(int i) {
        this.o = i;
        handleWithCount();
    }

    public COUICardMultiInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICardMultiInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = null;
        this.q = new Rect();
        this.t = false;
        this.v = new e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIInputView, i, 0);
        this.i = typedArrayObtainStyledAttributes.getText(R$styleable.COUIInputView_couiHint);
        this.o = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIInputView_couiInputMaxCount, 0);
        this.f1706n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiEnableInputCount, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), (ViewGroup) this, true);
        this.f1705l = (LinearLayout) findViewById(R$id.edittext_container);
        COUIEditText cOUIEditTextR = r(context, attributeSet);
        this.f1704j = cOUIEditTextR;
        cOUIEditTextR.setMaxLines(3);
        this.f1704j.setEllipsize(TextUtils.TruncateAt.END);
        this.f1704j.setGravity(8388659);
        this.f1705l.addView(this.f1704j, -1, -1);
        this.f1705l.addOnLayoutChangeListener(this);
        this.m = (TextView) findViewById(R$id.input_count);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.support_preference_category_layout_title_margin_start);
        this.s = lh2.a(getContext(), R$attr.couiColorHintNeutral);
        findViewById(R$id.single_card).setOnTouchListener(new a(dimensionPixelSize));
        init();
    }
}
