package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes12.dex */
public interface NearIOverScroller {
    void abortAnimation();

    boolean computeScrollOffset();

    void fling(int i, int i2, int i3, int i4);

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    float getCurrVelocity();

    float getCurrVelocityX();

    float getCurrVelocityY();

    int getNearCurrX();

    int getNearCurrY();

    int getNearFinalX();

    int getNearFinalY();

    boolean isNearFinished();

    boolean isScrollingInDirection(float f, float f2);

    void notifyHorizontalEdgeReached(int i, int i2, int i3);

    void notifyVerticalEdgeReached(int i, int i2, int i3);

    void setCurrVelocityX(float f);

    void setCurrVelocityY(float f);

    void setFinalX(int i);

    void setFinalY(int i);

    void setFlingFriction(float f);

    void setInterpolator(Interpolator interpolator);

    void setIsScrollView(boolean z);

    void setNearFriction(float f);

    boolean springBack(int i, int i2, int i3, int i4, int i5, int i6);

    void startScroll(int i, int i2, int i3, int i4);

    void startScroll(int i, int i2, int i3, int i4, int i5);
}
