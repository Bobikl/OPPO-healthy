package com.heytap.nearx.uikit.widget.keyboard;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.keyboard.util.ScreenConfigUtil;
import com.heytap.webview.extension.protocol.Const;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SecurityKeyboardView extends View implements View.OnClickListener {
    public static final int COMMON_KEY = 0;
    private static final int DEBOUNCE_TIME = 70;
    private static final boolean DEBUG = false;
    private static final int DELAY_AFTER_PREVIEW = 75;
    private static final int DELAY_BEFORE_PREVIEW = 0;
    public static final int DELETE_KEY = 1;
    private static final int ENABLED = 0;
    private static final int ENABLED_MASK = 32;
    private static final int KEYBOARD_STATE_CAPSLOCK = 2;
    private static final int KEYBOARD_STATE_ERROR = -1;
    private static final int KEYBOARD_STATE_NORMAL = 0;
    private static final int KEYBOARD_STATE_SHIFTED = 1;
    private static final int MSG_LONGPRESS = 4;
    private static final int MSG_REMOVE_PREVIEW = 2;
    private static final int MSG_REPEAT = 3;
    private static final int MSG_SHOW_PREVIEW = 1;
    private static final int MULTITAP_INTERVAL = 800;
    private static final int NOT_A_KEY = -1;
    public static final int OK_KEY = 2;
    private static final int PFLAG_DRAWABLE_STATE_DIRTY = 1024;
    private static final int PFLAG_PRESSED = 16384;
    private static final int REPEAT_INTERVAL = 50;
    private static final int REPEAT_START_DELAY = 400;
    public static final int SECURITY_KEYBOARD = 1;
    private static int STYLEABLE_LENGTH = 0;
    public static final String TAG = "SecurityKeyboardView";
    public static final int UNLOCK_KEYBOARD = 2;
    private static int[][] VIEW_SETS = null;
    private static final int VIEW_STATE_ACCELERATED = 64;
    private static final int VIEW_STATE_ACTIVATED = 32;
    private static final int VIEW_STATE_DRAG_CAN_ACCEPT = 256;
    private static final int VIEW_STATE_DRAG_HOVERED = 512;
    private static final int VIEW_STATE_ENABLED = 8;
    private static final int VIEW_STATE_FOCUSED = 4;
    private static final int VIEW_STATE_HOVERED = 128;
    private static final int[] VIEW_STATE_IDS;
    private static final int VIEW_STATE_PRESSED = 16;
    private static final int VIEW_STATE_SELECTED = 2;
    private static int[][][] VIEW_STATE_SETS = null;
    private static final int VIEW_STATE_WINDOW_FOCUSED = 1;
    private boolean mAbortKey;
    private AccessibilityManager mAccessibilityManager;
    private AudioManager mAudioManager;
    private float mBackgroundDimAmount;
    private int mBgTopOffset;
    private Bitmap mBuffer;
    private Canvas mCanvas;
    private Rect mClipRegion;
    private final int[] mCoordinates;
    private int mCurrentKey;
    private int mCurrentKeyIndex;
    private long mCurrentKeyTime;
    private Rect mDirtyRect;
    private boolean mDisambiguateSwipe;
    private int[] mDistances;
    private int mDownKey;
    private long mDownTime;
    private boolean mDrawPending;
    private Drawable mEndKeyBg;
    private int mEndLabelSize;
    private GestureDetector mGestureDetector;
    private ColorStateList mGoTextColor;
    Handler mHandler;
    private boolean mHeadsetRequiredToHearPasswordsAnnounced;
    private List<int[]> mIconState;
    private boolean mInMultiTap;
    private SecurityKeyboard.Key mInvalidatedKey;
    private boolean mIsDownFlag;
    private boolean mIsEnable;
    private ArrayList<Item> mItem;
    private ArrayList<Drawable> mItemBg;
    private ColorStateList mItemTextColor;
    private Drawable mKeyBackground;
    private int mKeyBoardViewType;
    private int[] mKeyIndices;
    private int mKeyTextColor;
    private int mKeyTextSize;
    private SecurityKeyboard mKeyboard;
    private OnKeyboardActionListener mKeyboardActionListener;
    private boolean mKeyboardChanged;
    private OnKeyboardCharListener mKeyboardCharListener;
    private SecurityKeyboard.Key[] mKeys;
    private int mLabelTextSize;
    private int mLastCodeX;
    private int mLastCodeY;
    private int mLastKey;
    private long mLastKeyTime;
    private long mLastMoveTime;
    private int mLastSentIndex;
    private long mLastTapTime;
    private int mLastX;
    private int mLastY;
    private float mLineWidth;
    private int mLowerLetterSize;
    private SecurityKeyboardView mMiniKeyboard;
    private Map<SecurityKeyboard.Key, View> mMiniKeyboardCache;
    private View mMiniKeyboardContainer;
    private int mMiniKeyboardOffsetX;
    private int mMiniKeyboardOffsetY;
    private boolean mMiniKeyboardOnScreen;
    private int mNumberLetterSize;
    private int mOldPointerCount;
    private float mOldPointerX;
    private float mOldPointerY;
    private Rect mPadding;
    private Paint mPaint;
    private PopupWindow mPopupKeyboard;
    private int mPopupLayout;
    private View mPopupParent;
    private int mPopupPreviewX;
    private int mPopupPreviewY;
    private int mPopupX;
    private int mPopupY;
    private boolean mPossiblePoly;
    private boolean mPreviewCentered;
    private int mPreviewHeight;
    private StringBuilder mPreviewLabel;
    private int mPreviewOffset;
    private KeyboardPopupWindow mPreviewPopup;
    private TextView mPreviewText;
    private int mPreviewTextSizeLarge;
    private int mPreviewWidth;
    private int mPreviousIndex;
    private int mPreviousKey;
    protected List<Integer> mPrivateFlags;
    private boolean mProximityCorrectOn;
    private int mProximityThreshold;
    private int mRefreshStyle;
    private int mRepeatKeyIndex;
    private int mShadowColor;
    private float mShadowRadius;
    private boolean mShowPreview;
    private boolean mShowTouchPoints;
    private int mSkipSymbolsLabelSize;
    private int mSpaceLabelSize;
    private Drawable mSpecialAllItemBg;
    private Drawable mSpecialItemBg;
    private int mSpecialItemSize;
    private Drawable mSpecialKeyBg;
    private int mSpecialKeyHeight;
    private int mSpecialKeyWidth;
    private String[] mSpecialSymbols;
    private int mSpecialSymbolsOffset;
    private int mStartX;
    private int mStartY;
    private int mSwipeThreshold;
    private SwipeTracker mSwipeTracker;
    private int mSymbolsLabelSize;
    private int mTapCount;
    private ColorStateList mTextColor;
    private int mTransUpOffset;
    private ArrayList<String> mTransUpSpecialSymbols;
    private Typeface mTypeface;
    private int mVerticalCorrection;
    private static final int[] KEY_DELETE = {-5};
    private static final int[] LONG_PRESSABLE_STATE_SET = {R.attr.state_long_pressable};
    private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
    private static int MAX_NEARBY_KEYS = 12;

    public interface OnKeyboardActionListener {
        void onKey(int i, int[] iArr);

        void onPress(int i);

        void onRelease(int i);

        void onText(CharSequence charSequence);

        void swipeDown();

        void swipeLeft();

        void swipeRight();

        void swipeUp();
    }

    public interface OnKeyboardCharListener {
        void onCharacter(String str, int i);
    }

    public static class SwipeTracker {
        static final int LONGEST_PAST_TIME = 200;
        static final int NUM_PAST = 4;
        final long[] mPastTime;
        final float[] mPastX;
        final float[] mPastY;
        float mXVelocity;
        float mYVelocity;

        private SwipeTracker() {
            this.mPastX = new float[4];
            this.mPastY = new float[4];
            this.mPastTime = new long[4];
        }

        private void addPoint(float f, float f2, long j2) {
            long[] jArr = this.mPastTime;
            int i = -1;
            int i2 = 0;
            while (i2 < 4) {
                long j3 = jArr[i2];
                if (j3 == 0) {
                    break;
                }
                if (j3 < j2 - 200) {
                    i = i2;
                }
                i2++;
            }
            if (i2 == 4 && i < 0) {
                i = 0;
            }
            if (i == i2) {
                i--;
            }
            float[] fArr = this.mPastX;
            float[] fArr2 = this.mPastY;
            if (i >= 0) {
                int i3 = i + 1;
                int i4 = (4 - i) - 1;
                System.arraycopy(fArr, i3, fArr, 0, i4);
                System.arraycopy(fArr2, i3, fArr2, 0, i4);
                System.arraycopy(jArr, i3, jArr, 0, i4);
                i2 -= i3;
            }
            fArr[i2] = f;
            fArr2[i2] = f2;
            jArr[i2] = j2;
            int i5 = i2 + 1;
            if (i5 < 4) {
                jArr[i5] = 0;
            }
        }

        public void addMovement(MotionEvent motionEvent) {
            long eventTime = motionEvent.getEventTime();
            int historySize = motionEvent.getHistorySize();
            for (int i = 0; i < historySize; i++) {
                addPoint(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), motionEvent.getHistoricalEventTime(i));
            }
            addPoint(motionEvent.getX(), motionEvent.getY(), eventTime);
        }

        public void clear() {
            this.mPastTime[0] = 0;
        }

        public void computeCurrentVelocity(int i) {
            computeCurrentVelocity(i, Float.MAX_VALUE);
        }

        public float getXVelocity() {
            return this.mXVelocity;
        }

        public float getYVelocity() {
            return this.mYVelocity;
        }

        public void computeCurrentVelocity(int i, float f) {
            float[] fArr;
            float[] fArr2 = this.mPastX;
            float[] fArr3 = this.mPastY;
            long[] jArr = this.mPastTime;
            int i2 = 0;
            float f2 = fArr2[0];
            float f3 = fArr3[0];
            long j2 = jArr[0];
            while (i2 < 4 && jArr[i2] != 0) {
                i2++;
            }
            int i3 = 1;
            float f4 = 0.0f;
            float f5 = 0.0f;
            while (i3 < i2) {
                int i4 = (int) (jArr[i3] - j2);
                if (i4 == 0) {
                    fArr = fArr2;
                } else {
                    float f6 = i4;
                    float f7 = (fArr2[i3] - f2) / f6;
                    fArr = fArr2;
                    float f8 = i;
                    float f9 = f7 * f8;
                    f4 = f4 == 0.0f ? f9 : (f4 + f9) * 0.5f;
                    float f10 = ((fArr3[i3] - f3) / f6) * f8;
                    f5 = f5 == 0.0f ? f10 : (f5 + f10) * 0.5f;
                }
                i3++;
                fArr2 = fArr;
            }
            this.mXVelocity = f4 < 0.0f ? Math.max(f4, -f) : Math.min(f4, f);
            this.mYVelocity = f5 < 0.0f ? Math.max(f5, -f) : Math.min(f5, f);
        }
    }

    static {
        int[] iArr = {R.attr.state_window_focused, 1, 16842913, 2, 16842908, 4, 16842910, 8, 16842919, 16, R.attr.state_activated, 32, R.attr.state_accelerated, 64, 16843623, 128, R.attr.state_drag_can_accept, 256, R.attr.state_drag_hovered, 512};
        VIEW_STATE_IDS = iArr;
        int length = R$styleable.NearViewDrawableStates.length;
        STYLEABLE_LENGTH = length;
        int length2 = iArr.length / 2;
        if (length2 != length) {
            throw new IllegalStateException("VIEW_STATE_IDS array length does not match ViewDrawableStates style array");
        }
        int length3 = iArr.length;
        int[] iArr2 = new int[length3];
        for (int i = 0; i < STYLEABLE_LENGTH; i++) {
            int i2 = R$styleable.NearViewDrawableStates[i];
            int i3 = 0;
            while (true) {
                int[] iArr3 = VIEW_STATE_IDS;
                if (i3 < iArr3.length) {
                    if (iArr3[i3] == i2) {
                        int i4 = i * 2;
                        iArr2[i4] = i2;
                        iArr2[i4 + 1] = iArr3[i3 + 1];
                    }
                    i3 += 2;
                }
            }
        }
        int i5 = 1 << length2;
        VIEW_STATE_SETS = new int[i5][][];
        VIEW_SETS = new int[i5][];
        for (int i6 = 0; i6 < VIEW_SETS.length; i6++) {
            VIEW_SETS[i6] = new int[Integer.bitCount(i6)];
            int i7 = 0;
            for (int i8 = 0; i8 < length3; i8 += 2) {
                if ((iArr2[i8 + 1] & i6) != 0) {
                    VIEW_SETS[i6][i7] = iArr2[i8];
                    i7++;
                }
            }
        }
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.NearSecurityKeyboardViewStyle);
    }

    private CharSequence adjustCase(CharSequence charSequence) {
        return (getNewShifted() < 1 || charSequence == null || charSequence.length() >= 3 || !Character.isLowerCase(charSequence.charAt(0))) ? charSequence : charSequence.toString().toUpperCase();
    }

    private void checkMultiTap(long j2, int i) {
        if (i == -1) {
            return;
        }
        int[] iArr = this.mKeys[i].codes;
        if (iArr.length <= 1) {
            if (j2 > this.mLastTapTime + 800 || i != this.mLastSentIndex) {
                resetMultiTap();
                return;
            }
            return;
        }
        this.mInMultiTap = true;
        if (j2 >= this.mLastTapTime + 800 || i != this.mLastSentIndex) {
            this.mTapCount = -1;
        } else {
            this.mTapCount = (this.mTapCount + 1) % iArr.length;
        }
    }

    private void computeProximityThreshold(SecurityKeyboard securityKeyboard) {
        SecurityKeyboard.Key[] keyArr;
        if (securityKeyboard == null || (keyArr = this.mKeys) == null) {
            return;
        }
        int length = keyArr.length;
        int iMin = 0;
        for (SecurityKeyboard.Key key : keyArr) {
            iMin += Math.min(key.width, key.height) + key.gap;
        }
        if (iMin < 0 || length == 0) {
            return;
        }
        int i = (int) ((iMin * 1.4f) / length);
        this.mProximityThreshold = i * i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detectAndSendKey(int i, int i2, int i3, long j2) {
        if (i != -1) {
            SecurityKeyboard.Key[] keyArr = this.mKeys;
            if (i < keyArr.length) {
                SecurityKeyboard.Key key = keyArr[i];
                CharSequence charSequence = key.text;
                if (charSequence != null) {
                    this.mKeyboardActionListener.onText(charSequence);
                    this.mKeyboardActionListener.onRelease(-1);
                } else {
                    int i4 = key.codes[0];
                    int[] iArr = new int[MAX_NEARBY_KEYS];
                    Arrays.fill(iArr, -1);
                    getKeyIndices(i2, i3, iArr);
                    if (this.mInMultiTap) {
                        if (this.mTapCount != -1) {
                            this.mKeyboardActionListener.onKey(-5, KEY_DELETE);
                            sendCharToTarget(i4, key);
                        } else {
                            this.mTapCount = 0;
                        }
                        i4 = key.codes[this.mTapCount];
                    }
                    sendCharToTarget(i4, key);
                    this.mKeyboardActionListener.onKey(i4, iArr);
                    this.mKeyboardActionListener.onRelease(i4);
                }
                this.mLastSentIndex = i;
                this.mLastTapTime = j2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissPopupKeyboard() {
        if (this.mPopupKeyboard.isShowing()) {
            this.mPopupKeyboard.dismiss();
            this.mMiniKeyboardOnScreen = false;
            invalidateAllKeys();
        }
    }

    private void drawSpecialSymbol(Canvas canvas, int i) {
        int paddingLeft = getPaddingLeft() + i;
        int i2 = this.mSpecialKeyWidth + paddingLeft;
        int paddingTop = getPaddingTop();
        int i3 = this.mSpecialKeyHeight;
        int i4 = paddingTop + i3;
        String[] strArr = this.mSpecialSymbols;
        float length = (i3 - ((strArr.length - 1) * this.mLineWidth)) / strArr.length;
        if (this.mItem == null) {
            return;
        }
        Drawable drawable = this.mSpecialAllItemBg;
        if (drawable != null) {
            drawable.setBounds(paddingLeft, paddingTop, i2, i4);
            this.mSpecialAllItemBg.draw(canvas);
        }
        for (int i5 = 0; i5 < this.mSpecialSymbols.length; i5++) {
            Drawable itemBg = this.mItem.get(i5).getItemBg();
            if (itemBg != null) {
                int paddingLeft2 = getPaddingLeft() + i;
                int i6 = this.mSpecialKeyWidth + paddingLeft2;
                float f = i5;
                float f2 = length * f;
                int paddingTop2 = (int) (getPaddingTop() + f2 + (this.mLineWidth * f));
                float paddingTop3 = getPaddingTop() + f2 + (f * this.mLineWidth);
                itemBg.setBounds(paddingLeft2 + 1, paddingTop2 + 1, i6 - 1, ((int) (paddingTop2 + length)) - 1);
                itemBg.draw(canvas);
                this.mItem.get(i5).setBottom(paddingTop3 + length);
                this.mItem.get(i5).setTop(paddingTop3);
            }
        }
        for (int i7 = 0; i7 < this.mSpecialSymbols.length; i7++) {
            TextPaint textPaint = this.mItem.get(i7).mSpecialTextPaint;
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            String str = this.mSpecialSymbols[i7];
            if (str != null) {
                int paddingLeft3 = getPaddingLeft() + ((this.mSpecialKeyWidth - ((int) textPaint.measureText(str))) / 2) + i;
                float paddingTop4 = getPaddingTop() + this.mBgTopOffset + (i7 * (this.mLineWidth + length)) + (length / 2.0f);
                int i8 = fontMetricsInt.descent;
                int i9 = fontMetricsInt.ascent;
                canvas.drawText(this.mSpecialSymbols[i7], paddingLeft3, (int) ((paddingTop4 - ((i8 - i9) / 2)) - i9), textPaint);
            }
        }
    }

    private int getIndexIndices(int i, int i2) {
        String[] strArr;
        int length;
        if (!isSecurityNumericKeyboard() || (strArr = this.mSpecialSymbols) == null || (length = strArr.length) <= 0) {
            return -1;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (i >= getPaddingLeft() && i <= this.mSpecialKeyWidth + getPaddingLeft()) {
                float f = i2;
                if (f >= this.mItem.get(i3).getTop() && f <= this.mItem.get(i3).getBottom()) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r6
  0x0042: PHI (r6v6 int) = (r6v3 int), (r6v7 int) binds: [B:13:0x0040, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[LOOP:2: B:29:0x0073->B:30:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[LOOP:1: B:24:0x0057->B:31:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0062 A[SYNTHETIC] */
    private int getKeyIndices(int i, int i2, int[] iArr) {
        int iSquaredDistanceFrom;
        boolean z;
        SecurityKeyboard.Key[] keyArr;
        int length;
        int i3;
        int[] iArr2;
        int i4;
        SecurityKeyboard.Key[] keyArr2 = this.mKeys;
        int i5 = this.mProximityThreshold + 1;
        Arrays.fill(this.mDistances, Integer.MAX_VALUE);
        int[] nearestKeys = this.mKeyboard.getNearestKeys(i, i2);
        int length2 = nearestKeys.length;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i6 < length2) {
            SecurityKeyboard.Key key = keyArr2[nearestKeys[i6]];
            boolean zIsInside = key.isInside(i, i2, getContext());
            if (zIsInside) {
                i7 = nearestKeys[i6];
            }
            if (this.mProximityCorrectOn) {
                iSquaredDistanceFrom = key.squaredDistanceFrom(i, i2);
                if (iSquaredDistanceFrom < this.mProximityThreshold) {
                    z = true;
                }
                if (z) {
                    length = key.codes.length;
                    if (iSquaredDistanceFrom < i5) {
                        i8 = nearestKeys[i6];
                        i5 = iSquaredDistanceFrom;
                    }
                    if (iArr == null) {
                        keyArr = keyArr2;
                    } else {
                        i3 = 0;
                        while (true) {
                            iArr2 = this.mDistances;
                            keyArr = keyArr2;
                            if (i3 < iArr2.length) {
                                if (iArr2[i3] > iSquaredDistanceFrom) {
                                    int i9 = i3 + length;
                                    System.arraycopy(iArr2, i3, iArr2, i9, (iArr2.length - i3) - length);
                                    System.arraycopy(iArr, i3, iArr, i9, (iArr.length - i3) - length);
                                    for (i4 = 0; i4 < length; i4++) {
                                        int i10 = i3 + i4;
                                        iArr[i10] = key.codes[i4];
                                        this.mDistances[i10] = iSquaredDistanceFrom;
                                    }
                                    break;
                                }
                                i3++;
                                keyArr2 = keyArr;
                            }
                        }
                        i5 = i5;
                    }
                    i5 = i5;
                } else {
                    keyArr = keyArr2;
                }
                i6++;
                keyArr2 = keyArr;
            } else {
                iSquaredDistanceFrom = 0;
            }
            if (zIsInside) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                length = key.codes.length;
                if (iSquaredDistanceFrom < i5) {
                    i8 = nearestKeys[i6];
                    i5 = iSquaredDistanceFrom;
                }
                if (iArr == null) {
                    keyArr = keyArr2;
                } else {
                    i3 = 0;
                    while (true) {
                        iArr2 = this.mDistances;
                        keyArr = keyArr2;
                        if (i3 < iArr2.length) {
                            if (iArr2[i3] > iSquaredDistanceFrom) {
                                int i11 = i3 + length;
                                System.arraycopy(iArr2, i3, iArr2, i11, (iArr2.length - i3) - length);
                                System.arraycopy(iArr, i3, iArr, i11, (iArr.length - i3) - length);
                                while (i4 < length) {
                                    int i12 = i3 + i4;
                                    iArr[i12] = key.codes[i4];
                                    this.mDistances[i12] = iSquaredDistanceFrom;
                                }
                                break;
                                break;
                            }
                            i3++;
                            keyArr2 = keyArr;
                        }
                    }
                    i5 = i5;
                }
                i5 = i5;
            } else {
                keyArr = keyArr2;
            }
            i6++;
            keyArr2 = keyArr;
        }
        if (i7 == -1) {
            i7 = i8;
        }
        if (!isSecurityNumericKeyboard() || i > this.mSpecialKeyWidth || i2 > (this.mSpecialKeyHeight + this.mVerticalCorrection) - this.mLineWidth) {
            return i7;
        }
        return -1;
    }

    private CharSequence getPreviewText(SecurityKeyboard.Key key) {
        if (!this.mInMultiTap) {
            return adjustCase(key.label);
        }
        this.mPreviewLabel.setLength(0);
        StringBuilder sb = this.mPreviewLabel;
        int[] iArr = key.codes;
        int i = this.mTapCount;
        sb.append((char) iArr[i >= 0 ? i : 0]);
        return adjustCase(this.mPreviewLabel);
    }

    private void initGestureDetector() {
        if (this.mGestureDetector == null) {
            GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.3
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (SecurityKeyboardView.this.mPossiblePoly) {
                        return false;
                    }
                    float fAbs = Math.abs(f);
                    float fAbs2 = Math.abs(f2);
                    float x = motionEvent2.getX() - motionEvent.getX();
                    float y = motionEvent2.getY() - motionEvent.getY();
                    int width = SecurityKeyboardView.this.getWidth() / 2;
                    int height = SecurityKeyboardView.this.getHeight() / 2;
                    SecurityKeyboardView.this.mSwipeTracker.computeCurrentVelocity(1000);
                    float xVelocity = SecurityKeyboardView.this.mSwipeTracker.getXVelocity();
                    float yVelocity = SecurityKeyboardView.this.mSwipeTracker.getYVelocity();
                    boolean z = true;
                    if (f <= SecurityKeyboardView.this.mSwipeThreshold || fAbs2 >= fAbs || x <= width) {
                        if (f >= (-SecurityKeyboardView.this.mSwipeThreshold) || fAbs2 >= fAbs || x >= (-width)) {
                            if (f2 >= (-SecurityKeyboardView.this.mSwipeThreshold) || fAbs >= fAbs2 || y >= (-height)) {
                                if (f2 <= SecurityKeyboardView.this.mSwipeThreshold || fAbs >= fAbs2 / 2.0f || y <= height) {
                                    z = false;
                                } else if (!SecurityKeyboardView.this.mDisambiguateSwipe || yVelocity >= f2 / 4.0f) {
                                    SecurityKeyboardView.this.swipeDown();
                                    return true;
                                }
                            } else if (!SecurityKeyboardView.this.mDisambiguateSwipe || yVelocity <= f2 / 4.0f) {
                                SecurityKeyboardView.this.swipeUp();
                                return true;
                            }
                        } else if (!SecurityKeyboardView.this.mDisambiguateSwipe || xVelocity <= f / 4.0f) {
                            SecurityKeyboardView.this.swipeLeft();
                            return true;
                        }
                    } else if (!SecurityKeyboardView.this.mDisambiguateSwipe || xVelocity >= f / 4.0f) {
                        SecurityKeyboardView.this.swipeRight();
                        return true;
                    }
                    if (z) {
                        SecurityKeyboardView securityKeyboardView = SecurityKeyboardView.this;
                        securityKeyboardView.detectAndSendKey(securityKeyboardView.mDownKey, SecurityKeyboardView.this.mStartX, SecurityKeyboardView.this.mStartY, motionEvent.getEventTime());
                    }
                    return false;
                }
            });
            this.mGestureDetector = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
        }
    }

    private void initState() {
        int length = this.mSpecialSymbols.length;
        if (length > 0 || this.mSpecialItemBg.getConstantState() != null) {
            for (int i = 0; i < length; i++) {
                this.mItemBg.add(this.mSpecialItemBg.getConstantState().newDrawable());
                this.mItem.add(new Item(this.mItemBg.get(i), this.mSpecialSymbols[i]));
            }
            for (int i2 = 0; i2 < length; i2++) {
                int[][][] iArr = VIEW_STATE_SETS;
                int[][] iArr2 = VIEW_SETS;
                int[][] iArr3 = new int[iArr2.length][];
                iArr[i2] = iArr3;
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            }
            this.mIconState.clear();
            this.mPrivateFlags.clear();
            for (int i3 = 0; i3 < length; i3++) {
                this.mIconState.add(new int[STYLEABLE_LENGTH]);
                this.mPrivateFlags.add(new Integer(0));
                refreshIconState(i3, this.mItem.get(i3).getItemBg());
                ColorStateList colorStateList = this.mItemTextColor;
                if (colorStateList != null) {
                    this.mItem.get(i3).mSpecialTextPaint.setColor(colorStateList.getColorForState(getIconState(i3), this.mItemTextColor.getDefaultColor()));
                }
            }
        }
    }

    private boolean isKeyPreview(int i) {
        Handler handler = this.mHandler;
        if (handler == null) {
            Log.d(TAG, "handler is null");
            return false;
        }
        if (i == -1) {
            Log.d(TAG, "handler isn't null and keyIndex is -1");
            Handler handler2 = this.mHandler;
            handler2.sendMessageDelayed(handler2.obtainMessage(2), 75L);
            return false;
        }
        SecurityKeyboard.Key key = this.mKeys[i];
        int i2 = key.codes[0];
        if (key.label != null && i2 != -1 && i2 != -5 && i2 != -2 && i2 != 10 && i2 != 32 && i2 != -6 && i2 != -7) {
            return true;
        }
        handler.sendMessageDelayed(handler.obtainMessage(2), 75L);
        return false;
    }

    private boolean isSecurityKeyboard() {
        return this.mKeyBoardViewType == 1;
    }

    private boolean isUnLockKeyboard() {
        return this.mKeyBoardViewType == 2;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:124:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x022d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    private void onBufferDraw() {
        boolean z;
        Drawable drawable;
        int i;
        char c2;
        Typeface typeface;
        float f;
        int i2;
        Bitmap bitmap = this.mBuffer;
        char c3 = 0;
        if (bitmap == null || this.mKeyboardChanged) {
            if (bitmap == null || (this.mKeyboardChanged && (bitmap.getWidth() != getWidth() || this.mBuffer.getHeight() != getHeight()))) {
                this.mBuffer = Bitmap.createBitmap(Math.max(1, getWidth()), Math.max(1, getHeight()), Bitmap.Config.ARGB_8888);
                this.mCanvas = new Canvas(this.mBuffer);
            }
            invalidateAllKeys();
            this.mKeyboardChanged = false;
        }
        if (this.mKeyboard == null) {
            return;
        }
        this.mCanvas.save();
        Canvas canvas = this.mCanvas;
        canvas.clipRect(this.mDirtyRect);
        Paint paint = this.mPaint;
        Rect rect = this.mClipRegion;
        Rect rect2 = this.mPadding;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        SecurityKeyboard.Key[] keyArr = this.mKeys;
        SecurityKeyboard.Key key = this.mInvalidatedKey;
        paint.setColor(this.mKeyTextColor);
        if (key == null || !canvas.getClipBounds(rect)) {
            z = false;
        } else {
            int i3 = key.x;
            if ((i3 + paddingLeft) - 1 <= rect.left) {
                int i4 = key.y;
                if ((i4 + paddingTop) - 1 > rect.top || i3 + key.width + paddingLeft + 1 < rect.right || i4 + key.height + paddingTop + 1 < rect.bottom) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        int length = keyArr.length;
        int i5 = 0;
        while (i5 < length) {
            SecurityKeyboard.Key key2 = keyArr[i5];
            if (!z || key == key2) {
                int[] currentDrawableState = key2.getCurrentDrawableState();
                if (this.mSpecialKeyBg == null || !((i2 = key2.codes[c3]) == -1 || i2 == -5 || i2 == -2 || i2 == -6 || i2 == -7 || (isSecurityNumericKeyboard() && (i5 == length - 2 || i5 == length - 6 || i5 == length - 10)))) {
                    drawable = this.mEndKeyBg;
                    if (drawable != null) {
                        int i6 = key2.codes[c3];
                        i = 10;
                        if (i6 != 10) {
                        }
                    } else {
                        i = 10;
                    }
                    drawable = this.mKeyBackground;
                } else {
                    drawable = this.mSpecialKeyBg;
                    i = 10;
                }
                paint.setColor(key2.codes[0] == i ? this.mGoTextColor.getColorForState(currentDrawableState, 0) : this.mTextColor.getColorForState(currentDrawableState, 0));
                if (drawable != null) {
                    drawable.setState(currentDrawableState);
                }
                CharSequence charSequence = key2.label;
                String string = charSequence == null ? null : adjustCase(charSequence).toString();
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    int i7 = key2.width;
                    if (i7 != bounds.right || key2.height != bounds.bottom) {
                        drawable.setBounds(0, 0, i7, key2.height);
                    }
                }
                canvas.translate(key2.x + paddingLeft, key2.y + paddingTop);
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                if (string != null) {
                    if (!Character.isLowerCase(string.charAt(0)) || key2.codes[0] == 32) {
                        int i8 = key2.codes[0];
                        if (i8 == 32) {
                            paint.setTextSize(this.mSpaceLabelSize);
                            paint.setFakeBoldText(false);
                        } else {
                            if (i8 == -2 || i8 == 10 || i8 == -1 || i8 == -6) {
                                c2 = 0;
                                paint.setTextSize(this.mEndLabelSize);
                                paint.setFakeBoldText(false);
                            } else if (i8 == -7) {
                                paint.setTextSize(this.mSkipSymbolsLabelSize);
                                paint.setFakeBoldText(false);
                            } else {
                                paint.setTextSize(this.mNumberLetterSize);
                                if (Character.isDigit(string.charAt(0))) {
                                    paint.setFakeBoldText(false);
                                } else if (string.equals("·")) {
                                    paint.setTextSize(getResources().getDimensionPixelOffset(R$dimen.nx_password_kbd_symbols_center_dot));
                                    paint.setFakeBoldText(true);
                                    c2 = 0;
                                } else {
                                    paint.setTextSize(this.mSymbolsLabelSize);
                                    c2 = 0;
                                    paint.setFakeBoldText(false);
                                }
                            }
                            typeface = this.mTypeface;
                            if (typeface != null) {
                                paint.setTypeface(typeface);
                            }
                            if (key2.codes[c2] == 10) {
                                paint.setTypeface(this.mTypeface);
                            }
                            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                            int i9 = key2.height;
                            int i10 = fontMetricsInt.bottom;
                            int i11 = fontMetricsInt.top;
                            f = (((i9 - (i10 - i11)) / 2) - i11) + ((rect2.bottom - rect2.top) / 2);
                            if (this.mTransUpSpecialSymbols.contains(string)) {
                                int i12 = key2.width;
                                int i13 = rect2.left;
                                canvas.drawText(string, (((i12 - i13) - rect2.right) / 2) + i13, f - this.mTransUpOffset, paint);
                            } else {
                                int i14 = key2.width;
                                int i15 = rect2.left;
                                canvas.drawText(string, (((i14 - i15) - rect2.right) / 2) + i15, f, paint);
                            }
                        }
                    } else {
                        paint.setTextSize(this.mLowerLetterSize);
                        paint.setFakeBoldText(false);
                    }
                    c2 = 0;
                    typeface = this.mTypeface;
                    if (typeface != null) {
                        paint.setTypeface(typeface);
                    }
                    if (key2.codes[c2] == 10) {
                        paint.setTypeface(this.mTypeface);
                    }
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i16 = key2.height;
                    int i17 = fontMetricsInt2.bottom;
                    int i18 = fontMetricsInt2.top;
                    f = (((i16 - (i17 - i18)) / 2) - i18) + ((rect2.bottom - rect2.top) / 2);
                    if (this.mTransUpSpecialSymbols.contains(string)) {
                        int i19 = key2.width;
                        int i110 = rect2.left;
                        canvas.drawText(string, (((i19 - i110) - rect2.right) / 2) + i110, f - this.mTransUpOffset, paint);
                    } else {
                        int i111 = key2.width;
                        int i112 = rect2.left;
                        canvas.drawText(string, (((i111 - i112) - rect2.right) / 2) + i112, f, paint);
                    }
                } else {
                    Drawable drawable2 = key2.icon;
                    if (drawable2 != null) {
                        int intrinsicWidth = ((((key2.width - rect2.left) - rect2.right) - drawable2.getIntrinsicWidth()) / 2) + rect2.left;
                        int intrinsicHeight = ((((key2.height - rect2.top) - rect2.bottom) - key2.icon.getIntrinsicHeight()) / 2) + rect2.top;
                        canvas.translate(intrinsicWidth, intrinsicHeight);
                        Drawable drawable3 = key2.icon;
                        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), key2.icon.getIntrinsicHeight());
                        key2.icon.draw(canvas);
                        canvas.translate(-intrinsicWidth, -intrinsicHeight);
                    }
                    canvas.translate((-key2.x) - paddingLeft, (-key2.y) - paddingTop);
                }
                canvas.translate((-key2.x) - paddingLeft, (-key2.y) - paddingTop);
            } else {
                rect2 = rect2;
            }
            i5++;
            rect2 = rect2;
            z = z;
            c3 = 0;
        }
        this.mInvalidatedKey = null;
        if (this.mMiniKeyboardOnScreen) {
            paint.setColor(((int) (this.mBackgroundDimAmount * 255.0f)) << 24);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        this.mCanvas.restore();
        this.mDrawPending = false;
        this.mDirtyRect.setEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d9  */
    private boolean onModifiedTouchEvent(MotionEvent motionEvent, boolean z) {
        String text;
        int i;
        int indexIndices;
        boolean z2;
        int i2;
        int indexIndices2;
        int i3;
        int x = ((int) motionEvent.getX()) - getPaddingLeft();
        int y = ((int) motionEvent.getY()) - getPaddingTop();
        int i4 = this.mVerticalCorrection;
        if (y >= (-i4)) {
            y += i4;
        }
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        int keyIndices = getKeyIndices(x, y, null);
        if (!isKeyboardViewEnabled()) {
            SecurityKeyboard.Key[] keyArr = this.mKeys;
            if (keyIndices != keyArr.length - 1) {
                if (this.mIsDownFlag && (i3 = this.mPreviousKey) != -1 && i3 == keyArr.length - 1) {
                    SecurityKeyboard.Key key = keyArr[i3];
                    if (key.pressed) {
                        key.onReleased(this.mCurrentKeyIndex == -1);
                        this.mCurrentKeyIndex = -1;
                        this.mIsDownFlag = false;
                    }
                    invalidateKey(this.mPreviousKey);
                }
                return false;
            }
        }
        this.mPossiblePoly = z;
        if (action == 0) {
            this.mSwipeTracker.clear();
        }
        this.mSwipeTracker.addMovement(motionEvent);
        if (this.mAbortKey && action != 0 && action != 3) {
            return true;
        }
        if (this.mGestureDetector.onTouchEvent(motionEvent)) {
            showPreview(-1);
            this.mHandler.removeMessages(3);
            this.mHandler.removeMessages(4);
            return true;
        }
        if (this.mMiniKeyboardOnScreen && action != 3) {
            return true;
        }
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int indexIndices3 = getIndexIndices(x2, y2);
        if (action == 0) {
            this.mAbortKey = false;
            this.mStartX = x;
            this.mStartY = y;
            this.mLastCodeX = x;
            this.mLastCodeY = y;
            this.mLastKeyTime = 0L;
            this.mCurrentKeyTime = 0L;
            this.mLastKey = -1;
            this.mCurrentKey = keyIndices;
            this.mDownKey = keyIndices;
            long eventTime2 = motionEvent.getEventTime();
            this.mDownTime = eventTime2;
            this.mLastMoveTime = eventTime2;
            checkMultiTap(eventTime, keyIndices);
            if (!isSecurityNumericKeyboard() || -1 == indexIndices3 || indexIndices3 >= this.mSpecialSymbols.length) {
                this.mKeyboardActionListener.onPress(keyIndices != -1 ? this.mKeys[keyIndices].codes[0] : 0);
            } else {
                this.mKeyboardActionListener.onPress(-1);
            }
            int i5 = this.mCurrentKey;
            if (i5 != -1) {
                this.mPreviousKey = i5;
            }
            SecurityKeyboard.Key[] keyArr2 = this.mKeys;
            if (i5 == keyArr2.length - 1) {
                this.mIsDownFlag = true;
            }
            if (i5 < 0 || !keyArr2[i5].repeatable) {
                if (this.mCurrentKey != -1) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(4, motionEvent), LONGPRESS_TIMEOUT);
                }
                showPreview(keyIndices);
                if (isSecurityNumericKeyboard() && -1 != indexIndices3 && indexIndices3 < this.mSpecialSymbols.length) {
                    this.mPreviousIndex = indexIndices3;
                    sendAccessibilityViewText(indexIndices3);
                    setIconPressed(indexIndices3, true);
                    Drawable itemBg = this.mItem.get(indexIndices3).getItemBg();
                    text = this.mItem.get(indexIndices3).getText();
                    refreshIconState(indexIndices3, itemBg);
                    invalidate();
                    if (text != null && this.mItemTextColor != null) {
                        int[] iconState = getIconState(indexIndices3);
                        ColorStateList colorStateList = this.mItemTextColor;
                        this.mItem.get(indexIndices3).mSpecialTextPaint.setColor(colorStateList.getColorForState(iconState, colorStateList.getDefaultColor()));
                        invalidate();
                    }
                }
            } else {
                this.mRepeatKeyIndex = i5;
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3), 400L);
                repeatKey();
                if (this.mAbortKey) {
                    this.mRepeatKeyIndex = -1;
                } else {
                    if (this.mCurrentKey != -1) {
                        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(4, motionEvent), LONGPRESS_TIMEOUT);
                    }
                    showPreview(keyIndices);
                    if (isSecurityNumericKeyboard()) {
                        this.mPreviousIndex = indexIndices3;
                        sendAccessibilityViewText(indexIndices3);
                        setIconPressed(indexIndices3, true);
                        Drawable itemBg2 = this.mItem.get(indexIndices3).getItemBg();
                        text = this.mItem.get(indexIndices3).getText();
                        refreshIconState(indexIndices3, itemBg2);
                        invalidate();
                        if (text != null) {
                            int[] iconState2 = getIconState(indexIndices3);
                            ColorStateList colorStateList2 = this.mItemTextColor;
                            this.mItem.get(indexIndices3).mSpecialTextPaint.setColor(colorStateList2.getColorForState(iconState2, colorStateList2.getDefaultColor()));
                            invalidate();
                        }
                    }
                }
            }
        } else if (action == 1) {
            removeMessages();
            if (keyIndices == this.mCurrentKey) {
                this.mCurrentKeyTime += eventTime - this.mLastMoveTime;
            } else {
                resetMultiTap();
                this.mLastKey = this.mCurrentKey;
                this.mLastKeyTime = (this.mCurrentKeyTime + eventTime) - this.mLastMoveTime;
                this.mCurrentKey = keyIndices;
                this.mCurrentKeyTime = 0L;
            }
            long j2 = this.mCurrentKeyTime;
            if (j2 >= this.mLastKeyTime || j2 >= 70) {
                i = -1;
            } else {
                int i6 = this.mLastKey;
                i = -1;
                if (i6 != -1) {
                    this.mCurrentKey = i6;
                    x = this.mLastCodeX;
                    y = this.mLastCodeY;
                }
            }
            int i7 = x;
            int i8 = y;
            showPreview(i);
            Arrays.fill(this.mKeyIndices, i);
            if (this.mRepeatKeyIndex == i && !this.mMiniKeyboardOnScreen && !this.mAbortKey) {
                detectAndSendKey(this.mCurrentKey, i7, i8, eventTime);
            }
            invalidateKey(keyIndices);
            this.mRepeatKeyIndex = -1;
            if (this.mCurrentKey == this.mKeys.length - 1) {
                this.mIsDownFlag = false;
            }
            if (isSecurityNumericKeyboard() && -1 != (indexIndices = getIndexIndices(x2, y2)) && indexIndices < this.mSpecialSymbols.length) {
                setItemRestore(indexIndices);
                this.mKeyboardActionListener.onKey(this.mSpecialSymbols[indexIndices].charAt(0), null);
                this.mKeyboardActionListener.onRelease(this.mSpecialSymbols[indexIndices].charAt(0));
                OnKeyboardCharListener onKeyboardCharListener = this.mKeyboardCharListener;
                if (onKeyboardCharListener != null) {
                    onKeyboardCharListener.onCharacter(this.mSpecialSymbols[indexIndices], 0);
                }
            }
            x = i7;
            y = i8;
        } else if (action == 2) {
            if (keyIndices == -1) {
                z2 = false;
            } else {
                int i9 = this.mCurrentKey;
                if (i9 == -1) {
                    this.mCurrentKey = keyIndices;
                    this.mCurrentKeyTime = eventTime - this.mDownTime;
                } else if (keyIndices == i9) {
                    this.mCurrentKeyTime += eventTime - this.mLastMoveTime;
                    z2 = true;
                } else if (this.mRepeatKeyIndex == -1) {
                    resetMultiTap();
                    this.mLastKey = this.mCurrentKey;
                    this.mLastCodeX = this.mLastX;
                    this.mLastCodeY = this.mLastY;
                    this.mLastKeyTime = (this.mCurrentKeyTime + eventTime) - this.mLastMoveTime;
                    this.mCurrentKey = keyIndices;
                    this.mCurrentKeyTime = 0L;
                }
                z2 = false;
            }
            if (z2) {
                i2 = -1;
            } else {
                this.mHandler.removeMessages(4);
                i2 = -1;
                if (keyIndices != -1) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(4, motionEvent), LONGPRESS_TIMEOUT);
                }
            }
            int i10 = this.mCurrentKey;
            if (i10 != i2) {
                this.mPreviousKey = i10;
            }
            showPreview(i10);
            this.mLastMoveTime = eventTime;
            if (isSecurityNumericKeyboard()) {
                if (indexIndices3 != this.mPreviousIndex && i2 != indexIndices3 && indexIndices3 < this.mSpecialSymbols.length) {
                    setIconPressed(indexIndices3, true);
                    Drawable itemBg3 = this.mItem.get(indexIndices3).getItemBg();
                    String text2 = this.mItem.get(indexIndices3).getText();
                    refreshIconState(indexIndices3, itemBg3);
                    invalidate();
                    if (text2 != null && this.mItemTextColor != null) {
                        int[] iconState3 = getIconState(indexIndices3);
                        ColorStateList colorStateList3 = this.mItemTextColor;
                        this.mItem.get(indexIndices3).mSpecialTextPaint.setColor(colorStateList3.getColorForState(iconState3, colorStateList3.getDefaultColor()));
                        invalidate();
                    }
                }
                int i11 = this.mPreviousIndex;
                if (-1 != i11 && indexIndices3 != i11 && i11 < this.mSpecialSymbols.length) {
                    setItemRestore(i11);
                }
                this.mPreviousIndex = indexIndices3;
            }
        } else if (action == 3) {
            removeMessages();
            dismissPopupKeyboard();
            this.mAbortKey = true;
            showPreview(-1);
            invalidateKey(this.mCurrentKey);
            if (isSecurityNumericKeyboard() && -1 != (indexIndices2 = getIndexIndices(x2, y2)) && indexIndices2 < this.mSpecialSymbols.length) {
                setItemRestore(indexIndices2);
            }
        }
        this.mLastX = x;
        this.mLastY = y;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean openPopupIfRequired(MotionEvent motionEvent) {
        int i;
        if (this.mPopupLayout != 0 && (i = this.mCurrentKey) >= 0) {
            SecurityKeyboard.Key[] keyArr = this.mKeys;
            if (i < keyArr.length) {
                boolean zOnLongPress = onLongPress(keyArr[i]);
                if (zOnLongPress) {
                    this.mAbortKey = true;
                    showPreview(-1);
                }
                return zOnLongPress;
            }
        }
        return false;
    }

    private void removeMessages() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(3);
            this.mHandler.removeMessages(4);
            this.mHandler.removeMessages(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean repeatKey() {
        SecurityKeyboard.Key key = this.mKeys[this.mRepeatKeyIndex];
        detectAndSendKey(this.mCurrentKey, key.x, key.y, this.mLastTapTime);
        return true;
    }

    private void resetMultiTap() {
        this.mLastSentIndex = -1;
        this.mTapCount = 0;
        this.mLastTapTime = -1L;
        this.mInMultiTap = false;
    }

    private void sendAccessibilityEventForUnicodeCharacter(int i, int i2) {
        String string;
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        onInitializeAccessibilityEvent(accessibilityEventObtain);
        if (i2 != 10) {
            switch (i2) {
                case -6:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_alt);
                    break;
                case -5:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_delete);
                    break;
                case -4:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_done);
                    break;
                case -3:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_cancel);
                    break;
                case -2:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_mode_change);
                    break;
                case -1:
                    string = getContext().getString(R$string.nx_keyboardview_keycode_shift);
                    break;
                default:
                    string = String.valueOf((char) i2);
                    break;
            }
        } else {
            string = getContext().getString(R$string.nx_keyboardview_keycode_enter);
        }
        accessibilityEventObtain.getText().add(string);
        this.mAccessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    private void sendAccessibilityViewText(int i) {
        String string;
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        if (i == 0) {
            string = getContext().getString(R$string.nx_keyboardview_keycode_asterisk);
        } else if (i == 1) {
            string = getContext().getString(R$string.nx_keyboardview_keycode_minus);
        } else if (i != 2) {
            string = i != 3 ? null : getContext().getString(R$string.nx_keyboardview_keycode_dollar);
        } else {
            string = getContext().getString(R$string.nx_keyboardview_keycode_atsymbol);
        }
        if (string != null) {
            announceForAccessibility(string);
        }
    }

    private void sendCharToTarget(int i, SecurityKeyboard.Key key) {
        OnKeyboardCharListener onKeyboardCharListener = this.mKeyboardCharListener;
        if (onKeyboardCharListener == null || i == -1 || i == -2 || i == -6 || i == -7) {
            return;
        }
        if (i == 10) {
            onKeyboardCharListener.onCharacter("", 2);
            return;
        }
        if (i == 32) {
            onKeyboardCharListener.onCharacter(" ", 0);
            return;
        }
        if (i == -5) {
            onKeyboardCharListener.onCharacter("", 1);
            return;
        }
        CharSequence charSequence = key.label;
        String string = charSequence == null ? null : adjustCase(charSequence).toString();
        if (string != null) {
            this.mKeyboardCharListener.onCharacter(string, 0);
        }
    }

    private void setIconPressed(int i, boolean z) {
        int iIntValue = this.mPrivateFlags.get(i).intValue();
        this.mPrivateFlags.set(i, Integer.valueOf(z ? iIntValue | 16384 : iIntValue & (-16385)));
    }

    private void setItemRestore(int i) {
        setIconPressed(i, false);
        Drawable itemBg = this.mItem.get(i).getItemBg();
        String text = this.mItem.get(i).getText();
        refreshIconState(i, itemBg);
        if (text == null || this.mItemTextColor == null) {
            return;
        }
        int[] iconState = getIconState(i);
        ColorStateList colorStateList = this.mItemTextColor;
        this.mItem.get(i).mSpecialTextPaint.setColor(colorStateList.getColorForState(iconState, colorStateList.getDefaultColor()));
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showKey(int i) {
        KeyboardPopupWindow keyboardPopupWindow = this.mPreviewPopup;
        SecurityKeyboard.Key[] keyArr = this.mKeys;
        if (i < 0 || i >= keyArr.length) {
            return;
        }
        SecurityKeyboard.Key key = keyArr[i];
        Drawable drawable = key.icon;
        if (drawable != null) {
            TextView textView = this.mPreviewText;
            Drawable drawable2 = key.iconPreview;
            if (drawable2 != null) {
                drawable = drawable2;
            }
            textView.setCompoundDrawables(null, null, null, drawable);
            this.mPreviewText.setText((CharSequence) null);
        } else {
            this.mPreviewText.setCompoundDrawables(null, null, null, null);
            this.mPreviewText.setText(getPreviewText(key));
            if (key.label.length() <= 1 || key.codes.length >= 2) {
                this.mPreviewText.setTextSize(0, this.mPreviewTextSizeLarge);
                this.mPreviewText.setTypeface(this.mTypeface);
            } else {
                this.mPreviewText.setTextSize(0, this.mKeyTextSize);
                this.mPreviewText.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
        this.mPreviewText.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i2 = this.mPreviewWidth;
        int i3 = this.mPreviewHeight;
        ViewGroup.LayoutParams layoutParams = this.mPreviewText.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
            layoutParams.height = i3;
        }
        if (this.mPreviewCentered) {
            this.mPopupPreviewX = 160 - (this.mPreviewText.getMeasuredWidth() / 2);
            this.mPopupPreviewY = -this.mPreviewText.getMeasuredHeight();
        } else {
            this.mPopupPreviewX = ((key.x + (key.width / 2)) - (this.mPreviewWidth / 2)) + getPaddingLeft();
            this.mPopupPreviewY = (key.y - i3) + this.mPreviewOffset;
        }
        this.mHandler.removeMessages(2);
        getLocationInWindow(this.mCoordinates);
        int[] iArr = this.mCoordinates;
        iArr[0] = iArr[0] + this.mMiniKeyboardOffsetX;
        iArr[1] = iArr[1] + this.mMiniKeyboardOffsetY;
        this.mPreviewText.getBackground().setState(key.popupResId != 0 ? LONG_PRESSABLE_STATE_SET : View.EMPTY_STATE_SET);
        int i4 = this.mPopupPreviewX;
        int[] iArr2 = this.mCoordinates;
        this.mPopupPreviewX = i4 + iArr2[0];
        this.mPopupPreviewY += iArr2[1];
        getLocationOnScreen(iArr2);
        if (this.mPopupPreviewY + this.mCoordinates[1] < 0) {
            if (key.x + key.width <= getWidth() / 2) {
                this.mPopupPreviewX += (int) (((double) key.width) * 2.5d);
            } else {
                this.mPopupPreviewX -= (int) (((double) key.width) * 2.5d);
            }
            this.mPopupPreviewY += i3;
        }
        if (keyboardPopupWindow.isShowing()) {
            keyboardPopupWindow.update(this.mPopupPreviewX, this.mPopupPreviewY, i2, i3);
        } else {
            keyboardPopupWindow.setWidth(i2);
            keyboardPopupWindow.setHeight(i3);
            keyboardPopupWindow.showAtLocation(this.mPopupParent, 0, this.mPopupPreviewX, this.mPopupPreviewY);
        }
        this.mPreviewText.setVisibility(0);
    }

    private void showPreview(int i) {
        int i2 = this.mCurrentKeyIndex;
        KeyboardPopupWindow keyboardPopupWindow = this.mPreviewPopup;
        this.mCurrentKeyIndex = i;
        SecurityKeyboard.Key[] keyArr = this.mKeys;
        if (i2 != i) {
            if (i2 != -1 && keyArr.length > i2) {
                SecurityKeyboard.Key key = keyArr[i2];
                key.onReleased(i == -1);
                invalidateKey(i2);
                int i3 = key.codes[0];
                sendAccessibilityEventForUnicodeCharacter(256, i3);
                sendAccessibilityEventForUnicodeCharacter(65536, i3);
            }
            int i4 = this.mCurrentKeyIndex;
            if (i4 != -1 && keyArr.length > i4) {
                SecurityKeyboard.Key key2 = keyArr[i4];
                key2.onPressed();
                invalidateKey(this.mCurrentKeyIndex);
                int i5 = key2.codes[0];
                sendAccessibilityEventForUnicodeCharacter(128, i5, key2);
                sendAccessibilityEventForUnicodeCharacter(32768, i5, key2);
            }
        }
        boolean zIsKeyPreview = isKeyPreview(this.mCurrentKeyIndex);
        if (i2 != this.mCurrentKeyIndex && this.mShowPreview && zIsKeyPreview) {
            this.mHandler.removeMessages(1);
            if (keyboardPopupWindow.isShowing() && i == -1) {
                Handler handler = this.mHandler;
                handler.sendMessageDelayed(handler.obtainMessage(2), 75L);
            }
            if (i != -1) {
                if (keyboardPopupWindow.isShowing() && this.mPreviewText.getVisibility() == 0) {
                    showKey(i);
                } else {
                    showKey(i);
                }
            }
        }
    }

    public void clearPressState() {
        removeMessages();
        showPreview(-1);
    }

    public void closing() {
        if (this.mPreviewPopup.isShowing()) {
            this.mPreviewPopup.dismiss();
        }
        this.mPreviousKey = -1;
        removeMessages();
        dismissPopupKeyboard();
        this.mBuffer = null;
        this.mCanvas = null;
        this.mMiniKeyboardCache.clear();
    }

    public int[] getIconState(int i) {
        int iIntValue = this.mPrivateFlags.get(i).intValue();
        if ((iIntValue & 1024) != 0) {
            this.mIconState.set(i, onCreateIconState(i, 0));
            this.mPrivateFlags.set(i, Integer.valueOf(iIntValue & (-1025)));
        }
        return this.mIconState.get(i);
    }

    public SecurityKeyboard getKeyboard() {
        return this.mKeyboard;
    }

    public int getNewShifted() {
        SecurityKeyboard securityKeyboard = this.mKeyboard;
        if (securityKeyboard != null) {
            return securityKeyboard.getNewShifted();
        }
        return -1;
    }

    public OnKeyboardActionListener getOnKeyboardActionListener() {
        return this.mKeyboardActionListener;
    }

    public boolean handleBack() {
        if (!this.mPopupKeyboard.isShowing()) {
            return false;
        }
        dismissPopupKeyboard();
        return true;
    }

    public void iconStateChanged(int i, Drawable drawable) {
        int[] iconState = getIconState(i);
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(iconState);
    }

    public void invalidateAllKeys() {
        this.mDirtyRect.union(0, 0, getWidth(), getHeight());
        this.mDrawPending = true;
        invalidate();
    }

    public void invalidateKey(int i) {
        SecurityKeyboard.Key[] keyArr = this.mKeys;
        if (keyArr != null && i >= 0 && i < keyArr.length) {
            SecurityKeyboard.Key key = keyArr[i];
            this.mInvalidatedKey = key;
            this.mDirtyRect.union(key.x + getPaddingLeft(), key.y + getPaddingTop(), key.x + key.width + getPaddingLeft(), key.y + key.height + getPaddingTop());
            onBufferDraw();
            invalidate(key.x + getPaddingLeft(), key.y + getPaddingTop(), key.x + key.width + getPaddingLeft(), key.y + key.height + getPaddingTop());
        }
    }

    public boolean isKeyboardViewEnabled() {
        return this.mIsEnable;
    }

    public boolean isPreviewEnabled() {
        return this.mShowPreview;
    }

    public boolean isProximityCorrectionEnabled() {
        return this.mProximityCorrectOn;
    }

    public boolean isSecurityNumericKeyboard() {
        return this.mKeyboard.getKeyboardType() == 3;
    }

    public boolean isShifted() {
        SecurityKeyboard securityKeyboard = this.mKeyboard;
        if (securityKeyboard != null) {
            return securityKeyboard.isShifted();
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"HandlerLeak"})
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initGestureDetector();
        if (this.mHandler == null) {
            this.mHandler = new Handler() { // from class: com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.2
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 1) {
                        SecurityKeyboardView.this.showKey(message.arg1);
                        return;
                    }
                    if (i == 2) {
                        Log.d(SecurityKeyboardView.TAG, "handleMessage MSG_REMOVE_PREVIEW");
                        SecurityKeyboardView.this.mPreviewText.setVisibility(4);
                    } else if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        SecurityKeyboardView.this.openPopupIfRequired((MotionEvent) message.obj);
                    } else if (SecurityKeyboardView.this.repeatKey()) {
                        sendMessageDelayed(Message.obtain(this, 3), 50L);
                    }
                }
            };
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismissPopupKeyboard();
    }

    public int[] onCreateIconState(int i, int i2) {
        int iIntValue = this.mPrivateFlags.get(i).intValue();
        int i3 = (this.mPrivateFlags.get(i).intValue() & 16384) != 0 ? 16 : 0;
        if ((iIntValue & 32) == 0) {
            i3 |= 8;
        }
        if (hasWindowFocus()) {
            i3 |= 1;
        }
        int[] iArr = VIEW_STATE_SETS[i][i3];
        if (i2 == 0) {
            return iArr;
        }
        if (iArr == null) {
            return new int[i2];
        }
        int[] iArr2 = new int[iArr.length + i2];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        closing();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mDrawPending || this.mBuffer == null || this.mKeyboardChanged) {
            onBufferDraw();
        }
        canvas.drawBitmap(this.mBuffer, 0.0f, 0.0f, (Paint) null);
        if (isSecurityNumericKeyboard()) {
            drawSpecialSymbol(canvas, this.mSpecialSymbolsOffset);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled() && motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 7) {
                motionEvent.setAction(2);
            } else if (action == 9) {
                motionEvent.setAction(0);
            } else if (action == 10) {
                motionEvent.setAction(1);
            }
            onTouchEvent(motionEvent);
            motionEvent.setAction(action);
        }
        return super.onHoverEvent(motionEvent);
    }

    public boolean onLongPress(SecurityKeyboard.Key key) {
        SecurityKeyboard securityKeyboard;
        int i = key.popupResId;
        if (i == 0) {
            return false;
        }
        View view = this.mMiniKeyboardCache.get(key);
        this.mMiniKeyboardContainer = view;
        if (view == null) {
            View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.mPopupLayout, (ViewGroup) null);
            this.mMiniKeyboardContainer = viewInflate;
            this.mMiniKeyboard = (SecurityKeyboardView) viewInflate.findViewById(R.id.keyboardView);
            View viewFindViewById = this.mMiniKeyboardContainer.findViewById(R.id.closeButton);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(this);
            }
            this.mMiniKeyboard.setOnKeyboardActionListener(new OnKeyboardActionListener() { // from class: com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.4
                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void onKey(int i2, int[] iArr) {
                    SecurityKeyboardView.this.mKeyboardActionListener.onKey(i2, iArr);
                    SecurityKeyboardView.this.dismissPopupKeyboard();
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void onPress(int i2) {
                    SecurityKeyboardView.this.mKeyboardActionListener.onPress(i2);
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void onRelease(int i2) {
                    SecurityKeyboardView.this.mKeyboardActionListener.onRelease(i2);
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void onText(CharSequence charSequence) {
                    SecurityKeyboardView.this.mKeyboardActionListener.onText(charSequence);
                    SecurityKeyboardView.this.dismissPopupKeyboard();
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void swipeDown() {
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void swipeLeft() {
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void swipeRight() {
                }

                @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
                public void swipeUp() {
                }
            });
            if (key.popupCharacters != null) {
                securityKeyboard = new SecurityKeyboard(getContext(), i, key.popupCharacters, -1, getPaddingRight() + getPaddingLeft());
            } else {
                securityKeyboard = new SecurityKeyboard(getContext(), i);
            }
            this.mMiniKeyboard.setKeyboard(securityKeyboard);
            this.mMiniKeyboard.setPopupParent(this);
            this.mMiniKeyboardContainer.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            this.mMiniKeyboardCache.put(key, this.mMiniKeyboardContainer);
        } else {
            this.mMiniKeyboard = (SecurityKeyboardView) view.findViewById(R.id.keyboardView);
        }
        getLocationInWindow(this.mCoordinates);
        this.mPopupX = key.x + getPaddingLeft();
        this.mPopupY = key.y + getPaddingTop();
        this.mPopupX = (this.mPopupX + key.width) - this.mMiniKeyboardContainer.getMeasuredWidth();
        this.mPopupY -= this.mMiniKeyboardContainer.getMeasuredHeight();
        int paddingRight = this.mPopupX + this.mMiniKeyboardContainer.getPaddingRight() + this.mCoordinates[0];
        int paddingBottom = this.mPopupY + this.mMiniKeyboardContainer.getPaddingBottom() + this.mCoordinates[1];
        this.mMiniKeyboard.setPopupOffset(paddingRight < 0 ? 0 : paddingRight, paddingBottom);
        this.mMiniKeyboard.setNewShifted(getNewShifted());
        this.mPopupKeyboard.setContentView(this.mMiniKeyboardContainer);
        this.mPopupKeyboard.setWidth(this.mMiniKeyboardContainer.getMeasuredWidth());
        this.mPopupKeyboard.setHeight(this.mMiniKeyboardContainer.getMeasuredHeight());
        this.mPopupKeyboard.showAtLocation(this, 0, paddingRight, paddingBottom);
        this.mMiniKeyboardOnScreen = true;
        invalidateAllKeys();
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mKeyboard == null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.mKeyboard.getHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mBuffer = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        boolean zOnModifiedTouchEvent = true;
        if (pointerCount != this.mOldPointerCount) {
            if (pointerCount == 1) {
                MotionEvent motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                boolean zOnModifiedTouchEvent2 = onModifiedTouchEvent(motionEventObtain, false);
                motionEventObtain.recycle();
                zOnModifiedTouchEvent = action == 1 ? onModifiedTouchEvent(motionEvent, true) : zOnModifiedTouchEvent2;
            } else {
                MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 1, this.mOldPointerX, this.mOldPointerY, motionEvent.getMetaState());
                zOnModifiedTouchEvent = onModifiedTouchEvent(motionEventObtain2, true);
                motionEventObtain2.recycle();
            }
        } else if (pointerCount == 1) {
            zOnModifiedTouchEvent = onModifiedTouchEvent(motionEvent, false);
            this.mOldPointerX = motionEvent.getX();
            this.mOldPointerY = motionEvent.getY();
        }
        this.mOldPointerCount = pointerCount;
        return zOnModifiedTouchEvent;
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mRefreshStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if (TextUtils.equals(resourceTypeName, "attr")) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.SecurityKeyboardView, this.mRefreshStyle, 0);
        } else if (TextUtils.equals(resourceTypeName, Const.Arguments.Open.STYLE)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.SecurityKeyboardView, 0, this.mRefreshStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSecurityKeyBackground);
            this.mKeyBackground = drawable;
            if (drawable != null) {
                drawable.getPadding(this.mPadding);
            }
            this.mKeyTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.SecurityKeyboardView_nxSecurityKeyTextColor, -16777216);
            this.mTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxTextColor);
            this.mGoTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxGoTextColor);
            this.mEndKeyBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxEndKeyBg);
            this.mItemTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxItemSymbolsColor);
            this.mSpecialKeyBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSpecialKeyBg);
            this.mSpecialItemBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSpecialItemBg);
            initState();
            invalidate();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void refreshIconState(int i, Drawable drawable) {
        this.mPrivateFlags.set(i, Integer.valueOf(this.mPrivateFlags.get(i).intValue() | 1024));
        iconStateChanged(i, drawable);
    }

    public void setEndKeyBg(Drawable drawable) {
        if (drawable != null) {
            this.mEndKeyBg = drawable;
            invalidate();
        }
    }

    public void setGoTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mGoTextColor = colorStateList;
            invalidate();
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mItemTextColor = colorStateList;
            initState();
            invalidate();
        }
    }

    public void setKeyBackground(Drawable drawable) {
        if (drawable != null) {
            this.mKeyBackground = drawable;
            drawable.getPadding(this.mPadding);
            invalidate();
        }
    }

    public void setKeyTextColor(int i) {
        if (i != this.mKeyTextColor) {
            this.mKeyTextColor = i;
            invalidate();
        }
    }

    public void setKeyboard(SecurityKeyboard securityKeyboard) {
        if (this.mKeyboard != null) {
            showPreview(-1);
        }
        removeMessages();
        this.mKeyboard = securityKeyboard;
        this.mTransUpOffset = (int) (((double) securityKeyboard.getKeyHeight()) * 0.15d);
        List<SecurityKeyboard.Key> keys = this.mKeyboard.getKeys();
        this.mKeys = (SecurityKeyboard.Key[]) keys.toArray(new SecurityKeyboard.Key[keys.size()]);
        requestLayout();
        this.mKeyboardChanged = true;
        invalidateAllKeys();
        computeProximityThreshold(securityKeyboard);
        this.mMiniKeyboardCache.clear();
        this.mRepeatKeyIndex = -1;
        this.mAbortKey = true;
    }

    public void setKeyboardType(int i) {
        this.mTypeface = Typeface.DEFAULT;
        Resources resources = getResources();
        int i2 = R$dimen.nx_security_keyboard_lower_letter_text_size;
        this.mLowerLetterSize = resources.getDimensionPixelOffset(i2);
        this.mSpaceLabelSize = getResources().getDimensionPixelOffset(R$dimen.nx_security_keyboard_space_label_text_size);
        this.mNumberLetterSize = getResources().getDimensionPixelOffset(i2);
        this.mEndLabelSize = getResources().getDimensionPixelOffset(R$dimen.nx_security_keyboard_end_label_text_size);
        this.mSpecialItemSize = getResources().getDimensionPixelOffset(R$dimen.nx_security_numeric_keyboard_special_text_size);
        this.mSymbolsLabelSize = getResources().getDimensionPixelOffset(R$dimen.nx_password_kbd_symbols_special_symbols_textSize);
        this.mSkipSymbolsLabelSize = getResources().getDimensionPixelOffset(R$dimen.nx_password_kbd_skip_symbols_key_labelSize);
        this.mLineWidth = getResources().getDimension(R$dimen.nx_password_numeric_keyboard_line_width);
        this.mSpecialSymbols = getResources().getStringArray(R$array.nx_numeric_keyboard_special_symbol);
        String[] stringArray = getResources().getStringArray(R$array.nx_need_translate_up_special_symbols);
        if (stringArray != null) {
            this.mTransUpSpecialSymbols.addAll(Arrays.asList(stringArray));
        }
        if (ScreenConfigUtil.isPad(getContext())) {
            this.mSpecialKeyWidth = getResources().getDimensionPixelSize(R$dimen.nx_pad_security_password_numeric_delete_dimen_keyWidth);
            this.mSpecialKeyHeight = getResources().getDimensionPixelSize(R$dimen.nx_pad_security_password_numeric_special_height);
            this.mSpecialSymbolsOffset = getResources().getDimensionPixelOffset(R$dimen.nx_pad_security_numeric_keyboard_special_symbol_offset);
        } else if (ScreenConfigUtil.isFoldScreen(getContext())) {
            this.mSpecialKeyWidth = getResources().getDimensionPixelSize(R$dimen.nx_fold_security_password_numeric_delete_dimen_keyWidth);
            this.mSpecialKeyHeight = getResources().getDimensionPixelSize(R$dimen.nx_fold_security_password_numeric_special_height);
            this.mSpecialSymbolsOffset = getResources().getDimensionPixelOffset(R$dimen.nx_fold_security_numeric_keyboard_special_symbol_offset);
        } else {
            this.mSpecialKeyWidth = getResources().getDimensionPixelSize(R$dimen.nx_security_password_numeric_delete_dimen_keyWidth);
            this.mSpecialKeyHeight = getResources().getDimensionPixelSize(R$dimen.nx_security_password_numeric_special_height);
            this.mSpecialSymbolsOffset = getResources().getDimensionPixelOffset(R$dimen.nx_security_numeric_keyboard_special_symbol_offset);
        }
        this.mSpecialKeyWidth = (int) (this.mSpecialKeyWidth * SecurityKeyboard.getDensityScale(getContext()));
        this.mSpecialKeyHeight = (int) (this.mSpecialKeyHeight * SecurityKeyboard.getDensityScale(getContext()));
        this.mLineWidth *= SecurityKeyboard.getDensityScale(getContext());
        this.mSpecialSymbolsOffset = (int) (this.mSpecialSymbolsOffset * SecurityKeyboard.getDensityScale(getContext()));
        initState();
    }

    public void setKeyboardViewEnabled(boolean z) {
        this.mIsEnable = z;
    }

    public void setNewShifted(int i) {
        SecurityKeyboard securityKeyboard = this.mKeyboard;
        if (securityKeyboard != null) {
            securityKeyboard.setNewShifted(i);
            invalidateAllKeys();
        }
    }

    public void setOnKeyboardActionListener(OnKeyboardActionListener onKeyboardActionListener) {
        this.mKeyboardActionListener = onKeyboardActionListener;
    }

    public void setOnKeyboardCharListener(OnKeyboardCharListener onKeyboardCharListener) {
        this.mKeyboardCharListener = onKeyboardCharListener;
    }

    public void setPopupOffset(int i, int i2) {
        this.mMiniKeyboardOffsetX = i;
        this.mMiniKeyboardOffsetY = i2;
        if (this.mPreviewPopup.isShowing()) {
            Log.d(TAG, "PopupView is Showing");
            this.mPreviewPopup.dismiss();
        }
    }

    public void setPopupParent(View view) {
        this.mPopupParent = view;
    }

    public void setPreviewEnabled(boolean z) {
        this.mShowPreview = z;
    }

    public void setProximityCorrectionEnabled(boolean z) {
        this.mProximityCorrectOn = z;
    }

    public boolean setShifted(boolean z) {
        SecurityKeyboard securityKeyboard = this.mKeyboard;
        if (securityKeyboard == null || !securityKeyboard.setShifted(z)) {
            return false;
        }
        invalidateAllKeys();
        return true;
    }

    public void setSpecialItemBg(Drawable drawable) {
        if (drawable != null) {
            this.mSpecialItemBg = drawable;
            initState();
            invalidate();
        }
    }

    public void setSpecialKeyBg(Drawable drawable) {
        if (drawable != null) {
            this.mSpecialKeyBg = drawable;
            invalidate();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mTextColor = colorStateList;
            invalidate();
        }
    }

    public void setVerticalCorrection(int i) {
    }

    public void swipeDown() {
        this.mKeyboardActionListener.swipeDown();
    }

    public void swipeLeft() {
        this.mKeyboardActionListener.swipeLeft();
    }

    public void swipeRight() {
        this.mKeyboardActionListener.swipeRight();
    }

    public void swipeUp() {
        this.mKeyboardActionListener.swipeUp();
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.NearSecurityKeyboardView);
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mCurrentKeyIndex = -1;
        this.mCoordinates = new int[2];
        this.mPreviewCentered = false;
        this.mShowPreview = true;
        this.mShowTouchPoints = true;
        this.mCurrentKey = -1;
        this.mDownKey = -1;
        this.mKeyIndices = new int[12];
        this.mRepeatKeyIndex = -1;
        this.mClipRegion = new Rect(0, 0, 0, 0);
        this.mSwipeTracker = new SwipeTracker();
        this.mOldPointerCount = 1;
        this.mDistances = new int[MAX_NEARBY_KEYS];
        this.mPreviewLabel = new StringBuilder(1);
        this.mDirtyRect = new Rect();
        this.mPrivateFlags = new ArrayList();
        this.mKeyBoardViewType = 0;
        this.mSpecialKeyBg = null;
        this.mEndKeyBg = null;
        this.mTypeface = null;
        this.mLowerLetterSize = 0;
        this.mNumberLetterSize = 0;
        this.mSpaceLabelSize = 0;
        this.mEndLabelSize = 0;
        this.mSymbolsLabelSize = 0;
        this.mSkipSymbolsLabelSize = 0;
        this.mIsEnable = true;
        this.mPreviousKey = -1;
        this.mIsDownFlag = false;
        this.mLineWidth = -1.0f;
        this.mSpecialKeyWidth = -1;
        this.mSpecialKeyHeight = -1;
        this.mSpecialSymbols = null;
        this.mTransUpSpecialSymbols = new ArrayList<>();
        this.mSpecialItemSize = -1;
        this.mBgTopOffset = 2;
        this.mPreviousIndex = -1;
        this.mItem = new ArrayList<>();
        this.mItemBg = new ArrayList<>();
        this.mIconState = new ArrayList();
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.mRefreshStyle = styleAttribute;
            if (styleAttribute == 0) {
                this.mRefreshStyle = i;
            }
        } else {
            this.mRefreshStyle = i;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SecurityKeyboardView, i, R$style.NearSecurityKeyboardView);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mKeyBackground = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSecurityKeyBackground);
        this.mVerticalCorrection = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SecurityKeyboardView_nxVerticalCorrection, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SecurityKeyboardView_nxKeyPreviewLayout, 0);
        this.mPreviewOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SecurityKeyboardView_nxKeyPreviewOffset, 0);
        this.mPreviewHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SecurityKeyboardView_nxKeyPreviewHeight, 80);
        this.mPreviewWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SecurityKeyboardView_nxKeyPreviewWidth, 80);
        this.mKeyTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SecurityKeyboardView_nxSecurityKeyTextSize, 18);
        this.mKeyTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.SecurityKeyboardView_nxSecurityKeyTextColor, -16777216);
        this.mLabelTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SecurityKeyboardView_nxLabelTextSize, 14);
        this.mPopupLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SecurityKeyboardView_nxPopupLayout, 0);
        this.mShadowColor = typedArrayObtainStyledAttributes.getColor(R$styleable.SecurityKeyboardView_nxShadowColor, 0);
        this.mShadowRadius = typedArrayObtainStyledAttributes.getFloat(R$styleable.SecurityKeyboardView_nxShadowRadius, 0.0f);
        this.mKeyBoardViewType = typedArrayObtainStyledAttributes.getInt(R$styleable.SecurityKeyboardView_nxKeyBoardType, 0);
        this.mTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxTextColor);
        this.mGoTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxGoTextColor);
        this.mSpecialKeyBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSpecialKeyBg);
        this.mEndKeyBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxEndKeyBg);
        this.mItemTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SecurityKeyboardView_nxItemSymbolsColor);
        this.mSpecialItemBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSpecialItemBg);
        this.mSpecialAllItemBg = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SecurityKeyboardView_nxSpecialAllItemBg);
        this.mBackgroundDimAmount = 0.5f;
        this.mPreviewPopup = new KeyboardPopupWindow(context);
        if (resourceId != 0) {
            TextView textView = (TextView) layoutInflater.inflate(resourceId, (ViewGroup) null);
            this.mPreviewText = textView;
            this.mPreviewTextSizeLarge = (int) textView.getTextSize();
            this.mPreviewPopup.setContentView(this.mPreviewText);
            this.mPreviewPopup.setBackgroundDrawable(null);
        } else {
            this.mShowPreview = false;
        }
        this.mPreviewPopup.setTouchable(false);
        this.mPreviewPopup.setOnPreInvokePopupListener(new KeyboardPopupWindow.OnPreInvokePopupListener() { // from class: com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.1
            @Override // com.heytap.nearx.uikit.widget.keyboard.KeyboardPopupWindow.OnPreInvokePopupListener
            public void onPreInvokePopup(WindowManager.LayoutParams layoutParams) {
                layoutParams.flags |= 8192;
                layoutParams.setTitle("nxSecurityPopupWindow");
            }
        });
        PopupWindow popupWindow = new PopupWindow(context);
        this.mPopupKeyboard = popupWindow;
        popupWindow.setBackgroundDrawable(null);
        this.mPopupKeyboard.setClippingEnabled(false);
        this.mPopupParent = this;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setTextSize(0);
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mPaint.setAlpha(255);
        this.mPaint.setFontFeatureSettings("'wght' 400");
        this.mPadding = new Rect(0, 0, 0, 0);
        this.mMiniKeyboardCache = new HashMap();
        Drawable drawable = this.mKeyBackground;
        if (drawable != null) {
            drawable.getPadding(this.mPadding);
        }
        this.mSwipeThreshold = (int) (getResources().getDisplayMetrics().density * 500.0f);
        this.mDisambiguateSwipe = true;
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        resetMultiTap();
        setKeyboardType(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public class Item {
        public Drawable itemBg;
        private float mBottom;
        private int mLeft;
        private int mRight;
        private TextPaint mSpecialTextPaint;
        private float mTop;
        public String text;

        public Item() {
            this.text = null;
            this.itemBg = null;
            this.mLeft = 0;
            this.mRight = 0;
            this.mTop = 0.0f;
            this.mBottom = 0.0f;
        }

        public float getBottom() {
            return this.mBottom;
        }

        public Drawable getItemBg() {
            Drawable drawable = this.itemBg;
            if (drawable != null) {
                return drawable;
            }
            return null;
        }

        public String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            return null;
        }

        public float getTop() {
            return this.mTop;
        }

        public void setBottom(float f) {
            this.mBottom = f;
        }

        public void setTop(float f) {
            this.mTop = f;
        }

        public Item(Drawable drawable, String str) {
            this.text = null;
            this.itemBg = null;
            this.mLeft = 0;
            this.mRight = 0;
            this.mTop = 0.0f;
            this.mBottom = 0.0f;
            TextPaint textPaint = new TextPaint(1);
            this.mSpecialTextPaint = textPaint;
            textPaint.setAntiAlias(true);
            this.mSpecialTextPaint.setTextSize(SecurityKeyboardView.this.mSpecialItemSize);
            this.mSpecialTextPaint.setTypeface(SecurityKeyboardView.this.mTypeface);
            this.text = str;
            this.itemBg = drawable;
        }
    }

    private void sendAccessibilityEventForUnicodeCharacter(int i, int i2, SecurityKeyboard.Key key) {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        onInitializeAccessibilityEvent(accessibilityEventObtain);
        CharSequence charSequence = key.label;
        String string = null;
        String string2 = charSequence == null ? null : adjustCase(charSequence).toString();
        if (i2 != -7) {
            if (i2 != -6) {
                if (i2 == -5) {
                    string = getContext().getString(R$string.nx_keyboardview_keycode_delete);
                } else if (i2 != -2) {
                    if (i2 != -1) {
                        if (i2 != 10) {
                            string = String.valueOf((char) i2);
                        } else {
                            string = getContext().getString(R$string.nx_keyboardview_keycode_enter);
                        }
                    } else if (getNewShifted() == 2) {
                        string = getContext().getString(R$string.nx_keyboard_view_keycode_low_shift);
                    } else if (getNewShifted() == 0) {
                        string = getContext().getString(R$string.nx_keyboardview_keycode_initialcapitalization);
                    } else if (getNewShifted() == 1) {
                        string = getContext().getString(R$string.nx_keyboardview_keycode_capslock);
                    }
                } else if (string2 != null && string2.equals("ABC")) {
                    string = getContext().getString(R$string.nx_keyboardview_keycode_letters);
                } else if (string2 != null && string2.equals("?#+")) {
                    string = getContext().getString(R$string.nx_keyboardview_keycode_symbol);
                }
            } else if (string2 != null && string2.equals("ABC")) {
                string = getContext().getString(R$string.nx_keyboardview_keycode_letters);
            } else if (string2 != null && string2.equals("123")) {
                string = getContext().getString(R$string.nx_keyboardview_keycode_number);
            }
        } else if (string2 != null && string2.equals("?#+")) {
            string = getContext().getString(R$string.nx_keyboardview_keycode_symbol);
        } else if (string2 != null && string2.equals("$¥€")) {
            string = getContext().getString(R$string.nx_keyboardview_keycode_moresymbols);
        }
        if (i2 != -5 && i2 != -2 && i2 != -1 && i2 != 10 && i2 != -6 && i2 != -7) {
            CharSequence charSequence2 = key.announceText;
            if (charSequence2 != null) {
                announceForAccessibility(charSequence2.toString());
                return;
            }
            CharSequence charSequence3 = key.label;
            if (charSequence3 != null) {
                announceForAccessibility(charSequence3.toString());
                return;
            } else {
                accessibilityEventObtain.getText().add(String.valueOf((char) i2));
                this.mAccessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                return;
            }
        }
        announceForAccessibility(string);
    }
}
