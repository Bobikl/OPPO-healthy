package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.heytap.nearx.uikit.R$attr;

/* JADX INFO: loaded from: classes18.dex */
public class NearActivityDialogPreference extends NearListPreference {
    public NearActivityDialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NearActivityDialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearActivityDialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxActivityDialogPreferenceStyle);
    }

    public NearActivityDialogPreference(Context context) {
        this(context, null);
    }
}
