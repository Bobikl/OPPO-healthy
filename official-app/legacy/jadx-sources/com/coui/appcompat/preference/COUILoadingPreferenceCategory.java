package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.progressbar.COUICompProgressIndicator;
import com.support.preference.R$id;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUILoadingPreferenceCategory extends COUIPreferenceCategory {
    public LoadingType E;
    public int F;
    public int G;
    public COUICompProgressIndicator H;
    public TextView I;
    public String J;

    public enum LoadingType {
        LOADING,
        PAUSE,
        INVISIBLE,
        AFTER_LOADING,
        BEFORE_LOADING
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadingType.values().length];
            a = iArr;
            try {
                iArr[LoadingType.BEFORE_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LoadingType.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LoadingType.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LoadingType.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LoadingType.AFTER_LOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public COUILoadingPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = LoadingType.LOADING;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILoadingPreferenceCategory, 0, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUILoadingPreferenceCategory_coui_loading_after_layout, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUILoadingPreferenceCategory_coui_loading_before_layout, 0);
        this.J = typedArrayObtainStyledAttributes.getString(R$styleable.COUILoadingPreferenceCategory_text_in_loading);
        typedArrayObtainStyledAttributes.recycle();
        if (this.G != 0) {
            this.E = LoadingType.BEFORE_LOADING;
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory
    public boolean i() {
        return true;
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory, androidx.preference.PreferenceCategory, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        int i = a.a[this.E.ordinal()];
        if (i == 1) {
            m(this.G);
            super.onBindViewHolder(preferenceViewHolder);
            return;
        }
        if (i == 2) {
            m(R$layout.coui_preference_category_widget_layout_loading);
            super.onBindViewHolder(preferenceViewHolder);
            this.H = (COUICompProgressIndicator) e().findViewById(R$id.catagory_loading);
            this.I = (TextView) e().findViewById(R$id.text_in_loading);
            this.H.setVisibility(0);
            if (this.H.getAnimationView() != null) {
                this.H.getAnimationView().playAnimation();
            }
            if (TextUtils.isEmpty(this.J)) {
                this.I.setVisibility(8);
            } else {
                this.I.setText(this.J);
                this.I.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.J)) {
                e().setBackground(null);
                return;
            }
            return;
        }
        if (i == 3) {
            COUICompProgressIndicator cOUICompProgressIndicator = this.H;
            if (cOUICompProgressIndicator != null) {
                cOUICompProgressIndicator.setVisibility(0);
                this.H.getAnimationView().pauseAnimation();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            m(this.F);
            super.onBindViewHolder(preferenceViewHolder);
            return;
        }
        COUICompProgressIndicator cOUICompProgressIndicator2 = this.H;
        if (cOUICompProgressIndicator2 != null) {
            cOUICompProgressIndicator2.setVisibility(8);
        }
    }
}
