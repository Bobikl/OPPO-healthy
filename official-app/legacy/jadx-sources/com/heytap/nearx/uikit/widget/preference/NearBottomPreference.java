package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.heytap.nearx.uikit.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class NearBottomPreference extends Preference {
    public NearBottomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(R$layout.nx_preference_bottom);
    }
}
