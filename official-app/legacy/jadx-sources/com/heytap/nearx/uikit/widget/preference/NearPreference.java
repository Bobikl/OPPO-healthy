package com.heytap.nearx.uikit.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListHelper;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListSelectedItemLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearPreference extends Preference implements NearCardSupportInterface {
    public static final int CIRCLE = 0;
    static final int DEFAULT_RADIUS = 14;
    static final int DEFAULT_SCALE = 3;
    public static final int FORCE_CLICK = 1;
    public static final int FORCE_UNCLICK = 2;
    static final int MAX_RADIUS = 36;
    static final int MIN_RADIUS = 14;
    public static final int NORMAL = 0;
    static final int NO_ICON_HEIGHT = 0;
    public static final int ROUND = 1;
    static final int ratio = 6;
    private View endRedDot;
    private View iconRedDot;
    private Integer itemBackgroundResource;
    private CharSequence mAssignment;
    private int mAssignmentColor;
    private int mClickStyle;
    private Context mContext;
    private int mEndRedDotMode;
    private int mEndRedDotNum;
    private int mIconRedDotMode;
    private int mIconStyle;
    private boolean mIsBackgroundAnimationEnabled;
    private boolean mIsEnableClickSpan;
    private boolean mIsSelected;
    private boolean mIsSupportCardUse;
    private View mItemView;
    Drawable mJumpRes;
    private boolean mShowDivider;
    CharSequence mStatusText1;
    private Boolean mSummaryForceDarkAllowed;
    private Boolean mTitleForceDarkAllowed;
    private int paddingEnd;
    private int paddingStart;
    private ColorStateList summaryTextColor;
    private ColorStateList titleTextColor;

    public NearPreference(Context context) {
        this(context, null);
    }

    public void changeEndRedDotNumberWithAnim(int i) {
        View view = this.endRedDot;
        if (view instanceof NearHintRedDot) {
            this.mEndRedDotNum = i;
            ((NearHintRedDot) view).changePointNumber(i);
        }
    }

    public void dismissEndRedDot() {
        View view = this.endRedDot;
        if (view instanceof NearHintRedDot) {
            ((NearHintRedDot) view).executeScaleAnim(false);
            notifyChanged();
        }
    }

    public void dismissIconRedDot() {
        View view = this.iconRedDot;
        if (view instanceof NearHintRedDot) {
            ((NearHintRedDot) view).executeScaleAnim(false);
            notifyChanged();
        }
    }

    public CharSequence getAssignment() {
        return this.mAssignment;
    }

    public int getAssignmentColor() {
        return this.mAssignmentColor;
    }

    public int getBorderRectRadius(int i) {
        return (i == 1 || i == 2 || i != 3) ? 14 : 16;
    }

    public int getClickStyle() {
        return this.mClickStyle;
    }

    public int getEndRedDotMode() {
        return this.mEndRedDotMode;
    }

    public int getEndRedDotNum() {
        return this.mEndRedDotNum;
    }

    public int getIconRedDotMode() {
        return this.mIconRedDotMode;
    }

    public int getIconStyle() {
        return this.mIconStyle;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    public CharSequence getStatusText1() {
        return this.mStatusText1;
    }

    public boolean isShowDivider() {
        return this.mShowDivider;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface
    public boolean isSupportCardUse() {
        return this.mIsSupportCardUse;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        NearCardListHelper.setItemCardBackground(preferenceViewHolder.itemView, NearCardListHelper.getPositionInGroup(this));
        View view = preferenceViewHolder.itemView;
        this.mItemView = view;
        if (view != null) {
            if (view instanceof NearListSelectedItemLayout) {
                ((NearListSelectedItemLayout) view).setBackgroundAnimationEnabled(this.mIsBackgroundAnimationEnabled);
            }
            View view2 = this.mItemView;
            if (view2 instanceof NearCardListSelectedItemLayout) {
                ((NearCardListSelectedItemLayout) view2).setIsSelected(this.mIsSelected);
            }
        }
        if (this.mAssignmentColor == 0) {
            NearPreferenceUtils.bindView(preferenceViewHolder, this.mJumpRes, this.mStatusText1, getAssignment());
        } else {
            NearPreferenceUtils.bindView(preferenceViewHolder, this.mJumpRes, this.mStatusText1, getAssignment(), this.mAssignmentColor);
        }
        View viewFindViewById = preferenceViewHolder.findViewById(R.id.icon);
        if (viewFindViewById != null && (viewFindViewById instanceof NearRoundImageView)) {
            ((NearRoundImageView) viewFindViewById).setType(this.mIconStyle);
        }
        NearPreferenceUtils.setTitleViewForckeDarkAllowed(getContext(), preferenceViewHolder, this.mTitleForceDarkAllowed.booleanValue());
        NearPreferenceUtils.setSummaryViewForckeDarkAllowed(getContext(), preferenceViewHolder, this.mSummaryForceDarkAllowed.booleanValue());
        NearPreferenceUtils.setTitleViewColor(getContext(), preferenceViewHolder, this.titleTextColor);
        NearPreferenceUtils.setSummaryViewColor(getContext(), preferenceViewHolder, this.summaryTextColor);
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.nx_preference);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setPaddingRelative(this.paddingStart, viewFindViewById2.getPaddingTop(), this.paddingEnd, viewFindViewById2.getPaddingBottom());
        }
        if (this.mIsEnableClickSpan) {
            NearPreferenceUtils.setSummaryView(getContext(), preferenceViewHolder);
        }
        View viewFindViewById3 = preferenceViewHolder.findViewById(R$id.img_layout);
        if (viewFindViewById3 != null) {
            if (viewFindViewById != null) {
                viewFindViewById3.setVisibility(viewFindViewById.getVisibility());
            } else {
                viewFindViewById3.setVisibility(8);
            }
        }
        this.iconRedDot = preferenceViewHolder.findViewById(R$id.img_red_dot);
        this.endRedDot = preferenceViewHolder.findViewById(R$id.jump_icon_red_dot);
        View view3 = this.iconRedDot;
        if (view3 instanceof NearHintRedDot) {
            if (this.mIconRedDotMode != 0) {
                ((NearHintRedDot) view3).setLaidOut();
                this.iconRedDot.setVisibility(0);
                ((NearHintRedDot) this.iconRedDot).setPointMode(this.mIconRedDotMode);
                this.iconRedDot.invalidate();
            } else {
                view3.setVisibility(8);
            }
        }
        View view4 = this.endRedDot;
        if (view4 instanceof NearHintRedDot) {
            if (this.mEndRedDotMode != 0) {
                ((NearHintRedDot) view4).setLaidOut();
                this.endRedDot.setVisibility(0);
                ((NearHintRedDot) this.endRedDot).setPointMode(this.mEndRedDotMode);
                ((NearHintRedDot) this.endRedDot).setPointNumber(this.mEndRedDotNum);
                this.endRedDot.invalidate();
            } else {
                view4.setVisibility(8);
            }
        }
        Integer num = this.itemBackgroundResource;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        preferenceViewHolder.itemView.setBackgroundResource(this.itemBackgroundResource.intValue());
    }

    public void setAssignment(CharSequence charSequence) {
        if (TextUtils.equals(this.mAssignment, charSequence)) {
            return;
        }
        this.mAssignment = charSequence;
        notifyChanged();
    }

    public void setAssignmentColor(int i) {
        this.mAssignmentColor = i;
    }

    public void setBackgroundAnimationEnabled(boolean z) {
        if (this.mIsBackgroundAnimationEnabled != z) {
            this.mIsBackgroundAnimationEnabled = z;
            notifyChanged();
        }
    }

    public void setClickStyle(int i) {
        this.mClickStyle = i;
    }

    public void setEndRedDotMode(int i) {
        this.mEndRedDotMode = i;
        notifyChanged();
    }

    public void setEndRedDotNum(int i) {
        this.mEndRedDotNum = i;
        notifyChanged();
    }

    public void setHorizontalPadding(int i, int i2) {
        this.paddingStart = i;
        this.paddingEnd = i2;
        notifyChanged();
    }

    public void setIconRedDotMode(int i) {
        this.mIconRedDotMode = i;
        notifyChanged();
    }

    public void setIconStyle(int i) {
        if (i == 0 || i == 1) {
            this.mIconStyle = i;
            notifyChanged();
        }
    }

    public void setIsSelect(boolean z) {
        if (this.mIsSelected != z) {
            this.mIsSelected = z;
            notifyChanged();
        }
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

    public void setSelectedState(boolean z) {
        this.mIsSelected = z;
    }

    public void setShowDivider(boolean z) {
        if (this.mShowDivider != z) {
            this.mShowDivider = z;
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

    public void setSummaryForceDarkAllowed(Boolean bool) {
        this.mSummaryForceDarkAllowed = bool;
        notifyChanged();
    }

    public void setTitleColor(ColorStateList colorStateList) {
        this.titleTextColor = colorStateList;
    }

    public void setTitleForceDarkAllowed(Boolean bool) {
        this.mTitleForceDarkAllowed = bool;
        notifyChanged();
    }

    public void showEndRedDot() {
        View view = this.endRedDot;
        if (view instanceof NearHintRedDot) {
            ((NearHintRedDot) view).executeScaleAnim(true);
            notifyChanged();
        }
    }

    public void showIconRedDot() {
        View view = this.iconRedDot;
        if (view instanceof NearHintRedDot) {
            ((NearHintRedDot) view).executeScaleAnim(true);
            notifyChanged();
        }
    }

    public NearPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.preferenceStyle);
    }

    public NearPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mShowDivider = true;
        this.mClickStyle = 0;
        this.mIsSelected = false;
        this.mIsBackgroundAnimationEnabled = true;
        this.paddingStart = 0;
        this.paddingEnd = 0;
        Boolean bool = Boolean.TRUE;
        this.mTitleForceDarkAllowed = bool;
        this.mSummaryForceDarkAllowed = bool;
        this.titleTextColor = null;
        this.summaryTextColor = null;
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, i2);
        this.mShowDivider = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxShowDivider, this.mShowDivider);
        this.mIsEnableClickSpan = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxEnalbeClickSpan, false);
        this.mJumpRes = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPreference_nxJumpMark);
        this.mStatusText1 = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus1);
        this.mClickStyle = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxClickStyle, 0);
        this.mAssignment = typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxAssignment);
        this.mIconStyle = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxIconStyle, 1);
        this.mIconRedDotMode = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxIconRedDotMode, 0);
        this.mEndRedDotMode = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxEndRedDotMode, 0);
        this.mEndRedDotNum = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxEndRedDotNum, 0);
        this.mAssignmentColor = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxAssignmentColor, 0);
        this.mIsBackgroundAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isBackgroundAnimationEnabled, true);
        this.mIsSupportCardUse = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_isSupportCardUse, true);
        this.paddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPreference_android_paddingStart, context.getResources().getDimensionPixelSize(R$dimen.nx_support_preference_title_padding_start));
        this.paddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPreference_android_paddingEnd, context.getResources().getDimensionPixelSize(R$dimen.nx_support_preference_title_padding_end));
        this.mTitleForceDarkAllowed = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxTitleForceDarkAllowed, true));
        this.mSummaryForceDarkAllowed = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxSummaryForceDarkAllowed, true));
        this.titleTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearPreference_nxTitleColor);
        this.summaryTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearPreference_nxSummaryColor);
        this.itemBackgroundResource = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearPreference_itemBackgroundResource, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setJump(int i) {
        setJump(this.mContext.getResources().getDrawable(i));
    }
}
