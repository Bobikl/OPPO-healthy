package com.coui.appcompat.panel;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.coui.appcompat.animation.dynamicanimation.b;
import com.coui.appcompat.animation.dynamicanimation.c;
import com.coui.appcompat.edittext.COUIInputView;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.di2;
import com.oplus.aiunit.vision.doi;
import com.oplus.aiunit.vision.foi;
import com.oplus.aiunit.vision.gi2;
import com.oplus.aiunit.vision.gn2;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.ioi;
import com.oplus.aiunit.vision.kjk;
import com.oplus.aiunit.vision.loi;
import com.oplus.aiunit.vision.pj2;
import com.oplus.aiunit.vision.pn2;
import com.oplus.aiunit.vision.t1h;
import com.oplus.aiunit.vision.zh2;
import com.oplus.dynamicframerate.AnimationVelocityCalculator;
import com.oplus.dynamicframerate.DynamicFrameRateManager;
import com.oplus.wrapper.view.ViewTreeObserver;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$id;
import com.support.dialog.R$dimen;
import com.support.panel.R$attr;
import com.support.panel.R$bool;
import com.support.panel.R$color;
import com.support.panel.R$drawable;
import com.support.panel.R$layout;
import com.support.panel.R$style;
import com.support.panel.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBottomSheetDialog extends BottomSheetDialog implements DynamicAnimation.OnAnimationUpdateListener, DynamicAnimation.OnAnimationEndListener {
    private static final float ALPHA_OPAQUE = 1.0f;
    private static final float ALPHA_TRANSPARENT = 0.0f;
    private static final int ANIMATION_TYPE_DIALOG_ALPHA = 8;
    public static final int ANIMATION_TYPE_ID = 10101;
    private static final int ANIMATION_TYPE_OUTSIDE_ALPHA = 2;
    private static final int ANIMATION_TYPE_SCALE = 4;
    private static final int ANIMATION_TYPE_TRANSLATION = 1;
    private static final boolean DEBUG;
    private static final float DEFAULT_ALPHA_HIDE_SPRING_RESPONSE = 0.25f;
    private static final float DEFAULT_ALPHA_HIDING_ANIMATOR_DURATION = 183.0f;
    private static final float DEFAULT_ALPHA_SHOW_SPRING_RESPONSE = 0.25f;
    private static final float DEFAULT_CENTER_HIDE_SPRING_RESPONSE = 0.25f;
    private static final float DEFAULT_CENTER_SHOW_SPRING_RESPONSE = 0.25f;
    private static final float DEFAULT_MINIMUM_VISIBLE_CHANGE_DISMISS = 10.0f;
    private static final float DEFAULT_MINIMUM_VISIBLE_CHANGE_SHOW = 1.0f;
    private static final int DEFAULT_MOVE_PX = 1;
    private static final float DEFAULT_SPRING_DAMPING_RATIO = 0.7f;
    private static final int DEFAULT_SPRING_FACTOR = 10000;
    private static final float DEFAULT_SPRING_STIFFNESS = 200.0f;
    private static final float DEFAULT_TRANSLATE_HIDING_ANIMATOR_DURATION = 333.0f;
    static final float DEFAULT_TRANSLATION_HIDE_SPRING_RESPONSE_LARGE = 0.37f;
    static final float DEFAULT_TRANSLATION_HIDE_SPRING_RESPONSE_SMALL = 0.18f;
    private static final float DEFAULT_TRANSLATION_SHOW_SPRING_RESPONSE_LARGE = 0.45f;
    private static final float DEFAULT_TRANSLATION_SHOW_SPRING_RESPONSE_SMALL = 0.25f;
    private static final float DEFAULT_TRANSLATION_SPRING_BOUNCE = 0.0f;
    private static final float DIALOG_SHOW_SCALE_DELTA = 0.2f;
    private static final float DIALOG_SHOW_SCALE_START = 0.8f;
    private static final Interpolator DISMISS_ALPHA_ANIM_INTERPOLATOR;
    private static final float ELEVATION_VALUE = 24.0f;
    private static final int FINAL_POSITION = 100;
    private static final float FIRST_TIER_ALPHA = 0.75f;
    private static final float FLOAT_ONE = 1.0f;
    private static final float FLOAT_POINT_FIVE = 0.5f;
    private static final int HUNDRED = 100;
    private static final int INT_TWO = 2;
    private static final float MAX_ALPHA = 255.0f;
    private static final long NAV_COLOR_ANIM_DURATION = 200;
    private static final float NO_ELEVATION_VALUE = 0.0f;
    private static final Interpolator OUTSIDE_ALPHA_ANIM_INTERPOLATOR;
    private static final float PHYSICS_UNSET = Float.MIN_VALUE;
    private static final float PULL_UP_FRICTION = 0.8f;
    private static final int PULL_UP_REBOUND_BOUNCINESS = 6;
    private static final int PULL_UP_REBOUND_SPEED = 42;
    private static final int SDK_SUB_VERSION_FOR_COMPUTE = 10;
    private static final int SDK_SUB_VERSION_FOR_FRAME_RATE = 10;
    private static final int SDK_VERSION_FOR_COMPUTE = 34;
    private static final float SECOND_TIER_ALPHA = 0.5f;
    private static final float SHOW_HEIGHT_ANIM_DURATION_IN_TINY_SCREEN = 167.0f;
    private static final Interpolator SHOW_HEIGHT_ANIM_INTERPOLATOR;
    private static final float SPRING_ANIM_CONTENT_CHANGE_BOUNCE = 0.0f;
    private static final float SPRING_ANIM_CONTENT_CHANGE_MINIMUM_VISIBLE_CHANGE = 95.0f;
    private static final float SPRING_ANIM_CONTENT_CHANGE_RESPONSE = 0.4f;
    private static final String STATE_FOCUS_CHANGES = "state_focus_changes";
    private static final String STATE_LAST_STATIC_CHANGES = "last_static_state";
    private static final String TAG = "COUIBottomSheetDialog";
    private static final float THIRD_TIER_ALPHA = 0.25f;
    private static final double THREE_POINT_EIGHT = 3.8d;
    private static final double TWENTY = 20.0d;
    private static final int UNSET_SIZE = -1;
    private static final double ZERO = 0.0d;
    protected boolean isLargeScreenLimitMaxSize;
    private int mADFRFeatureType;
    private WeakReference<Activity> mActivityWeakReference;
    private ViewGroup mAdjustLayout;
    private boolean mAdjustResizeEnable;
    private COUIPanelAdjustResizeHelper mAdjustResizeHelper;
    private b mAlphaSpringAnimation;
    private COUIDynamicAnimation.q mAlphaSpringEndListener;
    private COUIDynamicAnimation.r mAlphaSpringUpdateListener;
    private View mAnchorView;
    private int mAnimationFlag;
    private OnAnimationListener mAnimationListener;
    private float mAppearDampingRatio;
    private SpringAnimation mAppearSpringAnim;
    private SpringForce mAppearSpringForce;
    private float mAppearStiffness;
    private WindowInsets mApplyWindowInsets;
    private BottomSheetDialogAnimatorListener mBottomSheetDialogAnimatorListener;
    private boolean mCanPerformHapticFeedback;
    private boolean mCanPullUp;
    private boolean mCancelable;
    private boolean mCanceledOnTouchOutside;
    private int mColorMask;
    private ComponentCallbacks mComponentCallbacks;
    private Configuration mConfiguration;
    private IgnoreWindowInsetsFrameLayout mContainerFrameLayout;
    private View mContentView;
    private View mCoordinatorLayout;
    protected int mCoordinatorLayoutMinInsetsTop;
    private int mCoordinatorLayoutPaddingExtra;
    private boolean mCouiPanelEdgeToEdgeEnable;
    private float mCurrentOutSideAlphaStateHidden;
    private float mCurrentOutSideAlphaStateShow;
    private float mCurrentOutsideAlpha;
    private float mCurrentParentViewTranslationY;
    private int mCurrentSpringTotalOffset;
    private int mDefaultPaddingBottom;
    private COUIPanelPercentFrameLayout mDesignBottomSheetFrameLayout;
    private DialogOffsetListener mDialogOffsetListener;
    private doi mDisableFastCloseFeedbackSpring;
    private boolean mDisableSubExpand;
    protected COUIPanelContentLayout mDraggableConstraintLayout;
    private float mEndValueOfTranslateAnimation;
    private View mFeedBackView;

    @ColorInt
    @Deprecated
    private int mFinalNavColorAfterDismiss;
    private boolean mFirstShowCollapsed;
    private Boolean mFocusChange;
    private boolean mFrameRate;
    private boolean mGlobalDrag;
    private GradientDrawable mGradientDrawable;
    private boolean mHandleViewHasPressAnim;
    private int mHideDragViewHeight;
    private InputMethodManager mInputMethodManager;
    private boolean mIsAnimationInFirst;
    private boolean mIsAppearSpringAnimStared;
    private boolean mIsDraggable;
    private boolean mIsEntering;

    @Deprecated
    private boolean mIsExecuteNavColorAnimAfterDismiss;
    private boolean mIsExecutingDismissAnim;
    private boolean mIsFullScreenInTinyScreen;
    private boolean mIsGestureNavigation;
    private boolean mIsHandlePanel;
    private boolean mIsInTinyScreen;
    private boolean mIsInWindowFloatingMode;
    private boolean mIsInterruptingAnim;
    private boolean mIsNeedOutsideViewAnim;
    private boolean mIsNeedShowKeyboard;
    private boolean mIsRevertAnimationFromSettlingAnimation;
    private boolean mIsShowInDialogFragment;
    private boolean mIsShowInMaxHeight;
    private boolean mIsVSdk;
    private int mLastStaticState;
    private int mNavColor;
    private View mNavigationCustomView;
    private ViewTreeObserver.OnComputeInternalInsetsListener mOSDKComputeListener;
    private ViewTreeObserver mOSDKViewTreeObserver;
    private View.OnAttachStateChangeListener mOnAttatchStateChangeListener;
    private OnBackInvokedCallback mOnBackInvokedCallback;
    private OnBackInvokedLocalListener mOnBackInvokedLocalListener;
    private android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    private int mOriginWidth;
    private View.OnTouchListener mOutSideViewTouchListener;
    private View mOutsideView;
    private float mOutsideViewBackgroundAlpha;
    private Drawable mPanelBackground;

    @ColorInt
    private int mPanelBackgroundTintColor;
    private COUIPanelBarView mPanelBarView;
    private Drawable mPanelDragViewDrawable;

    @ColorInt
    private int mPanelDragViewDrawableTintColor;
    private int mPanelHeight;
    private int mPanelPaddingBottom;
    private COUIPanelPullUpListener mPanelPullUpListener;
    private float mPanelRatio;
    private doi mPanelSpringBackAnim;
    private AnimatorSet mPanelViewTranslationAnimationSet;
    private int mPanelWidth;
    private int mParentViewPaddingBottom;
    private int mPeekHeight;
    private float mPhysicsDampingRatio;
    private float mPhysicsFrequency;
    private int mPreferWidth;
    private WindowInsets mProgressWindowInsets;
    private int mPullUpMaxOffset;
    private COUIBottomSheetBehavior.PullUpToDismissPanelListener mPullUpToDismissPanelListener;
    private View mPulledUpView;
    private boolean mRegisterConfigurationChangeCallBack;
    private boolean mShouldRegisterWindowInsetsListener;
    private boolean mSkipCollapsed;
    private int mSnapStartBottom;
    private c mSpringForceAlpha;
    private c mSpringForceTranslationAndScale;
    private float mStartValueOfTranslateAnimation;
    private int mStatusBarHeight;
    private boolean mSupportExitBlockingAnimation;
    private final Rect mTemtRect;
    private float mTranslateHidingDuration;
    private COUIDynamicAnimation.q mTranslationAndScaleEndListener;
    private b mTranslationAndScaleSpringAnimation;
    private COUIDynamicAnimation.r mTranslationAndScaleUpdateListener;
    private boolean mWindowInsetsAnimEnable;
    private int mWindowInsetsLeft;
    private View.OnApplyWindowInsetsListener mWindowInsetsListener;
    private int mWindowInsetsTop;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationType {
    }

    public interface BottomSheetDialogAnimatorListener {
        void onBottomSheetDialogCollapsed();

        void onBottomSheetDialogExpanded();
    }

    public interface DialogOffsetListener {
        void onDialogOffsetChanged(float f);
    }

    public interface OnAnimationListener {
        default void onDismissAnimationEnd() {
        }

        default void onDismissAnimationStart() {
        }

        default void onShowAnimationEnd() {
        }

        default void onShowAnimationStart() {
        }
    }

    public interface OnBackInvokedLocalListener {
        void onBackInvokedLocal();
    }

    static {
        hj2 hj2Var = new hj2();
        SHOW_HEIGHT_ANIM_INTERPOLATOR = hj2Var;
        OUTSIDE_ALPHA_ANIM_INTERPOLATOR = new gi2();
        DISMISS_ALPHA_ANIM_INTERPOLATOR = hj2Var;
        DEBUG = Log.isLoggable(TAG, 3);
    }

    public COUIBottomSheetDialog(@NonNull Context context) {
        this(context, 0);
    }

    private void addAnimationFlag(int i) {
        this.mAnimationFlag = i | this.mAnimationFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOSDKViewTreeObserver() {
        if (this.mOSDKViewTreeObserver == null) {
            ViewTreeObserver viewTreeObserver = new ViewTreeObserver(this.mOutsideView.getViewTreeObserver());
            this.mOSDKViewTreeObserver = viewTreeObserver;
            viewTreeObserver.addOnComputeInternalInsetsListener(this.mOSDKComputeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustResize(WindowInsets windowInsets, boolean z) {
        if (z) {
            boolean z2 = getContext().getResources().getBoolean(R$bool.is_coui_bottom_sheet_ime_adjust_in_constraint_layout);
            ViewGroup viewGroup = (ViewGroup) findViewById(R$id.design_bottom_sheet);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(com.support.panel.R$id.coui_panel_content_layout);
            if (z2) {
                viewGroup = viewGroup2;
            }
            ViewGroup viewGroup3 = this.mAdjustLayout;
            if (viewGroup3 != (z2 ? this.mDraggableConstraintLayout : this.mDesignBottomSheetFrameLayout)) {
                COUIViewMarginUtil.setMargin(viewGroup3, 3, 0);
            }
            ViewGroup viewGroup4 = z2 ? this.mDraggableConstraintLayout : this.mDesignBottomSheetFrameLayout;
            this.mAdjustLayout = viewGroup4;
            if (viewGroup4 != null) {
                viewGroup = viewGroup4;
            }
            adjustResizeInternal(windowInsets, viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustResizeInternal(final WindowInsets windowInsets, final ViewGroup viewGroup) {
        if (viewGroup == null || !viewGroup.isLayoutRequested()) {
            getAdjustResizeHelper().adjustResize(getContext(), viewGroup, windowInsets, this.mCoordinatorLayout, getFocusChange());
        } else {
            viewGroup.post(new Runnable() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.9
                @Override // java.lang.Runnable
                public void run() {
                    COUIBottomSheetDialog.this.adjustResizeInternal(windowInsets, viewGroup);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animationEnd() {
        if (this.mDesignBottomSheetFrameLayout != null) {
            if (!isFollowHand() && !isFadeInCenter()) {
                this.mDesignBottomSheetFrameLayout.setTranslationY(this.mCurrentParentViewTranslationY);
            }
            if (getBehavior() != null && getBehavior().getState() == 3 && this.mCanPerformHapticFeedback) {
                this.mDesignBottomSheetFrameLayout.performHapticFeedback(14);
            }
        }
        OnAnimationListener onAnimationListener = this.mAnimationListener;
        if (onAnimationListener != null) {
            onAnimationListener.onShowAnimationEnd();
        }
        if (isFollowHand()) {
            haveEnoughSpace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animationStart() {
        if (getBehavior() != null && getBehavior().getState() == 5) {
            ((COUIBottomSheetBehavior) getBehavior()).setPanelState(this.mLastStaticState);
        }
        OnAnimationListener onAnimationListener = this.mAnimationListener;
        if (onAnimationListener != null) {
            onAnimationListener.onShowAnimationStart();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00ee, please report this as an issue */
    private int[] calculateFinalLocationOnScreen(@NonNull View view) {
        int i;
        int iNormalizePoints;
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        viewGroup.getChildAt(0);
        Rect locationRectInScreen = getLocationRectInScreen(view);
        Rect rect = new Rect(0, 0, getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels);
        Rect locationRectInScreen2 = getLocationRectInScreen(this.mDesignBottomSheetFrameLayout);
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(viewGroup);
        if (rootWindowInsets != null) {
            this.mWindowInsetsTop = rootWindowInsets.getSystemWindowInsetTop();
            this.mWindowInsetsLeft = rootWindowInsets.getSystemWindowInsetLeft();
        }
        int measuredWidth = this.mDesignBottomSheetFrameLayout.getMeasuredWidth();
        int measuredHeight = this.mDesignBottomSheetFrameLayout.getMeasuredHeight();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_dialog_follow_hand_margin_bottom);
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_dialog_follow_hand_margin_left);
        int iNormalizePoints2 = normalizePoints((((locationRectInScreen.left + locationRectInScreen.right) / 2) - (measuredWidth / 2)) - this.mWindowInsetsLeft, rect.right - measuredWidth);
        if (iNormalizePoints2 <= dimensionPixelOffset2) {
            iNormalizePoints2 = dimensionPixelOffset2;
        } else {
            int i2 = iNormalizePoints2 + measuredWidth + dimensionPixelOffset2;
            int i3 = rect.right;
            if (i2 >= i3) {
                iNormalizePoints2 = (i3 - dimensionPixelOffset2) - measuredWidth;
            }
        }
        int i4 = rect.bottom;
        int i5 = i4 - measuredHeight;
        int i6 = rect.right - locationRectInScreen.right;
        int i7 = locationRectInScreen.left - rect.left;
        int i8 = locationRectInScreen.top;
        int i9 = i8 - rect.top;
        int i10 = this.mCoordinatorLayoutMinInsetsTop;
        int i11 = (i9 - i10) - dimensionPixelOffset;
        int i12 = iNormalizePoints2;
        int i13 = locationRectInScreen.bottom;
        int i14 = i4 - i13;
        if (measuredHeight >= i11) {
            if (measuredHeight < i14) {
                iNormalizePoints = normalizePoints((i13 - i10) + dimensionPixelOffset, i5);
            } else {
                int iNormalizePoints3 = normalizePoints((((i13 + i8) / 2) - (measuredHeight / 2)) - this.mWindowInsetsTop, i5);
                if (measuredWidth < i7) {
                    i = (locationRectInScreen.left - measuredWidth) - dimensionPixelOffset2;
                } else {
                    i = measuredWidth < i6 ? locationRectInScreen.right + dimensionPixelOffset2 : i12;
                }
                iNormalizePoints = iNormalizePoints3;
            }
            if (DEBUG) {
                Log.d(TAG, "calculateFinalLocationInScreen: \n anchorViewLocationRect = " + locationRectInScreen + ", \n anchorContentViewLocationRect = " + rect + ", \n dialogViewLocalRect = " + locationRectInScreen2 + "\n -> final : x = " + i + ", y = " + iNormalizePoints + "\n -> insetTop: " + this.mWindowInsetsTop + " maxY: " + i5);
            }
            return new int[]{i, iNormalizePoints};
        }
        iNormalizePoints = normalizePoints(((((i8 - measuredHeight) - i10) + this.mStatusBarHeight) - dimensionPixelOffset) - this.mWindowInsetsTop, i5);
        i = i12;
        if (DEBUG) {
            Log.d(TAG, "calculateFinalLocationInScreen: \n anchorViewLocationRect = " + locationRectInScreen + ", \n anchorContentViewLocationRect = " + rect + ", \n dialogViewLocalRect = " + locationRectInScreen2 + "\n -> final : x = " + i + ", y = " + iNormalizePoints + "\n -> insetTop: " + this.mWindowInsetsTop + " maxY: " + i5);
        }
        return new int[]{i, iNormalizePoints};
    }

    private void cancelAnim(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.end();
    }

    private void checkInitState() {
        if (this.mContainerFrameLayout == null) {
            throw new IllegalArgumentException("container can not be null");
        }
        if (this.mCoordinatorLayout == null) {
            throw new IllegalArgumentException("coordinator can not be null");
        }
        if (this.mOutsideView == null) {
            throw new IllegalArgumentException("panel_outside can not be null");
        }
        if (this.mDesignBottomSheetFrameLayout == null) {
            throw new IllegalArgumentException("design_bottom_sheet can not be null");
        }
    }

    public static b createContentChangeSpringAnimation() {
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        c cVar = new c();
        cVar.i(0.0f);
        cVar.l(0.4f);
        b bVarE = new b(floatValueHolder).E(cVar);
        bVarE.p(SPRING_ANIM_CONTENT_CHANGE_MINIMUM_VISIBLE_CHANGE);
        return bVarE;
    }

    private ValueAnimator createNavigationColorAnimation(@ColorInt int i) {
        if (COUINavigationBarUtil.isNavigationBarShow(getContext()) && getWindow() != null) {
            final Window window = getWindow();
            int navigationBarColor = window.getNavigationBarColor();
            if (Color.alpha(i) == 0) {
                i = Color.argb(1, Color.red(i), Color.green(i), Color.blue(i));
            }
            if (navigationBarColor != i) {
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(navigationBarColor), Integer.valueOf(i));
                valueAnimatorOfObject.setDuration(200L);
                valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.24
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        window.setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                return valueAnimatorOfObject;
            }
        }
        return null;
    }

    private ValueAnimator createOutsideAlphaAnimation(final boolean z, float f, PathInterpolator pathInterpolator) {
        final float f2 = this.mCurrentOutsideAlpha;
        final float f3 = z ? 1.0f : 0.0f;
        if (f2 == f3) {
            pj2.g(TAG, "StartAlphaValue == endAlphaValue, No need to perform transparency animation anymore");
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        valueAnimatorOfFloat.setDuration((long) f);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.22
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f4 = f2;
                float f5 = f3;
                COUIBottomSheetDialog.this.outsideAlphaChange(f4 != f5 ? (fFloatValue - f4) / (f5 - f4) : 0.0f, z);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.23
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout != null && COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getAlpha() == 0.0f) {
                    COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.setAlpha(1.0f);
                }
                COUIBottomSheetDialog.this.mIsNeedShowKeyboard = false;
            }
        });
        return valueAnimatorOfFloat;
    }

    @NonNull
    private void createPanelConstraintLayout() {
        COUIPanelContentLayout cOUIPanelContentLayout = (COUIPanelContentLayout) getLayoutInflater().inflate(this.mIsInTinyScreen ? R$layout.coui_panel_view_layout_tiny : R$layout.coui_panel_view_layout, (ViewGroup) null);
        Drawable drawable = this.mPanelDragViewDrawable;
        if (drawable != null) {
            drawable.setTint(this.mPanelDragViewDrawableTintColor);
            cOUIPanelContentLayout.setDragViewDrawable(this.mPanelDragViewDrawable);
        }
        if (this.mHandleViewHasPressAnim) {
            cOUIPanelContentLayout.setDragViewPressAnim(true);
        }
        WindowInsets windowInsets = this.mApplyWindowInsets;
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        cOUIPanelContentLayout.setNavigationMargin(null, windowInsets, cOUIPanelPercentFrameLayout != null && cOUIPanelPercentFrameLayout.getRatio() == 1.0f, this.mCouiPanelEdgeToEdgeEnable);
        this.mDraggableConstraintLayout = cOUIPanelContentLayout;
        if (this.mIsHandlePanel) {
            return;
        }
        hideDragView();
    }

    private ValueAnimator createPanelTranslateAnimation(float f, float f2, float f3, PathInterpolator pathInterpolator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration((long) f3);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.17
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                COUIBottomSheetDialog.this.translateUpdate(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        setFrameRate(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissWithAlphaAnim() {
        this.mIsEntering = false;
        this.mIsRevertAnimationFromSettlingAnimation = false;
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                COUIBottomSheetDialog.this.mCurrentOutSideAlphaStateHidden = 0.0f;
                super.onAnimationCancel(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (COUIBottomSheetDialog.this.mBottomSheetDialogAnimatorListener != null) {
                    COUIBottomSheetDialog.this.mBottomSheetDialogAnimatorListener.onBottomSheetDialogCollapsed();
                }
                COUIBottomSheetDialog.this.mCurrentOutSideAlphaStateHidden = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                COUIBottomSheetDialog.this.mIsExecutingDismissAnim = true;
                if (COUIBottomSheetDialog.this.mAnimationListener != null) {
                    COUIBottomSheetDialog.this.mAnimationListener.onDismissAnimationStart();
                }
                super.onAnimationStart(animator);
            }
        };
        stopCurrentRunningViewTranslationAnim();
        this.mCurrentOutSideAlphaStateHidden = this.mCurrentOutsideAlpha;
        resetAnimationFlag();
        addAnimationFlag(2);
        doAlphaSpringAnimaion(animatorListenerAdapter);
    }

    private void dismissWithInterruptibleAnim() {
        doParentViewTranslationHidingAnim(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                COUIBottomSheetDialog.this.mIsExecutingDismissAnim = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (COUIBottomSheetDialog.this.mBottomSheetDialogAnimatorListener != null) {
                    COUIBottomSheetDialog.this.mBottomSheetDialogAnimatorListener.onBottomSheetDialogCollapsed();
                }
                COUIBottomSheetDialog.this.mIsExecutingDismissAnim = false;
                COUIBottomSheetDialog.this.superDismiss();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                COUIBottomSheetDialog.this.mIsExecutingDismissAnim = true;
                if (COUIBottomSheetDialog.this.mAnimationListener != null) {
                    COUIBottomSheetDialog.this.mAnimationListener.onDismissAnimationStart();
                }
            }
        });
    }

    private void doAlphaSpringAnimaion(final Animator.AnimatorListener animatorListener) {
        if (this.mAlphaSpringAnimation == null) {
            this.mAlphaSpringAnimation = new b(new FloatValueHolder());
            c cVar = new c();
            this.mSpringForceAlpha = cVar;
            cVar.i(0.0f);
            this.mAlphaSpringAnimation.E(this.mSpringForceAlpha);
        }
        if (hasAnimationFlag(2)) {
            if (!isFadeInCenter()) {
                this.mSpringForceAlpha.l(getTranslationResponse());
            } else if (this.mIsEntering) {
                this.mSpringForceAlpha.l(0.25f);
            } else {
                this.mSpringForceAlpha.l(0.25f);
            }
        }
        if (animatorListener != null) {
            this.mAlphaSpringAnimation.removeEndListener(this.mAlphaSpringEndListener);
            COUIDynamicAnimation.q qVar = new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.14
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
                public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                    if (z) {
                        animatorListener.onAnimationCancel(null);
                    } else {
                        animatorListener.onAnimationEnd(null);
                    }
                    COUIBottomSheetDialog.this.mAlphaSpringAnimation.removeEndListener(COUIBottomSheetDialog.this.mAlphaSpringEndListener);
                    COUIBottomSheetDialog.this.mAlphaSpringAnimation.removeUpdateListener(COUIBottomSheetDialog.this.mAlphaSpringUpdateListener);
                }
            };
            this.mAlphaSpringEndListener = qVar;
            this.mAlphaSpringAnimation.a(qVar);
            animatorListener.onAnimationStart(null);
        }
        this.mAlphaSpringAnimation.removeUpdateListener(this.mAlphaSpringUpdateListener);
        this.mAlphaSpringUpdateListener = new COUIDynamicAnimation.r() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.15
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
            public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                float fMax = COUIBottomSheetDialog.this.mEndValueOfTranslateAnimation != COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation ? (f - COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation) / (COUIBottomSheetDialog.this.mEndValueOfTranslateAnimation - COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation) : 0.0f;
                if (COUIBottomSheetDialog.this.hasAnimationFlag(2)) {
                    COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog.outsideAlphaChange(fMax, cOUIBottomSheetDialog.mIsEntering);
                }
                if (!COUIBottomSheetDialog.this.hasAnimationFlag(8) || COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout == null) {
                    return;
                }
                COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout;
                if (!COUIBottomSheetDialog.this.mIsEntering) {
                    fMax = Math.max(0.0f, 1.0f - fMax);
                }
                cOUIPanelPercentFrameLayout.setAlpha(fMax);
            }
        };
        this.mAlphaSpringAnimation.removeEndListener(this.mAlphaSpringEndListener);
        COUIDynamicAnimation.q qVar2 = new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.16
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
            public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                if (z && COUIBottomSheetDialog.this.hasAnimationFlag(8) && COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout != null) {
                    COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.setAlpha(COUIBottomSheetDialog.this.mIsEntering ? 1.0f : 0.0f);
                }
                COUIBottomSheetDialog.this.mAlphaSpringAnimation.removeEndListener(this);
            }
        };
        this.mAlphaSpringEndListener = qVar2;
        this.mAlphaSpringAnimation.a(qVar2);
        if (this.mIsRevertAnimationFromSettlingAnimation) {
            this.mCurrentOutSideAlphaStateShow = this.mOutsideView.getAlpha();
        } else {
            this.mCurrentOutSideAlphaStateShow = 0.0f;
        }
        this.mAlphaSpringAnimation.b(this.mAlphaSpringUpdateListener);
        this.mAlphaSpringAnimation.r(this.mStartValueOfTranslateAnimation);
        this.mAlphaSpringAnimation.x(this.mEndValueOfTranslateAnimation);
    }

    private void doFeedbackAnimation(View view) {
        if (view == null) {
            return;
        }
        if (this.mDisableFastCloseFeedbackSpring == null || this.mFeedBackView != view) {
            this.mFeedBackView = view;
            doi doiVarC = loi.g().c();
            this.mDisableFastCloseFeedbackSpring = doiVarC;
            doiVarC.p(foi.a(THREE_POINT_EIGHT, TWENTY));
            this.mDisableFastCloseFeedbackSpring.a(new ioi() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.25
                @Override // com.oplus.aiunit.vision.ioi
                public void onSpringActivate(doi doiVar) {
                }

                @Override // com.oplus.aiunit.vision.ioi
                public void onSpringAtRest(doi doiVar) {
                }

                @Override // com.oplus.aiunit.vision.ioi
                public void onSpringEndStateChange(doi doiVar) {
                }

                @Override // com.oplus.aiunit.vision.ioi
                public void onSpringUpdate(doi doiVar) {
                    if (COUIBottomSheetDialog.this.mDisableFastCloseFeedbackSpring == null || COUIBottomSheetDialog.this.mFeedBackView == null) {
                        return;
                    }
                    int iC = (int) doiVar.c();
                    if (iC >= 100) {
                        COUIBottomSheetDialog.this.mDisableFastCloseFeedbackSpring.o(0.0d);
                    }
                    COUIBottomSheetDialog.this.mFeedBackView.setTranslationY(iC);
                }
            });
        }
        this.mDisableFastCloseFeedbackSpring.o(100.0d);
    }

    private void doParentViewTranslationHidingAnim(Animator.AnimatorListener animatorListener) {
        if (reversalAnimation(animatorListener, false)) {
            this.mIsExecutingDismissAnim = true;
            return;
        }
        this.mIsEntering = false;
        stopCurrentRunningViewTranslationAnim();
        resetAnimationFlag();
        if (getDialogMaxHeight() == 0) {
            Log.d(TAG, "doParentViewTranslationHidingAnim return directly for dialogMaxHeight is 0, but call superDismiss");
            superDismiss();
            return;
        }
        this.mPanelViewTranslationAnimationSet = new AnimatorSet();
        if (this.mIsInTinyScreen) {
            startReleaseAnimInTinyScreen(this.mStartValueOfTranslateAnimation, this.mEndValueOfTranslateAnimation, this.mTranslateHidingDuration, animatorListener);
            return;
        }
        if (isFollowHand()) {
            setDefaultSpringStartEndValue();
            if (this.mDesignBottomSheetFrameLayout.getAlpha() != 1.0f) {
                this.mDesignBottomSheetFrameLayout.setAlpha(1.0f);
            }
            if (haveEnoughSpace()) {
                addAnimationFlag(8);
            } else {
                addAnimationFlag(8);
                addAnimationFlag(2);
            }
        } else if (isFadeInCenter()) {
            addAnimationFlag(4);
            addAnimationFlag(2);
            addAnimationFlag(8);
            setDefaultSpringStartEndValue();
        } else {
            addAnimationFlag(1);
            addAnimationFlag(2);
            this.mStartValueOfTranslateAnimation = (int) this.mCurrentParentViewTranslationY;
            this.mEndValueOfTranslateAnimation = getTranslationDistance();
        }
        this.mIsAnimationInFirst = false;
        doTranslationAndScaleSpringAnimaion(animatorListener);
        doAlphaSpringAnimaion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doParentViewTranslationShowingAnim(int i, Animator.AnimatorListener animatorListener) {
        this.mCurrentOutSideAlphaStateShow = 0.0f;
        if (reversalAnimation(animatorListener, true)) {
            this.mIsExecutingDismissAnim = false;
            return;
        }
        if (((COUIBottomSheetBehavior) getBehavior()).isPanelHeightChangeAnimRunning()) {
            this.mIsRevertAnimationFromSettlingAnimation = true;
            ((COUIBottomSheetBehavior) getBehavior()).stopSettlingAnimationIfRunning();
            this.mIsExecutingDismissAnim = false;
        }
        stopCurrentRunningViewTranslationAnim();
        resetAnimationFlag();
        if (getDialogMaxHeight() == 0) {
            Log.d(TAG, "doParentViewTranslationShowingAnim return directly for dialogMaxHeight is 0");
            return;
        }
        this.mIsEntering = true;
        getContentViewHeightWithMargins();
        this.mPanelViewTranslationAnimationSet = new AnimatorSet();
        if (this.mIsInTinyScreen) {
            startShowingAnimInTinyScreen(i, animatorListener);
            return;
        }
        if (isFollowHand()) {
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout != null && cOUIPanelPercentFrameLayout.getAlpha() != 0.0f) {
                this.mDesignBottomSheetFrameLayout.setAlpha(0.0f);
                this.mDesignBottomSheetFrameLayout.setScaleX(0.8f);
                this.mDesignBottomSheetFrameLayout.setScaleY(0.8f);
            }
            setDefaultSpringStartEndValue();
            if (haveEnoughSpace()) {
                offsetViewTo();
                addAnimationFlag(8);
                addAnimationFlag(4);
            } else {
                updateBottomSheetCenterVertical();
                addAnimationFlag(8);
                addAnimationFlag(4);
                addAnimationFlag(2);
            }
        } else if (isFadeInCenter()) {
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout2 = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout2 != null) {
                cOUIPanelPercentFrameLayout2.setAlpha(0.0f);
                this.mDesignBottomSheetFrameLayout.setScaleX(0.8f);
                this.mDesignBottomSheetFrameLayout.setScaleY(0.8f);
            }
            addAnimationFlag(4);
            addAnimationFlag(2);
            addAnimationFlag(8);
            setDefaultSpringStartEndValue();
        } else {
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout3 = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout3 != null) {
                cOUIPanelPercentFrameLayout3.setAlpha(1.0f);
                this.mDesignBottomSheetFrameLayout.setScaleX(1.0f);
                this.mDesignBottomSheetFrameLayout.setScaleY(1.0f);
            }
            addAnimationFlag(1);
            addAnimationFlag(2);
            this.mStartValueOfTranslateAnimation = getTranslationDistance();
            this.mEndValueOfTranslateAnimation = 0.0f;
            if (this.mIsRevertAnimationFromSettlingAnimation) {
                this.mStartValueOfTranslateAnimation = this.mDesignBottomSheetFrameLayout.getTop();
            }
        }
        this.mIsAnimationInFirst = true;
        doTranslationAndScaleSpringAnimaion(animatorListener);
        doAlphaSpringAnimaion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSpringBackReboundAnim(final int i) {
        doi doiVarC = loi.g().c();
        this.mPanelSpringBackAnim = doiVarC;
        doiVarC.p(foi.a(6.0d, 42.0d));
        this.mCurrentSpringTotalOffset = 0;
        this.mPanelSpringBackAnim.a(new ioi() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.29
            @Override // com.oplus.aiunit.vision.ioi
            public void onSpringActivate(doi doiVar) {
            }

            @Override // com.oplus.aiunit.vision.ioi
            public void onSpringAtRest(doi doiVar) {
                if ((COUIBottomSheetDialog.this.getBehavior() instanceof COUIBottomSheetBehavior) && COUIBottomSheetDialog.this.mPulledUpView != null) {
                    COUIBottomSheetDialog.this.mParentViewPaddingBottom = 0;
                    COUIBottomSheetDialog.this.setPulledUpViewPaddingBottom(0);
                    ((COUIBottomSheetBehavior) COUIBottomSheetDialog.this.getBehavior()).setStateInternal(3);
                }
                COUIBottomSheetDialog.this.setCanPullUp(true);
            }

            @Override // com.oplus.aiunit.vision.ioi
            public void onSpringEndStateChange(doi doiVar) {
            }

            @Override // com.oplus.aiunit.vision.ioi
            public void onSpringUpdate(doi doiVar) {
                if (COUIBottomSheetDialog.this.mPanelSpringBackAnim == null || COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout == null) {
                    return;
                }
                if (doiVar.s() && doiVar.g() == 0.0d) {
                    COUIBottomSheetDialog.this.mPanelSpringBackAnim.l();
                    return;
                }
                int iC = (int) doiVar.c();
                COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.offsetTopAndBottom(iC - COUIBottomSheetDialog.this.mCurrentSpringTotalOffset);
                COUIBottomSheetDialog.this.mCurrentSpringTotalOffset = iC;
                COUIBottomSheetDialog.this.setPulledUpViewPaddingBottom(i - iC);
            }
        });
        this.mPanelSpringBackAnim.o(i);
    }

    private void doTranslationAndScaleSpringAnimaion(final Animator.AnimatorListener animatorListener) {
        initTranslationAndScaleSpringAnimation();
        if (hasAnimationFlag(1)) {
            this.mSpringForceTranslationAndScale.l(getTranslationResponse());
        } else if (hasAnimationFlag(4)) {
            if (this.mIsEntering) {
                this.mSpringForceTranslationAndScale.l(0.25f);
            } else {
                this.mSpringForceTranslationAndScale.l(0.25f);
            }
        }
        this.mTranslationAndScaleSpringAnimation.removeEndListener(this.mTranslationAndScaleEndListener);
        COUIDynamicAnimation.q qVar = new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.12
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
            public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                if (z) {
                    animatorListener.onAnimationCancel(null);
                } else {
                    animatorListener.onAnimationEnd(null);
                }
                COUIBottomSheetDialog.this.mTranslationAndScaleSpringAnimation.removeEndListener(COUIBottomSheetDialog.this.mTranslationAndScaleEndListener);
                COUIBottomSheetDialog.this.mTranslationAndScaleSpringAnimation.removeUpdateListener(COUIBottomSheetDialog.this.mTranslationAndScaleUpdateListener);
                if (COUIBottomSheetDialog.this.mAlphaSpringAnimation == null || !COUIBottomSheetDialog.this.mAlphaSpringAnimation.i()) {
                    return;
                }
                COUIBottomSheetDialog.this.mAlphaSpringAnimation.z();
            }
        };
        this.mTranslationAndScaleEndListener = qVar;
        this.mTranslationAndScaleSpringAnimation.a(qVar);
        animatorListener.onAnimationStart(null);
        this.mTranslationAndScaleSpringAnimation.removeUpdateListener(this.mTranslationAndScaleUpdateListener);
        this.mTranslationAndScaleUpdateListener = new COUIDynamicAnimation.r() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.13
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
            public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                float f3 = COUIBottomSheetDialog.this.mEndValueOfTranslateAnimation != COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation ? (f - COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation) / (COUIBottomSheetDialog.this.mEndValueOfTranslateAnimation - COUIBottomSheetDialog.this.mStartValueOfTranslateAnimation) : 0.0f;
                if (COUIBottomSheetDialog.this.hasAnimationFlag(1)) {
                    COUIBottomSheetDialog.this.translateUpdate(f);
                }
                if (!COUIBottomSheetDialog.this.hasAnimationFlag(4) || COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout == null) {
                    return;
                }
                float f4 = COUIBottomSheetDialog.this.mIsEntering ? (f3 * 0.2f) + 0.8f : ((1.0f - f3) * 0.2f) + 0.8f;
                COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.setScaleX(f4);
                COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.setScaleY(f4);
            }
        };
        if (!this.mSupportExitBlockingAnimation) {
            if (this.mIsEntering) {
                this.mTranslationAndScaleSpringAnimation.p(1.0f);
            } else {
                this.mTranslationAndScaleSpringAnimation.p(10.0f);
            }
        }
        this.mTranslationAndScaleSpringAnimation.b(this.mTranslationAndScaleUpdateListener);
        setFrameRate(this.mTranslationAndScaleSpringAnimation);
        this.mTranslationAndScaleSpringAnimation.r(this.mStartValueOfTranslateAnimation);
        this.mTranslationAndScaleSpringAnimation.x(this.mIsEntering ? this.mEndValueOfTranslateAnimation : this.mEndValueOfTranslateAnimation + 1.0f);
    }

    private void enforceChangeScreenWidth() {
        if (this.mPreferWidth == -1) {
            return;
        }
        try {
            Resources resources = getContext().getResources();
            Configuration configuration = resources.getConfiguration();
            this.mOriginWidth = configuration.screenWidthDp;
            configuration.screenWidthDp = this.mPreferWidth;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Log.d(TAG, "enforceChangeScreenWidth : OriginWidth=" + this.mOriginWidth + " ,PreferWidth:" + this.mPreferWidth);
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout != null) {
                cOUIPanelPercentFrameLayout.setPreferWidth(this.mPreferWidth);
            }
        } catch (Exception unused) {
            Log.d(TAG, "enforceChangeScreenWidth : failed to updateConfiguration");
        }
    }

    private void ensureDraggableContentLayout() {
        if (this.mDraggableConstraintLayout == null) {
            createPanelConstraintLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentViewHeightWithMargins() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            return cOUIPanelPercentFrameLayout.getMeasuredHeight() + COUIViewMarginUtil.getMargin(this.mDesignBottomSheetFrameLayout, 3);
        }
        return 0;
    }

    private boolean getFocusChange() {
        Boolean bool = this.mFocusChange;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private Rect getLocationRectInScreen(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    @ColorInt
    private int getNavColor() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout;
        int i = this.mNavColor;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return (this.mIsHandlePanel || ((cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout) != null && cOUIPanelPercentFrameLayout.getRatio() == 1.0f)) ? this.mPanelBackgroundTintColor : this.mColorMask;
    }

    private Drawable getNavigationDrawable(@ColorInt int i) {
        if (this.mGradientDrawable == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.mGradientDrawable = gradientDrawable;
            gradientDrawable.setShape(0);
            this.mGradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        this.mGradientDrawable.setColors(new int[]{i, i, getSpecifiedTransparencyColor(i, 0.75f), getSpecifiedTransparencyColor(i, 0.5f), getSpecifiedTransparencyColor(i, 0.25f), 0});
        return this.mGradientDrawable;
    }

    private COUIPanelPullUpListener getPanelPullUpListener() {
        return new COUIPanelPullUpListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.28
            private int mLastPosition = -1;

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public void onCancel() {
                COUIBottomSheetDialog.this.setPulledUpViewPaddingBottom(0);
            }

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public int onDragging(int i, int i2) {
                if (COUIBottomSheetDialog.this.mPanelSpringBackAnim != null && COUIBottomSheetDialog.this.mPanelSpringBackAnim.g() != 0.0d) {
                    COUIBottomSheetDialog.this.mPanelSpringBackAnim.l();
                    return COUIBottomSheetDialog.this.mParentViewPaddingBottom;
                }
                int iClamp = MathUtils.clamp((int) ((COUIBottomSheetDialog.this.mPulledUpView.getPaddingBottom() - COUIBottomSheetDialog.this.mPanelPaddingBottom) - (i * 0.19999999f)), 0, Math.min(COUIBottomSheetDialog.this.mPullUpMaxOffset, COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getTop()));
                if (COUIBottomSheetDialog.this.mParentViewPaddingBottom != iClamp) {
                    COUIBottomSheetDialog.this.mParentViewPaddingBottom = iClamp;
                    COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog.setPulledUpViewPaddingBottom(cOUIBottomSheetDialog.mParentViewPaddingBottom);
                }
                return COUIBottomSheetDialog.this.mParentViewPaddingBottom;
            }

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public void onDraggingPanel() {
                boolean unused = COUIBottomSheetDialog.this.mIsInTinyScreen;
            }

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public void onOffsetChanged(float f) {
                if (this.mLastPosition == -1) {
                    this.mLastPosition = COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getHeight();
                }
                if (COUIBottomSheetDialog.this.mDialogOffsetListener != null) {
                    COUIBottomSheetDialog.this.mDialogOffsetListener.onDialogOffsetChanged(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getTop());
                }
                if (COUIBottomSheetDialog.this.mIsNeedOutsideViewAnim && !COUIBottomSheetDialog.this.mIsExecutingDismissAnim) {
                    float fMax = Math.max(0.0f, COUIBottomSheetDialog.this.getOutsideViewAlpha(f));
                    COUIBottomSheetDialog.this.mOutsideView.setAlpha(fMax);
                    COUIBottomSheetDialog.this.mCurrentOutsideAlpha = fMax;
                    if ((!COUIPanelMultiWindowUtils.isSmallScreen(COUIBottomSheetDialog.this.getContext(), null)) && COUINavigationBarUtil.isNavigationBarShow(COUIBottomSheetDialog.this.getContext()) && ((!COUIBottomSheetDialog.this.mIsHandlePanel || COUIBottomSheetDialog.this.shouldHandlePanelUpdateNavBarColor()) && COUIBottomSheetDialog.this.getWindow() != null && ((int) (COUIBottomSheetDialog.this.mOutsideViewBackgroundAlpha * f)) != 0 && !COUINavigationBarUtil.isGestureNavigation(COUIBottomSheetDialog.this.getContext()))) {
                        COUIBottomSheetDialog.this.setNavigationBarColorAlpha(fMax);
                    }
                }
                if (COUIBottomSheetDialog.this.mPanelBarView == null || f == 1.0f || !COUIBottomSheetDialog.this.mIsInTinyScreen) {
                    return;
                }
                COUIBottomSheetDialog.this.mPanelBarView.setPanelOffset(this.mLastPosition - ((int) (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getHeight() * f)));
                this.mLastPosition = (int) (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getHeight() * f);
            }

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public void onReleased(int i) {
                COUIBottomSheetDialog.this.setCanPullUp(false);
                int top = COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getTop() - (i - COUIBottomSheetDialog.this.mParentViewPaddingBottom);
                COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                cOUIBottomSheetDialog.doSpringBackReboundAnim(cOUIBottomSheetDialog.mParentViewPaddingBottom - top);
            }

            @Override // com.coui.appcompat.panel.COUIPanelPullUpListener
            public void onReleasedDrag() {
                boolean unused = COUIBottomSheetDialog.this.mIsInTinyScreen;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator.AnimatorListener getPanelShowAnimListener() {
        return new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.27
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                COUIBottomSheetDialog.this.animationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                COUIBottomSheetDialog.this.animationStart();
            }
        };
    }

    private float getRevertAnimationFinalPositionToHide() {
        return this.mIsAnimationInFirst ? this.mStartValueOfTranslateAnimation : this.mEndValueOfTranslateAnimation;
    }

    private float getRevertAnimationFinalPositionToShow() {
        return this.mIsAnimationInFirst ? this.mEndValueOfTranslateAnimation : this.mStartValueOfTranslateAnimation;
    }

    private int getSpecifiedTransparencyColor(@ColorInt int i, float f) {
        return Color.argb((int) ((Color.alpha(i) / 255.0f) * f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    private int getTranslationDistance() {
        int height = this.mDesignBottomSheetFrameLayout.getHeight() - this.mPanelPaddingBottom;
        InputMethodManager inputMethodManager = this.mInputMethodManager;
        boolean z = inputMethodManager != null && inputMethodManager.isAcceptingText();
        if (!this.mIsEntering && isInMultiWindowMode() && z) {
            this.mDesignBottomSheetFrameLayout.getGlobalVisibleRect(this.mTemtRect);
            height = Math.max(height, kjk.j(getContext()) - this.mTemtRect.top);
        }
        COUIBottomSheetBehavior cOUIBottomSheetBehavior = (COUIBottomSheetBehavior) getBehavior();
        if (cOUIBottomSheetBehavior.getState() == 3) {
            return height;
        }
        if (cOUIBottomSheetBehavior.getState() == 6) {
            return this.mCoordinatorLayout.getMeasuredHeight() - cOUIBottomSheetBehavior.halfExpandedOffset;
        }
        return cOUIBottomSheetBehavior.getState() == 4 ? this.mPeekHeight : height;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    private float getTranslationResponse() {
        float f;
        float f2;
        int iJ;
        float fMax;
        float fMax2;
        float f3;
        if (this.mIsEntering) {
            f = 0.25f;
            f2 = DEFAULT_TRANSLATION_SHOW_SPRING_RESPONSE_LARGE;
        } else {
            f = DEFAULT_TRANSLATION_HIDE_SPRING_RESPONSE_SMALL;
            f2 = DEFAULT_TRANSLATION_HIDE_SPRING_RESPONSE_LARGE;
        }
        float height = this.mDesignBottomSheetFrameLayout.getHeight() - this.mPanelPaddingBottom;
        if (getBehavior().getState() != 4) {
            if (getBehavior().getState() == 6) {
                height = this.mCoordinatorLayout.getHeight() * getBehavior().getHalfExpandedRatio();
            } else if (getBehavior().getState() != 3) {
                iJ = kjk.j(getContext()) - this.mDesignBottomSheetFrameLayout.getTop();
            }
            fMax = Math.max(Float.valueOf(this.mCoordinatorLayout.getHeight() - this.mPeekHeight).floatValue(), 0.0f);
            fMax2 = Math.max(Float.valueOf(height - this.mPeekHeight).floatValue(), 0.0f);
            if (fMax != 0.0f) {
                f3 = fMax2 / fMax;
            } else {
                f3 = 1.0f;
            }
            return f + ((f2 - f) * Math.max(0.0f, f3));
        }
        iJ = this.mPeekHeight;
        height = iJ;
        fMax = Math.max(Float.valueOf(this.mCoordinatorLayout.getHeight() - this.mPeekHeight).floatValue(), 0.0f);
        fMax2 = Math.max(Float.valueOf(height - this.mPeekHeight).floatValue(), 0.0f);
        if (fMax != 0.0f) {
            f3 = fMax2 / fMax;
        } else {
            f3 = 1.0f;
        }
        return f + ((f2 - f) * Math.max(0.0f, f3));
    }

    private Drawable getTypedArrayDrawable(TypedArray typedArray, int i, @DrawableRes int i2) {
        Drawable drawable = typedArray != null ? typedArray.getDrawable(i) : null;
        return drawable == null ? getContext().getResources().getDrawable(i2, getContext().getTheme()) : drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBehaviorStateChange(View view, int i) {
        if (i == 3 || i == 6 || i == 4) {
            this.mLastStaticState = i;
        }
        if (i == 2) {
            if (needHideKeyboardWhenSettling()) {
                hideKeyboard();
            }
        } else if (i == 3) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mAdjustResizeEnable = true;
            }
            this.mWindowInsetsAnimEnable = false;
        } else if (i == 5 && !this.mIsRevertAnimationFromSettlingAnimation) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAnimationFlag(int i) {
        return (this.mAnimationFlag & i) > 0;
    }

    private boolean hasEditText(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof EditText) || (childAt instanceof COUIInputView)) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && hasEditText((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean haveEnoughSpace() {
        View view;
        if (this.mDesignBottomSheetFrameLayout == null || (view = this.mAnchorView) == null) {
            return false;
        }
        Rect locationRectInScreen = getLocationRectInScreen(view);
        int measuredWidth = this.mDesignBottomSheetFrameLayout.getMeasuredWidth();
        int measuredHeight = this.mDesignBottomSheetFrameLayout.getMeasuredHeight();
        Rect locationRectInScreen2 = getLocationRectInScreen(((ViewGroup) this.mAnchorView.getRootView()).getChildAt(0));
        int navigationBarHeight = COUINavigationBarUtil.getNavigationBarHeight(getContext());
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_dialog_follow_hand_margin_bottom);
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_dialog_follow_hand_margin_right);
        if ((locationRectInScreen.left - measuredWidth) - dimensionPixelOffset2 <= locationRectInScreen2.left && locationRectInScreen.right + measuredWidth + dimensionPixelOffset2 >= locationRectInScreen2.right && ((locationRectInScreen.top - measuredHeight) - this.mCoordinatorLayoutMinInsetsTop) - dimensionPixelOffset <= locationRectInScreen2.top && locationRectInScreen.bottom + measuredHeight + navigationBarHeight + dimensionPixelOffset >= locationRectInScreen2.bottom) {
            Log.d(TAG, "anchor view have no enoughSpace anchorContentViewLocationRect: " + locationRectInScreen2);
            this.mDesignBottomSheetFrameLayout.setHasAnchor(false);
            this.mDesignBottomSheetFrameLayout.setElevation(0.0f);
            this.mOutsideView.setAlpha(1.0f);
            return false;
        }
        Log.d(TAG, "anchor view haveEnoughSpace");
        this.mDesignBottomSheetFrameLayout.setHasAnchor(true);
        this.mDesignBottomSheetFrameLayout.setTop(0);
        this.mDesignBottomSheetFrameLayout.setBottom(measuredHeight);
        t1h.f(this.mDesignBottomSheetFrameLayout, 3, getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_bottom_sheet_dialog_elevation), ContextCompat.getColor(getContext(), R$color.coui_panel_follow_hand_spot_shadow_color));
        this.mOutsideView.setAlpha(0.0f);
        setCanPullUp(false);
        getBehavior().setDraggable(false);
        return true;
    }

    private void hideKeyboard() {
        InputMethodManager inputMethodManager = this.mInputMethodManager;
        if (inputMethodManager == null || !inputMethodManager.isActive()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && getWindow() != null) {
            this.mAdjustResizeEnable = false;
        }
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            this.mInputMethodManager.hideSoftInputFromWindow(cOUIPanelPercentFrameLayout.getWindowToken(), 0);
        }
    }

    private void initBehavior() {
        int i;
        boolean z;
        if (!(getBehavior() instanceof COUIBottomSheetBehavior)) {
            throw new IllegalArgumentException("Must use COUIBottomSheetBehavior, check value of bottom_sheet_behavior in strings.xml");
        }
        COUIBottomSheetBehavior cOUIBottomSheetBehavior = (COUIBottomSheetBehavior) getBehavior();
        cOUIBottomSheetBehavior.applyPhysics(this.mPhysicsFrequency, this.mPhysicsDampingRatio);
        cOUIBottomSheetBehavior.setGlobalDrag(this.mGlobalDrag);
        cOUIBottomSheetBehavior.setIsInTinyScreen(this.mIsInTinyScreen);
        cOUIBottomSheetBehavior.setPanelPeekHeight(this.mPeekHeight);
        cOUIBottomSheetBehavior.setPanelSkipCollapsed(this.mSkipCollapsed);
        cOUIBottomSheetBehavior.setIsHandlePanel(this.mIsHandlePanel);
        cOUIBottomSheetBehavior.setLayoutAtMaxHeight(this.mIsShowInMaxHeight);
        cOUIBottomSheetBehavior.setPanelPaddingBottom(this.mPanelPaddingBottom);
        if (this.mIsHandlePanel) {
            if (COUIPanelMultiWindowUtils.isNormalLandScreen(getContext(), this.mConfiguration)) {
                i = 4;
                z = true;
            } else {
                i = 6;
                z = false;
            }
            cOUIBottomSheetBehavior.setFitToContents(z);
            cOUIBottomSheetBehavior.setGestureInsetBottomIgnored(true);
            setIsNeedOutsideViewAnim(false);
        } else {
            i = 3;
        }
        int i2 = this.mFirstShowCollapsed ? 4 : i;
        cOUIBottomSheetBehavior.setPanelState(i2);
        this.mLastStaticState = i2;
        cOUIBottomSheetBehavior.addBottomSheetCallback(new COUIBottomSheetBehavior.COUIBottomSheetCallback() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.3
            @Override // com.coui.appcompat.panel.COUIBottomSheetBehavior.COUIBottomSheetCallback
            public void onSlide(@NonNull View view, float f) {
            }

            @Override // com.coui.appcompat.panel.COUIBottomSheetBehavior.COUIBottomSheetCallback
            public void onStateChanged(@NonNull View view, int i3) {
                if (COUIBottomSheetDialog.DEBUG) {
                    Log.d(COUIBottomSheetDialog.TAG, "onStateChanged: newState=" + i3);
                }
                COUIBottomSheetDialog.this.handleBehaviorStateChange(view, i3);
            }
        });
        if (DEBUG) {
            Log.d(TAG, "initBehavior: peekHeight=" + this.mPeekHeight + " mSkipCollapsed=" + this.mSkipCollapsed + " mIsHandlePanel=" + this.mIsHandlePanel + " mFirstShowCollapsed=" + this.mFirstShowCollapsed + " state=" + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initCoordinateInsets(WindowInsets windowInsets) {
        View view = this.mCoordinatorLayout;
        if (view == null || windowInsets == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        boolean z = getContext().getResources().getConfiguration().smallestScreenWidthDp < 600;
        this.mCoordinatorLayoutMinInsetsTop = (int) getContext().getResources().getDimension(com.support.panel.R$dimen.coui_bottom_sheet_margin_top_default);
        if (z && windowInsets.getSystemWindowInsetTop() > 0) {
            this.mCoordinatorLayoutMinInsetsTop = windowInsets.getSystemWindowInsetTop();
        }
        if (this.mIsInTinyScreen) {
            if (this.mIsFullScreenInTinyScreen) {
                this.mCoordinatorLayoutMinInsetsTop = (int) getContext().getResources().getDimension(com.support.panel.R$dimen.coui_panel_min_padding_top_tiny_screen);
            } else {
                this.mCoordinatorLayoutMinInsetsTop = (int) getContext().getResources().getDimension(com.support.panel.R$dimen.coui_panel_normal_padding_top_tiny_screen);
            }
        }
        int i = layoutParams.topMargin;
        int i2 = this.mCoordinatorLayoutMinInsetsTop;
        if (i != i2) {
            layoutParams.topMargin = i2;
            this.mCoordinatorLayout.setLayoutParams(layoutParams);
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            Configuration configuration = this.mConfiguration;
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            cOUIPanelContentLayout.setNavigationMargin(configuration, windowInsets, cOUIPanelPercentFrameLayout != null && cOUIPanelPercentFrameLayout.getRatio() == 1.0f, this.mCouiPanelEdgeToEdgeEnable);
        }
    }

    private void initDraggableConstraintLayoutSize() {
        setPanelWidth();
        setPanelHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMaxHeight(WindowInsets windowInsets) {
        boolean z = this.mPanelHeight >= COUIPanelMultiWindowUtils.getPanelMaxHeight(getContext(), null, windowInsets, this.mIsHandlePanel, this.mCouiPanelEdgeToEdgeEnable);
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            cOUIPanelPercentFrameLayout.getLayoutParams().height = (this.mIsShowInMaxHeight || z) ? -1 : -2;
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            if (this.mIsShowInMaxHeight || z) {
                cOUIPanelContentLayout.getLayoutParams().height = -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOrRefreshNavigationView() {
        if (unNeedNavigationCustomView()) {
            if (this.mNavigationCustomView == null || !(this.mContainerFrameLayout.getParent() instanceof FrameLayout)) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.mContainerFrameLayout.getParent();
            if (frameLayout.indexOfChild(this.mNavigationCustomView) != -1) {
                frameLayout.removeView(this.mNavigationCustomView);
            }
            this.mNavigationCustomView = null;
            return;
        }
        if (this.mNavigationCustomView == null) {
            this.mNavigationCustomView = new View(getContext());
        }
        setNavigationBarColor(getNavColor());
        if (this.mContainerFrameLayout.getParent() instanceof FrameLayout) {
            FrameLayout frameLayout2 = (FrameLayout) this.mContainerFrameLayout.getParent();
            if (frameLayout2.indexOfChild(this.mNavigationCustomView) != -1) {
                setNavigationCustomViewHeight(this.mApplyWindowInsets);
            } else {
                frameLayout2.addView(this.mNavigationCustomView, new FrameLayout.LayoutParams(-1, this.mApplyWindowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom, 80));
            }
        }
    }

    private void initPeekHeight() {
        if (this.mIsGestureNavigation) {
            this.mPeekHeight = getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_panel_default_peek_height_in_gesture);
        } else if (this.mCouiPanelEdgeToEdgeEnable) {
            this.mPeekHeight = getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_panel_default_peek_height_panel_extend_to_navi);
        } else {
            this.mPeekHeight = getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_panel_default_peek_height);
        }
    }

    private void initPhysics() {
        if (this.mAppearStiffness == Float.MIN_VALUE) {
            this.mAppearStiffness = 200.0f;
        }
        if (this.mAppearDampingRatio == Float.MIN_VALUE) {
            this.mAppearDampingRatio = 0.7f;
        }
        this.mAppearSpringForce = new SpringForce(0.0f).setStiffness(this.mAppearStiffness).setDampingRatio(this.mAppearDampingRatio);
        SpringAnimation spring = new SpringAnimation(new FloatValueHolder()).setSpring(this.mAppearSpringForce);
        this.mAppearSpringAnim = spring;
        spring.addUpdateListener(this);
        this.mAppearSpringAnim.addEndListener(this);
    }

    private void initThemeResources(int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUIBottomSheetDialog, R$attr.couiBottomSheetDialogStyle, i);
        this.mPanelDragViewDrawable = getTypedArrayDrawable(typedArrayObtainStyledAttributes, R$styleable.COUIBottomSheetDialog_panelDragViewIcon, R$drawable.coui_panel_drag_view);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIBottomSheetDialog_panelDragViewTintColor, zh2.a(getContext(), com.support.appcompat.R$attr.couiColorControls));
        this.mPanelDragViewDrawableTintColor = color;
        this.mPanelDragViewDrawable.setTint(color);
        this.mPanelBackground = getTypedArrayDrawable(typedArrayObtainStyledAttributes, R$styleable.COUIBottomSheetDialog_panelBackground, R$drawable.coui_default_panel_bg_without_shadow);
        this.mPanelBackgroundTintColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIBottomSheetDialog_panelBackgroundTintColor, zh2.a(getContext(), com.support.appcompat.R$attr.couiColorSurface));
        this.mHandleViewHasPressAnim = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBottomSheetDialog_couiHandleViewHasPressAnim, true);
        this.mIsShowInMaxHeight = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBottomSheetDialog_couiShowMaxHeight, true);
        this.mIsHandlePanel = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBottomSheetDialog_couiIsHandlePanel, false);
        this.mDefaultPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIBottomSheetDialog_couiPanelPaddingBottom, getContext().getResources().getDimensionPixelSize(com.support.panel.R$dimen.coui_panel_padding_bottom));
        this.mCouiPanelEdgeToEdgeEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBottomSheetDialog_couiPanelEdgeToEdge, false);
        this.mSupportExitBlockingAnimation = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBottomSheetDialog_couiPanelSupportExitBlockingAnimation, false);
        getAdjustResizeHelper().setCouiPanelEdgeToEdgeEnable(this.mCouiPanelEdgeToEdgeEnable);
        if (this.mIsHandlePanel && this.mSkipCollapsed) {
            this.mSkipCollapsed = false;
        }
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = this.mPanelBackground;
        if (drawable != null) {
            drawable.setTint(this.mPanelBackgroundTintColor);
        }
    }

    private void initTranslationAndScaleSpringAnimation() {
        if (this.mTranslationAndScaleSpringAnimation == null) {
            this.mTranslationAndScaleSpringAnimation = new b(new FloatValueHolder());
            c cVar = new c();
            this.mSpringForceTranslationAndScale = cVar;
            cVar.i(0.0f);
            this.mTranslationAndScaleSpringAnimation.E(this.mSpringForceTranslationAndScale);
        }
    }

    private void initValueResources() {
        this.mPullUpMaxOffset = (int) getContext().getResources().getDimension(com.support.panel.R$dimen.coui_panel_pull_up_max_offset);
        this.mCoordinatorLayoutMinInsetsTop = (int) getContext().getResources().getDimension(com.support.panel.R$dimen.coui_panel_min_padding_top);
        this.mCoordinatorLayoutPaddingExtra = getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_panel_normal_padding_top);
        refreshColorMask();
        this.mIsGestureNavigation = COUINavigationBarUtil.isGestureNavigation(getContext());
        initPeekHeight();
    }

    private void initView() {
        IgnoreWindowInsetsFrameLayout ignoreWindowInsetsFrameLayout = (IgnoreWindowInsetsFrameLayout) findViewById(com.support.panel.R$id.container);
        this.mContainerFrameLayout = ignoreWindowInsetsFrameLayout;
        if (ignoreWindowInsetsFrameLayout != null) {
            ignoreWindowInsetsFrameLayout.setCouiPanelEdgeToEdgeEnable(this.mCouiPanelEdgeToEdgeEnable);
        }
        this.mOutsideView = findViewById(com.support.panel.R$id.panel_outside);
        operateBlockingAnimation();
        this.mCoordinatorLayout = findViewById(com.support.panel.R$id.coordinator);
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = (COUIPanelPercentFrameLayout) findViewById(R$id.design_bottom_sheet);
        this.mDesignBottomSheetFrameLayout = cOUIPanelPercentFrameLayout;
        cOUIPanelPercentFrameLayout.setIsHandlePanel(this.mIsHandlePanel);
        this.mPanelBarView = (COUIPanelBarView) findViewById(com.support.panel.R$id.panel_drag_bar);
        this.mDesignBottomSheetFrameLayout.getLayoutParams().height = this.mIsShowInMaxHeight ? -1 : -2;
        if (isFollowHand()) {
            this.mDesignBottomSheetFrameLayout.post(new Runnable() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.4
                @Override // java.lang.Runnable
                public void run() {
                    if (COUIBottomSheetDialog.this.haveEnoughSpace()) {
                        t1h.f(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 3, COUIBottomSheetDialog.this.getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_bottom_sheet_dialog_elevation), ContextCompat.getColor(COUIBottomSheetDialog.this.getContext(), R$color.coui_panel_follow_hand_spot_shadow_color));
                        COUIBottomSheetDialog.this.setCanPullUp(false);
                        COUIBottomSheetDialog.this.getBehavior().setDraggable(false);
                    }
                }
            });
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            cOUIPanelContentLayout.setLayoutAtMaxHeight(this.mIsShowInMaxHeight);
        }
        this.mPulledUpView = this.mDesignBottomSheetFrameLayout;
        checkInitState();
        this.mOutsideView.setOnClickListener(new View.OnClickListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.5
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (COUIBottomSheetDialog.this.mCancelable && COUIBottomSheetDialog.this.isShowing() && COUIBottomSheetDialog.this.mCanceledOnTouchOutside) {
                    COUIBottomSheetDialog.this.cancel();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mDesignBottomSheetFrameLayout.setBackground(this.mPanelBackground);
        updatePaddingBottom();
    }

    private void initWindow() {
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
            window.setLayout(-1, -1);
            window.setGravity(80);
        }
    }

    private void initWindowInsetsListener() {
        if (this.mShouldRegisterWindowInsetsListener && getWindow() != null && this.mWindowInsetsListener == null) {
            View decorView = getWindow().getDecorView();
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new View.OnApplyWindowInsetsListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.8
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (view == null || view.getLayoutParams() == null) {
                        return windowInsets;
                    }
                    if (windowInsets.equals(COUIBottomSheetDialog.this.mApplyWindowInsets)) {
                        pj2.a(COUIBottomSheetDialog.TAG, "Window inset is not change, return!");
                        return windowInsets;
                    }
                    COUIBottomSheetDialog.this.initCoordinateInsets(windowInsets);
                    COUIBottomSheetDialog.this.initMaxHeight(windowInsets);
                    if (COUIBottomSheetDialog.this.mInputMethodManager == null) {
                        COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                        cOUIBottomSheetDialog.mInputMethodManager = (InputMethodManager) cOUIBottomSheetDialog.getContext().getSystemService("input_method");
                    }
                    COUIBottomSheetDialog cOUIBottomSheetDialog2 = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog2.adjustResize(windowInsets, cOUIBottomSheetDialog2.mAdjustResizeEnable);
                    COUIBottomSheetDialog.this.largeScreenLimitMaxSize();
                    if (!COUIBottomSheetDialog.this.mIsExecutingDismissAnim && COUIBottomSheetDialog.this.shouldUpdatePanelMarginBottom(windowInsets)) {
                        COUIBottomSheetDialog cOUIBottomSheetDialog3 = COUIBottomSheetDialog.this;
                        cOUIBottomSheetDialog3.updatePanelMarginBottom(cOUIBottomSheetDialog3.mConfiguration, windowInsets);
                    }
                    COUIBottomSheetDialog.this.mApplyWindowInsets = windowInsets;
                    view.onApplyWindowInsets(COUIBottomSheetDialog.this.mApplyWindowInsets);
                    COUIBottomSheetDialog.this.initOrRefreshNavigationView();
                    return COUIBottomSheetDialog.this.mApplyWindowInsets;
                }
            };
            this.mWindowInsetsListener = onApplyWindowInsetsListener;
            decorView.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFadeInCenter() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        return cOUIPanelPercentFrameLayout != null && cOUIPanelPercentFrameLayout.getRatio() == 2.0f && (getBehavior() == null || !(getBehavior() == null || getBehavior().getState() == 4));
    }

    private boolean isFadeInCenterAllState() {
        return this.mDesignBottomSheetFrameLayout.getRatio() == 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFollowHand() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout;
        return this.mAnchorView != null && (cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout) != null && cOUIPanelPercentFrameLayout.getRatio() == 2.0f && this.mAnchorView.isAttachedToWindow();
    }

    private boolean isInMultiWindowMode() {
        WeakReference<Activity> weakReference = this.mActivityWeakReference;
        return (weakReference == null || weakReference.get() == null || !COUIPanelMultiWindowUtils.isInMultiWindowMode(this.mActivityWeakReference.get())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRate$0(AnimationVelocityCalculator animationVelocityCalculator, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        float fCalculator = animationVelocityCalculator.calculator(this.mDesignBottomSheetFrameLayout.getHeight(), valueAnimator);
        pj2.a(TAG, "DynamicFrameRateManager.getSuggestFrameRate: v " + fCalculator + " frame " + DynamicFrameRateManager.getSuggestFrameRate(fCalculator, 2));
        DynamicFrameRateManager.setFrameRate(this.mDesignBottomSheetFrameLayout, 10101, (int) fCalculator, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRate$1(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        pj2.a(TAG, "COUISpringAnimation DynamicFrameRateManager.getSuggestFrameRate: v " + Math.abs(f2) + " frame " + DynamicFrameRateManager.getSuggestFrameRate(f2, 2));
        DynamicFrameRateManager.setFrameRate(this.mDesignBottomSheetFrameLayout, 10101, Math.abs((int) f2), (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void largeScreenLimitMaxSize() {
        if (this.mDesignBottomSheetFrameLayout == null) {
            return;
        }
        int i = getContext().getResources().getConfiguration().screenWidthDp;
        int i2 = getContext().getResources().getConfiguration().screenHeightDp;
        if (!this.isLargeScreenLimitMaxSize || !COUIResponsiveUtils.isLargePadWindow(getContext(), i, i2) || COUIPanelMultiWindowUtils.isInMultiWindowMode(COUIPanelMultiWindowUtils.contextToActivity(getContext()))) {
            this.mDesignBottomSheetFrameLayout.restoreDefaultMaxSize();
            this.mDesignBottomSheetFrameLayout.setMaxHeight(getContext().getResources().getDimensionPixelOffset(com.support.panel.R$dimen.coui_panel_max_height));
            return;
        }
        int iMin = Math.min(kjk.k(getContext()), kjk.n(getContext()));
        int iMax = Math.max(kjk.k(getContext()), kjk.n(getContext()));
        this.mDesignBottomSheetFrameLayout.setMaxSize((int) COUIResponsiveUtils.calculateWidth(iMax, iMin, this.mDesignBottomSheetFrameLayout.getGridNumber(), this.mDesignBottomSheetFrameLayout.getPaddingType(), this.mDesignBottomSheetFrameLayout.getPaddingSize(), getContext()), iMin - (this.mCoordinatorLayoutMinInsetsTop * 2));
    }

    private boolean needHideKeyboardWhenSettling() {
        return ((COUIBottomSheetBehavior) getBehavior()).isCanHideKeyboard();
    }

    private int normalizePoints(int i, int i2) {
        return Math.max(0, Math.min(i, i2));
    }

    private void offsetViewTo() {
        int[] iArrCalculateFinalLocationOnScreen = calculateFinalLocationOnScreen(this.mAnchorView);
        this.mDesignBottomSheetFrameLayout.setX(iArrCalculateFinalLocationOnScreen[0]);
        this.mDesignBottomSheetFrameLayout.setY(iArrCalculateFinalLocationOnScreen[1]);
        this.mCurrentParentViewTranslationY = this.mDesignBottomSheetFrameLayout.getY();
    }

    private void operateBlockingAnimation() {
        View view = this.mOutsideView;
        if (view == null) {
            return;
        }
        if (!this.mSupportExitBlockingAnimation) {
            view.removeOnAttachStateChangeListener(this.mOnAttatchStateChangeListener);
            return;
        }
        if (this.mOSDKComputeListener == null) {
            this.mOSDKComputeListener = new ViewTreeObserver.OnComputeInternalInsetsListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.6
                public void onComputeInternalInsets(ViewTreeObserver.InternalInsetsInfo internalInsetsInfo) {
                    internalInsetsInfo.setTouchableInsets(ViewTreeObserver.InternalInsetsInfo.TOUCHABLE_INSETS_REGION);
                    if (!COUIBottomSheetDialog.this.mIsExecutingDismissAnim) {
                        internalInsetsInfo.getTouchableRegion().set(0, 0, COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getRootView().getWidth(), COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getRootView().getHeight());
                    } else {
                        COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getGlobalVisibleRect(COUIBottomSheetDialog.this.mTemtRect);
                        internalInsetsInfo.getTouchableRegion().set(COUIBottomSheetDialog.this.mTemtRect);
                    }
                }
            };
        }
        if (this.mOnAttatchStateChangeListener == null) {
            this.mOnAttatchStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.7
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    COUIBottomSheetDialog.this.addOSDKViewTreeObserver();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NonNull View view2) {
                    COUIBottomSheetDialog.this.removeOSDKViewTreeObserver();
                }
            };
        }
        this.mOutsideView.addOnAttachStateChangeListener(this.mOnAttatchStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void outsideAlphaChange(float f, boolean z) {
        View view;
        View viewFindFocus;
        InputMethodManager inputMethodManager;
        float f2 = this.mCurrentOutSideAlphaStateHidden;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        float f3 = this.mCurrentOutSideAlphaStateShow;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        float outsideViewAlpha = getOutsideViewAlpha(f);
        this.mCurrentOutsideAlpha = outsideViewAlpha;
        float fMax = z ? f3 + (outsideViewAlpha * (1.0f - f3)) : Math.max(0.0f, 1.0f - outsideViewAlpha) * f2;
        View view2 = this.mOutsideView;
        if (view2 != null) {
            view2.setAlpha(fMax);
        }
        boolean z2 = isFollowHand() || isFadeInCenterAllState() || shouldHandlePanelUpdateNavBarColor();
        if (this.mOutsideView != null && COUIPanelMultiWindowUtils.isVirtualNavigation(getContext()) && z2 && !this.mIsInTinyScreen) {
            setNavigationBarColorAlpha(fMax);
        } else if (this.mCouiPanelEdgeToEdgeEnable && (view = this.mNavigationCustomView) != null) {
            if (!this.mIsEntering) {
                f = Math.max(0.0f, 1.0f - f);
            }
            view.setAlpha(f);
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout == null || !this.mIsNeedShowKeyboard || (viewFindFocus = cOUIPanelContentLayout.findFocus()) == null || !z || (inputMethodManager = this.mInputMethodManager) == null) {
            return;
        }
        inputMethodManager.showSoftInput(viewFindFocus, 0);
    }

    private void refreshColorMask() {
        int color = getContext().getResources().getColor(com.support.appcompat.R$color.coui_color_mask);
        this.mColorMask = color;
        this.mOutsideViewBackgroundAlpha = Color.alpha(color);
    }

    private void refreshParams() {
        if (COUIPanelMultiWindowUtils.isVirtualNavigation(getContext())) {
            return;
        }
        resetParentViewStyle(getContext().getResources().getConfiguration());
        resetNavigationBarColor();
    }

    private void registerApplicationConfigChangeListener() {
        getContext().registerComponentCallbacks(this.mComponentCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 33)
    public void registerBackCallback(@NonNull View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            pj2.c(TAG, "OnBackInvokedDispatcher is null！");
            return;
        }
        OnBackInvokedCallback onBackInvokedCallback = this.mOnBackInvokedCallback;
        if (onBackInvokedCallback != null) {
            try {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            } catch (Exception e2) {
                pj2.c(TAG, "unregisterOnBackInvokedCallback fail: " + e2.getMessage());
            }
            this.mOnBackInvokedCallback = null;
        }
        OnBackInvokedCallback onBackInvokedCallback2 = new OnBackInvokedCallback() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.31
            public void onBackInvoked() {
                if (COUIBottomSheetDialog.this.mOnBackInvokedLocalListener != null) {
                    COUIBottomSheetDialog.this.mOnBackInvokedLocalListener.onBackInvokedLocal();
                } else {
                    COUIBottomSheetDialog.this.onBackPressed();
                }
            }
        };
        this.mOnBackInvokedCallback = onBackInvokedCallback2;
        try {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback2);
        } catch (Exception e3) {
            pj2.c(TAG, "registerOnBackInvokedCallback fail: " + e3.getMessage());
        }
    }

    private void registerBehaviorPullUpListener() {
        if (getBehavior() instanceof COUIBottomSheetBehavior) {
            this.mPanelPullUpListener = this.mCanPullUp ? getPanelPullUpListener() : null;
            ((COUIBottomSheetBehavior) getBehavior()).setPullUpListener(this.mPanelPullUpListener);
        }
    }

    private void registerPreDrawListener() {
        View view = this.mOutsideView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
    }

    private void registerPullUpToDismissPanelListener() {
        if (getBehavior() instanceof COUIBottomSheetBehavior) {
            ((COUIBottomSheetBehavior) getBehavior()).setPullUpToDismissPanelListener(this.mPullUpToDismissPanelListener);
        }
    }

    private void releaseApplicationConfigChangeListener() {
        if (this.mComponentCallbacks != null) {
            getContext().unregisterComponentCallbacks(this.mComponentCallbacks);
        }
    }

    private void releaseApplyWindowInsetsListener() {
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
            this.mWindowInsetsListener = null;
        }
    }

    private void releaseBehaviorPullUpListener() {
        if (getBehavior() instanceof COUIBottomSheetBehavior) {
            ((COUIBottomSheetBehavior) getBehavior()).setPullUpListener(null);
            this.mPanelPullUpListener = null;
        }
    }

    private void releasePullUpToDismissPanelListener() {
        if (getBehavior() instanceof COUIBottomSheetBehavior) {
            ((COUIBottomSheetBehavior) getBehavior()).setPullUpToDismissPanelListener(null);
        }
    }

    private void releaseResizeHelper() {
        COUIPanelAdjustResizeHelper cOUIPanelAdjustResizeHelper = this.mAdjustResizeHelper;
        if (cOUIPanelAdjustResizeHelper != null) {
            cOUIPanelAdjustResizeHelper.releaseData();
            this.mAdjustResizeHelper = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOSDKViewTreeObserver() {
        ViewTreeObserver viewTreeObserver = this.mOSDKViewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnComputeInternalInsetsListener(this.mOSDKComputeListener);
            this.mOSDKViewTreeObserver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOnPreDrawListener() {
        View view = this.mOutsideView;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
    }

    private void resetAnimationFlag() {
        this.mAnimationFlag = 0;
    }

    private void resetNavigationBarColor() {
        setNavigationBarColor(getNavColor());
    }

    private void resetParentViewStyle(Configuration configuration) {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout == null) {
            return;
        }
        COUIViewMarginUtil.setMargin(cOUIPanelPercentFrameLayout, 3, 0);
    }

    private void resetWindowImeAnimFlags() {
        this.mAdjustResizeEnable = true;
        int i = 0;
        this.mIsNeedShowKeyboard = false;
        Window window = getWindow();
        getAdjustResizeHelper().setWindowType(window.getAttributes().type);
        int i2 = window.getAttributes().softInputMode & 15;
        if (i2 != 5 || isInMultiWindowMode() || this.mIsInWindowFloatingMode) {
            i = i2;
        } else {
            this.mIsNeedShowKeyboard = true;
        }
        window.setSoftInputMode(Build.VERSION.SDK_INT <= 29 ? i | 16 : i | 48);
    }

    static int resolveDialogTheme(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.couiBottomSheetDialogStyle, typedValue, true);
        return typedValue.resourceId;
    }

    private void restoreScreenWidth() {
        if (this.mOriginWidth == -1) {
            return;
        }
        try {
            Resources resources = getContext().getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.screenWidthDp = this.mOriginWidth;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Log.d(TAG, "restoreScreenWidth : PreferWidth=" + this.mPreferWidth + " ,OriginWidth=" + this.mOriginWidth);
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout != null) {
                cOUIPanelPercentFrameLayout.delPreferWidth();
            }
        } catch (Exception unused) {
            Log.d(TAG, "restoreScreenWidth : failed to updateConfiguration");
        }
    }

    private boolean reversalAnimation(final Animator.AnimatorListener animatorListener, boolean z) {
        b bVar;
        b bVar2 = this.mTranslationAndScaleSpringAnimation;
        if (bVar2 == null || !bVar2.i() || (bVar = this.mAlphaSpringAnimation) == null || !bVar.i()) {
            return false;
        }
        if (z) {
            this.mTranslationAndScaleSpringAnimation.x(getRevertAnimationFinalPositionToShow());
            this.mAlphaSpringAnimation.x(getRevertAnimationFinalPositionToShow());
        } else {
            float revertAnimationFinalPositionToHide = getRevertAnimationFinalPositionToHide();
            if (this.mDesignBottomSheetFrameLayout.getRatio() == 1.0f) {
                revertAnimationFinalPositionToHide = Math.max(getRevertAnimationFinalPositionToHide(), getTranslationDistance());
            }
            this.mTranslationAndScaleSpringAnimation.x(revertAnimationFinalPositionToHide);
            this.mAlphaSpringAnimation.x(revertAnimationFinalPositionToHide);
            OnAnimationListener onAnimationListener = this.mAnimationListener;
            if (onAnimationListener != null) {
                onAnimationListener.onDismissAnimationStart();
            }
        }
        this.mTranslationAndScaleSpringAnimation.removeEndListener(this.mTranslationAndScaleEndListener);
        COUIDynamicAnimation.q qVar = new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.32
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
            public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z2, float f, float f2) {
                if (z2) {
                    animatorListener.onAnimationCancel(null);
                } else {
                    animatorListener.onAnimationEnd(null);
                }
            }
        };
        this.mTranslationAndScaleEndListener = qVar;
        this.mTranslationAndScaleSpringAnimation.a(qVar);
        return true;
    }

    private void saveActivityContextToGetMultiWindowInfo(Context context) {
        Activity activityC = kjk.c(context);
        if (activityC != null) {
            this.mActivityWeakReference = new WeakReference<>(activityC);
        }
    }

    private void setContentViewLocal(View view) {
        if (this.mIsShowInDialogFragment) {
            super.setContentView(view);
        } else {
            ensureDraggableContentLayout();
            this.mDraggableConstraintLayout.removeContentView();
            this.mDraggableConstraintLayout.addContentView(view);
            super.setContentView(this.mDraggableConstraintLayout);
        }
        this.mContentView = view;
    }

    private void setDefaultSpringStartEndValue() {
        this.mStartValueOfTranslateAnimation = 0.0f;
        this.mEndValueOfTranslateAnimation = 100.0f;
    }

    private void setFocusChangeFalseIfHasnotEdittext() {
        if (this.mFocusChange == null && hasEditText((ViewGroup) getWindow().getDecorView().getRootView())) {
            this.mFocusChange = Boolean.TRUE;
        }
    }

    private void setFrameRate(final ValueAnimator valueAnimator) {
        if (!this.mIsVSdk || this.mDesignBottomSheetFrameLayout == null) {
            return;
        }
        int i = this.mADFRFeatureType;
        if (i == 2) {
            final AnimationVelocityCalculator animationVelocityCalculator = new AnimationVelocityCalculator(valueAnimator);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.mg2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.i.lambda$setFrameRate$0(animationVelocityCalculator, valueAnimator, valueAnimator2);
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.18
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    pj2.a(COUIBottomSheetDialog.TAG, "LEVEL_HIGH_PRECISION onAnimatorEnd: DynamicFrameRateManager.FRAME_RATE_END");
                    DynamicFrameRateManager.setFrameRate(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 10101, -2, (Bundle) null);
                }
            });
        } else if (i == 1) {
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.19
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    pj2.a(COUIBottomSheetDialog.TAG, "LEVEL_LOW_PRECISION onAnimatorEnd: DynamicFrameRateManager.FRAME_RATE_END");
                    DynamicFrameRateManager.setFrameRate(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 10101, -2, (Bundle) null);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    pj2.a(COUIBottomSheetDialog.TAG, "LEVEL_LOW_PRECISION onAnimatorStart: DynamicFrameRateManager.LOW_PRECISION_FRAME_RATE");
                    DynamicFrameRateManager.setFrameRate(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 10101, -1, (Bundle) null);
                }
            });
        } else if (i == 0) {
            pj2.a(TAG, "LEVEL_DEFAULT do nothing");
        }
    }

    private void setNavigation() {
        if (this.mIsGestureNavigation) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 512);
            getWindow().setNavigationBarContrastEnforced(false);
            setNavigationBarColor(0);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    private void setNavigationBarColor(@ColorInt int i) {
        if (unNeedNavigationCustomView()) {
            getWindow().setNavigationBarColor(i);
        } else {
            getWindow().setNavigationBarColor(0);
        }
        setNavigationCustomViewColor(i);
        pj2.a(TAG, "setNavigationBarColor color: " + Integer.toHexString(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationBarColorAlpha(float f) {
        int i = (int) (f * this.mOutsideViewBackgroundAlpha);
        if (i > 0) {
            setNavigationBarColor(Color.argb(i, 0, 0, 0));
        } else {
            setNavigationBarColor(0);
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    private void setNavigationCustomViewColor(@ColorInt int i) {
        View view;
        if (unNeedNavigationCustomView() || (view = this.mNavigationCustomView) == null) {
            return;
        }
        if (this.mCouiPanelEdgeToEdgeEnable) {
            view.setBackground(getNavigationDrawable(i));
        } else {
            view.setBackgroundColor(i);
        }
    }

    private void setNavigationCustomViewHeight(WindowInsets windowInsets) {
        if (unNeedNavigationCustomView() || windowInsets == null || this.mNavigationCustomView == null) {
            return;
        }
        int i = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        this.mNavigationCustomView.getLayoutParams().height = Math.max(0, i);
    }

    private void setPanelHeight() {
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            ViewGroup.LayoutParams layoutParams = cOUIPanelContentLayout.getLayoutParams();
            int i = this.mPanelHeight;
            if (i != 0) {
                layoutParams.height = i;
            }
            this.mDraggableConstraintLayout.setLayoutParams(layoutParams);
        }
        WindowInsets windowInsets = this.mApplyWindowInsets;
        if (windowInsets != null) {
            initMaxHeight(windowInsets);
        }
    }

    private void setPanelWidth() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = cOUIPanelPercentFrameLayout.getLayoutParams();
            int i = this.mPanelWidth;
            if (i != 0) {
                layoutParams.width = i;
            }
            this.mDesignBottomSheetFrameLayout.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPulledUpViewPaddingBottom(int i) {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout;
        if (this.mPulledUpView == null || (cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout) == null) {
            return;
        }
        if (TextUtils.equals(cOUIPanelPercentFrameLayout.getClass().getSimpleName(), this.mPulledUpView.getClass().getSimpleName())) {
            i += this.mPanelPaddingBottom;
        }
        View view = this.mPulledUpView;
        view.setPadding(view.getPaddingLeft(), this.mPulledUpView.getPaddingTop(), this.mPulledUpView.getPaddingRight(), i);
    }

    private void setSpringStartPosition(float f) {
        this.mAppearSpringAnim.setStartValue(f);
    }

    private void setStatusBarTransparentAndFont(Window window) {
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility() | 1024;
        window.setStatusBarColor(0);
        window.addFlags(Integer.MIN_VALUE);
        decorView.setSystemUiVisibility(di2.a(getContext()) ? systemUiVisibility & (-8193) & (-17) : systemUiVisibility | 256);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHandlePanelUpdateNavBarColor() {
        if (this.mIsHandlePanel) {
            return COUIPanelMultiWindowUtils.isNormalLandScreen(getContext(), this.mConfiguration);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldUpdatePanelMarginBottom(WindowInsets windowInsets) {
        int i;
        int i2;
        if (windowInsets == null || this.mApplyWindowInsets == null || this.mDesignBottomSheetFrameLayout == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            i = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
            i2 = this.mApplyWindowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        return (i == i2 && this.mPanelRatio == this.mDesignBottomSheetFrameLayout.getRatio()) ? false : true;
    }

    private void snapToTop() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            this.mSnapStartBottom = cOUIPanelPercentFrameLayout.getBottom();
        }
        this.mIsAppearSpringAnimStared = true;
        this.mAppearSpringAnim.start();
    }

    private void startListeningForBackCallbacks(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (view.isAttachedToWindow()) {
                registerBackCallback(view);
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.30
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        COUIBottomSheetDialog.this.registerBackCallback(view2);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                        view2.removeOnAttachStateChangeListener(this);
                        if (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout != null) {
                            COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                            cOUIBottomSheetDialog.stopListeningForBackCallbacks(cOUIBottomSheetDialog.mDesignBottomSheetFrameLayout);
                        }
                    }
                });
            }
        }
    }

    private void startReleaseAnim(Animator.AnimatorListener animatorListener) {
        if (animatorListener != null) {
            this.mPanelViewTranslationAnimationSet.addListener(animatorListener);
        }
        this.mPanelViewTranslationAnimationSet.start();
    }

    private void startReleaseAnimInTinyScreen(float f, float f2, float f3, Animator.AnimatorListener animatorListener) {
        this.mPanelViewTranslationAnimationSet.playTogether(createPanelTranslateAnimation(f, f2, this.mTranslateHidingDuration, new bk2()), createOutsideAlphaAnimation(false, DEFAULT_ALPHA_HIDING_ANIMATOR_DURATION, new gi2()));
        startReleaseAnim(animatorListener);
    }

    private void startShowingAnim(Animator.AnimatorListener animatorListener) {
        if (animatorListener != null) {
            this.mPanelViewTranslationAnimationSet.addListener(animatorListener);
        }
        this.mPanelViewTranslationAnimationSet.start();
    }

    private void startShowingAnimInTinyScreen(int i, Animator.AnimatorListener animatorListener) {
        this.mPanelViewTranslationAnimationSet.playTogether(createOutsideAlphaAnimation(true, SHOW_HEIGHT_ANIM_DURATION_IN_TINY_SCREEN, (PathInterpolator) OUTSIDE_ALPHA_ANIM_INTERPOLATOR));
        setSpringStartPosition(this.mFirstShowCollapsed ? this.mPeekHeight : getContentViewHeightWithMargins() + i);
        snapToTop();
        startShowingAnim(animatorListener);
    }

    private void stopCurrentRunningViewTranslationAnim() {
        AnimatorSet animatorSet = this.mPanelViewTranslationAnimationSet;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.mIsInterruptingAnim = true;
            this.mPanelViewTranslationAnimationSet.end();
        }
        b bVar = this.mTranslationAndScaleSpringAnimation;
        if (bVar != null && bVar.i()) {
            this.mTranslationAndScaleSpringAnimation.c();
        }
        b bVar2 = this.mAlphaSpringAnimation;
        if (bVar2 != null && bVar2.i()) {
            this.mAlphaSpringAnimation.c();
        }
        if (this.mIsInTinyScreen && this.mIsAppearSpringAnimStared) {
            this.mAppearSpringAnim.cancel();
        }
    }

    private void stopFeedbackAnimation() {
        doi doiVar = this.mDisableFastCloseFeedbackSpring;
        if (doiVar == null || doiVar.g() == 0.0d) {
            return;
        }
        this.mDisableFastCloseFeedbackSpring.l();
        this.mDisableFastCloseFeedbackSpring = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopListeningForBackCallbacks(@NonNull View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null || (onBackInvokedCallback = this.mOnBackInvokedCallback) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        this.mOnBackInvokedCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void superDismiss() {
        if (DEBUG) {
            Log.d(TAG, "superDismiss");
        }
        try {
            this.mIsRevertAnimationFromSettlingAnimation = false;
            super.dismiss();
            OnAnimationListener onAnimationListener = this.mAnimationListener;
            if (onAnimationListener != null) {
                onAnimationListener.onDismissAnimationEnd();
            }
            this.mIsExecutingDismissAnim = false;
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translateUpdate(float f) {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            cOUIPanelPercentFrameLayout.setTranslationY(f);
            if (!this.mIsInterruptingAnim) {
                this.mCurrentParentViewTranslationY = f;
            }
            this.mIsInterruptingAnim = false;
        }
    }

    private boolean unNeedNavigationCustomView() {
        return this.mIsGestureNavigation || Build.VERSION.SDK_INT < 30 || this.mDesignBottomSheetFrameLayout == null;
    }

    private void updateBottomSheetCenterVertical() {
        View view = this.mCoordinatorLayout;
        if (view == null) {
            Log.w(TAG, "updateBottomSheetCenterVertical: directly return for mCoordinatorLayout is null");
            return;
        }
        if (this.mDesignBottomSheetFrameLayout == null) {
            Log.i(TAG, "updateBottomSheetCenterVertical: directly return for mDesignBottomSheetFrameLayout is null");
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = this.mDesignBottomSheetFrameLayout.getLayoutParams();
        int iMax = (int) Math.max(0.0f, ((measuredHeight - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0)) / this.mDesignBottomSheetFrameLayout.getRatio()) - (this.mDesignBottomSheetFrameLayout.getHeight() / this.mDesignBottomSheetFrameLayout.getRatio()));
        if (this.mDesignBottomSheetFrameLayout.getBottom() + iMax <= measuredHeight) {
            this.mDesignBottomSheetFrameLayout.setY(iMax);
        }
    }

    private void updateFitToContents() {
        if (this.mIsHandlePanel) {
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout == null) {
                Log.e(TAG, "updateFitToContents: mDesignBottomSheetFrameLayout is null");
            } else {
                COUIBottomSheetBehavior.from(cOUIPanelPercentFrameLayout).setFitToContents(COUIPanelMultiWindowUtils.isNormalLandScreen(getContext(), this.mConfiguration));
            }
        }
    }

    private void updateListeningForBackCallbacks() {
        if (this.mCancelable) {
            startListeningForBackCallbacks(this.mDesignBottomSheetFrameLayout);
        } else {
            stopListeningForBackCallbacks(this.mDesignBottomSheetFrameLayout);
        }
    }

    private void updatePaddingBottom() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            this.mPanelPaddingBottom = (cOUIPanelPercentFrameLayout.getRatio() > 2.0f ? 1 : (cOUIPanelPercentFrameLayout.getRatio() == 2.0f ? 0 : -1)) == 0 ? 0 : this.mDefaultPaddingBottom;
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout2 = this.mDesignBottomSheetFrameLayout;
            cOUIPanelPercentFrameLayout2.setPaddingRelative(cOUIPanelPercentFrameLayout2.getPaddingStart(), this.mDesignBottomSheetFrameLayout.getPaddingTop(), this.mDesignBottomSheetFrameLayout.getPaddingEnd(), this.mPanelPaddingBottom);
            ((COUIBottomSheetBehavior) getBehavior()).setPanelPaddingBottom(this.mPanelPaddingBottom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePanelMarginBottom(Configuration configuration, WindowInsets windowInsets) {
        if (windowInsets == null || configuration == null || this.mDesignBottomSheetFrameLayout == null) {
            return;
        }
        int panelMarginBottom = COUIPanelMultiWindowUtils.getPanelMarginBottom(getContext(), configuration, windowInsets, this.mIsHandlePanel, this.mCouiPanelEdgeToEdgeEnable);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.mDesignBottomSheetFrameLayout.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin != panelMarginBottom) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = panelMarginBottom;
        }
    }

    public boolean canPullUp() {
        return this.mCanPullUp;
    }

    public void delPreferWidth() {
        restoreScreenWidth();
        this.mPreferWidth = -1;
        this.mOriginWidth = -1;
        Log.d(TAG, "delPreferWidth");
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        stopFeedbackAnimation();
        dismiss(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        COUIPanelContentLayout cOUIPanelContentLayout;
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && (cOUIPanelContentLayout = this.mDraggableConstraintLayout) != null && cOUIPanelContentLayout.mIsTurnOnAnim) {
            cOUIPanelContentLayout.mIsTurnOnAnim = false;
            cOUIPanelContentLayout.dragBgEndAnim();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public COUIPanelAdjustResizeHelper getAdjustResizeHelper() {
        if (this.mAdjustResizeHelper == null) {
            this.mAdjustResizeHelper = new COUIPanelAdjustResizeHelper();
        }
        return this.mAdjustResizeHelper;
    }

    public boolean getCanPerformHapticFeedback() {
        return this.mCanPerformHapticFeedback;
    }

    public Button getCenterButton() {
        if (getWindow() != null) {
            return (Button) getWindow().findViewById(R.id.button3);
        }
        return null;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public int getDialogHeight() {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            return cOUIPanelPercentFrameLayout.getHeight();
        }
        return 0;
    }

    public int getDialogMaxHeight() {
        View view = this.mCoordinatorLayout;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    public COUIPanelContentLayout getDragableLinearLayout() {
        return this.mDraggableConstraintLayout;
    }

    public boolean getIsHandlePanel() {
        return this.mIsHandlePanel;
    }

    public boolean getIsInWindowFloatingMode() {
        return this.mIsInWindowFloatingMode;
    }

    public Button getLeftButton() {
        if (getWindow() != null) {
            return (Button) getWindow().findViewById(R.id.button2);
        }
        return null;
    }

    public float getOutsideViewAlpha(float f) {
        return !this.mIsInTinyScreen ? f : Math.max(0.0f, f - 0.5f) * 2.0f;
    }

    public int getPeekHeight() {
        return this.mPeekHeight;
    }

    public Button getRightButton() {
        if (getWindow() != null) {
            return (Button) getWindow().findViewById(R.id.button1);
        }
        return null;
    }

    @Override // android.app.Dialog
    public void hide() {
        COUIPanelContentLayout cOUIPanelContentLayout;
        if (!this.mIsShowInDialogFragment || (cOUIPanelContentLayout = this.mDraggableConstraintLayout) == null || cOUIPanelContentLayout.findFocus() == null) {
            super.hide();
        }
    }

    public void hideDragView() {
        COUIPanelBarView cOUIPanelBarView = this.mPanelBarView;
        if (cOUIPanelBarView != null) {
            cOUIPanelBarView.setVisibility(4);
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout == null || cOUIPanelContentLayout.getDrawLayout() == null) {
            return;
        }
        setHideDragViewHeight();
        this.mDraggableConstraintLayout.getDrawLayout().setVisibility(4);
        if (this.mDraggableConstraintLayout.getDragBgView() != null) {
            this.mDraggableConstraintLayout.getDragBgView().setVisibility(8);
        }
    }

    public boolean isFirstShowCollapsed() {
        return this.mFirstShowCollapsed;
    }

    public boolean isPanelHeightChangeAnimRunning() {
        return ((COUIBottomSheetBehavior) getBehavior()).isPanelHeightChangeAnimRunning();
    }

    public boolean isSkipCollapsed() {
        return this.mSkipCollapsed;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
    public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.mIsAppearSpringAnimStared = false;
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null && this.mSnapStartBottom != -1) {
            cOUIPanelPercentFrameLayout.layout(cOUIPanelPercentFrameLayout.getLeft(), this.mDesignBottomSheetFrameLayout.getTop(), this.mDesignBottomSheetFrameLayout.getRight(), this.mSnapStartBottom);
        }
        this.mSnapStartBottom = -1;
        BottomSheetDialogAnimatorListener bottomSheetDialogAnimatorListener = this.mBottomSheetDialogAnimatorListener;
        if (bottomSheetDialogAnimatorListener != null) {
            bottomSheetDialogAnimatorListener.onBottomSheetDialogExpanded();
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
    public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout == null || this.mSnapStartBottom == -1) {
            return;
        }
        if (f < 0.0f) {
            cOUIPanelPercentFrameLayout.layout(cOUIPanelPercentFrameLayout.getLeft(), this.mDesignBottomSheetFrameLayout.getTop(), this.mDesignBottomSheetFrameLayout.getRight(), (int) (this.mSnapStartBottom - f));
        }
        this.mDesignBottomSheetFrameLayout.setTranslationY(f);
        if (!this.mIsInterruptingAnim) {
            this.mCurrentParentViewTranslationY = this.mDesignBottomSheetFrameLayout.getTranslationY();
        }
        this.mIsInterruptingAnim = false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enforceChangeScreenWidth();
        refreshParams();
        resetWindowImeAnimFlags();
        setStatusBarTransparentAndFont(getWindow());
        registerPreDrawListener();
        registerApplicationConfigChangeListener();
        registerBehaviorPullUpListener();
        registerPullUpToDismissPanelListener();
        initWindowInsetsListener();
        setNavigation();
        if (this.mDesignBottomSheetFrameLayout != null) {
            updateListeningForBackCallbacks();
        }
        if (this.mIsExecutingDismissAnim) {
            return;
        }
        updatePanelMarginBottom(this.mConfiguration, this.mApplyWindowInsets);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        WeakReference<Activity> weakReference = this.mActivityWeakReference;
        if (weakReference != null && weakReference.get() != null && this.mIsExecutingDismissAnim) {
            this.mActivityWeakReference.get().onBackPressed();
        }
        super.onBackPressed();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mConfiguration = getContext().getResources().getConfiguration();
        int identifier = getContext().getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            this.mStatusBarHeight = getContext().getResources().getDimensionPixelSize(identifier);
        }
        if (this.mIsInTinyScreen) {
            initPhysics();
        }
        initBehavior();
        initWindow();
        initDraggableConstraintLayoutSize();
        if (this.mFrameRate && pn2.b(34, 10)) {
            this.mADFRFeatureType = DynamicFrameRateManager.getDynamicFrameRateType();
            this.mIsVSdk = true;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        releaseResizeHelper();
        releaseApplyWindowInsetsListener();
        cancelAnim(this.mPanelViewTranslationAnimationSet);
        cancelAnim(this.mTranslationAndScaleSpringAnimation);
        cancelAnim(this.mAlphaSpringAnimation);
        releaseApplicationConfigChangeListener();
        releaseBehaviorPullUpListener();
        releasePullUpToDismissPanelListener();
        restoreScreenWidth();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.mFocusChange = Boolean.valueOf(bundle.getBoolean(STATE_FOCUS_CHANGES, getFocusChange()));
        this.mLastStaticState = bundle.getInt(STATE_LAST_STATIC_CHANGES, 3);
        super.onRestoreInstanceState(bundle);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putBoolean(STATE_FOCUS_CHANGES, getFocusChange());
        bundleOnSaveInstanceState.putInt(STATE_LAST_STATIC_CHANGES, this.mLastStaticState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (z) {
            setFocusChangeFalseIfHasnotEdittext();
        }
        super.onWindowFocusChanged(z);
    }

    public void refresh() {
        if (this.mDraggableConstraintLayout == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.COUIBottomSheetDialog, 0, R$style.DefaultBottomSheetDialog);
        this.mPanelDragViewDrawable = getTypedArrayDrawable(typedArrayObtainStyledAttributes, R$styleable.COUIBottomSheetDialog_panelDragViewIcon, R$drawable.coui_panel_drag_view);
        this.mPanelDragViewDrawableTintColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIBottomSheetDialog_panelDragViewTintColor, zh2.a(getContext(), com.support.appcompat.R$attr.couiColorControls));
        this.mPanelBackground = getTypedArrayDrawable(typedArrayObtainStyledAttributes, R$styleable.COUIBottomSheetDialog_panelBackground, R$drawable.coui_default_panel_bg_without_shadow);
        this.mPanelBackgroundTintColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIBottomSheetDialog_panelBackgroundTintColor, zh2.a(getContext(), com.support.appcompat.R$attr.couiColorSurface));
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = this.mPanelDragViewDrawable;
        if (drawable != null && this.mDraggableConstraintLayout != null) {
            drawable.setTint(this.mPanelDragViewDrawableTintColor);
            this.mDraggableConstraintLayout.setDragViewDrawable(this.mPanelDragViewDrawable);
            this.mDraggableConstraintLayout.refresh();
        }
        if (this.mPanelBackground == null || this.mDraggableConstraintLayout == null) {
            return;
        }
        if (getWindow() != null && !COUINavigationBarUtil.isGestureNavigation(getContext())) {
            setNavigationBarColor(getNavColor());
        }
        this.mPanelBackground.setTint(this.mPanelBackgroundTintColor);
        this.mDraggableConstraintLayout.setBackground(this.mIsShowInDialogFragment ? this.mPanelBackground : null);
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            cOUIPanelPercentFrameLayout.setBackground(this.mPanelBackground);
        }
    }

    public void setAnchorView(View view) {
        if (view != null) {
            Log.e(TAG, "setAnchorView: ---------");
            this.mAnchorView = view;
            getBehavior().setDraggable(false);
        }
    }

    public void setAnimationListener(OnAnimationListener onAnimationListener) {
        this.mAnimationListener = onAnimationListener;
    }

    public void setBottomButtonBar(boolean z, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, String str3, View.OnClickListener onClickListener3) {
        ensureDraggableContentLayout();
        this.mDraggableConstraintLayout.setUpBottomBar(z, str, onClickListener, str2, onClickListener2, str3, onClickListener3);
    }

    public void setBottomSheetDialogAnimatorListener(BottomSheetDialogAnimatorListener bottomSheetDialogAnimatorListener) {
        this.mBottomSheetDialogAnimatorListener = bottomSheetDialogAnimatorListener;
    }

    public void setCanPerformHapticFeedback(boolean z) {
        this.mCanPerformHapticFeedback = z;
    }

    public void setCanPullUp(boolean z) {
        if (this.mCanPullUp != z) {
            this.mCanPullUp = z;
            if (getBehavior() instanceof COUIBottomSheetBehavior) {
                this.mPanelPullUpListener = this.mCanPullUp ? getPanelPullUpListener() : null;
                ((COUIBottomSheetBehavior) getBehavior()).setPullUpListener(this.mPanelPullUpListener);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.mCancelable != z) {
            this.mCancelable = z;
            if (this.mDesignBottomSheetFrameLayout == null || getWindow() == null) {
                return;
            }
            updateListeningForBackCallbacks();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.mCancelable) {
            this.mCancelable = true;
            if (this.mDesignBottomSheetFrameLayout != null && getWindow() != null) {
                startListeningForBackCallbacks(this.mDesignBottomSheetFrameLayout);
            }
        }
        this.mCanceledOnTouchOutside = z;
    }

    public void setCenterButton(String str, View.OnClickListener onClickListener) {
        ensureDraggableContentLayout();
        this.mDraggableConstraintLayout.setCenterButton(str, onClickListener);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null));
    }

    public void setCouiPanelEdgeToEdgeEnable(boolean z) {
        if (this.mCouiPanelEdgeToEdgeEnable != z) {
            this.mCouiPanelEdgeToEdgeEnable = z;
            initPeekHeight();
            getAdjustResizeHelper().setCouiPanelEdgeToEdgeEnable(this.mCouiPanelEdgeToEdgeEnable);
        }
    }

    public void setDialogOffsetListener(DialogOffsetListener dialogOffsetListener) {
        this.mDialogOffsetListener = dialogOffsetListener;
    }

    public void setDisableSubExpand(boolean z) {
        this.mDisableSubExpand = z;
    }

    public void setDragableLinearLayout(COUIPanelContentLayout cOUIPanelContentLayout) {
        setDragableLinearLayout(cOUIPanelContentLayout, false);
    }

    public void setDraggable(boolean z) {
        if (this.mIsDraggable != z) {
            this.mIsDraggable = z;
            getBehavior().setDraggable(this.mIsDraggable);
        }
    }

    @Deprecated
    public void setExecuteNavColorAnimAfterDismiss(boolean z) {
        this.mIsExecuteNavColorAnimAfterDismiss = z;
    }

    @Deprecated
    public void setFinalNavColorAfterDismiss(@ColorInt int i) {
        this.mFinalNavColorAfterDismiss = i;
    }

    public void setFirstShowCollapsed(boolean z) {
        this.mFirstShowCollapsed = z;
    }

    public void setFollowWindowChange(boolean z) {
        this.mFocusChange = Boolean.valueOf(z);
    }

    public void setGlobalDrag(boolean z) {
        this.mGlobalDrag = z;
    }

    public void setHandleViewHasPressAnim(boolean z) {
        if (this.mHandleViewHasPressAnim != z) {
            this.mHandleViewHasPressAnim = z;
            COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
            if (cOUIPanelContentLayout == null) {
                return;
            }
            if (z) {
                cOUIPanelContentLayout.setDragViewPressAnim(true);
            } else {
                cOUIPanelContentLayout.removeDragViewPressAnim();
            }
        }
    }

    public void setHeight(int i) {
        this.mPanelHeight = i;
        setPanelHeight();
    }

    public void setHeightChangeAnim(boolean z) {
        ((COUIBottomSheetBehavior) getBehavior()).setHeightChangeAnim(z);
    }

    public void setHideDragViewHeight(int i) {
        COUIPanelContentLayout cOUIPanelContentLayout;
        this.mHideDragViewHeight = i;
        if (this.mIsHandlePanel || (cOUIPanelContentLayout = this.mDraggableConstraintLayout) == null || cOUIPanelContentLayout.getDrawLayout() == null) {
            return;
        }
        setHideDragViewHeight();
    }

    public void setIsHandlePanel(boolean z) {
        if (this.mIsHandlePanel != z) {
            this.mIsHandlePanel = z;
            if (this.mDraggableConstraintLayout == null) {
                return;
            }
            if (z) {
                showDragView();
            } else {
                hideDragView();
            }
        }
    }

    public void setIsInTinyScreen(boolean z, boolean z2) {
        this.mIsInTinyScreen = z;
        this.mIsFullScreenInTinyScreen = z2;
    }

    public void setIsInWindowFloatingMode(boolean z) {
        this.mIsInWindowFloatingMode = z;
    }

    public void setIsNeedOutsideViewAnim(boolean z) {
        this.mIsNeedOutsideViewAnim = z;
    }

    public void setIsShowInMaxHeight(boolean z) {
        this.mIsShowInMaxHeight = z;
        int i = z ? -1 : -2;
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            cOUIPanelContentLayout.setLayoutAtMaxHeight(z);
        }
        COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
        if (cOUIPanelPercentFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = cOUIPanelPercentFrameLayout.getLayoutParams();
            layoutParams.height = i;
            this.mDesignBottomSheetFrameLayout.setLayoutParams(layoutParams);
            ((COUIBottomSheetBehavior) getBehavior()).setLayoutAtMaxHeight(this.mIsShowInMaxHeight);
        }
    }

    public void setLeftButton(String str, View.OnClickListener onClickListener) {
        ensureDraggableContentLayout();
        this.mDraggableConstraintLayout.setLeftButton(str, onClickListener);
    }

    public void setNavColor(@ColorInt int i) {
        this.mNavColor = i;
        if (getWindow() != null) {
            setNavigationBarColor(getNavColor());
        }
    }

    public void setOnBackInvokedLocalListener(OnBackInvokedLocalListener onBackInvokedLocalListener) {
        this.mOnBackInvokedLocalListener = onBackInvokedLocalListener;
    }

    public void setOnPanelHeightChangeAnimListener(COUIBottomSheetBehavior.OnPanelHeightChangeAnimListener onPanelHeightChangeAnimListener) {
        ((COUIBottomSheetBehavior) getBehavior()).setOnPanelHeightChangeAnimListener(onPanelHeightChangeAnimListener);
    }

    public void setOutSideViewTouchListener(View.OnTouchListener onTouchListener) {
        if (this.mOutsideView == null) {
            this.mOutsideView = findViewById(com.support.panel.R$id.panel_outside);
        }
        this.mOutSideViewTouchListener = onTouchListener;
        View view = this.mOutsideView;
        if (view != null) {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public void setOutsideMaskColor(int i) {
        View view = this.mOutsideView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setPanelBackground(Drawable drawable) {
        if (this.mDesignBottomSheetFrameLayout == null || drawable == null || this.mPanelBackground == drawable) {
            return;
        }
        this.mPanelBackground = drawable;
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            if (!this.mIsShowInDialogFragment) {
                drawable = null;
            }
            cOUIPanelContentLayout.setBackground(drawable);
        }
        this.mDesignBottomSheetFrameLayout.setBackground(this.mPanelBackground);
    }

    public void setPanelBackgroundTintColor(int i) {
        if (this.mDesignBottomSheetFrameLayout == null || this.mPanelBackground == null || this.mPanelBackgroundTintColor == i) {
            return;
        }
        this.mPanelBackgroundTintColor = i;
        if (getWindow() != null && !COUINavigationBarUtil.isGestureNavigation(getContext())) {
            setNavigationBarColor(getNavColor());
        }
        this.mPanelBackground.setTint(this.mPanelBackgroundTintColor);
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout != null) {
            cOUIPanelContentLayout.setBackground(this.mIsShowInDialogFragment ? this.mPanelBackground : null);
        }
        this.mDesignBottomSheetFrameLayout.setBackground(this.mPanelBackground);
    }

    public void setPanelBarViewColor(int i) {
        COUIPanelBarView cOUIPanelBarView = this.mPanelBarView;
        if (cOUIPanelBarView != null) {
            cOUIPanelBarView.setBarColor(i);
        }
    }

    public void setPanelDismissTranslateDuration(float f) {
        this.mTranslateHidingDuration = f;
    }

    public void setPanelDragViewDrawable(Drawable drawable) {
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout == null || drawable == null || this.mPanelDragViewDrawable == drawable) {
            return;
        }
        this.mPanelDragViewDrawable = drawable;
        cOUIPanelContentLayout.setDragViewDrawable(drawable);
    }

    public void setPanelDragViewDrawableTintColor(int i) {
        Drawable drawable;
        if (this.mDraggableConstraintLayout == null || (drawable = this.mPanelDragViewDrawable) == null || this.mPanelDragViewDrawableTintColor == i) {
            return;
        }
        this.mPanelDragViewDrawableTintColor = i;
        drawable.setTint(i);
        this.mDraggableConstraintLayout.setDragViewDrawable(this.mPanelDragViewDrawable);
    }

    public void setPeekHeight(int i) {
        this.mPeekHeight = i;
    }

    public void setPhysicsParams(float f, float f2) {
        this.mAppearStiffness = f;
        this.mAppearDampingRatio = f2;
    }

    public void setPreferWidth(int i) {
        this.mPreferWidth = i;
        Log.d(TAG, "setPreferWidth =：" + this.mPreferWidth);
    }

    public void setRegisterConfigurationChangeCallBack(boolean z) {
        this.mRegisterConfigurationChangeCallBack = z;
    }

    public void setRightButton(String str, View.OnClickListener onClickListener) {
        ensureDraggableContentLayout();
        this.mDraggableConstraintLayout.setRightButton(str, onClickListener);
    }

    public void setShouldRegisterWindowInsetsListener(boolean z) {
        this.mShouldRegisterWindowInsetsListener = z;
    }

    void setShowInDialogFragment(boolean z) {
        this.mIsShowInDialogFragment = z;
    }

    public void setSkipCollapsed(boolean z) {
        this.mSkipCollapsed = z;
    }

    public void setSupportExitBlockingAnimation(boolean z) {
        if (!pn2.b(34, 10) || this.mSupportExitBlockingAnimation == z) {
            return;
        }
        this.mSupportExitBlockingAnimation = z;
        operateBlockingAnimation();
    }

    public void setWidth(int i) {
        this.mPanelWidth = i;
        setPanelWidth();
    }

    @Override // android.app.Dialog
    public void show() {
        if (isShowing() && this.mIsExecutingDismissAnim && this.mSupportExitBlockingAnimation) {
            doParentViewTranslationShowingAnim(0, getPanelShowAnimListener());
        } else {
            super.show();
        }
    }

    public void showDragView() {
        COUIPanelBarView cOUIPanelBarView = this.mPanelBarView;
        if (cOUIPanelBarView != null) {
            cOUIPanelBarView.setVisibility(0);
        }
        COUIPanelContentLayout cOUIPanelContentLayout = this.mDraggableConstraintLayout;
        if (cOUIPanelContentLayout == null || cOUIPanelContentLayout.getDrawLayout() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mDraggableConstraintLayout.getDrawLayout().getLayoutParams();
        marginLayoutParams.height = getContext().getResources().getDimensionPixelSize(com.support.panel.R$dimen.coui_panel_drag_view_height);
        marginLayoutParams.topMargin = getContext().getResources().getDimensionPixelSize(com.support.panel.R$dimen.coui_panel_drag_view_shadow_margin_top);
        this.mDraggableConstraintLayout.getDrawLayout().setLayoutParams(marginLayoutParams);
        this.mDraggableConstraintLayout.getDrawLayout().setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T typeCasting(Class<T> cls, Object obj) {
        if (obj == 0 || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    public boolean updateFollowHandPanelLocation() {
        if (this.mDesignBottomSheetFrameLayout == null) {
            Log.e(TAG, "update follow hand panel while config change error.");
            return false;
        }
        boolean zIsFollowHand = isFollowHand();
        this.mDesignBottomSheetFrameLayout.setHasAnchor(zIsFollowHand);
        boolean zHaveEnoughSpace = haveEnoughSpace();
        if (zIsFollowHand && zHaveEnoughSpace) {
            this.mOutsideView.setAlpha(0.0f);
            this.mCurrentOutsideAlpha = 0.0f;
            offsetViewTo();
            return true;
        }
        updateBottomSheetCenterVertical();
        this.mDesignBottomSheetFrameLayout.setElevation(0.0f);
        this.mOutsideView.setAlpha(1.0f);
        this.mCurrentOutsideAlpha = 1.0f;
        this.mDesignBottomSheetFrameLayout.setTranslationY(0.0f);
        this.mDesignBottomSheetFrameLayout.setTranslationX(0.0f);
        return true;
    }

    public void updateLayoutWhileConfigChange(@NonNull Configuration configuration) {
        refreshColorMask();
        enforceChangeScreenWidth(configuration);
        this.mConfiguration = configuration;
        this.mIsGestureNavigation = COUINavigationBarUtil.isGestureNavigation(getContext());
        getAdjustResizeHelper().resetInnerStatus();
        if (this.mDesignBottomSheetFrameLayout != null) {
            largeScreenLimitMaxSize();
            this.mDesignBottomSheetFrameLayout.updateLayoutWhileConfigChange(configuration);
            if (!this.mIsHandlePanel || COUIPanelMultiWindowUtils.isNormalScreen(getContext(), this.mConfiguration)) {
                resetNavigationBarColor();
            }
            setNavigation();
            this.mPanelRatio = this.mDesignBottomSheetFrameLayout.getRatio();
        }
        updateFitToContents();
        updatePaddingBottom();
        initCoordinateInsets(this.mApplyWindowInsets);
        if (this.mIsExecutingDismissAnim) {
            return;
        }
        updatePanelMarginBottom(this.mConfiguration, this.mApplyWindowInsets);
    }

    public COUIBottomSheetDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, R$style.DefaultBottomSheetDialog);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        if (view == null) {
            throw new IllegalArgumentException("ContentView can't be null");
        }
        gn2.i().b(getContext());
        setContentViewLocal(view);
        initView();
    }

    public void setDragableLinearLayout(COUIPanelContentLayout cOUIPanelContentLayout, boolean z) {
        this.mDraggableConstraintLayout = cOUIPanelContentLayout;
        if (!this.mIsHandlePanel) {
            hideDragView();
        }
        if (cOUIPanelContentLayout != null) {
            this.mPulledUpView = (ViewGroup) this.mDraggableConstraintLayout.getParent();
            cOUIPanelContentLayout.setLayoutAtMaxHeight(this.mIsShowInMaxHeight);
            if (this.mHandleViewHasPressAnim) {
                cOUIPanelContentLayout.setDragViewPressAnim(true);
            }
            cOUIPanelContentLayout.setDragViewDrawable(this.mPanelDragViewDrawable);
        }
        if (z) {
            refresh();
        } else if (cOUIPanelContentLayout != null) {
            WindowInsets windowInsets = this.mApplyWindowInsets;
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            cOUIPanelContentLayout.setNavigationMargin(null, windowInsets, cOUIPanelPercentFrameLayout != null && cOUIPanelPercentFrameLayout.getRatio() == 1.0f, this.mCouiPanelEdgeToEdgeEnable);
        }
        initDraggableConstraintLayoutSize();
    }

    private void cancelAnim(b bVar) {
        if (bVar == null || !bVar.i()) {
            return;
        }
        bVar.c();
    }

    public void dismiss(boolean z) {
        if (isShowing() && z && !this.mIsExecutingDismissAnim) {
            hideKeyboard();
            if (getBehavior().getState() != 5) {
                dismissWithInterruptibleAnim();
                return;
            }
            return;
        }
        superDismiss();
    }

    private void setHideDragViewHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mDraggableConstraintLayout.getDrawLayout().getLayoutParams();
        int i = this.mHideDragViewHeight;
        if (i > 0) {
            marginLayoutParams.height = i;
        } else {
            marginLayoutParams.height = getContext().getResources().getDimensionPixelSize(com.support.panel.R$dimen.coui_panel_drag_view_hide_height);
        }
        marginLayoutParams.topMargin = 0;
        this.mDraggableConstraintLayout.getDrawLayout().setLayoutParams(marginLayoutParams);
    }

    public COUIBottomSheetDialog(@NonNull Context context, @StyleRes int i, float f, float f2) {
        this(context, i);
        this.mPhysicsFrequency = f;
        this.mPhysicsDampingRatio = f2;
    }

    public COUIBottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, resolveDialogTheme(context, i));
        this.mTemtRect = new Rect();
        this.mHandleViewHasPressAnim = true;
        this.mIsShowInDialogFragment = false;
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.mCanPullUp = true;
        this.mCurrentSpringTotalOffset = 0;
        this.mCoordinatorLayoutMinInsetsTop = 0;
        this.mCoordinatorLayoutPaddingExtra = 0;
        this.mPeekHeight = 0;
        this.mSkipCollapsed = true;
        this.mFirstShowCollapsed = false;
        this.mCurrentParentViewTranslationY = 0.0f;
        this.mCurrentOutsideAlpha = 0.0f;
        this.mIsInterruptingAnim = false;
        this.mWindowInsetsListener = null;
        this.mPanelPullUpListener = null;
        this.mNavColor = Integer.MAX_VALUE;
        this.mWindowInsetsAnimEnable = false;
        this.mIsInWindowFloatingMode = false;
        this.mCanPerformHapticFeedback = false;
        this.mRegisterConfigurationChangeCallBack = true;
        this.mIsNeedShowKeyboard = false;
        this.mIsNeedOutsideViewAnim = true;
        this.mFocusChange = null;
        this.mIsDraggable = true;
        this.mTranslateHidingDuration = DEFAULT_TRANSLATE_HIDING_ANIMATOR_DURATION;
        this.mPanelBarView = null;
        this.mBottomSheetDialogAnimatorListener = null;
        this.mDisableSubExpand = false;
        this.mGlobalDrag = true;
        this.mPhysicsFrequency = Float.MIN_VALUE;
        this.mPhysicsDampingRatio = Float.MIN_VALUE;
        this.mAnchorView = null;
        this.mStatusBarHeight = 0;
        this.mSnapStartBottom = -1;
        this.mAppearStiffness = Float.MIN_VALUE;
        this.mAppearDampingRatio = Float.MIN_VALUE;
        this.mIsAppearSpringAnimStared = false;
        this.mShouldRegisterWindowInsetsListener = true;
        this.mPreferWidth = -1;
        this.mOriginWidth = -1;
        this.isLargeScreenLimitMaxSize = false;
        this.mIsHandlePanel = false;
        this.mIsGestureNavigation = true;
        this.mHideDragViewHeight = 0;
        this.mFrameRate = true;
        this.mAnimationFlag = 0;
        this.mCurrentOutSideAlphaStateHidden = 0.0f;
        this.mCurrentOutSideAlphaStateShow = 0.0f;
        this.mPullUpToDismissPanelListener = new COUIBottomSheetBehavior.PullUpToDismissPanelListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.1
            @Override // com.coui.appcompat.panel.COUIBottomSheetBehavior.PullUpToDismissPanelListener
            public void onPullUpDismiss() {
                COUIBottomSheetDialog.this.dismissWithAlphaAnim();
            }
        };
        this.mIsAnimationInFirst = false;
        this.mOnAttatchStateChangeListener = null;
        this.mLastStaticState = 3;
        this.mPanelRatio = 1.0f;
        this.mComponentCallbacks = new ComponentCallbacks() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(@NonNull Configuration configuration) {
                if (COUIBottomSheetDialog.this.mRegisterConfigurationChangeCallBack) {
                    COUIBottomSheetDialog.this.updateLayoutWhileConfigChange(configuration);
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }
        };
        this.mOnPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.26
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                COUIBottomSheetDialog.this.removeOnPreDrawListener();
                if (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout == null) {
                    COUIBottomSheetDialog cOUIBottomSheetDialog = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog.doParentViewTranslationShowingAnim(0, cOUIBottomSheetDialog.getPanelShowAnimListener());
                    return true;
                }
                int contentViewHeightWithMargins = COUIBottomSheetDialog.this.getContentViewHeightWithMargins();
                if (COUIBottomSheetDialog.this.mFirstShowCollapsed) {
                    contentViewHeightWithMargins = COUIBottomSheetDialog.this.mPeekHeight;
                }
                COUIPanelContentLayout cOUIPanelContentLayout = COUIBottomSheetDialog.this.mDraggableConstraintLayout;
                if ((cOUIPanelContentLayout == null || cOUIPanelContentLayout.findFocus() == null) && !COUIBottomSheetDialog.this.isFollowHand() && !COUIBottomSheetDialog.this.isFadeInCenter()) {
                    COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.setTranslationY(contentViewHeightWithMargins);
                }
                COUIBottomSheetDialog.this.mOutsideView.setAlpha(0.0f);
                if (COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout.getRatio() == 2.0f) {
                    COUIBottomSheetDialog cOUIBottomSheetDialog2 = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog2.doParentViewTranslationShowingAnim(cOUIBottomSheetDialog2.mCoordinatorLayout.getHeight() / 2, COUIBottomSheetDialog.this.getPanelShowAnimListener());
                } else {
                    COUIBottomSheetDialog cOUIBottomSheetDialog3 = COUIBottomSheetDialog.this;
                    cOUIBottomSheetDialog3.doParentViewTranslationShowingAnim(0, cOUIBottomSheetDialog3.getPanelShowAnimListener());
                }
                COUIBottomSheetDialog cOUIBottomSheetDialog4 = COUIBottomSheetDialog.this;
                cOUIBottomSheetDialog4.mPanelRatio = cOUIBottomSheetDialog4.mDesignBottomSheetFrameLayout.getRatio();
                return true;
            }
        };
        initThemeResources(i);
        initValueResources();
        saveActivityContextToGetMultiWindowInfo(context);
    }

    private void setFrameRate(b bVar) {
        if (!this.mIsVSdk || this.mDesignBottomSheetFrameLayout == null) {
            return;
        }
        int i = this.mADFRFeatureType;
        if (i == 2) {
            bVar.b(new COUIDynamicAnimation.r() { // from class: com.oplus.aiunit.vision.lg2
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.lambda$setFrameRate$1(cOUIDynamicAnimation, f, f2);
                }
            });
            bVar.a(new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.20
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
                public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                    pj2.a(COUIBottomSheetDialog.TAG, "COUISpringAnimation LEVEL_HIGH_PRECISION onAnimatorEnd: DynamicFrameRateManager.FRAME_RATE_END");
                    DynamicFrameRateManager.setFrameRate(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 10101, -2, (Bundle) null);
                }
            });
        } else if (i == 1) {
            pj2.a(TAG, "COUISpringAnimation LEVEL_LOW_PRECISION onAnimatorStart: DynamicFrameRateManager.LOW_PRECISION_FRAME_RATE");
            DynamicFrameRateManager.setFrameRate(this.mDesignBottomSheetFrameLayout, 10101, -1, (Bundle) null);
            bVar.a(new COUIDynamicAnimation.q() { // from class: com.coui.appcompat.panel.COUIBottomSheetDialog.21
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
                public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                    pj2.a(COUIBottomSheetDialog.TAG, "COUISpringAnimation LEVEL_LOW_PRECISION onAnimatorEnd: DynamicFrameRateManager.FRAME_RATE_END");
                    DynamicFrameRateManager.setFrameRate(COUIBottomSheetDialog.this.mDesignBottomSheetFrameLayout, 10101, -2, (Bundle) null);
                }
            });
        } else if (i == 0) {
            pj2.a(TAG, "COUISpringAnimation LEVEL_DEFAULT do nothing");
        }
    }

    public void doFeedbackAnimation() {
        if (this.mDesignBottomSheetFrameLayout != null) {
            AnimatorSet animatorSet = this.mPanelViewTranslationAnimationSet;
            if (animatorSet == null || !animatorSet.isRunning()) {
                b bVar = this.mTranslationAndScaleSpringAnimation;
                if (bVar == null || !bVar.i()) {
                    doFeedbackAnimation(this.mDesignBottomSheetFrameLayout);
                }
            }
        }
    }

    private void enforceChangeScreenWidth(Configuration configuration) {
        if (this.mPreferWidth == -1) {
            return;
        }
        try {
            Resources resources = getContext().getResources();
            this.mOriginWidth = configuration.screenWidthDp;
            configuration.screenWidthDp = this.mPreferWidth;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Log.d(TAG, "enforceChangeScreenWidth : OriginWidth=" + this.mOriginWidth + " ,PreferWidth:" + this.mPreferWidth);
            COUIPanelPercentFrameLayout cOUIPanelPercentFrameLayout = this.mDesignBottomSheetFrameLayout;
            if (cOUIPanelPercentFrameLayout != null) {
                cOUIPanelPercentFrameLayout.setPreferWidth(this.mPreferWidth);
            }
        } catch (Exception unused) {
            Log.d(TAG, "enforceChangeScreenWidth : failed to updateConfiguration");
        }
    }

    public void setFrameRate(boolean z) {
        this.mFrameRate = z;
    }
}