package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;

/* JADX INFO: loaded from: classes18.dex */
public class NearListPreference extends ListPreference implements NearCardSupportInterface {
    private CharSequence mAssignment;
    private boolean mIsSupportCardUse;
    Drawable mJumpRes;
    CharSequence mStatusText1;
    CharSequence[] mSummaries;

    public NearListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CharSequence getAssignment() {
        return this.mAssignment;
    }

    public Drawable getJump() {
        return this.mJumpRes;
    }

    public CharSequence getStatusText1() {
        return this.mStatusText1;
    }

    public CharSequence[] getSummaries() {
        return this.mSummaries;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public boolean isSupportCardUse() {
        return this.mIsSupportCardUse;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        NearPreferenceUtils.bindView(preferenceViewHolder, this.mJumpRes, this.mStatusText1, getAssignment());
        NearCardListHelper.setItemCardBackground(preferenceViewHolder.itemView, NearCardListHelper.getPositionInGroup(this));
    }

    public void setAssignment(CharSequence charSequence) {
        if (TextUtils.equals(this.mAssignment, charSequence)) {
            return;
        }
        this.mAssignment = charSequence;
        notifyChanged();
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public void setIsSupportCardUse(boolean z) {
        this.mIsSupportCardUse = z;
    }

    public void setJump(Drawable drawable) {
        if (this.mJumpRes != drawable) {
            this.mJumpRes = drawable;
            notifyChanged();
        }
    }

    public void setStatusText1(CharSequence charSequence) {
        if ((charSequence != null || this.mStatusText1 == null) && (charSequence == null || charSequence.equals(this.mStatusText1))) {
            return;
        }
        this.mStatusText1 = charSequence;
        notifyChanged();
    }

    public void setSummaries(CharSequence[] charSequenceArr) {
        this.mSummaries = charSequenceArr;
    }

    public NearListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, 0);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        this.mAssignment = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxAssignment);
        this.mJumpRes = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPreference_nxJumpMark);
        this.mStatusText1 = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setJump(int i) {
        setJump(getContext().getResources().getDrawable(i));
    }

    public NearListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearListPreference(Context context) {
        this(context, null);
    }
}
