package com.heytap.nearx.uikit.widget.floatingbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.hjc;
import com.oplus.aiunit.vision.ilc;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.xfc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearFloatingButton extends LinearLayout {
    private static final int ACTION_ANIM_DELAY = 50;
    private static final String ANIMATION_TYPE_ALPHA = "alpha";
    private static final String ANIMATION_TYPE_ROTATION = "rotation";
    private static final String ANIMATION_TYPE_SCALE_X = "scaleX";
    private static final String ANIMATION_TYPE_SCALE_Y = "scaleY";
    private static final String ANIMATION_TYPE_TRANSLATION_Y = "translationY";
    private static final float DEFAULT_ALPHA_ANIMATION_MAX_VALUE = 1.0f;
    private static final float DEFAULT_ALPHA_ANIMATION_MIN_VALUE = 0.0f;
    private static final float DEFAULT_ANIMATION_EXPAND_END_VALUE = 1.1f;
    private static final float DEFAULT_ANIMATION_EXPAND_START_VALUE = 1.0f;
    private static final float DEFAULT_ANIMATION_NARROW_END_VALUE = 1.0f;
    private static final float DEFAULT_ANIMATION_NARROW_START_VALUE = 1.1f;
    private static final int DEFAULT_BUTTON_EXPAND_ANIMATION_DURATION = 66;
    private static final int DEFAULT_BUTTON_LABEL_CLOSE_ALPHA_ANIMATION_DURATION = 350;
    private static final float DEFAULT_CLOSE_MENU_ALPHA_ANIMATION_END_VALUE = 0.0f;
    private static final float DEFAULT_CLOSE_MENU_ALPHA_ANIMATION_START_VALUE = 1.0f;
    private static final int DEFAULT_CLOSE_MENU_ANIMATION_DURATION_WITH_SLIDE_OUT = 150;
    private static final float DEFAULT_CLOSE_MENU_NARROW_ANIMATION_END_VALUE = 0.6f;
    private static final float DEFAULT_CLOSE_MENU_NARROW_ANIMATION_START_VALUE = 1.0f;
    private static final int DEFAULT_ELEVATION_FLOATING_BUTTON = 24;
    private static final long DEFAULT_ENLARGE_ANIMATION_DURATION = 350;
    private static final PathInterpolator DEFAULT_ENLARGE_ANIMATION_INTERPOLATOR = new hjc();
    private static final float DEFAULT_EXPAND_MENU_ALPHA_ANIMATION_END_VALUE = 1.0f;
    private static final float DEFAULT_EXPAND_MENU_ALPHA_ANIMATION_START_VALUE = 0.0f;
    private static final float DEFAULT_EXPAND_MENU_EXPAND_ANIMATION_END_VALUE = 1.0f;
    private static final float DEFAULT_EXPAND_MENU_EXPAND_ANIMATION_START_VALUE = 0.6f;
    private static final int DEFAULT_EXPAND_WAY = 0;
    private static final int DEFAULT_LABEL_ALPHA_ANIMATION_DURATION = 200;
    private static final int DEFAULT_MAIN_FLOATING_BUTTON_ANIMATION_DURATION = 300;
    private static final int DEFAULT_MARGIN_BOTTOM_FIRST_CHILD = 32;
    private static final int DEFAULT_MARGIN_BOTTOM_NOT_FIRST_CHILD = 16;
    private static final int DEFAULT_Near_FLOATING_BUTTON_SIZE = 56;
    private static final float DEFAULT_PRESS_GUARANTEED_ANIMATION_VALUE = 0.98f;
    private static final int DEFAULT_ROTATE_ANGLE = 45;
    private static final int DEFAULT_ROTATE_ANIMATION_DURATION = 250;
    private static final int DEFAULT_ROTATE_ANIMATION_DURATION_NO_ITEM = 300;
    private static final float DEFAULT_SCALE_ANIMATION_MAX_VALUE = 1.0f;
    private static final float DEFAULT_SCALE_ANIMATION_MIN_VALUE = 0.6f;
    private static final float DEFAULT_SCALE_PERCENT = 0.4f;
    private static final int DEFAULT_SLIDE_IN_ANIMATION_DURATION = 200;
    private static final int DEFAULT_SLIDE_OUT_ANIMATION_DURATION = 250;
    private static final int DEFAULT_SLIDE_OUT_TRANSITION_ANIMATION_DURATION = 140;
    private static final int DEFAULT_SLIDING_THRESHOLD = 10;
    private static final float DEFAULT_SPRING_ANIMATION_DAMPING_RATIO = 0.8f;
    private static final int DEFAULT_SPRING_ANIMATION_START_VELOCITY = 0;
    private static final int DEFAULT_SPRING_ANIMATION_STIFFNESS = 500;
    private static final int DELAY_TIME_NO_ACTION_SLIDE_OUT = 5000;
    private static final int MAIN_FAB_HORIZONTAL_MARGIN_IN_DP = 12;
    private static final int MAIN_FAB_VERTICAL_MARGIN_IN_DP = 8;
    private static final int MAX_COLOR_FLOATING_BUTTON_SIZE = 6;
    private static final int MESSAGE_PAUSE_TIME_SLIDE_OUT = 1;
    private static final String STATE_KEY_EXPANSION_MODE = "expansionMode";
    private static final String STATE_KEY_IS_OPEN = "isOpen";
    private static final String STATE_KEY_SUPER = "superState";
    private static final String TAG = "NearFloatingButton";
    private static final float TWO = 2.0f;
    private Runnable mAutoDismissRunnable;
    private PathInterpolator mCloseMenuLabelPathInterpolator;
    private PathInterpolator mCloseMenuPathInterpolator;
    private int mCurrentWindowHeight;
    private int mCurrentWindowHeightOffset;
    private PathInterpolator mExpandMenuAnimationInterpolator;
    private OnFloatingButtonClickListener mFloatingButtonClickListener;
    private List<NearFloatingButtonLabel> mFloatingButtonLabelList;
    private ValueAnimator mHideAnimator;
    private final InstanceState mInstanceState;
    private boolean mIsAnimationInStart;
    private boolean mIsAnimationOutStart;
    private boolean mIsNeedToDelayCancelScaleAnim;
    private PathInterpolator mLabelPathInterpolator;

    @Nullable
    private Drawable mMainFabCloseOriginalDrawable;

    @Nullable
    private Drawable mMainFabClosedDrawable;
    private ShapeableImageView mMainFloatingButton;
    private float mMainFloatingButtonX;
    private float mMainFloatingButtonY;

    @Nullable
    private OnActionSelectedListener mOnActionSelectedListener;
    private OnActionSelectedListener mOnActionSelectedProxyListener;

    @Nullable
    private OnChangeListener mOnChangeListener;
    private ValueAnimator mPressAnimationRecorder;
    private float mPressValue;
    private float mRotateAngle;
    private PathInterpolator mRotateBackwardInterpolator;
    private PathInterpolator mRotateForwardInterpolator;
    private OnActionSelectedListener mTempOnActionSelectedListener;

    public class AutoDismissRunnable implements Runnable {
        private AutoDismissRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NearFloatingButton.this.animationFloatingButtonEnlarge();
        }
    }

    public interface OnActionSelectedListener {
        boolean onActionSelected(NearFloatingButtonItem nearFloatingButtonItem);
    }

    public interface OnChangeListener {
        boolean onMainActionSelected();

        void onToggleChanged(boolean z);
    }

    public interface OnFloatingButtonClickListener {
        void onClick();
    }

    public NearFloatingButton(Context context) {
        super(context);
        this.mInstanceState = new InstanceState();
        this.mFloatingButtonLabelList = new ArrayList();
        this.mMainFabClosedDrawable = null;
        this.mExpandMenuAnimationInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuPathInterpolator = new hjc();
        this.mLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateForwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateBackwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mOnActionSelectedProxyListener = new OnActionSelectedListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.1
            @Override // com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.OnActionSelectedListener
            public boolean onActionSelected(NearFloatingButtonItem nearFloatingButtonItem) {
                if (NearFloatingButton.this.mOnActionSelectedListener == null) {
                    return false;
                }
                boolean zOnActionSelected = NearFloatingButton.this.mOnActionSelectedListener.onActionSelected(nearFloatingButtonItem);
                if (!zOnActionSelected) {
                    NearFloatingButton.this.closeFloatingButtonMenu(false, 300);
                }
                return zOnActionSelected;
            }
        };
        init(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateNormal() {
        cancelAnimation(false);
        if (this.mIsNeedToDelayCancelScaleAnim) {
            return;
        }
        this.mMainFloatingButton.startAnimation(NearFABPressFeedbackUtil.generateResumeAnimation(this.mMainFloatingButton, this.mPressValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animatePress() {
        cancelAnimation(true);
        NearFloatingButtonTouchAnimation nearFloatingButtonTouchAnimationGeneratePressAnimation = NearFABPressFeedbackUtil.generatePressAnimation(this.mMainFloatingButton);
        ValueAnimator valueAnimatorGeneratePressAnimationRecord = NearFABPressFeedbackUtil.generatePressAnimationRecord();
        this.mPressAnimationRecorder = valueAnimatorGeneratePressAnimationRecord;
        valueAnimatorGeneratePressAnimationRecord.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearFloatingButton.this.mPressValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        nearFloatingButtonTouchAnimationGeneratePressAnimation.setAnimationListener(new xfc() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                NearFloatingButton.this.mPressAnimationRecorder.start();
            }
        });
        this.mMainFloatingButton.startAnimation(nearFloatingButtonTouchAnimationGeneratePressAnimation);
    }

    private void animationFloatingButtonMenuClose(final NearFloatingButtonLabel nearFloatingButtonLabel, int i, final int i2, final int i3, final boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int totalLabelHeight = getTotalLabelHeight(i2);
        if (z) {
            totalLabelHeight += marginLayoutParams.bottomMargin + this.mMainFloatingButton.getHeight();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearFloatingButtonLabel, "translationY", totalLabelHeight);
        objectAnimatorOfFloat.setStartDelay(i);
        objectAnimatorOfFloat.setDuration(i3);
        objectAnimatorOfFloat.setInterpolator(this.mCloseMenuPathInterpolator);
        if (nearFloatingButtonLabel.getFloatingButtonLabelText().getText() != "") {
            if (isRtlMode()) {
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(0.0f);
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(nearFloatingButtonLabel.getFloatingButtonLabelBackground().getHeight());
            } else {
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(nearFloatingButtonLabel.getFloatingButtonLabelBackground().getWidth());
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(nearFloatingButtonLabel.getFloatingButtonLabelBackground().getHeight());
            }
        }
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.12
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                nearFloatingButtonLabel.setTranslationY(NearFloatingButton.this.getTotalLabelHeight(i2));
                nearFloatingButtonLabel.getChildFloatingButton().setPivotX(nearFloatingButtonLabel.getChildFloatingButton().getWidth() / 2.0f);
                nearFloatingButtonLabel.getChildFloatingButton().setPivotY(nearFloatingButtonLabel.getChildFloatingButton().getHeight() / 2.0f);
                NearFloatingButtonLabel nearFloatingButtonLabel2 = nearFloatingButtonLabel;
                nearFloatingButtonLabel2.setPivotX(nearFloatingButtonLabel2.getWidth());
                NearFloatingButtonLabel nearFloatingButtonLabel3 = nearFloatingButtonLabel;
                nearFloatingButtonLabel3.setPivotY(nearFloatingButtonLabel3.getHeight());
                if (NearFloatingButton.this.isLastFloatingButtonLabel(i2)) {
                    NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = false;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (NearFloatingButton.this.isFirstFloatingButtonLabel(i2)) {
                    NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = true;
                    NearFloatingButton.this.setOnActionSelectedListener(null);
                }
                if (z) {
                    NearFloatingButton.this.narrowFloatingButton(nearFloatingButtonLabel, i2, i3, true);
                } else {
                    NearFloatingButton.this.narrowFloatingButton(nearFloatingButtonLabel, i2, i3, false);
                }
            }
        });
        objectAnimatorOfFloat.start();
    }

    private void animationFloatingButtonMenuExpand(final NearFloatingButtonLabel nearFloatingButtonLabel, int i, final int i2, final int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        final SpringAnimation springAnimation = new SpringAnimation(nearFloatingButtonLabel, DynamicAnimation.TRANSLATION_Y, 0.0f);
        springAnimation.getSpring().setStiffness(500.0f);
        springAnimation.getSpring().setDampingRatio(0.8f);
        springAnimation.setStartVelocity(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "alpha", 0.0f, 1.0f);
        final ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat6.setInterpolator(this.mExpandMenuAnimationInterpolator);
        objectAnimatorOfFloat6.setDuration(DEFAULT_ENLARGE_ANIMATION_DURATION);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat5, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setInterpolator(this.mExpandMenuAnimationInterpolator);
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(i);
        if (nearFloatingButtonLabel.getFloatingButtonLabelText().getText() != "") {
            if (isRtlMode()) {
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(0.0f);
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(0.0f);
            } else {
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(nearFloatingButtonLabel.getFloatingButtonLabelBackground().getWidth());
                nearFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(0.0f);
            }
        }
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NearFloatingButton.this.isFirstFloatingButtonLabel(i2)) {
                    NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = false;
                    NearFloatingButton nearFloatingButton = NearFloatingButton.this;
                    nearFloatingButton.setOnActionSelectedListener(nearFloatingButton.mTempOnActionSelectedListener);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (NearFloatingButton.this.isLastFloatingButtonLabel(i2)) {
                    NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = true;
                    NearFloatingButton.this.setOnActionSelectedListener(null);
                }
                objectAnimatorOfFloat6.start();
                springAnimation.animateToFinalPosition(0.0f);
                nearFloatingButtonLabel.setVisibility(i3);
            }
        });
        animatorSet.start();
    }

    private void cancelAnimation(boolean z) {
        this.mIsNeedToDelayCancelScaleAnim = false;
        ValueAnimator valueAnimator = this.mPressAnimationRecorder;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mPressAnimationRecorder.cancel();
        }
        if (this.mIsNeedToDelayCancelScaleAnim) {
            return;
        }
        clearAnimation();
    }

    private void cancelHideAnimator() {
        ValueAnimator valueAnimator = this.mHideAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mHideAnimator.cancel();
    }

    private ShapeableImageView createMainFab() {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.nx_floating_button_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.nx_floating_button_item_stroke_width);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = GravityCompat.END;
        int iDpToPx = dpToPx(getContext(), 0.0f);
        dpToPx(getContext(), 8.0f);
        layoutParams.setMargins(iDpToPx, 0, iDpToPx, 0);
        shapeableImageView.setId(R$id.nx_floating_button_main_fab);
        shapeableImageView.setLayoutParams(layoutParams);
        shapeableImageView.setStrokeWidth(dimensionPixelSize2);
        shapeableImageView.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        shapeableImageView.setStrokeColorResource(R$color.nx_floating_button_label_broader_color);
        shapeableImageView.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCornerSizes(ShapeAppearanceModel.PILL).build());
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER);
        shapeableImageView.setClickable(true);
        shapeableImageView.setFocusable(true);
        int color = getContext().getResources().getColor(R$color.nxGreenTintControlNormal);
        shapeableImageView.setBackgroundTintList(ilc.a(thc.b(getContext(), R$attr.nxColorPrimary, color), color));
        return shapeableImageView;
    }

    private static int dpToPx(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    private NearFloatingButtonLabel findFloatingButtonItemByIndex(int i) {
        if (i < this.mFloatingButtonLabelList.size()) {
            return this.mFloatingButtonLabelList.get(i);
        }
        return null;
    }

    @Nullable
    private NearFloatingButtonLabel findFloatingButtonItemByPosition(int i) {
        for (NearFloatingButtonLabel nearFloatingButtonLabel : this.mFloatingButtonLabelList) {
            if (nearFloatingButtonLabel.getId() == i) {
                return nearFloatingButtonLabel;
            }
        }
        return null;
    }

    private int getLayoutPosition(int i) {
        return this.mFloatingButtonLabelList.size() - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTotalLabelHeight(int i) {
        if (i < 0 || i >= this.mFloatingButtonLabelList.size()) {
            return 0;
        }
        return dpToPx(getContext(), (i * 72) + 88);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnClickFloatingButton() {
        if (!isOpen()) {
            openFloatingButtonMenu();
            return;
        }
        OnChangeListener onChangeListener = this.mOnChangeListener;
        if (onChangeListener == null || !onChangeListener.onMainActionSelected()) {
            closeFloatingButtonMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hide(@Nullable FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
        if (isOpen()) {
            closeFloatingButtonMenu();
            ViewCompat.animate(this.mMainFloatingButton).rotation(0.0f).setDuration(0L).start();
        }
    }

    private void init(Context context, @Nullable AttributeSet attributeSet) {
        this.mMainFloatingButton = createMainFab();
        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.6
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        };
        this.mMainFloatingButton.setElevation(24.0f);
        this.mMainFloatingButton.setOutlineProvider(viewOutlineProvider);
        this.mMainFloatingButton.setBackgroundColor(thc.b(getContext(), R$attr.nxColorPrimary, 0));
        addView(this.mMainFloatingButton);
        setClipChildren(false);
        setClipToPadding(false);
        this.mAutoDismissRunnable = new AutoDismissRunnable();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearFloatingButton, 0, 0);
        try {
            try {
                setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearFloatingButton_android_enabled, isEnabled()));
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearFloatingButton_nxMainFloatingButtonSrc, Integer.MIN_VALUE);
                if (resourceId != Integer.MIN_VALUE) {
                    setMainFabDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                }
                setExpansionMode();
                setMainFloatingButtonBackgroundColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearFloatingButton_nxMainFloatingButtonBackgroundColor));
                setFloatingButtonExpandEnable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearFloatingButton_nxFabExpandAnimationEnable, true));
            } catch (Exception e2) {
                Log.e(TAG, "Failure setting FabWithLabelView icon" + e2.getMessage());
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFirstFloatingButtonLabel(int i) {
        NearFloatingButtonLabel nearFloatingButtonLabelFindFloatingButtonItemByIndex = findFloatingButtonItemByIndex(i);
        return nearFloatingButtonLabelFindFloatingButtonItemByIndex != null && indexOfChild(nearFloatingButtonLabelFindFloatingButtonItemByIndex) == this.mFloatingButtonLabelList.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLastFloatingButtonLabel(int i) {
        NearFloatingButtonLabel nearFloatingButtonLabelFindFloatingButtonItemByIndex = findFloatingButtonItemByIndex(i);
        return nearFloatingButtonLabelFindFloatingButtonItemByIndex != null && indexOfChild(nearFloatingButtonLabelFindFloatingButtonItemByIndex) == 0;
    }

    private boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void narrowFloatingButton(NearFloatingButtonLabel nearFloatingButtonLabel, int i, int i2, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getChildFloatingButton(), "alpha", 1.0f, 0.0f);
        final ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(nearFloatingButtonLabel.getFloatingButtonLabelBackground(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setInterpolator(this.mCloseMenuLabelPathInterpolator);
        objectAnimatorOfFloat6.setDuration(200L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat5, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        animatorSet.setInterpolator(this.mCloseMenuPathInterpolator);
        animatorSet.setDuration(i2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.13
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                objectAnimatorOfFloat6.start();
            }
        });
        animatorSet.start();
    }

    private void setExpansionMode() {
        setOrientation(1);
        Iterator<NearFloatingButtonLabel> it = this.mFloatingButtonLabelList.iterator();
        while (it.hasNext()) {
            it.next().setOrientation(0);
        }
        closeFloatingButtonMenu(false, 300);
        ArrayList<NearFloatingButtonItem> actionItems = getActionItems();
        removeAllActionItems();
        addAllActionItems(actionItems);
    }

    private void setFloatingButtonPosition(NearFloatingButtonLabel nearFloatingButtonLabel, int i) {
        nearFloatingButtonLabel.setVisibility(0);
        nearFloatingButtonLabel.getChildFloatingButton().setAlpha(0.0f);
    }

    private void toggle(boolean z, boolean z2, int i, boolean z3) {
        if (z && this.mFloatingButtonLabelList.isEmpty()) {
            OnChangeListener onChangeListener = this.mOnChangeListener;
            if (onChangeListener != null) {
                onChangeListener.onMainActionSelected();
            }
            z = false;
        }
        if (isOpen() == z) {
            return;
        }
        if (!isAnimationRunning()) {
            visibilitySetup(z, z2, i, z3);
            updateMainFabDrawable(z2, z3);
            updateMainFloatingButtonBackgroundColor();
        }
        OnChangeListener onChangeListener2 = this.mOnChangeListener;
        if (onChangeListener2 != null) {
            onChangeListener2.onToggleChanged(z);
        }
    }

    private void updateMainFabDrawable(boolean z, boolean z2) {
        if (isOpen()) {
            rotateForward(this.mMainFloatingButton, 45.0f, z2);
            return;
        }
        rotateBackward(z2).start();
        Drawable drawable = this.mMainFabClosedDrawable;
        if (drawable != null) {
            this.mMainFloatingButton.setImageDrawable(drawable);
        }
    }

    private void updateMainFloatingButtonBackgroundColor() {
        ColorStateList mainFloatingButtonBackgroundColor = getMainFloatingButtonBackgroundColor();
        if (mainFloatingButtonBackgroundColor != ColorStateList.valueOf(Integer.MIN_VALUE)) {
            this.mMainFloatingButton.setBackgroundTintList(mainFloatingButtonBackgroundColor);
        } else {
            int color = getContext().getResources().getColor(R$color.nxGreenTintControlNormal);
            this.mMainFloatingButton.setBackgroundTintList(ilc.a(thc.b(getContext(), R$attr.nxColorPrimary, color), color));
        }
    }

    private void visibilitySetup(boolean z, boolean z2, int i, boolean z3) {
        int size = this.mFloatingButtonLabelList.size();
        if (!z) {
            for (int i2 = 0; i2 < size; i2++) {
                NearFloatingButtonLabel nearFloatingButtonLabel = this.mFloatingButtonLabelList.get(i2);
                if (z2) {
                    animationFloatingButtonMenuClose(nearFloatingButtonLabel, i2 * 50, i2, i, z3);
                }
            }
            this.mInstanceState.mNearFloatingButtonMenuIsOpen = false;
            return;
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = (size - 1) - i3;
            NearFloatingButtonLabel nearFloatingButtonLabel2 = this.mFloatingButtonLabelList.get(i4);
            if (this.mCurrentWindowHeight != 0) {
                if (isAllowLabelDisplay(i4)) {
                    nearFloatingButtonLabel2.setVisibility(0);
                    if (z2) {
                        animationFloatingButtonMenuExpand(nearFloatingButtonLabel2, i3 * 50, i4, 0);
                    }
                } else {
                    nearFloatingButtonLabel2.setVisibility(8);
                    if (z2) {
                        animationFloatingButtonMenuExpand(nearFloatingButtonLabel2, i3 * 50, i4, 8);
                    }
                }
            } else if (z2) {
                animationFloatingButtonMenuExpand(nearFloatingButtonLabel2, i3 * 50, i4, 0);
            }
        }
        this.mInstanceState.mNearFloatingButtonMenuIsOpen = true;
    }

    @Nullable
    public NearFloatingButtonLabel addActionItem(NearFloatingButtonItem nearFloatingButtonItem) {
        return addActionItem(nearFloatingButtonItem, this.mFloatingButtonLabelList.size());
    }

    public Collection<NearFloatingButtonLabel> addAllActionItems(Collection<NearFloatingButtonItem> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<NearFloatingButtonItem> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(addActionItem(it.next()));
        }
        return arrayList;
    }

    public void animationFloatingButtonEnlarge() {
        ViewCompat.animate(this.mMainFloatingButton).cancel();
        cancelHideAnimator();
        this.mMainFloatingButton.setVisibility(0);
        this.mMainFloatingButton.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(DEFAULT_ENLARGE_ANIMATION_INTERPOLATOR).setDuration(DEFAULT_ENLARGE_ANIMATION_DURATION).setListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                NearFloatingButton nearFloatingButton = NearFloatingButton.this;
                nearFloatingButton.removeCallbacks(nearFloatingButton.mAutoDismissRunnable);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = true;
                NearFloatingButton nearFloatingButton = NearFloatingButton.this;
                nearFloatingButton.removeCallbacks(nearFloatingButton.mAutoDismissRunnable);
            }
        });
    }

    public ValueAnimator animationFloatingButtonShrink(Animator.AnimatorListener animatorListener) {
        ViewCompat.animate(this.mMainFloatingButton).cancel();
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("alpha", this.mMainFloatingButton.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat("scaleX", this.mMainFloatingButton.getScaleX(), 0.6f), PropertyValuesHolder.ofFloat("scaleY", this.mMainFloatingButton.getScaleY(), 0.6f));
        this.mHideAnimator = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setInterpolator(DEFAULT_ENLARGE_ANIMATION_INTERPOLATOR);
        this.mHideAnimator.setDuration(DEFAULT_ENLARGE_ANIMATION_DURATION);
        this.mHideAnimator.addListener(animatorListener);
        this.mHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue("alpha")).floatValue();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue();
                NearFloatingButton.this.mMainFloatingButton.setAlpha(fFloatValue);
                NearFloatingButton.this.mMainFloatingButton.setScaleX(fFloatValue2);
                NearFloatingButton.this.mMainFloatingButton.setScaleY(fFloatValue3);
            }
        });
        return this.mHideAnimator;
    }

    @Deprecated
    public void animationFloatingButtonSlideIn(int i) {
        animationFloatingButtonEnlarge();
    }

    @Deprecated
    public ValueAnimator animationFloatingButtonSlideOut() {
        return animationFloatingButtonShrink(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.10
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                NearFloatingButton nearFloatingButton = NearFloatingButton.this;
                nearFloatingButton.removeCallbacks(nearFloatingButton.mAutoDismissRunnable);
                NearFloatingButton.this.mMainFloatingButton.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearFloatingButton.this.mMainFloatingButton.setVisibility(0);
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = true;
                NearFloatingButton nearFloatingButton = NearFloatingButton.this;
                nearFloatingButton.postDelayed(nearFloatingButton.mAutoDismissRunnable, 5000L);
            }
        });
    }

    public void closeFloatingButtonMenu() {
        toggle(false, true, 300, false);
    }

    @NonNull
    public ArrayList<NearFloatingButtonItem> getActionItems() {
        ArrayList<NearFloatingButtonItem> arrayList = new ArrayList<>(this.mFloatingButtonLabelList.size());
        Iterator<NearFloatingButtonLabel> it = this.mFloatingButtonLabelList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFloatingButtonItem());
        }
        return arrayList;
    }

    public NearFloatingButtonLabel getChildFloatingButtonWithPosition(int i) {
        return findFloatingButtonItemByPosition(i);
    }

    public ShapeableImageView getMainFloatingButton() {
        return this.mMainFloatingButton;
    }

    public ColorStateList getMainFloatingButtonBackgroundColor() {
        return this.mInstanceState.mMainNearFloatingButtonBackgroundColor;
    }

    public boolean hasFloatingButtonLabel() {
        return this.mFloatingButtonLabelList.size() > 0;
    }

    public boolean isAllowLabelDisplay(int i) {
        if (i < 0 || i >= this.mFloatingButtonLabelList.size()) {
            return false;
        }
        return (((float) getTotalLabelHeight(i)) + ((float) ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin)) + ((float) this.mMainFloatingButton.getHeight()) <= ((float) (this.mCurrentWindowHeight + this.mCurrentWindowHeightOffset));
    }

    public boolean isAnimationRunning() {
        return this.mInstanceState.mNearFloatingButtonAnimationIsRun;
    }

    public boolean isFloatingButtonHasChildItem() {
        return this.mFloatingButtonLabelList.size() != 0;
    }

    public boolean isOpen() {
        return this.mInstanceState.mNearFloatingButtonMenuIsOpen;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            InstanceState instanceState = (InstanceState) bundle.getParcelable(InstanceState.class.getName());
            if (instanceState != null && instanceState.mNearFloatingButtonItems != null && !instanceState.mNearFloatingButtonItems.isEmpty()) {
                setMainFloatingButtonBackgroundColor(instanceState.mMainNearFloatingButtonBackgroundColor);
                addAllActionItems(instanceState.mNearFloatingButtonItems);
                toggle(instanceState.mNearFloatingButtonMenuIsOpen, false, 300, false);
            }
            parcelable = bundle.getParcelable(STATE_KEY_SUPER);
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        this.mInstanceState.mNearFloatingButtonItems = getActionItems();
        bundle.putParcelable(InstanceState.class.getName(), this.mInstanceState);
        bundle.putParcelable(STATE_KEY_SUPER, super.onSaveInstanceState());
        return bundle;
    }

    public void openFloatingButtonMenu() {
        toggle(true, true, 300, false);
    }

    @Nullable
    public NearFloatingButtonItem removeActionItem(int i) {
        NearFloatingButtonItem floatingButtonItem = this.mFloatingButtonLabelList.get(i).getFloatingButtonItem();
        removeActionItem(floatingButtonItem);
        return floatingButtonItem;
    }

    @Nullable
    public NearFloatingButtonItem removeActionItemByPosition(int i) {
        return removeActionItem(findFloatingButtonItemByPosition(i));
    }

    public void removeAllActionItems() {
        Iterator<NearFloatingButtonLabel> it = this.mFloatingButtonLabelList.iterator();
        while (it.hasNext()) {
            removeActionItem(it.next(), it, true);
        }
    }

    public void removeFloatingButtonItemWithWindowHeight(int i) {
        removeFloatingButtonItemWithWindowHeight(i, 0);
    }

    @Nullable
    public NearFloatingButtonLabel replaceActionItem(NearFloatingButtonItem nearFloatingButtonItem, int i) {
        if (this.mFloatingButtonLabelList.isEmpty()) {
            return null;
        }
        return replaceActionItem(this.mFloatingButtonLabelList.get(i).getFloatingButtonItem(), nearFloatingButtonItem);
    }

    public ObjectAnimator rotateBackward(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mMainFloatingButton, "rotation", this.mRotateAngle, 0.0f);
        objectAnimatorOfFloat.setInterpolator(this.mRotateBackwardInterpolator);
        objectAnimatorOfFloat.setDuration(z ? 250L : 300L);
        return objectAnimatorOfFloat;
    }

    public void rotateForward(View view, float f, boolean z) {
        this.mRotateAngle = f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mMainFloatingButton, "rotation", 0.0f, f);
        objectAnimatorOfFloat.setInterpolator(this.mRotateForwardInterpolator);
        objectAnimatorOfFloat.setDuration(z ? 250L : 300L);
        objectAnimatorOfFloat.start();
    }

    public void setAutoSlideInDisable() {
        Runnable runnable = this.mAutoDismissRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getMainFloatingButton().setEnabled(z);
    }

    public void setFloatingButtonClickListener(OnFloatingButtonClickListener onFloatingButtonClickListener) {
        this.mFloatingButtonClickListener = onFloatingButtonClickListener;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setFloatingButtonExpandEnable(boolean z) {
        if (z) {
            this.mMainFloatingButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        NearFloatingButton.this.animatePress();
                        return false;
                    }
                    if (motionEvent.getAction() == 1) {
                        NearFloatingButton.this.animateNormal();
                        return false;
                    }
                    if (motionEvent.getAction() != 3) {
                        return false;
                    }
                    NearFloatingButton.this.animateNormal();
                    return false;
                }
            });
        }
        this.mMainFloatingButton.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.3
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (NearFloatingButton.this.mFloatingButtonClickListener != null) {
                    NearFloatingButton.this.mFloatingButtonClickListener.onClick();
                }
                NearFloatingButton.this.handleOnClickFloatingButton();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    public void setMainFabDrawable(@Nullable Drawable drawable) {
        this.mMainFabClosedDrawable = drawable;
        updateMainFabDrawable(false, false);
    }

    public void setMainFloatingButtonBackgroundColor(ColorStateList colorStateList) {
        this.mInstanceState.mMainNearFloatingButtonBackgroundColor = colorStateList;
        updateMainFloatingButtonBackgroundColor();
    }

    public void setOnActionSelectedListener(@Nullable OnActionSelectedListener onActionSelectedListener) {
        this.mOnActionSelectedListener = onActionSelectedListener;
        if (onActionSelectedListener != null) {
            this.mTempOnActionSelectedListener = onActionSelectedListener;
        }
        for (int i = 0; i < this.mFloatingButtonLabelList.size(); i++) {
            this.mFloatingButtonLabelList.get(i).setOnActionSelectedListener(this.mOnActionSelectedProxyListener);
        }
    }

    public void setOnChangeListener(@Nullable OnChangeListener onChangeListener) {
        this.mOnChangeListener = onChangeListener;
    }

    public void show() {
        animationFloatingButtonEnlarge();
    }

    public static class NearFloatingButtonBehavior extends CoordinatorLayout.Behavior<View> {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean mAutoHideEnabled;

        @Nullable
        private FloatingActionButton.OnVisibilityChangedListener mInternalAutoHideListener;

        @Nullable
        private Rect mTmpRect;

        public NearFloatingButtonBehavior() {
            this.mAutoHideEnabled = true;
        }

        private int getMinimumHeightForVisibleOverlappingContent(AppBarLayout appBarLayout) {
            int minimumHeight = ViewCompat.getMinimumHeight(appBarLayout);
            if (minimumHeight != 0) {
                return minimumHeight * 2;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                return ViewCompat.getMinimumHeight(appBarLayout.getChildAt(childCount - 1)) * 2;
            }
            return 0;
        }

        private static boolean isBottomSheet(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean shouldUpdateVisibility(View view, View view2) {
            return this.mAutoHideEnabled && ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getAnchorId() == view.getId() && view2.getVisibility() == 0;
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!shouldUpdateVisibility(appBarLayout, view)) {
                return false;
            }
            if (this.mTmpRect == null) {
                this.mTmpRect = new Rect();
            }
            Rect rect = this.mTmpRect;
            ViewGroupUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= getMinimumHeightForVisibleOverlappingContent(appBarLayout)) {
                view.setVisibility(8);
                return true;
            }
            view.setVisibility(0);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(View view, View view2) {
            if (!shouldUpdateVisibility(view, view2)) {
                return false;
            }
            if (view.getTop() < (view2.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) view2.getLayoutParams())).topMargin) {
                hide(view2);
                return true;
            }
            show(view2);
            return true;
        }

        public void hide(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).hide(this.mInternalAutoHideListener);
            } else if (view instanceof NearFloatingButton) {
                ((NearFloatingButton) view).hide(this.mInternalAutoHideListener);
            } else {
                view.setVisibility(4);
            }
        }

        public boolean isAutoHideEnabled() {
            return this.mAutoHideEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, view);
                return false;
            }
            if (!isBottomSheet(view2)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view2, view);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (isBottomSheet(view2) && updateFabVisibilityForBottomSheet(view2, view)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, view)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(view, i);
            return true;
        }

        public void setAutoHideEnabled(boolean z) {
            this.mAutoHideEnabled = z;
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(@Nullable FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
            this.mInternalAutoHideListener = onVisibilityChangedListener;
        }

        public void show(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).show(this.mInternalAutoHideListener);
            } else if (view instanceof NearFloatingButton) {
                view.setVisibility(0);
            } else {
                view.setVisibility(0);
            }
        }

        public NearFloatingButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.mAutoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public NearFloatingButtonLabel addActionItem(NearFloatingButtonItem nearFloatingButtonItem, int i) {
        return addActionItem(nearFloatingButtonItem, i, true);
    }

    public void closeFloatingButtonMenu(boolean z) {
        toggle(false, true, 300, false);
    }

    public void openFloatingButtonMenu(boolean z) {
        toggle(true, z, 300, false);
    }

    public void removeFloatingButtonItemWithWindowHeight(int i, int i2) {
        this.mCurrentWindowHeight = i;
        this.mCurrentWindowHeightOffset = i2;
        int size = this.mFloatingButtonLabelList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (isAllowLabelDisplay(i3)) {
                this.mFloatingButtonLabelList.get(i3).setVisibility(0);
            } else {
                this.mFloatingButtonLabelList.get(i3).setVisibility(8);
            }
        }
    }

    public static class ScrollViewBehavior extends NearFloatingButtonBehavior {
        ValueAnimator mObjectAnimator;
        private boolean mOnScrollListenerIsAdd;

        public ScrollViewBehavior() {
            this.mObjectAnimator = new ObjectAnimator();
            this.mOnScrollListenerIsAdd = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void behaviorAnimate(NearFloatingButton nearFloatingButton, int i) {
            if (i <= 10 || nearFloatingButton.getVisibility() != 0) {
                if (i < -10) {
                    nearFloatingButton.animationFloatingButtonEnlarge();
                    return;
                }
                return;
            }
            if (!nearFloatingButton.isOpen() || this.mObjectAnimator.isRunning()) {
                if (this.mObjectAnimator.isRunning()) {
                    return;
                }
                ValueAnimator valueAnimatorAnimationFloatingButtonSlideOut = nearFloatingButton.animationFloatingButtonSlideOut();
                this.mObjectAnimator = valueAnimatorAnimationFloatingButtonSlideOut;
                valueAnimatorAnimationFloatingButtonSlideOut.start();
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorAnimationFloatingButtonSlideOut2 = nearFloatingButton.animationFloatingButtonSlideOut();
            this.mObjectAnimator = valueAnimatorAnimationFloatingButtonSlideOut2;
            animatorSet.playTogether(valueAnimatorAnimationFloatingButtonSlideOut2, nearFloatingButton.rotateBackward(true));
            animatorSet.setDuration(150L);
            nearFloatingButton.closeFloatingButtonMenu(true, 250, true);
            animatorSet.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, @NonNull int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
            if (view instanceof NearFloatingButton) {
                behaviorAnimate((NearFloatingButton) view, i2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            if (view3 instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view3;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (recyclerView.getChildCount() != 0 && itemCount != 0 && !this.mOnScrollListenerIsAdd) {
                    recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.ScrollViewBehavior.1
                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrollStateChanged(@NonNull RecyclerView recyclerView2, int i3) {
                            super.onScrollStateChanged(recyclerView2, i3);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrolled(@NonNull RecyclerView recyclerView2, int i3, int i4) {
                            super.onScrolled(recyclerView2, i3, i4);
                            View view4 = view;
                            if (view4 instanceof NearFloatingButton) {
                                ScrollViewBehavior.this.behaviorAnimate((NearFloatingButton) view4, i4);
                            }
                        }
                    });
                    this.mOnScrollListenerIsAdd = true;
                }
                return false;
            }
            if (view3 instanceof AbsListView) {
                AbsListView absListView = (AbsListView) view3;
                int count = absListView.getCount();
                int childCount = absListView.getChildCount();
                View childAt = absListView.getChildAt(0);
                int top = view3.getTop() - view3.getPaddingTop();
                int bottom = view3.getBottom() - view3.getPaddingBottom();
                AbsListView absListView2 = (AbsListView) view3;
                View childAt2 = absListView2.getChildAt(childCount - 1);
                if (childCount > 0 && count > 0) {
                    if (absListView2.getFirstVisiblePosition() == 0 && childAt.getTop() >= (-top)) {
                        return false;
                    }
                    if (childAt2 != null && absListView2.getLastVisiblePosition() == count - 1 && childAt2.getBottom() <= bottom) {
                        return false;
                    }
                }
            }
            return true;
        }

        public ScrollViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mObjectAnimator = new ObjectAnimator();
            this.mOnScrollListenerIsAdd = false;
        }
    }

    public NearFloatingButtonLabel addActionItem(NearFloatingButtonItem nearFloatingButtonItem, int i, boolean z) {
        return addActionItem(nearFloatingButtonItem, i, z, 0);
    }

    public void closeFloatingButtonMenu(boolean z, int i) {
        toggle(false, z, i, false);
    }

    public void openFloatingButtonMenu(boolean z, int i) {
        toggle(true, z, i, false);
    }

    public boolean removeActionItem(@Nullable NearFloatingButtonItem nearFloatingButtonItem) {
        return (nearFloatingButtonItem == null || removeActionItemByPosition(nearFloatingButtonItem.getFloatingButtonItemLocation()) == null) ? false : true;
    }

    @Nullable
    public NearFloatingButtonLabel replaceActionItem(@Nullable NearFloatingButtonItem nearFloatingButtonItem, NearFloatingButtonItem nearFloatingButtonItem2) {
        NearFloatingButtonLabel nearFloatingButtonLabelFindFloatingButtonItemByPosition;
        int iIndexOf;
        if (nearFloatingButtonItem == null || (nearFloatingButtonLabelFindFloatingButtonItemByPosition = findFloatingButtonItemByPosition(nearFloatingButtonItem.getFloatingButtonItemLocation())) == null || (iIndexOf = this.mFloatingButtonLabelList.indexOf(nearFloatingButtonLabelFindFloatingButtonItemByPosition)) < 0) {
            return null;
        }
        int visibility = nearFloatingButtonLabelFindFloatingButtonItemByPosition.getVisibility();
        removeActionItem(findFloatingButtonItemByPosition(nearFloatingButtonItem2.getFloatingButtonItemLocation()), null, false);
        removeActionItem(findFloatingButtonItemByPosition(nearFloatingButtonItem.getFloatingButtonItemLocation()), null, false);
        return addActionItem(nearFloatingButtonItem2, iIndexOf, false, visibility);
    }

    @Nullable
    private NearFloatingButtonItem removeActionItem(@Nullable NearFloatingButtonLabel nearFloatingButtonLabel, @Nullable Iterator<NearFloatingButtonLabel> it, boolean z) {
        if (nearFloatingButtonLabel == null) {
            return null;
        }
        NearFloatingButtonItem floatingButtonItem = nearFloatingButtonLabel.getFloatingButtonItem();
        if (it != null) {
            it.remove();
        } else {
            this.mFloatingButtonLabelList.remove(nearFloatingButtonLabel);
        }
        removeView(nearFloatingButtonLabel);
        return floatingButtonItem;
    }

    @Nullable
    public NearFloatingButtonLabel addActionItem(NearFloatingButtonItem nearFloatingButtonItem, int i, boolean z, int i2) {
        NearFloatingButtonLabel nearFloatingButtonLabelFindFloatingButtonItemByPosition = findFloatingButtonItemByPosition(nearFloatingButtonItem.getFloatingButtonItemLocation());
        if (nearFloatingButtonLabelFindFloatingButtonItemByPosition != null) {
            return replaceActionItem(nearFloatingButtonLabelFindFloatingButtonItemByPosition.getFloatingButtonItem(), nearFloatingButtonItem);
        }
        NearFloatingButtonLabel nearFloatingButtonLabelCreateFabWithLabelView = nearFloatingButtonItem.createFabWithLabelView(getContext());
        nearFloatingButtonLabelCreateFabWithLabelView.setOrientation(getOrientation() == 1 ? 0 : 1);
        nearFloatingButtonLabelCreateFabWithLabelView.setOnActionSelectedListener(this.mOnActionSelectedProxyListener);
        nearFloatingButtonLabelCreateFabWithLabelView.setVisibility(i2);
        int layoutPosition = getLayoutPosition(i);
        if (i == 0) {
            nearFloatingButtonLabelCreateFabWithLabelView.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.nx_floating_button_item_first_bottom_margin));
            addView(nearFloatingButtonLabelCreateFabWithLabelView, layoutPosition);
        } else {
            nearFloatingButtonLabelCreateFabWithLabelView.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.nx_floating_button_item_normal_bottom_margin));
            addView(nearFloatingButtonLabelCreateFabWithLabelView, layoutPosition);
        }
        this.mFloatingButtonLabelList.add(i, nearFloatingButtonLabelCreateFabWithLabelView);
        animationFloatingButtonMenuClose(nearFloatingButtonLabelCreateFabWithLabelView, 0, i, 300, false);
        return nearFloatingButtonLabelCreateFabWithLabelView;
    }

    public void closeFloatingButtonMenu(boolean z, int i, boolean z2) {
        toggle(false, z, i, z2);
    }

    public void hide() {
        animationFloatingButtonShrink(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                NearFloatingButton.this.mMainFloatingButton.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearFloatingButton.this.mMainFloatingButton.setVisibility(8);
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearFloatingButton.this.mInstanceState.mNearFloatingButtonAnimationIsRun = true;
            }
        }).start();
    }

    public static class InstanceState implements Parcelable {
        public static final Parcelable.Creator<InstanceState> CREATOR = new Parcelable.Creator<InstanceState>() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.InstanceState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InstanceState createFromParcel(Parcel parcel) {
                return new InstanceState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InstanceState[] newArray(int i) {
                return new InstanceState[i];
            }
        };
        private ColorStateList mMainNearFloatingButtonBackgroundColor;
        private boolean mNearFloatingButtonAnimationIsRun;
        private ArrayList<NearFloatingButtonItem> mNearFloatingButtonItems;
        private boolean mNearFloatingButtonMenuIsOpen;
        private boolean mUseReverseAnimationOnClose;

        public InstanceState() {
            this.mNearFloatingButtonMenuIsOpen = false;
            this.mNearFloatingButtonAnimationIsRun = false;
            this.mMainNearFloatingButtonBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mUseReverseAnimationOnClose = false;
            this.mNearFloatingButtonItems = new ArrayList<>();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.mNearFloatingButtonMenuIsOpen ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mNearFloatingButtonAnimationIsRun ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mUseReverseAnimationOnClose ? (byte) 1 : (byte) 0);
            parcel.writeTypedList(this.mNearFloatingButtonItems);
        }

        public InstanceState(Parcel parcel) {
            this.mNearFloatingButtonMenuIsOpen = false;
            this.mNearFloatingButtonAnimationIsRun = false;
            this.mMainNearFloatingButtonBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mUseReverseAnimationOnClose = false;
            this.mNearFloatingButtonItems = new ArrayList<>();
            this.mNearFloatingButtonMenuIsOpen = parcel.readByte() != 0;
            this.mNearFloatingButtonAnimationIsRun = parcel.readByte() != 0;
            this.mUseReverseAnimationOnClose = parcel.readByte() != 0;
            this.mNearFloatingButtonItems = parcel.createTypedArrayList(NearFloatingButtonItem.CREATOR);
        }
    }

    @Nullable
    private NearFloatingButtonItem removeActionItem(@Nullable NearFloatingButtonLabel nearFloatingButtonLabel) {
        return removeActionItem(nearFloatingButtonLabel, null, true);
    }

    public NearFloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInstanceState = new InstanceState();
        this.mFloatingButtonLabelList = new ArrayList();
        this.mMainFabClosedDrawable = null;
        this.mExpandMenuAnimationInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuPathInterpolator = new hjc();
        this.mLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateForwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateBackwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mOnActionSelectedProxyListener = new OnActionSelectedListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.1
            @Override // com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.OnActionSelectedListener
            public boolean onActionSelected(NearFloatingButtonItem nearFloatingButtonItem) {
                if (NearFloatingButton.this.mOnActionSelectedListener == null) {
                    return false;
                }
                boolean zOnActionSelected = NearFloatingButton.this.mOnActionSelectedListener.onActionSelected(nearFloatingButtonItem);
                if (!zOnActionSelected) {
                    NearFloatingButton.this.closeFloatingButtonMenu(false, 300);
                }
                return zOnActionSelected;
            }
        };
        init(context, attributeSet);
    }

    public NearFloatingButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInstanceState = new InstanceState();
        this.mFloatingButtonLabelList = new ArrayList();
        this.mMainFabClosedDrawable = null;
        this.mExpandMenuAnimationInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuPathInterpolator = new hjc();
        this.mLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mCloseMenuLabelPathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateForwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mRotateBackwardInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.mOnActionSelectedProxyListener = new OnActionSelectedListener() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.1
            @Override // com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButton.OnActionSelectedListener
            public boolean onActionSelected(NearFloatingButtonItem nearFloatingButtonItem) {
                if (NearFloatingButton.this.mOnActionSelectedListener == null) {
                    return false;
                }
                boolean zOnActionSelected = NearFloatingButton.this.mOnActionSelectedListener.onActionSelected(nearFloatingButtonItem);
                if (!zOnActionSelected) {
                    NearFloatingButton.this.closeFloatingButtonMenu(false, 300);
                }
                return zOnActionSelected;
            }
        };
        init(context, attributeSet);
    }
}
