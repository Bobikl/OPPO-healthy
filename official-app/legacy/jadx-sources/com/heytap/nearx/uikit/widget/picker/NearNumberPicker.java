package com.heytap.nearx.uikit.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
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
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.math.MathUtils;
import com.google.android.material.timepicker.TimeModel;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$raw;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.alc;
import com.oplus.aiunit.vision.fh8;
import com.oplus.aiunit.vision.vhc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearNumberPicker extends LinearLayout {
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_MIDDLE = 0;
    public static final int ALIGN_RIGHT = 2;
    private static final float BASE_RATIO = 0.6f;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300;
    private static final int MSG_PLAY_EFFECT = 0;
    private static final int MSG_TALKBACK_VALUE_CHANGE = 1;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    public static final int SELECTOR_INDEX_IGNORE = Integer.MIN_VALUE;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_WHEEL_ITEM_COUNT_DEFAULT = 5;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final String TAG = "NearNumberPicker";
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
    private static final float VALUE_SIXTY = 60.0f;
    private static final int VELOCITY_SPEED_UP_RATIO = 2;
    private AccessibilityManager mAccessibilityManager;
    private AccessibilityNodeProviderImpl mAccessibilityNodeProvider;
    private final Scroller mAdjustScroller;
    private int mAlignPosition;
    private int mAlphaEnd;
    private int mAlphaStart;
    private int mBackgroundColor;
    private int mBackgroundLeft;
    private Paint mBackgroundPaint;
    private int mBackgroundRadius;
    private int mBlueEnd;
    private int mBlueStart;
    private int mBottomSelectionDividerBottom;
    private ChangeCurrentByOneFromLongPressCommand mChangeCurrentByOneFromLongPressCommand;
    private int mClickSoundId;
    private boolean mCurrentLanguageTooLong;
    private int mCurrentScrollOffset;
    private boolean mDecrementVirtualButtonPressed;
    private String[] mDisplayedValues;
    private final Scroller mFlingScroller;
    int mFocusTextColor;
    private int mFocusTextSize;
    private Formatter mFormatter;
    private int mGradientPositionBottom;
    private int mGradientPositionTop;
    private int mGreenEnd;
    private int mGreenStart;
    private Handler mHandler;
    private boolean mHasBackground;
    private boolean mIgnorable;
    private float mIgnoreBarHeight;
    private float mIgnoreBarSpacing;
    private float mIgnoreBarWidth;
    private boolean mIncrementVirtualButtonPressed;
    private int mInitTextMargin;
    private int mInitialScrollOffset;
    private long mLastDownEventTime;
    private float mLastDownEventY;
    private float mLastDownOrMoveEventY;
    private int mLastHandledDownDpadKeyCode;
    private int mLastHoveredChildVirtualViewId;
    private long mLastTouchEffectTime;
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
    private final int mNormalTextSize;
    private float mNormalTextTop;
    private int mNumberPickerPaddingLeft;
    private int mNumberPickerPaddingRight;
    private OnScrollListener mOnScrollListener;
    private OnScrollingStopListener mOnScrollingStopListener;
    private OnValueChangeListener mOnValueChangeListener;
    private boolean mPerformClickOnTap;
    private int mPickerOffset;
    private final PressedStateHelper mPressedStateHelper;
    private int mPreviousScrollerY;
    private int mRedEnd;
    private int mRedStart;
    int mRefreshStyle;
    private int mScrollState;
    private int mSelectedValueWidth;
    private int mSelectorElementHeight;
    private final SparseArray<String> mSelectorIndexToStringCache;
    private int[] mSelectorIndices;
    private int mSelectorItemCount;
    private int mSelectorMiddleItemIndex;
    private int mSelectorTextGapHeight;
    private final Paint mSelectorWheelPaint;
    private alc mSoundUtil;
    private String mTalkbackSuffix;
    private int mTextMargin;
    private int mTopSelectionDividerTop;
    private int mTouchEffectInterval;
    private HandlerThread mTouchEffectThread;
    private int mTouchSlop;
    private TwoDigitFormatter mTwoDigitFormatter;
    private int mUnitMargin;
    private int mUnitMinWidth;
    private String mUnitText;
    private final Paint mUnitTextPaint;
    private int mUnitTextSize;
    private int mValue;
    private VelocityTracker mVelocityTracker;
    private int mVisualWidth;
    private boolean mWrapSelectorWheel;
    private boolean mWrapSelectorWheelPreferred;

    public class AccessibilityNodeProviderImpl extends AccessibilityNodeProvider {
        private static final int UNDEFINED = Integer.MIN_VALUE;
        private static final int VIRTUAL_VIEW_ID = 0;
        private static final int VIRTUAL_VIEW_ID_DECREMENT = 3;
        private static final int VIRTUAL_VIEW_ID_INCREMENT = 1;
        private static final int VIRTUAL_VIEW_ID_INPUT = 2;
        private final Rect mTempRect = new Rect();
        private final int[] mTempArray = new int[2];
        private int mAccessibilityFocusedView = Integer.MIN_VALUE;

        public AccessibilityNodeProviderImpl() {
        }

        private AccessibilityNodeInfo createAccessibilityNodeInfoForVirtualButton(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setPackageName(NearNumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(NearNumberPicker.this, i);
            accessibilityNodeInfoObtain.setParent(NearNumberPicker.this);
            if (!TextUtils.isEmpty(NearNumberPicker.this.mTalkbackSuffix)) {
                str = str + NearNumberPicker.this.mTalkbackSuffix;
            }
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(NearNumberPicker.this.isEnabled());
            Rect rect = this.mTempRect;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.mTempArray;
            NearNumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.mAccessibilityFocusedView != i) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.mAccessibilityFocusedView == i) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NearNumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(16);
            }
            return accessibilityNodeInfoObtain;
        }

        private AccessibilityNodeInfo createAccessibiltyNodeInfoForInputText(String str, int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setPackageName(NearNumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setParent(NearNumberPicker.this);
            accessibilityNodeInfoObtain.setSource(NearNumberPicker.this);
            if (!TextUtils.isEmpty(NearNumberPicker.this.mTalkbackSuffix)) {
                str = str + NearNumberPicker.this.mTalkbackSuffix;
            }
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(NearNumberPicker.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            if (this.mAccessibilityFocusedView != 2) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.mAccessibilityFocusedView == 2) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NearNumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(16);
            }
            Rect rect = this.mTempRect;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.mTempArray;
            NearNumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            return accessibilityNodeInfoObtain;
        }

        private void findAccessibilityNodeInfosByTextInChild(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 1) {
                String virtualText = getVirtualText(NearNumberPicker.this.mValue + 1);
                if (TextUtils.isEmpty(virtualText) || !virtualText.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (i != 3) {
                return;
            }
            String virtualText2 = getVirtualText(NearNumberPicker.this.mValue - 1);
            if (TextUtils.isEmpty(virtualText2) || !virtualText2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(3));
        }

        private String getVirtualText(int i) {
            if (NearNumberPicker.this.mWrapSelectorWheel) {
                i = NearNumberPicker.this.getWrappedSelectorIndex(i);
            }
            if (i > NearNumberPicker.this.mMaxValue || i < NearNumberPicker.this.mMinValue) {
                return null;
            }
            return NearNumberPicker.this.mDisplayedValues == null ? NearNumberPicker.this.formatNumber(i) : NearNumberPicker.this.mDisplayedValues[i - NearNumberPicker.this.mMinValue];
        }

        private boolean hasVirtualDecrementButton() {
            return NearNumberPicker.this.getWrapSelectorWheel() || NearNumberPicker.this.getValue() > NearNumberPicker.this.getMinValue();
        }

        private boolean hasVirtualIncrementButton() {
            return NearNumberPicker.this.getWrapSelectorWheel() || NearNumberPicker.this.getValue() < NearNumberPicker.this.getMaxValue();
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
        private void sendAccessibilityEventForVirtualButton(int i, int i2, String str) {
            if (NearNumberPicker.this.mAccessibilityManager.isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                accessibilityEventObtain.setPackageName(NearNumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(NearNumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(NearNumberPicker.this, i);
                NearNumberPicker nearNumberPicker = NearNumberPicker.this;
                nearNumberPicker.requestSendAccessibilityEvent(nearNumberPicker, accessibilityEventObtain);
            }
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
        private void sendAccessibilityEventForVirtualText(int i, String str) {
            if (NearNumberPicker.this.mAccessibilityManager.isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
                accessibilityEventObtain.setPackageName(NearNumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(NearNumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(NearNumberPicker.this, 2);
                NearNumberPicker nearNumberPicker = NearNumberPicker.this;
                nearNumberPicker.requestSendAccessibilityEvent(nearNumberPicker, accessibilityEventObtain);
            }
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return createAccessibiltyNodeInfoForInputText(getVirtualText(NearNumberPicker.this.mValue), NearNumberPicker.this.getScrollX(), NearNumberPicker.this.getScrollY(), NearNumberPicker.this.getScrollX() + (NearNumberPicker.this.getRight() - NearNumberPicker.this.getLeft()), NearNumberPicker.this.getScrollY() + (NearNumberPicker.this.getBottom() - NearNumberPicker.this.getTop()));
            }
            if (i == 1) {
                return createAccessibilityNodeInfoForVirtualButton(1, getVirtualText(NearNumberPicker.this.mValue + 1), NearNumberPicker.this.getScrollX(), NearNumberPicker.this.mBottomSelectionDividerBottom, NearNumberPicker.this.getScrollX() + (NearNumberPicker.this.getRight() - NearNumberPicker.this.getLeft()), NearNumberPicker.this.getScrollY() + (NearNumberPicker.this.getBottom() - NearNumberPicker.this.getTop()));
            }
            if (i != 2) {
                return i != 3 ? super.createAccessibilityNodeInfo(i) : createAccessibilityNodeInfoForVirtualButton(3, getVirtualText(NearNumberPicker.this.mValue - 1), NearNumberPicker.this.getScrollX(), NearNumberPicker.this.getScrollY(), NearNumberPicker.this.getScrollX() + (NearNumberPicker.this.getRight() - NearNumberPicker.this.getLeft()), NearNumberPicker.this.mTopSelectionDividerTop);
            }
            return createAccessibiltyNodeInfoForInputText(getVirtualText(NearNumberPicker.this.mValue), NearNumberPicker.this.getScrollX(), NearNumberPicker.this.mTopSelectionDividerTop, NearNumberPicker.this.getScrollX() + (NearNumberPicker.this.getRight() - NearNumberPicker.this.getLeft()), NearNumberPicker.this.mBottomSelectionDividerBottom);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                findAccessibilityNodeInfosByTextInChild(lowerCase, 3, arrayList);
                findAccessibilityNodeInfosByTextInChild(lowerCase, 2, arrayList);
                findAccessibilityNodeInfosByTextInChild(lowerCase, 1, arrayList);
                return arrayList;
            }
            if (i != 1 && i != 2 && i != 3) {
                return super.findAccessibilityNodeInfosByText(str, i);
            }
            findAccessibilityNodeInfosByTextInChild(lowerCase, i, arrayList);
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i != -1) {
                if (i == 1) {
                    if (i2 == 16) {
                        if (!NearNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NearNumberPicker.this.changeValueByOne(true);
                        sendAccessibilityEventForVirtualView(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.mAccessibilityFocusedView == i) {
                            return false;
                        }
                        this.mAccessibilityFocusedView = i;
                        sendAccessibilityEventForVirtualView(i, 32768);
                        NearNumberPicker nearNumberPicker = NearNumberPicker.this;
                        nearNumberPicker.invalidate(0, nearNumberPicker.mBottomSelectionDividerBottom, NearNumberPicker.this.getRight(), NearNumberPicker.this.getBottom());
                        return true;
                    }
                    if (i2 != 128 || this.mAccessibilityFocusedView != i) {
                        return false;
                    }
                    this.mAccessibilityFocusedView = Integer.MIN_VALUE;
                    sendAccessibilityEventForVirtualView(i, 65536);
                    NearNumberPicker nearNumberPicker2 = NearNumberPicker.this;
                    nearNumberPicker2.invalidate(0, nearNumberPicker2.mBottomSelectionDividerBottom, NearNumberPicker.this.getRight(), NearNumberPicker.this.getBottom());
                    return true;
                }
                if (i == 2) {
                    if (i2 == 16) {
                        if (!NearNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NearNumberPicker.this.performClick();
                        return true;
                    }
                    if (i2 == 32) {
                        if (!NearNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NearNumberPicker.this.performLongClick();
                        return true;
                    }
                    if (i2 != 64) {
                        if (i2 != 128 || this.mAccessibilityFocusedView != i) {
                            return false;
                        }
                        this.mAccessibilityFocusedView = Integer.MIN_VALUE;
                        sendAccessibilityEventForVirtualView(i, 65536);
                        return true;
                    }
                    if (this.mAccessibilityFocusedView == i) {
                        return false;
                    }
                    this.mAccessibilityFocusedView = i;
                    sendAccessibilityEventForVirtualView(i, 32768);
                    NearNumberPicker nearNumberPicker3 = NearNumberPicker.this;
                    nearNumberPicker3.invalidate(0, 0, nearNumberPicker3.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
                    return true;
                }
                if (i == 3) {
                    if (i2 == 16) {
                        if (!NearNumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NearNumberPicker.this.changeValueByOne(i == 1);
                        sendAccessibilityEventForVirtualView(i, 1);
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.mAccessibilityFocusedView == i) {
                            return false;
                        }
                        this.mAccessibilityFocusedView = i;
                        sendAccessibilityEventForVirtualView(i, 32768);
                        NearNumberPicker nearNumberPicker4 = NearNumberPicker.this;
                        nearNumberPicker4.invalidate(0, 0, nearNumberPicker4.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
                        return true;
                    }
                    if (i2 != 128 || this.mAccessibilityFocusedView != i) {
                        return false;
                    }
                    this.mAccessibilityFocusedView = Integer.MIN_VALUE;
                    sendAccessibilityEventForVirtualView(i, 65536);
                    NearNumberPicker nearNumberPicker5 = NearNumberPicker.this;
                    nearNumberPicker5.invalidate(0, 0, nearNumberPicker5.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
                    return true;
                }
            } else {
                if (i2 == 64) {
                    if (this.mAccessibilityFocusedView == i) {
                        return false;
                    }
                    this.mAccessibilityFocusedView = i;
                    return true;
                }
                if (i2 == 128) {
                    if (this.mAccessibilityFocusedView != i) {
                        return false;
                    }
                    this.mAccessibilityFocusedView = Integer.MIN_VALUE;
                    return true;
                }
                if (i2 == 4096) {
                    if (!NearNumberPicker.this.isEnabled()) {
                        return false;
                    }
                    NearNumberPicker.this.changeValueByOne(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!NearNumberPicker.this.isEnabled()) {
                        return false;
                    }
                    NearNumberPicker.this.changeValueByOne(false);
                    return true;
                }
            }
            return super.performAction(i, i2, bundle);
        }

        public void sendAccessibilityEventForVirtualView(int i, int i2) {
            if (i == 1) {
                if (hasVirtualIncrementButton()) {
                    sendAccessibilityEventForVirtualButton(i, i2, getVirtualText(NearNumberPicker.this.mValue + 1));
                }
            } else if (i == 2) {
                sendAccessibilityEventForVirtualText(i2, getVirtualText(NearNumberPicker.this.mValue));
            } else if (i == 3 && hasVirtualDecrementButton()) {
                sendAccessibilityEventForVirtualButton(i, i2, getVirtualText(NearNumberPicker.this.mValue - 1));
            }
        }
    }

    public class ChangeCurrentByOneFromLongPressCommand implements Runnable {
        private boolean mIncrement;

        public ChangeCurrentByOneFromLongPressCommand() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStep(boolean z) {
            this.mIncrement = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NearNumberPicker.this.changeValueByOne(this.mIncrement);
            NearNumberPicker nearNumberPicker = NearNumberPicker.this;
            nearNumberPicker.postDelayed(this, nearNumberPicker.mLongPressUpdateInterval);
        }
    }

    public interface Formatter {
        String format(int i);
    }

    public interface OnScrollListener {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

        void onScrollStateChange(NearNumberPicker nearNumberPicker, int i);
    }

    public interface OnScrollingStopListener {
        void onScrollingStop();
    }

    public interface OnValueChangeListener {
        void onValueChange(NearNumberPicker nearNumberPicker, int i, int i2);
    }

    public class PressedStateHelper implements Runnable {
        public static final int BUTTON_DECREMENT = 2;
        public static final int BUTTON_INCREMENT = 1;
        private final int MODE_PRESS = 1;
        private final int MODE_TAPPED = 2;
        private int mManagedButton;
        private int mMode;

        public PressedStateHelper() {
        }

        public void buttonPressDelayed(int i) {
            cancel();
            this.mMode = 1;
            this.mManagedButton = i;
            NearNumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void buttonTapped(int i) {
            cancel();
            this.mMode = 2;
            this.mManagedButton = i;
            NearNumberPicker.this.post(this);
        }

        public void cancel() {
            this.mMode = 0;
            this.mManagedButton = 0;
            NearNumberPicker.this.removeCallbacks(this);
            if (NearNumberPicker.this.mIncrementVirtualButtonPressed) {
                NearNumberPicker.this.mIncrementVirtualButtonPressed = false;
                NearNumberPicker nearNumberPicker = NearNumberPicker.this;
                nearNumberPicker.invalidate(0, nearNumberPicker.mBottomSelectionDividerBottom, NearNumberPicker.this.getRight(), NearNumberPicker.this.getBottom());
            }
            NearNumberPicker.this.mDecrementVirtualButtonPressed = false;
            if (NearNumberPicker.this.mDecrementVirtualButtonPressed) {
                NearNumberPicker nearNumberPicker2 = NearNumberPicker.this;
                nearNumberPicker2.invalidate(0, 0, nearNumberPicker2.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.mMode;
            if (i == 1) {
                int i2 = this.mManagedButton;
                if (i2 == 1) {
                    NearNumberPicker.this.mIncrementVirtualButtonPressed = true;
                    NearNumberPicker nearNumberPicker = NearNumberPicker.this;
                    nearNumberPicker.invalidate(0, nearNumberPicker.mBottomSelectionDividerBottom, NearNumberPicker.this.getRight(), NearNumberPicker.this.getBottom());
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    NearNumberPicker.this.mDecrementVirtualButtonPressed = true;
                    NearNumberPicker nearNumberPicker2 = NearNumberPicker.this;
                    nearNumberPicker2.invalidate(0, 0, nearNumberPicker2.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            int i3 = this.mManagedButton;
            if (i3 == 1) {
                if (!NearNumberPicker.this.mIncrementVirtualButtonPressed) {
                    NearNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                NearNumberPicker.access$180(NearNumberPicker.this, 1);
                NearNumberPicker nearNumberPicker3 = NearNumberPicker.this;
                nearNumberPicker3.invalidate(0, nearNumberPicker3.mBottomSelectionDividerBottom, NearNumberPicker.this.getRight(), NearNumberPicker.this.getBottom());
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (!NearNumberPicker.this.mDecrementVirtualButtonPressed) {
                NearNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            NearNumberPicker.access$380(NearNumberPicker.this, 1);
            NearNumberPicker nearNumberPicker4 = NearNumberPicker.this;
            nearNumberPicker4.invalidate(0, 0, nearNumberPicker4.getRight(), NearNumberPicker.this.mTopSelectionDividerTop);
        }
    }

    public class TouchEffectHandler extends Handler {
        public TouchEffectHandler(Looper looper) {
            super(looper);
        }

        private boolean shouldPerformTouchEffect() {
            return SystemClock.uptimeMillis() - NearNumberPicker.this.mLastTouchEffectTime > ((long) NearNumberPicker.this.mTouchEffectInterval);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    String str = (String) NearNumberPicker.this.mSelectorIndexToStringCache.get(((Integer) message.obj).intValue());
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(NearNumberPicker.this.mTalkbackSuffix)) {
                        str = str + NearNumberPicker.this.mTalkbackSuffix;
                    }
                    if (NearNumberPicker.this.mScrollState == 0) {
                        NearNumberPicker.this.announceForAccessibility(str);
                        if (NearNumberPicker.this.mOnScrollingStopListener != null) {
                            NearNumberPicker.this.mOnScrollingStopListener.onScrollingStop();
                        }
                    }
                }
            } else if (shouldPerformTouchEffect()) {
                NearNumberPicker.this.playSoundEffect();
                NearNumberPicker.this.performFeedback();
                NearNumberPicker.this.mLastTouchEffectTime = SystemClock.uptimeMillis();
            }
            super.handleMessage(message);
        }
    }

    public class TwoDigitFormatter implements Formatter {
        DecimalFormat mDecimalFormat;
        java.util.Formatter mJavaFormatter;
        final StringBuilder mBuilder = new StringBuilder();
        final Object[] mArgs = new Object[1];

        public TwoDigitFormatter() {
            init(Locale.getDefault());
        }

        private void init(Locale locale) {
            this.mJavaFormatter = new java.util.Formatter(this.mBuilder, locale);
            this.mDecimalFormat = new DecimalFormat("00");
        }

        @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.Formatter
        public String format(int i) {
            this.mArgs[0] = Integer.valueOf(i);
            StringBuilder sb = this.mBuilder;
            sb.delete(0, sb.length());
            return this.mDecimalFormat.format(i);
        }
    }

    public NearNumberPicker(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean access$180(NearNumberPicker nearNumberPicker, int i) {
        ?? r2 = (i ^ (nearNumberPicker.mIncrementVirtualButtonPressed ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        nearNumberPicker.mIncrementVirtualButtonPressed = r2;
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    public static /* synthetic */ boolean access$380(NearNumberPicker nearNumberPicker, int i) {
        ?? r2 = (i ^ (nearNumberPicker.mDecrementVirtualButtonPressed ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
        nearNumberPicker.mDecrementVirtualButtonPressed = r2;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeValueByOne(boolean z) {
        if (!moveToFinalScrollerPosition(this.mFlingScroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        this.mPreviousScrollerY = 0;
        if (z) {
            this.mFlingScroller.startScroll(0, 0, 0, -this.mSelectorElementHeight, 300);
        } else {
            this.mFlingScroller.startScroll(0, 0, 0, this.mSelectorElementHeight, 300);
        }
        invalidate();
    }

    private void decrementSelectorIndices(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = getWrappedSelectorIndex(iArr[i], -1);
        }
        ensureCachedScrollSelectorValue(iArr[0]);
    }

    private void ensureCachedScrollSelectorValue(int i) {
        String number;
        SparseArray<String> sparseArray = this.mSelectorIndexToStringCache;
        if (sparseArray.get(i) != null) {
            return;
        }
        int i2 = this.mMinValue;
        if (i < i2 || i > this.mMaxValue) {
            number = "";
        } else {
            String[] strArr = this.mDisplayedValues;
            number = strArr != null ? strArr[i - i2] : formatNumber(i);
        }
        sparseArray.put(i, number);
    }

    private boolean ensureScrollWheelAdjusted() {
        int i = this.mInitialScrollOffset - this.mCurrentScrollOffset;
        if (i == 0) {
            return false;
        }
        this.mPreviousScrollerY = 0;
        int iAbs = Math.abs(i);
        int i2 = this.mSelectorElementHeight;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.mAdjustScroller.startScroll(0, 0, 0, i, 800);
        invalidate();
        return true;
    }

    private void fling(int i) {
        this.mPreviousScrollerY = 0;
        if (i > 0) {
            this.mFlingScroller.fling(0, 0, 0, i, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.mFlingScroller.fling(0, Integer.MAX_VALUE, 0, i, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatNumber(int i) {
        Formatter formatter = this.mFormatter;
        return formatter != null ? formatter.format(i) : formatNumberWithLocale(i);
    }

    private static String formatNumberWithLocale(int i) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
    }

    private float getDampRatio() {
        return Math.min(2.0f, (this.mMaxValue / 60.0f) + 0.6f);
    }

    private int getGradientCoeff(int i) {
        return Math.abs((i - this.mInitialScrollOffset) - (this.mSelectorMiddleItemIndex * this.mSelectorElementHeight)) / this.mSelectorElementHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWrappedSelectorIndex(int i) {
        return getWrappedSelectorIndex(i, 0);
    }

    private int gradualChange(int i, int i2, float f) {
        return i2 - ((int) (((i2 - i) * 2) * f));
    }

    private float gradualChangeTextSize(int i, int i2, int i3, int i4, int i5) {
        int i6 = this.mInitialScrollOffset;
        int i7 = this.mSelectorMiddleItemIndex;
        int i8 = this.mSelectorElementHeight;
        int i9 = (i7 * i8) + i6;
        int length = ((this.mSelectorIndices.length - 1) * i8) + i6;
        double d = i5;
        double d2 = i9;
        if (d > d2 - (((double) i8) * 0.5d) && d < d2 + (((double) i8) * 0.5d)) {
            return i2 - ((((i2 - i) * 2.0f) * Math.abs(i5 - i9)) / this.mSelectorElementHeight);
        }
        if (i5 <= i9 - i8) {
            return i3 + (((((i4 - i3) * 1.0f) * (i5 - i6)) / i8) / 2.0f);
        }
        return i5 >= i9 + i8 ? i3 + (((((i4 - i3) * 1.0f) * (length - i5)) / i8) / 2.0f) : i4;
    }

    private void incrementSelectorIndices(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = getWrappedSelectorIndex(iArr[i], 1);
        }
        ensureCachedScrollSelectorValue(iArr[iArr.length - 1]);
    }

    private void initColorGradientRes() {
        int i = this.mInitialScrollOffset;
        int i2 = this.mSelectorElementHeight;
        int i3 = this.mSelectorMiddleItemIndex;
        this.mGradientPositionTop = (int) (((double) i) + (((double) i2) * (((double) i3) - 0.5d)));
        this.mGradientPositionBottom = (int) (((double) i) + (((double) i2) * (((double) i3) + 0.5d)));
    }

    private void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(false);
        setFadingEdgeLength(((getBottom() - getTop()) - this.mNormalTextSize) / 2);
    }

    private void initializeSelectorWheel() {
        initializeSelectorWheelIndices();
        int[] iArr = this.mSelectorIndices;
        int bottom = (int) (((((getBottom() - getTop()) - (iArr.length * this.mNormalTextSize)) - this.mPickerOffset) / iArr.length) + 0.5f);
        this.mSelectorTextGapHeight = bottom;
        this.mSelectorElementHeight = this.mNormalTextSize + bottom;
        this.mInitialScrollOffset = 0;
        this.mCurrentScrollOffset = 0;
        this.mTopSelectionDividerTop = (getHeight() / 2) - (this.mSelectorElementHeight / 2);
        this.mBottomSelectionDividerBottom = (getHeight() / 2) + (this.mSelectorElementHeight / 2);
    }

    private void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i = 0; i < this.mSelectorIndices.length; i++) {
            int i2 = i - this.mSelectorMiddleItemIndex;
            int wrappedSelectorIndex = this.mIgnorable ? getWrappedSelectorIndex(value, i2) : i2 + value;
            if (this.mWrapSelectorWheel) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            iArr[i] = wrappedSelectorIndex;
            ensureCachedScrollSelectorValue(wrappedSelectorIndex);
        }
    }

    private int makeMeasureSpec(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            if (mode == 1073741824) {
                return i;
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
            int i3 = this.mInitTextMargin;
            size = iMeasureText + (i3 - this.mUnitMinWidth) + i3 + this.mSelectedValueWidth;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
    }

    private boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.mInitialScrollOffset - ((this.mCurrentScrollOffset + finalY) % this.mSelectorElementHeight);
        if (i == 0) {
            return false;
        }
        int iAbs = Math.abs(i);
        int i2 = this.mSelectorElementHeight;
        if (iAbs > i2 / 2) {
            i = i > 0 ? i - i2 : i + i2;
        }
        scrollBy(0, finalY + i);
        return true;
    }

    private void notifyChange(int i, int i2) {
        OnValueChangeListener onValueChangeListener = this.mOnValueChangeListener;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this, i, this.mValue);
        }
    }

    private void onScrollStateChange(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChange(this, i);
        }
        if (this.mScrollState == 0) {
            announceForAccessibility(this.mSelectorIndexToStringCache.get(getValue()));
            OnScrollingStopListener onScrollingStopListener = this.mOnScrollingStopListener;
            if (onScrollingStopListener != null) {
                onScrollingStopListener.onScrollingStop();
            }
        }
    }

    private void onScrollerFinished(Scroller scroller) {
        if (scroller == this.mFlingScroller) {
            ensureScrollWheelAdjusted();
            onScrollStateChange(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performFeedback() {
        try {
            fh8.a(this, 302, 0);
        } catch (Exception unused) {
        }
    }

    private void postChangeCurrentByOneFromLongPress(boolean z, long j2) {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand == null) {
            this.mChangeCurrentByOneFromLongPressCommand = new ChangeCurrentByOneFromLongPressCommand();
        } else {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        this.mChangeCurrentByOneFromLongPressCommand.setStep(z);
        postDelayed(this.mChangeCurrentByOneFromLongPressCommand, j2);
    }

    private void removeAllCallbacks() {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        this.mPressedStateHelper.cancel();
    }

    private void removeChangeCurrentByOneFromLongPress() {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
    }

    private int resolveSizeAndStateRespectingMinSize(int i, int i2, int i3) {
        return i != -1 ? View.resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    private void setValueInternal(int i, boolean z) {
        if (this.mValue == i) {
            initializeSelectorWheelIndices();
            return;
        }
        int wrappedSelectorIndex = this.mWrapSelectorWheel ? getWrappedSelectorIndex(i) : Math.min(Math.max(i, this.mMinValue), this.mMaxValue);
        int i2 = this.mValue;
        this.mValue = wrappedSelectorIndex;
        if (z) {
            notifyChange(i2, wrappedSelectorIndex);
            this.mHandler.removeMessages(0);
            this.mHandler.sendEmptyMessage(0);
            AccessibilityManager accessibilityManager = this.mAccessibilityManager;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                Message message = new Message();
                message.what = 1;
                message.obj = Integer.valueOf(wrappedSelectorIndex);
                this.mHandler.removeMessages(1);
                this.mHandler.sendMessageDelayed(message, 300L);
            }
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    private void updateWrapSelectorWheel() {
        this.mWrapSelectorWheel = (this.mMaxValue - this.mMinValue >= this.mSelectorIndices.length) && this.mWrapSelectorWheelPreferred;
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
        Scroller scroller = this.mFlingScroller;
        if (scroller.isFinished()) {
            scroller = this.mAdjustScroller;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.mPreviousScrollerY == 0) {
            this.mPreviousScrollerY = scroller.getStartY();
        }
        scrollBy(0, currY - this.mPreviousScrollerY);
        this.mPreviousScrollerY = currY;
        if (scroller.isFinished()) {
            onScrollerFinished(scroller);
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
        int i;
        if (!this.mAccessibilityManager.isEnabled()) {
            return false;
        }
        int y = (int) motionEvent.getY();
        if (y < this.mTopSelectionDividerTop) {
            i = 3;
        } else {
            i = y > this.mBottomSelectionDividerBottom ? 1 : 2;
        }
        int actionMasked = motionEvent.getActionMasked();
        AccessibilityNodeProviderImpl accessibilityNodeProviderImpl = (AccessibilityNodeProviderImpl) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i2 = this.mLastHoveredChildVirtualViewId;
            if (i2 == i || i2 == -1) {
                return false;
            }
            accessibilityNodeProviderImpl.sendAccessibilityEventForVirtualView(i2, 256);
            accessibilityNodeProviderImpl.sendAccessibilityEventForVirtualView(i, 128);
            this.mLastHoveredChildVirtualViewId = i;
            accessibilityNodeProviderImpl.performAction(i, 64, null);
            return false;
        }
        if (actionMasked == 9) {
            accessibilityNodeProviderImpl.sendAccessibilityEventForVirtualView(i, 128);
            this.mLastHoveredChildVirtualViewId = i;
            accessibilityNodeProviderImpl.performAction(i, 64, null);
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        accessibilityNodeProviderImpl.sendAccessibilityEventForVirtualView(i, 256);
        this.mLastHoveredChildVirtualViewId = -1;
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
            this.mAccessibilityNodeProvider = new AccessibilityNodeProviderImpl();
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
        HandlerThread handlerThread = new HandlerThread("touchEffect", -16);
        this.mTouchEffectThread = handlerThread;
        handlerThread.start();
        if (this.mTouchEffectThread.getLooper() != null) {
            this.mHandler = new TouchEffectHandler(this.mTouchEffectThread.getLooper());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
        HandlerThread handlerThread = this.mTouchEffectThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mTouchEffectThread = null;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int iGradualChange;
        int iGradualChange2;
        int iGradualChange3;
        int iGradualChange4;
        int i;
        if (this.mHasBackground) {
            float f = this.mBackgroundLeft;
            float height = (getHeight() / 2.0f) - this.mBackgroundRadius;
            float width = getWidth() - this.mBackgroundLeft;
            float height2 = getHeight() / 2.0f;
            int i2 = this.mBackgroundRadius;
            canvas.drawRoundRect(f, height, width, height2 + i2, i2, i2, this.mBackgroundPaint);
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
                i = this.mVisualWidth / 2;
            } else if (i5 == 2) {
                int right2 = getRight() - getLeft();
                int i6 = this.mVisualWidth;
                i = (right2 - i6) + (i6 / 2);
            }
            right = i;
        }
        int i7 = this.mNumberPickerPaddingLeft;
        if (i7 != 0) {
            right += i7;
        }
        float f2 = right;
        int[] iArr = this.mSelectorIndices;
        float f3 = 0.0f;
        int i8 = i3;
        int i9 = 0;
        while (i9 < iArr.length) {
            int i10 = iArr[i9];
            if (i8 <= this.mGradientPositionTop || i8 >= this.mGradientPositionBottom) {
                iGradualChange = this.mAlphaStart;
                iGradualChange2 = this.mRedStart;
                iGradualChange3 = this.mGreenStart;
                iGradualChange4 = this.mBlueStart;
            } else {
                float gradientCoeff = getGradientCoeff(i8);
                iGradualChange = gradualChange(this.mAlphaStart, this.mAlphaEnd, gradientCoeff);
                iGradualChange2 = gradualChange(this.mRedStart, this.mRedEnd, gradientCoeff);
                iGradualChange3 = gradualChange(this.mGreenStart, this.mGreenEnd, gradientCoeff);
                iGradualChange4 = gradualChange(this.mBlueStart, this.mBlueEnd, gradientCoeff);
            }
            int iArgb = Color.argb(iGradualChange, iGradualChange2, iGradualChange3, iGradualChange4);
            int i11 = this.mNormalTextSize;
            float fGradualChangeTextSize = gradualChangeTextSize(i11, this.mFocusTextSize, i11, i11, i8);
            this.mSelectorWheelPaint.setColor(iArgb);
            String str = this.mSelectorIndexToStringCache.get(i10);
            if (!this.mCurrentLanguageTooLong) {
                this.mSelectorWheelPaint.setTextSize(fGradualChangeTextSize);
                if (this.mMeasureTextSelectorPaint.measureText(str) >= getMeasuredWidth()) {
                    this.mSelectorWheelPaint.setTextSize(this.mNormalTextSize);
                    this.mCurrentLanguageTooLong = z;
                }
            }
            if (i10 != Integer.MIN_VALUE) {
                Paint.FontMetrics fontMetrics = this.mSelectorWheelPaint.getFontMetrics();
                int i12 = i9 == this.mSelectorMiddleItemIndex ? (int) ((((((i8 + i8) + this.mSelectorElementHeight) - fontMetrics.top) - fontMetrics.bottom) / 2.0f) + (this.mPickerOffset / 2)) : (int) ((((((i8 + i8) + this.mSelectorElementHeight) - this.mNormalTextTop) - this.mNormalTextBottom) / 2.0f) + (this.mPickerOffset / 2));
                this.mUnitTextPaint.setTextSize(this.mNormalTextSize);
                Paint.FontMetrics fontMetrics2 = this.mUnitTextPaint.getFontMetrics();
                int i13 = this.mSelectorElementHeight;
                float f4 = (int) ((((i13 - fontMetrics2.top) - fontMetrics2.bottom) / 2.0f) + (this.mPickerOffset / 2) + i13);
                if (str == null) {
                    str = "";
                }
                canvas.drawText(str, f2, i12, this.mSelectorWheelPaint);
                f3 = f4;
            } else {
                float f5 = fGradualChangeTextSize / this.mFocusTextSize;
                for (float f6 = -0.5f; f6 < 1.0f; f6 += 1.0f) {
                    float f7 = this.mIgnoreBarWidth;
                    float f8 = (this.mIgnoreBarSpacing + f7) * f6 * f5;
                    float f9 = this.mIgnoreBarHeight * f5;
                    float f10 = f8 + f2;
                    float f11 = (f7 * f5) / 2.0f;
                    float f12 = i8;
                    int i14 = this.mSelectorElementHeight;
                    float f13 = f9 / 2.0f;
                    canvas.drawRect(f10 - f11, (((i14 / 2.0f) + f12) - f13) + 33.75f, f10 + f11, f12 + (i14 / 2.0f) + f13 + 33.75f, this.mSelectorWheelPaint);
                }
            }
            i8 += this.mSelectorElementHeight;
            i9++;
            z = true;
        }
        if (this.mUnitText != null) {
            if (isLayoutRtl()) {
                f2 = (f2 + this.mNumberPickerPaddingRight) - this.mNumberPickerPaddingLeft;
            }
            float measuredWidth = f2 + (this.mSelectedValueWidth / 2) + this.mUnitMargin;
            if (isLayoutRtl()) {
                measuredWidth = (getMeasuredWidth() - measuredWidth) - this.mUnitTextPaint.measureText(this.mUnitText);
            }
            this.mUnitTextPaint.setTextSize(this.mUnitTextSize);
            canvas.drawText(this.mUnitText, measuredWidth, f3, this.mUnitTextPaint);
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
        float f = this.mLastDownEventY;
        if (f < this.mTopSelectionDividerTop) {
            if (this.mScrollState == 0) {
                this.mPressedStateHelper.buttonPressDelayed(2);
            }
        } else if (f > this.mBottomSelectionDividerBottom && this.mScrollState == 0) {
            this.mPressedStateHelper.buttonPressDelayed(1);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.mFlingScroller.isFinished()) {
            this.mFlingScroller.forceFinished(true);
            this.mAdjustScroller.forceFinished(true);
            onScrollStateChange(0);
        } else if (this.mAdjustScroller.isFinished()) {
            float f2 = this.mLastDownEventY;
            if (f2 < this.mTopSelectionDividerTop) {
                postChangeCurrentByOneFromLongPress(false, ViewConfiguration.getLongPressTimeout());
            } else if (f2 > this.mBottomSelectionDividerBottom) {
                postChangeCurrentByOneFromLongPress(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.mPerformClickOnTap = true;
            }
        } else {
            this.mFlingScroller.forceFinished(true);
            this.mAdjustScroller.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            initializeSelectorWheel();
            initializeFadingEdges();
        }
        initColorGradientRes();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = makeMeasureSpec(i, this.mMaxWidth);
        super.onMeasure(iMakeMeasureSpec, makeMeasureSpec(i2, this.mMaxHeight));
        if (View.MeasureSpec.getMode(iMakeMeasureSpec) != Integer.MIN_VALUE) {
            this.mTextMargin = (getMeasuredWidth() - this.mSelectedValueWidth) / 2;
        }
        int iResolveSizeAndStateRespectingMinSize = resolveSizeAndStateRespectingMinSize(this.mMinWidth, getMeasuredWidth(), i) + ((this.mNumberPickerPaddingRight + this.mNumberPickerPaddingLeft) * 2);
        int i3 = this.mMaxViewWidth;
        if (i3 > 0 && iResolveSizeAndStateRespectingMinSize > i3) {
            iResolveSizeAndStateRespectingMinSize = i3;
        }
        setMeasuredDimension(iResolveSizeAndStateRespectingMinSize, resolveSizeAndStateRespectingMinSize(this.mMinHeight, getMeasuredHeight(), i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            removeChangeCurrentByOneFromLongPress();
            this.mPressedStateHelper.cancel();
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
                fling(yVelocity * 2);
                onScrollStateChange(2);
            } else {
                int y = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y - this.mLastDownEventY);
                long eventTime = motionEvent.getEventTime() - this.mLastDownEventTime;
                if (iAbs > this.mTouchSlop || eventTime >= ViewConfiguration.getTapTimeout()) {
                    ensureScrollWheelAdjusted();
                } else if (this.mPerformClickOnTap) {
                    this.mPerformClickOnTap = false;
                    performClick();
                } else {
                    int i = (y / this.mSelectorElementHeight) - this.mSelectorMiddleItemIndex;
                    if (i > 0) {
                        changeValueByOne(true);
                        this.mPressedStateHelper.buttonTapped(1);
                    } else if (i < 0) {
                        changeValueByOne(false);
                        this.mPressedStateHelper.buttonTapped(2);
                    }
                    ensureScrollWheelAdjusted();
                }
                onScrollStateChange(0);
            }
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        } else if (actionMasked == 2) {
            float y2 = motionEvent.getY();
            if (this.mScrollState == 1) {
                scrollBy(0, (int) (y2 - this.mLastDownOrMoveEventY));
                invalidate();
            } else if (((int) Math.abs(y2 - this.mLastDownEventY)) > this.mTouchSlop) {
                removeAllCallbacks();
                onScrollStateChange(1);
            }
            this.mLastDownOrMoveEventY = y2;
        } else if (actionMasked == 3) {
            ensureScrollWheelAdjusted();
        }
        return true;
    }

    public void playSoundEffect() {
        this.mSoundUtil.d(getContext(), this.mClickSoundId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mRefreshStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if (TextUtils.equals(resourceTypeName, "attr")) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearNumberPicker, this.mRefreshStyle, 0);
        } else if (TextUtils.equals(resourceTypeName, Const.Arguments.Open.STYLE)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearNumberPicker, 0, this.mRefreshStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxNormalTextColor, -1);
            this.mFocusTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxFocusTextColor, -1);
            this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxPickerBackgroundColor, -1);
            setSelectorTextColor(this.mNormalTextColor, this.mFocusTextColor);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        int i3;
        int[] iArr = this.mSelectorIndices;
        int i4 = this.mCurrentScrollOffset;
        boolean z = this.mWrapSelectorWheel;
        if (!z && i2 > 0 && iArr[this.mSelectorMiddleItemIndex] <= this.mMinValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        if (!z && i2 < 0 && iArr[this.mSelectorMiddleItemIndex] >= this.mMaxValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        this.mCurrentScrollOffset = i2 + i4;
        while (true) {
            int i5 = this.mCurrentScrollOffset;
            if (i5 - this.mInitialScrollOffset <= this.mSelectorTextGapHeight + (this.mPickerOffset / 2)) {
                break;
            }
            this.mCurrentScrollOffset = i5 - this.mSelectorElementHeight;
            decrementSelectorIndices(iArr);
            setValueInternal(iArr[this.mSelectorMiddleItemIndex], true);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] <= this.mMinValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
        while (true) {
            i3 = this.mCurrentScrollOffset;
            if (i3 - this.mInitialScrollOffset >= (-this.mSelectorTextGapHeight) - (this.mPickerOffset / 2)) {
                break;
            }
            this.mCurrentScrollOffset = i3 + this.mSelectorElementHeight;
            incrementSelectorIndices(iArr);
            setValueInternal(iArr[this.mSelectorMiddleItemIndex], true);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] >= this.mMaxValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
        if (i4 != i3) {
            onScrollChanged(0, i3, 0, i4);
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

    public void setAlignPosition(int i) {
        this.mAlignPosition = i;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues == strArr) {
            return;
        }
        this.mDisplayedValues = strArr;
        initializeSelectorWheelIndices();
    }

    public void setFormatter(Formatter formatter) {
        if (formatter == this.mFormatter) {
            return;
        }
        this.mFormatter = formatter;
        initializeSelectorWheelIndices();
    }

    public void setGradientColor(int i, int i2) {
        this.mAlphaStart = Color.alpha(i);
        this.mAlphaEnd = Color.alpha(i2);
        this.mRedStart = Color.red(i);
        this.mRedEnd = Color.red(i2);
        this.mGreenStart = Color.green(i);
        this.mGreenEnd = Color.green(i2);
        this.mBlueStart = Color.blue(i);
        this.mBlueEnd = Color.blue(i2);
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

    public void setMaxValue(int i) {
        if (this.mMaxValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.mMaxValue = i;
        if (i < this.mValue) {
            this.mValue = i;
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void setMinValue(int i) {
        if (this.mMinValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.mMinValue = i;
        if (i > this.mValue) {
            this.mValue = i;
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void setNormalTextColor(int i) {
        if (this.mNormalTextColor != i) {
            this.mNormalTextColor = i;
            setSelectorTextColor(i, this.mFocusTextColor);
        }
    }

    public void setNumberPickerPaddingLeft(int i) {
        this.mNumberPickerPaddingLeft = i;
        requestLayout();
    }

    public void setNumberPickerPaddingRight(int i) {
        this.mNumberPickerPaddingRight = i;
        requestLayout();
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.mLongPressUpdateInterval = j2;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mOnScrollListener = onScrollListener;
    }

    public void setOnScrollingStopListener(OnScrollingStopListener onScrollingStopListener) {
        this.mOnScrollingStopListener = onScrollingStopListener;
    }

    public void setOnValueChangedListener(OnValueChangeListener onValueChangeListener) {
        this.mOnValueChangeListener = onValueChangeListener;
    }

    public void setPickerFocusColor(int i) {
        this.mAlphaEnd = Color.alpha(i);
        this.mRedEnd = Color.red(i);
        this.mGreenEnd = Color.green(i);
        this.mBlueEnd = Color.green(i);
    }

    public void setPickerNormalColor(int i) {
        this.mAlphaStart = Color.alpha(i);
        this.mRedStart = Color.red(i);
        this.mGreenStart = Color.green(i);
        this.mBlueStart = Color.green(i);
    }

    public void setPickerRowNumber(int i) {
        this.mSelectorItemCount = i;
        this.mSelectorMiddleItemIndex = i / 2;
        this.mSelectorIndices = new int[i];
    }

    public void setSelectedValueWidth(int i) {
        this.mSelectedValueWidth = i;
    }

    public void setSelectorTextColor(@ColorInt int i, @ColorInt int i2) {
        setGradientColor(i, i2);
        invalidate();
    }

    public void setTouchEffectInterval(int i) {
        this.mTouchEffectInterval = i;
    }

    public void setTwoDigitFormatter() {
        if (this.mTwoDigitFormatter == null) {
            this.mTwoDigitFormatter = new TwoDigitFormatter();
        }
        this.mFormatter = this.mTwoDigitFormatter;
    }

    public void setUnitText(String str) {
        this.mUnitText = str;
    }

    public void setValue(int i) {
        setValueInternal(i, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        this.mWrapSelectorWheelPreferred = z;
        updateWrapSelectorWheel();
    }

    public NearNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxNumberPickerStyle);
    }

    private int getWrappedSelectorIndex(int i, int i2) {
        int i3 = this.mMaxValue;
        int i4 = this.mMinValue;
        if (i3 - i4 <= 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE) {
            i = i4 - 1;
        }
        int iFloorMod = MathUtils.floorMod((i - i4) + i2, (i3 - i4) + 1 + (this.mIgnorable ? 1 : 0));
        int i5 = this.mMaxValue;
        int i6 = this.mMinValue;
        if (iFloorMod < (i5 - i6) + 1) {
            return i6 + iFloorMod;
        }
        return Integer.MIN_VALUE;
    }

    public NearNumberPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearNumberPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mSelectorIndexToStringCache = new SparseArray<>();
        this.mWrapSelectorWheelPreferred = true;
        this.mLongPressUpdateInterval = 300L;
        this.mInitialScrollOffset = Integer.MIN_VALUE;
        this.mScrollState = 0;
        this.mLastHandledDownDpadKeyCode = -1;
        this.mHasBackground = false;
        vhc.b(this, false);
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        alc alcVarA = alc.a();
        this.mSoundUtil = alcVarA;
        this.mClickSoundId = alcVarA.c(context, R$raw.numberpicker_click);
        if (attributeSet != null) {
            this.mRefreshStyle = attributeSet.getStyleAttribute();
        }
        if (this.mRefreshStyle == 0) {
            this.mRefreshStyle = i;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearNumberPicker, i, R$style.NearNumberPicker);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearNumberPicker_nxPickerRowNumber, 5);
        this.mSelectorItemCount = integer;
        this.mSelectorMiddleItemIndex = integer / 2;
        this.mSelectorIndices = new int[integer];
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxMinHeight, -1);
        this.mMinHeight = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxMaxHeight, -1);
        this.mMaxHeight = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxMinWidth, -1);
        this.mMinWidth = dimensionPixelSize3;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxMaxWidth, -1);
        this.mMaxWidth = dimensionPixelSize4;
        if (dimensionPixelSize3 != -1 && dimensionPixelSize4 != -1 && dimensionPixelSize3 > dimensionPixelSize4) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        this.mAlignPosition = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearNumberPicker_nxPickerAlignPosition, -1);
        this.mFocusTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxFocusTextSize, -1);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxStartTextSize, -1);
        this.mNormalTextSize = dimensionPixelSize5;
        this.mVisualWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxPickerVisualWidth, -1);
        this.mNumberPickerPaddingLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxPickerPaddingLeft, 0);
        this.mNumberPickerPaddingRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearNumberPicker_nxPickerPaddingRight, 0);
        this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxNormalTextColor, -1);
        this.mFocusTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxFocusTextColor, -1);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearNumberPicker_nxPickerBackgroundColor, -1);
        this.mTouchEffectInterval = typedArrayObtainStyledAttributes.getInt(R$styleable.NearNumberPicker_nxPickerTouchEffectInterval, 100);
        setGradientColor(this.mNormalTextColor, this.mFocusTextColor);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NearPickersCommonAttrs, i, 0);
        this.mMaxViewWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.NearPickersCommonAttrs_nxPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.mIgnoreBarWidth = getResources().getDimension(R$dimen.nx_numberpicker_ignore_bar_width);
        this.mIgnoreBarHeight = getResources().getDimension(R$dimen.nx_numberpicker_ignore_bar_height);
        this.mIgnoreBarSpacing = getResources().getDimension(R$dimen.nx_numberpicker_ignore_bar_spacing);
        this.mUnitMinWidth = getResources().getDimensionPixelOffset(R$dimen.nx_number_picker_unit_min_width);
        this.mUnitTextSize = getResources().getDimensionPixelSize(R$dimen.nx_numberpicker_unit_textSize);
        this.mSelectedValueWidth = getResources().getDimensionPixelOffset(R$dimen.nx_number_picker_text_width);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.nx_number_picker_text_margin_start);
        this.mUnitMargin = dimensionPixelOffset;
        int i3 = ((dimensionPixelSize3 - this.mSelectedValueWidth) - this.mUnitMinWidth) - (dimensionPixelOffset * 2);
        this.mInitTextMargin = i3;
        this.mTextMargin = i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint = new Paint();
        paint.setTextSize(dimensionPixelSize5);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.setTypeface(Typeface.create("sys-sans-en", 0));
        this.mNormalTextTop = fontMetrics.top;
        this.mNormalTextBottom = fontMetrics.bottom;
        this.mSelectorWheelPaint = paint;
        this.mMeasureTextSelectorPaint = paint;
        paint.setTextSize(getResources().getDimensionPixelSize(R$dimen.nx_numberpicker_textSize_big));
        this.mFlingScroller = new Scroller(getContext(), null, true);
        this.mAdjustScroller = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mPressedStateHelper = new PressedStateHelper();
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(false);
        Paint paint2 = new Paint();
        this.mUnitTextPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setTextSize(this.mUnitTextSize);
        paint2.setColor(this.mFocusTextColor);
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_radius);
        Resources resources = context.getResources();
        int i4 = R$dimen.nx_selected_background_horizontal_padding;
        this.mBackgroundLeft = resources.getDimensionPixelOffset(i4);
        this.mPickerOffset = context.getResources().getDimensionPixelOffset(i4);
        Paint paint3 = new Paint();
        this.mBackgroundPaint = paint3;
        paint3.setColor(this.mBackgroundColor);
    }
}
