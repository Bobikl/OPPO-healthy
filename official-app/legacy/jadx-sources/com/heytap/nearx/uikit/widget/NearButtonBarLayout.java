package com.heytap.nearx.uikit.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearButtonBarLayout extends LinearLayout {
    private static final int ONE = 1;
    private static final int THREE = 3;
    private static final int TWO = 2;
    private static final int ZERO = 0;
    private View mButDivider1;
    private View mButDivider2;
    private int mButDividerSize;
    private View mContentPanel;
    private Context mContext;
    private View mCustomPanel;
    private boolean mForceVertical;
    private int mHorButDividerVerMargin;
    private int mHorButHorPadding;
    private int mHorButPaddingBottom;
    private int mHorButPaddingTop;
    private int mHorButPanelMinHeight;
    private Button mNegButton;
    private Button mNeuButton;
    private View mParentView;
    private Button mPosButton;
    private int mSingleNeuBtnPaddingBottomOffsetIfHasAboveContent;
    private View mTopPanel;
    private int mVerButDividerHorMargin;
    private int mVerButDividerVerMargin;
    private int mVerButHorPadding;
    private int mVerButMinHeight;
    private int mVerButPaddingOffset;
    private int mVerButVerPadding;
    private int mVerNegButVerPaddingOffset;
    private int mVerPaddingBottom;

    public NearButtonBarLayout(Context context) {
        super(context, null);
    }

    private int getBtnTextMeasureLength(Button button) {
        if (button == null || button.getVisibility() != 0) {
            return 0;
        }
        return (int) (button.isAllCaps() ? button.getPaint().measureText(button.getText().toString().toUpperCase()) : button.getPaint().measureText(button.getText().toString()));
    }

    private boolean hasContent(View view) {
        return view != null && view.getVisibility() == 0;
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mHorButHorPadding = context.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_horizontal_padding);
        this.mHorButPaddingTop = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_padding_top);
        this.mHorButPaddingBottom = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_padding_bottom);
        this.mVerButHorPadding = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_vertical_padding);
        this.mButDividerSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_alert_dialog_divider_height);
        this.mVerButMinHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_vertical_button_min_height);
        this.mVerButPaddingOffset = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_item_padding_offset);
        this.mVerButVerPadding = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_vertical_button_padding_vertical);
        this.mVerButDividerHorMargin = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_vertical_button_divider_horizontal_margin);
        this.mVerButDividerVerMargin = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_vertical_button_divider_vertical_margin);
        this.mHorButDividerVerMargin = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_horizontal_button_divider_vertical_margin);
        this.mHorButPanelMinHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_height);
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, R$styleable.NearButtonBarLayout);
        this.mForceVertical = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearButtonBarLayout_forceVertical, false);
        this.mVerNegButVerPaddingOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearButtonBarLayout_verNegButVerPaddingOffset, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initView() {
        if (this.mPosButton == null || this.mNegButton == null || this.mNeuButton == null || this.mButDivider1 == null || this.mButDivider2 == null || this.mParentView == null || this.mTopPanel == null || this.mContentPanel == null || this.mCustomPanel == null) {
            this.mPosButton = (Button) findViewById(R.id.button1);
            this.mNegButton = (Button) findViewById(R.id.button2);
            this.mNeuButton = (Button) findViewById(R.id.button3);
            this.mButDivider1 = findViewById(R$id.nx_dialog_button_divider_1);
            this.mButDivider2 = findViewById(R$id.nx_dialog_button_divider_2);
            View view = (View) getParent();
            this.mParentView = view;
            this.mTopPanel = view.findViewById(R$id.topPanel);
            this.mContentPanel = this.mParentView.findViewById(R$id.contentPanel);
            this.mCustomPanel = this.mParentView.findViewById(R$id.customPanel);
        }
    }

    private boolean isVertical() {
        return getOrientation() == 1;
    }

    private boolean needSetButVertical(int i) {
        int buttonCount = getButtonCount();
        if (buttonCount == 0) {
            return false;
        }
        int i2 = ((i - ((buttonCount - 1) * this.mButDividerSize)) / buttonCount) - (this.mHorButHorPadding * 2);
        return getBtnTextMeasureLength(this.mPosButton) > i2 || getBtnTextMeasureLength(this.mNegButton) > i2 || getBtnTextMeasureLength(this.mNeuButton) > i2;
    }

    private void resetHorDividerVisibility() {
        if (getButtonCount() == 2) {
            if (hasContent(this.mPosButton)) {
                this.mButDivider1.setVisibility(8);
                this.mButDivider2.setVisibility(0);
                return;
            } else {
                this.mButDivider1.setVisibility(0);
                this.mButDivider2.setVisibility(8);
                return;
            }
        }
        if (getButtonCount() == 3) {
            this.mButDivider1.setVisibility(0);
            this.mButDivider2.setVisibility(0);
        } else {
            this.mButDivider1.setVisibility(8);
            this.mButDivider2.setVisibility(8);
        }
    }

    private void resetHorPaddingBottom() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
    }

    private void resetVerButsBackground() {
        Button button;
        if (!this.mForceVertical || hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
            return;
        }
        if (getButtonCount() == 1) {
            if (hasContent(this.mPosButton)) {
                button = this.mPosButton;
            } else {
                button = hasContent(this.mNeuButton) ? this.mNeuButton : this.mNegButton;
            }
            button.setBackgroundResource(R$drawable.nx_alert_bottom_dialog_corner_button_background);
            return;
        }
        if (getButtonCount() == 2) {
            (hasContent(this.mPosButton) ? this.mPosButton : this.mNeuButton).setBackgroundResource(R$drawable.nx_alert_bottom_dialog_corner_button_background);
        } else if (getButtonCount() == 3) {
            this.mPosButton.setBackgroundResource(R$drawable.nx_alert_bottom_dialog_corner_button_background);
        }
    }

    private void resetVerButsPadding() {
        if (!this.mForceVertical) {
            if (hasContent(this.mPosButton)) {
                if (hasContent(this.mNeuButton) || hasContent(this.mNegButton)) {
                    Button button = this.mPosButton;
                    int i = this.mVerButHorPadding;
                    int i2 = this.mVerButVerPadding;
                    button.setPaddingRelative(i, i2, i, i2);
                    this.mPosButton.setMinHeight(this.mVerButMinHeight);
                } else {
                    Button button2 = this.mPosButton;
                    int i3 = this.mVerButHorPadding;
                    int i4 = this.mVerButVerPadding;
                    button2.setPaddingRelative(i3, i4, i3, this.mVerButPaddingOffset + i4);
                    this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                }
            }
            if (hasContent(this.mNeuButton)) {
                if (hasContent(this.mPosButton)) {
                    Button button3 = this.mNeuButton;
                    int i5 = this.mVerButHorPadding;
                    int i6 = this.mVerButVerPadding;
                    button3.setPaddingRelative(i5, i6, i5, i6);
                    this.mNeuButton.setMinHeight(this.mVerButMinHeight);
                } else if (hasContent(this.mNegButton)) {
                    Button button4 = this.mNeuButton;
                    int i7 = this.mVerButHorPadding;
                    int i8 = this.mVerButVerPadding;
                    button4.setPaddingRelative(i7, i8, i7, i8);
                    this.mNeuButton.setMinHeight(this.mVerButMinHeight);
                } else {
                    Button button5 = this.mNeuButton;
                    int i9 = this.mVerButHorPadding;
                    int i10 = this.mVerButVerPadding;
                    button5.setPaddingRelative(i9, i10, i9, this.mVerButPaddingOffset + i10);
                    this.mNeuButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                }
            }
            if (hasContent(this.mNegButton)) {
                Button button6 = this.mNegButton;
                int i11 = this.mVerButHorPadding;
                int i12 = this.mVerButVerPadding;
                button6.setPaddingRelative(i11, i12, i11, this.mVerButPaddingOffset + i12);
                this.mNegButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                return;
            }
            return;
        }
        if (hasContent(this.mNegButton)) {
            if (hasContent(this.mPosButton) || hasContent(this.mNeuButton) || hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
                Button button7 = this.mNegButton;
                int i13 = this.mVerButHorPadding;
                int i14 = this.mVerButVerPadding;
                int i15 = this.mVerNegButVerPaddingOffset;
                button7.setPaddingRelative(i13, i14 + i15, i13, i14 + i15);
                this.mNegButton.setMinHeight(this.mVerButMinHeight + (this.mVerNegButVerPaddingOffset * 2));
            } else {
                Button button8 = this.mNegButton;
                int i16 = this.mVerButHorPadding;
                int i17 = this.mVerButVerPadding;
                button8.setPaddingRelative(i16, this.mVerButPaddingOffset + i17, i16, i17);
                this.mNegButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
            }
        }
        if (hasContent(this.mNeuButton)) {
            if (hasContent(this.mNegButton)) {
                if (hasContent(this.mPosButton) || hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
                    Button button9 = this.mNeuButton;
                    int i18 = this.mVerButHorPadding;
                    int i19 = this.mVerButVerPadding;
                    button9.setPaddingRelative(i18, i19, i18, this.mVerButPaddingOffset + i19);
                    this.mNeuButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                } else {
                    Button button10 = this.mNeuButton;
                    int i20 = this.mVerButHorPadding;
                    int i21 = this.mVerButVerPadding;
                    int i22 = this.mVerButPaddingOffset;
                    button10.setPaddingRelative(i20, i21 + i22, i20, i21 + i22);
                    this.mNeuButton.setMinHeight(this.mVerButMinHeight + (this.mVerButPaddingOffset * 2));
                }
            } else if (hasContent(this.mPosButton) || hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
                int i23 = hasContent(this.mPosButton) ? 0 : this.mSingleNeuBtnPaddingBottomOffsetIfHasAboveContent;
                Button button11 = this.mNeuButton;
                int i24 = this.mVerButHorPadding;
                int i25 = this.mVerButVerPadding;
                button11.setPaddingRelative(i24, i25, i24, i25 + i23);
                this.mNeuButton.setMinHeight(this.mVerButMinHeight + i23);
            } else {
                Button button12 = this.mNeuButton;
                int i26 = this.mVerButHorPadding;
                int i27 = this.mVerButVerPadding;
                button12.setPaddingRelative(i26, this.mVerButPaddingOffset + i27, i26, i27);
                this.mNeuButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
            }
        }
        if (hasContent(this.mPosButton)) {
            if (hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
                if (hasContent(this.mNegButton)) {
                    if (hasContent(this.mNeuButton)) {
                        Button button13 = this.mPosButton;
                        int i28 = this.mVerButHorPadding;
                        int i29 = this.mVerButVerPadding;
                        button13.setPaddingRelative(i28, i29, i28, i29);
                        this.mPosButton.setMinHeight(this.mVerButMinHeight);
                        return;
                    }
                    Button button14 = this.mPosButton;
                    int i30 = this.mVerButHorPadding;
                    int i31 = this.mVerButVerPadding;
                    button14.setPaddingRelative(i30, i31, i30, this.mVerButPaddingOffset + i31);
                    this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                    return;
                }
                if (hasContent(this.mNeuButton)) {
                    Button button15 = this.mPosButton;
                    int i32 = this.mVerButHorPadding;
                    int i33 = this.mVerButVerPadding;
                    button15.setPaddingRelative(i32, i33, i32, this.mVerButPaddingOffset + i33);
                    this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                    return;
                }
                Button button16 = this.mPosButton;
                int i34 = this.mVerButHorPadding;
                int i35 = this.mVerButVerPadding;
                button16.setPaddingRelative(i34, i35, i34, i35);
                this.mPosButton.setMinHeight(this.mVerButMinHeight);
                return;
            }
            if (hasContent(this.mNegButton)) {
                if (hasContent(this.mNeuButton)) {
                    Button button17 = this.mPosButton;
                    int i36 = this.mVerButHorPadding;
                    int i37 = this.mVerButVerPadding;
                    button17.setPaddingRelative(i36, this.mVerButPaddingOffset + i37, i36, i37);
                    this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                    return;
                }
                Button button18 = this.mPosButton;
                int i38 = this.mVerButHorPadding;
                int i39 = this.mVerButVerPadding;
                int i40 = this.mVerButPaddingOffset;
                button18.setPaddingRelative(i38, i39 + i40, i38, i39 + i40);
                this.mPosButton.setMinHeight(this.mVerButMinHeight + (this.mVerButPaddingOffset * 2));
                return;
            }
            if (!hasContent(this.mNeuButton)) {
                Button button19 = this.mPosButton;
                int i41 = this.mVerButHorPadding;
                int i42 = this.mVerButVerPadding;
                button19.setPaddingRelative(i41, this.mVerButPaddingOffset + i42, i41, i42);
                this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                return;
            }
            Button button20 = this.mPosButton;
            int i43 = this.mVerButHorPadding;
            int i44 = this.mVerButVerPadding;
            int i45 = this.mVerButPaddingOffset;
            button20.setPaddingRelative(i43, i44 + i45, i43, i44 + i45);
            this.mPosButton.setMinHeight(this.mVerButMinHeight + (this.mVerButPaddingOffset * 2));
        }
    }

    private void resetVerDividerVisibility() {
        if (!this.mForceVertical) {
            if (getButtonCount() != 0) {
                this.mButDivider1.setVisibility(4);
                this.mButDivider2.setVisibility(8);
                return;
            } else {
                this.mButDivider1.setVisibility(8);
                this.mButDivider2.setVisibility(8);
                return;
            }
        }
        if (getButtonCount() == 0) {
            this.mButDivider1.setVisibility(8);
            this.mButDivider2.setVisibility(8);
            return;
        }
        if (!hasContent(this.mNegButton)) {
            this.mButDivider1.setVisibility(8);
            this.mButDivider2.setVisibility(8);
        } else if (hasContent(this.mNeuButton) || hasContent(this.mPosButton) || hasContent(this.mTopPanel) || hasContent(this.mContentPanel) || hasContent(this.mCustomPanel)) {
            this.mButDivider1.setVisibility(8);
            this.mButDivider2.setVisibility(0);
        } else {
            this.mButDivider1.setVisibility(8);
            this.mButDivider2.setVisibility(8);
        }
    }

    private void resetVerPaddingBottom() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.mVerPaddingBottom);
    }

    private void setButHorizontal(@NonNull Button button, Boolean bool) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = 0;
        layoutParams.height = -1;
        button.setLayoutParams(layoutParams);
        int i = this.mHorButHorPadding;
        button.setPaddingRelative(i, this.mHorButPaddingTop, i, this.mHorButPaddingBottom);
        button.setMinHeight(0);
        if (bool.booleanValue()) {
            bringChildToFront(button);
        }
    }

    private void setButtonsHorizontal() {
        setOrientation(0);
        setMinimumHeight(this.mHorButPanelMinHeight);
        setHorButDivider1();
        Button button = this.mNeuButton;
        Boolean bool = Boolean.TRUE;
        setButHorizontal(button, bool);
        setHorButDivider2();
        setButHorizontal(this.mPosButton, bool);
        setButHorizontal(this.mNegButton, Boolean.FALSE);
    }

    private void setButtonsVertical() {
        setOrientation(1);
        setMinimumHeight(0);
        setNeuButVertical();
        setVerButDivider2();
        setNegButVertical();
        setVerButDivider1();
        setPosButVertical();
    }

    private void setHorButDivider1() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mButDivider1.getLayoutParams();
        layoutParams.width = this.mButDividerSize;
        layoutParams.height = -1;
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        int i = this.mHorButDividerVerMargin;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        this.mButDivider1.setLayoutParams(layoutParams);
        bringChildToFront(this.mButDivider1);
    }

    private void setHorButDivider2() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mButDivider2.getLayoutParams();
        layoutParams.width = this.mButDividerSize;
        layoutParams.height = -1;
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        int i = this.mHorButDividerVerMargin;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        this.mButDivider2.setLayoutParams(layoutParams);
        bringChildToFront(this.mButDivider2);
    }

    private void setNegButVertical() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mNegButton.getLayoutParams();
        layoutParams.weight = 0.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.mNegButton.setLayoutParams(layoutParams);
        Button button = this.mNegButton;
        int i = this.mVerButHorPadding;
        int i2 = this.mVerButVerPadding;
        button.setPaddingRelative(i, i2, i, this.mVerButPaddingOffset + i2);
        this.mNegButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
        bringChildToFront(this.mNegButton);
    }

    private void setNeuButVertical() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mNeuButton.getLayoutParams();
        layoutParams.weight = 0.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.mNeuButton.setLayoutParams(layoutParams);
        Button button = this.mNeuButton;
        int i = this.mVerButHorPadding;
        int i2 = this.mVerButVerPadding;
        button.setPaddingRelative(i, i2, i, i2);
        this.mNeuButton.setMinHeight(this.mVerButMinHeight);
        bringChildToFront(this.mNeuButton);
    }

    private void setPosButVertical() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mPosButton.getLayoutParams();
        layoutParams.weight = 0.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.mPosButton.setLayoutParams(layoutParams);
        Button button = this.mPosButton;
        int i = this.mVerButHorPadding;
        int i2 = this.mVerButVerPadding;
        button.setPaddingRelative(i, this.mVerButPaddingOffset + i2, i, i2);
        this.mPosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
    }

    private void setVerButDivider1() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mButDivider1.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = this.mButDividerSize;
        layoutParams.setMarginStart(this.mVerButDividerHorMargin);
        layoutParams.setMarginEnd(this.mVerButDividerHorMargin);
        layoutParams.topMargin = this.mVerButDividerVerMargin;
        layoutParams.bottomMargin = 0;
        this.mButDivider1.setLayoutParams(layoutParams);
    }

    private void setVerButDivider2() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mButDivider2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = this.mButDividerSize;
        layoutParams.setMarginStart(this.mVerButDividerHorMargin);
        layoutParams.setMarginEnd(this.mVerButDividerHorMargin);
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.mButDivider2.setLayoutParams(layoutParams);
        bringChildToFront(this.mButDivider2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public int getButtonCount() {
        initView();
        ?? HasContent = hasContent(this.mPosButton);
        int i = HasContent;
        if (hasContent(this.mNegButton)) {
            i = HasContent + 1;
        }
        return hasContent(this.mNeuButton) ? i + 1 : i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        initView();
        if (!this.mForceVertical && !needSetButVertical(getMeasuredWidth())) {
            if (isVertical()) {
                setButtonsHorizontal();
            }
            resetHorDividerVisibility();
            resetHorPaddingBottom();
            super.onMeasure(i, i2);
            return;
        }
        if (!isVertical()) {
            setButtonsVertical();
        }
        resetVerButsPadding();
        resetVerDividerVisibility();
        resetVerPaddingBottom();
        super.onMeasure(i, i2);
    }

    public void setForceVertical(boolean z) {
        this.mForceVertical = z;
    }

    public void setSingleNeuBtnPaddingBottomOffsetIfHasAboveContent(int i) {
        this.mSingleNeuBtnPaddingBottomOffsetIfHasAboveContent = i;
    }

    public void setVerButDividerVerMargin(int i) {
        this.mVerButDividerVerMargin = i;
    }

    public void setVerButPaddingOffset(int i) {
        this.mVerButPaddingOffset = i;
    }

    public void setVerButVerPadding(int i) {
        this.mVerButVerPadding = i;
    }

    public void setVerNegButVerPaddingOffset(int i) {
        this.mVerNegButVerPaddingOffset = i;
    }

    public void setVerPaddingBottom(int i) {
        this.mVerPaddingBottom = i;
    }

    public NearButtonBarLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearButtonBarLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
