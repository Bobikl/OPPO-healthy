package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearSwitchWithDividerPreference extends NearSwitchPreference {
    private OnMainLayoutClickListener mClickListener;
    private LinearLayout mMainLayout;
    private LinearLayout mSwitchLayout;

    public interface OnMainLayoutClickListener {
        void onMainLayoutClick();
    }

    public NearSwitchWithDividerPreference(Context context) {
        this(context, null);
    }

    public OnMainLayoutClickListener getOnMainLayoutClickListener() {
        return this.mClickListener;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearSwitchPreference, androidx.preference.SwitchPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        LinearLayout linearLayout = (LinearLayout) preferenceViewHolder.itemView.findViewById(R$id.main_layout);
        this.mMainLayout = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearSwitchWithDividerPreference.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    if (NearSwitchWithDividerPreference.this.mClickListener != null) {
                        NearSwitchWithDividerPreference.this.mClickListener.onMainLayoutClick();
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
            this.mMainLayout.setClickable(isSelectable());
        }
        LinearLayout linearLayout2 = (LinearLayout) preferenceViewHolder.itemView.findViewById(R$id.switch_layout);
        this.mSwitchLayout = linearLayout2;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearSwitchWithDividerPreference.2
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    NearSwitchWithDividerPreference.super.onClick();
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
            this.mSwitchLayout.setClickable(isSelectable());
        }
    }

    public void setOnMainLayoutListener(OnMainLayoutClickListener onMainLayoutClickListener) {
        this.mClickListener = onMainLayoutClickListener;
    }

    public NearSwitchWithDividerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSwitchWithDividerPreferenceStyle);
    }

    public NearSwitchWithDividerPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearSwitchWithDividerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
