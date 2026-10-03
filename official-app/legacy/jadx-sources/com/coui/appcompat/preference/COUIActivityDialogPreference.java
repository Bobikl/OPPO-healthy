package com.coui.appcompat.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.support.preference.R$attr;

/* JADX INFO: loaded from: classes13.dex */
public class COUIActivityDialogPreference extends COUIListPreference {
    public COUIActivityDialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public COUIActivityDialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIActivityDialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiActivityDialogPreferenceStyle);
    }
}
