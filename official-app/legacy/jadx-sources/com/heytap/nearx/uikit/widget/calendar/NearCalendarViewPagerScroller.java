package com.heytap.nearx.uikit.widget.calendar;

import android.content.Context;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarViewPagerScroller extends Scroller {
    private static final Interpolator ANIM_INTERPOLATOR = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
    private int mDuration;

    public NearCalendarViewPagerScroller(Context context) {
        this(context, ANIM_INTERPOLATOR);
    }

    public int getmDuration() {
        return this.mDuration;
    }

    public void setmDuration(int i) {
        this.mDuration = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.mDuration);
    }

    public NearCalendarViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mDuration = 300;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.mDuration);
    }
}
