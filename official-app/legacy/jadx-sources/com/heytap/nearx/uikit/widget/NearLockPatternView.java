package com.heytap.nearx.uikit.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.ejc;
import com.oplus.aiunit.vision.qic;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.xvk;
import com.oplus.aiunit.vision.yhc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearLockPatternView extends View {
    public static final long ALPHA_DELAY = 166;
    public static final long ALPHA_DURATION = 167;
    public static final long ALPHA_OFFSET = 16;
    private static final int ASPECT_LOCK_HEIGHT = 2;
    private static final int ASPECT_LOCK_WIDTH = 1;
    private static final int ASPECT_SQUARE = 0;
    public static final boolean DEBUG_A11Y = false;
    private static final float DRAG_THRESHHOLD = 0.0f;
    private static final int FEEDBACK_MIN_SIZE = 1;
    private static final float MAX_ALPHA = 255.0f;
    private static final int MILLIS_PER_CIRCLE_ANIMATING = 700;
    private static final boolean PROFILE_DRAWING = false;
    private static final String TAG = "NearLockPatternView";
    public static final long TRANSLATE_Y_DURATION = 500;
    public static final long TRANSLATE_Y_OFFSET = 16;
    public static final int VIRTUAL_BASE_VIEW_ID = 1;
    private AccessibilityManager mAccessibilityManagerService;
    private Interpolator mAlphaInterpolator;
    private long mAnimatingPeriodStart;
    private final CellState[][] mCellStates;
    private Context mContext;
    private final Path mCurrentPath;
    private int mDefaultHeight;
    private int mDefaultWidth;
    private boolean mDrawingProfilingStarted;
    private boolean mEnableHapticFeedback;
    private int mErrorColor;
    private PatternExploreByTouchHelper mExploreByTouchHelper;
    private final Interpolator mFastOutSlowInInterpolator;
    private float mHitFactor;
    private float mInProgressX;
    private float mInProgressY;
    private boolean mInStealthMode;
    private Drawable mInnerDrawable;
    private boolean mInputEnabled;
    private final Rect mInvalidate;
    private boolean mIsLinearMotorVersion;
    private boolean mIsSetPassword;
    private int mMaxTranslateY;
    private OnPatternListener mOnPatternListener;
    private float mOuterCircleMaxAlpha;
    private Drawable mOuterDrawable;
    private final Paint mPaint;
    private float mPathAlpha;
    private final Paint mPathPaint;
    private final int mPathWidth;
    private final ArrayList<Cell> mPattern;
    private DisplayMode mPatternDisplayMode;
    private final boolean[][] mPatternDrawLookup;
    private boolean mPatternInProgress;
    private int mRegularColor;
    private float mSquareHeight;
    private float mSquareWidth;
    private int mStyle;
    private int mSuccessColor;
    private final Rect mTmpInvalidateRect;
    private Interpolator mTranslateYInterpolator;
    private AnimatorListenerAdapter mWongAnimatorListener;
    private ValueAnimator mWrongAnimator;

    public static final class Cell {
        private static final Cell[][] sCells = createCells();
        private final int column;
        private final int row;

        private Cell(int i, int i2) {
            checkRange(i, i2);
            this.row = i;
            this.column = i2;
        }

        private static void checkRange(int i, int i2) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("row must be in range 0-2");
            }
            if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("column must be in range 0-2");
            }
        }

        private static Cell[][] createCells() {
            Cell[][] cellArr = (Cell[][]) Array.newInstance((Class<?>) Cell.class, 3, 3);
            for (int i = 0; i < 3; i++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    cellArr[i][i2] = new Cell(i, i2);
                }
            }
            return cellArr;
        }

        public static Cell of(int i, int i2) {
            checkRange(i, i2);
            return sCells[i][i2];
        }

        public int getColumn() {
            return this.column;
        }

        public int getRow() {
            return this.row;
        }

        public String toString() {
            return "(row=" + this.row + ",clmn=" + this.column + ")";
        }
    }

    public static class CellState {
        float alpha;
        OnCellDrawListener cellDrawListener;
        int col;
        float innerCircleAlpha;
        float innerCircleScale;
        public ValueAnimator lineAnimator;
        public float lineEndX = Float.MIN_VALUE;
        public float lineEndY = Float.MIN_VALUE;
        boolean needDrawCircle;
        float outerCircleAlpha;
        float outerCircleScale;
        float radius;
        int row;
        float translationX;
        float translationY;

        public void setCellDrawListener(OnCellDrawListener onCellDrawListener) {
            this.cellDrawListener = onCellDrawListener;
        }

        public void setCellNumberAlpha(float f) {
            this.alpha = f;
            this.cellDrawListener.drawCell();
        }

        public void setCellNumberTranslateX(int i) {
            this.translationX = i;
            this.cellDrawListener.drawCell();
        }

        public void setCellNumberTranslateY(int i) {
            this.translationY = i;
            this.cellDrawListener.drawCell();
        }
    }

    public enum DisplayMode {
        Correct,
        Animate,
        Wrong,
        FingerprintMatch,
        FingerprintNoMatch
    }

    public interface OnCellDrawListener {
        void drawCell();
    }

    public interface OnPatternListener {
        void onPatternCellAdded(List<Cell> list);

        void onPatternCleared();

        void onPatternDetected(List<Cell> list);

        void onPatternStart();
    }

    public final class PatternExploreByTouchHelper extends ExploreByTouchHelper {
        private final SparseArray<VirtualViewContainer> mItems;
        private Rect mTempRect;

        public class VirtualViewContainer {
            CharSequence description;

            public VirtualViewContainer(CharSequence charSequence) {
                this.description = charSequence;
            }
        }

        public PatternExploreByTouchHelper(View view) {
            super(view);
            this.mTempRect = new Rect();
            this.mItems = new SparseArray<>();
            for (int i = 1; i < 10; i++) {
                this.mItems.put(i, new VirtualViewContainer(getTextForVirtualView(i)));
            }
        }

        private Rect getBoundsForVirtualView(int i) {
            int i2 = i - 1;
            Rect rect = this.mTempRect;
            int i3 = i2 / 3;
            float centerXForColumn = NearLockPatternView.this.getCenterXForColumn(i2 % 3);
            float centerYForRow = NearLockPatternView.this.getCenterYForRow(i3);
            float f = NearLockPatternView.this.mSquareHeight * NearLockPatternView.this.mHitFactor * 0.5f;
            float f2 = NearLockPatternView.this.mSquareWidth * NearLockPatternView.this.mHitFactor * 0.5f;
            rect.left = (int) (centerXForColumn - f2);
            rect.right = (int) (centerXForColumn + f2);
            rect.top = (int) (centerYForRow - f);
            rect.bottom = (int) (centerYForRow + f);
            return rect;
        }

        private CharSequence getTextForVirtualView(int i) {
            return NearLockPatternView.this.getResources().getString(R$string.lockscreen_access_pattern_cell_added_verbose, String.valueOf(i));
        }

        private int getVirtualViewIdForHit(float f, float f2) {
            int columnHit;
            int rowHit = NearLockPatternView.this.getRowHit(f2);
            if (rowHit < 0 || (columnHit = NearLockPatternView.this.getColumnHit(f)) < 0) {
                return Integer.MIN_VALUE;
            }
            boolean z = NearLockPatternView.this.mPatternDrawLookup[rowHit][columnHit];
            int i = (rowHit * 3) + columnHit + 1;
            if (z) {
                return i;
            }
            return Integer.MIN_VALUE;
        }

        private boolean isClickable(int i) {
            if (i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) {
                return false;
            }
            int i2 = i - 1;
            return !NearLockPatternView.this.mPatternDrawLookup[i2 / 3][i2 % 3];
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return getVirtualViewIdForHit(f, f2);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            if (NearLockPatternView.this.mPatternInProgress) {
                for (int i = 1; i < 10; i++) {
                    list.add(Integer.valueOf(i));
                }
            }
        }

        public boolean onItemClicked(int i) {
            invalidateVirtualView(i);
            sendEventForVirtualView(i, 1);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            return onItemClicked(i);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (NearLockPatternView.this.mPatternInProgress) {
                return;
            }
            accessibilityEvent.setContentDescription(NearLockPatternView.this.getContext().getText(R$string.lockscreen_access_pattern_area));
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            VirtualViewContainer virtualViewContainer = this.mItems.get(i);
            if (virtualViewContainer != null) {
                accessibilityEvent.getText().add(virtualViewContainer.description);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setText(getTextForVirtualView(i));
            accessibilityNodeInfoCompat.setContentDescription(getTextForVirtualView(i));
            if (NearLockPatternView.this.mPatternInProgress) {
                accessibilityNodeInfoCompat.setFocusable(true);
                if (isClickable(i)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    accessibilityNodeInfoCompat.setClickable(isClickable(i));
                }
            }
            accessibilityNodeInfoCompat.setBoundsInParent(getBoundsForVirtualView(i));
        }
    }

    public NearLockPatternView(Context context) {
        this(context, null);
    }

    private void addCellToPattern(Cell cell) {
        this.mPatternDrawLookup[cell.getRow()][cell.getColumn()] = true;
        this.mPattern.add(cell);
        if (!this.mInStealthMode) {
            startCellActivatedAnimation(cell);
        }
        notifyCellAdded();
    }

    private float calculateLastSegmentAlpha(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return Math.min(1.0f, Math.max(0.0f, ((((float) Math.sqrt((f5 * f5) + (f6 * f6))) / this.mSquareWidth) - 0.3f) * 4.0f));
    }

    private void cancelLineAnimations() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                CellState cellState = this.mCellStates[i][i2];
                ValueAnimator valueAnimator = cellState.lineAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cellState.lineEndX = Float.MIN_VALUE;
                    cellState.lineEndY = Float.MIN_VALUE;
                }
            }
        }
    }

    private Cell checkForNewHit(float f, float f2) {
        int columnHit;
        int rowHit = getRowHit(f2);
        if (rowHit >= 0 && (columnHit = getColumnHit(f)) >= 0 && !this.mPatternDrawLookup[rowHit][columnHit]) {
            return Cell.of(rowHit, columnHit);
        }
        return null;
    }

    private void clearPatternDrawLookup() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.mPatternDrawLookup[i][i2] = false;
            }
        }
    }

    private Cell detectAndAddHit(float f, float f2) {
        Cell cellCheckForNewHit = checkForNewHit(f, f2);
        Cell cellOf = null;
        if (cellCheckForNewHit == null) {
            return null;
        }
        ArrayList<Cell> arrayList = this.mPattern;
        if (!arrayList.isEmpty()) {
            Cell cell = arrayList.get(arrayList.size() - 1);
            int i = cellCheckForNewHit.row - cell.row;
            int i2 = cellCheckForNewHit.column - cell.column;
            int i3 = cell.row;
            int i4 = cell.column;
            if (Math.abs(i) == 2 && Math.abs(i2) != 1) {
                i3 = cell.row + (i > 0 ? 1 : -1);
            }
            if (Math.abs(i2) == 2 && Math.abs(i) != 1) {
                i4 = cell.column + (i2 <= 0 ? -1 : 1);
            }
            cellOf = Cell.of(i3, i4);
        }
        if (cellOf != null && !this.mPatternDrawLookup[cellOf.row][cellOf.column]) {
            addCellToPattern(cellOf);
        }
        addCellToPattern(cellCheckForNewHit);
        if (this.mEnableHapticFeedback) {
            performHitFeedback();
        }
        return cellCheckForNewHit;
    }

    private void drawCircle(Canvas canvas, float f, float f2, float f3, boolean z, float f4) {
        this.mPaint.setColor(this.mRegularColor);
        this.mPaint.setAlpha((int) (f4 * 255.0f));
        canvas.drawCircle(f, f2, f3, this.mPaint);
    }

    private void drawCircleDrawable(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        canvas.save();
        int intrinsicWidth = this.mInnerDrawable.getIntrinsicWidth();
        float f7 = intrinsicWidth / 2;
        int i = (int) (f - f7);
        int i2 = (int) (f2 - f7);
        canvas.scale(f3, f3, f, f2);
        this.mInnerDrawable.setTint(getCurrentColor(true));
        this.mInnerDrawable.setBounds(i, i2, i + intrinsicWidth, intrinsicWidth + i2);
        this.mInnerDrawable.setAlpha((int) (f4 * 255.0f));
        this.mInnerDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        int intrinsicWidth2 = this.mOuterDrawable.getIntrinsicWidth();
        float f8 = intrinsicWidth2 / 2;
        int i3 = (int) (f - f8);
        int i4 = (int) (f2 - f8);
        canvas.scale(f5, f5, f, f2);
        this.mOuterDrawable.setTint(getCurrentColor(true));
        this.mOuterDrawable.setBounds(i3, i4, i3 + intrinsicWidth2, intrinsicWidth2 + i4);
        this.mOuterDrawable.setAlpha((int) (f6 * 255.0f));
        this.mOuterDrawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCenterXForColumn(int i) {
        float paddingLeft = getPaddingLeft();
        float f = this.mSquareWidth;
        return paddingLeft + (i * f) + (f / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCenterYForRow(int i) {
        float paddingTop = getPaddingTop();
        float f = this.mSquareHeight;
        return paddingTop + (i * f) + (f / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getColumnHit(float f) {
        float f2 = this.mSquareWidth;
        float f3 = this.mHitFactor * f2;
        float paddingLeft = getPaddingLeft() + ((f2 - f3) / 2.0f);
        for (int i = 0; i < 3; i++) {
            float f4 = (i * f2) + paddingLeft;
            if (f >= f4 && f <= f4 + f3) {
                return i;
            }
        }
        return -1;
    }

    private int getCurrentColor(boolean z) {
        DisplayMode displayMode = this.mPatternDisplayMode;
        if (displayMode == DisplayMode.Wrong || displayMode == DisplayMode.FingerprintNoMatch) {
            return this.mErrorColor;
        }
        if (displayMode == DisplayMode.Correct || displayMode == DisplayMode.Animate || displayMode == DisplayMode.FingerprintMatch) {
            return this.mSuccessColor;
        }
        if (!z || this.mInStealthMode || this.mPatternInProgress) {
            return this.mRegularColor;
        }
        throw new IllegalStateException("unknown display mode " + this.mPatternDisplayMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRowHit(float f) {
        float f2 = this.mSquareHeight;
        float f3 = this.mHitFactor * f2;
        float paddingTop = getPaddingTop() + ((f2 - f3) / 2.0f);
        for (int i = 0; i < 3; i++) {
            float f4 = (i * f2) + paddingTop;
            if (f >= f4 && f <= f4 + f3) {
                return i;
            }
        }
        return -1;
    }

    private void handleActionDown(MotionEvent motionEvent) {
        this.mPathAlpha = 1.0f;
        resetPattern();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Cell cellDetectAndAddHit = detectAndAddHit(x, y);
        if (cellDetectAndAddHit != null) {
            setPatternInProgress(true);
            this.mPatternDisplayMode = DisplayMode.Correct;
            notifyPatternStarted();
        } else if (this.mPatternInProgress) {
            setPatternInProgress(false);
            notifyPatternCleared();
        }
        if (cellDetectAndAddHit != null) {
            float centerXForColumn = getCenterXForColumn(cellDetectAndAddHit.column);
            float centerYForRow = getCenterYForRow(cellDetectAndAddHit.row);
            float f = this.mSquareWidth / 2.0f;
            float f2 = this.mSquareHeight / 2.0f;
            invalidate((int) (centerXForColumn - f), (int) (centerYForRow - f2), (int) (centerXForColumn + f), (int) (centerYForRow + f2));
        }
        this.mInProgressX = x;
        this.mInProgressY = y;
    }

    private void handleActionMove(MotionEvent motionEvent) {
        float f = this.mPathWidth;
        int historySize = motionEvent.getHistorySize();
        this.mTmpInvalidateRect.setEmpty();
        int i = 0;
        boolean z = false;
        while (i < historySize + 1) {
            float historicalX = i < historySize ? motionEvent.getHistoricalX(i) : motionEvent.getX();
            float historicalY = i < historySize ? motionEvent.getHistoricalY(i) : motionEvent.getY();
            Cell cellDetectAndAddHit = detectAndAddHit(historicalX, historicalY);
            int size = this.mPattern.size();
            if (cellDetectAndAddHit != null && size == 1) {
                setPatternInProgress(true);
                notifyPatternStarted();
            }
            float fAbs = Math.abs(historicalX - this.mInProgressX);
            float fAbs2 = Math.abs(historicalY - this.mInProgressY);
            if (fAbs > 0.0f || fAbs2 > 0.0f) {
                z = true;
            }
            if (this.mPatternInProgress && size > 0) {
                Cell cell = this.mPattern.get(size - 1);
                float centerXForColumn = getCenterXForColumn(cell.column);
                float centerYForRow = getCenterYForRow(cell.row);
                float fMin = Math.min(centerXForColumn, historicalX) - f;
                float fMax = Math.max(centerXForColumn, historicalX) + f;
                float fMin2 = Math.min(centerYForRow, historicalY) - f;
                float fMax2 = Math.max(centerYForRow, historicalY) + f;
                if (cellDetectAndAddHit != null) {
                    float f2 = this.mSquareWidth * 0.5f;
                    float f3 = this.mSquareHeight * 0.5f;
                    float centerXForColumn2 = getCenterXForColumn(cellDetectAndAddHit.column);
                    float centerYForRow2 = getCenterYForRow(cellDetectAndAddHit.row);
                    fMin = Math.min(centerXForColumn2 - f2, fMin);
                    fMax = Math.max(centerXForColumn2 + f2, fMax);
                    fMin2 = Math.min(centerYForRow2 - f3, fMin2);
                    fMax2 = Math.max(centerYForRow2 + f3, fMax2);
                }
                this.mTmpInvalidateRect.union(Math.round(fMin), Math.round(fMin2), Math.round(fMax), Math.round(fMax2));
            }
            i++;
        }
        this.mInProgressX = motionEvent.getX();
        this.mInProgressY = motionEvent.getY();
        if (z) {
            this.mInvalidate.union(this.mTmpInvalidateRect);
            invalidate(this.mInvalidate);
            this.mInvalidate.set(this.mTmpInvalidateRect);
        }
    }

    private void handleActionUp() {
        if (this.mPattern.isEmpty()) {
            return;
        }
        setPatternInProgress(false);
        cancelLineAnimations();
        notifyPatternDetected();
        invalidate();
    }

    private void initCellAnim(CellState cellState, List<Animator> list, int i) {
        cellState.setCellNumberAlpha(0.0f);
        cellState.setCellNumberTranslateY(this.mMaxTranslateY);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cellState, "cellNumberAlpha", 0.0f, Color.alpha(this.mRegularColor) / 255.0f);
        long j2 = ((long) i) * 16;
        objectAnimatorOfFloat.setStartDelay(166 + j2);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(this.mAlphaInterpolator);
        list.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(cellState, "cellNumberTranslateY", this.mMaxTranslateY, 0);
        objectAnimatorOfInt.setStartDelay(j2);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(this.mTranslateYInterpolator);
        list.add(objectAnimatorOfInt);
    }

    private void notifyCellAdded() {
        OnPatternListener onPatternListener = this.mOnPatternListener;
        if (onPatternListener != null) {
            onPatternListener.onPatternCellAdded(this.mPattern);
        }
        this.mExploreByTouchHelper.invalidateRoot();
    }

    private void notifyPatternCleared() {
        sendAccessEvent(R$string.lockscreen_access_pattern_cleared);
        OnPatternListener onPatternListener = this.mOnPatternListener;
        if (onPatternListener != null) {
            onPatternListener.onPatternCleared();
        }
    }

    private void notifyPatternDetected() {
        sendAccessEvent(R$string.lockscreen_access_pattern_detected);
        OnPatternListener onPatternListener = this.mOnPatternListener;
        if (onPatternListener != null) {
            onPatternListener.onPatternDetected(this.mPattern);
        }
    }

    private void notifyPatternStarted() {
        sendAccessEvent(R$string.lockscreen_access_pattern_start);
        OnPatternListener onPatternListener = this.mOnPatternListener;
        if (onPatternListener != null) {
            onPatternListener.onPatternStart();
        }
    }

    private void performHitFeedback() {
        if (this.mIsLinearMotorVersion) {
            performHapticFeedback(302);
        } else {
            performHapticFeedback(1);
        }
    }

    private void performWrongModeFeedback() {
        if (this.mEnableHapticFeedback) {
            if (this.mIsLinearMotorVersion) {
                performHapticFeedback(304, 3);
            } else {
                performHapticFeedback(300, 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetPattern() {
        this.mPattern.clear();
        clearPatternDrawLookup();
        this.mPatternDisplayMode = DisplayMode.Correct;
        invalidate();
    }

    private int resolveMeasured(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 0 ? size : i2;
        }
        return Math.max(size, i2);
    }

    private void sendAccessEvent(int i) {
        announceForAccessibility(this.mContext.getString(i));
    }

    private void setPatternInProgress(boolean z) {
        this.mPatternInProgress = z;
        this.mExploreByTouchHelper.invalidateRoot();
    }

    private void startCellActivatedAnimation(Cell cell) {
        CellState cellState = this.mCellStates[cell.row][cell.column];
        startOuterAnimation(cellState);
        startInnerAnimation(cellState);
        startLineEndAnimation(cellState, this.mInProgressX, this.mInProgressY, getCenterXForColumn(cell.column), getCenterYForRow(cell.row));
    }

    private void startFingerprintNoMatchAnimator() {
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("pathAlpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.35f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.6f, 0.15f), Keyframe.ofFloat(0.8f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        valueAnimatorOfPropertyValuesHolder.setDuration(1000L);
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                for (int i = 0; i < 3; i++) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        CellState cellState = NearLockPatternView.this.mCellStates[i][i2];
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        cellState.innerCircleAlpha = fFloatValue;
                        cellState.needDrawCircle = fFloatValue <= 0.1f;
                    }
                }
                NearLockPatternView.this.invalidate();
            }
        });
        valueAnimatorOfPropertyValuesHolder.start();
    }

    private void startInnerAnimation(final CellState cellState) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new yhc());
        valueAnimatorOfFloat.setDuration(230L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                cellState.innerCircleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        valueAnimatorOfFloat.start();
    }

    private void startLineEndAnimation(final CellState cellState, final float f, final float f2, final float f3, final float f4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CellState cellState2 = cellState;
                float f5 = 1.0f - fFloatValue;
                cellState2.lineEndX = (f * f5) + (f3 * fFloatValue);
                cellState2.lineEndY = (f5 * f2) + (fFloatValue * f4);
                NearLockPatternView.this.invalidate();
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                cellState.lineAnimator = null;
            }
        });
        valueAnimatorOfFloat.setInterpolator(this.mFastOutSlowInInterpolator);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        cellState.lineAnimator = valueAnimatorOfFloat;
    }

    private void startOuterAnimation(final CellState cellState) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(460L);
        animatorSet.setInterpolator(new qic());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 7.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                cellState.outerCircleScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                NearLockPatternView.this.invalidate();
            }
        });
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, this.mOuterCircleMaxAlpha), Keyframe.ofFloat(1.0f, 0.0f)));
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                cellState.outerCircleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                NearLockPatternView.this.invalidate();
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfPropertyValuesHolder);
        animatorSet.start();
    }

    private void startWrongAnimator() {
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("pathAlpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.35f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.6f, 0.15f), Keyframe.ofFloat(0.8f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        this.mWrongAnimator = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setDuration(1000L);
        this.mWrongAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearLockPatternView.this.mPathAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (Cell cell : NearLockPatternView.this.mPattern) {
                    CellState cellState = NearLockPatternView.this.mCellStates[cell.row][cell.column];
                    cellState.innerCircleAlpha = NearLockPatternView.this.mPathAlpha;
                    cellState.needDrawCircle = NearLockPatternView.this.mPathAlpha <= 0.1f;
                }
                NearLockPatternView.this.invalidate();
            }
        });
        this.mWrongAnimator.start();
    }

    @Deprecated
    public void clearPattern(boolean z) {
    }

    public void disableInput() {
        this.mInputEnabled = false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.mExploreByTouchHelper.dispatchHoverEvent(motionEvent) | super.dispatchHoverEvent(motionEvent);
    }

    public void enableInput() {
        this.mInputEnabled = true;
    }

    public CellState[][] getCellStates() {
        return this.mCellStates;
    }

    public AnimatorSet getEnterAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                initCellAnim(this.mCellStates[i][i2], arrayList, (i * 3) + i2);
            }
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Deprecated
    public Animator getFailAnimator() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Deprecated
    public Animator getSuccessAnimator() {
        return ValueAnimator.ofInt(255, 0);
    }

    public boolean isInStealthMode() {
        return this.mInStealthMode;
    }

    public boolean isSetLockPassword() {
        return this.mIsSetPassword;
    }

    public boolean isTactileFeedbackEnabled() {
        return this.mEnableHapticFeedback;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mWrongAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.mWrongAnimator.removeAllListeners();
            this.mWrongAnimator = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        NearLockPatternView nearLockPatternView = this;
        ArrayList<Cell> arrayList = nearLockPatternView.mPattern;
        int size = arrayList.size();
        boolean[][] zArr = nearLockPatternView.mPatternDrawLookup;
        if (nearLockPatternView.mPatternDisplayMode == DisplayMode.Animate) {
            int iElapsedRealtime = ((int) (SystemClock.elapsedRealtime() - nearLockPatternView.mAnimatingPeriodStart)) % ((size + 1) * 700);
            int i = iElapsedRealtime / 700;
            clearPatternDrawLookup();
            for (int i2 = 0; i2 < i; i2++) {
                Cell cell = arrayList.get(i2);
                zArr[cell.getRow()][cell.getColumn()] = true;
            }
            if (i > 0 && i < size) {
                float f = (iElapsedRealtime % 700) / 700.0f;
                Cell cell2 = arrayList.get(i - 1);
                float centerXForColumn = nearLockPatternView.getCenterXForColumn(cell2.column);
                float centerYForRow = nearLockPatternView.getCenterYForRow(cell2.row);
                Cell cell3 = arrayList.get(i);
                float centerXForColumn2 = (nearLockPatternView.getCenterXForColumn(cell3.column) - centerXForColumn) * f;
                float centerYForRow2 = f * (nearLockPatternView.getCenterYForRow(cell3.row) - centerYForRow);
                nearLockPatternView.mInProgressX = centerXForColumn + centerXForColumn2;
                nearLockPatternView.mInProgressY = centerYForRow + centerYForRow2;
            }
            invalidate();
        }
        Path path = nearLockPatternView.mCurrentPath;
        path.rewind();
        if (!nearLockPatternView.mInStealthMode) {
            nearLockPatternView.mPathPaint.setColor(nearLockPatternView.getCurrentColor(true));
            nearLockPatternView.mPathPaint.setAlpha((int) (nearLockPatternView.mPathAlpha * 255.0f));
            float centerXForColumn3 = 0.0f;
            float centerYForRow3 = 0.0f;
            int i3 = 0;
            boolean z = false;
            while (i3 < size) {
                Cell cell4 = arrayList.get(i3);
                if (!zArr[cell4.row][cell4.column]) {
                    break;
                }
                centerXForColumn3 = nearLockPatternView.getCenterXForColumn(cell4.column);
                centerYForRow3 = nearLockPatternView.getCenterYForRow(cell4.row);
                if (i3 == 0) {
                    path.rewind();
                    path.moveTo(centerXForColumn3, centerYForRow3);
                }
                if (i3 != 0) {
                    CellState cellState = nearLockPatternView.mCellStates[cell4.row][cell4.column];
                    float f2 = cellState.lineEndX;
                    if (f2 != Float.MIN_VALUE) {
                        float f3 = cellState.lineEndY;
                        if (f3 != Float.MIN_VALUE) {
                            path.lineTo(f2, f3);
                        } else {
                            path.lineTo(centerXForColumn3, centerYForRow3);
                        }
                    } else {
                        path.lineTo(centerXForColumn3, centerYForRow3);
                    }
                }
                i3++;
                z = true;
            }
            if ((nearLockPatternView.mPatternInProgress || nearLockPatternView.mPatternDisplayMode == DisplayMode.Animate) && z) {
                path.moveTo(centerXForColumn3, centerYForRow3);
                path.lineTo(nearLockPatternView.mInProgressX, nearLockPatternView.mInProgressY);
            }
            canvas.drawPath(path, nearLockPatternView.mPathPaint);
        }
        int i4 = 0;
        while (true) {
            int i5 = 3;
            if (i4 >= 3) {
                return;
            }
            float centerYForRow4 = nearLockPatternView.getCenterYForRow(i4);
            int i6 = 0;
            while (i6 < i5) {
                CellState cellState2 = nearLockPatternView.mCellStates[i4][i6];
                float centerXForColumn4 = nearLockPatternView.getCenterXForColumn(i6);
                float f4 = cellState2.translationY;
                float f5 = cellState2.translationX;
                boolean z2 = zArr[i4][i6];
                if (z2 || nearLockPatternView.mPatternDisplayMode == DisplayMode.FingerprintNoMatch) {
                    drawCircleDrawable(canvas, ((int) centerXForColumn4) + f5, ((int) centerYForRow4) + f4, cellState2.innerCircleScale, cellState2.innerCircleAlpha, cellState2.outerCircleScale, cellState2.outerCircleAlpha);
                }
                if (cellState2.needDrawCircle) {
                    drawCircle(canvas, ((int) centerXForColumn4) + f5, ((int) centerYForRow4) + f4, cellState2.radius, z2, cellState2.alpha);
                }
                i6++;
                i5 = 3;
                nearLockPatternView = this;
            }
            i4++;
            nearLockPatternView = this;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.mAccessibilityManagerService.isTouchExplorationEnabled()) {
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

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = this.mDefaultWidth;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = this.mDefaultHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setPattern(DisplayMode.Correct, ejc.b(savedState.getSerializedPattern()));
        this.mPatternDisplayMode = DisplayMode.values()[savedState.getDisplayMode()];
        this.mInputEnabled = savedState.isInputEnabled();
        this.mInStealthMode = savedState.isInStealthMode();
        this.mEnableHapticFeedback = savedState.isTactileFeedbackEnabled();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), ejc.a(this.mPattern), this.mPatternDisplayMode.ordinal(), this.mInputEnabled, this.mInStealthMode, this.mEnableHapticFeedback);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.mSquareWidth = ((i - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.mSquareHeight = ((i2 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
        this.mExploreByTouchHelper.invalidateRoot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mInputEnabled || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = this.mWrongAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mWrongAnimator.end();
            }
            handleActionDown(motionEvent);
            return true;
        }
        if (action == 1) {
            handleActionUp();
            return true;
        }
        if (action == 2) {
            handleActionMove(motionEvent);
            return true;
        }
        if (action != 3) {
            return false;
        }
        if (this.mPatternInProgress) {
            setPatternInProgress(false);
            resetPattern();
            notifyPatternCleared();
        }
        return true;
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearLockPatternView, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearLockPatternView, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mRegularColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxRegularColor, 0);
            this.mErrorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxErrorColor, 0);
            this.mSuccessColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxSuccessColor, 0);
            this.mPathPaint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxPathColor, this.mRegularColor));
            this.mOuterCircleMaxAlpha = typedArrayObtainStyledAttributes.getFloat(R$styleable.NearLockPatternView_nxOuterCircleMaxAlpha, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.mPatternDisplayMode = displayMode;
        if (displayMode == DisplayMode.Animate) {
            if (this.mPattern.size() == 0) {
                throw new IllegalStateException("you must have a pattern to animate if you want to set the display mode to animate");
            }
            this.mAnimatingPeriodStart = SystemClock.elapsedRealtime();
            Cell cell = this.mPattern.get(0);
            this.mInProgressX = getCenterXForColumn(cell.getColumn());
            this.mInProgressY = getCenterYForRow(cell.getRow());
            clearPatternDrawLookup();
        }
        if (displayMode == DisplayMode.Wrong) {
            if (this.mPattern.size() > 1) {
                performWrongModeFeedback();
            }
            startWrongAnimator();
        }
        if (displayMode == DisplayMode.FingerprintNoMatch) {
            startFingerprintNoMatchAnimator();
        }
        invalidate();
    }

    public void setErrorColor(int i) {
        this.mErrorColor = i;
    }

    public void setInStealthMode(boolean z) {
        this.mInStealthMode = z;
    }

    public void setLockPassword(boolean z) {
        this.mIsSetPassword = z;
    }

    public void setOnPatternListener(OnPatternListener onPatternListener) {
        this.mOnPatternListener = onPatternListener;
    }

    public void setOuterCircleMaxAlpha(int i) {
        this.mOuterCircleMaxAlpha = i;
    }

    public void setPathColor(int i) {
        this.mPathPaint.setColor(i);
    }

    public void setPattern(DisplayMode displayMode, List<Cell> list) {
        this.mPattern.clear();
        this.mPattern.addAll(list);
        clearPatternDrawLookup();
        for (Cell cell : list) {
            this.mPatternDrawLookup[cell.getRow()][cell.getColumn()] = true;
        }
        setDisplayMode(displayMode);
    }

    public void setRegularColor(int i) {
        this.mRegularColor = i;
    }

    public void setSuccessColor(int i) {
        this.mSuccessColor = i;
    }

    @Deprecated
    public void setSuccessFinger() {
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.mEnableHapticFeedback = z;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private final int mDisplayMode;
        private final boolean mInStealthMode;
        private final boolean mInputEnabled;
        private final String mSerializedPattern;
        private final boolean mTactileFeedbackEnabled;

        public int getDisplayMode() {
            return this.mDisplayMode;
        }

        public String getSerializedPattern() {
            return this.mSerializedPattern;
        }

        public boolean isInStealthMode() {
            return this.mInStealthMode;
        }

        public boolean isInputEnabled() {
            return this.mInputEnabled;
        }

        public boolean isTactileFeedbackEnabled() {
            return this.mTactileFeedbackEnabled;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mSerializedPattern);
            parcel.writeInt(this.mDisplayMode);
            parcel.writeValue(Boolean.valueOf(this.mInputEnabled));
            parcel.writeValue(Boolean.valueOf(this.mInStealthMode));
            parcel.writeValue(Boolean.valueOf(this.mTactileFeedbackEnabled));
        }

        private SavedState(Parcelable parcelable, String str, int i, boolean z, boolean z2, boolean z3) {
            super(parcelable);
            this.mSerializedPattern = str;
            this.mDisplayMode = i;
            this.mInputEnabled = z;
            this.mInStealthMode = z2;
            this.mTactileFeedbackEnabled = z3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mSerializedPattern = parcel.readString();
            this.mDisplayMode = parcel.readInt();
            this.mInputEnabled = ((Boolean) parcel.readValue(null)).booleanValue();
            this.mInStealthMode = ((Boolean) parcel.readValue(null)).booleanValue();
            this.mTactileFeedbackEnabled = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public NearLockPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPathAlpha = 1.0f;
        this.mDrawingProfilingStarted = false;
        Paint paint = new Paint();
        this.mPaint = paint;
        Paint paint2 = new Paint();
        this.mPathPaint = paint2;
        this.mPattern = new ArrayList<>(9);
        this.mPatternDrawLookup = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
        this.mInProgressX = -1.0f;
        this.mInProgressY = -1.0f;
        this.mPatternDisplayMode = DisplayMode.Correct;
        this.mInputEnabled = true;
        this.mInStealthMode = false;
        this.mEnableHapticFeedback = true;
        this.mPatternInProgress = false;
        this.mHitFactor = 0.6f;
        this.mCurrentPath = new Path();
        this.mInvalidate = new Rect();
        this.mTmpInvalidateRect = new Rect();
        this.mIsSetPassword = false;
        this.mAlphaInterpolator = new yhc();
        this.mTranslateYInterpolator = new qic();
        this.mWongAnimatorListener = new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearLockPatternView.this.resetPattern();
                if (NearLockPatternView.this.mWrongAnimator != null) {
                    NearLockPatternView.this.mWrongAnimator.removeAllListeners();
                }
            }
        };
        if (attributeSet == null || attributeSet.getStyleAttribute() == 0) {
            this.mStyle = R$attr.nxLockPatternViewStyle;
        } else {
            this.mStyle = attributeSet.getStyleAttribute();
        }
        this.mContext = context;
        vhc.b(this, false);
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLockPatternView, R$attr.nxLockPatternViewStyle, 0);
        setClickable(true);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.mRegularColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxRegularColor, 0);
        this.mErrorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxErrorColor, 0);
        this.mSuccessColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxSuccessColor, 0);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearLockPatternView_nxPathColor, this.mRegularColor));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.lock_pattern_dot_line_width);
        this.mPathWidth = dimensionPixelSize;
        paint2.setStrokeWidth(dimensionPixelSize);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.lock_pattern_dot_size);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.mMaxTranslateY = getResources().getDimensionPixelSize(R$dimen.color_lock_pattern_view_max_translate_y);
        this.mCellStates = (CellState[][]) Array.newInstance((Class<?>) CellState.class, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.mCellStates[i][i2] = new CellState();
                CellState cellState = this.mCellStates[i][i2];
                cellState.radius = dimensionPixelSize2 / 2;
                cellState.row = i;
                cellState.col = i2;
                cellState.alpha = Color.alpha(this.mRegularColor) / 255.0f;
                CellState cellState2 = this.mCellStates[i][i2];
                cellState2.innerCircleAlpha = 0.0f;
                cellState2.innerCircleScale = 1.0f;
                cellState2.outerCircleAlpha = 0.0f;
                cellState2.outerCircleScale = 1.0f;
                cellState2.needDrawCircle = true;
                cellState2.setCellDrawListener(new OnCellDrawListener() { // from class: com.heytap.nearx.uikit.widget.NearLockPatternView.1
                    @Override // com.heytap.nearx.uikit.widget.NearLockPatternView.OnCellDrawListener
                    public void drawCell() {
                        NearLockPatternView.this.invalidate();
                    }
                });
            }
        }
        this.mInnerDrawable = getResources().getDrawable(R$drawable.coui_lock_pattern_inner_circle);
        this.mOuterDrawable = getResources().getDrawable(R$drawable.coui_lock_pattern_outer_circle);
        this.mDefaultWidth = getResources().getDimensionPixelSize(R$dimen.nx_lock_pattern_view_width);
        this.mDefaultHeight = getResources().getDimensionPixelSize(R$dimen.nx_lock_pattern_view_height);
        this.mOuterCircleMaxAlpha = typedArrayObtainStyledAttributes.getFloat(R$styleable.NearLockPatternView_nxOuterCircleMaxAlpha, 0.0f);
        this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
        PatternExploreByTouchHelper patternExploreByTouchHelper = new PatternExploreByTouchHelper(this);
        this.mExploreByTouchHelper = patternExploreByTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, patternExploreByTouchHelper);
        this.mAccessibilityManagerService = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        typedArrayObtainStyledAttributes.recycle();
        this.mIsLinearMotorVersion = xvk.c(context);
    }

    public void clearPattern() {
        ValueAnimator valueAnimator = this.mWrongAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            resetPattern();
        } else {
            this.mWrongAnimator.addListener(this.mWongAnimatorListener);
        }
    }
}
