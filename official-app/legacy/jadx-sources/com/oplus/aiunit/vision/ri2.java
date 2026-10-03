package com.oplus.aiunit.vision;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes13.dex */
public interface ri2 {
    int a();

    void abortAnimation();

    int b();

    int c();

    boolean computeScrollOffset();

    int d();

    boolean e();

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    float getCurrVelocityX();

    float getCurrVelocityY();

    void notifyHorizontalEdgeReached(int i, int i2, int i3);

    void notifyVerticalEdgeReached(int i, int i2, int i3);

    void setCurrVelocityX(float f);

    void setCurrVelocityY(float f);

    void setFinalX(int i);

    void setInterpolator(Interpolator interpolator);

    boolean springBack(int i, int i2, int i3, int i4, int i5, int i6);

    void startScroll(int i, int i2, int i3, int i4);

    void startScroll(int i, int i2, int i3, int i4, int i5);
}
