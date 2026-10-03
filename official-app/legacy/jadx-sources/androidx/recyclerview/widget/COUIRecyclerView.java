package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.ji2;
import com.oplus.aiunit.vision.ki2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.m0l;
import com.oplus.aiunit.vision.ri2;
import com.oplus.aiunit.vision.rki;
import com.oplus.aiunit.vision.uj2;
import com.oplus.aiunit.vision.uk2;
import com.oplus.aiunit.vision.xi2;
import com.oplus.aiunit.vision.yh2;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.recyclerview.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class COUIRecyclerView extends RecyclerView implements uk2.c {
    public static final int CENTER_ALIGN = 2;
    private static final boolean COUI_DEBUG;
    private static final int CUSTOM_TOUCH_SLOP = 2;
    private static final int DEBUG_PAINT_TEXT_OFFSET_Y = 50;
    private static final int DEBUG_PAINT_TEXT_SIZE = 30;
    private static final float DEFAULT_INTERACTING_NESTED_SCROLL_ANGLE = 20.0f;
    private static final int DEFAULT_INTERACTING_NESTED_SCROLL_VELOCITY_THRESHOLD = 2500;
    private static final double DEGREE_TO_ARC_CONSTANT = 0.017453292519943295d;
    private static final int FLING_SCROLL_THRESHOLD = 1000;
    private static final int FLING_SCROLL_THRESHOLD_WHILE_OVER_SCROLLING = 6000;
    private static final float HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE = 3.2f;
    private static final int INVALID_POINTER = -1;
    private static final int OVER_SCROLL_TOUCH_DURATION_THRESHOLD;
    private static final int OVER_SCROLL_TOUCH_OFFSET_THRESHOLD = 10;
    private static final int SLOW_SCROLL_THRESHOLD = 2500;
    public static final int START_ALIGN = 1;
    static final String TAG = "COUIRecyclerView";
    private static final float VERTICAL_SPRING_BACK_TENSION_MULTIPLE = 2.15f;
    final int FLING;
    final int OVER_FLING;
    final int OVER_SCROLLING;
    private final int SCROLLBARS_NONE;
    private final int SCROLLBARS_VERTICAL;
    final int SCROLLING;
    private float mAbortVelocityX;
    private float mAbortVelocityY;
    private boolean mAvoidAccidentalTouch;
    private xi2 mCOUILocateOverScroller;
    private COUIRecyclerDividerManager mCOUIRecyclerDividerManager;
    private uk2 mCOUIScrollBar;
    private float mClickVelocityX;
    private float mClickVelocityY;
    private float mDebugAbortVelocityX;
    private float mDebugAbortVelocityY;
    private Paint mDebugPaint;
    private int mDispatchEventVelocityThreshold;
    private boolean mEnableDispatchEventWhileOverScrolling;
    private boolean mEnableDispatchEventWhileScrolling;
    private boolean mEnableFlingSpeedIncrease;
    private boolean mEnableOptimizedScroll;
    private boolean mEnablePointerDown;
    private boolean mEnableVibrator;
    private float mEventFilterAngle;
    private float mFastFlingVelocity;
    private boolean mFixScrollTypeForOverScrolling;
    private float mFlingRatio;
    private float mFlingVelocityX;
    private float mFlingVelocityY;
    private ji2 mGradualStopHelper;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    private boolean mIsOverScrollingReverseFling;
    private boolean mIsTouchDownWhileOverScrolling;
    private boolean mIsTouchDownWhileSlowScrolling;
    private boolean mIsUseNativeOverScroll;
    private boolean mItemClickableWhileOverScrolling;
    private boolean mItemClickableWhileSlowScrolling;
    private int mLastTouchX;
    private int mLastTouchY;
    private yh2 mLocateHelper;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mNestedOffsets;
    private RecyclerView.OnFlingListener mOnFlingListener;
    private ArrayList<RecyclerView.OnItemTouchListener> mOnItemTouchListeners;
    boolean mOverScrollEnable;
    private ri2 mOverScroller;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private int mScreenHeight;
    private int mScreenWidth;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private int mScrollType;
    private Drawable mScrollbarThumbVertical;
    private int mScrollbars;
    private int mScrollbarsSize;
    private int mSlowScrollThreshold;
    private boolean mSmoothScrollFlag;
    private rki mSpringOverScroller;
    private int mStyle;
    private int mTouchSlop;
    private long mTouchTime;
    private VelocityTracker mVelocityTracker;
    private float mVerticalSpringOverTension;
    private ViewFlinger mViewFlinger;

    public static class COUIDividerItemDecoration extends RecyclerView.ItemDecoration {
        private Drawable mDivider;
        private int mDividerColor;
        private int mDividerStrokeWidth;
        private int mOriginAlpha;
        private Paint mPaint;
        private int mPressDividerAlpha;
        private int mPressDividerPos;
        private int mPrevTop;

        public COUIDividerItemDecoration(Context context) {
            init(context);
        }

        private void init(Context context) {
            this.mDividerColor = lh2.a(context, R$attr.couiColorDivider);
            this.mDividerStrokeWidth = context.getResources().getDimensionPixelOffset(R$dimen.coui_list_divider_height);
            Paint paint = new Paint(1);
            this.mPaint = paint;
            paint.setColor(this.mDividerColor);
            int alpha = this.mPaint.getAlpha();
            this.mOriginAlpha = alpha;
            this.mPressDividerAlpha = alpha;
        }

        public void drawDividerOuterBackground(Canvas canvas, RecyclerView recyclerView, View view) {
        }

        public void drawExpandableDivider(Canvas canvas, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            boolean z = view.getLayoutDirection() == 1;
            int measuredHeight = view.getMeasuredHeight() - Math.max(1, this.mDividerStrokeWidth);
            int measuredHeight2 = view.getMeasuredHeight();
            int x = (int) (view.getX() + (z ? getDividerInsetEnd(viewHolder) : getDividerInsetStart(viewHolder)));
            int x2 = (int) ((view.getX() + view.getWidth()) - (z ? getDividerInsetStart(viewHolder) : getDividerInsetEnd(viewHolder)));
            Drawable drawable = this.mDivider;
            if (drawable == null) {
                canvas.drawRect(x, measuredHeight, x2, measuredHeight2, this.mPaint);
            } else {
                drawable.setBounds(x, measuredHeight, x2, measuredHeight2);
                this.mDivider.draw(canvas);
            }
        }

        public Drawable getDivider() {
            return this.mDivider;
        }

        public int getDividerColor() {
            return this.mDividerColor;
        }

        public int getDividerInsetEnd(RecyclerView.ViewHolder viewHolder) {
            return 0;
        }

        public int getDividerInsetStart(RecyclerView.ViewHolder viewHolder) {
            return 0;
        }

        public int getDividerStrokeWidth() {
            return this.mDividerStrokeWidth;
        }

        public Paint getPaint() {
            return this.mPaint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            int childCount = recyclerView.getChildCount();
            this.mPrevTop = -1;
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (shouldDrawDivider(recyclerView, i)) {
                    drawDividerOuterBackground(canvas, recyclerView, childAt);
                    boolean z = childAt.getLayoutDirection() == 1;
                    int y = (int) (childAt.getY() + childAt.getHeight());
                    if (this.mPrevTop != y) {
                        this.mPrevTop = y;
                        int iMax = Math.max(1, this.mDividerStrokeWidth) + y;
                        int x = (int) (childAt.getX() + (z ? getDividerInsetEnd(recyclerView, i) : getDividerInsetStart(recyclerView, i)));
                        int x2 = (int) ((childAt.getX() + childAt.getWidth()) - (z ? getDividerInsetStart(recyclerView, i) : getDividerInsetEnd(recyclerView, i)));
                        int i2 = this.mPressDividerPos;
                        int i3 = (i2 == i || i2 + (-1) == i) ? this.mPressDividerAlpha : this.mOriginAlpha;
                        Drawable drawable = this.mDivider;
                        if (drawable == null) {
                            this.mPaint.setAlpha(i3);
                            canvas.drawRect(x, y, x2, iMax, this.mPaint);
                        } else {
                            drawable.setAlpha(i3);
                            this.mDivider.setBounds(x, y, x2, iMax);
                            this.mDivider.draw(canvas);
                        }
                    }
                }
                i++;
            }
        }

        public void setDivider(RecyclerView recyclerView, Drawable drawable) {
            this.mDivider = drawable;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }

        public void setDividerColor(RecyclerView recyclerView, int i) {
            this.mDividerColor = i;
            this.mPaint.setColor(i);
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }

        public void setDividerStrokeWidth(RecyclerView recyclerView, int i) {
            this.mDividerStrokeWidth = i;
            this.mPaint.setStrokeWidth(i);
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }

        public void setPressDividerAlpha(int i) {
            this.mPressDividerAlpha = i;
        }

        public void setPressDividerPos(int i) {
            this.mPressDividerPos = i;
        }

        public boolean shouldDrawDivider(RecyclerView recyclerView, int i) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            return adapter == null || adapter.getItemCount() - 1 != i;
        }

        public int getDividerInsetEnd(RecyclerView recyclerView, int i) {
            return 0;
        }

        public int getDividerInsetStart(RecyclerView recyclerView, int i) {
            return 0;
        }
    }

    public interface ICOUIDividerDecorationInterface {
        default boolean drawDivider() {
            return false;
        }

        default View getDividerEndAlignView() {
            return null;
        }

        default int getDividerEndInset() {
            return 0;
        }

        default View getDividerStartAlignView() {
            return null;
        }

        default int getDividerStartInset() {
            return 0;
        }
    }

    public class ViewFlinger implements Runnable {
        private int mLastFlingX;
        private int mLastFlingY;
        Interpolator mInterpolator = RecyclerView.sQuinticInterpolator;
        private boolean mEatRunOnAnimationRequest = false;
        private boolean mReSchedulePostAnimationCallback = false;

        public ViewFlinger() {
        }

        private int computeScrollDuration(int i, int i2, int i3, int i4) {
            int iRound;
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            COUIRecyclerView cOUIRecyclerView = COUIRecyclerView.this;
            int width = z ? cOUIRecyclerView.getWidth() : cOUIRecyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fDistanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (iSqrt2 * 1.0f) / f)) * f2);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float distanceInfluenceForSnapDuration(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        private void internalPostOnAnimation() {
            COUIRecyclerView.this.removeCallbacks(this);
            ViewCompat.postOnAnimation(COUIRecyclerView.this, this);
        }

        public void fling(int i, int i2) {
            COUIRecyclerView.this.mFlingVelocityX = i;
            COUIRecyclerView.this.mFlingVelocityY = i2;
            COUIRecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            Interpolator interpolator = this.mInterpolator;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.mInterpolator = interpolator2;
                if (COUIRecyclerView.this.mOverScroller != null) {
                    COUIRecyclerView.this.mOverScroller.setInterpolator(interpolator2);
                }
            }
            if (COUIRecyclerView.this.mOverScroller != null) {
                COUIRecyclerView.this.mOverScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                COUIRecyclerView.this.mOverScroller.setFinalX(COUIRecyclerView.this.mLocateHelper.k(COUIRecyclerView.this.mOverScroller.c()));
            }
            postOnAnimation();
        }

        public void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            } else {
                internalPostOnAnimation();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            COUIRecyclerView cOUIRecyclerView = COUIRecyclerView.this;
            if (cOUIRecyclerView.mLayout == null) {
                stop();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            cOUIRecyclerView.consumePendingUpdateOperations();
            ri2 ri2Var = COUIRecyclerView.this.mOverScroller;
            if (ri2Var != null && ri2Var.computeScrollOffset()) {
                int iA = ri2Var.a();
                int iD = ri2Var.d();
                int i4 = iA - this.mLastFlingX;
                int i5 = iD - this.mLastFlingY;
                this.mLastFlingX = iA;
                this.mLastFlingY = iD;
                COUIRecyclerView cOUIRecyclerView2 = COUIRecyclerView.this;
                int[] iArr = cOUIRecyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (cOUIRecyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = COUIRecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                COUIRecyclerView cOUIRecyclerView3 = COUIRecyclerView.this;
                if (cOUIRecyclerView3.mAdapter != null) {
                    int[] iArr3 = cOUIRecyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    cOUIRecyclerView3.scrollStep(i4, i5, iArr3);
                    COUIRecyclerView cOUIRecyclerView4 = COUIRecyclerView.this;
                    int[] iArr4 = cOUIRecyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    RecyclerView.SmoothScroller smoothScroller = cOUIRecyclerView4.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = COUIRecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.onAnimation(i2, i);
                        } else {
                            smoothScroller.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!COUIRecyclerView.this.mItemDecorations.isEmpty()) {
                    COUIRecyclerView.this.invalidate();
                }
                COUIRecyclerView cOUIRecyclerView5 = COUIRecyclerView.this;
                int[] iArr5 = cOUIRecyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                cOUIRecyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                COUIRecyclerView cOUIRecyclerView6 = COUIRecyclerView.this;
                int[] iArr6 = cOUIRecyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    cOUIRecyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!COUIRecyclerView.this.mSmoothScrollFlag || (i6 == 0 && i7 == 0)) {
                    i3 = i7;
                } else {
                    ri2Var.abortAnimation();
                    COUIRecyclerView.this.mSmoothScrollFlag = false;
                    i3 = 0;
                    i6 = 0;
                }
                if (i3 != 0) {
                    COUIRecyclerView cOUIRecyclerView7 = COUIRecyclerView.this;
                    if (cOUIRecyclerView7.mOverScrollEnable) {
                        cOUIRecyclerView7.mScrollType = 3;
                        COUIRecyclerView.this.performFeedback();
                        COUIRecyclerView cOUIRecyclerView8 = COUIRecyclerView.this;
                        cOUIRecyclerView8.overScrollBy(0, i3, 0, cOUIRecyclerView8.getScrollY(), 0, 0, 0, COUIRecyclerView.this.mOverflingDistance, false);
                        if (COUIRecyclerView.this.mIsUseNativeOverScroll) {
                            if (COUIRecyclerView.this.mSpringOverScroller != null) {
                                COUIRecyclerView.this.mSpringOverScroller.setCurrVelocityY(ri2Var.getCurrVelocityY());
                                COUIRecyclerView.this.mSpringOverScroller.notifyVerticalEdgeReached(i3, 0, COUIRecyclerView.this.mOverflingDistance);
                            }
                        } else if (COUIRecyclerView.this.mOverScroller != null) {
                            COUIRecyclerView.this.mOverScroller.notifyVerticalEdgeReached(i3, 0, COUIRecyclerView.this.mOverflingDistance);
                        }
                    }
                }
                if (i6 != 0) {
                    COUIRecyclerView cOUIRecyclerView9 = COUIRecyclerView.this;
                    if (cOUIRecyclerView9.mOverScrollEnable) {
                        cOUIRecyclerView9.mScrollType = 3;
                        COUIRecyclerView.this.performFeedback();
                        COUIRecyclerView cOUIRecyclerView10 = COUIRecyclerView.this;
                        cOUIRecyclerView10.overScrollBy(i6, 0, cOUIRecyclerView10.getScrollX(), 0, 0, 0, COUIRecyclerView.this.mOverflingDistance, 0, false);
                        if (COUIRecyclerView.this.mIsUseNativeOverScroll) {
                            if (COUIRecyclerView.this.mSpringOverScroller != null) {
                                COUIRecyclerView.this.mSpringOverScroller.setCurrVelocityX(ri2Var.getCurrVelocityX());
                                COUIRecyclerView.this.mSpringOverScroller.notifyHorizontalEdgeReached(i6, 0, COUIRecyclerView.this.mOverflingDistance);
                            }
                        } else if (COUIRecyclerView.this.mOverScroller != null) {
                            COUIRecyclerView.this.mOverScroller.notifyHorizontalEdgeReached(i6, 0, COUIRecyclerView.this.mOverflingDistance);
                        }
                    }
                }
                if (!COUIRecyclerView.this.awakenScrollBars()) {
                    COUIRecyclerView.this.invalidate();
                }
                boolean z = ri2Var.e() || (((ri2Var.a() == ri2Var.c()) || i6 != 0) && ((ri2Var.d() == ri2Var.b()) || i3 != 0));
                RecyclerView.SmoothScroller smoothScroller2 = COUIRecyclerView.this.mLayout.mSmoothScroller;
                if ((smoothScroller2 != null && smoothScroller2.isPendingInitialRun()) || !z) {
                    postOnAnimation();
                    COUIRecyclerView cOUIRecyclerView11 = COUIRecyclerView.this;
                    GapWorker gapWorker = cOUIRecyclerView11.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(cOUIRecyclerView11, i2, i);
                    }
                } else if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    COUIRecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
                }
            }
            RecyclerView.SmoothScroller smoothScroller3 = COUIRecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                internalPostOnAnimation();
            } else {
                if (COUIRecyclerView.this.mScrollType == 3 && COUIRecyclerView.this.mOverScrollEnable) {
                    return;
                }
                COUIRecyclerView.this.setScrollState(0);
                COUIRecyclerView.this.stopNestedScroll(1);
            }
        }

        public void smoothScrollBy(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = computeScrollDuration(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                if (COUIRecyclerView.this.mOverScroller != null) {
                    COUIRecyclerView.this.mOverScroller.setInterpolator(interpolator);
                }
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            COUIRecyclerView.this.setScrollState(2);
            if (COUIRecyclerView.this.mOverScroller != null) {
                COUIRecyclerView.this.mOverScroller.startScroll(0, 0, i, i2, i4);
            }
            postOnAnimation();
        }

        public boolean springBackToCenter() {
            rki rkiVar = COUIRecyclerView.this.mSpringOverScroller;
            boolean zE = false;
            if (rkiVar instanceof ki2) {
                this.mLastFlingX = 0;
                this.mLastFlingY = 0;
                RecyclerView.LayoutManager layoutManager = COUIRecyclerView.this.getLayoutManager();
                zE = ((ki2) rkiVar).E(layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : 0);
                if (zE) {
                    postOnAnimation();
                }
            }
            return zE;
        }

        public void stop() {
            COUIRecyclerView.this.removeCallbacks(this);
            COUIRecyclerView cOUIRecyclerView = COUIRecyclerView.this;
            cOUIRecyclerView.initOverScroller(cOUIRecyclerView.getContext());
            COUIRecyclerView cOUIRecyclerView2 = COUIRecyclerView.this;
            float f = 0.0f;
            cOUIRecyclerView2.mAbortVelocityX = (cOUIRecyclerView2.mOverScroller == null || COUIRecyclerView.this.mOverScroller.getCurrVelocityX() == 0.0f) ? 0.0f : COUIRecyclerView.this.mFlingVelocityX;
            COUIRecyclerView cOUIRecyclerView3 = COUIRecyclerView.this;
            if (cOUIRecyclerView3.mOverScroller != null && COUIRecyclerView.this.mOverScroller.getCurrVelocityY() != 0.0f) {
                f = COUIRecyclerView.this.mFlingVelocityY;
            }
            cOUIRecyclerView3.mAbortVelocityY = f;
            if (COUIRecyclerView.this.mOverScroller != null) {
                COUIRecyclerView.this.mOverScroller.abortAnimation();
            }
            if (COUIRecyclerView.this.mSpringOverScroller != null) {
                COUIRecyclerView.this.mSpringOverScroller.abortAnimation();
            }
        }
    }

    static {
        COUI_DEBUG = bj2.LOG_DEBUG || bj2.e(TAG, 3);
        OVER_SCROLL_TOUCH_DURATION_THRESHOLD = ViewConfiguration.getLongPressTimeout();
    }

    public COUIRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
        m0l.b(this, 0);
        m0l.c(this, 0);
        this.mScrollType = 0;
    }

    private void cancelScrollWithAction() {
        resetScroll();
        setScrollState(0);
    }

    private void changeState() {
        if (this.mScrollState != 0) {
            this.mScrollState = 0;
            dispatchOnScrollStateChanged(0);
        }
    }

    private void createCOUIScrollDelegate(Context context) {
        this.mCOUIScrollBar = new uk2.b(this).a();
    }

    private boolean dispatchClickEvent(@NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = true;
        int[] iArr = {0, 1};
        for (int i = 0; i < 2; i++) {
            motionEvent.setAction(iArr[i]);
            zDispatchTouchEvent &= view.dispatchTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        RecyclerView.OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    private View findViewToDispatchClickEvent(MotionEvent motionEvent) {
        if (!isClickEvent(motionEvent)) {
            return null;
        }
        Rect rect = new Rect();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0 || childAt.getAnimation() != null) {
                childAt.getHitRect(rect);
                boolean zContains = rect.contains(((int) motionEvent.getX()) + getScrollX(), ((int) motionEvent.getY()) + getScrollY());
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                if (zContains && dispatchClickEvent(childAt, motionEventObtain)) {
                    view = childAt;
                }
                motionEventObtain.recycle();
                if (COUI_DEBUG) {
                    childAt.setBackground(childAt == view ? new ColorDrawable(Color.parseColor("#80FF0000")) : null);
                }
            }
        }
        return view;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return COUIRecyclerView.class.getPackage().getName() + '.' + str;
    }

    private float getVelocityAlongScrollableDirection() {
        ri2 ri2Var;
        ri2 ri2Var2;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0.0f;
        }
        if (layoutManager.canScrollHorizontally() && (ri2Var2 = this.mOverScroller) != null) {
            return ri2Var2.getCurrVelocityX();
        }
        if (!layoutManager.canScrollVertically() || (ri2Var = this.mOverScroller) == null) {
            return 0.0f;
        }
        return ri2Var.getCurrVelocityY();
    }

    private boolean hookIfNeedInterceptMoveEvent(float f, float f2) {
        return !(this.mEnableDispatchEventWhileScrolling || (this.mEnableDispatchEventWhileOverScrolling && isOverScrolling())) || f == 0.0f || ((double) Math.abs(f2 / f)) > Math.tan(((double) this.mEventFilterAngle) * 0.017453292519943295d);
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null || attributeSet.getStyleAttribute() == 0) {
            this.mStyle = i;
        } else {
            this.mStyle = attributeSet.getStyleAttribute();
        }
        if (context != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIRecyclerView, i, 0);
            this.mScrollbars = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIRecyclerView_couiScrollbars, 0);
            this.mScrollbarsSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIRecyclerView_couiScrollbarSize, 0);
            this.mScrollbarThumbVertical = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIRecyclerView_couiScrollbarThumbVertical);
            this.mEnableVibrator = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIRecyclerView_couiRecyclerViewEnableVibrator, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void initOnItemTouchListeners() {
        if (this.mOnItemTouchListeners == null) {
            this.mOnItemTouchListeners = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOverScroller(Context context) {
        if (this.mOverScroller == null) {
            this.mVerticalSpringOverTension = VERTICAL_SPRING_BACK_TENSION_MULTIPLE;
            this.mSpringOverScroller = new rki(context);
            this.mCOUILocateOverScroller = new xi2(context);
            enableFrameRate(true);
            setIsUseNativeOverScroll(false);
            setEnableFlingSpeedIncrease(this.mEnableFlingSpeedIncrease);
        }
    }

    private void initProperty(Context context) {
        int i = context.getResources().getDisplayMetrics().heightPixels;
        this.mOverscrollDistance = i;
        this.mOverflingDistance = i;
    }

    private void initViewFlinger() {
        if (this.mViewFlinger == null) {
            this.mViewFlinger = new ViewFlinger();
        }
    }

    private boolean isClickEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - this.mInitialTouchX);
        int y = (int) (motionEvent.getY() - this.mInitialTouchY);
        int iSqrt = (int) Math.sqrt((x * x) + (y * y));
        long jCurrentTimeMillis = System.currentTimeMillis() - this.mTouchTime;
        if (COUI_DEBUG) {
            Log.d(TAG, "onTouchEvent: ACTION_UP. touchDuration = " + jCurrentTimeMillis + ", offset = " + iSqrt);
        }
        return jCurrentTimeMillis < ((long) OVER_SCROLL_TOUCH_DURATION_THRESHOLD) && iSqrt < 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDrawDivider(View view, int i) {
        return this.mCOUIRecyclerDividerManager.isDrawDivider(view, i);
    }

    private boolean isFastFling(float f, float f2) {
        return !this.mAvoidAccidentalTouch || Math.abs(f) > this.mFastFlingVelocity || Math.abs(f2) > this.mFastFlingVelocity;
    }

    private boolean isOverScrolling() {
        int i;
        return this.mOverScrollEnable && ((i = this.mScrollType) == 2 || i == 3) && isOverScrollingInScrollableDirection();
    }

    private boolean isOverScrollingInScrollableDirection() {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically() && this.mLayout.canScrollHorizontally()) {
            return (getScrollY() == 0 || getScrollX() == 0) ? false : true;
        }
        if (this.mLayout.canScrollVertically()) {
            return getScrollY() != 0;
        }
        return this.mLayout.canScrollHorizontally() && getScrollX() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSizeChanged$0() {
        this.mGradualStopHelper.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSizeChanged$1() {
        this.mLocateHelper.p();
    }

    private boolean needLocate() {
        return getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) getLayoutManager()).getOrientation() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean onInterceptTouchEventInternal(MotionEvent motionEvent) {
        boolean z;
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null && uk2Var.j(motionEvent)) {
            return true;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int iE = ifk.e(motionEvent, motionEvent.getActionIndex());
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            ri2 ri2Var = this.mOverScroller;
            float currVelocityX = ri2Var != null ? ri2Var.getCurrVelocityX() : 0.0f;
            ri2 ri2Var2 = this.mOverScroller;
            float currVelocityY = ri2Var2 != null ? ri2Var2.getCurrVelocityY() : 0.0f;
            boolean zIsFastFling = isFastFling(this.mFlingVelocityX, this.mAbortVelocityX);
            boolean zIsFastFling2 = isFastFling(this.mFlingVelocityY, this.mAbortVelocityY);
            this.mIsTouchDownWhileSlowScrolling = (Math.abs(currVelocityX) > 0.0f && Math.abs(currVelocityX) < ((float) this.mSlowScrollThreshold) && zIsFastFling) || (Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < ((float) this.mSlowScrollThreshold) && zIsFastFling2);
            this.mIsTouchDownWhileOverScrolling = isOverScrolling();
            this.mTouchTime = System.currentTimeMillis();
            if (COUI_DEBUG) {
                this.mClickVelocityX = currVelocityX;
                this.mClickVelocityY = currVelocityY;
                this.mDebugAbortVelocityX = this.mAbortVelocityX;
                this.mDebugAbortVelocityY = this.mAbortVelocityY;
                Log.d(TAG, "onInterceptTouchEvent: ACTION_DOWN, isOverScrolling=:" + this.mIsTouchDownWhileOverScrolling + ", scrollVelocityX=:" + Math.abs(currVelocityX) + ", isFastFlingX=:" + zIsFastFling + ", mFlingVelocityX=:" + this.mFlingVelocityX + ", mAbortVelocityX=:" + this.mAbortVelocityX + ", scrollVelocityY=:" + Math.abs(currVelocityY) + ", isFastFlingY=:" + zIsFastFling2 + ", mFlingVelocityY=:" + this.mFlingVelocityY + ", mAbortVelocityY=:" + this.mAbortVelocityY);
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
            this.mSmoothScrollFlag = false;
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (zCanScrollHorizontally && Math.abs(i2) > this.mTouchSlop && hookIfNeedInterceptMoveEvent(i3, i2)) {
                    this.mLastTouchX = x2;
                    z = true;
                } else {
                    z = false;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop && hookIfNeedInterceptMoveEvent(i2, i3)) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScrollWithAction();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(iE);
            int x3 = (int) (motionEvent.getX(iE) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(iE) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (!this.mEnablePointerDown) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int iE = ifk.e(motionEvent, motionEvent.getActionIndex());
        if (motionEvent.getPointerId(iE) == this.mScrollPointerId) {
            int i = iE == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performFeedback() {
        if (this.mEnableVibrator) {
            performHapticFeedback(307);
        }
    }

    private void performOverScrollingReverseFling(float f, float f2) {
        this.mIsOverScrollingReverseFling = true;
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.q(getScrollX(), getScrollY(), (int) f, (int) f2);
        }
        changeState();
    }

    private void performSpringBack() {
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar == null || !rkiVar.springBack(getScrollX(), getScrollY(), 0, 0, 0, 0)) {
            return;
        }
        changeState();
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
    }

    private void stopScrollersInternal() {
        initViewFlinger();
        this.mViewFlinger.stop();
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnItemTouchListener(@NonNull RecyclerView.OnItemTouchListener onItemTouchListener) {
        initOnItemTouchListeners();
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    @Override // android.view.View
    public boolean awakenScrollBars() {
        uk2 uk2Var = this.mCOUIScrollBar;
        return uk2Var != null ? uk2Var.c() : super.awakenScrollBars();
    }

    public void cancelHorizontalItemAlign() {
        this.mLocateHelper.c();
    }

    @Override // android.view.View
    public void computeScroll() {
        rki rkiVar;
        if (this.mIsOverScrollingReverseFling) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (scrollX == 0 && scrollY == 0) {
                overScrollBy(-scrollX, -scrollY, scrollX, scrollY, 0, 0, 0, 0, false);
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
                this.mIsOverScrollingReverseFling = false;
                rki rkiVar2 = this.mSpringOverScroller;
                int currVelocityX = rkiVar2 != null ? (int) rkiVar2.getCurrVelocityX() : 0;
                rki rkiVar3 = this.mSpringOverScroller;
                int currVelocityY = rkiVar3 != null ? (int) rkiVar3.getCurrVelocityY() : 0;
                rki rkiVar4 = this.mSpringOverScroller;
                if (rkiVar4 != null) {
                    rkiVar4.abortAnimation();
                }
                setScrollState(0);
                fling(currVelocityX, currVelocityY);
                return;
            }
        }
        if (this.mOverScrollEnable) {
            int i = this.mScrollType;
            if ((i == 2 || i == 3) && (rkiVar = this.mSpringOverScroller) != null && rkiVar.computeScrollOffset()) {
                int scrollX2 = getScrollX();
                int scrollY2 = getScrollY();
                int iA = rkiVar.a();
                int iD = rkiVar.d();
                if (scrollX2 != iA || scrollY2 != iD) {
                    int i2 = this.mOverflingDistance;
                    overScrollBy(iA - scrollX2, iD - scrollY2, scrollX2, scrollY2, 0, 0, i2, i2, false);
                    onScrollChanged(getScrollX(), getScrollY(), scrollX2, scrollY2);
                }
                if (rkiVar.e()) {
                    setScrollState(0);
                } else {
                    setScrollState(2);
                }
                if (awakenScrollBars()) {
                    return;
                }
                postInvalidateOnAnimation();
            }
        }
    }

    public boolean disallowInterceptWhenIsOverScrolling() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (COUI_DEBUG) {
            this.mDebugPaint.setTextSize(30.0f);
            this.mDebugPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawText("isOverScrolling: " + isOverScrolling(), getWidth() / 2.0f, (getHeight() / 2.0f) - 50.0f, this.mDebugPaint);
            canvas.drawText("X: FlingVX: " + this.mFlingVelocityX + ", ClickVX: " + this.mClickVelocityX, getWidth() / 2.0f, getHeight() / 2.0f, this.mDebugPaint);
            canvas.drawText("Y: FlingVY: " + this.mFlingVelocityY + ", ClickVY: " + this.mClickVelocityY, getWidth() / 2.0f, (getHeight() / 2.0f) + 50.0f, this.mDebugPaint);
            canvas.drawText("AbortVX:" + this.mDebugAbortVelocityX + ", AbortVY:" + this.mDebugAbortVelocityY, getWidth() / 2.0f, (getHeight() / 2.0f) + 100.0f, this.mDebugPaint);
        }
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.e(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.mCOUIRecyclerDividerManager.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && isOverScrolling() && this.mScrollType == 3) {
            this.mScrollType = 2;
        }
        if (this.mEnableDispatchEventWhileScrolling || (this.mEnableDispatchEventWhileOverScrolling && isOverScrolling())) {
            float velocityAlongScrollableDirection = getVelocityAlongScrollableDirection();
            if (motionEvent.getActionMasked() == 0 && this.mDispatchEventVelocityThreshold >= Math.abs(velocityAlongScrollableDirection)) {
                ri2 ri2Var = this.mOverScroller;
                float f = 0.0f;
                this.mAbortVelocityX = (ri2Var == null || ri2Var.getCurrVelocityX() == 0.0f) ? 0.0f : this.mFlingVelocityX;
                ri2 ri2Var2 = this.mOverScroller;
                if (ri2Var2 != null && ri2Var2.getCurrVelocityY() != 0.0f) {
                    f = this.mFlingVelocityY;
                }
                this.mAbortVelocityY = f;
                ri2 ri2Var3 = this.mOverScroller;
                if (ri2Var3 != null) {
                    ri2Var3.abortAnimation();
                }
                stopScroll();
            }
        }
        if (isOverScrolling() && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            performSpringBack();
            if (!isClickEvent(motionEvent)) {
                performFeedback();
            }
            postInvalidateOnAnimation();
        }
        if (motionEvent.getActionMasked() != 5 || this.mEnablePointerDown) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void enableFrameRate(boolean z) {
        this.mSpringOverScroller.p(z);
        this.mCOUILocateOverScroller.f(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            this.mScrollType = 1;
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            RecyclerView.OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i, i2)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i3 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i3, Math.min(i, i3));
                int i4 = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(iMax, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    public uk2 getCOUIScrollDelegate() {
        return this.mCOUIScrollBar;
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public View getCOUIScrollableView() {
        return this;
    }

    public int getHorizontalItemAlign() {
        return this.mLocateHelper.i();
    }

    public boolean getIsUseNativeOverScroll() {
        return this.mIsUseNativeOverScroll;
    }

    public yh2 getLocateHelper() {
        return this.mLocateHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public xi2 getNativeOverScroller() {
        return this.mCOUILocateOverScroller;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        return this.mScrollState;
    }

    public ViewFlinger getViewFlinger() {
        return this.mViewFlinger;
    }

    public void invalidateParentIfNeeded() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isEnableFlingSpeedIncrease() {
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            return rkiVar.s();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cancelScroll();
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.o();
        }
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.q();
            this.mCOUIScrollBar = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEventInternal = onInterceptTouchEventInternal(motionEvent);
        if (zOnInterceptTouchEventInternal) {
            this.mCOUIRecyclerDividerManager.onInterceptTouchEvent(motionEvent);
        }
        return zOnInterceptTouchEventInternal;
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if (COUI_DEBUG) {
            Log.d(TAG, "onOverScrolled: scrollX: " + i + " scrollY: " + i2);
        }
        if (this.mScrollType == 3) {
            i = (int) (uj2.a(0, i + 0, this.mScreenWidth) * this.mFlingRatio);
            i2 = (int) (uj2.a(0, i2 + 0, this.mScreenHeight) * this.mFlingRatio);
        }
        onScrollChanged(i, i2, getScrollX(), getScrollY());
        m0l.b(this, i);
        m0l.c(this, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mScreenHeight = displayMetrics.heightPixels;
        if (this.mOverScroller instanceof ki2) {
            if (this.mGradualStopHelper != null) {
                post(new Runnable() { // from class: com.oplus.aiunit.vision.lk2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$onSizeChanged$0();
                    }
                });
            }
        } else if (this.mLocateHelper != null) {
            post(new Runnable() { // from class: com.oplus.aiunit.vision.mk2
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onSizeChanged$1();
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        rki rkiVar;
        boolean z;
        ?? r7;
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null && uk2Var.l(motionEvent)) {
            return true;
        }
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        ?? CanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int iE = ifk.e(motionEvent, motionEvent.getActionIndex());
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (this.mOverScrollEnable) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        float f = 0.0f;
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mOverScrollEnable && (((ri2Var = this.mOverScroller) != null && !ri2Var.e()) || ((rkiVar = this.mSpringOverScroller) != null && !rkiVar.e()))) {
                ri2 ri2Var2 = this.mOverScroller;
                this.mAbortVelocityX = (ri2Var2 == null || ri2Var2.getCurrVelocityX() == 0.0f) ? 0.0f : this.mFlingVelocityX;
                ri2 ri2Var3 = this.mOverScroller;
                if (ri2Var3 != null && ri2Var3.getCurrVelocityY() != 0.0f) {
                    f = this.mFlingVelocityY;
                }
                this.mAbortVelocityY = f;
                ri2 ri2Var4 = this.mOverScroller;
                if (ri2Var4 != null) {
                    ri2Var4.abortAnimation();
                }
                rki rkiVar2 = this.mSpringOverScroller;
                if (rkiVar2 != null) {
                    rkiVar2.abortAnimation();
                }
            }
            if (zCanScrollVertically) {
                CanScrollHorizontally = (CanScrollHorizontally == true ? 1 : 0) | 2;
            }
            startNestedScroll(CanScrollHorizontally, 0);
        } else if (actionMasked == 1) {
            if (this.mOverScrollEnable) {
                z = false;
            } else {
                this.mVelocityTracker.addMovement(motionEventObtain);
                z = true;
            }
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f2 = CanScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f3 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            boolean zIsOverScrolling = isOverScrolling();
            ?? r8 = this.mItemClickableWhileSlowScrolling && this.mIsTouchDownWhileSlowScrolling;
            ?? r9 = this.mItemClickableWhileOverScrolling && this.mIsTouchDownWhileOverScrolling && zIsOverScrolling;
            if (r8 != false || r9 != false) {
                findViewToDispatchClickEvent(motionEvent);
            }
            if (zIsOverScrolling) {
                if (this.mOverScroller != null && Math.abs(f2) > 6000.0f) {
                    this.mOverScroller.setCurrVelocityX(f2);
                    if (getScrollX() * f2 < 0.0f) {
                        z2 = true;
                    }
                }
                if (this.mOverScroller != null && Math.abs(f3) > 6000.0f) {
                    this.mOverScroller.setCurrVelocityY(f3);
                    if (getScrollY() * f3 < 0.0f) {
                        z2 = true;
                    }
                }
                if (z2) {
                    performOverScrollingReverseFling(f2, f3);
                } else {
                    performSpringBack();
                }
                postInvalidateOnAnimation();
            } else if (((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) && !this.mViewFlinger.springBackToCenter()) {
                setScrollState(0);
            }
            resetScroll();
            z2 = z;
        } else if (actionMasked == 2) {
            ri2 ri2Var5 = this.mOverScroller;
            if ((ri2Var5 instanceof rki) && this.mEnableOptimizedScroll) {
                ((rki) ri2Var5).D();
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                motionEventObtain.recycle();
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int i = this.mLastTouchX - x2;
            int i2 = this.mLastTouchY - y2;
            int[] iArr3 = this.mReusableIntPair;
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (dispatchNestedPreScroll(i, i2, iArr3, this.mScrollOffset, 0)) {
                int[] iArr4 = this.mReusableIntPair;
                i -= iArr4[0];
                i2 -= iArr4[1];
                int[] iArr5 = this.mScrollOffset;
                motionEventObtain.offsetLocation(iArr5[0], iArr5[1]);
                int[] iArr6 = this.mNestedOffsets;
                int i3 = iArr6[0];
                int[] iArr7 = this.mScrollOffset;
                iArr6[0] = i3 + iArr7[0];
                iArr6[1] = iArr6[1] + iArr7[1];
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.mScrollState != 1) {
                if (CanScrollHorizontally != 0) {
                    int iAbs = Math.abs(i);
                    int i4 = this.mTouchSlop;
                    if (iAbs > i4) {
                        i = i > 0 ? i - i4 : i + i4;
                        r7 = true;
                    } else {
                        r7 = false;
                    }
                } else {
                    r7 = false;
                }
                if (zCanScrollVertically) {
                    int iAbs2 = Math.abs(i2);
                    int i5 = this.mTouchSlop;
                    if (iAbs2 > i5) {
                        i2 = i2 > 0 ? i2 - i5 : i2 + i5;
                        r7 = true;
                    }
                }
                if (r7 != false) {
                    setScrollState(1);
                }
            }
            if (this.mScrollState == 1) {
                int[] iArr8 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr8[0];
                this.mLastTouchY = y2 - iArr8[1];
                if (this.mOverScrollEnable) {
                    this.mScrollType = 0;
                }
                if (scrollByInternal(CanScrollHorizontally != 0 ? i : 0, zCanScrollVertically ? i2 : 0, motionEventObtain) || (isOverScrollingInScrollableDirection() && disallowInterceptWhenIsOverScrolling())) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                GapWorker gapWorker = this.mGapWorker;
                if (gapWorker != null && (i != 0 || i2 != 0)) {
                    gapWorker.postFromTraversal(this, i, i2);
                }
            }
        } else if (actionMasked == 3) {
            rki rkiVar3 = this.mSpringOverScroller;
            if (rkiVar3 != null) {
                rkiVar3.o();
            }
            cancelScrollWithAction();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(iE);
            int x3 = (int) (motionEvent.getX(iE) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(iE) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2 && !this.mOverScrollEnable) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            cancelScroll();
            rki rkiVar = this.mSpringOverScroller;
            if (rkiVar != null) {
                rkiVar.abortAnimation();
            }
        }
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.n(view, i);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.o(i);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = i + i3;
        int i10 = i2 + i4;
        if ((i3 < 0 && i9 > 0) || (i3 > 0 && i9 < 0)) {
            i9 = 0;
        }
        if ((i4 < 0 && i10 > 0) || (i4 > 0 && i10 < 0)) {
            i10 = 0;
        }
        onOverScrolled(i9, i10, false, false);
        return false;
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes = null;
        String resourceTypeName = this.mStyle == 0 ? null : getResources().getResourceTypeName(this.mStyle);
        if (!TextUtils.isEmpty(resourceTypeName) && Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUIRecyclerView, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mScrollbarThumbVertical = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIRecyclerView_couiScrollbarThumbVertical);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mScrollbars == 512) {
            Drawable drawable = this.mScrollbarThumbVertical;
            if (drawable != null) {
                this.mCOUIScrollBar.s(drawable);
            } else {
                this.mCOUIScrollBar.p();
            }
        }
        invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void removeOnItemTouchListener(@NonNull RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        consumePendingUpdateOperations();
        if (this.mAdapter == null || (i == 0 && i2 == 0)) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            if (!this.mOverScrollEnable || ((getScrollY() >= 0 || i2 <= 0) && ((getScrollY() <= 0 || i2 >= 0) && ((getScrollX() >= 0 || i <= 0) && (getScrollX() <= 0 || i >= 0))))) {
                int[] iArr = this.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                scrollStep(i, i2, iArr);
                int[] iArr2 = this.mReusableIntPair;
                i7 = iArr2[0];
                i8 = iArr2[1];
                i9 = i - i7;
                i10 = i2 - i8;
            } else {
                i8 = 0;
                i7 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (COUI_DEBUG) {
                Log.d(TAG, "scrollByInternal: y: " + i2 + " consumedY: " + i8 + " unconsumedY: " + i10);
            }
            i3 = i8;
            i4 = i7;
            i5 = i9;
            i6 = i10;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i3, i5, i6, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i5 - iArr4[0];
        int i12 = i6 - iArr4[1];
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i14 = iArr5[0];
        this.mLastTouchX = i13 - i14;
        int i15 = this.mLastTouchY;
        int i16 = iArr5[1];
        this.mLastTouchY = i15 - i16;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i14, i16);
        }
        int[] iArr6 = this.mNestedOffsets;
        int i17 = iArr6[0];
        int[] iArr7 = this.mScrollOffset;
        iArr6[0] = i17 + iArr7[0];
        iArr6[1] = iArr6[1] + iArr7[1];
        if (getOverScrollMode() != 2 && motionEvent != null && this.mOverScrollEnable && (MotionEventCompat.isFromSource(motionEvent, 4098) || MotionEventCompat.isFromSource(motionEvent, 8194))) {
            if (i12 != 0 || i11 != 0) {
                this.mScrollType = 2;
            }
            if (Math.abs(i12) == 0 && Math.abs(i3) < 2 && Math.abs(i2) < 2 && Math.abs(getScrollY()) > 2) {
                this.mScrollType = 2;
            }
            if (i12 == 0 && i3 == 0 && Math.abs(i2) > 2) {
                this.mScrollType = 2;
            }
            if (Math.abs(i11) == 0 && Math.abs(i4) < 2 && Math.abs(i) < 2 && Math.abs(getScrollX()) > 2) {
                this.mScrollType = 2;
            }
            if (i11 == 0 && i4 == 0 && Math.abs(i) > 2) {
                this.mScrollType = 2;
            }
            if (this.mFixScrollTypeForOverScrolling && (getScrollX() != 0 || getScrollY() != 0)) {
                this.mScrollType = 2;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iB = (int) (uj2.b(i12, scrollY, this.mOverscrollDistance) * this.mFlingRatio);
            int iB2 = (int) (uj2.b(i11, scrollX, this.mOverscrollDistance) * this.mFlingRatio);
            if ((scrollY < 0 && i2 > 0) || (scrollY > 0 && i2 < 0)) {
                iB = (int) (uj2.b(i2, scrollX, this.mOverscrollDistance) * this.mFlingRatio);
            }
            int i18 = iB;
            if ((scrollX < 0 && i > 0) || (scrollX > 0 && i < 0)) {
                iB2 = (int) (uj2.b(i, scrollX, this.mOverscrollDistance) * this.mFlingRatio);
            }
            if (i18 != 0 || iB2 != 0) {
                int i19 = this.mOverscrollDistance;
                overScrollBy(iB2, i18, scrollX, scrollY, 0, 0, i19, i19, true);
            }
        }
        if (i4 != 0 || i3 != 0) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && i3 == 0) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        cancelScroll();
        super.scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        if (adapter instanceof COUIGradualStopAdapter) {
            ji2 ji2Var = new ji2();
            this.mGradualStopHelper = ji2Var;
            ji2Var.a(this);
            this.mSpringOverScroller = new ki2(getContext(), this.mGradualStopHelper);
            setIsUseNativeOverScroll(this.mIsUseNativeOverScroll);
        }
    }

    public void setAvoidAccidentalTouch(boolean z) {
        this.mAvoidAccidentalTouch = z;
    }

    public void setCustomTouchSlop(int i) {
        Log.w(TAG, "setTouchSlop: set touchSlop from " + this.mTouchSlop + " to " + i);
        this.mTouchSlop = i;
    }

    public void setDispatchEventWhileOverScrolling(boolean z) {
        this.mEnableDispatchEventWhileOverScrolling = z;
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        this.mEnableDispatchEventWhileScrolling = z;
    }

    public void setDispatchEventWhileScrollingThreshold(int i) {
        this.mDispatchEventVelocityThreshold = i;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.x(z);
        }
    }

    public void setEnablePointerDownAction(boolean z) {
        this.mEnablePointerDown = z;
    }

    public void setEnableVibrator(boolean z) {
        this.mEnableVibrator = z;
    }

    public void setEventFilterTangent(float f) {
        this.mEventFilterAngle = f;
    }

    public void setFastFlingThreshold(float f) {
        this.mFastFlingVelocity = Math.max(f, 0.0f);
    }

    public void setFlingRatio(float f) {
        this.mFlingRatio = f;
    }

    public void setHorizontalFlingDurationRatio(float f) {
        this.mCOUILocateOverScroller.h(f);
    }

    public void setHorizontalFlingFriction(float f) {
        xi2 xi2Var = this.mCOUILocateOverScroller;
        if (xi2Var != null) {
            xi2Var.i(f);
        }
    }

    public void setHorizontalFlingVelocityRatio(float f) {
        this.mCOUILocateOverScroller.j(f);
        this.mCOUILocateOverScroller.k(f);
    }

    public void setHorizontalItemAlign(int i) {
        if (needLocate()) {
            setIsUseNativeOverScroll(true);
            this.mLocateHelper.m(i);
        }
    }

    public void setIsUseNativeOverScroll(boolean z) {
        this.mIsUseNativeOverScroll = z;
        if (z) {
            this.mOverScroller = this.mCOUILocateOverScroller;
        } else {
            this.mOverScroller = this.mSpringOverScroller;
        }
    }

    public void setIsUseOptimizedScroll(boolean z) {
        this.mEnableOptimizedScroll = z;
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.mItemClickableWhileOverScrolling = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.mItemClickableWhileSlowScrolling = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@Nullable RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (layoutManager == null || this.mSpringOverScroller == null) {
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            this.mSpringOverScroller.B(HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE);
        } else {
            this.mSpringOverScroller.B(this.mVerticalSpringOverTension);
        }
    }

    public void setNativeOverScroller(xi2 xi2Var) {
        this.mCOUILocateOverScroller = xi2Var;
        if (this.mIsUseNativeOverScroll) {
            this.mOverScroller = xi2Var;
        }
    }

    public void setNewCOUIScrollDelegate(uk2 uk2Var) {
        if (uk2Var == null) {
            throw new IllegalArgumentException("setNewCOUIScrollDelegate must NOT be NULL.");
        }
        this.mCOUIScrollBar = uk2Var;
        uk2Var.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnFlingListener(@Nullable RecyclerView.OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    public void setOverScrollEnable(boolean z) {
        this.mOverScrollEnable = z;
    }

    public void setOverScrollingFixed(boolean z) {
        this.mFixScrollTypeForOverScrolling = z;
    }

    public void setPressHideDivider(boolean z) {
        this.mCOUIRecyclerDividerManager.setEnablePressHideDivider(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        super.setScrollState(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setSlowScrollThreshold(int i) {
        Log.d(TAG, "Slow scroll threshold set to " + i);
        this.mSlowScrollThreshold = i;
    }

    public void setSpringBackFriction(float f) {
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.A(f);
        }
    }

    public void setSpringBackTension(float f) {
        this.mVerticalSpringOverTension = f;
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.B(f);
        }
    }

    public void setSpringOverScrollerDebug(boolean z) {
        rki rkiVar = this.mSpringOverScroller;
        if (rkiVar != null) {
            rkiVar.w(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        cancelScroll();
        super.smoothScrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        super.stopScroll();
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public void superOnTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
    }

    public COUIRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public COUIRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.SCROLLBARS_NONE = 0;
        this.SCROLLBARS_VERTICAL = 512;
        this.mFixScrollTypeForOverScrolling = true;
        this.mOverScrollEnable = true;
        this.SCROLLING = 0;
        this.FLING = 1;
        this.OVER_SCROLLING = 2;
        this.OVER_FLING = 3;
        this.mIsOverScrollingReverseFling = false;
        this.mScreenHeight = 0;
        this.mScreenWidth = 0;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mFastFlingVelocity = 1000.0f;
        this.mAvoidAccidentalTouch = true;
        this.mDebugPaint = new Paint();
        this.mEnableFlingSpeedIncrease = true;
        this.mEnableOptimizedScroll = true;
        this.mSmoothScrollFlag = false;
        this.mEnableDispatchEventWhileScrolling = false;
        this.mEnableDispatchEventWhileOverScrolling = false;
        this.mDispatchEventVelocityThreshold = 2500;
        this.mEventFilterAngle = 20.0f;
        this.mScrollbars = 0;
        this.mSlowScrollThreshold = 2500;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mVerticalSpringOverTension = VERTICAL_SPRING_BACK_TENSION_MULTIPLE;
        this.mEnablePointerDown = true;
        this.mFlingRatio = 1.0f;
        this.mEnableVibrator = true;
        initAttr(context, attributeSet, i);
        initViewFlinger();
        initOnItemTouchListeners();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setSlowScrollThreshold(2500);
        initProperty(context);
        if (COUI_DEBUG) {
            Log.d(TAG, "COUIRecyclerView: overscroll_mode: " + getOverScrollMode() + " mOverScrollEnable: " + this.mOverScrollEnable);
        }
        initOverScroller(context);
        yh2 yh2Var = new yh2();
        this.mLocateHelper = yh2Var;
        yh2Var.b(this);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mScreenHeight = displayMetrics.heightPixels;
        this.mCOUIRecyclerDividerManager = new COUIRecyclerDividerManager(this, this.mTouchSlop);
        if (this.mScrollbars == 512) {
            createCOUIScrollDelegate(context);
            int i2 = this.mScrollbarsSize;
            if (i2 != 0) {
                this.mCOUIScrollBar.t(i2);
            }
            Drawable drawable = this.mScrollbarThumbVertical;
            if (drawable != null) {
                this.mCOUIScrollBar.s(drawable);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public static class COUIRecyclerViewItemDecoration extends COUIDividerItemDecoration {
        private final int[] mChildLocation;
        private final int[] mItemLocation;

        public COUIRecyclerViewItemDecoration(Context context) {
            super(context);
            this.mItemLocation = new int[2];
            this.mChildLocation = new int[2];
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView.COUIDividerItemDecoration
        public int getDividerInsetEnd(RecyclerView recyclerView, int i) {
            View childAt = recyclerView.getChildAt(i);
            return childAt != null ? getDividerInsetEnd(recyclerView.getChildViewHolder(childAt)) : super.getDividerInsetEnd(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView.COUIDividerItemDecoration
        public int getDividerInsetStart(RecyclerView recyclerView, int i) {
            View childAt = recyclerView.getChildAt(i);
            return childAt != null ? getDividerInsetStart(recyclerView.getChildViewHolder(childAt)) : super.getDividerInsetStart(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView.COUIDividerItemDecoration
        public boolean shouldDrawDivider(RecyclerView recyclerView, int i) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                return true;
            }
            if ((recyclerView instanceof COUIRecyclerView) && !((COUIRecyclerView) recyclerView).isDrawDivider(childAt, i)) {
                return false;
            }
            Object childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof ICOUIDividerDecorationInterface) {
                return ((ICOUIDividerDecorationInterface) childViewHolder).drawDivider();
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.COUIRecyclerView.COUIDividerItemDecoration
        public int getDividerInsetEnd(RecyclerView.ViewHolder viewHolder) {
            int width;
            int width2;
            if (viewHolder instanceof ICOUIDividerDecorationInterface) {
                View view = viewHolder.itemView;
                boolean z = view.getLayoutDirection() == 1;
                ICOUIDividerDecorationInterface iCOUIDividerDecorationInterface = (ICOUIDividerDecorationInterface) viewHolder;
                View dividerEndAlignView = iCOUIDividerDecorationInterface.getDividerEndAlignView();
                if (dividerEndAlignView != null) {
                    view.getLocationInWindow(this.mItemLocation);
                    dividerEndAlignView.getLocationInWindow(this.mChildLocation);
                    if (z) {
                        width = this.mChildLocation[0] + dividerEndAlignView.getPaddingEnd();
                        width2 = this.mItemLocation[0];
                    } else {
                        width = this.mItemLocation[0] + view.getWidth();
                        width2 = (this.mChildLocation[0] + dividerEndAlignView.getWidth()) - dividerEndAlignView.getPaddingEnd();
                    }
                    return width - width2;
                }
                return iCOUIDividerDecorationInterface.getDividerEndInset();
            }
            return super.getDividerInsetEnd(viewHolder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.COUIRecyclerView.COUIDividerItemDecoration
        public int getDividerInsetStart(RecyclerView.ViewHolder viewHolder) {
            int paddingStart;
            int width;
            if (viewHolder instanceof ICOUIDividerDecorationInterface) {
                View view = viewHolder.itemView;
                boolean z = view.getLayoutDirection() == 1;
                ICOUIDividerDecorationInterface iCOUIDividerDecorationInterface = (ICOUIDividerDecorationInterface) viewHolder;
                View dividerStartAlignView = iCOUIDividerDecorationInterface.getDividerStartAlignView();
                if (dividerStartAlignView != null) {
                    view.getLocationInWindow(this.mItemLocation);
                    dividerStartAlignView.getLocationInWindow(this.mChildLocation);
                    if (z) {
                        paddingStart = this.mItemLocation[0] + view.getWidth();
                        width = (this.mChildLocation[0] + dividerStartAlignView.getWidth()) - dividerStartAlignView.getPaddingStart();
                    } else {
                        paddingStart = this.mChildLocation[0] + dividerStartAlignView.getPaddingStart();
                        width = this.mItemLocation[0];
                    }
                    return paddingStart - width;
                }
                return iCOUIDividerDecorationInterface.getDividerStartInset();
            }
            return super.getDividerInsetStart(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        if (isOverScrolling()) {
            cancelScroll();
        }
        this.mSmoothScrollFlag = true;
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.mScrollType = 0;
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.smoothScrollBy(i, i2, i3, interpolator);
            return;
        }
        scrollBy(i, i2);
    }
}
