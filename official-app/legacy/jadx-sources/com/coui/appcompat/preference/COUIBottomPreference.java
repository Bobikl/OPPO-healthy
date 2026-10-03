package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.support.preference.R$dimen;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBottomPreference extends Preference {
    public int i;

    public COUIBottomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(R$layout.coui_preference_bottom);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.COUIBottomPreference, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIBottomPreference_placeholderHeight, getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_foot_preference_padding_bottom));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ViewGroup.LayoutParams layoutParams = preferenceViewHolder.itemView.getLayoutParams();
        int i = layoutParams.height;
        int i2 = this.i;
        if (i != i2) {
            layoutParams.height = i2;
            preferenceViewHolder.itemView.setLayoutParams(layoutParams);
        }
    }
}
