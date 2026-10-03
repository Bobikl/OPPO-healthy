package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.ViewGroupUtils;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.ugc;
import com.oplus.aiunit.vision.vhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearToolTips extends PopupWindow {
    public static final int ALIGN_BOTTOM = 128;
    public static final int ALIGN_END = 64;
    public static final int ALIGN_LEFT = 16;
    public static final int ALIGN_RIGHT = 8;
    public static final int ALIGN_START = 32;
    public static final int ANIMATION_DURATION = 300;
    public static final int DEFAULT_ALIGN_DIRECTION = 4;
    public static final int MODE_INFO = 1;
    public static final int MODE_TOOLTIPS = 0;
    private View mAnchor;
    private Interpolator mAnimationInterpolator;
    private Drawable mArrowDownDrawable;
    private Drawable mArrowLeftDrawable;
    private int mArrowOverflow;
    private Drawable mArrowRightDrawable;
    private Drawable mArrowUpDrawable;
    private ImageView mArrowView;
    private ViewGroup mContentContainer;
    private Rect mContentRectOnScreen;
    private TextView mContentTv;
    private final Context mContext;
    private final Point mCoordsOnWindow;
    private boolean mIsDismissing;
    private boolean mLeftOrTop;
    private ViewGroup mMainPanel;
    private int mMode;
    private OnCloseIconClickListener mOnCloseIconClickListener;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private PopupWindow.OnDismissListener mOnPopupWindowDismissListener;
    private View mParent;
    private Rect mParentRectOnScreen;
    private float mPivotX;
    private float mPivotY;
    private ScrollView mScrollView;
    private int mShowDirection;
    private final int[] mTmpCoords;
    private Rect mViewPortOnScreen;
    private Rect mViewportOffset;
    private int[] mWindowLocationOnScreen;

    public interface OnCloseIconClickListener {
        void onCloseIconClick();
    }

    @Deprecated
    public NearToolTips(Window window) {
        this(window, 0);
    }

    private void addIndicator(Rect rect) {
        this.mArrowView = new ImageView(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.mShowDirection;
        if (i == 4 || i == 128) {
            this.mParent.getRootView().getLocationOnScreen(this.mTmpCoords);
            int i2 = this.mTmpCoords[0];
            this.mParent.getRootView().getLocationInWindow(this.mTmpCoords);
            layoutParams.leftMargin = ((rect.centerX() - this.mCoordsOnWindow.x) - (i2 - this.mTmpCoords[0])) - (this.mArrowUpDrawable.getIntrinsicWidth() / 2);
            layoutParams.rightMargin = (getWidth() - layoutParams.leftMargin) - this.mArrowUpDrawable.getIntrinsicWidth();
            if (this.mCoordsOnWindow.y >= rect.top - this.mWindowLocationOnScreen[1]) {
                this.mArrowView.setBackground(this.mArrowUpDrawable);
                this.mLeftOrTop = true;
                layoutParams.topMargin = (this.mMainPanel.getPaddingTop() - this.mArrowUpDrawable.getIntrinsicHeight()) + this.mArrowOverflow;
            } else {
                this.mArrowView.setBackground(this.mArrowDownDrawable);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = (this.mMainPanel.getPaddingBottom() - this.mArrowDownDrawable.getIntrinsicHeight()) + this.mArrowOverflow;
            }
        } else if (i == 16) {
            this.mLeftOrTop = true;
            layoutParams.rightMargin = (this.mMainPanel.getPaddingRight() - this.mArrowRightDrawable.getIntrinsicWidth()) + this.mArrowOverflow;
            layoutParams.leftMargin = (getWidth() - layoutParams.rightMargin) - this.mArrowRightDrawable.getIntrinsicWidth();
            layoutParams.topMargin = (((rect.centerY() - this.mCoordsOnWindow.y) - this.mWindowLocationOnScreen[1]) - (this.mArrowRightDrawable.getIntrinsicHeight() / 2)) - (this.mViewportOffset.top / 2);
            layoutParams.bottomMargin = (getHeight() - layoutParams.topMargin) - this.mArrowRightDrawable.getIntrinsicHeight();
            this.mArrowView.setBackground(this.mArrowRightDrawable);
        } else {
            layoutParams.leftMargin = (this.mMainPanel.getPaddingLeft() - this.mArrowLeftDrawable.getIntrinsicWidth()) + this.mArrowOverflow;
            layoutParams.rightMargin = (getWidth() - layoutParams.leftMargin) - this.mArrowLeftDrawable.getIntrinsicWidth();
            layoutParams.topMargin = (((rect.centerY() - this.mCoordsOnWindow.y) - this.mWindowLocationOnScreen[1]) - (this.mArrowRightDrawable.getIntrinsicHeight() / 2)) - (this.mViewportOffset.top / 2);
            layoutParams.bottomMargin = (getHeight() - layoutParams.topMargin) - this.mArrowRightDrawable.getIntrinsicHeight();
            this.mArrowView.setBackground(this.mArrowLeftDrawable);
        }
        this.mContentContainer.addView(this.mArrowView, layoutParams);
    }

    private void animateEnter() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, this.mPivotX, 1, this.mPivotY);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(this.mAnimationInterpolator);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.7
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.mContentContainer.startAnimation(animationSet);
    }

    private void animateExit() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, this.mPivotX, 1, this.mPivotY);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.setInterpolator(this.mAnimationInterpolator);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.8
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                NearToolTips.this.dismissPopupWindow();
                NearToolTips.this.mIsDismissing = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                NearToolTips.this.mIsDismissing = true;
            }
        });
        this.mContentContainer.startAnimation(animationSet);
    }

    private void calculatePivot() {
        int i = this.mShowDirection;
        if (i != 4) {
            this.mPivotX = i == 16 ? 1.0f : 0.0f;
            this.mPivotY = ((this.mContentRectOnScreen.centerY() - this.mCoordsOnWindow.y) - this.mWindowLocationOnScreen[1]) / getViewportHeight();
            return;
        }
        if ((this.mContentRectOnScreen.centerX() - this.mWindowLocationOnScreen[0]) - this.mCoordsOnWindow.x >= getViewportWidth()) {
            this.mPivotX = 1.0f;
        } else if (getViewportWidth() != 0) {
            int iCenterX = (this.mContentRectOnScreen.centerX() - this.mWindowLocationOnScreen[0]) - this.mCoordsOnWindow.x;
            if (iCenterX <= 0) {
                iCenterX = -iCenterX;
            }
            this.mPivotX = iCenterX / getViewportWidth();
        } else {
            this.mPivotX = 0.5f;
        }
        if (this.mCoordsOnWindow.y >= this.mContentRectOnScreen.top - this.mWindowLocationOnScreen[1]) {
            this.mPivotY = 0.0f;
        } else {
            this.mPivotY = 1.0f;
        }
    }

    private static ViewGroup createContentContainer(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissPopupWindow() {
        super.dismiss();
        unregisterOrientationHandler();
        this.mContentContainer.removeAllViews();
    }

    private int getViewportHeight() {
        int height = getHeight();
        Rect rect = this.mViewportOffset;
        return (height - rect.top) + rect.bottom;
    }

    private int getViewportWidth() {
        int width = getWidth();
        Rect rect = this.mViewportOffset;
        return (width - rect.left) + rect.right;
    }

    private void offsetRect(@NonNull Rect rect, @Nullable Rect rect2) {
        if (rect2 == null) {
            return;
        }
        rect.left += rect2.left;
        rect.top += rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
    }

    private void prepareContent(Rect rect, boolean z) {
        this.mContentContainer.removeAllViews();
        this.mContentContainer.addView(this.mMainPanel);
        if (z) {
            addIndicator(rect);
        }
    }

    private void refreshCoordinated(Rect rect) {
        int viewportWidth;
        int iCenterY;
        int viewportHeight;
        int i;
        int i2 = this.mShowDirection;
        if (i2 == 4) {
            viewportWidth = Math.min(rect.centerX() - (getViewportWidth() / 2), this.mViewPortOnScreen.right - getViewportWidth());
            int i3 = rect.top;
            Rect rect2 = this.mViewPortOnScreen;
            int i4 = i3 - rect2.top;
            int i5 = rect2.bottom - rect.bottom;
            viewportHeight = getViewportHeight();
            if (i4 >= viewportHeight) {
                i = rect.top;
                iCenterY = i - viewportHeight;
            } else if (i5 >= viewportHeight) {
                iCenterY = rect.bottom;
            } else if (i4 > i5) {
                iCenterY = this.mViewPortOnScreen.top;
                setHeight(i4);
            } else {
                iCenterY = rect.bottom;
                setHeight(i5);
            }
        } else if (i2 == 128) {
            viewportWidth = Math.min(rect.centerX() - (getViewportWidth() / 2), this.mViewPortOnScreen.right - getViewportWidth());
            int i6 = rect.top;
            Rect rect3 = this.mViewPortOnScreen;
            int i7 = i6 - rect3.top;
            int i8 = rect3.bottom - rect.bottom;
            viewportHeight = getViewportHeight();
            if (i8 >= viewportHeight) {
                iCenterY = rect.bottom;
            } else if (i7 >= viewportHeight) {
                i = rect.top;
                iCenterY = i - viewportHeight;
            } else if (i7 > i8) {
                iCenterY = this.mViewPortOnScreen.top;
                setHeight(i7);
            } else {
                iCenterY = rect.bottom;
                setHeight(i8);
            }
        } else {
            viewportWidth = i2 == 16 ? rect.left - getViewportWidth() : rect.right;
            iCenterY = rect.centerY() - (((getViewportHeight() + this.mMainPanel.getPaddingTop()) - this.mMainPanel.getPaddingBottom()) / 2);
        }
        this.mParent.getRootView().getLocationOnScreen(this.mTmpCoords);
        int[] iArr = this.mTmpCoords;
        int i9 = iArr[0];
        int i10 = iArr[1];
        this.mParent.getRootView().getLocationInWindow(this.mTmpCoords);
        int[] iArr2 = this.mTmpCoords;
        int i11 = iArr2[0];
        int i12 = iArr2[1];
        int[] iArr3 = this.mWindowLocationOnScreen;
        int i13 = i9 - i11;
        iArr3[0] = i13;
        iArr3[1] = i10 - i12;
        this.mCoordsOnWindow.set(Math.max(0, (viewportWidth - i13) - this.mViewportOffset.left), Math.max(0, (iCenterY - this.mWindowLocationOnScreen[1]) - this.mViewportOffset.top));
    }

    private void registerOrientationHandler() {
        unregisterOrientationHandler();
        this.mParent.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
    }

    private void sizePopupWindow() {
        Resources resources = this.mContext.getResources();
        int i = R$dimen.tool_tips_max_width;
        int dimensionPixelSize = resources.getDimensionPixelSize(i) + this.mMainPanel.getPaddingLeft() + this.mMainPanel.getPaddingRight();
        int i2 = this.mShowDirection;
        if (i2 == 8) {
            dimensionPixelSize = Math.min(this.mViewPortOnScreen.right - this.mContentRectOnScreen.right, dimensionPixelSize);
        } else if (i2 == 16) {
            dimensionPixelSize = Math.min(this.mContentRectOnScreen.left - this.mViewPortOnScreen.left, dimensionPixelSize);
        }
        Rect rect = this.mViewPortOnScreen;
        int iMin = Math.min(rect.right - rect.left, dimensionPixelSize);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mScrollView.getLayoutParams();
        this.mContentTv.setMaxWidth((((iMin - this.mMainPanel.getPaddingLeft()) - this.mMainPanel.getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin);
        this.mMainPanel.measure(0, 0);
        setWidth(Math.min(this.mMainPanel.getMeasuredWidth(), iMin));
        setHeight(this.mMainPanel.getMeasuredHeight());
        if ((this.mContentRectOnScreen.centerY() - (((getViewportHeight() + this.mMainPanel.getPaddingTop()) - this.mMainPanel.getPaddingBottom()) / 2)) + getViewportHeight() >= this.mViewPortOnScreen.bottom) {
            this.mShowDirection = 4;
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(i) + this.mMainPanel.getPaddingLeft() + this.mMainPanel.getPaddingRight();
            Rect rect2 = this.mViewPortOnScreen;
            int iMin2 = Math.min(rect2.right - rect2.left, dimensionPixelSize2);
            this.mContentTv.setMaxWidth((((iMin2 - this.mMainPanel.getPaddingLeft()) - this.mMainPanel.getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin);
            this.mMainPanel.measure(0, 0);
            setWidth(Math.min(this.mMainPanel.getMeasuredWidth(), iMin2));
            setHeight(this.mMainPanel.getMeasuredHeight());
        }
    }

    private void unregisterOrientationHandler() {
        this.mParent.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!this.mIsDismissing) {
            animateExit();
        } else {
            dismissPopupWindow();
            this.mIsDismissing = false;
        }
    }

    public int getVisibility() {
        return this.mContentContainer.getVisibility();
    }

    public void init(int i) {
        this.mMode = i;
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearToolTips, i == 0 ? R$attr.nearToolTipsStyle : R$attr.nearToolTipsDetailFloatingStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsBackground);
        drawable.setDither(true);
        this.mArrowUpDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowUpDrawable);
        this.mArrowDownDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowDownDrawable);
        this.mArrowLeftDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowLeftDrawable);
        this.mArrowRightDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowRightDrawable);
        this.mArrowOverflow = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsArrowOverflowOffset, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsMinWidth, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearToolTips_nearToolTipsContainerLayoutGravity, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsContainerLayoutMarginStart, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsContainerLayoutMarginTop, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsContainerLayoutMarginEnd, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsContainerLayoutMarginBottom, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearToolTips_nearToolTipsContentTextColor);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsViewportOffsetStart, 0);
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsViewportOffsetTop, 0);
        int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsViewportOffsetEnd, 0);
        int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsViewportOffsetBottom, 0);
        final int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R$dimen.nxToolTipsCancelButtonInsects);
        typedArrayObtainStyledAttributes.recycle();
        this.mAnimationInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R$layout.nx_color_tool_tips_layout, (ViewGroup) null);
        this.mMainPanel = viewGroup;
        viewGroup.setBackground(drawable);
        this.mMainPanel.setMinimumWidth(dimensionPixelSize);
        ViewGroup viewGroupCreateContentContainer = createContentContainer(this.mContext);
        this.mContentContainer = viewGroupCreateContentContainer;
        vhc.b(viewGroupCreateContentContainer, false);
        this.mContentTv = (TextView) this.mMainPanel.findViewById(R$id.contentTv);
        ScrollView scrollView = (ScrollView) this.mMainPanel.findViewById(R$id.scrollView);
        this.mScrollView = scrollView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollView.getLayoutParams();
        layoutParams.gravity = i2;
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5);
        layoutParams.setMarginStart(dimensionPixelSize2);
        layoutParams.setMarginEnd(dimensionPixelSize4);
        this.mScrollView.setLayoutParams(layoutParams);
        this.mContentTv.setTextSize(0, (int) ugc.d(this.mContext.getResources().getDimensionPixelSize(i == 0 ? R$dimen.tool_tips_content_text_size : R$dimen.detail_floating_content_text_size), this.mContext.getResources().getConfiguration().fontScale, 4));
        this.mContentTv.setTextColor(colorStateList);
        final ImageView imageView = (ImageView) this.mMainPanel.findViewById(R$id.dismissIv);
        if (i == 0) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.5
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    NearToolTips.this.dismiss();
                    if (NearToolTips.this.mOnCloseIconClickListener != null) {
                        NearToolTips.this.mOnCloseIconClickListener.onCloseIconClick();
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        } else {
            imageView.setVisibility(8);
        }
        imageView.post(new Runnable() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.6
            @Override // java.lang.Runnable
            public void run() {
                Rect rect = new Rect();
                ViewGroupUtils.getDescendantRect(NearToolTips.this.mMainPanel, imageView, rect);
                int i3 = dimensionPixelOffset;
                rect.inset(-i3, -i3);
                NearToolTips.this.mMainPanel.setTouchDelegate(new TouchDelegate(rect, imageView));
            }
        });
        if (isLayoutRtl(this.mMainPanel)) {
            this.mViewportOffset = new Rect(dimensionPixelSize8, dimensionPixelSize7, dimensionPixelSize6, dimensionPixelSize9);
        } else {
            this.mViewportOffset = new Rect(dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9);
        }
        setClippingEnabled(false);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(0));
        setOnDismissListener(this.mOnPopupWindowDismissListener);
    }

    public boolean isLayoutRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearToolTips, this.mMode == 0 ? R$attr.nearToolTipsStyle : R$attr.nearToolTipsDetailFloatingStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsBackground);
        drawable.setDither(true);
        this.mArrowUpDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowUpDrawable);
        this.mArrowDownDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowDownDrawable);
        this.mArrowLeftDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowLeftDrawable);
        this.mArrowRightDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearToolTips_nearToolTipsArrowRightDrawable);
        this.mArrowOverflow = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearToolTips_nearToolTipsArrowOverflowOffset, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearToolTips_nearToolTipsContentTextColor);
        typedArrayObtainStyledAttributes.recycle();
        this.mMainPanel.setBackground(drawable);
        this.mContentTv.setTextColor(colorStateList);
        int i = this.mShowDirection;
        if (i == 4 || i == 128) {
            this.mArrowView.setBackground(this.mLeftOrTop ? this.mArrowUpDrawable : this.mArrowDownDrawable);
        } else {
            this.mArrowView.setBackground(this.mLeftOrTop ? this.mArrowRightDrawable : this.mArrowLeftDrawable);
        }
    }

    public void setAnimationVisibility(final int i) {
        if (i == 0) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, this.mPivotX, 1, this.mPivotY);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(this.mAnimationInterpolator);
            animationSet.setDuration(300L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    NearToolTips.this.mContentContainer.setVisibility(i);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.mContentContainer.startAnimation(animationSet);
        }
        if (i == 8 || i == 4) {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, this.mPivotX, 1, this.mPivotY);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.setDuration(300L);
            animationSet2.setInterpolator(this.mAnimationInterpolator);
            animationSet2.addAnimation(alphaAnimation2);
            animationSet2.addAnimation(scaleAnimation2);
            animationSet2.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    NearToolTips.this.mContentContainer.setVisibility(i);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    NearToolTips.this.mIsDismissing = true;
                }
            });
            this.mContentContainer.startAnimation(animationSet2);
        }
    }

    public void setContent(CharSequence charSequence) {
        this.mContentTv.setText(charSequence);
    }

    public void setDismissOnTouchOutside(boolean z) {
        if (z) {
            setTouchable(true);
            setFocusable(true);
            setOutsideTouchable(true);
        } else {
            setFocusable(false);
            setOutsideTouchable(false);
        }
        update();
    }

    public void setOffset(int i, int i2) {
        Rect rect = this.mViewportOffset;
        rect.left = i;
        rect.top = i2;
    }

    public void setOnCloseIconClickListener(OnCloseIconClickListener onCloseIconClickListener) {
        this.mOnCloseIconClickListener = onCloseIconClickListener;
    }

    public void setVisibility(int i) {
        this.mContentContainer.setVisibility(i);
    }

    public void show(View view) {
        show(view, true);
    }

    public void showWithDirection(View view, int i) {
        showWithDirection(view, i, true);
    }

    @Deprecated
    public NearToolTips(Window window, int i) {
        this.mViewPortOnScreen = new Rect();
        this.mLeftOrTop = false;
        this.mShowDirection = 4;
        this.mTmpCoords = new int[2];
        this.mWindowLocationOnScreen = new int[2];
        this.mCoordsOnWindow = new Point();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Rect rect = new Rect(i2, i3, i4, i5);
                Rect rect2 = new Rect(i6, i7, i8, i9);
                if (!NearToolTips.this.isShowing() || rect.equals(rect2) || NearToolTips.this.mAnchor == null) {
                    return;
                }
                NearToolTips.this.dismissPopupWindow();
            }
        };
        this.mOnPopupWindowDismissListener = new PopupWindow.OnDismissListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                NearToolTips.this.mContentContainer.removeAllViews();
            }
        };
        this.mContext = window.getContext();
        init(i);
    }

    public void setContent(View view) {
        this.mScrollView.removeAllViews();
        this.mScrollView.addView(view);
    }

    public void show(View view, boolean z) {
        showWithDirection(view, 4, z);
    }

    public void showWithDirection(View view, int i, boolean z) {
        if (isShowing()) {
            return;
        }
        this.mShowDirection = i;
        this.mParent = view.getRootView();
        int i2 = this.mShowDirection;
        if (i2 == 32 || i2 == 64) {
            if (isLayoutRtl(view)) {
                this.mShowDirection = this.mShowDirection == 32 ? 8 : 16;
            } else {
                this.mShowDirection = this.mShowDirection != 32 ? 8 : 16;
            }
        }
        this.mAnchor = view;
        this.mParent.getWindowVisibleDisplayFrame(this.mViewPortOnScreen);
        registerOrientationHandler();
        Rect rect = new Rect();
        this.mContentRectOnScreen = rect;
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        this.mParentRectOnScreen = rect2;
        this.mParent.getGlobalVisibleRect(rect2);
        int[] iArr = new int[2];
        this.mParent.getLocationOnScreen(iArr);
        this.mContentRectOnScreen.offset(iArr[0], iArr[1]);
        this.mParentRectOnScreen.offset(iArr[0], iArr[1]);
        Rect rect3 = this.mViewPortOnScreen;
        rect3.left = Math.max(rect3.left, this.mParentRectOnScreen.left);
        Rect rect4 = this.mViewPortOnScreen;
        rect4.top = Math.max(rect4.top, this.mParentRectOnScreen.top);
        Rect rect5 = this.mViewPortOnScreen;
        rect5.right = Math.min(rect5.right, this.mParentRectOnScreen.right);
        Rect rect6 = this.mViewPortOnScreen;
        rect6.bottom = Math.min(rect6.bottom, this.mParentRectOnScreen.bottom);
        sizePopupWindow();
        refreshCoordinated(this.mContentRectOnScreen);
        prepareContent(this.mContentRectOnScreen, z);
        setContentView(this.mContentContainer);
        calculatePivot();
        animateEnter();
        View view2 = this.mParent;
        Point point = this.mCoordsOnWindow;
        showAtLocation(view2, 0, point.x, point.y);
    }

    public NearToolTips(Context context) {
        this(context, 0);
    }

    public NearToolTips(Context context, int i) {
        this.mViewPortOnScreen = new Rect();
        this.mLeftOrTop = false;
        this.mShowDirection = 4;
        this.mTmpCoords = new int[2];
        this.mWindowLocationOnScreen = new int[2];
        this.mCoordsOnWindow = new Point();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Rect rect = new Rect(i2, i3, i4, i5);
                Rect rect2 = new Rect(i6, i7, i8, i9);
                if (!NearToolTips.this.isShowing() || rect.equals(rect2) || NearToolTips.this.mAnchor == null) {
                    return;
                }
                NearToolTips.this.dismissPopupWindow();
            }
        };
        this.mOnPopupWindowDismissListener = new PopupWindow.OnDismissListener() { // from class: com.heytap.nearx.uikit.widget.NearToolTips.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                NearToolTips.this.mContentContainer.removeAllViews();
            }
        };
        this.mContext = context;
        init(i);
    }
}
