package com.heytap.nearx.uikit.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;

/* JADX INFO: loaded from: classes18.dex */
public class NearMarkPreference extends CheckBoxPreference implements NearCardSupportInterface {
    public static final int HEAD_MARK = 1;
    public static final int TAIL_MARK = 0;
    private CharSequence mAssignment;
    private boolean mIsEnableClickSpan;
    private boolean mIsSupportCardUse;
    int mMarkStyle;
    private int mMaxRadius;
    private int mMinRadius;
    private int mRadius;
    private float mScale;
    private boolean mShowDivider;

    public NearMarkPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mMarkStyle = 0;
        this.mShowDivider = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearMarkPreference, i, 0);
        this.mMarkStyle = typedArrayObtainStyledAttributes.getInt(R$styleable.NearMarkPreference_nxMarkStyle, 0);
        this.mAssignment = typedArrayObtainStyledAttributes.getText(R$styleable.NearMarkPreference_nxMarkAssignment);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, 0);
        this.mShowDivider = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.NearPreference_nxShowDivider, this.mShowDivider);
        this.mIsEnableClickSpan = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.NearPreference_nxEnalbeClickSpan, false);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        typedArrayObtainStyledAttributes2.recycle();
        setChecked(true);
        float f = context.getResources().getDisplayMetrics().density;
        this.mScale = f;
        this.mMinRadius = (int) ((14.0f * f) / 3.0f);
        this.mMaxRadius = (int) ((f * 36.0f) / 3.0f);
    }

    public CharSequence getAssignment() {
        return this.mAssignment;
    }

    public int getBorderRectRadius(int i) {
        return (i == 1 || i == 2 || i != 3) ? 14 : 16;
    }

    public int getMarkStyle() {
        return this.mMarkStyle;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public boolean isSupportCardUse() {
        return this.mIsSupportCardUse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        Drawable drawable;
        super.onBindViewHolder(preferenceViewHolder);
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.nx_tail_mark);
        if (viewFindViewById != 0 && (viewFindViewById instanceof Checkable)) {
            if (this.mMarkStyle == 0) {
                viewFindViewById.setVisibility(0);
                ((Checkable) viewFindViewById).setChecked(isChecked());
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.nx_head_mark);
        if (viewFindViewById2 != 0 && (viewFindViewById2 instanceof Checkable)) {
            if (this.mMarkStyle == 1) {
                viewFindViewById2.setVisibility(0);
                ((Checkable) viewFindViewById2).setChecked(isChecked());
            } else {
                viewFindViewById2.setVisibility(8);
            }
        }
        View viewFindViewById3 = preferenceViewHolder.findViewById(R.id.icon);
        if (viewFindViewById3 != null && (viewFindViewById3 instanceof NearRoundImageView)) {
            if (viewFindViewById3.getHeight() != 0 && (drawable = ((NearRoundImageView) viewFindViewById3).getDrawable()) != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() / 6;
                this.mRadius = intrinsicHeight;
                int i = this.mMinRadius;
                if (intrinsicHeight < i) {
                    this.mRadius = i;
                } else {
                    int i2 = this.mMaxRadius;
                    if (intrinsicHeight > i2) {
                        this.mRadius = i2;
                    }
                }
            }
            ((NearRoundImageView) viewFindViewById3).setBorderRectRadius(this.mRadius);
        }
        View viewFindViewById4 = preferenceViewHolder.findViewById(R$id.img_layout);
        if (viewFindViewById4 != null) {
            if (viewFindViewById3 != null) {
                viewFindViewById4.setVisibility(viewFindViewById3.getVisibility());
            } else {
                viewFindViewById4.setVisibility(8);
            }
        }
        if (this.mIsEnableClickSpan) {
            NearPreferenceUtils.setSummaryView(getContext(), preferenceViewHolder);
        }
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.assignment);
        if (textView != null) {
            CharSequence assignment = getAssignment();
            if (TextUtils.isEmpty(assignment)) {
                textView.setVisibility(8);
            } else {
                textView.setText(assignment);
                textView.setVisibility(0);
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

    public void setMarkStyle(int i) {
        this.mMarkStyle = i;
    }

    public NearMarkPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearMarkPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxMarkPreferenceStyle);
    }

    public NearMarkPreference(Context context) {
        this(context, null);
    }
}
