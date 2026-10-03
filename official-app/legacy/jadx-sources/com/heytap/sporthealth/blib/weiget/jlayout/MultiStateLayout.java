package com.heytap.sporthealth.blib.weiget.jlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import com.heytap.health.ui.R$attr;
import com.heytap.health.ui.R$id;
import com.heytap.health.ui.R$style;
import com.heytap.health.ui.R$styleable;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.bjd;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.rg7;

/* JADX INFO: loaded from: classes2.dex */
public class MultiStateLayout extends RelativeLayout implements View.OnClickListener {
    public static final String TAG = "MultiStateLayout";
    public boolean A;
    public long B;
    public bjd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7762j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f7763l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f7764n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public int s;
    public int t;
    public Context u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;

    public MultiStateLayout(Context context) {
        this(context, null);
    }

    public static int g(float f) {
        return ejg.a(rg7.i() == null ? b78.a() : rg7.i(), f);
    }

    public MultiStateLayout a(View view, int i, boolean z) {
        if (i == 0) {
            View view2 = this.v;
            if (view2 != null) {
                removeView(view2);
            }
            this.v = view;
        } else if (i == 2) {
            View view3 = this.w;
            if (view3 != null) {
                removeView(view3);
            }
            this.w = view;
        } else if (i == 1) {
            View view4 = this.x;
            if (view4 != null) {
                removeView(view4);
            }
            this.x = view;
        } else if (i == 3) {
            View view5 = this.y;
            if (view5 != null) {
                removeView(view5);
            }
            this.y = view;
        }
        if (z) {
            q(i);
        }
        return this;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        View view2 = this.z;
        if (view2 != null) {
            bringChildToFront(view2);
        }
    }

