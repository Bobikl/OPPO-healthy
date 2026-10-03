package com.coui.appcompat.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.support.preference.R$attr;
import com.support.preference.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class COUIJumpPreference extends COUIPreference {
    public COUIJumpPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public COUIJumpPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUIJumpPreference);
    }

    public COUIJumpPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiJumpPreferenceStyle);
    }

    public COUIJumpPreference(Context context) {
        this(context, null);
    }
}
