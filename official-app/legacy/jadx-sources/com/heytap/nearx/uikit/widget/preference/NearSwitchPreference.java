package com.heytap.nearx.uikit.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreference;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearRedDotDrawable;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.heytap.nearx.uikit.widget.NearSwitch;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearSwitchPreference extends SwitchPreference implements NearCardSupportInterface {
    private OnCheckedStateChangeListener checkedStateChangeListener;
    private CharSequence mAssignment;
    private boolean mHasRedDot;
    private boolean mIsEnableClickSpan;
    private boolean mIsSupportCardUse;
    private final Listener mListener;
    private int mMaxRadius;
    private int mMinRadius;
    private int mRadius;
    private int mRedDotDiameter;
    private int mRedDotMarginStart;
    private float mScale;
    private int mSwitchBarCheckedColor;
    private NearSwitch mSwitchView;
    private CharSequence mTitle;
    private int paddingEnd;
    private int paddingStart;
    private boolean tactileFeedbackEnabled;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        private Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @SensorsDataInstrumented
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (NearSwitchPreference.this.isChecked() == z) {
                if (NearSwitchPreference.this.checkedStateChangeListener != null) {
                    NearSwitchPreference.this.checkedStateChangeListener.onCheckedChanged(compoundButton, Boolean.valueOf(z));
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            } else {
                if (NearSwitchPreference.this.callCustomChangeListener(Boolean.valueOf(z))) {
                    NearSwitchPreference.this.setChecked(z);
                    if (NearSwitchPreference.this.checkedStateChangeListener != null) {
                        NearSwitchPreference.this.checkedStateChangeListener.onCheckedChanged(compoundButton, Boolean.valueOf(z));
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
                    return;
                }
                compoundButton.setChecked(!z);
                if (NearSwitchPreference.this.checkedStateChangeListener != null) {
                    NearSwitchPreference.this.checkedStateChangeListener.onCheckedChanged(compoundButton, Boolean.valueOf(!z));
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            }
        }
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(CompoundButton compoundButton, Boolean bool);
    }

    public NearSwitchPreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean callCustomChangeListener(Object obj) {
        if (getOnPreferenceChangeListener() == null) {
            return true;
        }
        return getOnPreferenceChangeListener().onPreferenceChange(this, obj);
    }

    public CharSequence getAssignment() {
        return this.mAssignment;
    }

    public int getBorderRectRadius(int i) {
        return (i == 1 || i == 2 || i != 3) ? 14 : 16;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public boolean isSupportCardUse() {
        return this.mIsSupportCardUse;
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        Drawable drawable;
        View viewFindViewById = preferenceViewHolder.findViewById(R$id.nx_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setSoundEffectsEnabled(false);
            viewFindViewById.setHapticFeedbackEnabled(false);
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R.id.switch_widget);
        if (viewFindViewById2 instanceof NearSwitch) {
            NearSwitch nearSwitch = (NearSwitch) viewFindViewById2;
            nearSwitch.setOnCheckedChangeListener(this.mListener);
            nearSwitch.setVerticalScrollBarEnabled(false);
            this.mSwitchView = nearSwitch;
            int i = this.mSwitchBarCheckedColor;
            if (i != -1) {
                nearSwitch.setBarCheckedColor(i);
            }
        }
        super.onBindViewHolder(preferenceViewHolder);
        if (this.mIsEnableClickSpan) {
            NearPreferenceUtils.setSummaryView(getContext(), preferenceViewHolder);
        }
        View viewFindViewById3 = preferenceViewHolder.itemView.findViewById(R.id.icon);
        if (viewFindViewById3 != null && (viewFindViewById3 instanceof NearRoundImageView)) {
            if (viewFindViewById3.getHeight() != 0 && (drawable = ((NearRoundImageView) viewFindViewById3).getDrawable()) != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() / 6;
                this.mRadius = intrinsicHeight;
                int i2 = this.mMinRadius;
                if (intrinsicHeight < i2) {
                    this.mRadius = i2;
                } else {
                    int i3 = this.mMaxRadius;
                    if (intrinsicHeight > i3) {
                        this.mRadius = i3;
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
        TextView textView = (TextView) preferenceViewHolder.itemView.findViewById(R$id.assignment);
        if (textView != null) {
            CharSequence assignment = getAssignment();
            if (TextUtils.isEmpty(assignment)) {
                textView.setVisibility(8);
            } else {
                textView.setText(assignment);
                textView.setVisibility(0);
            }
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(R.id.title);
        if (this.mHasRedDot) {
            SpannableString spannableString = new SpannableString(((Object) this.mTitle) + " ");
            Context context = getContext();
            int i4 = this.mRedDotMarginStart;
            int i5 = this.mRedDotDiameter;
            NearRedDotDrawable nearRedDotDrawable = new NearRedDotDrawable(1, 0, context, new RectF(i4, 0.0f, i4 + i5, i5));
            nearRedDotDrawable.setBounds(0, 0, this.mRedDotMarginStart + this.mRedDotDiameter, (textView2.getLineHeight() / 2) + (this.mRedDotDiameter / 2));
            spannableString.setSpan(new ImageSpan(nearRedDotDrawable), this.mTitle.length(), this.mTitle.length() + 1, 17);
            textView2.setText(spannableString);
        } else {
            textView2.setText(this.mTitle);
        }
        NearCardListHelper.setItemCardBackground(preferenceViewHolder.itemView, NearCardListHelper.getPositionInGroup(this));
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        setPlaySound(true);
        setPerformFeedBack(true);
        super.onClick();
    }

    public void setAssignment(CharSequence charSequence) {
        if (TextUtils.equals(this.mAssignment, charSequence)) {
            return;
        }
        this.mAssignment = charSequence;
        notifyChanged();
    }

    public void setHasRedDot(boolean z) {
        this.mHasRedDot = z;
        notifyChanged();
    }

    public void setHorizontalPadding(int i, int i2) {
        this.paddingStart = i;
        this.paddingEnd = i2;
        notifyChanged();
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public void setIsSupportCardUse(boolean z) {
        this.mIsSupportCardUse = z;
    }

    public final void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.checkedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setPerformFeedBack(boolean z) {
        NearSwitch nearSwitch = this.mSwitchView;
        if (nearSwitch != null) {
            nearSwitch.setTactileFeedbackEnabled(z);
        }
    }

    public void setPlaySound(boolean z) {
        NearSwitch nearSwitch = this.mSwitchView;
        if (nearSwitch != null) {
            nearSwitch.setShouldPlaySound(z);
        }
    }

    public final void setSwitchBarCheckedColor(@ColorInt int i) {
        this.mSwitchBarCheckedColor = i;
    }

    public final void setTactileFeedbackEnabled(boolean z) {
        NearSwitch nearSwitch = this.mSwitchView;
        if (nearSwitch != null) {
            nearSwitch.setTactileFeedbackEnabled(z);
        } else {
            this.tactileFeedbackEnabled = z;
        }
    }

    @Override // androidx.preference.Preference
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mTitle = getTitle();
    }

    public NearSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.switchPreferenceStyle);
    }

    public NearSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new Listener();
        this.paddingStart = 0;
        this.paddingEnd = 0;
        this.mSwitchBarCheckedColor = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, 0);
        this.mIsEnableClickSpan = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxEnalbeClickSpan, false);
        this.mAssignment = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxAssignment);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        this.mHasRedDot = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxHasTitleRedDot, false);
        this.paddingStart = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_android_paddingStart, context.getResources().getDimensionPixelSize(R$dimen.nx_support_preference_title_padding_start));
        this.paddingEnd = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_android_paddingEnd, context.getResources().getDimensionPixelSize(R$dimen.nx_support_preference_title_padding_end));
        typedArrayObtainStyledAttributes.recycle();
        this.mTitle = getTitle();
        float f = context.getResources().getDisplayMetrics().density;
        this.mScale = f;
        this.mMinRadius = (int) ((14.0f * f) / 3.0f);
        this.mMaxRadius = (int) ((f * 36.0f) / 3.0f);
        this.mRedDotDiameter = context.getResources().getDimensionPixelOffset(R$dimen.nx_dot_diameter_small);
        this.mRedDotMarginStart = context.getResources().getDimensionPixelOffset(R$dimen.nx_switch_preference_dot_margin_start);
    }
}
