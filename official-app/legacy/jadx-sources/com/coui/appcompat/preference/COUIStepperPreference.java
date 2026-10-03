package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.stepper.COUIStepperView;
import com.oplus.aiunit.vision.cjd;
import com.oplus.aiunit.vision.sy9;
import com.support.preference.R$attr;
import com.support.preference.R$id;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIStepperPreference extends COUIPreference implements sy9, cjd {
    public COUIStepperView Q;
    public cjd R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    public COUIStepperPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiStepperPreferenceStyle);
    }

    @Override // com.oplus.aiunit.vision.cjd
    public void b(int i, int i2) {
        this.T = i;
        persistInt(i);
        if (i != i2) {
            callChangeListener(Integer.valueOf(i));
        }
        cjd cjdVar = this.R;
        if (cjdVar != null) {
            cjdVar.b(i, i2);
        }
    }

    public void l(int i) {
        this.Q.setCurStep(i);
    }

    public void m(int i) {
        this.V = i;
        this.Q.setMaximum(i);
    }

    public void n(int i) {
        this.W = i;
        this.Q.setMinimum(i);
    }

    public void o(int i) {
        this.S = i;
        this.Q.setUnit(i);
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        COUIStepperView cOUIStepperView = (COUIStepperView) preferenceViewHolder.findViewById(R$id.stepper);
        this.Q = cOUIStepperView;
        if (cOUIStepperView != null) {
            m(this.V);
            n(this.W);
            l(this.T);
            o(this.S);
            this.Q.setOnStepChangeListener(this);
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        COUIStepperView cOUIStepperView = this.Q;
        if (cOUIStepperView != null) {
            cOUIStepperView.release();
        }
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(@Nullable Object obj) {
        if (obj == null) {
            obj = 0;
        }
        this.T = getPersistedInt(((Integer) obj).intValue());
    }

    @Override // com.oplus.aiunit.vision.sy9
    public void setOnStepChangeListener(cjd cjdVar) {
        this.R = cjdVar;
    }

    public COUIStepperPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUIStepperPreference);
    }

    public COUIStepperPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIStepperPreference, i, i2);
        this.V = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperPreference_couiMaximum, 9999);
        this.W = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperPreference_couiMinimum, -999);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperPreference_couiDefStep, 0);
        this.T = i3;
        this.U = i3;
        this.S = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperPreference_couiUnit, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
