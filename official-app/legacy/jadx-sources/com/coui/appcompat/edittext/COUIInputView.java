package com.coui.appcompat.edittext;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.kf4;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.sh2;
import com.oplus.aiunit.vision.xkf;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.input.R$dimen;
import com.support.input.R$id;
import com.support.input.R$layout;
import com.support.input.R$style;
import com.support.input.R$styleable;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIInputView extends ConstraintLayout {
    public static final int INPUT_TYPE_NUMBER = 1;
    public static final int INPUT_TYPE_NUMBER_PASSWORD = 2;
    public static final int INPUT_TYPE_TEXT = 0;
    public Paint A;
    public boolean B;
    public boolean C;
    public ImageButton D;
    public TextWatcher E;
    public View.OnFocusChangeListener F;
    public int G;
    public CheckBox H;
    public int I;
    public String J;
    public String K;
    public Runnable L;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f1719j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1720l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public COUIEditText f1721n;
    public l o;
    public CharSequence p;
    public CharSequence q;
    public boolean r;
    public int s;
    public boolean t;
    public TextView u;
    public TextView v;
    public ValueAnimator w;
    public ValueAnimator x;
    public PathInterpolator y;
    public LinearLayout z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUIInputView.this.u.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUIInputView.this.u.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIInputView cOUIInputView = COUIInputView.this;
            cOUIInputView.f1721n.setPaddingRelative(0, cOUIInputView.getEdittextPaddingTop(), COUIInputView.this.getEdittextPaddingEnd(), COUIInputView.this.getEdittextPaddingBottom());
            TextView textView = COUIInputView.this.v;
            textView.setPaddingRelative(textView.getPaddingStart(), COUIInputView.this.getTitlePaddingTop(), COUIInputView.this.v.getPaddingEnd(), COUIInputView.this.v.getPaddingBottom());
            ifk.s(COUIInputView.this.i, 1, (COUIInputView.this.getEdittextPaddingTop() - COUIInputView.this.getEdittextPaddingBottom()) / 2);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            COUIInputView.this.f1721n.getTextDeleteListener();
            COUIInputView.this.f1721n.I();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class d implements COUIEditText.h {
        public d() {
        }

        @Override // com.coui.appcompat.edittext.COUIEditText.h
        public void onErrorStateChangeAnimationEnd(boolean z) {
        }

        @Override // com.coui.appcompat.edittext.COUIEditText.h
        public void onErrorStateChanged(boolean z) {
            COUIInputView.this.f1721n.setSelectAllOnFocus(z);
            if (z) {
                COUIInputView.this.showErrorMsgAnim();
            } else {
                COUIInputView.this.hideErrorMsgAnim();
            }
            COUIInputView.h(COUIInputView.this);
        }
    }

    public class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            COUIInputView cOUIInputView = COUIInputView.this;
            if (cOUIInputView.k && cOUIInputView.f1720l > 0) {
                l lVar = cOUIInputView.o;
                if (lVar != null) {
                    lVar.a(editable);
                } else {
                    int length = editable.length();
                    COUIInputView cOUIInputView2 = COUIInputView.this;
                    if (length < cOUIInputView2.f1720l) {
                        cOUIInputView2.f1719j.setText(length + "/" + COUIInputView.this.f1720l);
                        COUIInputView cOUIInputView3 = COUIInputView.this;
                        cOUIInputView3.f1719j.setTextColor(lh2.a(cOUIInputView3.getContext(), R$attr.couiColorHintNeutral));
                    } else {
                        cOUIInputView2.f1719j.setText(COUIInputView.this.f1720l + "/" + COUIInputView.this.f1720l);
                        COUIInputView cOUIInputView4 = COUIInputView.this;
                        cOUIInputView4.f1719j.setTextColor(lh2.a(cOUIInputView4.getContext(), R$attr.couiColorError));
                        COUIInputView cOUIInputView5 = COUIInputView.this;
                        int i = cOUIInputView5.f1720l;
                        if (length > i) {
                            cOUIInputView5.f1721n.setText(editable.subSequence(0, i));
                        }
                    }
                }
            }
            COUIInputView cOUIInputView6 = COUIInputView.this;
            cOUIInputView6.B(cOUIInputView6.hasFocus());
            COUIInputView.this.C(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (COUIInputView.this.v() && COUIInputView.this.C) {
                COUIInputView.this.o(charSequence);
            }
        }
    }

    public class f implements View.OnFocusChangeListener {
        public f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            COUIInputView.this.B(z);
            COUIInputView.this.C(true);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIInputView.this.D.setVisibility(0);
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @SensorsDataInstrumented
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                COUIInputView cOUIInputView = COUIInputView.this;
                int i = cOUIInputView.m;
                if (i == 1 || i == 2) {
                    cOUIInputView.f1721n.setInputType(2);
                } else {
                    cOUIInputView.f1721n.setInputType(145);
                }
            } else {
                COUIInputView cOUIInputView2 = COUIInputView.this;
                int i2 = cOUIInputView2.m;
                if (i2 == 1 || i2 == 2) {
                    cOUIInputView2.f1721n.setInputType(18);
                } else {
                    cOUIInputView2.f1721n.setInputType(129);
                }
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInputView.this.u.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class j implements ValueAnimator.AnimatorUpdateListener {
        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInputView.this.u.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface k {
    }

    public interface l {
        void a(Editable editable);
    }

    public COUIInputView(Context context) {
        this(context, null);
    }

    private int getCountTextWidth() {
        if (!this.k) {
            return 0;
        }
        if (this.A == null) {
            Paint paint = new Paint();
            this.A = paint;
            paint.setTextSize(this.f1719j.getTextSize());
        }
        return ((int) this.A.measureText((String) this.f1719j.getText())) + 8;
    }

    private int getCustomButtonShowNum() {
        TextView textView;
        View view = this.i;
        if (!(view instanceof ViewGroup)) {
            return 0;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0 && (textView = this.f1719j) != null && textView.getId() != childAt.getId()) {
                i2++;
            }
        }
        return i2;
    }

    public static /* synthetic */ k h(COUIInputView cOUIInputView) {
        cOUIInputView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i8 - i6 != i4 - i2) {
            C(true);
        }
    }

    public final void A(CharSequence charSequence) {
        if (this.J != null) {
            String strValueOf = String.valueOf(charSequence);
            int selectionStart = this.f1721n.getSelectionStart();
            this.f1721n.setText(strValueOf);
            COUIEditText cOUIEditText = this.f1721n;
            cOUIEditText.setSelection(Math.min(selectionStart, cOUIEditText.getText().length()));
            this.J = null;
        }
    }

    public final void B(boolean z) {
        if (this.D != null) {
            if (!w() || !z || TextUtils.isEmpty(this.f1721n.getText().toString())) {
                this.D.setVisibility(8);
            } else {
                if (ifk.p(this.D)) {
                    return;
                }
                this.D.setVisibility(4);
                post(new g());
            }
        }
    }

    public final void C(boolean z) {
        if (!z) {
            this.L.run();
        } else {
            this.f1721n.removeCallbacks(this.L);
            this.f1721n.post(this.L);
        }
    }

    public TextView getCountTextView() {
        return this.f1719j;
    }

    public COUIEditText getEditText() {
        return this.f1721n;
    }

    public int getEdittextPaddingBottom() {
        return !TextUtils.isEmpty(this.q) ? getResources().getDimensionPixelSize(R$dimen.coui_input_edit_error_text_has_title_padding_bottom) : (int) getResources().getDimension(com.support.appcompat.R$dimen.coui_input_edit_text_no_title_padding_bottom);
    }

    public int getEdittextPaddingEnd() {
        return this.i.getWidth();
    }

    public int getEdittextPaddingTop() {
        return !TextUtils.isEmpty(this.q) ? getResources().getDimensionPixelSize(R$dimen.coui_input_edit_text_has_title_padding_top) : (int) getResources().getDimension(com.support.appcompat.R$dimen.coui_input_edit_text_no_title_padding_top);
    }

    public CharSequence getHint() {
        return this.p;
    }

    public int getLayoutResId() {
        return R$layout.coui_input_view;
    }

    public int getMaxCount() {
        return this.f1720l;
    }

    public CharSequence getTitle() {
        return this.q;
    }

    public int getTitlePaddingTop() {
        return getResources().getDimensionPixelSize(R$dimen.coui_input_preference_title_padding_top);
    }

    public void handleWithCount() {
        p();
        if (this.E == null) {
            e eVar = new e();
            this.E = eVar;
            this.f1721n.addTextChangedListener(eVar);
        }
        if (this.F == null) {
            f fVar = new f();
            this.F = fVar;
            this.f1721n.setOnFocusChangeListener(fVar);
        }
    }

    public final void handleWithError() {
        if (!this.t) {
            this.u.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.u.getText())) {
            this.u.setVisibility(0);
        }
        this.f1721n.addOnErrorStateChangedListener(new d());
    }

    public void handleWithPassword() {
        if (!u()) {
            this.H.setVisibility(8);
            setInputType();
            return;
        }
        this.H.setVisibility(0);
        if (this.s == 1) {
            this.H.setChecked(false);
            int i2 = this.m;
            if (i2 == 1 || i2 == 2) {
                this.f1721n.setInputType(18);
            } else {
                this.f1721n.setInputType(129);
            }
        } else {
            this.H.setChecked(true);
            int i3 = this.m;
            if (i3 == 1 || i3 == 2) {
                this.f1721n.setInputType(2);
            } else {
                this.f1721n.setInputType(145);
            }
        }
        this.H.setOnCheckedChangeListener(new h());
    }

    public final void handleWithTitle() {
        if (TextUtils.isEmpty(this.q)) {
            return;
        }
        this.v.setText(this.q);
        this.v.setVisibility(0);
    }

    public final void hideErrorMsgAnim() {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.w.cancel();
        }
        if (this.x == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.x = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(283L).setInterpolator(this.y);
            this.x.addUpdateListener(new j());
            this.x.addListener(new a());
        }
        if (this.x.isStarted()) {
            this.x.cancel();
        }
        this.x.start();
    }

    public final void init() {
        handleWithTitle();
        this.f1721n.setTopHint(this.p);
        if (this.B) {
            this.f1721n.setDefaultStrokeColor(lh2.a(getContext(), R$attr.couiColorPrimary));
        }
        handleWithCount();
        handleWithPassword();
        handleWithError();
        q();
        C(false);
    }

    public final void o(CharSequence charSequence) {
        if (Locale.getDefault().getLanguage().equals("zh")) {
            String str = this.K;
            if (str == null || !str.equals(charSequence.toString())) {
                this.K = charSequence.toString();
                boolean zB = xkf.b(charSequence);
                boolean zA = xkf.a(charSequence);
                if (!zB && !zA) {
                    A(charSequence);
                    return;
                }
                this.J = charSequence.toString();
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length() / 4;
                for (int i2 = 0; i2 < length; i2++) {
                    if (zB) {
                        int i3 = (i2 + 1) * 4;
                        spannableString.setSpan(new kf4(), i3 - 2, i3 - 1, 17);
                    } else {
                        int i4 = (i2 + 1) * 4;
                        spannableString.setSpan(new kf4(), i4 - 1, i4, 17);
                    }
                }
                int selectionStart = this.f1721n.getSelectionStart();
                this.f1721n.setText(spannableString);
                COUIEditText cOUIEditText = this.f1721n;
                cOUIEditText.setSelection(Math.min(selectionStart, cOUIEditText.getText().length()));
            }
        }
    }

    public void p() {
        if (!this.k || this.f1720l <= 0) {
            this.f1719j.setVisibility(8);
            return;
        }
        this.f1719j.setVisibility(0);
        this.f1719j.setText(this.f1721n.getText().length() + "/" + this.f1720l);
    }

    public final void q() {
        if (this.D == null || this.f1721n.G()) {
            return;
        }
        this.D.setOnClickListener(new c());
    }

    public final void r() {
        View view = this.i;
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.oplus.aiunit.vision.ui2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    this.i.x(view2, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
    }

    public COUIEditText s(Context context, AttributeSet attributeSet) {
        context.getTheme().applyStyle(R$style.COUIInputViewStyle, true);
        COUIEditText cOUIEditText = new COUIEditText(context, attributeSet, com.support.input.R$attr.couiInputPreferenceEditTextStyle);
        cOUIEditText.setShowDeleteIcon(false);
        cOUIEditText.setVerticalScrollBarEnabled(false);
        cOUIEditText.setMinHeight(this.I);
        return cOUIEditText;
    }

    public void setCustomFormat(Boolean bool) {
        this.C = bool.booleanValue();
        if (this.f1721n.getText() == null) {
            return;
        }
        if (v() && this.C) {
            o(this.f1721n.getText());
        } else {
            A(this.f1721n.getText());
        }
    }

    public void setEnableError(boolean z) {
        if (this.t != z) {
            this.t = z;
            handleWithError();
            C(false);
        }
    }

    public void setEnableInputCount(boolean z) {
        this.k = z;
        handleWithCount();
        C(true);
    }

    public void setEnablePassword(boolean z) {
        if (this.r != z) {
            this.r = z;
            handleWithPassword();
            C(true);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f1721n.setEnabled(z);
        this.v.setEnabled(z);
        this.i.setEnabled(z);
        this.H.setEnabled(z);
        this.f1719j.setEnabled(z);
    }

    public void setErrorStateChangeCallBack(k kVar) {
    }

    public void setHint(CharSequence charSequence) {
        this.p = charSequence;
        this.f1721n.setTopHint(charSequence);
    }

    public final void setInputType() {
        int i2 = this.m;
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            this.f1721n.setInputType(1);
            return;
        }
        if (i2 == 1) {
            this.f1721n.setInputType(2);
        } else if (i2 != 2) {
            this.f1721n.setInputType(0);
        } else {
            this.f1721n.setInputType(18);
        }
    }

    public void setMaxCount(int i2) {
        this.f1720l = i2;
        handleWithCount();
    }

    public void setOnEditTextChangeListener(l lVar) {
        this.o = lVar;
    }

    public void setPasswordType(int i2) {
        if (this.s != i2) {
            this.s = i2;
            handleWithPassword();
            C(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null || charSequence.equals(this.q)) {
            return;
        }
        this.q = charSequence;
        handleWithTitle();
        C(false);
    }

    public void showError(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f1721n.setErrorState(false);
        } else {
            this.f1721n.setErrorState(true);
            if (this.t) {
                this.u.setVisibility(0);
            }
        }
        this.u.setText(charSequence);
    }

    public final void showErrorMsgAnim() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.x.cancel();
        }
        this.u.setVisibility(0);
        if (this.w == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(217L).setInterpolator(this.y);
            this.w.addUpdateListener(new i());
        }
        if (this.w.isStarted()) {
            this.w.cancel();
        }
        this.w.start();
    }

    public boolean t() {
        return this.k;
    }

    public final boolean u() {
        if (this.H.getVisibility() == 0) {
            return this.r;
        }
        return this.r && getCustomButtonShowNum() < 2;
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        if (this.D.getVisibility() == 0) {
            return this.f1721n.C();
        }
        return this.f1721n.C() && getCustomButtonShowNum() < 2;
    }

    public void y(Context context, AttributeSet attributeSet) {
        COUIEditText cOUIEditTextS = s(context, attributeSet);
        this.f1721n = cOUIEditTextS;
        cOUIEditTextS.setMaxLines(5);
        this.z.addView(this.f1721n, -1, -2);
        init();
    }

    public void z(Context context, AttributeSet attributeSet) {
        y(context, attributeSet);
    }

    public COUIInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIInputView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = null;
        this.y = new sh2();
        this.A = null;
        this.B = false;
        this.C = true;
        this.L = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIInputView, i2, 0);
        this.q = typedArrayObtainStyledAttributes.getText(R$styleable.COUIInputView_couiTitle);
        this.p = typedArrayObtainStyledAttributes.getText(R$styleable.COUIInputView_couiHint);
        this.r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiEnablePassword, false);
        this.s = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIInputView_couiPasswordType, 0);
        this.t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiEnableError, false);
        this.f1720l = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIInputView_couiInputMaxCount, 0);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiEnableInputCount, false);
        this.m = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIInputView_couiInputType, -1);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiInputCustomFormat, true);
        this.B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputView_couiEditLineColor, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), (ViewGroup) this, true);
        this.v = (TextView) findViewById(R$id.title);
        this.f1719j = (TextView) findViewById(R$id.input_count);
        this.u = (TextView) findViewById(R$id.text_input_error);
        this.i = findViewById(R$id.button_layout);
        this.z = (LinearLayout) findViewById(R$id.edittext_container);
        this.D = (ImageButton) findViewById(R$id.delete_button);
        this.H = (CheckBox) findViewById(R$id.checkbox_password);
        this.G = getResources().getDimensionPixelSize(R$dimen.coui_inputview_delete_button_margin_end_with_passwordicon);
        this.I = getResources().getDimensionPixelOffset(R$dimen.coui_inputView_edittext_content_minheight);
        z(context, attributeSet);
        r();
    }
}
