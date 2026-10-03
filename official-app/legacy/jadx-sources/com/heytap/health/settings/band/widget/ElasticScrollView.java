package com.heytap.health.settings.band.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes17.dex */
public class ElasticScrollView extends NestedScrollView {
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f5338j;
    public float k;

    public ElasticScrollView(Context context) {
        super(context);
        this.i = new Rect();
    }

    public final boolean a() {
        return getScrollY() == 0 || this.f5338j.getTop() > this.i.top;
    }

    public final boolean b() {
        return this.f5338j.getHeight() <= getHeight() + getScrollY() || this.f5338j.getTop() < this.i.top;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            this.f5338j = getChildAt(0);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f5338j;
        if (view == null) {
            return;
        }
        this.i.set(view.getLeft(), this.f5338j.getTop(), this.f5338j.getRight(), this.f5338j.getBottom());
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5338j == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                boolean zA = a();
                boolean zB = b();
                if (zA || zB) {
                    int y = (int) (motionEvent.getY() - this.k);
                    if ((zA && y > 0) || (zB && y < 0) || (zB && zA)) {
                        int i = (int) (y * 0.5f);
                        View view = this.f5338j;
                        Rect rect = this.i;
                        view.layout(rect.left, rect.top + i, rect.right, rect.bottom + i);
                        return true;
                    }
                    View view2 = this.f5338j;
                    Rect rect2 = this.i;
                    view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                } else {
                    this.k = motionEvent.getY();
                }
            }
        } else if (this.f5338j.getTop() != this.i.top) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f5338j.getTop(), this.i.top);
            translateAnimation.setDuration(300L);
            this.f5338j.startAnimation(translateAnimation);
            View view3 = this.f5338j;
            Rect rect3 = this.i;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ElasticScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
    }
}
