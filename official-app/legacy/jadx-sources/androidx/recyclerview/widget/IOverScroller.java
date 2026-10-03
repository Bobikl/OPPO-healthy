package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes12.dex */
public interface IOverScroller {
    void abortAnimation();

    boolean computeScrollOffset();

    void fling(int i, int i2, int i3, int i4);

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    float getCurrVelocity();

    float getCurrVelocityX();

    float getCurrVelocityY();

    int getTheme1CurrX();

    int getTheme1CurrY();

    int getTheme1FinalX();

    int getTheme1FinalY();

    boolean isScrollingInDirection(float f, float f2);

    boolean isTheme1Finished();

    void notifyHorizontalEdgeReached(int i, int i2, int i3);

    void notifyVerticalEdgeReached(int i, int i2, int i3);

    void setCurrVelocityX(float f);

    void setCurrVelocityY(float f);

    void setFlingFriction(float f);

    void setInterpolator(Interpolator interpolator);

    void setIsScrollView(boolean z);

    void setTheme1FinalX(int i);

    void setTheme1FinalY(int i);

    void setTheme1Friction(float f);

    boolean springBack(int i, int i2, int i3, int i4, int i5, int i6);

    void startScroll(int i, int i2, int i3, int i4);

    void startScroll(int i, int i2, int i3, int i4, int i5);
}
