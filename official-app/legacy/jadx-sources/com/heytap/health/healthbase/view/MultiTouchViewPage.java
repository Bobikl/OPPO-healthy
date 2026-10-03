package com.heytap.health.healthbase.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes16.dex */
public class MultiTouchViewPage extends ViewPager {
    public MultiTouchViewPage(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            a7b.b("MultiTouchViewPage", "onInterceptTouchEvent:" + e2.toString());
            return false;
        }
    }

    public MultiTouchViewPage(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
