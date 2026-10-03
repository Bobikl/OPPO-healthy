package com.coui.appcompat.scroll;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.vk2;

/* JADX INFO: loaded from: classes13.dex */
public class COUINestedScrollableChild extends COUINestedScrollableHost {
    public COUINestedScrollableChild(@NonNull Context context) {
        super(context);
    }

    @Override // com.coui.appcompat.scroll.COUINestedScrollableHost
    public void c() {
        this.m = a(this.o);
    }

    @Override // com.coui.appcompat.scroll.COUINestedScrollableHost
    public void f(MotionEvent motionEvent) {
        vk2<?> vk2Var = this.m;
        if (vk2Var == null) {
            return;
        }
        int orientation = vk2Var.getOrientation();
        if (this.m.a(orientation, -1) || this.m.a(orientation, 1)) {
            if (motionEvent.getAction() == 0) {
                this.f2004j.x = motionEvent.getX();
                this.f2004j.y = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (motionEvent.getAction() == 2) {
                this.k.x = motionEvent.getX();
                this.k.y = motionEvent.getY();
                PointF pointF = this.k;
                float f = pointF.x;
                PointF pointF2 = this.f2004j;
                float f2 = f - pointF2.x;
                float f3 = pointF.y - pointF2.y;
                boolean z = orientation == 0;
                float fAbs = Math.abs(f2) * (z ? 0.5f : 1.0f);
                float fAbs2 = Math.abs(f3) * (z ? 1.0f : 0.5f);
                int i = this.i;
                if (fAbs > i || fAbs2 > i) {
                    if (z != (fAbs > fAbs2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    if (this.m.a(orientation, z ? (int) f2 : (int) f3)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    @Override // com.coui.appcompat.scroll.COUINestedScrollableHost, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public COUINestedScrollableChild(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public COUINestedScrollableChild(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
