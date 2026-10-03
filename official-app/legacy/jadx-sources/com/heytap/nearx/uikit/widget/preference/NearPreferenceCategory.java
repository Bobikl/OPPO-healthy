package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceCategory;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearPreferenceCategory extends PreferenceCategory {
    public NearPreferenceCategory(Context context) {
        this(context, null);
    }

    public NearPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.preferenceCategoryStyle);
    }

    public NearPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        context.obtainStyledAttributes(attributeSet, R$styleable.NearPreferenceCategory, i, 0).recycle();
    }
}
