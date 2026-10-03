package com.heytap.health.core.webservice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.coui.appcompat.progressbar.COUIHorizontalProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class BrowserProgressBar extends COUIHorizontalProgressBar {
    public static final String TAG = "BrowserProgressBar";
    public Animation w;

    public class a extends Animation {
        public a() {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BrowserProgressBar.this.setVisibility(0);
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fCos;
            if (f <= 0.8f) {
                float f2 = (1.25f * f) - 1.0f;
                fCos = ((f2 * f2 * f2) + 1.0f) * 0.8f;
            } else {
                fCos = ((float) (Math.cos(((double) (1.0f + f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
            }
            int i = (int) (100.0f * fCos);
            if (f != 0.0f) {
                BrowserProgressBar.this.setProgress(i);
            }
            return fCos;
        }

        public c() {
        }
    }

    public BrowserProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public final void c() {
        a aVar = new a();
        this.w = aVar;
        aVar.setInterpolator(new c());
        this.w.setDuration(5000L);
        this.w.setAnimationListener(new b());
    }

    public void d() {
        setProgress(0);
        startAnimation(this.w);
    }

    public void e() {
        Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    public BrowserProgressBar(@NotNull Context context) {
        super(context);
        c();
    }
}
