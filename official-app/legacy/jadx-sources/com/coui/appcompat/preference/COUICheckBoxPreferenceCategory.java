package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICheckBoxPreferenceCategory extends COUIPreferenceCategory {
    public int E;
    public COUICheckBox.c F;

    public COUICheckBoxPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICheckBoxPreferenceCategory, 0, 0);
        this.E = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICheckBoxPreferenceCategory_default_checkbox_state, this.E);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory, androidx.preference.PreferenceCategory, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        m(R$layout.coui_preference_category_widget_layout_checkbox);
        super.onBindViewHolder(preferenceViewHolder);
        COUICheckBox cOUICheckBox = (COUICheckBox) e().findViewById(R.id.checkbox);
        if (cOUICheckBox != null) {
            int i = this.E;
            if (i != 0) {
                cOUICheckBox.setState(i);
            }
            COUICheckBox.c cVar = this.F;
            if (cVar != null) {
                cOUICheckBox.setOnStateChangeListener(cVar);
            }
            cOUICheckBox.setVisibility(0);
        }
    }

    public void setOnStateChangeListener(COUICheckBox.c cVar) {
        this.F = cVar;
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory
    public void setWidgetLayoutClickListener(View.OnClickListener onClickListener) {
        Log.e("CheckBoxCategory", "set Widget Layout Click Listener does not take effect in the COUICheckBoxPreferenceCategory setting, please set setOnStateChangeListener");
    }
}
