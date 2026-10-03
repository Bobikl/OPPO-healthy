package com.heytap.nearx.uikit.widget.floatingbutton;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.ilc;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.xfc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearFloatingButtonLabel extends LinearLayout {
    private static final int DEFAULT_ELEVATION_FLOATING_BUTTON = 24;
    private static final float DEFAULT_PRESS_GUARANTEED_ANIMATION_VALUE = 0.98f;
    private static final float DEFAULT_RADIUS_VALUE = 5.67f;
    private static final String TAG = "NearFloatingButtonLabel";
    private ShapeableImageView mChildFloatingButton;

    @Nullable
    private NearFloatingButtonItem mFloatingButtonItem;
    private boolean mIsLabelEnabled;
    private CardView mLabelBackground;
    private float mLabelCardViewElevation;
    private TextView mLabelTextView;

    @Nullable
    private NearFloatingButton.OnActionSelectedListener mOnActionSelectedListener;
    private ValueAnimator mPressAnimationRecorder;
    private float mPressValue;

    public NearFloatingButtonLabel(Context context) {
        super(context);
        init(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateNormal() {
        clearAnimation();
        cancelRecorder();
        ShapeableImageView shapeableImageView = this.mChildFloatingButton;
        shapeableImageView.startAnimation(NearFABPressFeedbackUtil.generateResumeAnimation(shapeableImageView, this.mPressValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animatePress() {
        clearAnimation();
        cancelRecorder();
        NearFloatingButtonTouchAnimation nearFloatingButtonTouchAnimationGeneratePressAnimation = NearFABPressFeedbackUtil.generatePressAnimation(this.mChildFloatingButton);
        ValueAnimator valueAnimatorGeneratePressAnimationRecord = NearFABPressFeedbackUtil.generatePressAnimationRecord();
        this.mPressAnimationRecorder = valueAnimatorGeneratePressAnimationRecord;
        valueAnimatorGeneratePressAnimationRecord.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearFloatingButtonLabel.this.mPressValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (NearFloatingButtonLabel.this.mPressValue >= NearFloatingButtonLabel.DEFAULT_PRESS_GUARANTEED_ANIMATION_VALUE) {
                    NearFloatingButtonLabel.this.mPressValue = NearFloatingButtonLabel.DEFAULT_PRESS_GUARANTEED_ANIMATION_VALUE;
                }
            }
        });
        nearFloatingButtonTouchAnimationGeneratePressAnimation.setAnimationListener(new xfc() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.7
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                NearFloatingButtonLabel.this.mPressAnimationRecorder.start();
            }
        });
        this.mChildFloatingButton.startAnimation(nearFloatingButtonTouchAnimationGeneratePressAnimation);
    }

    private void cancelRecorder() {
        ValueAnimator valueAnimator = this.mPressAnimationRecorder;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mPressAnimationRecorder.cancel();
    }

    private void childFloatingButtonTouch() {
        this.mChildFloatingButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    NearFloatingButtonLabel.this.animatePress();
                    return false;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                NearFloatingButtonLabel.this.animateNormal();
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dpToPx(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnClickFloatingButton() {
        NearFloatingButtonItem floatingButtonItem = getFloatingButtonItem();
        NearFloatingButton.OnActionSelectedListener onActionSelectedListener = this.mOnActionSelectedListener;
        if (onActionSelectedListener == null || floatingButtonItem == null) {
            return;
        }
        onActionSelectedListener.onActionSelected(floatingButtonItem);
    }

    private void init(Context context, @Nullable AttributeSet attributeSet) {
        View viewInflate = View.inflate(context, R$layout.nx_floating_button_item_label, this);
        this.mChildFloatingButton = (ShapeableImageView) viewInflate.findViewById(R$id.nx_floating_button_child_fab);
        this.mLabelTextView = (TextView) viewInflate.findViewById(R$id.nx_floating_button_label);
        this.mLabelBackground = (CardView) viewInflate.findViewById(R$id.nx_floating_button_label_container);
        this.mChildFloatingButton.setElevation(24.0f);
        this.mChildFloatingButton.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        });
        this.mChildFloatingButton.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCornerSizes(ShapeAppearanceModel.PILL).build());
        this.mLabelBackground.setCardElevation(24.0f);
        this.mLabelBackground.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), NearFloatingButtonLabel.dpToPx(NearFloatingButtonLabel.this.getContext(), NearFloatingButtonLabel.DEFAULT_RADIUS_VALUE));
            }
        });
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearFloatingButtonLabel, 0, 0);
        try {
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearFloatingButtonLabel_srcCompat, Integer.MIN_VALUE);
                if (resourceId == Integer.MIN_VALUE) {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearFloatingButtonLabel_android_src, Integer.MIN_VALUE);
                }
                NearFloatingButtonItem.Builder builder = new NearFloatingButtonItem.Builder(getId(), resourceId);
                builder.setLabel(typedArrayObtainStyledAttributes.getString(R$styleable.NearFloatingButtonLabel_fabLabel));
                builder.setFabBackgroundColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFloatingButtonLabel_fabBackgroundColor, thc.b(getContext(), R$attr.nxColorPrimary, 0))));
                builder.setLabelColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFloatingButtonLabel_fabLabelColor, Integer.MIN_VALUE)));
                builder.setLabelBackgroundColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFloatingButtonLabel_fabLabelBackgroundColor, Integer.MIN_VALUE)));
                setFloatingButtonItem(builder.create());
            } catch (Exception e2) {
                Log.e(TAG, "Failure setting FabWithLabelView icon" + e2.getMessage());
            }
            typedArrayObtainStyledAttributes.recycle();
            setClipChildren(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setChildFloatingButtonSize() {
        LinearLayout.LayoutParams layoutParams;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.nx_floating_button_fab_normal_size);
        getContext().getResources().getDimensionPixelSize(R$dimen.nx_floating_button_fab_side_margin);
        getContext().getResources().getDimensionPixelSize(R$dimen.nx_floating_button_item_normal_bottom_margin);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mChildFloatingButton.getLayoutParams();
        if (getOrientation() == 0) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = GravityCompat.END;
        } else {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimensionPixelSize, -2);
            layoutParams3.gravity = 16;
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams = layoutParams3;
        }
        setLayoutParams(layoutParams);
        this.mChildFloatingButton.setLayoutParams(layoutParams2);
    }

    private void setFabBackgroundColor(ColorStateList colorStateList) {
        this.mChildFloatingButton.setBackgroundTintList(colorStateList);
    }

    private void setFabIcon(@Nullable Drawable drawable) {
        this.mChildFloatingButton.setImageDrawable(drawable);
    }

    private void setLabel(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setLabelEnabled(false);
        } else {
            this.mLabelTextView.setText(charSequence);
            setLabelEnabled(getOrientation() == 0);
        }
    }

    private void setLabelBackgroundColor(ColorStateList colorStateList) {
        if (colorStateList == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            this.mLabelBackground.setCardBackgroundColor(0);
            this.mLabelCardViewElevation = this.mLabelBackground.getElevation();
            this.mLabelBackground.setElevation(0.0f);
        } else {
            this.mLabelBackground.setCardBackgroundColor(colorStateList);
            float f = this.mLabelCardViewElevation;
            if (f != 0.0f) {
                this.mLabelBackground.setElevation(f);
                this.mLabelCardViewElevation = 0.0f;
            }
        }
    }

    private void setLabelEnabled(boolean z) {
        this.mIsLabelEnabled = z;
        this.mLabelBackground.setVisibility(z ? 0 : 8);
    }

    private void setLabelTextColor(ColorStateList colorStateList) {
        this.mLabelTextView.setTextColor(colorStateList);
    }

    public ImageView getChildFloatingButton() {
        return this.mChildFloatingButton;
    }

    public PorterDuffColorFilter getDrawableFilter(@ColorInt int i) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public NearFloatingButtonItem getFloatingButtonItem() {
        NearFloatingButtonItem nearFloatingButtonItem = this.mFloatingButtonItem;
        if (nearFloatingButtonItem != null) {
            return nearFloatingButtonItem;
        }
        throw new IllegalStateException("SpeedDialActionItem not set yet!");
    }

    public NearFloatingButtonItem.Builder getFloatingButtonItemBuilder() {
        return new NearFloatingButtonItem.Builder(getFloatingButtonItem());
    }

    public CardView getFloatingButtonLabelBackground() {
        return this.mLabelBackground;
    }

    public TextView getFloatingButtonLabelText() {
        return this.mLabelTextView;
    }

    public boolean isLabelEnabled() {
        return this.mIsLabelEnabled;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mLabelTextView.setEnabled(z);
        this.mChildFloatingButton.setEnabled(z);
        this.mLabelBackground.setEnabled(z);
    }

    public void setFloatingButtonItem(NearFloatingButtonItem nearFloatingButtonItem) {
        this.mFloatingButtonItem = nearFloatingButtonItem;
        setId(nearFloatingButtonItem.getFloatingButtonItemLocation());
        setLabel(nearFloatingButtonItem.getLabel(getContext()));
        setFabIcon(nearFloatingButtonItem.getFabImageDrawable(getContext()));
        ColorStateList fabBackgroundColor = nearFloatingButtonItem.getFabBackgroundColor();
        int color = getContext().getResources().getColor(R$color.nxGreenTintControlNormal);
        int iB = thc.b(getContext(), R$attr.nxColorPrimary, color);
        if (fabBackgroundColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            fabBackgroundColor = ilc.a(iB, color);
        }
        setFabBackgroundColor(fabBackgroundColor);
        ColorStateList labelColor = nearFloatingButtonItem.getLabelColor();
        if (labelColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            labelColor = ResourcesCompat.getColorStateList(getResources(), R$color.nx_floating_button_label_text_color, getContext().getTheme());
        }
        setLabelTextColor(labelColor);
        ColorStateList labelBackgroundColor = nearFloatingButtonItem.getLabelBackgroundColor();
        if (labelBackgroundColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            labelBackgroundColor = ilc.a(iB, color);
        }
        setLabelBackgroundColor(labelBackgroundColor);
        if (nearFloatingButtonItem.isNearFloatingButtonExpandEnable()) {
            childFloatingButtonTouch();
        }
        getChildFloatingButton().setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                NearFloatingButtonLabel.this.handleOnClickFloatingButton();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    public void setOnActionSelectedListener(@Nullable NearFloatingButton.OnActionSelectedListener onActionSelectedListener) {
        this.mOnActionSelectedListener = onActionSelectedListener;
        if (onActionSelectedListener != null) {
            getFloatingButtonLabelBackground().setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonLabel.2
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    NearFloatingButtonItem floatingButtonItem = NearFloatingButtonLabel.this.getFloatingButtonItem();
                    if (NearFloatingButtonLabel.this.mOnActionSelectedListener != null && floatingButtonItem != null) {
                        NearFloatingButtonLabel.this.mOnActionSelectedListener.onActionSelected(floatingButtonItem);
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        } else {
            getChildFloatingButton().setOnClickListener(null);
            getFloatingButtonLabelBackground().setOnClickListener(null);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(i);
        setChildFloatingButtonSize();
        if (i == 1) {
            setLabelEnabled(false);
        } else {
            setLabel(this.mLabelTextView.getText().toString());
        }
    }

    @Override // android.view.View
    @SuppressLint({"RestrictedApi"})
    public void setVisibility(int i) {
        super.setVisibility(i);
        getChildFloatingButton().setVisibility(i);
        if (isLabelEnabled()) {
            getFloatingButtonLabelBackground().setVisibility(i);
        }
    }

    public NearFloatingButtonLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public NearFloatingButtonLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
