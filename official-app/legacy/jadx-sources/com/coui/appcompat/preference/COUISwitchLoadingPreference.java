package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.dg2;
import com.oplus.aiunit.vision.eg2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.preference.R$attr;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUISwitchLoadingPreference extends SwitchPreferenceCompat implements eg2, COUIRecyclerView.ICOUIDividerDecorationInterface {
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1941j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1942l;
    public COUISwitch m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f1943n;
    public boolean o;
    public boolean p;
    public COUISwitch.d q;
    public CharSequence r;
    public int s;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @SensorsDataInstrumented
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (COUISwitchLoadingPreference.this.callCustomChangeListener(Boolean.valueOf(z))) {
                COUISwitchLoadingPreference.this.setChecked(z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            } else {
                compoundButton.setChecked(!z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            }
        }
    }

    public COUISwitchLoadingPreference(Context context) {
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
        if (!(this.f1942l instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int iB = dg2.b(this);
        return iB == 1 || iB == 2;
    }

    public void e(boolean z) {
        this.o = z;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.f1941j;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.k;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.f1941j;
    }

    public View getSwitch() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.eg2
    public boolean isSupportCardUse() {
        return this.p;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        this.f1942l = preferenceViewHolder.itemView;
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.coui_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setSoundEffectsEnabled(false);
            viewFindViewById.setHapticFeedbackEnabled(false);
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.switchWidget);
        this.i = viewFindViewById2;
        if (viewFindViewById2 instanceof COUISwitch) {
            COUISwitch cOUISwitch = (COUISwitch) viewFindViewById2;
            cOUISwitch.setOnCheckedChangeListener(null);
            cOUISwitch.setVerticalScrollBarEnabled(false);
            this.m = cOUISwitch;
        }
        super.onBindViewHolder(preferenceViewHolder);
        View view = this.i;
        if (view instanceof COUISwitch) {
            COUISwitch cOUISwitch2 = (COUISwitch) view;
            cOUISwitch2.setLoadingStyle(true);
            cOUISwitch2.setOnLoadingStateChangedListener(this.q);
            cOUISwitch2.setOnCheckedChangeListener(this.f1943n);
        }
        if (this.o) {
            bk2.e(getContext(), preferenceViewHolder);
        }
        this.k = (TextView) preferenceViewHolder.findViewById(R.id.title);
        View viewFindViewById3 = preferenceViewHolder.itemView.findViewById(R.id.icon);
        View viewFindViewById4 = preferenceViewHolder.findViewById(R$id.img_layout);
        if (viewFindViewById4 != null) {
            if (viewFindViewById3 != null) {
                viewFindViewById4.setVisibility(viewFindViewById3.getVisibility());
            } else {
                viewFindViewById4.setVisibility(8);
            }
        }
        bk2.a(preferenceViewHolder, this.r, this.s);
        dg2.d(preferenceViewHolder.itemView, dg2.b(this));
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        COUISwitch cOUISwitch = this.m;
        if (cOUISwitch != null) {
            cOUISwitch.setShouldPlaySound(true);
            this.m.setTactileFeedbackEnabled(true);
            this.m.startLoading();
        }
    }

    public void setOnLoadingStateChangedListener(COUISwitch.d dVar) {
        this.q = dVar;
        View view = this.i;
        if (view instanceof COUISwitch) {
            ((COUISwitch) view).setOnLoadingStateChangedListener(dVar);
        }
    }

    public void startLoading() {
        View view = this.i;
        if (view == null || !(view instanceof COUISwitch)) {
            return;
        }
        ((COUISwitch) view).startLoading();
    }

    public void stopLoading() {
        View view = this.i;
        if (view == null || !(view instanceof COUISwitch)) {
            return;
        }
        ((COUISwitch) view).stopLoading();
    }

    public COUISwitchLoadingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSwitchLoadPreferenceStyle);
    }

    public COUISwitchLoadingPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_SwitchPreference_Loading);
    }

    public COUISwitchLoadingPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1943n = new b();
        this.s = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, i, 0);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiEnalbeClickSpan, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_isSupportCardUse, true);
        this.r = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_couiAssignment);
        this.s = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiAssignmentColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1941j = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_divider_default_horizontal_padding);
    }
}
