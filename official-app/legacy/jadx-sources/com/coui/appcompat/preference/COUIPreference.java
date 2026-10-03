package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.dg2;
import com.oplus.aiunit.vision.eg2;
import com.oplus.aiunit.vision.uoe;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPreference extends Preference implements eg2, COUIRecyclerView.ICOUIDividerDecorationInterface {
    public static final int CIRCLE = 0;
    public static final int FORCE_CLICK = 1;
    public static final int FORCE_UNCLICK = 2;
    public static final int NORMAL = 0;
    public static final int ROUND = 1;
    public static final int SUMMARY_LINE_DEFAULT = 0;
    public static final int SUMMARY_LINE_ONE = 1;
    public static final int SUMMARY_LINE_TWO = 2;
    public CharSequence A;
    public Drawable B;
    public int C;
    public View D;
    public TextView E;
    public TextView F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public uoe.c K;
    public uoe L;
    public ColorStateList M;
    public ColorStateList N;
    public boolean O;
    public int P;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1922j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1923l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1924n;
    public int o;
    public View p;
    public COUIHintRedDot q;
    public COUIHintRedDot r;
    public COUIRoundImageView s;
    public Drawable t;
    public boolean u;
    public CharSequence v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public class a implements uoe.c {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.uoe.c
        public void onClick(View view, int i, int i2) {
            COUIPreference.this.K.onClick(view, i, i2);
        }
    }

    public COUIPreference(Context context) {
        this(context, null);
    }

    public final void d() {
        if (this.D == null || this.K == null) {
            return;
        }
        e();
        uoe uoeVar = new uoe(this.D, new a());
        this.L = uoeVar;
        uoeVar.d();
    }

    public boolean drawDivider() {
        if (!this.f1922j || !(this.D instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int iB = dg2.b(this);
        return iB == 1 || iB == 2;
    }

    public void e() {
        uoe uoeVar = this.L;
        if (uoeVar != null) {
            uoeVar.e();
            this.L = null;
        }
    }

    public void g(boolean z) {
        this.u = z;
    }

    public CharSequence getAssignment() {
        return this.v;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.o;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.E;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.o;
    }

    public int getEndRedDotMode() {
        return this.f1923l;
    }

    public void h(boolean z) {
        if (this.G != z) {
            this.G = z;
            notifyChanged();
        }
    }

    public void i(ColorStateList colorStateList) {
        this.N = colorStateList;
        notifyChanged();
    }

    @Override // com.oplus.aiunit.vision.eg2
    public boolean isSupportCardUse() {
        return this.I;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        boolean z;
        super.onBindViewHolder(preferenceViewHolder);
        dg2.d(preferenceViewHolder.itemView, dg2.b(this));
        View view = preferenceViewHolder.itemView;
        if (view instanceof COUICardListSelectedItemLayout) {
            ((COUICardListSelectedItemLayout) view).a(false);
        }
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.coui_preference);
        boolean z2 = true;
        if (viewFindViewById != null) {
            int i = this.C;
            if (i == 1) {
                viewFindViewById.setClickable(false);
            } else if (i == 2) {
                viewFindViewById.setClickable(true);
            }
        }
        this.D = preferenceViewHolder.itemView;
        d();
        View view2 = this.D;
        if (view2 != null) {
            if (view2 instanceof ListSelectedItemLayout) {
                ((ListSelectedItemLayout) view2).setBackgroundAnimationEnabled(this.H);
            }
            View view3 = this.D;
            if (view3 instanceof COUICardListSelectedItemLayout) {
                ((COUICardListSelectedItemLayout) view3).setIsSelected(this.G);
            }
        }
        if (this.z == 0) {
            bk2.b(preferenceViewHolder, this.B, this.A, getAssignment());
        } else {
            bk2.c(preferenceViewHolder, this.B, this.A, getAssignment(), this.z);
        }
        bk2.g(getContext(), preferenceViewHolder, this.M);
        bk2.d(preferenceViewHolder, getContext(), this.y, this.x, this.w, this.J);
        bk2.f(preferenceViewHolder, this.N);
        if (this.u) {
            bk2.e(getContext(), preferenceViewHolder);
        }
        this.E = (TextView) preferenceViewHolder.findViewById(R.id.title);
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        this.F = textView;
        if (textView != null) {
            int i2 = this.P;
            if (i2 == 0) {
                textView.setMaxLines(Integer.MAX_VALUE);
                this.F.setEllipsize(null);
            } else {
                textView.setMaxLines(i2);
                this.F.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.p = preferenceViewHolder.findViewById(R$id.img_red_dot);
        this.q = (COUIHintRedDot) preferenceViewHolder.findViewById(R$id.jump_icon_red_dot);
        this.r = (COUIHintRedDot) preferenceViewHolder.findViewById(R$id.assignment_red_dot);
        this.s = (COUIRoundImageView) preferenceViewHolder.findViewById(R$id.assignment_icon);
        View view4 = this.p;
        if (view4 instanceof COUIHintRedDot) {
            if (this.k != 0) {
                ((COUIHintRedDot) view4).c();
                this.p.setVisibility(0);
                ((COUIHintRedDot) this.p).setPointMode(this.k);
                this.p.invalidate();
            } else {
                view4.setVisibility(8);
            }
        }
        COUIRoundImageView cOUIRoundImageView = this.s;
        if (cOUIRoundImageView == null) {
            z = false;
        } else {
            Drawable drawable = this.t;
            if (drawable != null) {
                cOUIRoundImageView.setImageDrawable(drawable);
                this.s.setVisibility(0);
                z = true;
            } else {
                cOUIRoundImageView.setVisibility(8);
                z = false;
            }
        }
        COUIHintRedDot cOUIHintRedDot = this.q;
        if (cOUIHintRedDot instanceof COUIHintRedDot) {
            if (this.f1923l != 0) {
                cOUIHintRedDot.c();
                this.q.setVisibility(0);
                this.q.setPointMode(this.f1923l);
                this.q.setPointNumber(this.f1924n);
                this.q.invalidate();
                z = true;
            } else {
                cOUIHintRedDot.setVisibility(8);
            }
        }
        COUIHintRedDot cOUIHintRedDot2 = this.r;
        if (!(cOUIHintRedDot2 instanceof COUIHintRedDot)) {
            z2 = z;
        } else if (this.m != 0) {
            cOUIHintRedDot2.c();
            this.r.setVisibility(0);
            this.r.setPointMode(this.m);
            this.r.invalidate();
        } else {
            cOUIHintRedDot2.setVisibility(8);
            z2 = z;
        }
        COUIHintRedDot cOUIHintRedDot3 = this.r;
        if (cOUIHintRedDot3 != null) {
            ((ViewGroup) cOUIHintRedDot3.getParent()).setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        e();
        super.onDetached();
    }

    public void setAssignment(CharSequence charSequence) {
        if (TextUtils.equals(this.v, charSequence)) {
            return;
        }
        this.v = charSequence;
        notifyChanged();
    }

    public void setAssignmentColor(int i) {
        if (this.z != i) {
            this.z = i;
            notifyChanged();
        }
    }

    public void setBackgroundAnimationEnabled(boolean z) {
        if (this.H != z) {
            this.H = z;
            notifyChanged();
        }
    }

    public void setEndRedDotMode(int i) {
        if (this.f1923l != i) {
            this.f1923l = i;
            notifyChanged();
        }
    }

    public void setIconStyle(int i) {
        if (i == 0 || i == 1) {
            this.w = i;
            notifyChanged();
        }
    }

    public void setJump(Drawable drawable) {
        if (this.B != drawable) {
            this.B = drawable;
            notifyChanged();
        }
    }

    public void setOnPreciseClickListener(uoe.c cVar) {
        this.K = cVar;
        d();
    }

    public void setShowDivider(boolean z) {
        if (this.f1922j != z) {
            this.f1922j = z;
            notifyChanged();
        }
    }

    public void setStatusText1(CharSequence charSequence) {
        if ((charSequence != null || this.A == null) && (charSequence == null || charSequence.equals(this.A))) {
            return;
        }
        this.A = charSequence;
        notifyChanged();
    }

    public void setTitleColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            notifyChanged();
        }
    }

    public COUIPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.preferenceStyle);
    }

    public COUIPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1922j = true;
        this.C = 0;
        this.G = false;
        this.H = true;
        this.J = false;
        this.M = null;
        this.N = null;
        this.O = false;
        this.P = 0;
        this.i = context;
        this.o = context.getResources().getDimensionPixelSize(R$dimen.coui_preference_divider_default_horizontal_padding);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, i, i2);
        this.f1922j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiShowDivider, this.f1922j);
        this.u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiEnalbeClickSpan, false);
        this.B = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIPreference_coui_jump_mark);
        this.t = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIPreference_coui_assign_icon);
        this.A = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_coui_jump_status1);
        this.C = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiClickStyle, 0);
        this.v = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_couiAssignment);
        this.z = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiAssignmentColor, 0);
        this.w = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiIconStyle, 1);
        this.x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_hasBorder, false);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIPreference_preference_icon_radius, 14);
        this.k = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_iconRedDotMode, 0);
        this.f1923l = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_endRedDotMode, 0);
        this.m = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_assignRedDotMode, 0);
        this.f1924n = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_endRedDotNum, 0);
        this.H = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_isBackgroundAnimationEnabled, true);
        this.I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_isSupportCardUse, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiSetDefaultColor, false);
        this.O = z;
        if (z) {
            this.M = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIPreference_titleTextColor);
            this.N = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIPreference_couiSummaryColor);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiIsCustomIcon, false);
        this.P = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiSummaryLineLimit, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
