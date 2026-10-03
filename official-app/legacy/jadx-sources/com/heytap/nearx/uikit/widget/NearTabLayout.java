package com.heytap.nearx.uikit.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Pools;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.TabItem;
import com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.fmc;
import com.oplus.aiunit.vision.ilc;
import com.oplus.aiunit.vision.plc;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.w50;
import com.oplus.aiunit.vision.z63;
import io.protostuff.runtime.RuntimeSchema;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class NearTabLayout extends NearHorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final float DEFAULT_MAXIMUM_WIDTH_RATIO = 0.36f;
    private static final int DEFAULT_MIN_DIVIDER = 16;
    private static final int DEFAULT_MIN_MARGIN = 24;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    private static final String MEDIUM_FONT = "sans-serif-medium";
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final String REGULAR_FONT = "sans-serif";
    private static final Pools.Pool<Tab> sTabPool = new Pools.SynchronizedPool(16);
    private ArrayList<PrivateButton> button;
    private Paint emptyP;
    private boolean isUpdateIndicatorPosition;
    private AdapterChangeListener mAdapterChangeListener;
    private int mBottomDividerColor;
    private boolean mBottomDividerEnabled;
    private int mButtonMarginEnd;
    private OnTabSelectedListener mCurrentVpSelectedListener;
    private float mDefaultIndicatorRatio;
    private float mDefaultTabTextSize;
    private int mDotHorizontalOffset;
    private ArgbEvaluator mEvaluator;
    private int mIndicatorPadding;
    private float mLastOffset;
    private int mLongTextViewHeight;
    int mMode;
    private boolean mNeedAdjust;
    private int mNormalTextColor;
    Typeface mNormalTypeface;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private int mRealDotHorizontalOffset;
    private int mRequestedTabMaxWidth;
    private int mRequestedTabMinWidth;
    private int mResizeHeight;
    private ValueAnimator mScrollAnimator;
    private int mSelectedIndicatorColor;
    private int mSelectedIndicatorDisableColor;
    private OnTabSelectedListener mSelectedListener;
    private final ArrayList<OnTabSelectedListener> mSelectedListeners;
    private int mSelectedPosition;
    private Tab mSelectedTab;
    private int mSelectedTextColor;
    Typeface mSelectedTypeface;
    private boolean mSetupViewPagerImplicitly;
    private int mStyle;
    private boolean mTabAlreadyMeasure;
    final int mTabBackgroundResId;
    int mTabGravity;
    int mTabMarginTop;
    private int mTabMinDivider;
    private int mTabMinMargin;
    int mTabPaddingBottom;
    int mTabPaddingEnd;
    int mTabPaddingStart;
    int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    int mTabTextAppearance;
    ColorStateList mTabTextColors;
    private int mTabTextDisabledColor;
    float mTabTextSize;
    private Typeface mTabTextTypeFace;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<Tab> mTabs;
    private int mTextColorBlue;
    private int mTextColorGreen;
    private int mTextColorRed;
    private boolean mTextIsAnimator;
    ViewPager mViewPager;
    private int originalRequestedTabMaxWidth;
    private int originalRequestedTabMinWidth;
    private int originalTabMinDivider;
    private int originalTabMinMargin;

    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        private boolean mAutoRefresh;

        public AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            NearTabLayout nearTabLayout = NearTabLayout.this;
            if (nearTabLayout.mViewPager == viewPager) {
                nearTabLayout.setPagerAdapter(pagerAdapter2, this.mAutoRefresh);
            }
        }

        public void setAutoRefresh(boolean z) {
            this.mAutoRefresh = z;
        }
    }

    public interface OnTabSelectedListener {
        void onTabReselected(Tab tab);

        void onTabSelected(Tab tab);

        void onTabUnselected(Tab tab);
    }

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            NearTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            NearTabLayout.this.populateFromPagerAdapter();
        }
    }

    public class PrivateButton {
        View.OnClickListener buttonClicklistener;
        Drawable buttonDrawable;

        public PrivateButton(Drawable drawable, View.OnClickListener onClickListener) {
            this.buttonDrawable = drawable;
            this.buttonClicklistener = onClickListener;
        }
    }

    public class SlidingTabStrip extends LinearLayout {
        private int lastPosition;
        private final Paint mBottomDividerPaint;
        private int mIndicatorAnimTime;
        private ValueAnimator mIndicatorAnimator;
        private int mIndicatorBackgroundHeight;
        private int mIndicatorBackgroundPaddingLeft;
        private int mIndicatorBackgroundPaddingRight;
        private final Paint mIndicatorBackgroundPaint;
        private int mIndicatorLeft;
        private int mIndicatorRight;
        private float mIndicatorWidthRatio;
        float mLastOffset;
        float mLastSelectionOffset;
        private int mLayoutDirection;
        private float mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        int mSelectedPosition;
        float mSelectionOffset;

        public SlidingTabStrip(Context context) {
            super(context);
            this.mSelectedPosition = -1;
            this.mLayoutDirection = -1;
            this.mIndicatorLeft = -1;
            this.mIndicatorRight = -1;
            this.lastPosition = 0;
            this.mIndicatorAnimTime = -1;
            setWillNotDraw(false);
            this.mSelectedIndicatorPaint = new Paint();
            this.mBottomDividerPaint = new Paint();
            this.mIndicatorBackgroundPaint = new Paint();
            setGravity(17);
        }

        private int getIndicatorLeft(int i) {
            int width = ((NearTabLayout.this.getWidth() - NearTabLayout.this.getPaddingLeft()) - NearTabLayout.this.getPaddingRight()) - getWidth();
            return (!isLayoutRTL() || width <= 0) ? i : i + width;
        }

        private int getIndicatorRight(int i) {
            int width = ((NearTabLayout.this.getWidth() - NearTabLayout.this.getPaddingLeft()) - NearTabLayout.this.getPaddingRight()) - getWidth();
            return (!isLayoutRTL() || width <= 0) ? i : i + width;
        }

        private void measureChildMargin(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int childCount = getChildCount();
            int i7 = i - i2;
            int i8 = i7 / (childCount + 1);
            if (i8 >= NearTabLayout.this.mTabMinMargin) {
                int i9 = i8 / 2;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (i10 == 0) {
                        i5 = i8 - NearTabLayout.this.mTabMinMargin;
                        i6 = i9;
                    } else if (i10 == childCount - 1) {
                        i6 = i8 - NearTabLayout.this.mTabMinMargin;
                        i5 = i9;
                    } else {
                        i5 = i9;
                        i6 = i5;
                    }
                    setMargin(childAt, i5, i6, childAt.getMeasuredWidth());
                }
                return;
            }
            int i11 = childCount - 1;
            int i12 = ((i7 - (NearTabLayout.this.mTabMinMargin * 2)) / i11) / 2;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (i13 == 0) {
                    i4 = i12;
                    i3 = 0;
                } else if (i13 == i11) {
                    i3 = i12;
                    i4 = 0;
                } else {
                    i3 = i12;
                    i4 = i3;
                }
                setMargin(childAt2, i3, i4, childAt2.getMeasuredWidth());
            }
        }

        private void measureChildWithRedDot(TabView tabView, int i, int i2) {
            tabView.mTextView.getLayoutParams().width = -2;
            if (tabView.mTextView == null || tabView.mHintRedDot == null || tabView.mHintRedDot.getVisibility() == 8) {
                tabView.measure(i, i2);
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tabView.mHintRedDot.getLayoutParams();
            if (tabView.mHintRedDot.getMPointMode() == 0) {
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                tabView.measure(i, i2);
                return;
            }
            if (isLayoutRTL()) {
                layoutParams.rightMargin = NearTabLayout.this.mDotHorizontalOffset;
            } else {
                layoutParams.leftMargin = NearTabLayout.this.mDotHorizontalOffset;
            }
            tabView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            if (tabView.getMeasuredWidth() > NearTabLayout.this.mRequestedTabMaxWidth) {
                tabView.mTextView.getLayoutParams().width = ((NearTabLayout.this.mRequestedTabMaxWidth - tabView.mHintRedDot.getMeasuredWidth()) - layoutParams.getMarginStart()) + layoutParams.getMarginEnd();
                tabView.measure(i, i2);
            }
        }

        private void setMargin(View view, int i, int i2, int i3, int i4) {
            setMargin(view, i, i2 + i4, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:71:0x01f1  */
        public void updateIndicatorPosition() {
            int right;
            int indicatorRight;
            int left;
            int right2;
            int i;
            float f;
            int left2;
            int right3;
            int i2;
            float f2;
            View childAt = getChildAt(this.mSelectedPosition);
            TabView tabView = (TabView) getChildAt(this.mSelectedPosition);
            boolean z = false;
            boolean z2 = (tabView == null || tabView.mTextView == null || tabView.mCustomView != null) ? false : true;
            if (tabView != null && tabView.mCustomView != null) {
                z = true;
            }
            int left3 = -1;
            if (z2) {
                TextView textView = tabView.mTextView;
                if (textView.getWidth() > 0) {
                    int left4 = (tabView.getLeft() + textView.getLeft()) - NearTabLayout.this.mIndicatorPadding;
                    int left5 = tabView.getLeft() + textView.getRight() + NearTabLayout.this.mIndicatorPadding;
                    if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                        TabView tabView2 = (TabView) getChildAt(this.mSelectedPosition + 1);
                        View view = tabView2.mCustomView != null ? tabView2.mCustomView : tabView2.mTextView;
                        if (view != null) {
                            left2 = (tabView2.getLeft() + view.getLeft()) - NearTabLayout.this.mIndicatorPadding;
                            right3 = tabView2.getLeft() + view.getRight() + NearTabLayout.this.mIndicatorPadding;
                        } else {
                            left2 = tabView2.getLeft();
                            right3 = tabView2.getRight();
                        }
                        int i3 = right3 - left2;
                        int i4 = left5 - left4;
                        int i5 = i3 - i4;
                        int i6 = left2 - left4;
                        if (this.mLastSelectionOffset == 0.0f) {
                            this.mLastSelectionOffset = this.mSelectionOffset;
                        }
                        float f3 = this.mSelectionOffset;
                        if (f3 - this.mLastSelectionOffset > 0.0f) {
                            i2 = (int) (i4 + (i5 * f3));
                            f2 = left4 + (i6 * f3);
                        } else {
                            i2 = (int) (i3 - (i5 * (1.0f - f3)));
                            f2 = left2 - (i6 * (1.0f - f3));
                        }
                        left4 = (int) f2;
                        left5 = left4 + i2;
                        this.mLastSelectionOffset = f3;
                    }
                    left3 = getIndicatorLeft(left4);
                    right = getIndicatorRight(left5);
                } else {
                    right = -1;
                }
            } else if (z) {
                View view2 = tabView.mCustomView;
                if (view2.getWidth() > 0) {
                    int left6 = (tabView.getLeft() + view2.getLeft()) - NearTabLayout.this.mIndicatorPadding;
                    int left7 = tabView.getLeft() + view2.getRight() + NearTabLayout.this.mIndicatorPadding;
                    if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                        TabView tabView3 = (TabView) getChildAt(this.mSelectedPosition + 1);
                        View view3 = tabView3.mCustomView != null ? tabView3.mCustomView : tabView3.mTextView;
                        if (view3 != null) {
                            left = (tabView3.getLeft() + view3.getLeft()) - NearTabLayout.this.mIndicatorPadding;
                            right2 = tabView3.getLeft() + view3.getRight() + NearTabLayout.this.mIndicatorPadding;
                        } else {
                            left = tabView3.getLeft();
                            right2 = tabView3.getRight();
                        }
                        int i7 = right2 - left;
                        int i8 = left7 - left6;
                        int i9 = i7 - i8;
                        int i10 = left - left6;
                        if (this.mLastSelectionOffset == 0.0f) {
                            this.mLastSelectionOffset = this.mSelectionOffset;
                        }
                        float f4 = this.mSelectionOffset;
                        if (f4 - this.mLastSelectionOffset > 0.0f) {
                            i = (int) (i8 + (i9 * f4));
                            f = left6 + (i10 * f4);
                        } else {
                            i = (int) (i7 - (i9 * (1.0f - f4)));
                            f = left - (i10 * (1.0f - f4));
                        }
                        left6 = (int) f;
                        left7 = left6 + i;
                        this.mLastSelectionOffset = f4;
                    }
                    int indicatorLeft = getIndicatorLeft(left6);
                    indicatorRight = getIndicatorRight(left7);
                    left3 = indicatorLeft;
                } else {
                    indicatorRight = -1;
                }
                right = indicatorRight;
            } else if (childAt == null || childAt.getWidth() <= 0) {
                right = -1;
            } else {
                left3 = childAt.getLeft();
                right = childAt.getRight();
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    float left8 = this.mSelectionOffset * childAt2.getLeft();
                    float f5 = this.mSelectionOffset;
                    left3 = (int) (left8 + ((1.0f - f5) * left3));
                    right = (int) ((f5 * childAt2.getRight()) + ((1.0f - this.mSelectionOffset) * right));
                }
            }
            setIndicatorPosition(left3, right);
        }

        public void animateIndicatorToPosition(final int i, int i2) {
            boolean z;
            SlidingTabStrip slidingTabStrip;
            final int i3;
            int i4;
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            int i5 = 1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                z = false;
            } else if (i != this.lastPosition) {
                this.mIndicatorAnimator.end();
                z = false;
            } else {
                this.mIndicatorAnimator.cancel();
                z = true;
            }
            boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
                return;
            }
            final TabView tabView = (TabView) childAt;
            final TabView tabView2 = (TabView) getChildAt(NearTabLayout.this.getSelectedTabPosition());
            if (tabView.mTextView == null || tabView.mCustomView != null) {
                slidingTabStrip = this;
                final int indicatorLeft = slidingTabStrip.getIndicatorLeft(tabView.getLeft() + tabView.mCustomView.getLeft());
                final int indicatorRight = slidingTabStrip.getIndicatorRight(tabView.getLeft() + tabView.mCustomView.getRight());
                if (Math.abs(i - slidingTabStrip.mSelectedPosition) <= 1) {
                    i3 = slidingTabStrip.mIndicatorLeft;
                    i4 = slidingTabStrip.mIndicatorRight;
                } else {
                    int iDpToPx = NearTabLayout.this.dpToPx(24);
                    i3 = (i >= slidingTabStrip.mSelectedPosition ? !z2 : z2) ? indicatorLeft - iDpToPx : iDpToPx + indicatorRight;
                    i4 = i3;
                }
                if (i3 != indicatorLeft || i4 != indicatorRight) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    slidingTabStrip.mIndicatorAnimator = valueAnimator2;
                    valueAnimator2.setInterpolator(w50.INSTANCE.a());
                    valueAnimator2.setDuration(i2);
                    valueAnimator2.setFloatValues(0.0f, 1.0f);
                    final int i6 = i4;
                    valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearTabLayout.SlidingTabStrip.3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            float animatedFraction = valueAnimator3.getAnimatedFraction();
                            SlidingTabStrip slidingTabStrip2 = SlidingTabStrip.this;
                            w50 w50Var = w50.INSTANCE;
                            slidingTabStrip2.setIndicatorPosition(w50Var.b(i3, indicatorLeft, animatedFraction), w50Var.b(i6, indicatorRight, animatedFraction));
                        }
                    });
                    valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearTabLayout.SlidingTabStrip.4
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            SlidingTabStrip slidingTabStrip2 = SlidingTabStrip.this;
                            slidingTabStrip2.mSelectedPosition = i;
                            slidingTabStrip2.mSelectionOffset = 0.0f;
                            if (tabView.mTextView != null) {
                                tabView.mTextView.setTextColor(NearTabLayout.this.mSelectedTextColor);
                            }
                            if (tabView2.mTextView != null) {
                                tabView2.mTextView.setTextColor(NearTabLayout.this.mNormalTextColor);
                            }
                        }
                    });
                    valueAnimator2.start();
                }
            } else {
                final TextView textView = tabView.mTextView;
                final int i7 = this.mIndicatorLeft;
                final int i8 = this.mIndicatorRight;
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.nx_tab_layout_indicator_padding);
                final int indicatorLeft2 = getIndicatorLeft((tabView.getLeft() + textView.getLeft()) - dimensionPixelOffset);
                final int indicatorRight2 = getIndicatorRight(tabView.getLeft() + textView.getRight() + dimensionPixelOffset);
                final int i9 = (indicatorRight2 - indicatorLeft2) - (i8 - i7);
                final int i10 = indicatorLeft2 - i7;
                int indicatorAnimTime = NearTabLayout.this.getIndicatorAnimTime(i, this.mSelectedPosition);
                int i11 = this.mIndicatorAnimTime;
                if (i11 != -1) {
                    indicatorAnimTime = i11;
                }
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.mIndicatorAnimator = valueAnimator3;
                valueAnimator3.setDuration(indicatorAnimTime);
                if (NearTabLayout.this.mTextIsAnimator) {
                    valueAnimator3.setInterpolator(PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f));
                    i5 = 1;
                }
                valueAnimator3.setIntValues(0, i5);
                final int currentTextColor = z ? textView.getCurrentTextColor() : NearTabLayout.this.mNormalTextColor;
                final int currentTextColor2 = z ? tabView2.mTextView.getCurrentTextColor() : NearTabLayout.this.mSelectedTextColor;
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearTabLayout.SlidingTabStrip.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        int i12;
                        int i13;
                        float animatedFraction = valueAnimator4.getAnimatedFraction();
                        textView.setTextColor(((Integer) NearTabLayout.this.mEvaluator.evaluate(animatedFraction, Integer.valueOf(currentTextColor), Integer.valueOf(NearTabLayout.this.mSelectedTextColor))).intValue());
                        tabView2.mTextView.setTextColor(((Integer) NearTabLayout.this.mEvaluator.evaluate(animatedFraction, Integer.valueOf(currentTextColor2), Integer.valueOf(NearTabLayout.this.mNormalTextColor))).intValue());
                        SlidingTabStrip slidingTabStrip2 = SlidingTabStrip.this;
                        if (slidingTabStrip2.mLastOffset == 0.0f) {
                            slidingTabStrip2.mLastOffset = animatedFraction;
                        }
                        if (animatedFraction - slidingTabStrip2.mLastOffset > 0.0f) {
                            int i14 = i8;
                            int i15 = i7;
                            i12 = (int) ((i14 - i15) + (i9 * animatedFraction));
                            i13 = (int) (i15 + (i10 * animatedFraction));
                        } else {
                            int i16 = indicatorRight2;
                            int i17 = indicatorLeft2;
                            float f = 1.0f - animatedFraction;
                            i12 = (int) ((i16 - i17) - (i9 * f));
                            i13 = (int) (i17 - (i10 * f));
                        }
                        slidingTabStrip2.setIndicatorPosition(i13, i12 + i13);
                    }
                });
                slidingTabStrip = this;
                valueAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearTabLayout.SlidingTabStrip.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SlidingTabStrip slidingTabStrip2 = SlidingTabStrip.this;
                        slidingTabStrip2.mSelectedPosition = i;
                        slidingTabStrip2.mSelectionOffset = 0.0f;
                        slidingTabStrip2.updateIndicatorPosition();
                        NearTabLayout.this.resetTextColorAfterAnim();
                        if (NearTabLayout.this.mTextIsAnimator) {
                            TextView textView2 = textView;
                            int i12 = NearTabLayout.this.mSelectedTextColor;
                            Context context = SlidingTabStrip.this.getContext();
                            int i13 = R$attr.nxColorDisabledNeutral;
                            textView2.setTextColor(ilc.a(i12, plc.b(context, i13, 0)));
                            tabView2.mTextView.setTextColor(ilc.a(NearTabLayout.this.mNormalTextColor, plc.b(SlidingTabStrip.this.getContext(), i13, 0)));
                        }
                    }
                });
                valueAnimator3.start();
            }
            slidingTabStrip.lastPosition = NearTabLayout.this.getSelectedTabPosition();
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public float getIndicatorPosition() {
            return this.mSelectedPosition + this.mSelectionOffset;
        }

        public boolean isLayoutRTL() {
            return ViewCompat.getLayoutDirection(this) == 1;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (NearTabLayout.this.isUpdateIndicatorPosition) {
                updateIndicatorPosition();
            }
            if (NearTabLayout.this.mTabAlreadyMeasure) {
                return;
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
                animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * this.mIndicatorAnimator.getDuration()));
            }
            NearTabLayout.this.mTabAlreadyMeasure = true;
            NearTabLayout.this.setScrollPosition(this.mSelectedPosition, 0.0f, true, true);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (View.MeasureSpec.getMode(i) == 0) {
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            if (childCount == 0) {
                super.onMeasure(i, i2);
                return;
            }
            NearTabLayout nearTabLayout = NearTabLayout.this;
            if (nearTabLayout.mMode == 1) {
                this.mIndicatorWidthRatio = nearTabLayout.mDefaultIndicatorRatio;
                int i7 = childCount - 1;
                int i8 = (size - (NearTabLayout.this.mTabMinDivider * i7)) - (NearTabLayout.this.mTabMinMargin * 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(NearTabLayout.this.mRequestedTabMaxWidth, Integer.MIN_VALUE);
                int measuredWidth = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    TabView tabView = (TabView) getChildAt(i9);
                    setMargin(tabView, 0, 0);
                    measureChildWithRedDot(tabView, iMakeMeasureSpec, i2);
                    measuredWidth += tabView.getMeasuredWidth();
                }
                if (measuredWidth <= i8) {
                    measureChildMargin(size, measuredWidth);
                } else {
                    int i10 = NearTabLayout.this.mTabMinDivider / 2;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = getChildAt(i11);
                        if (i11 == 0) {
                            i6 = i10;
                            i5 = 0;
                        } else if (i11 == i7) {
                            i5 = i10;
                            i6 = 0;
                        } else {
                            i5 = i10;
                            i6 = i5;
                        }
                        setMargin(childAt, i5, i6, childAt.getMeasuredWidth());
                    }
                }
            } else {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(nearTabLayout.mRequestedTabMaxWidth, Integer.MIN_VALUE);
                int i12 = NearTabLayout.this.mTabMinDivider / 2;
                for (int i13 = 0; i13 < childCount; i13++) {
                    TabView tabView2 = (TabView) getChildAt(i13);
                    setMargin(tabView2, 0, 0);
                    measureChildWithRedDot(tabView2, iMakeMeasureSpec2, i2);
                    if (i13 == 0) {
                        i4 = i12;
                        i3 = 0;
                    } else if (i13 == childCount - 1) {
                        i3 = i12;
                        i4 = 0;
                    } else {
                        i3 = i12;
                        i4 = i3;
                    }
                    setMargin(tabView2, i3, i4, tabView2.getMeasuredWidth());
                }
            }
            int measuredWidth2 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                measuredWidth2 += getChildAt(i14).getMeasuredWidth();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), i2);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }

        public void setBottomDividerColor(int i) {
            this.mBottomDividerPaint.setColor(i);
            ViewCompat.postInvalidateOnAnimation(NearTabLayout.this);
        }

        public void setIndicatorPosition(int i, int i2) {
            int i3 = (i + i2) / 2;
            int i4 = (i2 - i) / 2;
            int i5 = i3 - i4;
            int i6 = i3 + i4;
            if (i5 == this.mIndicatorLeft && i6 == this.mIndicatorRight) {
                return;
            }
            this.mIndicatorLeft = i5;
            this.mIndicatorRight = i6;
            ViewCompat.postInvalidateOnAnimation(NearTabLayout.this);
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }

        public void setSelectedIndicatorColor(int i) {
            this.mSelectedIndicatorPaint.setColor(i);
            ViewCompat.postInvalidateOnAnimation(NearTabLayout.this);
        }

        public void setSelectedIndicatorHeight(float f) {
            if (this.mSelectedIndicatorHeight != f) {
                this.mSelectedIndicatorHeight = f;
                ViewCompat.postInvalidateOnAnimation(NearTabLayout.this);
            }
        }

        private void setMargin(View view, int i, int i2, int i3) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = i3 + i + i2;
            view.setPaddingRelative(i, view.getPaddingTop(), i2, view.getPaddingBottom());
            view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        }

        private void setMargin(View view, int i, int i2) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            ViewCompat.setPaddingRelative(view, 0, view.getPaddingTop(), 0, view.getPaddingBottom());
            layoutParams.setMarginStart(i);
            layoutParams.setMarginEnd(i2);
        }
    }

    public static final class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        NearTabLayout mParent;
        private Object mTag;
        private CharSequence mText;
        TabView mView;
        private int mPosition = -1;
        private boolean isBold = true;
        private int mPointMode = 0;
        private int mPointNumber = -1;
        private String mPointText = "";

        @Nullable
        public CharSequence getContentDescription() {
            return this.mContentDesc;
        }

        @Nullable
        public View getCustomView() {
            return this.mCustomView;
        }

        @Nullable
        public Drawable getIcon() {
            return this.mIcon;
        }

        public int getPointMode() {
            TabView tabView = this.mView;
            if (tabView == null || tabView.mHintRedDot == null) {
                return 0;
            }
            return this.mView.mHintRedDot.getMPointMode();
        }

        public int getPointNumber() {
            TabView tabView = this.mView;
            if (tabView == null || tabView.mHintRedDot == null) {
                return 0;
            }
            this.mView.mHintRedDot.getMPointNumber();
            return 0;
        }

        public String getPointText() {
            TabView tabView = this.mView;
            if (tabView != null && tabView.mHintRedDot != null) {
                this.mView.mHintRedDot.getPointText();
            }
            return this.mPointText;
        }

        public int getPosition() {
            return this.mPosition;
        }

        @Nullable
        public NearHintRedDot getRedPoint() {
            return this.mView.mHintRedDot;
        }

        public boolean getSelectedByClick() {
            TabView tabView = this.mView;
            if (tabView != null) {
                return tabView.getSelectedByClick();
            }
            return false;
        }

        @Nullable
        public Object getTag() {
            return this.mTag;
        }

        @Nullable
        public CharSequence getText() {
            return this.mText;
        }

        public TabView getView() {
            return this.mView;
        }

        @Deprecated
        public TabView getmView() {
            return this.mView;
        }

        public boolean isBold() {
            return this.isBold;
        }

        public boolean isSelected() {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout != null) {
                return nearTabLayout.getSelectedTabPosition() == this.mPosition;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void reset() {
            this.mParent = null;
            this.mView = null;
            this.mTag = null;
            this.mIcon = null;
            this.mText = null;
            this.mContentDesc = null;
            this.mPosition = -1;
            this.mCustomView = null;
        }

        public void select() {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            nearTabLayout.selectTab(this);
        }

        public void setBold(boolean z) {
            this.isBold = z;
        }

        @NonNull
        public Tab setContentDescription(@StringRes int i) {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout != null) {
                return setContentDescription(nearTabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setCustomView(@Nullable View view) {
            this.mCustomView = view;
            return this;
        }

        @NonNull
        public Tab setIcon(@Nullable Drawable drawable) {
            this.mIcon = drawable;
            updateView();
            return this;
        }

        public Tab setPointMode(int i) {
            this.mPointMode = i;
            TabView tabView = this.mView;
            if (tabView != null && tabView.mHintRedDot != null && i != this.mView.mHintRedDot.getMPointMode()) {
                this.mView.mHintRedDot.setPointMode(i);
            }
            return this;
        }

        public Tab setPointNumber(int i) {
            this.mPointNumber = i;
            TabView tabView = this.mView;
            if (tabView != null && tabView.mHintRedDot != null && i != this.mView.mHintRedDot.getMPointNumber()) {
                this.mView.mHintRedDot.setPointNumber(i);
            }
            return this;
        }

        public Tab setPointText(String str) {
            this.mPointText = str;
            TabView tabView = this.mView;
            if (tabView != null && tabView.mHintRedDot != null && !TextUtils.equals(str, this.mView.mHintRedDot.getPointText())) {
                if (str != null) {
                    this.mView.mHintRedDot.setPointText(str);
                } else {
                    this.mView.mHintRedDot.setPointText("");
                }
            }
            return this;
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        @NonNull
        public Tab setTag(@Nullable Object obj) {
            this.mTag = obj;
            return this;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            this.mText = charSequence;
            updateView();
            return this;
        }

        public Tab updateTabView() {
            updateView();
            return this;
        }

        public void updateView() {
            TabView tabView = this.mView;
            if (tabView != null) {
                tabView.update();
            }
        }

        @NonNull
        public Tab setCustomView(@LayoutRes int i) {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.mCustomView = LayoutInflater.from(nearTabLayout.getContext()).inflate(i, (ViewGroup) this.mParent, false);
            return this;
        }

        @NonNull
        public Tab setIcon(@DrawableRes int i) {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout != null) {
                return setIcon(ResourcesCompat.getDrawable(nearTabLayout.getResources(), i, null));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setText(@StringRes int i) {
            NearTabLayout nearTabLayout = this.mParent;
            if (nearTabLayout != null) {
                return setText(nearTabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.mContentDesc = charSequence;
            updateView();
            return this;
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference<NearTabLayout> mTabLayoutRef;

        public TabLayoutOnPageChangeListener(NearTabLayout nearTabLayout) {
            this.mTabLayoutRef = new WeakReference<>(nearTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.mPreviousScrollState = this.mScrollState;
            this.mScrollState = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            NearTabLayout nearTabLayout = this.mTabLayoutRef.get();
            if (nearTabLayout != null) {
                int i3 = this.mScrollState;
                nearTabLayout.setScrollPosition(i, f, i3 != 2 || this.mPreviousScrollState == 1, i3 != 0);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            NearTabLayout nearTabLayout = this.mTabLayoutRef.get();
            if (nearTabLayout == null || nearTabLayout.getSelectedTabPosition() == i || i >= nearTabLayout.getTabCount()) {
                return;
            }
            int i2 = this.mScrollState;
            nearTabLayout.selectTab(nearTabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.mPreviousScrollState == 0));
        }

        public void reset() {
            this.mScrollState = 0;
            this.mPreviousScrollState = 0;
        }
    }

    public class TabView extends LinearLayout {
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines;
        private NearHintRedDot mHintRedDot;
        private ImageView mIconView;
        private boolean mSelectedByClick;
        private Tab mTab;
        private TextView mTextView;

        public TabView(Context context) {
            super(context);
            this.mDefaultMaxLines = 1;
            if (NearTabLayout.this.mTabBackgroundResId != 0) {
                ViewCompat.setBackground(this, ResourcesCompat.getDrawable(context.getResources(), NearTabLayout.this.mTabBackgroundResId, getContext().getTheme()));
            }
            ViewCompat.setPaddingRelative(this, NearTabLayout.this.mTabPaddingStart, NearTabLayout.this.mTabPaddingTop, NearTabLayout.this.mTabPaddingEnd, NearTabLayout.this.mTabPaddingBottom);
            setGravity(17);
            setOrientation(0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private void updateTextAndIcon(@Nullable TextView textView, @Nullable ImageView imageView) {
            Tab tab = this.mTab;
            Drawable icon = tab != null ? tab.getIcon() : null;
            Tab tab2 = this.mTab;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            Tab tab3 = this.mTab;
            CharSequence contentDescription = tab3 != null ? tab3.getContentDescription() : null;
            int iDpToPx = 0;
            if (imageView != null) {
                if (icon != null) {
                    imageView.setImageDrawable(icon);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(contentDescription);
            }
            boolean z = !TextUtils.isEmpty(text);
            if (textView != null) {
                if (z) {
                    textView.setText(text);
                    textView.setVisibility(0);
                    if (NearTabLayout.this.mTabAlreadyMeasure && NearTabLayout.this.mTabStrip != null) {
                        NearTabLayout.this.mTabAlreadyMeasure = false;
                        NearTabLayout.this.mTabStrip.requestLayout();
                    }
                    textView.setMaxLines(this.mDefaultMaxLines);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(contentDescription);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    iDpToPx = NearTabLayout.this.dpToPx(8);
                }
                if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    imageView.requestLayout();
                }
            }
            TooltipCompat.setTooltipText(this, z ? null : contentDescription);
        }

        public boolean getSelectedByClick() {
            return this.mSelectedByClick;
        }

        public Tab getTab() {
            return this.mTab;
        }

        public TextView getTextView() {
            return this.mTextView;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            NearHintRedDot nearHintRedDot;
            if (this.mTextView != null && (nearHintRedDot = this.mHintRedDot) != null && nearHintRedDot.getVisibility() != 8 && this.mHintRedDot.getMPointMode() != 0) {
                ((LinearLayout.LayoutParams) this.mHintRedDot.getLayoutParams()).bottomMargin = this.mTextView.getMeasuredHeight() / 2;
            }
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.mTab == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            NearTabLayout.this.mNeedAdjust = false;
            this.mSelectedByClick = true;
            this.mTab.select();
            this.mSelectedByClick = false;
            return true;
        }

        public void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setEnabled(z);
            }
            ImageView imageView = this.mIconView;
            if (imageView != null) {
                imageView.setEnabled(z);
            }
            View view = this.mCustomView;
            if (view != null) {
                view.setEnabled(z);
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            TextView textView;
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && (textView = this.mTextView) != null) {
                if (z) {
                    textView.setTypeface(this.mTab.isBold ? NearTabLayout.this.mSelectedTypeface : NearTabLayout.this.mNormalTypeface);
                } else {
                    textView.setTypeface(NearTabLayout.this.mNormalTypeface);
                }
            }
            NearTabLayout.this.changeTabTextFont(this, z);
            TextView textView2 = this.mTextView;
            if (textView2 != null) {
                vhc.b(textView2, !z);
            }
            TextView textView3 = this.mTextView;
            if (textView3 != null) {
                textView3.setSelected(z);
            }
            ImageView imageView = this.mIconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.mCustomView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable Tab tab) {
            if (tab != this.mTab) {
                this.mTab = tab;
                update();
            }
        }

        public final void update() {
            Tab tab = this.mTab;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView, -2, -2);
                }
                this.mCustomView = customView;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.mIconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(R.id.text1);
                this.mCustomTextView = textView2;
                if (textView2 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.mCustomIconView = (ImageView) customView.findViewById(R.id.icon);
            } else {
                View view = this.mCustomView;
                if (view != null) {
                    removeView(view);
                    this.mCustomView = null;
                }
                this.mCustomTextView = null;
                this.mCustomIconView = null;
            }
            if (this.mCustomView == null) {
                if (this.mIconView == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.nx_design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView2, 0);
                    this.mIconView = imageView2;
                }
                if (this.mTextView == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.nx_design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView3);
                    this.mTextView = textView3;
                    NearTabLayout nearTabLayout = NearTabLayout.this;
                    ViewCompat.setPaddingRelative(textView3, nearTabLayout.mTabPaddingStart, nearTabLayout.mTabPaddingTop, nearTabLayout.mTabPaddingEnd, nearTabLayout.mTabPaddingBottom);
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(this.mTextView);
                    z63.b(textView3, tab == null || tab.isBold());
                }
                View view2 = this.mHintRedDot;
                if (view2 != null) {
                    removeView(view2);
                }
                this.mHintRedDot = new NearHintRedDot(getContext());
                this.mHintRedDot.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                addView(this.mHintRedDot);
                this.mHintRedDot.setPointMode(tab != null ? tab.mPointMode : 0);
                if (this.mHintRedDot.getMPointMode() == 2) {
                    if (tab == null || tab.mPointNumber < 0) {
                        this.mHintRedDot.setPointText(tab != null ? tab.mPointText : "");
                    } else {
                        this.mHintRedDot.setPointNumber(tab.mPointNumber);
                    }
                }
                this.mTextView.setTextSize(0, NearTabLayout.this.mTabTextSize);
                this.mTextView.setIncludeFontPadding(false);
                if (isSelected()) {
                    this.mTextView.setTypeface((tab == null || tab.isBold()) ? NearTabLayout.this.mSelectedTypeface : NearTabLayout.this.mNormalTypeface);
                } else {
                    this.mTextView.setTypeface(NearTabLayout.this.mNormalTypeface);
                }
                ColorStateList colorStateList = NearTabLayout.this.mTabTextColors;
                if (colorStateList != null) {
                    this.mTextView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.mTextView, this.mIconView);
            } else {
                if (this.mTextView == null) {
                    this.mTextView = new TextView(getContext());
                }
                TextView textView4 = this.mCustomTextView;
                if (textView4 != null || this.mCustomIconView != null) {
                    updateTextAndIcon(textView4, this.mCustomIconView);
                }
            }
            setSelected(tab != null && tab.isSelected());
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }

        @Override // com.heytap.nearx.uikit.widget.NearTabLayout.OnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.heytap.nearx.uikit.widget.NearTabLayout.OnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.mViewPager.setCurrentItem(tab.getPosition(), false);
        }

        @Override // com.heytap.nearx.uikit.widget.NearTabLayout.OnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public NearTabLayout(Context context) {
        this(context, null);
    }

    private void addTabFromItemView(@NonNull TabItem tabItem) {
        Tab tabNewTab = newTab();
        CharSequence charSequence = tabItem.i;
        if (charSequence != null) {
            tabNewTab.setText(charSequence);
        }
        Drawable drawable = tabItem.f7512j;
        if (drawable != null) {
            tabNewTab.setIcon(drawable);
        }
        int i = tabItem.k;
        if (i != 0) {
            tabNewTab.setCustomView(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    private void addTabView(Tab tab) {
        this.mTabStrip.addView(tab.mView, tab.getPosition(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        addTabFromItemView((TabItem) view);
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.mTabStrip.childrenNeedLayout()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iCalculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
        if (scrollX != iCalculateScrollXForTab) {
            ensureScrollAnimator();
            this.mScrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        this.mTabStrip.animateIndicatorToPosition(i, 300);
    }

    private void applyModeAndGravity() {
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        int width = 0;
        if (getWidth() == 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.mTabStrip.getChildCount() ? this.mTabStrip.getChildAt(i2) : null;
        if (childAt != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            width = layoutParams.rightMargin + childAt.getWidth() + layoutParams.leftMargin;
        }
        if (childAt2 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            childAt2.getWidth();
            int i3 = layoutParams2.leftMargin;
        }
        int width2 = (width / 2) - (getWidth() / 2);
        if (childAt != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            width2 += ViewCompat.getLayoutDirection(this) == 0 ? (childAt.getLeft() - layoutParams3.leftMargin) + (getPaddingLeft() / 2) + (getPaddingRight() / 2) : ((childAt.getRight() + layoutParams3.rightMargin) - (getPaddingLeft() / 2)) - (getPaddingRight() / 2);
        }
        int i4 = (int) (width * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? width2 + i4 : width2 - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeTabTextFont(TabView tabView, boolean z) {
        if (tabView == null) {
            return;
        }
        TextView unused = tabView.mTextView;
    }

    private void configureTab(Tab tab, int i) {
        tab.setPosition(i);
        this.mTabs.add(i, tab);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).setPosition(i);
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{16842913, 16842910}, new int[]{-16842913, -16842910}, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        return new LinearLayout.LayoutParams(1, -1);
    }

    private TabView createTabView(@NonNull Tab tab) {
        Pools.Pool<TabView> pool = this.mTabViewPool;
        TabView tabViewAcquire = pool != null ? pool.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(tab);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        tabViewAcquire.setEnabled(isEnabled());
        return tabViewAcquire;
    }

    private void dispatchTabReselected(@NonNull Tab tab) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabReselected(tab);
        }
    }

    private void dispatchTabSelected(@NonNull Tab tab) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(@NonNull Tab tab) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void ensureScrollAnimator() {
        if (this.mScrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mScrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f));
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearTabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearTabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.mTabs.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Tab tab = this.mTabs.get(i);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                z = true;
                break;
            }
        }
        return z ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.mTabStrip.getIndicatorPosition();
    }

    private int getTabMinWidth() {
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTextColorAfterAnim() {
        int childCount = this.mTabStrip.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mTabStrip.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).mTextView.setTextColor(this.mTabTextColors);
            }
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.mTabStrip.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    private void updateAllTabs() {
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            this.mTabs.get(i).updateView();
        }
    }

    private void updateTextColor() {
        this.mNormalTextColor = this.mTabTextColors.getDefaultColor();
        int colorForState = this.mTabTextColors.getColorForState(new int[]{16842910, 16842913}, plc.b(getContext(), R$attr.nxColorPrimary, 0));
        this.mSelectedTextColor = colorForState;
        this.mTextColorRed = Math.abs(Color.red(colorForState) - Color.red(this.mNormalTextColor));
        this.mTextColorGreen = Math.abs(Color.green(this.mSelectedTextColor) - Color.green(this.mNormalTextColor));
        this.mTextColorBlue = Math.abs(Color.blue(this.mSelectedTextColor) - Color.blue(this.mNormalTextColor));
    }

    private void updateTextColors() {
        int childCount = this.mTabStrip.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
            if (tabView.mTextView != null) {
                tabView.mTextView.setTextColor(this.mTabTextColors);
                tabView.mTextView.setSelected(tabView.mTextView.isSelected());
            }
        }
    }

    public void addButton(@NonNull int i, View.OnClickListener onClickListener) {
        addButton(getResources().getDrawable(i), onClickListener);
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        if (this.mSelectedListeners.contains(onTabSelectedListener)) {
            return;
        }
        this.mSelectedListeners.add(onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.mSelectedListeners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int width;
        int scrollX;
        int width2;
        int width3;
        int scrollX2;
        super.dispatchDraw(canvas);
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip != null) {
            if (slidingTabStrip.mIndicatorBackgroundPaint != null) {
                canvas.drawRect(this.mTabStrip.mIndicatorBackgroundPaddingLeft + getScrollX(), getHeight() - this.mTabStrip.mIndicatorBackgroundHeight, (getWidth() + getScrollX()) - this.mTabStrip.mIndicatorBackgroundPaddingRight, getHeight(), this.mTabStrip.mIndicatorBackgroundPaint);
            }
            if (this.mTabStrip.mSelectedIndicatorPaint != null) {
                canvas.drawText(" ", 0.0f, 0.0f, this.mTabStrip.mSelectedIndicatorPaint);
                if (this.mTabStrip.mIndicatorRight > this.mTabStrip.mIndicatorLeft) {
                    int paddingLeft = getPaddingLeft() + this.mTabStrip.mIndicatorLeft;
                    int paddingLeft2 = getPaddingLeft() + this.mTabStrip.mIndicatorRight;
                    int scrollX3 = (getScrollX() + getPaddingLeft()) - this.mIndicatorPadding;
                    int scrollX4 = ((getScrollX() + getWidth()) - getPaddingRight()) + this.mIndicatorPadding;
                    if (paddingLeft2 > scrollX3 && paddingLeft < scrollX4) {
                        if (paddingLeft < scrollX3) {
                            paddingLeft = scrollX3;
                        }
                        if (paddingLeft2 > scrollX4) {
                            paddingLeft2 = scrollX4;
                        }
                        canvas.drawRect(paddingLeft, getHeight() - this.mTabStrip.mSelectedIndicatorHeight, paddingLeft2, getHeight(), this.mTabStrip.mSelectedIndicatorPaint);
                    }
                }
                if (this.mBottomDividerEnabled) {
                    canvas.drawRect(getLeft(), getHeight() - 1, getRight(), getHeight(), this.mTabStrip.mBottomDividerPaint);
                }
            }
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
        if (this.button.size() == 1) {
            Drawable drawable = this.button.get(0).buttonDrawable;
            int iApplyDimension2 = this.mButtonMarginEnd;
            if (iApplyDimension2 == -1) {
                iApplyDimension2 = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
            }
            if (fmc.a(this)) {
                width2 = getScrollX() + iApplyDimension2;
                width3 = iApplyDimension + iApplyDimension2;
                scrollX2 = getScrollX();
            } else {
                width2 = (getWidth() - (iApplyDimension + iApplyDimension2)) + getScrollX();
                width3 = getWidth() - iApplyDimension2;
                scrollX2 = getScrollX();
            }
            drawable.setBounds(width2, (getHeight() / 2) - ((int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics())), width3 + scrollX2, (getHeight() / 2) + ((int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics())));
            drawable.draw(canvas);
            return;
        }
        if (this.button.size() >= 2) {
            for (int i = 0; i < this.button.size(); i++) {
                int iApplyDimension3 = this.mButtonMarginEnd;
                if (iApplyDimension3 == -1) {
                    iApplyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
                }
                if (fmc.a(this)) {
                    scrollX = iApplyDimension3 + (((int) TypedValue.applyDimension(1, 42.0f, getResources().getDisplayMetrics())) * i);
                    width = getScrollX();
                } else {
                    width = getWidth() - ((iApplyDimension3 + iApplyDimension) + (((int) TypedValue.applyDimension(1, 42.0f, getResources().getDisplayMetrics())) * i));
                    scrollX = getScrollX();
                }
                int i2 = scrollX + width;
                int iApplyDimension4 = ((int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics())) + i2;
                Drawable drawable2 = this.button.get(i).buttonDrawable;
                drawable2.setBounds(i2, (getHeight() / 2) - ((int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics())), iApplyDimension4, (getHeight() / 2) + ((int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics())));
                drawable2.draw(canvas);
            }
        }
    }

    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public boolean enableTab(int i, boolean z) {
        TabView tabView;
        Tab tabAt = getTabAt(i);
        if (tabAt == null || (tabView = tabAt.mView) == null) {
            return false;
        }
        tabView.setEnabled(z);
        return true;
    }

    public float getDefaultIndicatoRatio() {
        return this.mDefaultIndicatorRatio;
    }

    public int getIndicatorAnimTime(int i, int i2) {
        return Math.min(300, (Math.abs(i - i2) * 50) + 150);
    }

    public int getIndicatorBackgroundHeight() {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return -1;
        }
        return slidingTabStrip.mIndicatorBackgroundHeight;
    }

    public int getIndicatorBackgroundPaddingLeft() {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return -1;
        }
        return slidingTabStrip.mIndicatorBackgroundPaddingLeft;
    }

    public int getIndicatorBackgroundPaddingRight() {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return -1;
        }
        return slidingTabStrip.mIndicatorBackgroundPaddingRight;
    }

    public int getIndicatorBackgroundPaintColor() {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return -1;
        }
        return slidingTabStrip.mIndicatorBackgroundPaint.getColor();
    }

    public int getIndicatorPadding() {
        return this.mIndicatorPadding;
    }

    public float getIndicatorWidthRatio() {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return -1.0f;
        }
        return slidingTabStrip.mIndicatorWidthRatio;
    }

    public int getRequestedTabMaxWidth() {
        return this.mRequestedTabMaxWidth;
    }

    public int getRequestedTabMinWidth() {
        return this.mRequestedTabMinWidth;
    }

    @ColorInt
    public int getSelectedIndicatorColor() {
        return this.mSelectedIndicatorColor;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.mSelectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.mTabs.get(i);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabGravity() {
        return this.mTabGravity;
    }

    public int getTabMinDivider() {
        return this.mTabMinDivider;
    }

    public int getTabMinMargin() {
        return this.mTabMinMargin;
    }

    public int getTabMode() {
        return this.mMode;
    }

    public int getTabPaddingBottom() {
        return this.mTabPaddingBottom;
    }

    public int getTabPaddingEnd() {
        return this.mTabPaddingEnd;
    }

    public int getTabPaddingStart() {
        return this.mTabPaddingStart;
    }

    public int getTabPaddingTop() {
        return this.mTabPaddingTop;
    }

    public SlidingTabStrip getTabStrip() {
        return this.mTabStrip;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    public float getTabTextSize() {
        return this.mTabTextSize;
    }

    @Deprecated
    public boolean isResizeText() {
        return false;
    }

    @NonNull
    public Tab newTab() {
        Tab tabAcquire = sTabPool.acquire();
        if (tabAcquire == null) {
            tabAcquire = new Tab();
        }
        tabAcquire.mParent = this;
        tabAcquire.mView = createTabView(tabAcquire);
        return tabAcquire;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mViewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mTabAlreadyMeasure = false;
    }

    @Override // com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mSetupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.mSetupViewPagerImplicitly = false;
        }
    }

    @Override // com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            for (int i = 0; i < this.button.size(); i++) {
                if (this.button.get(i).buttonClicklistener != null && this.button.get(i).buttonDrawable.getBounds().contains(((int) motionEvent.getX()) + getScrollX(), (int) motionEvent.getY())) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.mNeedAdjust || (i5 = this.mSelectedPosition) < 0 || i5 >= this.mTabStrip.getChildCount()) {
            return;
        }
        this.mNeedAdjust = false;
        scrollTo(calculateScrollXForTab(this.mSelectedPosition, 0.0f), 0);
    }

    @Override // com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iDpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iDpToPx, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.originalRequestedTabMaxWidth == -1) {
            this.mRequestedTabMaxWidth = (int) (size * DEFAULT_MAXIMUM_WIDTH_RATIO);
        }
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.mMode;
        if (i3 == 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(RuntimeSchema.MAX_TAG_VALUE, Integer.MIN_VALUE), i2);
        } else if (i3 == 1) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        setMeasuredDimension(size, getChildAt(0).getMeasuredHeight());
    }

    @Override // com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView, android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            for (int i = 0; i < this.button.size(); i++) {
                if (this.button.get(i).buttonClicklistener != null && this.button.get(i).buttonDrawable.getBounds().contains(((int) motionEvent.getX()) + getScrollX(), (int) motionEvent.getY())) {
                    this.button.get(i).buttonClicklistener.onClick(this);
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            PagerAdapter pagerAdapter2 = this.mPagerAdapter;
            if (pagerAdapter2 instanceof NearFragmentStatePagerAdapter) {
                NearFragmentStatePagerAdapter nearFragmentStatePagerAdapter = (NearFragmentStatePagerAdapter) pagerAdapter2;
                for (int i = 0; i < count; i++) {
                    if (nearFragmentStatePagerAdapter.getPageIcon(i) > 0) {
                        addTab(newTab().setIcon(nearFragmentStatePagerAdapter.getPageIcon(i)), false);
                    } else {
                        addTab(newTab().setText(nearFragmentStatePagerAdapter.getPageTitle(i)), false);
                    }
                }
            } else {
                for (int i2 = 0; i2 < count; i2++) {
                    addTab(newTab().setText(this.mPagerAdapter.getPageTitle(i2)), false);
                }
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearTabLayout, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearTabLayout, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            int i = R$styleable.NearTabLayout_nxTabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.mTabTextColors = typedArrayObtainStyledAttributes.getColorStateList(i);
            }
            int i2 = R$styleable.NearTabLayout_nxTabIndicatorColor;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(i2, 0));
            }
            updateTextColor();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void removeAllButtons(int i) {
        this.button.clear();
        int i2 = this.originalTabMinMargin;
        this.mTabMinMargin = i2;
        ViewCompat.setPaddingRelative(this, i2, 0, i2, 0);
        setTabMode(i);
        invalidate();
    }

    public void removeAllTabs() {
        for (int childCount = this.mTabStrip.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.mTabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
        this.mTabAlreadyMeasure = false;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        this.mSelectedListeners.remove(onTabSelectedListener);
    }

    public void removeTab(Tab tab) {
        if (tab.mParent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i) {
        Tab tab = this.mSelectedTab;
        int position = tab != null ? tab.getPosition() : 0;
        removeTabViewAt(i);
        Tab tabRemove = this.mTabs.remove(i);
        if (tabRemove != null) {
            tabRemove.reset();
            sTabPool.release(tabRemove);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).setPosition(i2);
        }
        if (position == i) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)));
        }
    }

    public void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mTabStrip.setSelectedIndicatorColor(z ? this.mSelectedIndicatorColor : this.mSelectedIndicatorDisableColor);
        for (int i = 0; i < getTabCount(); i++) {
            enableTab(i, z);
        }
    }

    public void setIndicatorAnimTime(int i) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip != null) {
            slidingTabStrip.mIndicatorAnimTime = i;
        }
    }

    public void setIndicatorBackgroundColor(int i) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return;
        }
        slidingTabStrip.mIndicatorBackgroundPaint.setColor(i);
    }

    public void setIndicatorBackgroundHeight(int i) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return;
        }
        slidingTabStrip.mIndicatorBackgroundHeight = i;
    }

    public void setIndicatorBackgroundPaddingLeft(int i) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return;
        }
        slidingTabStrip.mIndicatorBackgroundPaddingLeft = i;
    }

    public void setIndicatorBackgroundPaddingRight(int i) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return;
        }
        slidingTabStrip.mIndicatorBackgroundPaddingRight = i;
    }

    public void setIndicatorPadding(int i) {
        this.mIndicatorPadding = i;
        requestLayout();
    }

    public void setIndicatorWidthRatio(float f) {
        SlidingTabStrip slidingTabStrip = this.mTabStrip;
        if (slidingTabStrip == null) {
            return;
        }
        this.mDefaultIndicatorRatio = f;
        slidingTabStrip.mIndicatorWidthRatio = f;
    }

    public void setIsUpdateIndicatorPosition(boolean z) {
        this.isUpdateIndicatorPosition = z;
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        OnTabSelectedListener onTabSelectedListener2 = this.mSelectedListener;
        if (onTabSelectedListener2 != null) {
            removeOnTabSelectedListener(onTabSelectedListener2);
        }
        this.mSelectedListener = onTabSelectedListener;
        if (onTabSelectedListener != null) {
            addOnTabSelectedListener(onTabSelectedListener);
        }
    }

    public void setPagerAdapter(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setRequestedTabMaxWidth(int i) {
        this.mRequestedTabMaxWidth = i;
        this.originalRequestedTabMaxWidth = i;
    }

    public void setRequestedTabMinWidth(int i) {
        this.mRequestedTabMinWidth = i;
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.mTabStrip.setSelectedIndicatorColor(i);
        this.mSelectedIndicatorColor = i;
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.mTabStrip.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
    }

    public void setTabMinDivider(int i) {
        this.mTabMinDivider = i;
        requestLayout();
    }

    public void setTabMinMargin(int i) {
        this.mTabMinMargin = i;
        ViewCompat.setPaddingRelative(this, i, 0, i, 0);
        requestLayout();
    }

    public void setTabMode(int i) {
        if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabPaddingBottom(int i) {
        this.mTabPaddingBottom = i;
        requestLayout();
    }

    public void setTabPaddingEnd(int i) {
        this.mTabPaddingEnd = i;
        requestLayout();
    }

    public void setTabPaddingStart(int i) {
        this.mTabPaddingStart = i;
        requestLayout();
    }

    public void setTabPaddingTop(int i) {
        this.mTabPaddingTop = i;
        requestLayout();
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            updateTextColor();
            updateAllTabs();
        }
    }

    public void setTabTextColorsUnRefresh(@Nullable ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            this.mSelectedTextColor = this.mTabTextColors.getColorForState(new int[]{16842910, 16842913}, plc.b(getContext(), R$attr.nxColorPrimary, 0));
            this.mNormalTextColor = this.mTabTextColors.getDefaultColor();
            updateTextColors();
        }
    }

    public void setTabTextSize(float f) {
        if (this.mTabStrip != null) {
            this.mDefaultTabTextSize = f;
            this.mTabTextSize = f;
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
            tabView.setMinimumWidth(getTabMinWidth());
            if (tabView.mTextView != null) {
                ViewCompat.setPaddingRelative(tabView.mTextView, this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
            }
            if (z) {
                tabView.requestLayout();
            }
        }
    }

    public NearTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.NearTabLayoutStyle);
    }

    public void addButton(@NonNull Drawable drawable, View.OnClickListener onClickListener) {
        addButton(drawable, onClickListener, (Drawable) null, (View.OnClickListener) null);
    }

    public void addTab(@NonNull Tab tab, int i) {
        addTab(tab, i, this.mTabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void selectTab(Tab tab, boolean z) {
        Tab tab2 = this.mSelectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
            if (this.mTextIsAnimator) {
                this.mSelectedPosition = position;
            }
        }
        if (tab2 != null) {
            dispatchTabUnselected(tab2);
        }
        this.mSelectedTab = tab;
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.mTabStrip.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabStrip.setIndicatorPositionFromTabPosition(i, f);
        } else if (this.mTabStrip.mSelectedPosition != getSelectedTabPosition()) {
            this.mTabStrip.mSelectedPosition = getSelectedTabPosition();
            this.mTabStrip.updateIndicatorPosition();
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i, f), 0);
        if (z) {
            setSelectedTabView(iRound, f);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public NearTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectedPosition = 0;
        this.mLastOffset = 0.0f;
        this.mTabs = new ArrayList<>();
        this.mRequestedTabMaxWidth = -1;
        this.mSelectedListeners = new ArrayList<>();
        this.button = new ArrayList<>();
        this.mEvaluator = new ArgbEvaluator();
        this.mTabViewPool = new Pools.SimplePool(12);
        this.mTextIsAnimator = true;
        this.emptyP = new Paint();
        this.isUpdateIndicatorPosition = false;
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.mStyle = styleAttribute;
            if (styleAttribute == 0) {
                this.mStyle = i;
            }
        } else {
            this.mStyle = 0;
        }
        this.mSelectedTypeface = Typeface.create("sans-serif-medium", 0);
        this.mNormalTypeface = Typeface.create(REGULAR_FONT, 0);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearTabLayout, i, 0);
        slidingTabStrip.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabIndicatorHeight, 0));
        this.mSelectedIndicatorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearTabLayout_nxTabIndicatorColor, 0);
        this.mBottomDividerColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearTabLayout_nxTabBottomDividerColor, 0);
        this.mBottomDividerEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearTabLayout_nxTabBottomDividerEnabled, false);
        slidingTabStrip.setSelectedIndicatorColor(this.mSelectedIndicatorColor);
        slidingTabStrip.setBottomDividerColor(this.mBottomDividerColor);
        setIndicatorBackgroundHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabIndicatorBackgroundHeight, 0));
        setIndicatorBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearTabLayout_nxTabIndicatorBackgroundColor, 0));
        setIndicatorBackgroundPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabIndicatorBackgroundPaddingLeft, 0));
        setIndicatorBackgroundPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabIndicatorBackgroundPaddingRight, 0));
        setIndicatorWidthRatio(typedArrayObtainStyledAttributes.getFloat(R$styleable.NearTabLayout_nxTabIndicatorWidthRatio, 0.0f));
        this.mResizeHeight = getResources().getDimensionPixelOffset(R$dimen.nx_tab_layout_resize_height_default);
        this.mLongTextViewHeight = getResources().getDimensionPixelOffset(R$dimen.nx_tab_layout_long_text_view_height);
        this.mTabMinDivider = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearTabLayout_nxTabMinDivider, (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.mTabMinMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearTabLayout_nxTabMinMargin, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.mIndicatorPadding = getResources().getDimensionPixelOffset(R$dimen.nx_tab_layout_indicator_padding);
        int i2 = this.mTabMinMargin;
        ViewCompat.setPaddingRelative(this, i2, 0, i2, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabPadding, -1);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabPaddingStart, dimensionPixelSize);
        this.mTabPaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabPaddingBottom, this.mTabPaddingBottom);
        this.mTabPaddingStart = Math.max(0, this.mTabPaddingStart);
        this.mTabPaddingTop = Math.max(0, this.mTabPaddingTop);
        this.mTabPaddingEnd = Math.max(0, this.mTabPaddingEnd);
        this.mTabPaddingBottom = Math.max(0, this.mTabPaddingBottom);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearTabLayout_nxTabTextAppearance, R$style.NXTextAppearance_Design_ColorTab);
        this.mTabTextAppearance = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R$styleable.TextAppearance);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            this.mTabTextSize = dimensionPixelSize2;
            this.mDefaultTabTextSize = dimensionPixelSize2;
            this.mTabTextColors = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            int i3 = R$styleable.NearTabLayout_nxTabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                this.mTabTextColors = typedArrayObtainStyledAttributes.getColorStateList(i3);
                this.mTabTextColors = typedArrayObtainStyledAttributes.getColorStateList(i3);
            }
            this.mTabTextDisabledColor = plc.b(getContext(), R$attr.nxColorDisabledNeutral, 0);
            int i4 = R$styleable.NearTabLayout_nxTabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), this.mTabTextDisabledColor, typedArrayObtainStyledAttributes.getColor(i4, 0));
            }
            this.mTabBackgroundResId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearTabLayout_nxTabBackground, 0);
            this.mRequestedTabMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabMinWidth, -1);
            this.mMode = typedArrayObtainStyledAttributes.getInt(R$styleable.NearTabLayout_nxTabMode, 1);
            this.mTabGravity = typedArrayObtainStyledAttributes.getInt(R$styleable.NearTabLayout_nxTabGravity, 0);
            this.mDotHorizontalOffset = context.getResources().getDimensionPixelSize(R$dimen.nx_dot_horizontal_offset);
            int i5 = R$styleable.NearTabLayout_nxTabTextIsAnimator;
            this.mTextIsAnimator = typedArrayObtainStyledAttributes.getBoolean(i5, true);
            this.originalTabMinDivider = this.mTabMinDivider;
            this.originalTabMinMargin = this.mTabMinMargin;
            this.mSelectedIndicatorDisableColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearTabLayout_nxTabIndicatorDisableColor, getResources().getColor(R$color.nx_tab_indicator_disable_color));
            this.mRealDotHorizontalOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxDotHorizontalOffset, 0);
            this.mTabMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTabLayout_nxTabMarginTop, 0);
            int i6 = R$styleable.NearTabLayout_nxTabTextSize;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                float dimension = typedArrayObtainStyledAttributes.getDimension(i6, 0.0f);
                this.mTabTextSize = dimension;
                this.mDefaultTabTextSize = dimension;
            }
            this.originalRequestedTabMinWidth = this.mRequestedTabMinWidth;
            this.originalRequestedTabMaxWidth = this.mRequestedTabMaxWidth;
            this.mTextIsAnimator = typedArrayObtainStyledAttributes.getBoolean(i5, true);
            this.mButtonMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearTabLayout_nxTabButtonMarginEnd, -1);
            typedArrayObtainStyledAttributes.recycle();
            applyModeAndGravity();
            updateTextColor();
            setOverScrollMode(1);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void setupWithViewPager(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.mPageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.mAdapterChangeListener;
            if (adapterChangeListener != null) {
                this.mViewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        OnTabSelectedListener onTabSelectedListener = this.mCurrentVpSelectedListener;
        if (onTabSelectedListener != null) {
            removeOnTabSelectedListener(onTabSelectedListener);
            this.mCurrentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.mPageChangeListener.reset();
            viewPager.addOnPageChangeListener(this.mPageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.mCurrentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener(viewPagerOnTabSelectedListener);
            if (viewPager.getAdapter() != null) {
                setPagerAdapter(viewPager.getAdapter(), z);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new AdapterChangeListener();
            }
            this.mAdapterChangeListener.setAutoRefresh(z);
            viewPager.addOnAdapterChangeListener(this.mAdapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.mViewPager = null;
            setPagerAdapter(null, false);
        }
        this.mSetupViewPagerImplicitly = z2;
    }

    public void addButton(@NonNull int i, View.OnClickListener onClickListener, @NonNull int i2, View.OnClickListener onClickListener2) {
        addButton(getResources().getDrawable(i), onClickListener, getResources().getDrawable(i2), onClickListener2);
    }

    public void addTab(@NonNull Tab tab, boolean z) {
        addTab(tab, this.mTabs.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    private void setSelectedTabView(int i, float f) {
        TabView tabView;
        float f2;
        if (Math.abs(f - this.mLastOffset) > 0.5d || f == 0.0f) {
            this.mSelectedPosition = i;
        }
        this.mLastOffset = f;
        if (i != this.mSelectedPosition && isEnabled()) {
            TabView tabView2 = (TabView) this.mTabStrip.getChildAt(i);
            if (f >= 0.5f) {
                tabView = (TabView) this.mTabStrip.getChildAt(i - 1);
                f2 = f - 0.5f;
            } else {
                tabView = (TabView) this.mTabStrip.getChildAt(i + 1);
                f2 = 0.5f - f;
            }
            float f3 = f2 / 0.5f;
            if (tabView.mTextView != null) {
                tabView.mTextView.setTextColor(((Integer) this.mEvaluator.evaluate(f3, Integer.valueOf(this.mSelectedTextColor), Integer.valueOf(this.mNormalTextColor))).intValue());
            }
            if (tabView2.mTextView != null) {
                tabView2.mTextView.setTextColor(((Integer) this.mEvaluator.evaluate(f3, Integer.valueOf(this.mNormalTextColor), Integer.valueOf(this.mSelectedTextColor))).intValue());
            }
        }
        if (f != 0.0f || i >= getTabCount()) {
            return;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < getTabCount()) {
                View childAt = this.mTabStrip.getChildAt(i2);
                TabView tabView3 = (TabView) childAt;
                if (tabView3.mTextView != null) {
                    tabView3.mTextView.setTextColor(this.mTabTextColors);
                }
                if (i2 != i) {
                    z = false;
                }
                childAt.setSelected(z);
                i2++;
            } else {
                this.mNeedAdjust = true;
                return;
            }
        }
    }

    public void addButton(@NonNull Drawable drawable, View.OnClickListener onClickListener, Drawable drawable2, View.OnClickListener onClickListener2) {
        this.button.clear();
        this.button.add(new PrivateButton(drawable, onClickListener));
        if (drawable2 != null) {
            this.button.add(new PrivateButton(drawable2, onClickListener2));
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
        if (this.button.size() == 1) {
            int iApplyDimension2 = this.mButtonMarginEnd;
            if (iApplyDimension2 == -1) {
                iApplyDimension2 = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
            }
            setPaddingRelative(getPaddingStart(), getPaddingTop(), this.originalTabMinMargin + iApplyDimension + iApplyDimension2, getPaddingBottom());
        } else {
            int iApplyDimension3 = this.mButtonMarginEnd;
            if (iApplyDimension3 == -1) {
                iApplyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
            }
            setPaddingRelative(getPaddingStart(), getPaddingTop(), this.originalTabMinMargin + iApplyDimension + iApplyDimension3 + ((this.button.size() - 1) * ((int) TypedValue.applyDimension(1, 42.0f, getResources().getDisplayMetrics()))), getPaddingBottom());
        }
        setTabMode(0);
        invalidate();
    }

    public void addTab(@NonNull Tab tab, int i, boolean z) {
        if (tab.mParent == this) {
            configureTab(tab, i);
            addTabView(tab);
            if (z) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Deprecated
    public void setTabTextSize(float f, boolean z) {
        setTabTextSize(f);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, this.mTabTextDisabledColor, i2));
    }

    public void setTabTextColorsUnRefresh(int i, int i2) {
        setTabTextColorsUnRefresh(createColorStateList(i, this.mTabTextDisabledColor, i2));
    }
}
