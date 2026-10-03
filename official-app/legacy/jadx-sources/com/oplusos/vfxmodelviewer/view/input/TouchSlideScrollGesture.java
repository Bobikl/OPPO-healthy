package com.oplusos.vfxmodelviewer.view.input;

import android.view.MotionEvent;
import com.oplusos.vfxmodelviewer.view.Math;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/input/TouchSlideScrollGesture;", "Lcom/oplusos/vfxmodelviewer/view/input/SlideScrollGesture;", "()V", "mDeltaX", "", "mDeltaY", "mIsScrolling", "", "mIsSliding", "mLastDis", "", "mLastFirstTouchID", "mLastSecondTouchID", "mLastX", "mLastY", "mScrollValue", "endGesture", "", "endScrolling", "endSliding", "getScroll", "getSlideDeltaX", "getSlideDeltaY", "getSlideIndex", "getSlideX", "getSlideY", "isSliding", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "toString", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TouchSlideScrollGesture extends SlideScrollGesture {
    private int mDeltaX;
    private int mDeltaY;
    private boolean mIsScrolling;
    private boolean mIsSliding;
    private float mLastDis;
    private int mLastFirstTouchID = -1;
    private int mLastSecondTouchID = -1;
    private int mLastX;
    private int mLastY;
    private float mScrollValue;

    private final void endScrolling() {
        this.mScrollValue = 0.0f;
        this.mLastDis = 0.0f;
        this.mIsScrolling = false;
        this.mLastFirstTouchID = -1;
        this.mLastSecondTouchID = -1;
    }

    private final void endSliding() {
        ISlideScroll mUser = getMUser();
        if (mUser != null) {
            mUser.onSlideEnd(0, this.mLastX, this.mLastY);
        }
        this.mDeltaY = 0;
        this.mDeltaX = 0;
        this.mIsSliding = false;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public void endGesture() {
        endScrolling();
        endSliding();
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    /* JADX INFO: renamed from: getScroll, reason: from getter */
    public float getMScrollValue() {
        return this.mScrollValue;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public float getSlideDeltaX() {
        return this.mDeltaX;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public float getSlideDeltaY() {
        return this.mDeltaY;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public int getSlideIndex() {
        return 0;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public float getSlideX() {
        return this.mLastX;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    public float getSlideY() {
        return this.mLastY;
    }

    @Override // com.oplusos.vfxmodelviewer.view.input.SlideScrollGesture
    /* JADX INFO: renamed from: isSliding, reason: from getter */
    public boolean getMIsSliding() {
        return this.mIsSliding;
    }

    public final void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.mIsSliding && event.getPointerCount() == 1) {
            this.mIsSliding = true;
            int x = (int) event.getX(0);
            int y = (int) event.getY(0);
            ISlideScroll mUser = getMUser();
            if (mUser != null) {
                mUser.onSlideStart(0, x, y);
            }
            this.mLastX = x;
            this.mLastY = y;
        }
        if (this.mIsSliding) {
            if (event.getPointerCount() != 1) {
                endSliding();
            } else {
                int x2 = (int) event.getX(0);
                int y2 = (int) event.getY(0);
                this.mDeltaX = x2 - this.mLastX;
                this.mDeltaY = y2 - this.mLastY;
                this.mLastX = x2;
                this.mLastY = y2;
                ISlideScroll mUser2 = getMUser();
                if (mUser2 != null) {
                    mUser2.onSlide(0, x2, y2, this.mDeltaX, this.mDeltaY);
                }
            }
        }
        if (!this.mIsScrolling && event.getPointerCount() == 2) {
            this.mIsScrolling = true;
        }
        if (this.mIsScrolling) {
            if (event.getPointerCount() != 2) {
                endScrolling();
            } else {
                float fMagnitude = Math.INSTANCE.magnitude(event.getX(1) - event.getX(0), event.getY(1) - event.getY(0));
                int pointerId = event.getPointerId(0);
                int pointerId2 = event.getPointerId(1);
                if (this.mLastFirstTouchID != pointerId || this.mLastSecondTouchID != pointerId2) {
                    this.mLastDis = fMagnitude;
                }
                this.mLastFirstTouchID = pointerId;
                this.mLastSecondTouchID = pointerId2;
                this.mScrollValue = fMagnitude - this.mLastDis;
                this.mLastDis = fMagnitude;
                ISlideScroll mUser3 = getMUser();
                if (mUser3 != null) {
                    mUser3.onScroll(this.mScrollValue);
                }
            }
        }
        if (event.getActionMasked() == 3 || event.getActionMasked() == 1) {
            if (this.mIsSliding) {
                endSliding();
            }
            if (this.mIsScrolling) {
                endScrolling();
            }
        }
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Sliding:%b,delta:(%f,%f),scroll:%f", Arrays.copyOf(new Object[]{Boolean.valueOf(this.mIsSliding), Integer.valueOf(this.mDeltaX), Integer.valueOf(this.mDeltaY), Float.valueOf(this.mScrollValue)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
