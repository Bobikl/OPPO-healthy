package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.support.preference.R$attr;
import com.support.preference.R$id;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUISlideSelectPreference extends COUIPreference {
    public static final int FORCE_CLICK = 1;
    public static final int FORCE_UNCLICK = 2;
    public static final int NORMAL = 0;
    public int Q;
    public Context R;
    public CharSequence S;
    public TextView T;

    public COUISlideSelectPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSlideSelectPreferenceStyle);
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.coui_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setTag(new Object());
            int i = this.Q;
            if (i == 1) {
                viewFindViewById.setClickable(false);
            } else if (i == 2) {
                viewFindViewById.setClickable(true);
            }
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.coui_statusText_select);
        if (viewFindViewById2 == null || !(viewFindViewById2 instanceof TextView)) {
            return;
        }
        this.T = (TextView) viewFindViewById2;
        CharSequence charSequence = this.S;
        if (TextUtils.isEmpty(charSequence)) {
            this.T.setVisibility(8);
        } else {
            this.T.setText(charSequence);
            this.T.setVisibility(0);
        }
    }

    public COUISlideSelectPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUISelectPreference);
    }

    public COUISlideSelectPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Q = 0;
        this.R = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUISlideSelectPreference, i, i2);
        this.S = typedArrayObtainStyledAttributes.getText(R$styleable.COUISlideSelectPreference_coui_select_status1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
