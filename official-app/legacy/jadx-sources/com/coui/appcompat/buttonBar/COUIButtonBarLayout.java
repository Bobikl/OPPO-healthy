package com.coui.appcompat.buttonBar;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.coui.appcompat.button.COUIButton;
import com.oplus.aiunit.vision.lh2;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$color;
import com.support.dialog.R$dimen;
import com.support.dialog.R$id;
import com.support.dialog.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIButtonBarLayout extends LinearLayout {
    public static final int NO_RECOMMEND_ID = -1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int a0;
    public boolean b0;
    public boolean c0;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIButton f1614j;
    public COUIButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIButton f1615l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f1616n;
    public View o;
    public View p;
    public View q;
    public View r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public COUIButtonBarLayout(Context context) {
        super(context, null);
        this.I = true;
        this.J = true;
        this.Q = -1;
        this.b0 = true;
        this.c0 = false;
    }

    private void setButHorizontal(COUIButton cOUIButton) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((LinearLayout) cOUIButton.getParent()).getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = 0;
        if (this.Q != -1) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = -1;
        }
        layoutParams.gravity = 16;
        ((LinearLayout) cOUIButton.getParent()).setLayoutParams(layoutParams);
        int i = this.s;
        int i2 = this.v;
        int i3 = this.w;
        if (this.Q != -1) {
            i = this.t;
            i2 = this.u;
            i3 = i2;
        }
        cOUIButton.setMinimumHeight(this.G);
        cOUIButton.setPaddingRelative(i, i2, i, i3);
    }

    public final void A() {
        B(this.f1614j);
        B(this.f1615l);
        B(this.k);
        if (this.Q != -1) {
            b(this.f1614j);
            b(this.k);
            b(this.f1615l);
        }
    }

    public final void B(COUIButton cOUIButton) {
        if (d(cOUIButton)) {
            ((ViewGroup) cOUIButton.getParent()).setVisibility(0);
        }
    }

    public final void C(View... viewArr) {
        e();
        if (!this.I || viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    public final void a(COUIButton cOUIButton) {
        ViewGroup.LayoutParams layoutParams = cOUIButton.getLayoutParams();
        layoutParams.height = -1;
        cOUIButton.setMaxLines(2);
        cOUIButton.setEllipsize(TextUtils.TruncateAt.END);
        String string = cOUIButton.getText().toString();
        int measuredWidth = (cOUIButton.getMeasuredWidth() - cOUIButton.getPaddingLeft()) - cOUIButton.getPaddingRight();
        float fMeasureText = cOUIButton.getPaint().measureText(string);
        int i = this.V;
        if (fMeasureText > measuredWidth) {
            i = this.W;
        }
        int i2 = this.t;
        cOUIButton.setPadding(i2, i, i2, i);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.U) {
                int i3 = this.T;
                COUIButton cOUIButton2 = this.k;
                int i4 = (cOUIButton == cOUIButton2 || (cOUIButton == this.f1614j && !d(cOUIButton2)) || !(cOUIButton != this.f1615l || d(this.f1614j) || d(this.k))) ? this.M + i3 : i3;
                cOUIButton.setMinimumHeight(this.y);
                int i5 = this.R;
                marginLayoutParams.setMargins(i5, i3, i5, i4);
            }
        }
        cOUIButton.setLayoutParams(layoutParams);
    }

    public final void b(COUIButton cOUIButton) {
        if (d(cOUIButton)) {
            if (cOUIButton.getId() == this.Q) {
                if (cOUIButton.getDrawableColor() == getResources().getColor(R$color.coui_transparence)) {
                    cOUIButton.setDrawableColor(lh2.b(getContext(), R$attr.couiColorContainerTheme, 0));
                }
                cOUIButton.setTextColor(ContextCompat.getColorStateList(this.i, R$color.coui_btn_default_text_color));
                cOUIButton.setAnimType(1);
                cOUIButton.setScaleEnable(true);
                cOUIButton.setAnimEnable(true);
                cOUIButton.setDisabledColor(lh2.a(getContext(), R$attr.couiColorDisable));
            } else {
                cOUIButton.setAnimType(0);
            }
            cOUIButton.setDrawableRadius(-1);
        }
    }

    public final int c(Button button) {
        if (button == null || button.getVisibility() != 0) {
            return 0;
        }
        return (int) (button.isAllCaps() ? button.getPaint().measureText(button.getText().toString().toUpperCase()) : button.getPaint().measureText(button.getText().toString()));
    }

    public final boolean d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public final void e() {
        this.m.setVisibility(8);
        this.f1616n.setVisibility(8);
    }

    public final void f(Context context, AttributeSet attributeSet) {
        this.i = context;
        this.s = context.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_horizontal_padding);
        this.t = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_horizontal_padding_with_recommend);
        this.u = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_vertical_padding_with_recommend);
        this.v = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_padding_top);
        this.w = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_padding_bottom);
        this.B = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_vertical_button_min_height);
        int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R$dimen.coui_center_alert_dialog_vertical_button_paddingbottom_vertical_extra);
        this.x = dimensionPixelSize;
        this.C = this.B + dimensionPixelSize;
        Resources resources = this.i.getResources();
        int i = R$dimen.coui_bottom_alert_dialog_horizontal_button_margin_recommend;
        this.D = resources.getDimensionPixelSize(i);
        this.E = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_horizontal_button_padding_top_extra_divider_new);
        this.F = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_horizontal_button_padding_bottom_extra_divider_new);
        this.G = this.i.getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_button_height);
        this.P = this.i.getResources().getDimensionPixelSize(R$dimen.coui_dialog_max_width);
        this.A = this.i.getResources().getDimensionPixelSize(R$dimen.coui_delete_alert_dialog_divider_height_horizontalbutton);
        TypedArray typedArrayObtainStyledAttributes = this.i.obtainStyledAttributes(attributeSet, R$styleable.COUIButtonBarLayout);
        this.I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButtonBarLayout_buttonBarShowDivider, true);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIButtonBarLayout_buttonBarDividerSize, this.i.getResources().getDimensionPixelSize(R$dimen.coui_delete_alert_dialog_divider_height_verticalbutton));
        this.L = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_top_extra_new);
        this.M = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_bottom_extra_new);
        this.K = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_vertical_new);
        this.N = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_horizontal_button_padding_top_extra_new);
        this.O = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_horizontal_button_padding_bottom_extra_new);
        this.S = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_horizontal_button_margin_default);
        this.R = this.i.getResources().getDimensionPixelSize(i);
        this.V = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_recommend_button_padding_vertical);
        this.W = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_recommend_button_padding_vertical_multi_line);
        this.T = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_margin_nonrecommend);
        this.a0 = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_buttonbar_margintop);
        this.y = this.i.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_button_recommend_height);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        if (this.f1614j == null || this.k == null || this.f1615l == null || this.m == null || this.f1616n == null) {
            this.f1614j = (COUIButton) findViewById(R.id.button1);
            this.k = (COUIButton) findViewById(R.id.button2);
            this.f1615l = (COUIButton) findViewById(R.id.button3);
            this.m = findViewById(R$id.coui_dialog_button_divider_1);
            this.f1616n = findViewById(R$id.coui_dialog_button_divider_2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public int getButtonCount() {
        ?? D = d(this.f1614j);
        int i = D;
        if (d(this.k)) {
            i = D + 1;
        }
        return d(this.f1615l) ? i + 1 : i;
    }

    public final void h() {
        if (this.o == null || this.p == null || this.q == null || this.r == null) {
            View view = (View) getParent().getParent();
            this.o = view;
            this.p = view.findViewById(R$id.topPanel);
            this.q = this.o.findViewById(R$id.contentPanel);
            this.r = this.o.findViewById(R$id.customPanel);
        }
    }

    public final boolean i(int i) {
        int buttonCount = getButtonCount();
        if (buttonCount == 0) {
            return false;
        }
        int i2 = ((i - ((buttonCount - 1) * this.z)) / buttonCount) - (this.s * 2);
        return c(this.f1614j) > i2 || c(this.k) > i2 || c(this.f1615l) > i2;
    }

    public final void j() {
        w(this.k, this.N);
        v(this.k, this.O);
        w(this.f1614j, this.N);
        v(this.f1614j, this.O);
        w(this.f1615l, this.N);
        v(this.f1615l, this.O);
    }

    public final void k() {
        if (getButtonCount() != 2) {
            if (getButtonCount() == 3) {
                C(this.m, this.f1616n);
                return;
            } else {
                e();
                return;
            }
        }
        if (!d(this.k)) {
            C(this.f1616n);
        } else if (d(this.f1615l) || d(this.f1614j)) {
            C(this.m);
        } else {
            e();
        }
    }

    public final void l() {
        int i;
        int i2;
        if (d(this.k)) {
            if (getButtonCount() > 1) {
                i = this.K;
                if (!d(this.f1614j) && !d(this.f1615l) && !d(this.p) && !d(this.q) && !d(this.r)) {
                    i += this.L;
                }
                i2 = this.K + this.M;
            } else {
                i = this.N;
                i2 = this.O;
                this.k.setMinimumHeight(this.G);
            }
            COUIButton cOUIButton = this.k;
            cOUIButton.setPaddingRelative(cOUIButton.getPaddingStart(), i, this.k.getPaddingEnd(), i2);
        }
        if (d(this.f1614j)) {
            int i3 = this.K;
            int i4 = (d(this.f1615l) || d(this.p) || d(this.q) || d(this.r)) ? i3 : this.L + i3;
            if (!d(this.k)) {
                i3 += this.M;
            }
            COUIButton cOUIButton2 = this.f1614j;
            cOUIButton2.setPaddingRelative(cOUIButton2.getPaddingStart(), i4, this.f1614j.getPaddingEnd(), i3);
        }
        if (d(this.f1615l)) {
            int i5 = this.K;
            int i6 = (d(this.p) || d(this.q) || d(this.r)) ? i5 : this.L + i5;
            if (!d(this.k) && !d(this.f1614j)) {
                i5 += this.M;
            }
            COUIButton cOUIButton3 = this.f1615l;
            cOUIButton3.setPaddingRelative(cOUIButton3.getPaddingStart(), i6, this.f1615l.getPaddingEnd(), i5);
        }
    }

    public final void m() {
        if (this.Q != -1) {
            e();
            return;
        }
        if (getButtonCount() == 0) {
            e();
            return;
        }
        if (!d(this.k)) {
            if (d(this.f1615l) && d(this.f1614j)) {
                C(this.m);
                return;
            } else {
                e();
                return;
            }
        }
        if (d(this.f1615l) && d(this.f1614j)) {
            C(this.m, this.f1616n);
            return;
        }
        if (d(this.f1615l)) {
            C(this.m);
            return;
        }
        if (d(this.f1614j)) {
            C(this.f1616n);
        } else if (this.c0) {
            C(this.f1616n);
        } else {
            e();
        }
    }

    public final void n() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.H);
    }

    public final void o() {
        if (d(this.f1614j) || d(this.k) || d(this.f1615l)) {
            if (getOrientation() == 1) {
                bringChildToFront((View) this.f1615l.getParent());
                bringChildToFront(this.m);
                bringChildToFront((View) this.f1614j.getParent());
                bringChildToFront(this.f1616n);
                bringChildToFront((View) this.k.getParent());
                return;
            }
            bringChildToFront((View) this.k.getParent());
            bringChildToFront(this.m);
            bringChildToFront((View) this.f1615l.getParent());
            bringChildToFront(this.f1616n);
            bringChildToFront((View) this.f1614j.getParent());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        A();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.J && !(!i(Math.min(this.P, getMeasuredWidth())) && getButtonCount() == 2 && this.Q == -1);
        this.U = z;
        if (!z) {
            p();
            j();
            k();
            super.onMeasure(i, i2);
            return;
        }
        q();
        l();
        m();
        n();
        super.onMeasure(i, i2);
        if (this.b0 && (getButtonCount() > 1 || (getButtonCount() == 1 && this.Q != -1))) {
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = this.a0;
            super.onMeasure(i, i2);
        }
        if (this.Q != -1) {
            a(this.f1614j);
            a(this.k);
            a(this.f1615l);
            super.onMeasure(i, i2);
        }
    }

    public final void p() {
        setOrientation(0);
        setGravity(16);
        r();
        setButHorizontal(this.f1615l);
        s();
        setButHorizontal(this.f1614j);
        setButHorizontal(this.k);
    }

    public final void q() {
        setOrientation(1);
        setMinimumHeight(0);
        u();
        y();
        x();
        z();
        t();
    }

    public final void r() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        layoutParams.width = this.A;
        layoutParams.height = -1;
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        layoutParams.topMargin = this.E;
        layoutParams.bottomMargin = this.F;
        this.m.setLayoutParams(layoutParams);
    }

    public final void s() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1616n.getLayoutParams();
        layoutParams.width = this.A;
        layoutParams.height = -1;
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        layoutParams.topMargin = this.E;
        layoutParams.bottomMargin = this.F;
        this.f1616n.setLayoutParams(layoutParams);
    }

    public void setDynamicLayout(boolean z) {
        this.J = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            super.setOrientation(i);
            o();
        }
    }

    public void setRecommendButtonId(int i) {
        this.Q = i;
    }

    public void setShowDividerWhenHasItems(boolean z) {
        this.c0 = z;
    }

    public void setTopMarginFlag(boolean z) {
        this.b0 = z;
    }

    @Deprecated
    public void setVerButDividerVerMargin(int i) {
    }

    @Deprecated
    public void setVerButPaddingOffset(int i) {
    }

    @Deprecated
    public void setVerButVerPadding(int i) {
    }

    @Deprecated
    public void setVerNegButVerPaddingOffset(int i) {
    }

    public void setVerPaddingBottom(int i) {
        this.H = i;
    }

    public final void t() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((View) this.k.getParent()).getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.k.setMinimumHeight(this.C);
        ((View) this.k.getParent()).setLayoutParams(layoutParams);
    }

    public final void u() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((View) this.f1615l.getParent()).getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        if (d(this.k) || d(this.f1614j)) {
            this.f1615l.setMinimumHeight(this.B);
        } else {
            this.f1615l.setMinimumHeight(this.C);
        }
        ((View) this.f1615l.getParent()).setLayoutParams(layoutParams);
    }

    public final void v(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    public final void w(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public final void x() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((View) this.f1614j.getParent()).getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        if (d(this.k)) {
            this.f1614j.setMinimumHeight(this.B);
        } else {
            this.f1614j.setMinimumHeight(this.C);
        }
        ((View) this.f1614j.getParent()).setLayoutParams(layoutParams);
    }

    public final void y() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = this.z;
        if (this.Q != -1) {
            layoutParams.setMarginStart(this.D);
            layoutParams.setMarginEnd(this.D);
        } else {
            layoutParams.setMarginStart(this.S);
            layoutParams.setMarginEnd(this.S);
        }
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.m.setLayoutParams(layoutParams);
    }

    public final void z() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1616n.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = this.z;
        if (this.Q != -1) {
            layoutParams.setMarginStart(this.D);
            layoutParams.setMarginEnd(this.D);
        } else {
            layoutParams.setMarginStart(this.S);
            layoutParams.setMarginEnd(this.S);
        }
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.f1616n.setLayoutParams(layoutParams);
    }

    public COUIButtonBarLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIButtonBarLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I = true;
        this.J = true;
        this.Q = -1;
        this.b0 = true;
        this.c0 = false;
        f(context, attributeSet);
    }
}
