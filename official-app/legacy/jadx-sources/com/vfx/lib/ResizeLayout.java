package com.vfx.lib;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ResizeLayout extends FrameLayout {
    private boolean mEnableForceDoLayout;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ResizeLayout.this.requestLayout();
            ResizeLayout.this.invalidate();
        }
    }

    public ResizeLayout(Context context) {
        super(context, null);
        this.mEnableForceDoLayout = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setBackgroundColor(Color.parseColor("#00FFFFFF"));
        if (this.mEnableForceDoLayout) {
            new Handler().postDelayed(new a(), 41L);
        }
    }

    public void setEnableForceDoLayout(boolean z) {
        this.mEnableForceDoLayout = z;
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableForceDoLayout = false;
    }
}
