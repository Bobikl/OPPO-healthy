package com.heytap.nearx.uikit.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreferenceCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearSwitch;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearSwitchLoadingPreference extends SwitchPreferenceCompat implements NearCardSupportInterface {
    View mCheckableView;
    private boolean mIsEnableClickSpan;
    private boolean mIsSupportCardUse;
    private final Listener mListener;
    private NearSwitch.OnLoadingStateChangedListener mOnLoadingStateChangedListener;
    private NearSwitch mSwitchView;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        private Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @SensorsDataInstrumented
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (NearSwitchLoadingPreference.this.callCustomChangeListener(Boolean.valueOf(z))) {
                NearSwitchLoadingPreference.this.setChecked(z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            } else {
                compoundButton.setChecked(!z);
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            }
        }
    }

    public NearSwitchLoadingPreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean callCustomChangeListener(Object obj) {
        if (getOnPreferenceChangeListener() == null) {
            return true;
        }
        return getOnPreferenceChangeListener().onPreferenceChange(this, obj);
    }

    public View getSwitch() {
        return this.mCheckableView;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public boolean isSupportCardUse() {
        return this.mIsSupportCardUse;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.nx_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setSoundEffectsEnabled(false);
            viewFindViewById.setHapticFeedbackEnabled(false);
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.switchWidget);
        this.mCheckableView = viewFindViewById2;
        if (viewFindViewById2 instanceof NearSwitch) {
            NearSwitch nearSwitch = (NearSwitch) viewFindViewById2;
            nearSwitch.setOnCheckedChangeListener(null);
            nearSwitch.setVerticalScrollBarEnabled(false);
            this.mSwitchView = nearSwitch;
        }
        super.onBindViewHolder(preferenceViewHolder);
        View view = this.mCheckableView;
        if (view instanceof NearSwitch) {
            NearSwitch nearSwitch2 = (NearSwitch) view;
            nearSwitch2.setLoadingStyle(true);
            nearSwitch2.setOnLoadingStateChangedListener(this.mOnLoadingStateChangedListener);
            nearSwitch2.setOnCheckedChangeListener(this.mListener);
        }
        if (this.mIsEnableClickSpan) {
            NearPreferenceUtils.setSummaryView(getContext(), preferenceViewHolder);
        }
        View viewFindViewById3 = preferenceViewHolder.itemView.findViewById(R.id.icon);
        View viewFindViewById4 = preferenceViewHolder.findViewById(R$id.img_layout);
        if (viewFindViewById4 != null) {
            if (viewFindViewById3 != null) {
                viewFindViewById4.setVisibility(viewFindViewById3.getVisibility());
            } else {
                viewFindViewById4.setVisibility(8);
            }
        }
        NearCardListHelper.setItemCardBackground(preferenceViewHolder.itemView, NearCardListHelper.getPositionInGroup(this));
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        NearSwitch nearSwitch = this.mSwitchView;
        if (nearSwitch != null) {
            nearSwitch.setShouldPlaySound(true);
            this.mSwitchView.setTactileFeedbackEnabled(true);
            this.mSwitchView.startLoading();
        }
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public void setIsSupportCardUse(boolean z) {
        this.mIsSupportCardUse = z;
    }

    public void setOnLoadingStateChangedListener(NearSwitch.OnLoadingStateChangedListener onLoadingStateChangedListener) {
        this.mOnLoadingStateChangedListener = onLoadingStateChangedListener;
        View view = this.mCheckableView;
        if (view instanceof NearSwitch) {
            ((NearSwitch) view).setOnLoadingStateChangedListener(onLoadingStateChangedListener);
        }
    }

    public void startLoading() {
        View view = this.mCheckableView;
        if (view == null || !(view instanceof NearSwitch)) {
            return;
        }
        ((NearSwitch) view).startLoading();
    }

    public void stopLoading() {
        View view = this.mCheckableView;
        if (view == null || !(view instanceof NearSwitch)) {
            return;
        }
        ((NearSwitch) view).stopLoading();
    }

    public NearSwitchLoadingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSwitchLoadPreferenceStyle);
    }

    public NearSwitchLoadingPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearSwitchLoadingPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, 0);
        this.mIsEnableClickSpan = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxEnalbeClickSpan, false);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
