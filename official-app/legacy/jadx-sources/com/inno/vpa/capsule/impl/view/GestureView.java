package com.inno.vpa.capsule.impl.view;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c7b;
import com.oplus.aiunit.vision.uu5;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u0000 O2\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u0002H\u0014J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H$J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H$J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bR\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00101R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00105R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010?R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00101R\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lcom/inno/vpa/capsule/impl/view/GestureView;", "Landroid/widget/FrameLayout;", "", "r", "Landroid/view/MotionEvent;", "ev", "", "scrollX", "", LogFieldKey.LEVEL_KEY, "event", "o", "initialVelocityX", "c", "newScrollX", "b", "x", "y", "n", "deltaX", "d", LogFieldKey.MESSAGE_KEY, "a", "disallowIntercept", "q", b2n.f, "f", LogFieldKey.PROCESS_NAME_KEY, "destX", "s", b2n.g, "i", MapSchema.FIELD_NAME_KEY, "Landroid/content/Context;", "context", "j", MapSchema.FIELD_NAME_ENTRY, "dispatchTouchEvent", "onInterceptTouchEvent", "onTouchEvent", "computeScroll", "u", "t", "enable", "setTriggerSlideDownEnable", "setTriggerSingleTapEnable", "Landroid/widget/Scroller;", "Landroid/widget/Scroller;", "mScroller", "Z", "mDraggable", "mTriggerSlideDownEnable", "mTriggerSingleTapEnable", "I", "mHideYLength", "mHideXLength", "mHolderWidth", "mLastMotionX", "mLastMotionY", "mInitialMotionX", "mInitialMotionY", "mMaximumVelocity", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "mVelocityTracker", "v", "mActivePointerId", "w", "mIsBeingDragged", "mIsUnableToDrag", "", UserInfo.SEX_FEMALE, "mActionDownTouchY", "", "z", "J", "mActionDownTime", "<init>", "(Landroid/content/Context;)V", "Companion", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public abstract class GestureView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Scroller mScroller;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mDraggable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mTriggerSlideDownEnable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean mTriggerSingleTapEnable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mHideYLength;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mHideXLength;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mHolderWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int mLastMotionX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int mLastMotionY;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int mInitialMotionX;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int mInitialMotionY;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int mMaximumVelocity;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VelocityTracker mVelocityTracker;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int mActivePointerId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean mIsBeingDragged;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean mIsUnableToDrag;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float mActionDownTouchY;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public long mActionDownTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mActivePointerId = -1;
        e();
    }

    public final void a() {
        p();
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
    }

    public final int b(int initialVelocityX, MotionEvent event, int newScrollX, int scrollX) {
        int i;
        if (initialVelocityX < -200 || i(event)) {
            if (getLayoutDirection() != 1) {
                i = this.mHolderWidth;
                return i;
            }
            return 0;
        }
        if (initialVelocityX > 200 || i(event)) {
            if (getLayoutDirection() == 1) {
                i = this.mHolderWidth;
            }
            return 0;
        }
        if (Math.abs(scrollX) - (this.mHolderWidth * 0.5f) <= 0) {
            return newScrollX;
        }
        int layoutDirection = getLayoutDirection();
        i = this.mHolderWidth;
        if (layoutDirection == 1) {
        }
        return i;
        i = -i;
        return i;
    }

    public final void c(int initialVelocityX, MotionEvent event, int scrollX) {
        boolean z = false;
        if (this.mDraggable || this.mTriggerSingleTapEnable) {
            int iB = b(initialVelocityX, event, 0, scrollX);
            z = Math.abs(initialVelocityX) > 200 || i(event);
            if (!z && h(event) && this.mTriggerSingleTapEnable) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                j(event, context);
            }
            Log.d("GestureView", "onTouchEventACTION_UP:  getSlideViewScrollX() = " + getScrollX() + " newScrollX = " + iB);
        }
        if (z || h(event)) {
            return;
        }
        r();
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        if (scroller.computeScrollOffset()) {
            Scroller scroller2 = this.mScroller;
            Intrinsics.checkNotNull(scroller2);
            int currX = scroller2.getCurrX();
            Scroller scroller3 = this.mScroller;
            Intrinsics.checkNotNull(scroller3);
            scrollTo(currX, scroller3.getCurrY());
            postInvalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int scrollX, int deltaX, int x, int y, MotionEvent event) {
        int i = scrollX - (Math.abs(scrollX) >= this.mHolderWidth ? (deltaX * 3) / 7 : (deltaX * 4) / 7);
        ViewParent parent = getParent();
        if (parent != 0) {
            parent.requestDisallowInterceptTouchEvent(true);
            ((View) parent).setPressed(false);
        }
        setPressed(false);
        if (Math.abs(i) > this.mHolderWidth) {
            i = getLayoutDirection() == 1 ? -this.mHolderWidth : this.mHolderWidth;
        }
        scrollTo(i, 0);
        this.mLastMotionX = x;
        this.mLastMotionY = y;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(event);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (this.mTriggerSlideDownEnable) {
            if (action == 0) {
                this.mActionDownTouchY = ev.getY();
                this.mActionDownTime = System.currentTimeMillis();
            } else if (action == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.mActionDownTime;
                float y = ev.getY() - this.mActionDownTouchY;
                int i = (int) ((y / jCurrentTimeMillis) * 1000);
                c7b.INSTANCE.a("GestureView", "dispatchTouchEvent length = " + y + ";touchTime= " + jCurrentTimeMillis + ";speed= " + i);
                int i2 = this.mHideYLength;
                if (y > i2 || i > i2) {
                    k();
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    public void e() {
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        this.mMaximumVelocity = configuration.getScaledMaximumFlingVelocity();
        this.mScroller = new Scroller(getContext(), new PathInterpolator(0.133f, 0.0f, 0.3f, 1.0f));
        setWillNotDraw(false);
        uu5.Companion companion = uu5.INSTANCE;
        this.mHideYLength = companion.a(100.0f);
        this.mHideXLength = companion.a(100.0f);
        this.mHolderWidth = companion.a(360.0f);
    }

    public final void f() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.clear();
        }
    }

    public final void g() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    public final boolean h(MotionEvent event) {
        float f = 50;
        return Math.abs(((float) this.mInitialMotionX) - event.getX()) < f && Math.abs(((float) this.mInitialMotionY) - event.getY()) < f;
    }

    public final boolean i(MotionEvent event) {
        return Math.abs(((float) this.mInitialMotionX) - event.getX()) > ((float) this.mHideXLength);
    }

    public final void j(MotionEvent event, Context context) {
        if (this.mTriggerSingleTapEnable) {
            t(event, context);
        }
    }

    public final void k() {
        if (this.mTriggerSlideDownEnable) {
            u();
        }
    }

    public final boolean l(MotionEvent ev, int scrollX) {
        int i = this.mActivePointerId;
        if (i == -1) {
            return true;
        }
        int iFindPointerIndex = ev.findPointerIndex(i);
        int x = (int) ev.getX(iFindPointerIndex);
        int i2 = x - this.mLastMotionX;
        int iAbs = Math.abs(i2);
        int y = (int) ev.getY(iFindPointerIndex);
        int iAbs2 = Math.abs(y - this.mInitialMotionY);
        this.mLastMotionX = x;
        this.mLastMotionY = y;
        if (iAbs > 3 && iAbs * 0.5f > iAbs2) {
            this.mIsBeingDragged = true;
            q(true);
            int i3 = this.mInitialMotionX;
            this.mLastMotionX = i2 > 0 ? i3 + 3 : i3 - 3;
            this.mLastMotionY = y;
        } else if (iAbs2 > 3) {
            this.mIsUnableToDrag = true;
        }
        if (this.mIsBeingDragged) {
            g();
            VelocityTracker velocityTracker = this.mVelocityTracker;
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(ev);
            int i4 = scrollX - (Math.abs(scrollX) >= this.mHolderWidth ? (i2 * 3) / 7 : (i2 * 4) / 7);
            Log.d("GestureView", "onInterceptTouchEvent:  newScrollX = " + i4);
            scrollTo(i4, 0);
        }
        return false;
    }

    public final void m(MotionEvent event) {
        Log.d("GestureView", "onTouchEvent ACTION_DOWN x=" + event.getX() + ",y = " + event.getY());
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        if (!scroller.isFinished()) {
            Scroller scroller2 = this.mScroller;
            Intrinsics.checkNotNull(scroller2);
            scroller2.abortAnimation();
        }
        this.mActivePointerId = event.getPointerId(0);
        int x = (int) event.getX();
        this.mInitialMotionX = x;
        this.mLastMotionX = x;
        int y = (int) event.getY();
        this.mInitialMotionY = y;
        this.mLastMotionY = y;
        ViewParent parent = getParent();
        if (parent == null || !this.mDraggable) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        float scrollX = viewGroup.getScrollX() - getLeft();
        float scrollY = viewGroup.getScrollY() - getTop();
        event.offsetLocation(-scrollX, -scrollY);
        viewGroup.onTouchEvent(event);
        event.offsetLocation(scrollX, scrollY);
        parent.requestDisallowInterceptTouchEvent(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(int x, int y, MotionEvent event, int scrollX) {
        ViewParent parent;
        int i = x - this.mLastMotionX;
        int i2 = y - this.mLastMotionY;
        int iFindPointerIndex = event.findPointerIndex(this.mActivePointerId);
        int x2 = (int) event.getX(iFindPointerIndex);
        int i3 = x2 - this.mLastMotionX;
        int iAbs = Math.abs(i3);
        int y2 = (int) event.getY(iFindPointerIndex);
        int iAbs2 = Math.abs(y2 - this.mInitialMotionY);
        this.mLastMotionX = x2;
        this.mLastMotionY = y2;
        if (iAbs > 8 && iAbs * 0.8f > iAbs2) {
            this.mIsBeingDragged = true;
            int i4 = this.mInitialMotionX;
            this.mLastMotionX = i3 > 0 ? i4 + 8 : i4 - 8;
            this.mLastMotionY = y;
        }
        if (this.mIsBeingDragged && i != 0 && this.mDraggable) {
            d(scrollX, i, x, y, event);
            return true;
        }
        if (i2 != 0 && (parent = getParent()) != 0) {
            if (!this.mIsBeingDragged && (i2 > 4 || i2 < -4)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            ((View) parent).setPressed(false);
            setPressed(false);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void o(MotionEvent event, int scrollX) {
        Log.d("GestureView", "onTouchEvent ACTION_UP x=" + event.getX() + ",y = " + event.getY());
        VelocityTracker velocityTracker = this.mVelocityTracker;
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.computeCurrentVelocity(200, (float) this.mMaximumVelocity);
        int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
        int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
        c7b.INSTANCE.a("GestureView", " initialVelocityX = " + xVelocity + " initialVelocityY = " + yVelocity);
        c(xVelocity, event, scrollX);
        ViewParent parent = getParent();
        if (parent != null && this.mDraggable) {
            ViewGroup viewGroup = (ViewGroup) parent;
            float scrollX2 = viewGroup.getScrollX() - getLeft();
            float scrollY = viewGroup.getScrollY() - getTop();
            event.offsetLocation(-scrollX2, -scrollY);
            if (this.mIsBeingDragged) {
                MotionEvent cancelEvent = MotionEvent.obtain(event);
                Intrinsics.checkNotNullExpressionValue(cancelEvent, "cancelEvent");
                cancelEvent.setAction(3);
                ((ViewGroup) parent).onTouchEvent(cancelEvent);
                Log.d("GestureView", "cancel,  mIsBeingDragged: " + this.mIsBeingDragged);
                Log.d("GestureView", "getSlideViewScrollX(): " + getScrollX());
                cancelEvent.recycle();
            } else {
                boolean z = false;
                if (getLayoutDirection() != 1 ? getScrollX() <= 0 : getScrollX() >= 0) {
                    z = true;
                }
                if (z) {
                    Log.d("GestureView", "up,  mIsBeingDragged: " + this.mIsBeingDragged);
                    Log.d("GestureView", "getSlideViewScrollX(): " + getScrollX());
                    viewGroup.onTouchEvent(event);
                } else {
                    try {
                        MotionEvent cancelEvent2 = MotionEvent.obtain(event);
                        Intrinsics.checkNotNullExpressionValue(cancelEvent2, "cancelEvent");
                        cancelEvent2.setAction(3);
                        ((ViewGroup) parent).onTouchEvent(cancelEvent2);
                        Log.d("GestureView", "cancel,  mIsBeingDragged: " + this.mIsBeingDragged);
                        Log.d("GestureView", "getSlideViewScrollX(): " + getScrollX());
                        cancelEvent2.recycle();
                    } catch (Exception e2) {
                        c7b.INSTANCE.a("GestureView", "ACTION_UP error = " + e2.getMessage());
                    }
                }
            }
            event.offsetLocation(scrollX2, scrollY);
        }
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        Log.d("GestureView", "onInterceptTouchEvent: x=" + ev.getX() + ",y = " + ev.getY());
        if (!this.mDraggable) {
            return false;
        }
        int action = ev.getAction() & 255;
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        int scrollX = getScrollX();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (l(ev, scrollX)) {
                        return true;
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mActivePointerId = -1;
            return false;
        }
        this.mActivePointerId = ev.getPointerId(0);
        f();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(ev);
        int x = (int) ev.getX();
        this.mInitialMotionX = x;
        this.mLastMotionX = x;
        int y = (int) ev.getY();
        this.mInitialMotionY = y;
        this.mLastMotionY = y;
        this.mIsUnableToDrag = false;
        return this.mIsBeingDragged;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        int i;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (!this.mDraggable && !this.mTriggerSlideDownEnable && !this.mTriggerSingleTapEnable && actionMasked == 0 && event.getX() < getWidth() - getScrollX()) {
            return false;
        }
        int x = (int) event.getX();
        int y = (int) event.getY();
        int scrollX = getScrollX();
        g();
        int action = event.getAction();
        if (action == 0) {
            m(event);
        } else if (action == 1) {
            o(event, scrollX);
        } else if (action != 2) {
            if (action == 3) {
                if (scrollX - (this.mHolderWidth * 0.5f) > 0) {
                    i = getLayoutDirection() == 1 ? -this.mHolderWidth : this.mHolderWidth;
                } else {
                    i = 0;
                }
                s(i);
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                a();
            }
        } else if (n(x, y, event, scrollX)) {
            return true;
        }
        this.mLastMotionX = x;
        this.mLastMotionY = y;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(event);
        }
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public final void q(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    public final void r() {
        if (getScrollX() != 0) {
            s(0);
        }
    }

    public final void s(int destX) {
        int scrollX = getScrollX();
        int i = destX - scrollX;
        int iAbs = Math.abs(i) * 3;
        int i2 = iAbs > 200 ? 200 : iAbs;
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        scroller.startScroll(scrollX, 0, i, 0, i2);
        invalidate();
    }

    public final void setTriggerSingleTapEnable(boolean enable) {
        this.mTriggerSingleTapEnable = enable;
    }

    public final void setTriggerSlideDownEnable(boolean enable) {
        this.mTriggerSlideDownEnable = enable;
    }

    public abstract void t(@NotNull MotionEvent event, @NotNull Context context);

    public abstract void u();
}
