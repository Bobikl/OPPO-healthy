package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.dg2;
import com.oplus.aiunit.vision.eg2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUISwitchPreference extends SwitchPreference implements eg2, COUIRecyclerView.ICOUIDividerDecorationInterface {
    public static final int CIRCLE = 0;
    public static final int ROUND = 1;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1944j;
    public COUISwitch k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1945l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1946n;
    public CharSequence o;
    public int p;
    public boolean q;
    public CharSequence r;
    public boolean s;
    public int t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public TextView y;
    public View z;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @SensorsDataInstrumented
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (COUISwitchPreference.this.isChecked() == z) {
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            } else if (COUISwitchPreference.this.callCustomChangeListener(Boolean.valueOf(z))) {
                COUISwitchPreference.this.setChecked(z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            } else {
                compoundButton.setChecked(!z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            }
        }
    }

    public COUISwitchPreference(Context context) {
        this(context, null);
    }

    public final boolean callCustomChangeListener(Object obj) {
        if (getOnPreferenceChangeListener() == null) {
            return true;
        }
        return getOnPreferenceChangeListener().onPreferenceChange(this, obj);
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public boolean drawDivider() {
        if (!(this.z instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int iB = dg2.b(this);
        return iB == 1 || iB == 2;
    }

    public void e(boolean z) {
        this.f1944j = z;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.f1946n;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.y;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.f1946n;
    }

    @Override // com.oplus.aiunit.vision.eg2
    public boolean isSupportCardUse() {
        return this.s;
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        this.z = preferenceViewHolder.itemView;
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.coui_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setSoundEffectsEnabled(false);
            viewFindViewById.setHapticFeedbackEnabled(false);
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R.id.switch_widget);
        View viewFindViewById3 = preferenceViewHolder.findViewById(R$id.jump_icon_red_dot);
        if (viewFindViewById2 instanceof COUISwitch) {
            COUISwitch cOUISwitch = (COUISwitch) viewFindViewById2;
            cOUISwitch.setOnCheckedChangeListener(this.i);
            cOUISwitch.setVerticalScrollBarEnabled(false);
            this.k = cOUISwitch;
            int i = this.x;
            if (i != -1) {
                cOUISwitch.setBarCheckedColor(i);
            }
        }
        super.onBindViewHolder(preferenceViewHolder);
        if (this.f1944j) {
            bk2.e(getContext(), preferenceViewHolder);
        }
        bk2.d(preferenceViewHolder, getContext(), this.v, this.u, this.t, this.w);
        View viewFindViewById4 = preferenceViewHolder.findViewById(R$id.img_layout);
        View viewFindViewById5 = preferenceViewHolder.itemView.findViewById(R.id.icon);
        if (viewFindViewById4 != null) {
            if (viewFindViewById5 != null) {
                viewFindViewById4.setVisibility(viewFindViewById5.getVisibility());
            } else {
                viewFindViewById4.setVisibility(8);
            }
        }
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.title);
        this.y = textView;
        textView.setText(this.r);
        if (viewFindViewById3 != null) {
            if (this.q) {
                COUIHintRedDot cOUIHintRedDot = (COUIHintRedDot) viewFindViewById3;
                cOUIHintRedDot.c();
                viewFindViewById3.setVisibility(0);
                cOUIHintRedDot.setPointMode(1);
            } else {
                viewFindViewById3.setVisibility(8);
            }
            viewFindViewById3.invalidate();
        }
        bk2.a(preferenceViewHolder, this.o, this.p);
        dg2.d(preferenceViewHolder.itemView, dg2.b(this));
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        setPlaySound(true);
        setPerformFeedBack(true);
        super.onClick();
    }

    public void setPerformFeedBack(boolean z) {
        COUISwitch cOUISwitch = this.k;
        if (cOUISwitch != null) {
            cOUISwitch.setTactileFeedbackEnabled(z);
        }
    }

    public void setPlaySound(boolean z) {
        COUISwitch cOUISwitch = this.k;
        if (cOUISwitch != null) {
            cOUISwitch.setShouldPlaySound(z);
        }
    }

    @Override // androidx.preference.Preference
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.r = getTitle();
    }

    public COUISwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.switchPreferenceStyle);
    }

    public COUISwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUISwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new b();
        this.p = 0;
        this.w = false;
        this.x = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, i, i2);
        this.f1944j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiEnalbeClickSpan, false);
        this.o = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_couiAssignment);
        this.p = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiAssignmentColor, 0);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_isSupportCardUse, true);
        this.t = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiIconStyle, 1);
        this.u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_hasBorder, false);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIPreference_preference_icon_radius, 14);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUISwitchPreference, i, i2);
        this.q = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUISwitchPreference_hasTitleRedDot, false);
        typedArrayObtainStyledAttributes2.recycle();
        this.f1946n = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_divider_default_horizontal_padding);
        this.r = getTitle();
        this.f1945l = context.getResources().getDimensionPixelOffset(com.support.reddot.R$dimen.coui_dot_diameter_small);
        this.m = context.getResources().getDimensionPixelOffset(com.support.reddot.R$dimen.coui_switch_preference_dot_margin_start);
    }
}
