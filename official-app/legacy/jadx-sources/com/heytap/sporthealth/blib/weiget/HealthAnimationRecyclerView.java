package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes2.dex */
public class HealthAnimationRecyclerView extends RecyclerView {
    public HealthAnimationRecyclerView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        boolean z;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (getAdapter() == null || !((z = layoutManager instanceof GridLayoutManager))) {
            super.attachLayoutAnimationParameters(view, layoutParams, i, i2);
            a7b.f("yolanda", "i am here");
            return;
        }
        GridLayoutAnimationController.AnimationParameters animationParameters = (GridLayoutAnimationController.AnimationParameters) layoutParams.layoutAnimationParameters;
        if (animationParameters == null) {
            animationParameters = new GridLayoutAnimationController.AnimationParameters();
            layoutParams.layoutAnimationParameters = animationParameters;
        }
        int spanCount = z ? ((GridLayoutManager) layoutManager).getSpanCount() : 0;
        animationParameters.count = i2;
        animationParameters.index = i;
        animationParameters.columnsCount = spanCount;
        int i3 = i2 / spanCount;
        animationParameters.rowsCount = i3;
        animationParameters.row = (i3 - 1) - (((i2 - 1) - i) / spanCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public HealthAnimationRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthAnimationRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
