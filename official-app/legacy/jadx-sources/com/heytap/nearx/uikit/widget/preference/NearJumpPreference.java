package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.heytap.nearx.uikit.R$attr;

/* JADX INFO: loaded from: classes18.dex */
public class NearJumpPreference extends NearPreference {
    public NearJumpPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NearJumpPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearJumpPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxJumpPreferenceStyle);
    }

    public NearJumpPreference(Context context) {
        this(context, null);
    }
}
