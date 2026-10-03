package com.coui.appcompat.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.support.preference.R$layout;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPagerHeaderPreference extends Preference {
    public COUIPagerHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(R$layout.coui_pager_header_preference);
    }
}
