package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.oplus.aiunit.vision.bk2;
import com.support.preference.R$dimen;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPagerFooterPreference extends Preference {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1921j;

    public COUIPagerFooterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        setLayoutResource(R$layout.coui_pager_footer_preference);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPagerFooterPreference, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPagerFooterPreference_withExtraMarginBottom, this.i);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, 0, 0);
        this.f1921j = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIPreference_couiEnalbeClickSpan, false);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void d(boolean z) {
        if (this.f1921j != z) {
            this.f1921j = z;
            notifyChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        if (preferenceViewHolder.itemView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) preferenceViewHolder.itemView.getLayoutParams();
            if (this.i) {
                marginLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_footer_preference_margin_bottom);
            } else {
                marginLayoutParams.bottomMargin = 0;
            }
            preferenceViewHolder.itemView.setLayoutParams(marginLayoutParams);
        }
        if (this.f1921j) {
            bk2.e(getContext(), preferenceViewHolder);
        }
    }
}
