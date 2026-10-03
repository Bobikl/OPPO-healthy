package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.button.COUIButton;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.preference.R$attr;
import com.support.preference.R$id;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIButtonPreference extends COUIPreference {
    public View.OnClickListener Q;
    public CharSequence R;
    public int S;
    public int T;
    public int U;
    public b V;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIButtonPreference.this.V != null) {
                COUIButtonPreference.this.V.a();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public interface b {
        void a();
    }

    public COUIButtonPreference(Context context) {
        this(context, null);
    }

    public CharSequence m() {
        return this.R;
    }

    public int n() {
        return this.T;
    }

    public int o() {
        return this.S;
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        COUIButton cOUIButton = (COUIButton) preferenceViewHolder.findViewById(R$id.coui_btn);
        if (cOUIButton != null) {
            cOUIButton.setText(m());
            cOUIButton.setTextSize(p());
            if (o() != 0) {
                cOUIButton.setTextColor(o());
            }
            if (n() != 0) {
                cOUIButton.setDrawableColor(n());
            }
            cOUIButton.setOnClickListener(this.Q);
        }
    }

    public int p() {
        return this.U;
    }

    public void r(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.R)) {
            return;
        }
        this.R = charSequence;
        notifyChanged();
    }

    public void setOnButtonClickListener(b bVar) {
        this.V = bVar;
    }

    public COUIButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiButtonPreferenceStyle);
    }

    public COUIButtonPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUIButtonPreference);
    }

    public COUIButtonPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIButtonPreference, i, i2);
        this.R = typedArrayObtainStyledAttributes.getText(R$styleable.COUIButtonPreference_btnText);
        this.U = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIButtonPreference_btnTextSize, 14);
        this.S = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIButtonPreference_btnTextColor, 0);
        this.T = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIButtonPreference_btnDrawableColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
