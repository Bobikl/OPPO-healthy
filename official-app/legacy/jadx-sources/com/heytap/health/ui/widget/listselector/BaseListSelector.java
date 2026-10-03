package com.heytap.health.ui.widget.listselector;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.SoundPool;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$font;
import com.heytap.health.ui.R$dimen;
import com.heytap.health.ui.R$id;
import com.heytap.health.ui.R$layout;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.tm2;
import com.support.appcompat.R$attr;
import com.support.picker.R$raw;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BaseListSelector extends LinearLayout {
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_MIDDLE = 0;
    public static final int ALIGN_RIGHT = 2;
    private static final long ANIMATION_DURATION = 300;
    private static final int BLUE_COLOER_END = 74;
    private static final int BUTTON_ALPHA_OPAQUE = 1;
    private static final int BUTTON_ALPHA_TRANSPARENT = 0;
    private static final int CHANGE_CURRENT_BY_ONE_SCROLL_DURATION = 300;
    private static final int COLOER_START = 74;
    private static final float DECELERATE_INTERPOLATOR = 2.5f;
    private static final int DEFAULT_INIT_VALUE = 0;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300;
    private static final int DEFAULT_NEGATIVE_VALUE = Integer.MIN_VALUE;
    private static final int DEFAULT_POSITIVE_VALUE = Integer.MAX_VALUE;
    private static final int GREEN_COLOR_END = 152;
    private static final float HEIGHT_OFFSET = 2.0f;
    private static final float HEIGHT_OFFSET_HALF = 0.5f;
    private static final String PROPERTY_BUTTON_ALPHA = "alpha";
    private static final String PROPERTY_SELECTOR_PAINT_ALPHA = "selectorPaintAlpha";
    private static final int RED_COLOER_END = 11;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_WHEEL_BRIGHT_ALPHA = 255;
    private static final int SELECTOR_WHEEL_DIM_ALPHA = 255;
    private static final int SELECTOR_WHEEL_STATE_LARGE = 2;
    private static final int SELECTOR_WHEEL_STATE_NONE = 0;
    private static final int SELECTOR_WHEEL_STATE_SMALL = 1;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final String TAG = "BaseListSelector";
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
    private boolean enableMinFlingVelocity;
    private d mAccessibilityNodeProvider;
    private final Scroller mAdjustScroller;
    private e mAdjustScrollerCommand;
    private boolean mAdjustScrollerOnUpEvent;
    private int mAlignPosition;
    private int mAlphaEnd;
    private int mAlphaStart;
    private int mBlueEnd;
    private int mBlueStart;
    private f mChangeCurrentByOneFromLongPressCommand;
    private int mChangeIndexDistance;
    private boolean mCheckBeginEditOnUpEvent;
    private int mClickSoundId;
    private boolean mComputeMaxWidth;
    private Context mContext;
    private int mCurrentScrollOffset;
    private final ImageButton mDecrementButton;
    private final Animator mDimSelectorWheelAnimator;
    private String[] mDisplayedValues;
    private final Scroller mFlingScroller;
    private final boolean mFlingable;
    private int mFocusTextSize;
    private g mFormatter;
    private int mGreenEnd;
    private int mGreenStart;
    private final ImageButton mIncrementButton;
    private int mInitialScrollOffset;
    private final EditText mInputText;
    private boolean mIsDrawBackground;
    private float mLastDownEventY;
    private int mLastHoveredChildVirtualViewId;
    private float mLastMotionEventY;
    private long mLastUpEventTimeMillis;
    private long mLongPressUpdateInterval;
    private final AccessibilityManager mManager;
    private final int mMaxHeight;
    private int mMaxValue;
    private int mMaxWidth;
    private int mMaximumFlingVelocity;
    private final int mMinHeight;
    private int mMinValue;
    private int mMinWidth;
    private int mMinimumFlingVelocity;
    private int mNormaTextHeight;
    private int mNumberPickerPaddingLeft;
    private int mNumberPickerPaddingRight;
    private i mOnScrollListener;
    private j mOnValueChangeListener;
    private int mPreviousScrollerY;
    private int mRedEnd;
    private int mRedStart;
    private boolean mScaleDisplayText;
    private int mScrollState;
    private boolean mScrollWheelAndFadingEdgesInitialized;
    private int mSelectorElementHeight;
    private final SparseArray<String> mSelectorIndexToStringCache;
    private int[] mSelectorIndices;
    private int mSelectorMiddleItemIndex;
    private int mSelectorTextGapHeight;
    private final Paint mSelectorWheelPaint;
    private int mSelectorWheelState;
    private k mSetSelectionCommand;
    private final AnimatorSet mShowInputControlsAnimator;
    private final long mShowInputControlsAnimimationDuration;
    private SoundPool mSoundPool;
    private final Rect mTempRect;
    private int mTextEnd;
    private final int mTextSize;
    private int mTextStart;
    private int mTouchSlop;
    private int mValue;
    private VelocityTracker mVelocityTracker;
    private int mVisualWidth;
    private boolean mWrapSelectorWheel;
    private int minFlingVelocity;
    private static final int SHOW_INPUT_CONTROLS_DELAY_MILLIS = ViewConfiguration.getDoubleTapTimeout();
    private static final char[] DIGIT_CHARACTERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static class CustomEditText extends AppCompatEditText {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView
        public void onEditorAction(int i) {
            super.onEditorAction(i);
            if (i == 6) {
                clearFocus();
            }
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InputMethodManager inputMethodManager = (InputMethodManager) BaseListSelector.this.mContext.getSystemService("input_method");
            if (inputMethodManager != null && inputMethodManager.isActive(BaseListSelector.this.mInputText)) {
                inputMethodManager.hideSoftInputFromWindow(BaseListSelector.this.getWindowToken(), 0);
            }
            BaseListSelector.this.mInputText.clearFocus();
            if (view.getId() == R$id.increment) {
                BaseListSelector.this.changeCurrentByOne(true);
            } else {
                BaseListSelector.this.changeCurrentByOne(false);
            }
        }
    }

    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BaseListSelector.this.mInputText.clearFocus();
            if (view.getId() == R$id.increment) {
                BaseListSelector.this.postChangeCurrentByOneFromLongPress(true);
            } else {
                BaseListSelector.this.postChangeCurrentByOneFromLongPress(false);
            }
            return true;
        }
    }

    public class c extends AnimatorListenerAdapter {
        public boolean i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f6089j;
        public final /* synthetic */ ObjectAnimator k;

        public c(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
            this.f6089j = objectAnimator;
            this.k = objectAnimator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (BaseListSelector.this.mShowInputControlsAnimator.isRunning()) {
                this.i = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.i) {
                BaseListSelector.this.setSelectorWheelState(1);
            }
            this.i = false;
            ObjectAnimator objectAnimator = this.f6089j;
            objectAnimator.setCurrentPlayTime(objectAnimator.getDuration());
            ObjectAnimator objectAnimator2 = this.k;
            objectAnimator2.setCurrentPlayTime(objectAnimator2.getDuration());
        }
    }

    public class d extends AccessibilityNodeProvider {
        public final Rect a = new Rect();
        public final int[] b = new int[2];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6091c = Integer.MIN_VALUE;

        public d() {
        }

        public final AccessibilityNodeInfo a(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(BaseListSelector.class.getName());
            accessibilityNodeInfoObtain.setPackageName(BaseListSelector.this.mContext.getPackageName());
            accessibilityNodeInfoObtain.setSource(BaseListSelector.this);
            if (h()) {
                accessibilityNodeInfoObtain.addChild(BaseListSelector.this, 0);
            }
            accessibilityNodeInfoObtain.addChild(BaseListSelector.this, 1);
            if (i()) {
                accessibilityNodeInfoObtain.addChild(BaseListSelector.this, 0);
            }
            accessibilityNodeInfoObtain.setParent((View) BaseListSelector.this.getParentForAccessibility());
            accessibilityNodeInfoObtain.setEnabled(BaseListSelector.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            Rect rect = this.a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            accessibilityNodeInfoObtain.setVisibleToUser(true);
            int[] iArr = this.b;
            BaseListSelector.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.f6091c != -1) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.f6091c == -1) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (BaseListSelector.this.isEnabled()) {
                if (BaseListSelector.this.getWrapSelectorWheel() || BaseListSelector.this.getValue() < BaseListSelector.this.getMaxValue()) {
                    accessibilityNodeInfoObtain.addAction(4096);
                }
                if (BaseListSelector.this.getWrapSelectorWheel() || BaseListSelector.this.getValue() > BaseListSelector.this.getMinValue()) {
                    accessibilityNodeInfoObtain.addAction(8192);
                }
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo b(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(Button.class.getName());
            accessibilityNodeInfoObtain.setPackageName(BaseListSelector.this.mContext.getPackageName());
            accessibilityNodeInfoObtain.setSource(BaseListSelector.this, i);
            accessibilityNodeInfoObtain.setParent(BaseListSelector.this);
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(BaseListSelector.this.isEnabled());
            Rect rect = this.a;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoObtain.setVisibleToUser(true);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.b;
            BaseListSelector.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.f6091c != i) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.f6091c == i) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            return accessibilityNodeInfoObtain;
        }

        public final AccessibilityNodeInfo c(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = BaseListSelector.this.mInputText.createAccessibilityNodeInfo();
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(BaseListSelector.this, 1);
            if (this.f6091c != 1) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
            }
            if (this.f6091c == 1) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(128);
            }
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setText(g());
            Rect rect = this.a;
            rect.set(i, i2, i3, i4);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(true);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.b;
            BaseListSelector.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return a(BaseListSelector.this.getScrollX(), BaseListSelector.this.getScrollY(), BaseListSelector.this.getScrollX() + (BaseListSelector.this.getRight() - BaseListSelector.this.getLeft()), BaseListSelector.this.getScrollY() + (BaseListSelector.this.getBottom() - BaseListSelector.this.getTop()));
            }
            if (i == 0) {
                return b(0, e(), BaseListSelector.this.getScrollX(), BaseListSelector.this.getScrollY(), BaseListSelector.this.getScrollX() + (BaseListSelector.this.getRight() - BaseListSelector.this.getLeft()), BaseListSelector.this.mDecrementButton.getHeight());
            }
            if (i != 1) {
                return i != 2 ? super.createAccessibilityNodeInfo(i) : b(2, f(), BaseListSelector.this.getScrollX(), BaseListSelector.this.mInputText.getHeight() + BaseListSelector.this.mDecrementButton.getHeight(), BaseListSelector.this.getScrollX() + (BaseListSelector.this.getRight() - BaseListSelector.this.getLeft()), BaseListSelector.this.getScrollY() + (BaseListSelector.this.getBottom() - BaseListSelector.this.getTop()));
            }
            return c(BaseListSelector.this.getScrollX(), BaseListSelector.this.mDecrementButton.getHeight(), BaseListSelector.this.getScrollX() + (BaseListSelector.this.getRight() - BaseListSelector.this.getLeft()), BaseListSelector.this.mInputText.getHeight() + BaseListSelector.this.mDecrementButton.getHeight());
        }

        public final void d(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 0) {
                String strE = e();
                if (TextUtils.isEmpty(strE) || !strE.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(0));
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                String strF = f();
                if (TextUtils.isEmpty(strF) || !strF.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            Editable text = BaseListSelector.this.mInputText.getText();
            if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            Editable text2 = BaseListSelector.this.mInputText.getText();
            if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(1));
        }

        public final String e() {
            int wrappedSelectorIndex = BaseListSelector.this.mValue - 1;
            if (BaseListSelector.this.mWrapSelectorWheel) {
                wrappedSelectorIndex = BaseListSelector.this.getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            if (wrappedSelectorIndex >= BaseListSelector.this.mMinValue) {
                return BaseListSelector.this.mDisplayedValues == null ? BaseListSelector.this.formatNumber(wrappedSelectorIndex) : BaseListSelector.this.mDisplayedValues[wrappedSelectorIndex - BaseListSelector.this.mMinValue];
            }
            return null;
        }

        public final String f() {
            int wrappedSelectorIndex = BaseListSelector.this.mValue + 1;
            if (BaseListSelector.this.mWrapSelectorWheel) {
                wrappedSelectorIndex = BaseListSelector.this.getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            if (wrappedSelectorIndex <= BaseListSelector.this.mMaxValue) {
                return BaseListSelector.this.mDisplayedValues == null ? BaseListSelector.this.formatNumber(wrappedSelectorIndex) : BaseListSelector.this.mDisplayedValues[wrappedSelectorIndex - BaseListSelector.this.mMinValue];
            }
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                d(lowerCase, 0, arrayList);
                d(lowerCase, 1, arrayList);
                d(lowerCase, 2, arrayList);
                return arrayList;
            }
            if (i != 0 && i != 1 && i != 2) {
                return super.findAccessibilityNodeInfosByText(str, i);
            }
            d(lowerCase, i, arrayList);
            return arrayList;
        }

        public final String g() {
            int wrappedSelectorIndex = BaseListSelector.this.mValue;
            if (BaseListSelector.this.mWrapSelectorWheel) {
                wrappedSelectorIndex = BaseListSelector.this.getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            if (wrappedSelectorIndex <= BaseListSelector.this.mMaxValue) {
                return BaseListSelector.this.mDisplayedValues == null ? BaseListSelector.this.formatNumber(wrappedSelectorIndex) : BaseListSelector.this.mDisplayedValues[wrappedSelectorIndex - BaseListSelector.this.mMinValue];
            }
            return null;
        }

        public final boolean h() {
            return BaseListSelector.this.getWrapSelectorWheel() || BaseListSelector.this.getValue() > BaseListSelector.this.getMinValue();
        }

        public final boolean i() {
            return BaseListSelector.this.getWrapSelectorWheel() || BaseListSelector.this.getValue() < BaseListSelector.this.getMaxValue();
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
        public final void j(int i, int i2, String str) {
            if (BaseListSelector.this.mManager == null || !BaseListSelector.this.mManager.isEnabled()) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            accessibilityEventObtain.setClassName(Button.class.getName());
            accessibilityEventObtain.setPackageName(BaseListSelector.this.mContext.getPackageName());
            accessibilityEventObtain.getText().add(str);
            accessibilityEventObtain.setEnabled(BaseListSelector.this.isEnabled());
            accessibilityEventObtain.setSource(BaseListSelector.this, i);
            BaseListSelector baseListSelector = BaseListSelector.this;
            baseListSelector.requestSendAccessibilityEvent(baseListSelector, accessibilityEventObtain);
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
        public final void k(int i) {
            if (BaseListSelector.this.mManager == null || !BaseListSelector.this.mManager.isEnabled()) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
            BaseListSelector.this.mInputText.onInitializeAccessibilityEvent(accessibilityEventObtain);
            BaseListSelector.this.mInputText.onPopulateAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.setSource(BaseListSelector.this, 1);
            BaseListSelector baseListSelector = BaseListSelector.this;
            baseListSelector.requestSendAccessibilityEvent(baseListSelector, accessibilityEventObtain);
        }

        public void l(int i, int i2) {
            if (i == 0) {
                if (h()) {
                    j(i, i2, e());
                }
            } else if (i == 1) {
                k(i2);
            } else if (i == 2 && i()) {
                j(i, i2, f());
            }
        }

        public final boolean m(int i, int i2, int i3) {
            if (i2 == 16) {
                if (!BaseListSelector.this.isEnabled()) {
                    return false;
                }
                BaseListSelector.this.changeCurrentByOne(i == i3);
                l(i, 1);
                return true;
            }
            if (i2 == 64) {
                if (this.f6091c == i) {
                    return false;
                }
                this.f6091c = i;
                l(i, 32768);
                BaseListSelector baseListSelector = BaseListSelector.this;
                baseListSelector.invalidate(0, 0, baseListSelector.getRight(), BaseListSelector.this.mSelectorMiddleItemIndex * BaseListSelector.this.mSelectorElementHeight);
                return true;
            }
            if (i2 != 128 || this.f6091c != i) {
                return false;
            }
            this.f6091c = Integer.MIN_VALUE;
            l(i, 65536);
            BaseListSelector baseListSelector2 = BaseListSelector.this;
            baseListSelector2.invalidate(0, 0, baseListSelector2.getRight(), BaseListSelector.this.mSelectorMiddleItemIndex * BaseListSelector.this.mSelectorElementHeight);
            return true;
        }

        public final boolean n(int i, int i2, int i3) {
            if (i2 == 16) {
                if (!BaseListSelector.this.isEnabled()) {
                    return false;
                }
                BaseListSelector.this.changeCurrentByOne(true);
                l(i, 1);
                return true;
            }
            if (i2 == 64) {
                if (this.f6091c == i) {
                    return false;
                }
                this.f6091c = i;
                l(i, 32768);
                BaseListSelector baseListSelector = BaseListSelector.this;
                baseListSelector.invalidate(0, (baseListSelector.mSelectorMiddleItemIndex + 1) * BaseListSelector.this.mSelectorElementHeight, BaseListSelector.this.getRight(), BaseListSelector.this.mSelectorIndices.length * BaseListSelector.this.mSelectorElementHeight);
                return true;
            }
            if (i2 != 128 || this.f6091c != i) {
                return false;
            }
            this.f6091c = Integer.MIN_VALUE;
            l(i, 65536);
            BaseListSelector baseListSelector2 = BaseListSelector.this;
            baseListSelector2.invalidate(0, (baseListSelector2.mSelectorMiddleItemIndex + 1) * BaseListSelector.this.mSelectorElementHeight, BaseListSelector.this.getRight(), BaseListSelector.this.mSelectorIndices.length * BaseListSelector.this.mSelectorElementHeight);
            return true;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i != -1) {
                if (i == 0) {
                    m(i, i2, 0);
                    return false;
                }
                if (i == 1) {
                    if (i2 == 1) {
                        if (!BaseListSelector.this.isEnabled() || BaseListSelector.this.mInputText.isFocused()) {
                            return false;
                        }
                        return BaseListSelector.this.mInputText.requestFocus();
                    }
                    if (i2 == 2) {
                        if (!BaseListSelector.this.isEnabled() || !BaseListSelector.this.mInputText.isFocused()) {
                            return false;
                        }
                        BaseListSelector.this.mInputText.clearFocus();
                        return true;
                    }
                    if (i2 == 16) {
                        if (!BaseListSelector.this.isEnabled()) {
                            return false;
                        }
                        BaseListSelector.this.performClick();
                        return true;
                    }
                    if (i2 == 32) {
                        if (!BaseListSelector.this.isEnabled()) {
                            return false;
                        }
                        BaseListSelector.this.performLongClick();
                        return true;
                    }
                    if (i2 == 64) {
                        if (this.f6091c == i) {
                            return false;
                        }
                        this.f6091c = i;
                        l(i, 32768);
                        BaseListSelector.this.mInputText.invalidate();
                        return true;
                    }
                    if (i2 != 128) {
                        return BaseListSelector.this.mInputText.performAccessibilityAction(i2, bundle);
                    }
                    if (this.f6091c != i) {
                        return false;
                    }
                    this.f6091c = Integer.MIN_VALUE;
                    l(i, 65536);
                    BaseListSelector.this.mInputText.invalidate();
                    return true;
                }
                if (i == 2) {
                    n(i, i2, 2);
                    return false;
                }
            } else {
                if (i2 == 64) {
                    if (this.f6091c == i) {
                        return false;
                    }
                    this.f6091c = i;
                    BaseListSelector.this.sendAccessibilityEvent(32768);
                    return true;
                }
                if (i2 == 128) {
                    if (this.f6091c != i) {
                        return false;
                    }
                    this.f6091c = Integer.MIN_VALUE;
                    BaseListSelector.this.sendAccessibilityEvent(65536);
                    return true;
                }
                if (i2 == 4096) {
                    if (!(BaseListSelector.this.isEnabled() && BaseListSelector.this.getWrapSelectorWheel()) && BaseListSelector.this.getValue() >= BaseListSelector.this.getMaxValue()) {
                        return false;
                    }
                    BaseListSelector.this.changeCurrentByOne(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!(BaseListSelector.this.isEnabled() && BaseListSelector.this.getWrapSelectorWheel()) && BaseListSelector.this.getValue() <= BaseListSelector.this.getMinValue()) {
                        return false;
                    }
                    BaseListSelector.this.changeCurrentByOne(false);
                    return true;
                }
            }
            return super.performAction(i, i2, bundle);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseListSelector.this.mPreviousScrollerY = 0;
            if (BaseListSelector.this.mInitialScrollOffset == BaseListSelector.this.mCurrentScrollOffset) {
                BaseListSelector.this.updateInputTextView();
                BaseListSelector baseListSelector = BaseListSelector.this;
                baseListSelector.showInputControls(baseListSelector.mShowInputControlsAnimimationDuration);
                return;
            }
            int i = BaseListSelector.this.mInitialScrollOffset - BaseListSelector.this.mCurrentScrollOffset;
            if (Math.abs(i) > BaseListSelector.this.mSelectorElementHeight / 2) {
                int i2 = BaseListSelector.this.mSelectorElementHeight;
                if (i > 0) {
                    i2 = -i2;
                }
                i += i2;
            }
            BaseListSelector.this.mAdjustScroller.startScroll(0, 0, 0, i, 800);
            BaseListSelector.this.invalidate();
        }
    }

    public class f implements Runnable {
        public boolean i;

        public f() {
        }

        public final void b(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseListSelector.this.changeCurrentByOne(this.i);
            BaseListSelector baseListSelector = BaseListSelector.this;
            baseListSelector.postDelayed(this, baseListSelector.mLongPressUpdateInterval);
        }
    }

    public interface g {
    }

    public class h extends NumberKeyListener {
        public h() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (BaseListSelector.this.mDisplayedValues == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return BaseListSelector.this.getSelectedPos(str) > BaseListSelector.this.mMaxValue ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : BaseListSelector.this.mDisplayedValues) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    BaseListSelector.this.postSetSelectionCommand(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return BaseListSelector.DIGIT_CHARACTERS;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface i {
        public static final int SCROLL_STATE_IDLE = 0;
    }

    public interface j {
        void a(BaseListSelector baseListSelector, int i, int i2);
    }

    public static class k implements Runnable {
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6093j;

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public BaseListSelector(Context context) {
        this(context, null);
    }

    private void changeCurrent(int i2) {
        if (this.mValue != i2) {
            if (this.mWrapSelectorWheel) {
                i2 = getWrappedSelectorIndex(i2);
            }
            int i3 = this.mValue;
            setValue(i2);
            notifyChange(i3, i2);
            playSoundEffect();
            performFeedback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeCurrentByOne(boolean z) {
        if (!this.mFlingable) {
            if (z) {
                changeCurrent(this.mValue + 1);
                return;
            } else {
                changeCurrent(this.mValue - 1);
                return;
            }
        }
        this.mDimSelectorWheelAnimator.cancel();
        this.mInputText.setVisibility(4);
        this.mSelectorWheelPaint.setAlpha(255);
        this.mPreviousScrollerY = 0;
        AccessibilityManager accessibilityManager = this.mManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            forceCompleteChangeCurrentByOneViaScroll();
        } else if (!moveToFinalScrollerPosition(this.mFlingScroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        if (z) {
            this.mFlingScroller.startScroll(0, 0, 0, -this.mSelectorElementHeight, 300);
        } else {
            this.mFlingScroller.startScroll(0, 0, 0, this.mSelectorElementHeight, 300);
        }
        invalidate();
    }

    private void decrementSelectorIndices(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i2 = iArr[1] - 1;
        if (this.mWrapSelectorWheel && i2 < this.mMinValue) {
            i2 = this.mMaxValue;
        }
        iArr[0] = i2;
        ensureCachedScrollSelectorValue(i2);
    }

    private void drawBackground(Canvas canvas) {
        Context context = getContext();
        int i2 = R$color.lib_base_colorWhite;
        int[] iArr = {ContextCompat.getColor(context, i2), ContextCompat.getColor(getContext(), i2), tm2.a(getContext(), R$attr.couiColorPrimary)};
        RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), iArr, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.MIRROR);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAlpha(10);
        paint.setShader(linearGradient);
        canvas.save();
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    private void ensureCachedScrollSelectorValue(int i2) {
        SparseArray<String> sparseArray = this.mSelectorIndexToStringCache;
        String number = sparseArray.get(i2);
        if (number == null) {
            int i3 = this.mMinValue;
            if (i2 < i3 || i2 > this.mMaxValue) {
                number = "";
            } else {
                String[] strArr = this.mDisplayedValues;
                if (strArr != null) {
                    int i4 = i2 - i3;
                    if (strArr.length > i4) {
                        number = strArr[i4];
                    }
                } else {
                    number = formatNumber(i2);
                }
            }
            sparseArray.put(i2, number);
        }
    }

    private void fadeSelectorWheel(long j2) {
        this.mDimSelectorWheelAnimator.setDuration(j2);
        this.mDimSelectorWheelAnimator.start();
    }

    private void fling(int i2) {
        this.mPreviousScrollerY = 0;
        if (i2 > 0) {
            this.mFlingScroller.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.mFlingScroller.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    private void forceCompleteChangeCurrentByOneViaScroll() {
        Scroller scroller = this.mFlingScroller;
        if (scroller.isFinished()) {
            return;
        }
        int currY = scroller.getCurrY();
        scroller.abortAnimation();
        scrollBy(0, scroller.getCurrY() - currY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatNumber(int i2) {
        return String.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSelectedPos(String str) {
        try {
            if (this.mDisplayedValues == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.mDisplayedValues.length; i2++) {
                str = str.toLowerCase();
                if (this.mDisplayedValues[i2].toLowerCase().startsWith(str)) {
                    return this.mMinValue + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.mMinValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWrappedSelectorIndex(int i2) {
        int i3 = this.mMaxValue;
        if (i2 > i3) {
            int i4 = this.mMinValue;
            return (i4 + ((i2 - i3) % (i3 - i4))) - 1;
        }
        int i5 = this.mMinValue;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + 1 : i2;
    }

    private int gradualChange(int i2, int i3, float f2) {
        double d2 = f2;
        int i4 = this.mInitialScrollOffset;
        int i5 = this.mSelectorElementHeight;
        int i6 = this.mSelectorMiddleItemIndex;
        return (d2 > (((double) i4) + (((double) i5) * (((double) i6) - 0.5d))) ? 1 : (d2 == (((double) i4) + (((double) i5) * (((double) i6) - 0.5d))) ? 0 : -1)) > 0 && (d2 > (((double) i4) + (((double) i5) * (((double) i6) + 0.5d))) ? 1 : (d2 == (((double) i4) + (((double) i5) * (((double) i6) + 0.5d))) ? 0 : -1)) < 0 ? i3 - ((int) ((((i3 - i2) * 2) * Math.abs((f2 - i4) - (i6 * i5))) / this.mSelectorElementHeight)) : i2;
    }

    private void gradualChangeStyle(float f2) {
    }

    private int gradualChangeTextSize(int i2, int i3, int i4, int i5, float f2) {
        int i6 = this.mInitialScrollOffset;
        int i7 = this.mSelectorMiddleItemIndex;
        int i8 = this.mSelectorElementHeight;
        int i9 = (i7 * i8) + i6;
        int length = ((this.mSelectorIndices.length - 1) * i8) + i6;
        double d2 = f2;
        double d3 = i9;
        if (d2 > d3 - (((double) i8) * 0.5d) && d2 < d3 + (((double) i8) * 0.5d)) {
            return i3 - ((int) ((((i3 - i2) * 2) * Math.abs(f2 - i9)) / this.mSelectorElementHeight));
        }
        if (f2 <= i9 - i8) {
            return (int) (i4 + (((((i5 - i4) * 1.0f) * (f2 - i6)) / i8) / 2.0f));
        }
        return f2 >= ((float) (i9 + i8)) ? (int) (i4 + (((((i5 - i4) * 1.0f) * (length - f2)) / i8) / 2.0f)) : i5;
    }

    private void hideInputControls() {
        this.mShowInputControlsAnimator.cancel();
        this.mIncrementButton.setVisibility(4);
        this.mDecrementButton.setVisibility(4);
        this.mInputText.setVisibility(4);
    }

    private void incrementSelectorIndices(int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length - 1) {
            int i3 = i2 + 1;
            iArr[i2] = iArr[i3];
            i2 = i3;
        }
        int i4 = iArr[iArr.length - 2] + 1;
        if (this.mWrapSelectorWheel && i4 > this.mMaxValue) {
            i4 = this.mMinValue;
        }
        iArr[iArr.length - 1] = i4;
        ensureCachedScrollSelectorValue(i4);
    }

    private void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.mTextSize) / 2);
    }

    private void initializeSelectorWheel() {
        initializeSelectorWheelIndices();
        int[] iArr = this.mSelectorIndices;
        int length = iArr.length * this.mTextSize;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.lib_core_number_picker_y_off_set);
        int bottom = (int) (((((getBottom() - getTop()) - length) - (dimensionPixelOffset * 2)) / iArr.length) + 0.5f);
        this.mSelectorTextGapHeight = bottom;
        this.mSelectorElementHeight = this.mTextSize + bottom;
        this.mInputText.getBaseline();
        this.mInputText.getTop();
        this.mInitialScrollOffset = dimensionPixelOffset;
        this.mCurrentScrollOffset = dimensionPixelOffset;
        updateInputTextView();
    }

    private void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int value = getValue();
        for (int i2 = 0; i2 < this.mSelectorIndices.length; i2++) {
            int wrappedSelectorIndex = (i2 - this.mSelectorMiddleItemIndex) + value;
            if (this.mWrapSelectorWheel) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            this.mSelectorIndices[i2] = wrappedSelectorIndex;
            ensureCachedScrollSelectorValue(wrappedSelectorIndex);
        }
    }

    private boolean isEventInVisibleViewHitRect(MotionEvent motionEvent, View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        view.getHitRect(this.mTempRect);
        return this.mTempRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private int makeMeasureSpec(int i2, int i3) {
        if (i3 == -1) {
            return i2;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (mode == 1073741824) {
            return i2;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    private boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.mInitialScrollOffset - ((this.mCurrentScrollOffset + finalY) % this.mSelectorElementHeight);
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
        j jVar = this.mOnValueChangeListener;
        if (jVar != null) {
            jVar.a(this, i2, this.mValue);
        }
    }

    private void onScrollStateChange(int i2) {
        if (this.mScrollState != i2) {
            this.mScrollState = i2;
        }
    }

    private void onScrollerFinished(Scroller scroller) {
        if (scroller != this.mFlingScroller) {
            updateInputTextView();
            showInputControls(this.mShowInputControlsAnimimationDuration);
        } else if (this.mSelectorWheelState == 2) {
            postAdjustScrollerCommand(0);
            onScrollStateChange(0);
        } else {
            updateInputTextView();
            fadeSelectorWheel(this.mShowInputControlsAnimimationDuration);
        }
    }

    private void performFeedback() {
        performHapticFeedback(this, 302, 0);
    }

    private void postAdjustScrollerCommand(int i2) {
        e eVar = this.mAdjustScrollerCommand;
        if (eVar == null) {
            this.mAdjustScrollerCommand = new e();
        } else {
            removeCallbacks(eVar);
        }
        postDelayed(this.mAdjustScrollerCommand, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postChangeCurrentByOneFromLongPress(boolean z) {
        this.mInputText.clearFocus();
        removeAllCallbacks();
        if (this.mChangeCurrentByOneFromLongPressCommand == null) {
            this.mChangeCurrentByOneFromLongPressCommand = new f();
        }
        this.mChangeCurrentByOneFromLongPressCommand.b(z);
        post(this.mChangeCurrentByOneFromLongPressCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postSetSelectionCommand(int i2, int i3) {
        k kVar = this.mSetSelectionCommand;
        if (kVar == null) {
            this.mSetSelectionCommand = new k();
        } else {
            removeCallbacks(kVar);
        }
        this.mSetSelectionCommand.i = i2;
        this.mSetSelectionCommand.f6093j = i3;
        post(this.mSetSelectionCommand);
    }

    private void removeAllCallbacks() {
        f fVar = this.mChangeCurrentByOneFromLongPressCommand;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
        e eVar = this.mAdjustScrollerCommand;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        k kVar = this.mSetSelectionCommand;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
    }

    private int resolveSizeAndStateRespectingMinSize(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    private void setSelectorPaintAlpha(int i2) {
        this.mSelectorWheelPaint.setAlpha(i2);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorWheelState(int i2) {
        this.mSelectorWheelState = i2;
        if (i2 == 2) {
            this.mSelectorWheelPaint.setAlpha(255);
        }
        if (this.mFlingable && i2 == 2) {
            this.mInputText.sendAccessibilityEvent(4);
            this.mInputText.setContentDescription(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInputControls(long j2) {
        updateIncrementAndDecrementButtonsVisibilityState();
        this.mShowInputControlsAnimator.setDuration(j2);
        this.mShowInputControlsAnimator.start();
    }

    private void tryComputeMaxWidth() {
        int i2;
        float fMeasureText;
        if (this.mComputeMaxWidth) {
            String[] strArr = this.mDisplayedValues;
            int i3 = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                for (int i4 = 0; i4 <= 10; i4++) {
                    float fMeasureText2 = this.mSelectorWheelPaint.measureText(String.valueOf(i4));
                    if (fMeasureText2 > f2) {
                        f2 = fMeasureText2;
                    }
                }
                for (int i5 = this.mMaxValue; i5 > 0; i5 /= 10) {
                    i3++;
                }
                i2 = (int) (i3 * f2);
            } else {
                int length = strArr.length;
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    if (this.mScaleDisplayText) {
                        this.mSelectorWheelPaint.setTextSize(this.mTextSize);
                        int iIndexOf = this.mDisplayedValues[i7].indexOf(32);
                        int i8 = iIndexOf + 1;
                        String strSubstring = this.mDisplayedValues[i7].substring(0, i8);
                        String strSubstring2 = this.mDisplayedValues[i7].substring(i8);
                        if (iIndexOf >= 0) {
                            strSubstring = strSubstring + strSubstring2.substring(0, i8);
                            strSubstring2 = strSubstring2.substring(i8);
                        }
                        float fMeasureText3 = this.mSelectorWheelPaint.measureText(strSubstring);
                        this.mSelectorWheelPaint.setTextSize(getResources().getDimensionPixelOffset(R$dimen.lib_core_list_select_picker_text_size_des));
                        fMeasureText = fMeasureText3 + this.mSelectorWheelPaint.measureText(strSubstring2);
                    } else {
                        fMeasureText = this.mSelectorWheelPaint.measureText(this.mDisplayedValues[i7]);
                    }
                    if (fMeasureText > i6) {
                        i6 = (int) fMeasureText;
                    }
                }
                i2 = i6;
            }
            int paddingLeft = i2 + this.mInputText.getPaddingLeft() + this.mInputText.getPaddingRight();
            if (this.mMaxWidth != paddingLeft) {
                int i9 = this.mMinWidth;
                if (paddingLeft > i9) {
                    this.mMaxWidth = paddingLeft;
                } else {
                    this.mMaxWidth = i9;
                }
                invalidate();
            }
        }
    }

    private void updateIncrementAndDecrementButtonsVisibilityState() {
        if (this.mWrapSelectorWheel || this.mValue < this.mMaxValue) {
            this.mIncrementButton.setVisibility(0);
        } else {
            this.mIncrementButton.setVisibility(4);
        }
        if (this.mWrapSelectorWheel || this.mValue > this.mMinValue) {
            this.mDecrementButton.setVisibility(0);
        } else {
            this.mDecrementButton.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInputTextView() {
        String[] strArr = this.mDisplayedValues;
        if (strArr == null) {
            this.mInputText.setText(formatNumber(this.mValue));
        } else {
            int i2 = this.mValue - this.mMinValue;
            if (i2 >= 0 && i2 < strArr.length) {
                this.mInputText.setText(strArr[i2]);
            }
        }
        EditText editText = this.mInputText;
        editText.setSelection(editText.getText().length());
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mSelectorWheelState != 0) {
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
                postInvalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        AccessibilityManager accessibilityManager = this.mManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            int y = (int) motionEvent.getY();
            int i3 = this.mSelectorMiddleItemIndex;
            int i4 = this.mSelectorElementHeight;
            if (y < i3 * i4) {
                i2 = 0;
            } else {
                i2 = 1;
                if (y > (i3 + 1) * i4) {
                    i2 = 2;
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            d dVar = (d) getAccessibilityNodeProvider();
            if (actionMasked == 7) {
                int i5 = this.mLastHoveredChildVirtualViewId;
                if (i5 != i2 && i5 != -1) {
                    dVar.l(i5, 256);
                    dVar.l(i2, 128);
                    this.mLastHoveredChildVirtualViewId = i2;
                    dVar.performAction(i2, 64, null);
                }
            } else if (actionMasked == 9) {
                dVar.l(i2, 128);
                this.mLastHoveredChildVirtualViewId = i2;
                dVar.performAction(i2, 64, null);
            } else if (actionMasked == 10) {
                dVar.l(i2, 256);
                this.mLastHoveredChildVirtualViewId = -1;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 23 || keyCode == 66) {
            removeAllCallbacks();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            removeAllCallbacks();
        } else if (actionMasked == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.mSelectorWheelState == 2) {
                removeAllCallbacks();
                forceCompleteChangeCurrentByOneViaScroll();
            }
        } else if (actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mShowInputControlsAnimator.isRunning() || this.mSelectorWheelState != 2) {
            long drawingTime = getDrawingTime();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).isShown()) {
                    drawChild(canvas, getChildAt(i2), drawingTime);
                }
            }
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.mAccessibilityNodeProvider == null) {
            this.mAccessibilityNodeProvider = new d();
        }
        return this.mAccessibilityNodeProvider;
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

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean getWrapSelectorWheel() {
        return this.mWrapSelectorWheel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.mFlingable || isInEditMode()) {
            return;
        }
        showInputControls(this.mShowInputControlsAnimimationDuration * 2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mScrollWheelAndFadingEdgesInitialized = false;
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeAllCallbacks();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char c2;
        char c3;
        if (this.mIsDrawBackground) {
            drawBackground(canvas);
        }
        if (this.mSelectorWheelState != 0) {
            float right = getRight() - getLeft();
            char c4 = CharCompanionObject.MIN_VALUE;
            float f2 = right / 2.0f;
            int i6 = this.mVisualWidth;
            char c5 = 2;
            if (i6 != -1 && i6 < getRight() - getLeft()) {
                int i7 = this.mAlignPosition;
                if (i7 == 1) {
                    i2 = this.mVisualWidth / 2;
                    f2 = i2;
                } else if (i7 == 2) {
                    int right2 = getRight() - getLeft();
                    int i8 = this.mVisualWidth;
                    i3 = right2 - i8;
                    i4 = i8 / 2;
                    i2 = i3 + i4;
                    f2 = i2;
                }
            } else if (this.mComputeMaxWidth && this.mMaxWidth < getRight() - getLeft()) {
                int i9 = this.mAlignPosition;
                if (i9 == 1) {
                    i2 = this.mMaxWidth / 2;
                    f2 = i2;
                } else if (i9 == 2) {
                    int right3 = getRight() - getLeft();
                    int i10 = this.mMaxWidth;
                    i3 = right3 - i10;
                    i4 = i10 / 2;
                    i2 = i3 + i4;
                    f2 = i2;
                }
            }
            float f3 = this.mCurrentScrollOffset;
            int i11 = this.mNumberPickerPaddingLeft;
            if (i11 != 0) {
                f2 += i11;
            }
            int i12 = this.mNumberPickerPaddingRight;
            if (i12 != 0) {
                f2 -= i12;
            }
            float f4 = f2;
            int iSave = canvas.save();
            int[] iArr2 = this.mSelectorIndices;
            float f5 = f3;
            int i13 = 0;
            while (i13 < iArr2.length) {
                String str = this.mSelectorIndexToStringCache.get(iArr2[i13]);
                if (i13 == this.mSelectorMiddleItemIndex && this.mInputText.getVisibility() == 0) {
                    c2 = c5;
                    i5 = iSave;
                    iArr = iArr2;
                    c3 = c4;
                } else {
                    int iGradualChange = gradualChange(this.mAlphaStart, this.mAlphaEnd, f5);
                    int iGradualChange2 = gradualChange(this.mRedStart, this.mRedEnd, f5);
                    int iGradualChange3 = gradualChange(this.mGreenStart, this.mGreenEnd, f5);
                    int iGradualChange4 = gradualChange(this.mBlueStart, this.mBlueEnd, f5);
                    int i14 = this.mTextEnd;
                    iArr = iArr2;
                    i5 = iSave;
                    int iGradualChangeTextSize = gradualChangeTextSize(i14, this.mFocusTextSize, this.mTextStart, i14, f5);
                    gradualChangeStyle(f5);
                    this.mSelectorWheelPaint.setColor(Color.argb(iGradualChange, iGradualChange2, iGradualChange3, iGradualChange4));
                    float f6 = iGradualChangeTextSize;
                    this.mSelectorWheelPaint.setTextSize(f6);
                    Paint.FontMetrics fontMetrics = this.mSelectorWheelPaint.getFontMetrics();
                    c2 = 2;
                    int i15 = ((int) (((((f5 + f5) + this.mSelectorElementHeight) - fontMetrics.top) - fontMetrics.bottom) + 0)) / 2;
                    if (str == null) {
                        c3 = CharCompanionObject.MIN_VALUE;
                    } else if (this.mScaleDisplayText) {
                        int iIndexOf = str.indexOf(32);
                        if (iIndexOf >= 0) {
                            int i16 = iIndexOf + 1;
                            String strSubstring = str.substring(0, i16);
                            String strSubstring2 = str.substring(i16);
                            int iIndexOf2 = strSubstring2.indexOf(32);
                            if (iIndexOf2 >= 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(strSubstring);
                                int i17 = iIndexOf2 + 1;
                                sb.append(strSubstring2.substring(0, i17));
                                strSubstring = sb.toString();
                                strSubstring2 = strSubstring2.substring(i17);
                            }
                            float fMeasureText = this.mSelectorWheelPaint.measureText(strSubstring);
                            this.mSelectorWheelPaint.setTextSize(getResources().getDimensionPixelOffset(R$dimen.lib_core_list_select_picker_text_size_des));
                            float fMeasureText2 = this.mSelectorWheelPaint.measureText(strSubstring2);
                            c3 = CharCompanionObject.MIN_VALUE;
                            float f7 = i15;
                            canvas.drawText(strSubstring2, (fMeasureText / 2.0f) + f4, f7, this.mSelectorWheelPaint);
                            this.mSelectorWheelPaint.setTextSize(f6);
                            canvas.drawText(strSubstring, f4 - (fMeasureText2 / 2.0f), f7, this.mSelectorWheelPaint);
                        } else {
                            c3 = CharCompanionObject.MIN_VALUE;
                            canvas.drawText(str, f4, i15, this.mSelectorWheelPaint);
                        }
                    } else {
                        c3 = CharCompanionObject.MIN_VALUE;
                        canvas.drawText(str, f4, i15, this.mSelectorWheelPaint);
                    }
                }
                f5 += this.mSelectorElementHeight;
                i13++;
                c5 = c2;
                c4 = c3;
                iSave = i5;
                iArr2 = iArr;
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(BaseListSelector.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.mMinValue + this.mValue) * this.mSelectorElementHeight);
        accessibilityEvent.setMaxScrollY((this.mMaxValue - this.mMinValue) * this.mSelectorElementHeight);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.mFlingable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 2 || ((int) Math.abs(motionEvent.getY() - this.mLastDownEventY)) <= this.mTouchSlop) {
                    return false;
                }
                this.mCheckBeginEditOnUpEvent = false;
                onScrollStateChange(1);
                setSelectorWheelState(2);
                hideInputControls();
                return true;
            }
            this.mLastMotionEventY = motionEvent.getY();
            this.mLastDownEventY = motionEvent.getY();
            removeAllCallbacks();
            this.mShowInputControlsAnimator.cancel();
            this.mDimSelectorWheelAnimator.cancel();
            this.mCheckBeginEditOnUpEvent = false;
            this.mAdjustScrollerOnUpEvent = true;
            if (!isEventInVisibleViewHitRect(motionEvent, this.mIncrementButton) && !isEventInVisibleViewHitRect(motionEvent, this.mDecrementButton)) {
                if (this.mSelectorWheelState != 2) {
                    this.mAdjustScrollerOnUpEvent = false;
                    setSelectorWheelState(2);
                    hideInputControls();
                    return true;
                }
                this.mSelectorWheelPaint.setAlpha(255);
                boolean z = this.mFlingScroller.isFinished() && this.mAdjustScroller.isFinished();
                if (!z) {
                    this.mFlingScroller.forceFinished(true);
                    this.mAdjustScroller.forceFinished(true);
                    onScrollStateChange(0);
                }
                this.mCheckBeginEditOnUpEvent = z;
                this.mAdjustScrollerOnUpEvent = true;
                hideInputControls();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.mDecrementButton.getMeasuredWidth();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int measuredHeight2 = this.mDecrementButton.getMeasuredHeight() + 0;
        this.mDecrementButton.layout(i6, 0, i6 + measuredWidth2, measuredHeight2);
        int measuredWidth3 = this.mInputText.getMeasuredWidth();
        int measuredHeight3 = this.mInputText.getMeasuredHeight();
        int i7 = (measuredWidth - measuredWidth3) / 2;
        int i8 = (measuredHeight - measuredHeight3) / 2;
        this.mInputText.layout(i7, i8, measuredWidth3 + i7, measuredHeight3 + i8);
        int measuredWidth4 = (measuredWidth - this.mIncrementButton.getMeasuredWidth()) / 2;
        this.mIncrementButton.layout(measuredWidth4, measuredHeight - this.mIncrementButton.getMeasuredHeight(), measuredWidth2 + measuredWidth4, measuredHeight);
        if (this.mScrollWheelAndFadingEdgesInitialized) {
            return;
        }
        this.mScrollWheelAndFadingEdgesInitialized = true;
        initializeSelectorWheel();
        initializeFadingEdges();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(makeMeasureSpec(i2, this.mMaxWidth), makeMeasureSpec(i3, this.mMaxHeight));
        setMeasuredDimension(resolveSizeAndStateRespectingMinSize(this.mMinWidth, getMeasuredWidth(), i2) + ((this.mNumberPickerPaddingRight + this.mNumberPickerPaddingLeft) * 2), resolveSizeAndStateRespectingMinSize(this.mMinHeight, getMeasuredHeight(), i3));
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
            if (this.mCheckBeginEditOnUpEvent) {
                this.mCheckBeginEditOnUpEvent = false;
                if (motionEvent.getEventTime() - this.mLastUpEventTimeMillis < ViewConfiguration.getDoubleTapTimeout()) {
                    setSelectorWheelState(1);
                    showInputControls(this.mShowInputControlsAnimimationDuration);
                    this.mLastUpEventTimeMillis = motionEvent.getEventTime();
                    return true;
                }
            }
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
                fling(yVelocity * 3);
                onScrollStateChange(2);
            } else if (!this.mAdjustScrollerOnUpEvent) {
                postAdjustScrollerCommand(SHOW_INPUT_CONTROLS_DELAY_MILLIS);
            } else if (this.mFlingScroller.isFinished() && this.mAdjustScroller.isFinished()) {
                postAdjustScrollerCommand(0);
            }
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mLastUpEventTimeMillis = motionEvent.getEventTime();
        } else if (actionMasked == 2) {
            float y = motionEvent.getY();
            if ((this.mCheckBeginEditOnUpEvent || this.mScrollState != 1) && ((int) Math.abs(y - this.mLastDownEventY)) > this.mTouchSlop) {
                this.mCheckBeginEditOnUpEvent = false;
                onScrollStateChange(1);
            }
            scrollBy(0, (int) (y - this.mLastMotionEventY));
            invalidate();
            this.mLastMotionEventY = y;
        }
        return true;
    }

    @JvmStatic
    public boolean performHapticFeedback(@Nullable View view, int i2, int i3) {
        if (view != null) {
            return view.performHapticFeedback(i2);
        }
        return false;
    }

    public void playSoundEffect() {
        this.mSoundPool.play(this.mClickSoundId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        if (Math.abs(i3) > getHeight() || this.mSelectorWheelState == 0) {
            return;
        }
        int[] iArr = this.mSelectorIndices;
        boolean z = this.mWrapSelectorWheel;
        if (!z && i3 > 0 && iArr[this.mSelectorMiddleItemIndex] <= this.mMinValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        if (!z && i3 < 0 && iArr[this.mSelectorMiddleItemIndex] >= this.mMaxValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        this.mCurrentScrollOffset += i3;
        while (true) {
            int i4 = this.mCurrentScrollOffset;
            if (i4 - this.mInitialScrollOffset <= this.mSelectorTextGapHeight + this.mChangeIndexDistance) {
                break;
            }
            this.mCurrentScrollOffset = i4 - this.mSelectorElementHeight;
            decrementSelectorIndices(iArr);
            changeCurrent(iArr[this.mSelectorMiddleItemIndex]);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] <= this.mMinValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
        while (true) {
            int i5 = this.mCurrentScrollOffset;
            if (i5 - this.mInitialScrollOffset >= (-(this.mSelectorTextGapHeight + this.mChangeIndexDistance))) {
                break;
            }
            this.mCurrentScrollOffset = i5 + this.mSelectorElementHeight;
            incrementSelectorIndices(iArr);
            changeCurrent(iArr[this.mSelectorMiddleItemIndex]);
            if (!this.mWrapSelectorWheel && iArr[this.mSelectorMiddleItemIndex] >= this.mMaxValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
        if (!this.enableMinFlingVelocity || this.mFlingScroller.isFinished() || Math.abs(this.mFlingScroller.getCurrVelocity()) >= this.minFlingVelocity) {
            return;
        }
        this.mFlingScroller.abortAnimation();
        if (moveToFinalScrollerPosition(this.mFlingScroller)) {
            return;
        }
        moveToFinalScrollerPosition(this.mAdjustScroller);
    }

    public void setAlignPosition(int i2) {
        this.mAlignPosition = i2;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues != strArr) {
            this.mDisplayedValues = strArr;
            if (strArr != null) {
                this.mInputText.setRawInputType(524289);
            } else {
                this.mInputText.setRawInputType(2);
            }
            updateInputTextView();
            initializeSelectorWheelIndices();
            tryComputeMaxWidth();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mIncrementButton.setEnabled(z);
        this.mDecrementButton.setEnabled(z);
        this.mInputText.setEnabled(z);
    }

    public void setFormatter(g gVar) {
        if (gVar != null) {
            initializeSelectorWheelIndices();
            updateInputTextView();
        }
    }

    public void setMaxValue(int i2) {
        if (this.mMaxValue != i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("maxValue must be >= 0");
            }
            this.mMaxValue = i2;
            if (i2 < this.mValue) {
                this.mValue = i2;
            }
            initializeSelectorWheelIndices();
            updateInputTextView();
            tryComputeMaxWidth();
        }
    }

    public void setMaxWith(String[] strArr) {
        int length = strArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            this.mSelectorWheelPaint.setTextSize(this.mTextSize);
            int iIndexOf = strArr[i3].indexOf(32) + 1;
            String strSubstring = strArr[i3].substring(0, iIndexOf);
            String strSubstring2 = strArr[i3].substring(iIndexOf);
            int iIndexOf2 = strSubstring2.indexOf(32);
            if (iIndexOf2 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(strSubstring);
                int i4 = iIndexOf2 + 1;
                sb.append(strSubstring2.substring(0, i4));
                strSubstring = sb.toString();
                strSubstring2 = strSubstring2.substring(i4);
            }
            float fMeasureText = this.mSelectorWheelPaint.measureText(strSubstring);
            this.mSelectorWheelPaint.setTextSize(getResources().getDimensionPixelOffset(R$dimen.lib_core_list_select_picker_text_size_des));
            float fMeasureText2 = fMeasureText + this.mSelectorWheelPaint.measureText(strSubstring2);
            if (fMeasureText2 > i2) {
                i2 = (int) fMeasureText2;
            }
        }
        int paddingLeft = i2 + this.mInputText.getPaddingLeft() + this.mInputText.getPaddingRight();
        if (this.mMaxWidth != paddingLeft) {
            int i5 = this.mMinWidth;
            if (paddingLeft > i5) {
                this.mMaxWidth = paddingLeft;
            } else {
                this.mMaxWidth = i5;
            }
            invalidate();
        }
    }

    public void setMinValue(int i2) {
        if (this.mMinValue != i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("minValue must be >= 0");
            }
            this.mMinValue = i2;
            if (i2 > this.mValue) {
                this.mValue = i2;
            }
            initializeSelectorWheelIndices();
            updateInputTextView();
            tryComputeMaxWidth();
        }
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.mLongPressUpdateInterval = j2;
    }

    public void setOnScrollListener(i iVar) {
    }

    public void setOnValueChangedListener(j jVar) {
        this.mOnValueChangeListener = jVar;
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

    public void setPickerRowNumber(int i2) {
        this.mSelectorIndices = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.mSelectorIndices[i3] = Integer.MIN_VALUE;
        }
        this.mSelectorMiddleItemIndex = this.mSelectorIndices.length / 2;
    }

    public void setScaleDisplayText(boolean z) {
        this.mScaleDisplayText = z;
    }

    public void setValue(int i2) {
        if (this.mValue == i2) {
            invalidate();
            return;
        }
        int i3 = this.mMinValue;
        if (i2 < i3) {
            i2 = this.mWrapSelectorWheel ? this.mMaxValue : i3;
        }
        int i4 = this.mMaxValue;
        if (i2 > i4) {
            if (!this.mWrapSelectorWheel) {
                i3 = i4;
            }
            i2 = i3;
        }
        this.mValue = i2;
        initializeSelectorWheelIndices();
        updateInputTextView();
        updateIncrementAndDecrementButtonsVisibilityState();
        invalidate();
    }

    public void setWrapSelectorWheel(boolean z) {
        if (z && this.mMaxValue - this.mMinValue < this.mSelectorIndices.length) {
            throw new IllegalStateException("Range less than selector items count.");
        }
        if (z != this.mWrapSelectorWheel) {
            this.mWrapSelectorWheel = z;
            updateIncrementAndDecrementButtonsVisibilityState();
        }
    }

    public void setmComputeMaxWidth(boolean z) {
        this.mComputeMaxWidth = z;
    }

    public void setmMinWidth(int i2) {
        this.mMinWidth = i2;
        postInvalidate();
    }

    public BaseListSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.support.picker.R$attr.couiNumberPickerStyle);
    }

    public BaseListSelector(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        super(context, attributeSet, i2);
        this.mSelectorMiddleItemIndex = 3;
        this.mWrapSelectorWheel = false;
        this.mScaleDisplayText = false;
        this.enableMinFlingVelocity = false;
        this.minFlingVelocity = -1;
        this.mSelectorIndexToStringCache = new SparseArray<>();
        this.mSelectorIndices = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.mTempRect = new Rect();
        this.mLongPressUpdateInterval = 300L;
        this.mInitialScrollOffset = Integer.MIN_VALUE;
        this.mTextStart = 0;
        this.mTextEnd = 0;
        this.mFocusTextSize = 0;
        this.mAlphaStart = 255;
        this.mRedStart = 74;
        this.mGreenStart = 74;
        this.mBlueStart = 74;
        this.mAlphaEnd = 255;
        this.mRedEnd = 11;
        this.mGreenEnd = 152;
        this.mBlueEnd = 74;
        this.mScrollState = 0;
        ph2.c(this, false);
        this.mContext = context;
        context.setTheme(R$style.COUINumberPicker);
        int[] iArr = R$styleable.COUINumberPicker;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.mFlingable = true;
        typedArrayObtainStyledAttributes.recycle();
        SoundPool soundPool = new SoundPool(1, 1, 3);
        this.mSoundPool = soundPool;
        this.mClickSoundId = soundPool.load(this.mContext, R$raw.coui_numberpicker_click, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.mNumberPickerPaddingLeft = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_couiNOPickerPaddingLeft, 0);
        this.mNumberPickerPaddingRight = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_couiNOPickerPaddingRight, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMinHeight, -1);
        this.mMinHeight = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMaxHeight, -1);
        this.mMaxHeight = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.mMinWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMinWidth, -1);
        this.mMaxWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_internalMaxWidth, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_numberTextSize, -1);
        this.mTextSize = dimensionPixelSize3;
        this.mTextStart = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_startTextSize, -1);
        this.mTextEnd = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_endTextSize, -1);
        this.mVisualWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_couiPickerVisualWidth, -1);
        this.mAlignPosition = typedArrayObtainStyledAttributes2.getInteger(R$styleable.COUINumberPicker_couiPickerAlignPosition, -1);
        this.mFocusTextSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUINumberPicker_focusTextSize, -1);
        int i4 = typedArrayObtainStyledAttributes2.getInt(R$styleable.COUINumberPicker_couiPickerRowNumber, 3);
        int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.COUINumberPicker_couiNormalTextColor, -1);
        int color2 = typedArrayObtainStyledAttributes2.getColor(R$styleable.COUINumberPicker_couiFocusTextColor, -1);
        this.mIsDrawBackground = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUINumberPicker_couiIsDrawBackground, false);
        setPickerRowNumber(i4);
        a7b.b("XXX", "mMinWidth: " + this.mMinWidth + ", mMaxWidth: " + this.mMaxWidth);
        int i5 = this.mMinWidth;
        if (i5 != -1 && (i3 = this.mMaxWidth) != -1 && i5 > i3) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        int i6 = this.mMaxWidth;
        this.mComputeMaxWidth = i6 == Integer.MAX_VALUE || i6 <= i5;
        typedArrayObtainStyledAttributes2.recycle();
        this.mShowInputControlsAnimimationDuration = 300L;
        this.mNormaTextHeight = getResources().getDimensionPixelSize(com.support.picker.R$dimen.coui_time_picker_normal_text_height);
        setWillNotDraw(false);
        setSelectorWheelState(0);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R$layout.lib_core_number_picker, (ViewGroup) this, true);
        a aVar = new a();
        b bVar = new b();
        ImageButton imageButton = (ImageButton) findViewById(R$id.increment);
        this.mIncrementButton = imageButton;
        imageButton.setOnClickListener(aVar);
        imageButton.setOnLongClickListener(bVar);
        ImageButton imageButton2 = (ImageButton) findViewById(R$id.decrement);
        this.mDecrementButton = imageButton2;
        imageButton2.setOnClickListener(aVar);
        imageButton2.setOnLongClickListener(bVar);
        EditText editText = (EditText) findViewById(R$id.numberpicker_input);
        this.mInputText = editText;
        editText.setTextColor(-1);
        editText.setFilters(new InputFilter[]{new h()});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        if (editText.getTypeface() == null) {
            a7b.f(TAG, "the default language, set custom font style");
            editText.setTypeface(ResourcesCompat.getFont(context, R$font.opposans_en_os_regular));
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(dimensionPixelSize3);
        paint.setTypeface(editText.getTypeface());
        this.mChangeIndexDistance = (int) getContext().getResources().getDimension(R$dimen.lib_core_number_picker_change_index_distance);
        this.mAlphaStart = Color.alpha(color);
        this.mAlphaEnd = Color.alpha(color2);
        this.mRedStart = Color.red(color);
        this.mRedEnd = Color.red(color2);
        this.mGreenStart = Color.green(color);
        this.mGreenEnd = Color.green(color2);
        this.mBlueStart = Color.blue(color);
        this.mBlueEnd = Color.blue(color2);
        paint.setColor(color2);
        this.mSelectorWheelPaint = paint;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, PROPERTY_SELECTOR_PAINT_ALPHA, 255, 255);
        this.mDimSelectorWheelAnimator = objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageButton, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageButton2, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.mShowInputControlsAnimator = animatorSet;
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new c(objectAnimatorOfFloat, objectAnimatorOfFloat2));
        this.mFlingScroller = new Scroller(getContext(), null, true);
        this.mAdjustScroller = new Scroller(getContext(), new DecelerateInterpolator(DECELERATE_INTERPOLATOR));
        updateInputTextView();
        updateIncrementAndDecrementButtonsVisibilityState();
        if (isInEditMode()) {
            setSelectorWheelState(1);
        } else {
            setSelectorWheelState(2);
            hideInputControls();
        }
        this.mManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }
}
