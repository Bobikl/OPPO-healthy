package com.heytap.nearx.uikit.widget.sidepane;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearSidePaneLayout extends RelativeLayout {
    private static final int CLOSE_STATE = 1;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    private static final int DURATION_OF_SLIDING_ANIMATOR = 483;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int OPEN_STATE = 0;
    private static final Interpolator SLIDING_ANIMATOR_INTERPOLATOR = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
    private static final String TAG = "NearSidePaneLayout";
    private boolean mCanSlide;
    private boolean mDefaultShow;
    final ViewDragHelper mDragHelper;
    private boolean mFirstAttach;
    private boolean mFirstLayout;
    private final float mFirstViewWidth;
    private ImageButton mIconButton;
    boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    boolean mPreservedOpenState;
    private ValueAnimator mSlideAnimator;
    private float mSlideDistance;
    float mSlideOffset;
    int mSlideRange;
    private final float mSlideViewWidth;
    View mSlideableView;
    private int mState;
    private ValueAnimator mTranlateAnimator;

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect = new Rect();

        public AccessibilityDelegate() {
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        public boolean filter(View view) {
            return NearSidePaneLayout.this.isDimmed(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(NearSidePaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName(NearSidePaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = NearSidePaneLayout.this.getChildCount();
            for (int i = 1; i < childCount; i++) {
                View childAt = NearSidePaneLayout.this.getChildAt(i);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (filter(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class DragHelperCallback extends ViewDragHelper.Callback {
        public DragHelperCallback() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) NearSidePaneLayout.this.mSlideableView.getLayoutParams();
            if (NearSidePaneLayout.this.isLayoutRtlSupport()) {
                int width = NearSidePaneLayout.this.getWidth() - ((NearSidePaneLayout.this.getPaddingRight() + ((RelativeLayout.LayoutParams) layoutParams).rightMargin) + NearSidePaneLayout.this.mSlideableView.getWidth());
                return Math.max(Math.min(i, width), width - NearSidePaneLayout.this.mSlideRange);
            }
            int paddingLeft = NearSidePaneLayout.this.getPaddingLeft() + ((RelativeLayout.LayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), NearSidePaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return NearSidePaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            NearSidePaneLayout nearSidePaneLayout = NearSidePaneLayout.this;
            nearSidePaneLayout.mDragHelper.captureChildView(nearSidePaneLayout.mSlideableView, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            NearSidePaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (NearSidePaneLayout.this.mDragHelper.getViewDragState() == 0) {
                NearSidePaneLayout nearSidePaneLayout = NearSidePaneLayout.this;
                if (nearSidePaneLayout.mSlideOffset != 0.0f) {
                    nearSidePaneLayout.dispatchOnPanelOpened(nearSidePaneLayout.mSlideableView);
                    NearSidePaneLayout.this.mPreservedOpenState = true;
                } else {
                    nearSidePaneLayout.updateObscuredViewsVisibility(nearSidePaneLayout.mSlideableView);
                    NearSidePaneLayout nearSidePaneLayout2 = NearSidePaneLayout.this;
                    nearSidePaneLayout2.dispatchOnPanelClosed(nearSidePaneLayout2.mSlideableView);
                    NearSidePaneLayout.this.mPreservedOpenState = false;
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            NearSidePaneLayout nearSidePaneLayout = NearSidePaneLayout.this;
            if (nearSidePaneLayout.mSlideableView == null) {
                nearSidePaneLayout.mSlideOffset = 0.0f;
                return;
            }
            if (nearSidePaneLayout.isLayoutRtlSupport()) {
                i = (NearSidePaneLayout.this.getWidth() - i) - NearSidePaneLayout.this.mSlideableView.getWidth();
            }
            NearSidePaneLayout.this.onPanelSlide(i);
            NearSidePaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (NearSidePaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = NearSidePaneLayout.this.getPaddingRight() + ((RelativeLayout.LayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && NearSidePaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += NearSidePaneLayout.this.mSlideRange;
                }
                paddingLeft = (NearSidePaneLayout.this.getWidth() - paddingRight) - NearSidePaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = ((RelativeLayout.LayoutParams) layoutParams).leftMargin + NearSidePaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && NearSidePaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += NearSidePaneLayout.this.mSlideRange;
                }
            }
            NearSidePaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            NearSidePaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (NearSidePaneLayout.this.mIsUnableToDrag) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }
    }

    public interface PanelSlideListener {
        void onPanelSlide(@NonNull View view, float f);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.sidepane.NearSidePaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean isDefalutOpen;
        boolean isOpen;
        int state;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.isDefalutOpen ? 1 : 0);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.isDefalutOpen = parcel.readInt() != 0;
            this.state = parcel.readInt();
        }
    }

    public NearSidePaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private boolean closePane(View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private void createIconView() {
        this.mIconButton = (ImageButton) LayoutInflater.from(getContext()).inflate(R$layout.nx_sliding_icon_layout, (ViewGroup) null);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((RelativeLayout.LayoutParams) layoutParams).topMargin = getResources().getDimensionPixelOffset(R$dimen.nx_side_pane_layout_icon_margin_top);
        layoutParams.setMarginStart(getResources().getDimensionPixelOffset(R$dimen.nx_side_pane_layout_icon_margin_start));
        this.mIconButton.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.sidepane.NearSidePaneLayout.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (NearSidePaneLayout.this.isOpen()) {
                    NearSidePaneLayout.this.closePane();
                } else {
                    NearSidePaneLayout.this.openPane();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        addViewInLayout(this.mIconButton, 2, layoutParams);
    }

    private void initAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mTranlateAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(483L);
        ValueAnimator valueAnimator = this.mTranlateAnimator;
        Interpolator interpolator = SLIDING_ANIMATOR_INTERPOLATOR;
        valueAnimator.setInterpolator(interpolator);
        this.mTranlateAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.sidepane.NearSidePaneLayout.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (NearSidePaneLayout.this.getChildAt(0) != null) {
                    if (NearSidePaneLayout.this.mState == 1) {
                        View childAt = NearSidePaneLayout.this.getChildAt(0);
                        boolean zIsLayoutRtlSupport = NearSidePaneLayout.this.isLayoutRtlSupport();
                        float f = NearSidePaneLayout.this.mSlideDistance;
                        if (!zIsLayoutRtlSupport) {
                            f = -f;
                        }
                        childAt.setTranslationX(f * ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        return;
                    }
                    if (NearSidePaneLayout.this.mState == 0) {
                        View childAt2 = NearSidePaneLayout.this.getChildAt(0);
                        boolean zIsLayoutRtlSupport2 = NearSidePaneLayout.this.isLayoutRtlSupport();
                        float f2 = NearSidePaneLayout.this.mSlideDistance;
                        if (!zIsLayoutRtlSupport2) {
                            f2 = -f2;
                        }
                        childAt2.setTranslationX(f2 * (1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()));
                    }
                }
            }
        });
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.mSlideAnimator = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.mSlideAnimator.setDuration(483L);
        this.mSlideAnimator.setInterpolator(interpolator);
    }

    private boolean openPane(View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    private static boolean viewIsOpaque(View view) {
        return view.isOpaque();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (this.mCanSlide) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                this.mDragHelper.abort();
            }
        }
    }

    public void dispatchOnPanelClosed(View view) {
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelOpened(View view) {
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelSlide(View view) {
        PanelSlideListener panelSlideListener = this.mPanelSlideListener;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelSlide(view, this.mSlideOffset);
        }
        if (getChildAt(1) != null) {
            ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
            layoutParams.width = (int) ((getWidth() - this.mFirstViewWidth) - (this.mSlideDistance * (this.mSlideOffset - 1.0f)));
            getChildAt(1).setLayoutParams(layoutParams);
            getChildAt(1).requestLayout();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    public boolean isLayoutRtlSupport() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public boolean isOpen() {
        return this.mState == 0;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mDefaultShow && this.mState == 0) {
            this.mFirstAttach = true;
            openPane(this.mSlideableView, 0);
        } else {
            closePane();
        }
        if (this.mDefaultShow) {
            createIconView();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        char c2;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        char c3 = 2;
        if (zIsLayoutRtlSupport) {
            this.mDragHelper.setEdgeTrackingEnabled(2);
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(1);
        }
        int i7 = i3 - i;
        int paddingRight = zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (this.mCanSlide && this.mPreservedOpenState) ? 1.0f : 0.0f;
        }
        int i8 = paddingRight;
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                c2 = c3;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i10 = i7 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i10 - this.mOverhangSize) - i8) - (((RelativeLayout.LayoutParams) layoutParams).leftMargin + ((RelativeLayout.LayoutParams) layoutParams).rightMargin);
                    this.mSlideRange = iMin;
                    int i11 = zIsLayoutRtlSupport ? ((RelativeLayout.LayoutParams) layoutParams).rightMargin : ((RelativeLayout.LayoutParams) layoutParams).leftMargin;
                    layoutParams.dimWhenOffset = ((i8 + i11) + iMin) + (measuredWidth / 2) > i10;
                    int i12 = (int) (iMin * this.mSlideOffset);
                    i8 += i11 + i12;
                    this.mSlideOffset = i12 / iMin;
                } else {
                    i8 = paddingRight;
                }
                if (zIsLayoutRtlSupport) {
                    i5 = layoutParams.slideable ? i7 - ((int) (i8 + ((this.mFirstViewWidth - this.mSlideDistance) * (1.0f - this.mSlideOffset)))) : i7 - i8;
                    i6 = i5 - measuredWidth;
                } else if (layoutParams.slideable) {
                    i6 = (int) (i8 + ((this.mFirstViewWidth - this.mSlideDistance) * (1.0f - this.mSlideOffset)));
                    i5 = i6 + measuredWidth;
                } else {
                    i5 = i8 + measuredWidth;
                    i6 = i8;
                }
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (i9 != 2) {
                    childAt.layout(i6, paddingTop, i5, measuredHeight);
                } else if (zIsLayoutRtlSupport) {
                    childAt.layout((i7 - layoutParams.getMarginStart()) - measuredWidth, ((RelativeLayout.LayoutParams) layoutParams).topMargin, i7 - layoutParams.getMarginStart(), ((RelativeLayout.LayoutParams) layoutParams).topMargin + measuredWidth);
                } else {
                    childAt.layout(layoutParams.getMarginStart(), ((RelativeLayout.LayoutParams) layoutParams).topMargin, layoutParams.getMarginStart() + measuredWidth, ((RelativeLayout.LayoutParams) layoutParams).topMargin + measuredWidth);
                }
                c2 = 2;
                if (i9 < 2) {
                    paddingRight += childAt.getWidth();
                }
            }
            i9++;
            c3 = c2;
        }
        if (this.mFirstLayout) {
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[PHI: r13
  0x00ab: PHI (r13v2 float) = (r13v1 float), (r13v15 float) binds: [B:36:0x00a2, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:92:0x016b  */
    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMakeMeasureSpec;
        int i4;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int i7;
        int i8;
        float f;
        int iMakeMeasureSpec3;
        int i9;
        int iMakeMeasureSpec4;
        int measuredHeight;
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        boolean z2 = false;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 3) {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i10 = 0;
        boolean z3 = false;
        int i11 = paddingLeft;
        float f2 = 0.0f;
        while (true) {
            i3 = 8;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = z2;
            } else {
                float f3 = layoutParams.weight;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((RelativeLayout.LayoutParams) layoutParams).width != 0) {
                        i6 = ((RelativeLayout.LayoutParams) layoutParams).leftMargin + ((RelativeLayout.LayoutParams) layoutParams).rightMargin;
                        i7 = ((RelativeLayout.LayoutParams) layoutParams).width;
                        if (i7 != -2 || i7 == -1) {
                            i8 = paddingLeft - i6;
                        } else {
                            i8 = i7;
                        }
                        if (i10 == 1 || !this.mFirstAttach) {
                            f = 0.0f;
                        } else {
                            i8 = (int) (i8 - this.mFirstViewWidth);
                            f = this.mSlideDistance;
                        }
                        if (i7 == -2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
                        } else if (i7 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        i9 = ((RelativeLayout.LayoutParams) layoutParams).height;
                        if (i9 == -2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                        } else if (i9 == -1) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        if (i10 == 2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R$dimen.nx_side_pane_layout_icon_size), 1073741824);
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                        if (i10 < 2) {
                            int measuredWidth = (int) (childAt.getMeasuredWidth() + f);
                            measuredHeight = childAt.getMeasuredHeight();
                            if (mode2 == Integer.MIN_VALUE && measuredHeight > iMin) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            }
                            i11 -= measuredWidth;
                            if (i11 <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            layoutParams.slideable = z;
                            z3 |= z;
                            if (z) {
                                this.mSlideableView = childAt;
                            }
                        }
                        f2 = f2;
                    }
                } else {
                    i6 = ((RelativeLayout.LayoutParams) layoutParams).leftMargin + ((RelativeLayout.LayoutParams) layoutParams).rightMargin;
                    i7 = ((RelativeLayout.LayoutParams) layoutParams).width;
                    if (i7 != -2) {
                        i8 = paddingLeft - i6;
                    } else {
                        i8 = paddingLeft - i6;
                    }
                    if (i10 == 1) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (i7 == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
                    } else if (i7 == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    i9 = ((RelativeLayout.LayoutParams) layoutParams).height;
                    if (i9 == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                    } else if (i9 == -1) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    }
                    if (i10 == 2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R$dimen.nx_side_pane_layout_icon_size), 1073741824);
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    if (i10 < 2) {
                        int measuredWidth2 = (int) (childAt.getMeasuredWidth() + f);
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i11 -= measuredWidth2;
                        if (i11 <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.slideable = z;
                        z3 |= z;
                        if (z) {
                            this.mSlideableView = childAt;
                        }
                    }
                    f2 = f2;
                }
            }
            i10++;
            z2 = false;
        }
        if (z3 || f2 > 0.0f) {
            int i12 = paddingLeft - this.mOverhangSize;
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() == i3) {
                    i4 = i12;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        boolean z4 = ((RelativeLayout.LayoutParams) layoutParams2).width == 0 && layoutParams2.weight > 0.0f;
                        int measuredWidth3 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.mSlideableView) {
                            if (layoutParams2.weight > 0.0f) {
                                if (((RelativeLayout.LayoutParams) layoutParams2).width == 0) {
                                    int i14 = ((RelativeLayout.LayoutParams) layoutParams2).height;
                                    if (i14 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    } else {
                                        iMakeMeasureSpec = i14 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    }
                                } else {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z3) {
                                    int i15 = paddingLeft - (((RelativeLayout.LayoutParams) layoutParams2).leftMargin + ((RelativeLayout.LayoutParams) layoutParams2).rightMargin);
                                    i4 = i12;
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                    if (measuredWidth3 != i15) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    i4 = i12;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3 + ((int) ((layoutParams2.weight * Math.max(0, i11)) / f2)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((RelativeLayout.LayoutParams) layoutParams2).width < 0 && (measuredWidth3 > i12 || layoutParams2.weight > 0.0f)) {
                            if (z4) {
                                int i16 = ((RelativeLayout.LayoutParams) layoutParams2).height;
                                if (i16 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i16 == -1) {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, i5), iMakeMeasureSpec2);
                        }
                        i4 = i12;
                    } else {
                        i4 = i12;
                    }
                }
                i13++;
                i12 = i4;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.mCanSlide = z3;
        if (this.mDragHelper.getViewDragState() == 0 || z3) {
            return;
        }
        this.mDragHelper.abort();
    }

    public void onPanelSlide(int i) {
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        View view = this.mSlideableView;
        if (view == null) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        this.mSlideOffset = (i - ((zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (zIsLayoutRtlSupport ? ((RelativeLayout.LayoutParams) layoutParams).rightMargin : ((RelativeLayout.LayoutParams) layoutParams).leftMargin))) / this.mSlideRange;
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z = this.mDefaultShow;
        boolean z2 = savedState.isDefalutOpen;
        if (z != z2) {
            if (z2) {
                return;
            }
            this.mFirstAttach = true;
            openPane();
            this.mPreservedOpenState = true;
            this.mState = 0;
            return;
        }
        if (savedState.isOpen) {
            this.mFirstAttach = true;
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        this.mState = savedState.state;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = isSlideable() ? isOpen() : this.mPreservedOpenState;
        savedState.isDefalutOpen = this.mDefaultShow;
        savedState.state = this.mState;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.mCanSlide) {
            return;
        }
        this.mPreservedOpenState = view == this.mSlideableView;
    }

    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void setDefaultShowPane(Boolean bool) {
        this.mDefaultShow = bool.booleanValue();
        if (bool.booleanValue()) {
            if (getChildCount() > 0) {
                getChildAt(0).setVisibility(0);
            }
        } else {
            closePane();
            if (getChildCount() > 0) {
                getChildAt(0).setVisibility(8);
            }
            setIconViewVisible(8);
        }
    }

    public void setIconViewVisible(int i) {
        ImageButton imageButton = this.mIconButton;
        if (imageButton != null) {
            imageButton.setVisibility(i);
        }
    }

    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        this.mPanelSlideListener = panelSlideListener;
    }

    public void setSlideDistance(float f) {
        this.mSlideDistance = f;
    }

    @SuppressLint({"Recycle"})
    public boolean smoothSlideTo(final float f, int i) {
        if (!this.mCanSlide) {
            return false;
        }
        this.mSlideAnimator.cancel();
        this.mSlideAnimator.removeAllUpdateListeners();
        if (f == 0.0f) {
            this.mSlideAnimator.setCurrentFraction(1.0f - this.mSlideOffset);
        } else {
            this.mSlideAnimator.setCurrentFraction(this.mSlideOffset);
        }
        getWidth();
        this.mSlideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.sidepane.NearSidePaneLayout.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                NearSidePaneLayout.this.onPanelSlide((int) (f == 1.0f ? NearSidePaneLayout.this.mFirstViewWidth * animatedFraction : NearSidePaneLayout.this.mFirstViewWidth * (1.0f - animatedFraction)));
            }
        });
        this.mSlideAnimator.start();
        setAllChildrenVisible();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void updateObscuredViewsVisibility(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int width = zIsLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zIsLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zIsLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zIsLayoutRtlSupport = zIsLayoutRtlSupport;
        }
    }

    public static class LayoutParams extends RelativeLayout.LayoutParams {
        private static final int[] ATTRS = {R.attr.layout_weight};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((RelativeLayout.LayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public NearSidePaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public NearSidePaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDefaultShow = true;
        this.mFirstLayout = true;
        this.mFirstAttach = false;
        this.mState = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearSidePaneLayout, i, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int) ((32.0f * f) + 0.5f);
        int i2 = R$styleable.NearSidePaneLayout_firstPaneWidth;
        Resources resources = getResources();
        int i3 = R$dimen.nx_sliding_pane_width;
        this.mFirstViewWidth = typedArrayObtainStyledAttributes.getDimension(i2, resources.getDimensionPixelOffset(i3));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearSidePaneLayout_expandPaneWidth, getResources().getDimensionPixelOffset(i3));
        this.mSlideViewWidth = dimension;
        this.mSlideDistance = dimension;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.mDragHelper = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f * 400.0f);
        initAnimator();
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean closePane() {
        this.mState = 1;
        this.mFirstAttach = false;
        this.mTranlateAnimator.cancel();
        this.mTranlateAnimator.setCurrentFraction(1.0f - this.mSlideOffset);
        this.mTranlateAnimator.start();
        return closePane(this.mSlideableView, 0);
    }

    public boolean openPane() {
        this.mState = 0;
        this.mTranlateAnimator.cancel();
        this.mTranlateAnimator.setCurrentFraction(this.mSlideOffset);
        this.mTranlateAnimator.start();
        return openPane(this.mSlideableView, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
