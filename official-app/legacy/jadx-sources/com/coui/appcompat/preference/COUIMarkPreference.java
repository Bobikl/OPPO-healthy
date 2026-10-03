package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.preference.CheckBoxPreference;
import androidx.preference.PreferenceViewHolder;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.dg2;
import com.oplus.aiunit.vision.eg2;
import com.support.appcompat.R$string;
import com.support.preference.R$attr;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMarkPreference extends CheckBoxPreference implements eg2, COUIRecyclerView.ICOUIDividerDecorationInterface {
    public static final int CIRCLE = 0;
    public static final int HEAD_MARK = 1;
    public static final int ROUND = 1;
    public static final int TAIL_MARK = 0;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1911j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1912l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1913n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public TextView t;
    public View u;

    public class a extends View.AccessibilityDelegate {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, COUIMarkPreference.this.getContext().getResources().getString(R$string.coui_accessibility_select)));
            KeyEvent.Callback callback = this.a;
            if ((callback instanceof Checkable) && ((Checkable) callback).isChecked()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
        }
    }

    public COUIMarkPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 0;
        this.f1911j = true;
        this.f1913n = 0;
        this.s = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIMarkPreference, i, i2);
        this.i = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIMarkPreference_couiMarkStyle, 0);
        this.m = typedArrayObtainStyledAttributes.getText(R$styleable.COUIMarkPreference_couiMarkAssignment);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, i, i2);
        this.f1911j = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIPreference_couiShowDivider, this.f1911j);
        this.k = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIPreference_couiEnalbeClickSpan, false);
        this.f1912l = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIPreference_isSupportCardUse, true);
        this.o = typedArrayObtainStyledAttributes2.getInt(R$styleable.COUIPreference_couiIconStyle, 1);
        this.p = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIPreference_hasBorder, false);
        this.q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUIPreference_preference_icon_radius, 14);
        this.f1913n = typedArrayObtainStyledAttributes2.getInt(R$styleable.COUIPreference_couiAssignmentColor, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.r = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_divider_default_horizontal_padding);
        setChecked(true);
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public boolean drawDivider() {
        if (!(this.u instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int iB = dg2.b(this);
        return iB == 1 || iB == 2;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.r;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.t;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.r;
    }

    @Override // com.oplus.aiunit.vision.eg2
    public boolean isSupportCardUse() {
        return this.f1912l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        this.u = preferenceViewHolder.itemView;
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.coui_tail_mark);
        this.u.setAccessibilityDelegate(new a(viewFindViewById));
        if (viewFindViewById != 0 && (viewFindViewById instanceof Checkable)) {
            if (this.i == 0) {
                viewFindViewById.setVisibility(0);
                ((Checkable) viewFindViewById).setChecked(isChecked());
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.coui_head_mark);
        if (viewFindViewById2 != 0 && (viewFindViewById2 instanceof Checkable)) {
            if (this.i == 1) {
                viewFindViewById2.setVisibility(0);
                ((Checkable) viewFindViewById2).setChecked(isChecked());
            } else {
                viewFindViewById2.setVisibility(8);
            }
        }
        bk2.d(preferenceViewHolder, getContext(), this.q, this.p, this.o, this.s);
        this.t = (TextView) preferenceViewHolder.findViewById(R.id.title);
        View viewFindViewById3 = preferenceViewHolder.findViewById(R$id.img_layout);
        View viewFindViewById4 = preferenceViewHolder.findViewById(R.id.icon);
        if (viewFindViewById3 != null) {
            if (viewFindViewById4 != null) {
                viewFindViewById3.setVisibility(viewFindViewById4.getVisibility());
            } else {
                viewFindViewById3.setVisibility(8);
            }
        }
        if (this.k) {
            bk2.e(getContext(), preferenceViewHolder);
        }
        bk2.a(preferenceViewHolder, this.m, this.f1913n);
        dg2.d(preferenceViewHolder.itemView, dg2.b(this));
    }

    public COUIMarkPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUIMarkPreference);
    }

    public COUIMarkPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiMarkPreferenceStyle);
    }

    public COUIMarkPreference(Context context) {
        this(context, null);
    }
}
