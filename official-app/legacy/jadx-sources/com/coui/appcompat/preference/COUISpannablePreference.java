package com.coui.appcompat.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.support.preference.R$attr;
import com.support.preference.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class COUISpannablePreference extends COUIPreference {
    public COUISpannablePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSpannablePreferenceStyle);
    }

    public COUISpannablePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R$style.Preference_COUI_COUISpannablePreference);
    }
}
