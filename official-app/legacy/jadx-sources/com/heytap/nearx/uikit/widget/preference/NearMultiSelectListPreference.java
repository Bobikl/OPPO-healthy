package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;
import com.oplus.aiunit.vision.xhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearMultiSelectListPreference extends MultiSelectListPreference implements NearCardSupportInterface {
    private CharSequence mAssignment;
    Context mContext;
    private boolean mIsSupportCardUse;
    Drawable mJumpRes;
    CharSequence mStatusText1;
    CharSequence mStatusText2;
    CharSequence mStatusText3;
    private CharSequence[] mSummaries;

    public NearMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R$attr.NearMultiSelectListPreferenceStyle);
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, 0, 0);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        this.mAssignment = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxAssignment);
        this.mJumpRes = xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.NearPreference_nxJumpMark);
        this.mStatusText1 = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus1);
        this.mStatusText2 = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus2);
        this.mStatusText3 = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus3);
        typedArrayObtainStyledAttributes.recycle();
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

    public CharSequence getStatusText2() {
        return this.mStatusText2;
    }

    public CharSequence getStatusText3() {
        return this.mStatusText3;
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
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(R$id.nx_preference_widget_jump);
        if (imageView != null) {
            Drawable drawable = this.mJumpRes;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.nx_statusText1);
        if (textView != null) {
            CharSequence charSequence = this.mStatusText1;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(R$id.nx_statusText2);
        if (textView2 != null) {
            CharSequence charSequence2 = this.mStatusText2;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence2);
                textView2.setVisibility(0);
            }
        }
        TextView textView3 = (TextView) preferenceViewHolder.findViewById(R$id.nx_statusText3);
        if (textView3 != null) {
            CharSequence charSequence3 = this.mStatusText3;
            if (TextUtils.isEmpty(charSequence3)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(charSequence3);
                textView3.setVisibility(0);
            }
        }
        TextView textView4 = (TextView) preferenceViewHolder.findViewById(R$id.assignment);
        if (textView4 != null) {
            CharSequence assignment = getAssignment();
            if (TextUtils.isEmpty(assignment)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(assignment);
                textView4.setVisibility(0);
            }
        }
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

    public void setStatusText2(CharSequence charSequence) {
        if ((charSequence != null || this.mStatusText2 == null) && (charSequence == null || charSequence.equals(this.mStatusText2))) {
            return;
        }
        this.mStatusText2 = charSequence;
        notifyChanged();
    }

    public void setStatusText3(CharSequence charSequence) {
        if ((charSequence != null || this.mStatusText3 == null) && (charSequence == null || charSequence.equals(this.mStatusText3))) {
            return;
        }
        this.mStatusText3 = charSequence;
        notifyChanged();
    }

    public void setSummaries(CharSequence[] charSequenceArr) {
        this.mSummaries = charSequenceArr;
    }

    public void setJump(int i) {
        setJump(this.mContext.getResources().getDrawable(i));
    }

    public NearMultiSelectListPreference(Context context) {
        super(context, null);
    }
}
