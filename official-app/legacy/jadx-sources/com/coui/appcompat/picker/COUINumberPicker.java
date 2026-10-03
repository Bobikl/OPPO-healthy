package com.coui.appcompat.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.TimeModel;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.fm2;
import com.oplus.aiunit.vision.gj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.pzc;
import com.oplus.aiunit.vision.wvk;
import com.oplus.os.LinearmotorVibrator;
import com.oplus.wrapper.os.SystemProperties;
import com.support.picker.R$attr;
import com.support.picker.R$dimen;
import com.support.picker.R$raw;
import com.support.picker.R$string;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUINumberPicker extends LinearLayout {
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_MIDDLE = 0;
    public static final int ALIGN_RIGHT = 2;
    private static final float BASE_RATIO = 0.6f;
    private static final int CALCULATE_MAX_COUNT = 100;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300;
    private static final int LOW_VELOCITY_THRESHOLD = 1000;
    private static final int MAX_VELOCITY = 5000;
    private static final int MID_VELOCITY_THRESHOLD = 2000;
    private static final int MILLISECOND_VELOCITY_UNIT = 1000;
    private static final int MINIMUM_FLING_VELOCITY = 750;
    private static final int MIN_BACKGROUND_DIVIDER_HEIGHT = 1;
    private static final int MSG_PLAY_SOUND = 0;
    private static final int MSG_PLAY_VIBRATE = 2;
    private static final int MSG_TALKBACK_VALUE_CHANGE = 1;
    private static final float NEXT_VALUE_ERROR = 0.05f;
    private static final int ONE_SECOND_MILLIS = 1000;
    private static final int PLAY_VIBRATE_DELAY_DURATION = 40;
    private static final float POINT_ZERO_ONE = 0.01f;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 300;
    public static final int SELECTOR_INDEX_IGNORE = Integer.MIN_VALUE;
    private static final int SELECTOR_ITEM_DRAW_OUTSIDE_CACHE_NUMBER = 1;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_WHEEL_ITEM_COUNT_DEFAULT = 5;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final int STACK_DEPTH = 30;
    private static final String TAG = "COUINumberPicker";
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
    private static final float VALUE_SIXTY = 60.0f;
    private static final float VELOCITY_SPEED_UP_RATIO = 1.8f;
    public static final int VIBRATE_LEVEL_CRISP = 0;
    public static final int VIBRATE_LEVEL_SOFT = 1;
    private final int MAX_SCROLL_OFFSET;
    private AccessibilityManager mAccessibilityManager;
    private a mAccessibilityNodeProvider;
    private final Scroller mAdjustScroller;
    private int mAlignPosition;
    private int mAlphaEnd;
    private int mAlphaStart;
    private int mBackgroundColor;
    private int mBackgroundDividerHeight;
    private int mBackgroundLeft;
    private Paint mBackgroundPaint;
    private int mBackgroundRadius;
    private int mBlueEnd;
    private int mBlueStart;
    private int mBottomSelectionDividerBottom;
    private int mCalculateCount;
    private b mChangeCurrentByOneFromLongPressCommand;
    private int mClickSoundId;
    private boolean mCurrentLanguageTooLong;
    private int mCurrentScrollOffset;
    private int mDebugY;
    private boolean mDecrementVirtualButtonPressed;
    private int mDeltaMoveY;
    private float mDiffusion;
    private String[] mDisplayedValues;
    private int mDrawItemOffsetY;
    private boolean mEnableAdaptiveVibrator;
    private final float mFlingFriction;
    private final Scroller mFlingScroller;
    int mFocusTextColor;
    private int mFocusTextSize;
    private c mFormatter;
    private int mGradientPositionBottom;
    private int mGradientPositionTop;
    private int mGreenEnd;
    private int mGreenStart;
    private Handler mHandler;
    private boolean mHasBackground;
    private boolean mHasMotorVibrator;
    private boolean mIgnorable;
    private float mIgnoreBarHeight;
    private float mIgnoreBarSpacing;
    private float mIgnoreBarWidth;
    private boolean mIncrementVirtualButtonPressed;
    private int mInitTextMargin;
    private long mLastDownEventTime;
    private float mLastDownEventY;
    private float mLastDownOrMoveEventY;
    private int mLastHandledDownDpadKeyCode;
    private int mLastHoveredChildVirtualViewId;
    private Object mLinearMotorVibrator;
    private long mLongPressUpdateInterval;
    private final int mMaxHeight;
    private int mMaxValue;
    private int mMaxViewWidth;
    private int mMaxWidth;
    private int mMaximumFlingVelocity;
    private final Paint mMeasureTextSelectorPaint;
    private final int mMinHeight;
    private int mMinValue;
    private final int mMinWidth;
    private int mMinimumFlingVelocity;
    private float mNormalTextBottom;
    int mNormalTextColor;
    private int mNormalTextSize;
    private float mNormalTextTop;
    private int mNumberPickerPaddingLeft;
    private int mNumberPickerPaddingRight;
    private d mOnScrollListener;
    private e mOnScrollingStopListener;
    private f mOnValueChangeListener;
    private boolean mPerformClickOnTap;
    private final float mPhysicalCoeff;
    private int mPickerOffset;
    private final float mPpi;
    private final g mPressedStateHelper;
    private int mPreviousScrollerY;
    private int mPreviousTime;
    private int mRedEnd;
    private int mRedStart;
    int mRefreshStyle;
    private int mScrollState;
    private int mScrollerVelocity;
    private int mSelectedValueWidth;
    private int mSelectorElementHeight;
    private final SparseArray<String> mSelectorIndexToStringCache;
    private int[] mSelectorIndices;
    private int mSelectorItemCount;
    private int mSelectorMiddleItemIndex;
    private int mSelectorTextGapHeight;
    private final Paint mSelectorWheelPaint;
    private fm2 mSoundUtil;
    private long mStartCalculateTime;
    private String mTalkbackSuffix;
    private int mTextMargin;
    private int mTopSelectionDividerTop;
    private int mTouchEffectInterval;
    private pzc mTouchEffectThread;
    private int mTouchSlop;
    private i mTwoDigitFormatter;
    private int mUnitMargin;
    private int mUnitMarginBottom;
    private int mUnitMinWidth;
    private String mUnitText;
    private final Paint mUnitTextPaint;
    private int mUnitTextSize;
    private int mValue;
    private VelocityTracker mVelocityTracker;
    private int mVelocityY;
    private boolean mVerticalFadingEdgeEnable;
    private float mVibrateIntensity;
    private int mVibrateLevel;
    private int mVisualWidth;
    private boolean mWrapSelectorWheel;
    private boolean mWrapSelectorWheelPreferred;
    private static final PathInterpolator FLING_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 0.4f, 1.0f);
    private static final PathInterpolator SLOW_FLING_INTERPOLATOR = new PathInterpolator(0.0f, 0.23f, 0.1f, 1.0f);
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    public class a extends AccessibilityNodeProvider {
        public final Rect a = new Rect();
        public final int[] b = new int[2];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1849c = Integer.MIN_VALUE;

        public a() {
        }

        public final AccessibilityNodeInfo a(String str, int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(COUINumberPicker.class.getName());
            accessibilityNodeInfoObtain.setPackageName(COUINumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(COUINumberPicker.this);
            if (!TextUtils.isEmpty(COUINumberPicker.this.mTalkbackSuffix)) {
                str = str + COUINumberPicker.this.mTalkbackSuffix;
            }
            accessibilityNodeInfoObtain.setText(str);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityNodeInfoObtain.setStateDescription(str);
            }
            accessibilityNodeInfoObtain.setParent((View) COUINumberPicker.this.getParentForAccessibility());
            accessibilityNodeInfoObtain.setEnabled(COUINumberPicker.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            accessibilityNodeInfoObtain.setFocusable(true);
            accessibilityNodeInfoObtain.setAccessibilityFocused(this.f1849c == -1);
            Rect rect = this.a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            accessibilityNodeInfoObtain.setVisibleToUser(COUINumberPicker.this.isVisibleToUserRef(null));
            int[] iArr = this.b;
            COUINumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.f1849c != -1) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.f1849c == -1) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (COUINumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
                accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, COUINumberPicker.this.getMinValue() - 1, COUINumberPicker.this.getMaxValue() + 1, COUINumberPicker.this.getValue()));
                AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfoObtain).setRoleDescription(COUINumberPicker.this.getContext().getResources().getString(R$string.time_picker));
                if (COUINumberPicker.this.getWrapSelectorWheel() || COUINumberPicker.this.getValue() < COUINumberPicker.this.getMaxValue()) {
                    accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
                }
                if (COUINumberPicker.this.getWrapSelectorWheel() || COUINumberPicker.this.getValue() > COUINumberPicker.this.getMinValue()) {
                    accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
                }
            }
            return accessibilityNodeInfoObtain;
        }

        public final void b(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 1) {
                String strC = c(COUINumberPicker.this.mValue + 1);
                if (TextUtils.isEmpty(strC) || !strC.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (i != 3) {
                return;
            }
            String strC2 = c(COUINumberPicker.this.mValue - 1);
            if (TextUtils.isEmpty(strC2) || !strC2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(3));
        }

        public final String c(int i) {
            if (COUINumberPicker.this.mWrapSelectorWheel) {
                i = COUINumberPicker.this.getWrappedSelectorIndex(i);
            }
            if (i > COUINumberPicker.this.mMaxValue || i < COUINumberPicker.this.mMinValue) {
                return null;
            }
            return COUINumberPicker.this.mDisplayedValues == null ? COUINumberPicker.this.formatNumber(i) : COUINumberPicker.this.mDisplayedValues[i - COUINumberPicker.this.mMinValue];
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return i != -1 ? super.createAccessibilityNodeInfo(i) : a(c(COUINumberPicker.this.mValue), COUINumberPicker.this.getScrollX(), COUINumberPicker.this.getScrollY(), COUINumberPicker.this.getScrollX() + (COUINumberPicker.this.getRight() - COUINumberPicker.this.getLeft()), COUINumberPicker.this.getScrollY() + (COUINumberPicker.this.getBottom() - COUINumberPicker.this.getTop()));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void d(int i, String str) {
            if (!TextUtils.isEmpty(COUINumberPicker.this.mTalkbackSuffix)) {
                str = str + COUINumberPicker.this.mTalkbackSuffix;
            }
            if (COUINumberPicker.this.mAccessibilityManager.isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
                accessibilityEventObtain.setPackageName(COUINumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(COUINumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(COUINumberPicker.this, -1);
                COUINumberPicker cOUINumberPicker = COUINumberPicker.this;
                cOUINumberPicker.requestSendAccessibilityEvent(cOUINumberPicker, accessibilityEventObtain);
            }
        }

        public void e(int i, int i2) {
            if (i != -1) {
                return;
            }
            d(i2, c(COUINumberPicker.this.mValue));
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                b(lowerCase, 3, arrayList);
                b(lowerCase, 2, arrayList);
                b(lowerCase, 1, arrayList);
                return arrayList;
            }
            if (i != 1 && i != 2 && i != 3) {
                return super.findAccessibilityNodeInfosByText(str, i);
            }
            b(lowerCase, i, arrayList);
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i == -1) {
                if (i2 == 64) {
                    if (this.f1849c == i) {
                        return false;
                    }
                    this.f1849c = i;
                    COUINumberPicker.this.sendAccessibilityEvent(32768);
                    return true;
                }
                if (i2 == 128) {
                    if (this.f1849c != i) {
                        return false;
                    }
                    this.f1849c = Integer.MIN_VALUE;
                    COUINumberPicker.this.sendAccessibilityEvent(65536);
                    return true;
                }
                if (i2 == 4096) {
                    if (!COUINumberPicker.this.isEnabled()) {
                        return false;
                    }
                    COUINumberPicker.this.onScrollStateChange(2);
                    COUINumberPicker.this.changeValueByOne(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!COUINumberPicker.this.isEnabled()) {
                        return false;
                    }
                    COUINumberPicker.this.onScrollStateChange(2);
                    COUINumberPicker.this.changeValueByOne(false);
                    return true;
                }
            }
            return super.performAction(i, i2, bundle);
        }
    }

    public class b implements Runnable {
        public boolean i;

        public b() {
        }

        public final void b(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            COUINumberPicker.this.changeValueByOne(this.i);
            COUINumberPicker cOUINumberPicker = COUINumberPicker.this;
            cOUINumberPicker.postDelayed(this, cOUINumberPicker.mLongPressUpdateInterval);
        }
    }

    public interface c {
        String format(int i);
    }

    public interface d {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
    }

    public interface e {
        void onScrollingStop();
    }

    public interface f {
        void a(COUINumberPicker cOUINumberPicker, int i, int i2);
    }

    public class g implements Runnable {
        public static final int BUTTON_DECREMENT = 2;
        public static final int BUTTON_INCREMENT = 1;
        public final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f1851j = 2;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1852l;

        public g() {
        }

        public void a(int i) {
            c();
            this.f1852l = 1;
            this.k = i;
            COUINumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void b(int i) {
            c();
            this.f1852l = 2;
            this.k = i;
            COUINumberPicker.this.post(this);
        }

        public void c() {
            this.f1852l = 0;
            this.k = 0;
            COUINumberPicker.this.removeCallbacks(this);
            if (COUINumberPicker.this.mIncrementVirtualButtonPressed) {
                COUINumberPicker.this.mIncrementVirtualButtonPressed = false;
                COUINumberPicker cOUINumberPicker = COUINumberPicker.this;
                cOUINumberPicker.invalidate(0, cOUINumberPicker.mBottomSelectionDividerBottom, COUINumberPicker.this.getRight(), COUINumberPicker.this.getBottom());
            }
            COUINumberPicker.this.mDecrementVirtualButtonPressed = false;
            if (COUINumberPicker.this.mDecrementVirtualButtonPressed) {
                COUINumberPicker cOUINumberPicker2 = COUINumberPicker.this;
                cOUINumberPicker2.invalidate(0, 0, cOUINumberPicker2.getRight(), COUINumberPicker.this.mTopSelectionDividerTop);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f1852l;
            if (i == 1) {
                int i2 = this.k;
                if (i2 == 1) {
                    COUINumberPicker.this.mIncrementVirtualButtonPressed = true;
                    COUINumberPicker cOUINumberPicker = COUINumberPicker.this;
                    cOUINumberPicker.invalidate(0, cOUINumberPicker.mBottomSelectionDividerBottom, COUINumberPicker.this.getRight(), COUINumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    COUINumberPicker.this.mDecrementVirtualButtonPressed = true;
                    COUINumberPicker cOUINumberPicker2 = COUINumberPicker.this;
                    cOUINumberPicker2.invalidate(0, 0, cOUINumberPicker2.getRight(), COUINumberPicker.this.mTopSelectionDividerTop);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.k;
            if (i3 == 1) {
                if (!COUINumberPicker.this.mIncrementVirtualButtonPressed) {
                    COUINumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                COUINumberPicker.access$180(COUINumberPicker.this, 1);
                COUINumberPicker cOUINumberPicker3 = COUINumberPicker.this;
                cOUINumberPicker3.invalidate(0, cOUINumberPicker3.mBottomSelectionDividerBottom, COUINumberPicker.this.getRight(), COUINumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!COUINumberPicker.this.mDecrementVirtualButtonPressed) {
                COUINumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            COUINumberPicker.access$380(COUINumberPicker.this, 1);
            COUINumberPicker cOUINumberPicker4 = COUINumberPicker.this;
            cOUINumberPicker4.invalidate(0, 0, cOUINumberPicker4.getRight(), COUINumberPicker.this.mTopSelectionDividerTop);
        }
    }

    public class h extends Handler {
        public h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what == 0) {
                COUINumberPicker.this.playSoundEffect();
            }
            super.handleMessage(message);
        }
    }

    public class i implements c {
        public final StringBuilder a = new StringBuilder();
        public final Object[] b = new Object[1];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Formatter f1853c;
        public DecimalFormat d;

        public i() {
            a(Locale.getDefault());
        }

        public final void a(Locale locale) {
            this.f1853c = new Formatter(this.a, locale);
            this.d = new DecimalFormat("00");
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.c
        public String format(int i) {
            this.b[0] = Integer.valueOf(i);
            StringBuilder sb = this.a;
            sb.delete(0, sb.length());
            return this.d.format(i);
        }
    }

    public COUINumberPicker(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean access$180(COUINumberPicker cOUINumberPicker, int i2) {
        ?? r2 = (i2 ^ (cOUINumberPicker.mIncrementVirtualButtonPressed ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        cOUINumberPicker.mIncrementVirtualButtonPressed = r2;
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean access$380(COUINumberPicker cOUINumberPicker, int i2) {
        ?? r2 = (i2 ^ (cOUINumberPicker.mDecrementVirtualButtonPressed ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        cOUINumberPicker.mDecrementVirtualButtonPressed = r2;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeValueByOne(boolean z) {
        if (!moveToFinalScrollerPosition(this.mFlingScroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        this.mPreviousScrollerY = 0;
        if (z) {
            this.mFlingScroller.startScroll(0, 0, 0, (int) ((-this.mSelectorElementHeight) - this.mDiffusion), 300);
        } else {
            this.mFlingScroller.startScroll(0, 0, 0, (int) (this.mSelectorElementHeight + this.mDiffusion), 300);
        }
        invalidate();
    }

    private float computeDeceleration(float f2) {
        return this.mPpi * 386.0878f * f2;
    }

    private void decrementSelectorIndices(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = getWrappedSelectorIndex(iArr[i2], -1);
        }
        ensureCachedScrollSelectorValue(iArr[0]);
    }

    private void ensureCachedScrollSelectorValue(int i2) {
        String number;
        SparseArray<String> sparseArray = this.mSelectorIndexToStringCache;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.mMinValue;
        if (i2 < i3 || i2 > this.mMaxValue) {
            number = "";
        } else {
            String[] strArr = this.mDisplayedValues;
            number = strArr != null ? strArr[i2 - i3] : formatNumber(i2);
        }
        sparseArray.put(i2, number);
    }

    private boolean ensureScrollWheelAdjusted() {
        int i2 = -this.mCurrentScrollOffset;
        if (i2 == 0) {
            return false;
        }
        this.mPreviousScrollerY = 0;
        getSplineFlingDistance(this.mVelocityY);
        Math.signum(this.mVelocityY);
        getSplineFlingDuration(this.mVelocityY);
        float fAbs = Math.abs(i2);
        int i3 = this.mSelectorElementHeight;
        float f2 = this.mDiffusion;
        if (fAbs > (i3 + f2) / 2.0f) {
            i2 = (int) (i2 + (i2 > 0 ? (-i3) - f2 : i3 + f2));
        }
        this.mAdjustScroller.startScroll(0, 0, 0, i2, 300);
        invalidate();
        return true;
    }

    private void fling(int i2) {
        this.mVelocityY = i2;
        this.mPreviousScrollerY = 0;
        float f2 = i2;
        double splineFlingDistance = getSplineFlingDistance(f2);
        int i3 = this.mSelectorElementHeight;
        float f3 = this.mDiffusion;
        double d2 = splineFlingDistance > ((double) (((float) i3) + f3)) ? splineFlingDistance - (splineFlingDistance % ((double) (i3 + f3))) : splineFlingDistance % ((double) (i3 + f3));
        int i4 = this.mDeltaMoveY;
        double d3 = d2 + ((double) i4);
        this.mFlingScroller.startScroll(0, 0, 0, (int) (i2 < 0 ? -(d3 + ((double) ((this.mCurrentScrollOffset - i4) % (i3 + f3)))) : d3 - ((double) ((this.mCurrentScrollOffset + i4) % (i3 + f3)))), (int) (getSplineFlingDuration(f2) * 1.5f));
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatNumber(int i2) {
        c cVar = this.mFormatter;
        return cVar != null ? cVar.format(i2) : formatNumberWithLocale(i2);
    }

    private static String formatNumberWithLocale(int i2) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i2));
    }

    private String getCaller(StackTraceElement[] stackTraceElementArr, int i2) {
        int i3 = i2 + 4;
        if (i3 >= stackTraceElementArr.length) {
            return "<bottom of call stack>";
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[i3];
        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    private String getCallers(int i2) {
        boolean z;
        try {
            z = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        } catch (Error | Exception unused) {
            z = false;
        }
        if (!z) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(getCaller(stackTrace, i3));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    private float getDampRatio() {
        return Math.min(VELOCITY_SPEED_UP_RATIO, 1.6f);
    }

    private int getGradientCoeff(int i2) {
        return Math.abs(i2 - (this.mSelectorMiddleItemIndex * this.mSelectorElementHeight)) / this.mSelectorElementHeight;
    }

    private double getSplineDeceleration(float f2) {
        return Math.log((Math.abs(f2) * 0.35f) / (this.mFlingFriction * this.mPhysicalCoeff));
    }

    private double getSplineFlingDistance(float f2) {
        double splineDeceleration = getSplineDeceleration(f2);
        float f3 = DECELERATION_RATE;
        return ((double) (this.mFlingFriction * this.mPhysicalCoeff)) * Math.exp((((double) f3) / (((double) f3) - 1.0d)) * splineDeceleration);
    }

    private int getSplineFlingDuration(float f2) {
        return (int) (Math.exp(getSplineDeceleration(f2) / (((double) DECELERATION_RATE) - 1.0d)) * 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWrappedSelectorIndex(int i2) {
        return getWrappedSelectorIndex(i2, 0);
    }

    private int gradualChange(int i2, int i3, float f2) {
        return i3 - ((int) (((i3 - i2) * 2) * f2));
    }

    private float gradualChangeTextSize(int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.mSelectorMiddleItemIndex - 1;
        int i8 = this.mSelectorElementHeight;
        int i9 = i7 * i8;
        int length = (this.mSelectorIndices.length - 3) * i8;
        double d2 = i6;
        double d3 = i9;
        if (d2 > d3 - (((double) i8) * 0.5d) && d2 < d3 + (((double) i8) * 0.5d)) {
            return i3 - ((((i3 - i2) * 2.0f) * Math.abs(i6 - i9)) / this.mSelectorElementHeight);
        }
        if (i6 <= i9 - i8) {
            return i4 + (((((i5 - i4) * 1.0f) * (i6 + 0)) / i8) / 2.0f);
        }
        return i6 >= i9 + i8 ? i4 + (((((i5 - i4) * 1.0f) * (length - i6)) / i8) / 2.0f) : i5;
    }

    private void incrementSelectorIndices(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = getWrappedSelectorIndex(iArr[i2], 1);
        }
        ensureCachedScrollSelectorValue(iArr[iArr.length - 1]);
    }

    private void initColorGradientRes() {
        int i2 = this.mSelectorElementHeight;
        int i3 = this.mSelectorMiddleItemIndex;
        this.mGradientPositionTop = (int) (((double) i2) * (((double) i3) - 0.5d));
        this.mGradientPositionBottom = (int) (((double) i2) * (((double) i3) + 0.5d));
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(this.mVerticalFadingEdgeEnable);
        setFadingEdgeLength(((getBottom() - getTop()) - this.mNormalTextSize) / 2);
    }

    private void initializeSelectorWheel() {
        initializeSelectorWheelIndices();
        int[] iArr = this.mSelectorIndices;
        int iMax = (int) ((Math.max(0, ((getBottom() - getTop()) - ((iArr.length - 2) * this.mNormalTextSize)) - this.mPickerOffset) / (iArr.length - 2)) + 0.5f);
        this.mSelectorTextGapHeight = iMax;
        this.mSelectorElementHeight = this.mNormalTextSize + iMax;
        this.mCurrentScrollOffset = 0;
        this.mTopSelectionDividerTop = (getHeight() / 2) - (this.mSelectorElementHeight / 2);
        this.mBottomSelectionDividerBottom = (getHeight() / 2) + (this.mSelectorElementHeight / 2);
    }

    private void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i2 = 0; i2 < this.mSelectorIndices.length; i2++) {
            int i3 = i2 - this.mSelectorMiddleItemIndex;
            int wrappedSelectorIndex = this.mIgnorable ? getWrappedSelectorIndex(value, i3) : i3 + value;
            if (this.mWrapSelectorWheel) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            iArr[i2] = wrappedSelectorIndex;
            ensureCachedScrollSelectorValue(wrappedSelectorIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVisibleToUserRef(Rect rect) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("isVisibleToUser", Rect.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(this, rect)).booleanValue();
        } catch (Exception e2) {
            Log.e(TAG, "isUserVisible: error=" + e2.getMessage());
            return false;
        }
    }

    private int makeMeasureSpec(int i2, int i3) {
        if (i3 == -1) {
            return i2;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            if (mode == 1073741824) {
                return i2;
            }
            throw new IllegalArgumentException("Unknown measure mode: " + mode);
        }
        String str = this.mUnitText;
        if (str != null) {
            float fMeasureText = this.mUnitTextPaint.measureText(str);
            int iMeasureText = this.mUnitMinWidth;
            if (fMeasureText > iMeasureText) {
                iMeasureText = (int) this.mUnitTextPaint.measureText(this.mUnitText);
            }
            int i4 = this.mInitTextMargin;
            size = iMeasureText + (i4 - this.mUnitMinWidth) + i4 + this.mSelectedValueWidth;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    private boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = -((this.mCurrentScrollOffset + finalY) % this.mSelectorElementHeight);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.mSelectorElementHeight;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    private void notifyChange(int i2, int i3) {
        f fVar = this.mOnValueChangeListener;
        if (fVar != null) {
            fVar.a(this, i2, this.mValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScrollStateChange(int i2) {
        if (this.mScrollState == i2) {
            return;
        }
        this.mScrollState = i2;
        if (i2 == 0) {
            String str = this.mSelectorIndexToStringCache.get(getValue());
            if (!TextUtils.isEmpty(this.mTalkbackSuffix)) {
                str = str + this.mTalkbackSuffix;
            }
            announceForAccessibility(str);
            e eVar = this.mOnScrollingStopListener;
            if (eVar != null) {
                eVar.onScrollingStop();
            }
        }
    }

    private void onScrollerFinished(Scroller scroller) {
        if (scroller == this.mFlingScroller) {
            ensureScrollWheelAdjusted();
            onScrollStateChange(0);
        }
    }

    private boolean performAdaptiveFeedback() {
        int iAbs;
        if (this.mLinearMotorVibrator == null) {
            LinearmotorVibrator linearmotorVibratorE = wvk.e(getContext());
            this.mLinearMotorVibrator = linearmotorVibratorE;
            this.mHasMotorVibrator = linearmotorVibratorE != null;
        }
        if (this.mLinearMotorVibrator == null) {
            return false;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
            iAbs = (int) Math.abs(this.mVelocityTracker.getYVelocity());
        } else {
            iAbs = Math.abs(this.mScrollerVelocity);
        }
        int i2 = iAbs;
        wvk.k((LinearmotorVibrator) this.mLinearMotorVibrator, i2 > 2000 ? 0 : 1, i2, this.mMaximumFlingVelocity, 1200, 1600, this.mVibrateLevel, this.mVibrateIntensity);
        return true;
    }

    private void performFeedback() {
        if ((this.mHasMotorVibrator && this.mEnableAdaptiveVibrator && performAdaptiveFeedback()) || performHapticFeedback(308)) {
            return;
        }
        performHapticFeedback(302);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSoundEffect() {
        this.mSoundUtil.d(getContext(), this.mClickSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    private void postChangeCurrentByOneFromLongPress(boolean z, long j2) {
        b bVar = this.mChangeCurrentByOneFromLongPressCommand;
        if (bVar == null) {
            this.mChangeCurrentByOneFromLongPressCommand = new b();
        } else {
            removeCallbacks(bVar);
        }
        this.mChangeCurrentByOneFromLongPressCommand.b(z);
        postDelayed(this.mChangeCurrentByOneFromLongPressCommand, j2);
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void removeAllCallbacks() {
        b bVar = this.mChangeCurrentByOneFromLongPressCommand;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.mPressedStateHelper.c();
    }

    private void removeChangeCurrentByOneFromLongPress() {
        b bVar = this.mChangeCurrentByOneFromLongPressCommand;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    private int resolveSizeAndStateRespectingMinSize(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    private void setValueInternal(int i2, boolean z) {
        if (this.mStartCalculateTime == -1) {
            this.mStartCalculateTime = System.currentTimeMillis();
            this.mCalculateCount = 0;
        } else if (System.currentTimeMillis() - this.mStartCalculateTime < 1000) {
            int i3 = this.mCalculateCount + 1;
            this.mCalculateCount = i3;
            if (i3 >= 100) {
                this.mCalculateCount = 0;
                Log.d(TAG, getCallers(30) + "\nmCurrentScrollOffset = " + this.mCurrentScrollOffset + " ,mSelectorTextGapHeight = " + this.mSelectorTextGapHeight + " ,mSelectorElementHeight = " + this.mSelectorElementHeight + " ,mSelectorMiddleItemIndex = " + this.mSelectorMiddleItemIndex + " ,mWrapSelectorWheel = " + this.mWrapSelectorWheel + " ,mDebugY = " + this.mDebugY + " ,mMinValue = " + this.mMinValue);
            }
        } else {
            this.mStartCalculateTime = -1L;
        }
        Log.d(TAG, "setValueInternal current = " + i2);
        if (this.mValue == i2) {
            initializeSelectorWheelIndices();
            return;
        }
        int wrappedSelectorIndex = this.mWrapSelectorWheel ? getWrappedSelectorIndex(i2) : Math.min(Math.max(i2, this.mMinValue), this.mMaxValue);
        int i4 = this.mValue;
        this.mValue = wrappedSelectorIndex;
        if (z) {
            notifyChange(i4, wrappedSelectorIndex);
            performFeedback();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
                this.mHandler.sendEmptyMessage(0);
            } else {
                Log.d(TAG, " mHandler not init yet , To prevent ANR, do not wait when initializing the handler. ");
            }
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    private void updateWrapSelectorWheel() {
        this.mWrapSelectorWheel = (this.mMaxValue - this.mMinValue >= this.mSelectorIndices.length + (-2)) && this.mWrapSelectorWheelPreferred;
    }

    public void addTalkbackSuffix(String str) {
        this.mTalkbackSuffix = str;
    }

    public void clearNumberPickerPadding() {
        this.mNumberPickerPaddingLeft = 0;
        this.mNumberPickerPaddingRight = 0;
        requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mFlingScroller.isFinished()) {
            if (this.mAdjustScroller.isFinished()) {
                this.mScrollerVelocity = 0;
                return;
            }
            this.mAdjustScroller.computeScrollOffset();
            int currY = this.mAdjustScroller.getCurrY();
            if (this.mPreviousScrollerY == 0) {
                this.mPreviousScrollerY = this.mAdjustScroller.getStartY();
            }
            scrollBy(0, currY - this.mPreviousScrollerY);
            this.mPreviousScrollerY = currY;
            if (this.mAdjustScroller.isFinished()) {
                onScrollStateChange(0);
                return;
            } else {
                invalidate();
                return;
            }
        }
        this.mFlingScroller.computeScrollOffset();
        int currY2 = this.mFlingScroller.getCurrY();
        if (this.mPreviousScrollerY == 0) {
            this.mPreviousScrollerY = this.mFlingScroller.getStartY();
        }
        int iUptimeMillis = (int) (SystemClock.uptimeMillis() - ((long) this.mPreviousTime));
        int iAbs = Math.abs(currY2 - this.mPreviousScrollerY);
        if (iUptimeMillis != 0) {
            this.mScrollerVelocity = Math.min(this.mMaximumFlingVelocity, (int) (((iAbs * 1.0f) / iUptimeMillis) * 1000.0f));
        }
        scrollBy(0, currY2 - this.mPreviousScrollerY);
        this.mPreviousScrollerY = currY2;
        this.mPreviousTime = (int) SystemClock.uptimeMillis();
        if (this.mFlingScroller.isFinished()) {
            onScrollerFinished(this.mFlingScroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return this.mCurrentScrollOffset;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return ((this.mMaxValue - this.mMinValue) + 1) * this.mSelectorElementHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mAccessibilityManager.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        a aVar = (a) getAccessibilityNodeProvider();
        if (actionMasked != 7) {
            if (actionMasked == 9) {
                sendAccessibilityEvent(128);
                this.mLastHoveredChildVirtualViewId = -1;
                return false;
            }
            if (actionMasked != 10) {
                return false;
            }
            aVar.e(-1, 256);
            this.mLastHoveredChildVirtualViewId = -1;
            return false;
        }
        int i2 = this.mLastHoveredChildVirtualViewId;
        if (i2 == -1 || i2 == -1) {
            return false;
        }
        aVar.e(i2, 256);
        aVar.e(-1, 128);
        this.mLastHoveredChildVirtualViewId = -1;
        aVar.performAction(-1, 64, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (!this.mWrapSelectorWheel) {
                    if (keyCode == 20) {
                    }
                }
                requestFocus();
                this.mLastHandledDownDpadKeyCode = keyCode;
                removeAllCallbacks();
                if (this.mFlingScroller.isFinished()) {
                    changeValueByOne(keyCode == 20);
                }
                return true;
            }
            if (action == 1 && this.mLastHandledDownDpadKeyCode == keyCode) {
                this.mLastHandledDownDpadKeyCode = -1;
                return true;
            }
        } else if (keyCode == 23 || keyCode == 66) {
            removeAllCallbacks();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.d(TAG, "dispatchTouchEvent event = " + motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.mAccessibilityNodeProvider == null) {
            this.mAccessibilityNodeProvider = new a();
        }
        return this.mAccessibilityNodeProvider;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String getCurrentText() {
        return this.mSelectorIndexToStringCache.get(getValue());
    }

    public String[] getDisplayedValues() {
        return this.mDisplayedValues;
    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public int getMinValue() {
        return this.mMinValue;
    }

    public int getNumberPickerPaddingLeft() {
        return this.mNumberPickerPaddingLeft;
    }

    public int getNumberPickerPaddingRight() {
        return this.mNumberPickerPaddingRight;
    }

    public Paint getSelectorTextPaint() {
        return this.mSelectorWheelPaint;
    }

    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getTextSize() {
        return this.mSelectorWheelPaint.getTextSize();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getTouchEffectInterval() {
        return this.mTouchEffectInterval;
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean getWrapSelectorWheel() {
        return this.mWrapSelectorWheel;
    }

    public boolean isAccessibilityEnable() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isIgnorable() {
        return this.mIgnorable;
    }

    public boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        pzc pzcVar = new pzc("touchEffect", -16);
        this.mTouchEffectThread = pzcVar;
        pzcVar.start();
        if (this.mTouchEffectThread.a() != null) {
            this.mHandler = new h(this.mTouchEffectThread.a());
        }
        wvk.i(getContext());
        initOrResetVelocityTracker();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
        pzc pzcVar = this.mTouchEffectThread;
        if (pzcVar != null) {
            pzcVar.c();
            this.mTouchEffectThread = null;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        wvk.l();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        int i2;
        if (this.mHasBackground) {
            int height = (int) (((getHeight() / 2.0f) - this.mBackgroundRadius) - this.mDiffusion);
            canvas.drawRect(this.mBackgroundLeft, height, getWidth() - this.mBackgroundLeft, height + this.mBackgroundDividerHeight, this.mBackgroundPaint);
            int height2 = (int) ((getHeight() / 2.0f) + this.mBackgroundRadius + this.mDiffusion);
            canvas.drawRect(this.mBackgroundLeft, height2, getWidth() - this.mBackgroundLeft, height2 + this.mBackgroundDividerHeight, this.mBackgroundPaint);
        }
        float right = (((getRight() - getLeft()) - this.mNumberPickerPaddingLeft) - this.mNumberPickerPaddingRight) / 2.0f;
        if (this.mUnitText != null) {
            right = this.mTextMargin + (this.mSelectedValueWidth / 2.0f);
            if (isLayoutRtl()) {
                right = ((getMeasuredWidth() - right) - this.mNumberPickerPaddingRight) - this.mNumberPickerPaddingLeft;
            }
        }
        int i3 = this.mCurrentScrollOffset;
        int i4 = this.mVisualWidth;
        boolean z = true;
        if (i4 != -1 && i4 < getRight() - getLeft()) {
            int i5 = this.mAlignPosition;
            if (i5 == 1) {
                i2 = this.mVisualWidth / 2;
            } else if (i5 == 2) {
                int right2 = getRight() - getLeft();
                int i6 = this.mVisualWidth;
                i2 = (right2 - i6) + (i6 / 2);
            }
            right = i2;
        }
        int i7 = this.mNumberPickerPaddingLeft;
        if (i7 != 0) {
            right += i7;
        }
        float f3 = right;
        int[] iArr = this.mSelectorIndices;
        boolean z2 = false;
        int i8 = i3 - this.mSelectorElementHeight;
        float f4 = f3;
        int i9 = 0;
        float f5 = 0.0f;
        while (i9 < iArr.length) {
            int i10 = iArr[i9];
            if (i8 > this.mGradientPositionTop && i8 < this.mGradientPositionBottom) {
                float gradientCoeff = getGradientCoeff(i8);
                gradualChange(this.mAlphaStart, this.mAlphaEnd, gradientCoeff);
                gradualChange(this.mRedStart, this.mRedEnd, gradientCoeff);
                gradualChange(this.mGreenStart, this.mGreenEnd, gradientCoeff);
                gradualChange(this.mBlueStart, this.mBlueEnd, gradientCoeff);
            }
            int iArgb = Color.argb(this.mAlphaStart, this.mRedStart, this.mGreenStart, this.mBlueStart);
            int iArgb2 = Color.argb(this.mAlphaEnd, this.mRedEnd, this.mGreenEnd, this.mBlueEnd);
            int i11 = this.mNormalTextSize;
            int i12 = i9;
            float fGradualChangeTextSize = gradualChangeTextSize(i11, this.mFocusTextSize, i11, i11, i8);
            this.mSelectorWheelPaint.setColor(iArgb);
            String str = this.mSelectorIndexToStringCache.get(i10);
            this.mSelectorWheelPaint.setTextSize(this.mNormalTextSize);
            if (this.mMeasureTextSelectorPaint.measureText(str) >= getMeasuredWidth()) {
                this.mCurrentLanguageTooLong = z;
                this.mSelectorWheelPaint.setTextAlign(Paint.Align.LEFT);
                f2 = 0.0f;
            } else {
                this.mCurrentLanguageTooLong = z2;
                this.mSelectorWheelPaint.setTextAlign(Paint.Align.CENTER);
                f2 = f3;
            }
            if (i10 != Integer.MIN_VALUE) {
                int iRound = ((int) ((((((i8 + i8) + this.mSelectorElementHeight) - this.mNormalTextTop) - this.mNormalTextBottom) / 2.0f) + (this.mPickerOffset / 2) + (this.mDiffusion * (i12 - Math.round((this.mSelectorIndices.length / 2.0f) - 0.01f))))) + this.mDrawItemOffsetY;
                this.mUnitTextPaint.setTextSize(this.mNormalTextSize);
                Paint.FontMetrics fontMetrics = this.mUnitTextPaint.getFontMetrics();
                int i13 = this.mSelectorElementHeight;
                float f6 = (int) ((((i13 - fontMetrics.top) - fontMetrics.bottom) / 2.0f) + (this.mPickerOffset / 2) + i13);
                int iSave = canvas.save();
                canvas.clipOutRect(0.0f, ((getHeight() / 2.0f) - this.mBackgroundRadius) - this.mDiffusion, getWidth(), (getHeight() / 2.0f) + this.mBackgroundRadius + this.mDiffusion);
                float f7 = iRound;
                canvas.drawText(str != null ? str : "", f2, f7, this.mSelectorWheelPaint);
                canvas.restoreToCount(iSave);
                int iSave2 = canvas.save();
                canvas.clipRect(0.0f, ((getHeight() / 2.0f) - this.mBackgroundRadius) - this.mDiffusion, getWidth(), (getHeight() / 2.0f) + this.mBackgroundRadius + this.mDiffusion);
                this.mSelectorWheelPaint.setColor(iArgb2);
                this.mSelectorWheelPaint.setTextSize(this.mFocusTextSize);
                if (str == null) {
                    str = "";
                }
                canvas.drawText(str, f2, f7, this.mSelectorWheelPaint);
                canvas.restoreToCount(iSave2);
                f5 = f6;
            } else {
                float f8 = fGradualChangeTextSize / this.mFocusTextSize;
                for (float f9 = -0.5f; f9 < 1.0f; f9 += 1.0f) {
                    float f10 = this.mIgnoreBarWidth;
                    float f11 = (this.mIgnoreBarSpacing + f10) * f9 * f8;
                    float f12 = this.mIgnoreBarHeight * f8;
                    float f13 = f11 + f2;
                    float f14 = (f10 * f8) / 2.0f;
                    float f15 = i8;
                    int i14 = this.mSelectorElementHeight;
                    float f16 = f12 / 2.0f;
                    canvas.drawRect(f13 - f14, (((i14 / 2.0f) + f15) - f16) + 33.75f, f13 + f14, f15 + (i14 / 2.0f) + f16 + 33.75f, this.mSelectorWheelPaint);
                }
            }
            i8 += this.mSelectorElementHeight;
            i9 = i12 + 1;
            f4 = f2;
            z = true;
            z2 = false;
        }
        if (this.mUnitText != null) {
            if (isLayoutRtl()) {
                f4 = (f4 + this.mNumberPickerPaddingRight) - this.mNumberPickerPaddingLeft;
            }
            float measuredWidth = f4 + (this.mSelectedValueWidth / 2) + this.mUnitMargin;
            if (isLayoutRtl()) {
                measuredWidth = (getMeasuredWidth() - measuredWidth) - this.mUnitTextPaint.measureText(this.mUnitText);
            }
            this.mUnitTextPaint.setTextSize(this.mUnitTextSize);
            canvas.drawText(this.mUnitText, measuredWidth, f5 - this.mUnitMarginBottom, this.mUnitTextPaint);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        removeAllCallbacks();
        float y = motionEvent.getY();
        this.mLastDownEventY = y;
        this.mLastDownOrMoveEventY = y;
        this.mLastDownEventTime = motionEvent.getEventTime();
        this.mPerformClickOnTap = false;
        float f2 = this.mLastDownEventY;
        if (f2 < this.mTopSelectionDividerTop) {
            if (this.mScrollState == 0) {
                this.mPressedStateHelper.a(2);
            }
        } else if (f2 > this.mBottomSelectionDividerBottom && this.mScrollState == 0) {
            this.mPressedStateHelper.a(1);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.mFlingScroller.isFinished()) {
            this.mFlingScroller.abortAnimation();
            this.mAdjustScroller.forceFinished(true);
            onScrollStateChange(0);
        } else if (this.mAdjustScroller.isFinished()) {
            float f3 = this.mLastDownEventY;
            if (f3 < this.mTopSelectionDividerTop) {
                postChangeCurrentByOneFromLongPress(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.mBottomSelectionDividerBottom) {
                postChangeCurrentByOneFromLongPress(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.mPerformClickOnTap = true;
            }
        } else {
            this.mFlingScroller.abortAnimation();
            this.mAdjustScroller.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            initializeSelectorWheel();
            initializeFadingEdges();
        }
        initColorGradientRes();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec = makeMeasureSpec(i2, this.mMaxWidth);
        super.onMeasure(iMakeMeasureSpec, makeMeasureSpec(i3, this.mMaxHeight));
        if (View.MeasureSpec.getMode(iMakeMeasureSpec) != Integer.MIN_VALUE) {
            this.mTextMargin = (getMeasuredWidth() - this.mSelectedValueWidth) / 2;
        }
        int iResolveSizeAndStateRespectingMinSize = resolveSizeAndStateRespectingMinSize(this.mMinWidth, getMeasuredWidth(), i2) + this.mNumberPickerPaddingRight + this.mNumberPickerPaddingLeft;
        int i4 = this.mMaxViewWidth;
        if (i4 > 0 && iResolveSizeAndStateRespectingMinSize > i4) {
            iResolveSizeAndStateRespectingMinSize = i4;
        }
        setMeasuredDimension(iResolveSizeAndStateRespectingMinSize, resolveSizeAndStateRespectingMinSize(this.mMinHeight, getMeasuredHeight(), i3));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            initOrResetVelocityTracker();
            this.mVelocityTracker.addMovement(motionEvent);
        } else if (actionMasked == 1) {
            removeChangeCurrentByOneFromLongPress();
            this.mPressedStateHelper.c();
            int y = (int) motionEvent.getY();
            int iAbs = (int) Math.abs(y - this.mLastDownEventY);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
            int yVelocity = (int) this.mVelocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
                fling((int) (yVelocity * getDampRatio()));
                onScrollStateChange(2);
            } else {
                long eventTime = motionEvent.getEventTime() - this.mLastDownEventTime;
                if (iAbs > this.mTouchSlop || eventTime >= ViewConfiguration.getLongPressTimeout()) {
                    ensureScrollWheelAdjusted();
                } else if (this.mPerformClickOnTap) {
                    this.mPerformClickOnTap = false;
                    performClick();
                } else {
                    int i2 = ((y / this.mSelectorElementHeight) - this.mSelectorMiddleItemIndex) + 1;
                    if (i2 > 0) {
                        changeValueByOne(true);
                        this.mPressedStateHelper.b(1);
                    } else if (i2 < 0) {
                        changeValueByOne(false);
                        this.mPressedStateHelper.b(2);
                    }
                    ensureScrollWheelAdjusted();
                }
            }
            recycleVelocityTracker();
        } else if (actionMasked == 2) {
            initVelocityTrackerIfNotExists();
            this.mVelocityTracker.addMovement(motionEvent);
            float y2 = motionEvent.getY();
            if (this.mScrollState == 1) {
                int i3 = (int) (y2 - this.mLastDownOrMoveEventY);
                this.mDeltaMoveY = i3;
                scrollBy(0, i3);
                invalidate();
            } else if (((int) Math.abs(y2 - this.mLastDownEventY)) > this.mTouchSlop) {
                removeAllCallbacks();
                onScrollStateChange(1);
            }
            this.mLastDownOrMoveEventY = y2;
        } else if (actionMasked == 3) {
            ensureScrollWheelAdjusted();
            recycleVelocityTracker();
        }
        return true;
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mRefreshStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if (TextUtils.equals(resourceTypeName, "attr")) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.COUINumberPicker, this.mRefreshStyle, 0);
        } else if (TextUtils.equals(resourceTypeName, Const.Arguments.Open.STYLE)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.COUINumberPicker, 0, this.mRefreshStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiNormalTextColor, -1);
            this.mFocusTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiFocusTextColor, -1);
            this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiPickerBackgroundColor, -1);
            setSelectorTextColor(this.mNormalTextColor, this.mFocusTextColor);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int i4;
        int[] iArr = this.mSelectorIndices;
        int i5 = this.mCurrentScrollOffset;
        boolean z = this.mWrapSelectorWheel;
        if (!z && i3 > 0 && iArr[this.mSelectorMiddleItemIndex] <= this.mMinValue && i5 + i3 >= 0) {
            this.mCurrentScrollOffset = 0;
            return;
        }
        if (!z && i3 < 0 && iArr[this.mSelectorMiddleItemIndex] >= this.mMaxValue && i5 + i3 <= 0) {
            this.mCurrentScrollOffset = 0;
            return;
        }
        if (i3 > 65535) {
            this.mDebugY = i3;
            return;
        }
        this.mCurrentScrollOffset = i3 + i5;
        while (true) {
            int i6 = this.mCurrentScrollOffset;
            float f2 = i6;
            int i7 = this.mSelectorElementHeight;
            float f3 = (i7 * 0.95f) + (this.mPickerOffset / 2.0f);
            float f4 = this.mDiffusion;
            if (f2 <= f3 + f4) {
                break;
            }
            this.mCurrentScrollOffset = (int) (i6 - (i7 + f4));
            decrementSelectorIndices(iArr);
            setValueInternal(iArr[this.mSelectorMiddleItemIndex], true);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] < this.mMinValue) {
                this.mCurrentScrollOffset = 0;
            }
        }
        while (true) {
            i4 = this.mCurrentScrollOffset;
            float f5 = i4;
            int i8 = this.mSelectorElementHeight;
            float f6 = ((-i8) * 0.95f) - (this.mPickerOffset / 2.0f);
            float f7 = this.mDiffusion;
            if (f5 >= f6 - f7) {
                break;
            }
            this.mCurrentScrollOffset = (int) (i4 + i8 + f7);
            incrementSelectorIndices(iArr);
            setValueInternal(iArr[this.mSelectorMiddleItemIndex], true);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] > this.mMaxValue) {
                this.mCurrentScrollOffset = 0;
            }
        }
        if (i5 != i4) {
            onScrollChanged(0, i4, 0, i5);
        }
    }

    public void scrollForceFinished() {
        if (!this.mFlingScroller.isFinished()) {
            moveToFinalScrollerPosition(this.mFlingScroller);
        }
        if (this.mAdjustScroller.isFinished()) {
            return;
        }
        moveToFinalScrollerPosition(this.mAdjustScroller);
    }

    public void setAlignPosition(int i2) {
        this.mAlignPosition = i2;
    }

    public void setBackgroundRadius(int i2) {
        this.mBackgroundRadius = i2;
        invalidate();
    }

    public void setDiffusion(int i2) {
        this.mDiffusion = i2;
        invalidate();
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues == strArr) {
            return;
        }
        this.mDisplayedValues = strArr;
        initializeSelectorWheelIndices();
    }

    public void setDrawItemVerticalOffset(int i2) {
        this.mDrawItemOffsetY = i2;
        invalidate();
    }

    public void setEnableAdaptiveVibrator(boolean z) {
        this.mEnableAdaptiveVibrator = z;
    }

    public void setFocusTextSize(int i2) {
        this.mFocusTextSize = i2;
        invalidate();
    }

    public void setFormatter(c cVar) {
        if (cVar == this.mFormatter) {
            return;
        }
        this.mFormatter = cVar;
        initializeSelectorWheelIndices();
    }

    public void setGradientColor(@ColorInt int i2, @ColorInt int i3) {
        this.mAlphaStart = Color.alpha(i2);
        this.mAlphaEnd = Color.alpha(i3);
        this.mRedStart = Color.red(i2);
        this.mRedEnd = Color.red(i3);
        this.mGreenStart = Color.green(i2);
        this.mGreenEnd = Color.green(i3);
        this.mBlueStart = Color.blue(i2);
        this.mBlueEnd = Color.blue(i3);
    }

    public void setHasBackground(boolean z) {
        this.mHasBackground = z;
    }

    public void setIgnorable(boolean z) {
        if (this.mIgnorable == z) {
            return;
        }
        this.mIgnorable = z;
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void setMaxValue(int i2) {
        if (this.mMaxValue == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.mMaxValue = i2;
        if (i2 < this.mValue) {
            this.mValue = i2;
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void setMinValue(int i2) {
        if (this.mMinValue == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.mMinValue = i2;
        if (i2 > this.mValue) {
            this.mValue = i2;
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void setNormalTextColor(int i2) {
        if (this.mNormalTextColor != i2) {
            this.mNormalTextColor = i2;
            setSelectorTextColor(i2, this.mFocusTextColor);
        }
    }

    public void setNormalTextSize(int i2) {
        this.mNormalTextSize = i2;
        invalidate();
    }

    public void setNumberPickerPaddingLeft(int i2) {
        this.mNumberPickerPaddingLeft = i2;
        requestLayout();
    }

    public void setNumberPickerPaddingRight(int i2) {
        this.mNumberPickerPaddingRight = i2;
        requestLayout();
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.mLongPressUpdateInterval = j2;
    }

    public void setOnScrollListener(d dVar) {
    }

    public void setOnScrollingStopListener(e eVar) {
        this.mOnScrollingStopListener = eVar;
    }

    public void setOnValueChangedListener(f fVar) {
        this.mOnValueChangeListener = fVar;
    }

    public void setPickerFocusColor(int i2) {
        this.mAlphaEnd = Color.alpha(i2);
        this.mRedEnd = Color.red(i2);
        this.mGreenEnd = Color.green(i2);
        this.mBlueEnd = Color.green(i2);
    }

    public void setPickerNormalColor(int i2) {
        this.mAlphaStart = Color.alpha(i2);
        this.mRedStart = Color.red(i2);
        this.mGreenStart = Color.green(i2);
        this.mBlueStart = Color.green(i2);
    }

    public void setPickerOffset(int i2) {
        this.mPickerOffset = i2;
        invalidate();
    }

    public void setPickerRowNumber(int i2) {
        if (i2 <= 0 || i2 > 2147483645) {
            bj2.c(TAG, "Illegal picker row number: " + i2);
            return;
        }
        int i3 = i2 + 2;
        this.mSelectorItemCount = i3;
        this.mSelectorMiddleItemIndex = i3 / 2;
        this.mSelectorIndices = new int[i3];
    }

    public void setSelectedValueWidth(int i2) {
        this.mSelectedValueWidth = i2;
    }

    public void setSelectorTextColor(@ColorInt int i2, @ColorInt int i3) {
        setGradientColor(i2, i3);
        invalidate();
    }

    public void setTouchEffectInterval(int i2) {
        this.mTouchEffectInterval = i2;
    }

    public void setTwoDigitFormatter() {
        if (this.mTwoDigitFormatter == null) {
            this.mTwoDigitFormatter = new i();
        }
        this.mFormatter = this.mTwoDigitFormatter;
    }

    public void setUnitText(String str) {
        this.mUnitText = str;
    }

    public void setValue(int i2) {
        setValueInternal(i2, false);
    }

    public void setVerticalFadingEdgeEnable(boolean z) {
        this.mVerticalFadingEdgeEnable = z;
        requestLayout();
    }

    public void setVibrateIntensity(float f2) {
        this.mVibrateIntensity = f2;
    }

    public void setVibrateLevel(int i2) {
        this.mVibrateLevel = i2;
    }

    public void setWrapSelectorWheel(boolean z) {
        this.mWrapSelectorWheelPreferred = z;
        updateWrapSelectorWheel();
    }

    public COUINumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiNumberPickerStyle);
    }

    private int getWrappedSelectorIndex(int i2, int i3) {
        int i4 = this.mMaxValue;
        int i5 = this.mMinValue;
        if (i4 - i5 <= 0) {
            return -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = i5 - 1;
        }
        int iB = gj2.b((i2 - i5) + i3, (i4 - i5) + 1 + (this.mIgnorable ? 1 : 0));
        int i6 = this.mMaxValue;
        int i7 = this.mMinValue;
        if (iB < (i6 - i7) + 1) {
            return i7 + iB;
        }
        return Integer.MIN_VALUE;
    }

    public COUINumberPicker(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, lh2.j(context) ? R$style.COUINumberPicker_Dark : R$style.COUINumberPicker);
    }

    public COUINumberPicker(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mFlingFriction = ViewConfiguration.getScrollFriction();
        this.MAX_SCROLL_OFFSET = 65535;
        this.mSelectorIndexToStringCache = new SparseArray<>();
        this.mWrapSelectorWheelPreferred = true;
        this.mLongPressUpdateInterval = 300L;
        this.mScrollState = 0;
        this.mLastHandledDownDpadKeyCode = -1;
        this.mDrawItemOffsetY = 0;
        this.mVerticalFadingEdgeEnable = false;
        this.mHasBackground = false;
        this.mEnableAdaptiveVibrator = true;
        this.mHasMotorVibrator = true;
        this.mLinearMotorVibrator = null;
        this.mStartCalculateTime = -1L;
        this.mVibrateIntensity = 1.0f;
        this.mPreviousTime = 0;
        this.mScrollerVelocity = 0;
        ph2.c(this, false);
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        fm2 fm2VarA = fm2.a();
        this.mSoundUtil = fm2VarA;
        this.mClickSoundId = fm2VarA.c(context, R$raw.coui_numberpicker_click);
        if (attributeSet != null) {
            this.mRefreshStyle = attributeSet.getStyleAttribute();
        }
        if (this.mRefreshStyle == 0) {
            this.mRefreshStyle = i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUINumberPicker, i2, i3);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUINumberPicker_couiPickerRowNumber, 5) + 2;
        this.mSelectorItemCount = integer;
        this.mSelectorMiddleItemIndex = integer / 2;
        this.mSelectorIndices = new int[integer];
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMinHeight, -1);
        this.mMinHeight = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMaxHeight, -1);
        this.mMaxHeight = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMinWidth, -1);
        this.mMinWidth = dimensionPixelSize3;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMaxWidth, -1);
        this.mMaxWidth = dimensionPixelSize4;
        if (dimensionPixelSize3 != -1 && dimensionPixelSize4 != -1 && dimensionPixelSize3 > dimensionPixelSize4) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        this.mAlignPosition = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUINumberPicker_couiPickerAlignPosition, -1);
        this.mFocusTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_focusTextSize, -1);
        this.mNormalTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_startTextSize, -1);
        this.mVisualWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_couiPickerVisualWidth, -1);
        this.mNumberPickerPaddingLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_couiNOPickerPaddingLeft, 0);
        this.mNumberPickerPaddingRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUINumberPicker_couiNOPickerPaddingRight, 0);
        this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiNormalTextColor, -1);
        this.mFocusTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiFocusTextColor, -1);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUINumberPicker_couiPickerBackgroundColor, -1);
        this.mTouchEffectInterval = typedArrayObtainStyledAttributes.getInt(R$styleable.COUINumberPicker_couiPickerTouchEffectInterval, 100);
        setGradientColor(this.mNormalTextColor, this.mFocusTextColor);
        this.mEnableAdaptiveVibrator = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUINumberPicker_couiPickerAdaptiveVibrator, true);
        this.mVibrateLevel = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUINumberPicker_couiVibrateLevel, 0);
        this.mHasMotorVibrator = wvk.h(context);
        this.mVerticalFadingEdgeEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUINumberPicker_couiPickerVerticalFading, false);
        this.mDiffusion = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUINumberPicker_couiPickerDiffusion, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPickersCommonAttrs, i2, 0);
        this.mMaxViewWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUIPickersCommonAttrs_couiPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.mIgnoreBarWidth = getResources().getDimension(R$dimen.coui_numberpicker_ignore_bar_width);
        this.mIgnoreBarHeight = getResources().getDimension(R$dimen.coui_numberpicker_ignore_bar_height);
        this.mIgnoreBarSpacing = getResources().getDimension(R$dimen.coui_numberpicker_ignore_bar_spacing);
        this.mUnitMinWidth = getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_unit_min_width);
        this.mUnitTextSize = getResources().getDimensionPixelSize(R$dimen.coui_numberpicker_unit_textSize);
        this.mUnitMarginBottom = getResources().getDimensionPixelSize(R$dimen.coui_numberpicker_unit_margin_bottom);
        this.mSelectedValueWidth = getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_text_width);
        this.mUnitMargin = getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_text_margin_start);
        this.mBackgroundDividerHeight = Math.max(getResources().getDimensionPixelSize(R$dimen.coui_number_picker_background_divider_height), 1);
        this.mPpi = getContext().getResources().getDisplayMetrics().density * 160.0f;
        this.mPhysicalCoeff = computeDeceleration(0.84f);
        int i4 = ((dimensionPixelSize3 - this.mSelectedValueWidth) - this.mUnitMinWidth) - (this.mUnitMargin * 2);
        this.mInitTextMargin = i4;
        this.mTextMargin = i4;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMinimumFlingVelocity = 750;
        this.mMaximumFlingVelocity = 5000;
        Paint paint = new Paint();
        paint.setTextSize(this.mNormalTextSize);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.mNormalTextTop = fontMetrics.top;
        this.mNormalTextBottom = fontMetrics.bottom;
        this.mSelectorWheelPaint = paint;
        this.mMeasureTextSelectorPaint = paint;
        paint.setTextSize(getResources().getDimensionPixelSize(R$dimen.coui_numberpicker_textSize_big));
        this.mFlingScroller = new Scroller(getContext(), SLOW_FLING_INTERPOLATOR);
        this.mAdjustScroller = new Scroller(getContext(), FLING_INTERPOLATOR);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mPressedStateHelper = new g();
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(false);
        Paint paint2 = new Paint();
        this.mUnitTextPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setTextSize(this.mUnitTextSize);
        paint2.setColor(this.mFocusTextColor);
        paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_radius);
        this.mBackgroundLeft = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_horizontal_padding);
        this.mPickerOffset = 0;
        Paint paint3 = new Paint(1);
        this.mBackgroundPaint = paint3;
        paint3.setColor(this.mBackgroundColor);
    }
}