    public void b(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        view.setBackgroundColor(i);
        int i2 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i2 >= viewGroup.getChildCount()) {
                return;
            }
            b(viewGroup.getChildAt(i2), i);
            i2++;
        }
    }

    public final void c() {
        this.w = e(this.s);
    }

    public final void d() {
        this.x = e(this.r);
    }

    public final View e(int i) {
        View viewInflate = LayoutInflater.from(this.u).inflate(i, (ViewGroup) this, false);
        this.z = viewInflate;
        viewInflate.setClickable(true);
        addView(viewInflate, -1, -1);
        return viewInflate;
    }

    public final void f() {
        this.v = e(this.t);
    }

    public int getCurrentState() {
        return this.q;
    }

    public View getEmptyLayout() {
        return this.w;
    }

    public View getErrorLayout() {
        return this.x;
    }

    public View getLoadingLayout() {
        return this.v;
    }

    public final void h(View view) {
        if (view != null) {
            removeView(view);
        }
    }

    public boolean i() {
        return this.q == 0;
    }

    public boolean j() {
        return this.q == 3;
    }

    public MultiStateLayout k(@LayoutRes int i, int i2) {
        if (i2 == 2) {
            this.s = i;
        } else if (i2 == 1) {
            this.r = i;
        } else if (i2 == 0) {
            this.t = i;
            if (this.q == 0) {
                a(LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false), i2, true);
            }
        }
        return this;
    }

    public MultiStateLayout l(View view, int i) {
        if (i == 2) {
            this.w = view;
        } else if (i == 1) {
            this.x = view;
        } else if (i == 0) {
            if (this.q == 0) {
                a(view, i, true);
            } else {
                this.v = view;
            }
        } else if (i == 3) {
            this.y = view;
        }
        return this;
    }

    public MultiStateLayout m(bjd bjdVar) {
        this.i = bjdVar;
        return this;
    }

    public void n() {
        p(2);
    }

    public void o() {
        p(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R$id.j_multity_retry) {
            if (this.A) {
                p(3);
                bjd bjdVar = this.i;
                if (bjdVar != null) {
                    bjdVar.D4();
                    return;
                }
                return;
            }
            return;
        }
        if (this.i != null) {
            if (this.B == 0 || Math.abs(System.currentTimeMillis() - this.B) > 600) {
                this.B = System.currentTimeMillis();
                p(0);
                this.i.v1(this.q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.u = getContext();
        int i = this.q;
        if (i != -1) {
            q(i);
        }
    }

    public MultiStateLayout p(int i) {
        if (this.q != i) {
            q(i);
        }
        return this;
    }

    public final synchronized MultiStateLayout q(int i) {
        this.q = i;
        if (i == 0) {
            View view = this.v;
            if (view == null) {
                f();
            } else {
                this.z = view;
                t(view);
            }
            View view2 = this.v;
            if (view2 != null) {
                view2.setOnClickListener(this);
                TextView textView = (TextView) this.v.findViewById(R$id.j_multity_loading_msg);
                this.p = textView;
                if (textView != null && !TextUtils.isEmpty(this.m)) {
                    this.p.setText(this.m);
                }
            }
            this.z = this.v;
            h(this.x);
            h(this.w);
            int i2 = this.f7762j;
            if (i2 != -1) {
                b(this.v, i2);
            }
        } else if (i == 2) {
            View view3 = this.w;
            if (view3 == null) {
                c();
                View view4 = this.w;
                if (view4 != null) {
                    int i3 = R$id.j_multity_retry;
                    if (view4.findViewById(i3) != null) {
                        this.w.findViewById(i3).setOnClickListener(this);
                    }
                    TextView textView2 = (TextView) this.w.findViewById(R$id.j_multity_empt_msg);
                    this.o = textView2;
                    if (textView2 != null && !TextUtils.isEmpty(this.f7764n)) {
                        this.o.setText(this.f7764n);
                    }
                }
            } else {
                this.z = view3;
                t(view3);
            }
            this.z = this.w;
            h(this.v);
            h(this.x);
        } else if (i == 1) {
            View view5 = this.x;
            if (view5 == null) {
                d();
                View view6 = this.x;
                if (view6 != null) {
                    int i4 = R$id.j_multity_retry;
                    if (view6.findViewById(i4) != null) {
                        this.x.findViewById(i4).setOnClickListener(this);
                    }
                    TextView textView3 = (TextView) this.x.findViewById(R$id.j_multity_error_msg);
                    this.k = textView3;
                    if (textView3 != null && !TextUtils.isEmpty(this.f7763l)) {
                        this.k.setText(this.f7763l);
                    }
                }
            } else {
                this.z = view5;
                t(view5);
            }
            this.z = this.x;
            h(this.v);
            h(this.w);
        } else if (i == 3) {
            this.z = null;
            View view7 = this.y;
            if (view7 != null) {
                t(view7);
            }
            h(this.v);
            h(this.x);
            h(this.w);
        }
        return this;
    }

    public void r() {
        p(0);
    }

    public void s() {
        p(3);
    }

    public void setEmptyTips(CharSequence charSequence) {
        this.f7764n = charSequence;
        TextView textView = this.o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setErrorTips(CharSequence charSequence) {
        this.f7763l = charSequence;
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setLoadingPageBgColor(@ColorInt int i) {
        this.f7762j = i;
        View view = this.v;
        if (view == null || i == -1) {
            return;
        }
        b(view, i);
    }

    public void setLoadingTips(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(View view) {
        if (indexOfChild(view) > 0) {
            bringChildToFront(view);
        } else {
            addView(view, -1, -1);
        }
    }

    public MultiStateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.jmultistate);
    }

    public MultiStateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7762j = -1;
        this.q = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiStateLayout, i, R$style.multistate);
        this.r = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultiStateLayout_error, -1);
        this.t = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultiStateLayout_loading, -1);
        this.s = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultiStateLayout_empty, -1);
        this.q = typedArrayObtainStyledAttributes.getInt(R$styleable.MultiStateLayout_state, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        View view2 = this.z;
        if (view2 != null) {
            bringChildToFront(view2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        View view2 = this.z;
        if (view2 != null) {
            bringChildToFront(view2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        View view2 = this.z;
        if (view2 != null) {
            bringChildToFront(view2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        View view2 = this.z;
        if (view2 != null) {
            bringChildToFront(view2);
        }
    }
}
