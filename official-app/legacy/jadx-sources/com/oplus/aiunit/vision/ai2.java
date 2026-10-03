package com.oplus.aiunit.vision;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.coui.appcompat.floatingactionbutton.COUIFloatingButton;
import com.oplus.animation.OplusViewSeamless;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class ai2 {
    public static final Interpolator d = new vi2();
    public Bundle a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f9373c;

    public class a extends OplusViewSeamless.AnimationCallback {
        public a() {
        }

        public void animationProgress(float f) {
            if ((f != 0.0f && f != 1.0f) || ai2.this.b == null || ai2.this.b.getContext() == null) {
                return;
            }
            float dimensionPixelSize = ai2.this.b.getContext().getResources().getDimensionPixelSize(R$dimen.coui_float_btn_shadow_elevation);
            if (ai2.this.f9373c != null) {
                ai2.this.f9373c.cancel();
            }
            ai2 ai2Var = ai2.this;
            ai2Var.f9373c = ObjectAnimator.ofFloat(ai2Var.b, "elevation", 0.0f, dimensionPixelSize);
            ai2.this.f9373c.setDuration(200L);
            ai2.this.f9373c.setInterpolator(ai2.d);
            ai2.this.f9373c.start();
        }
    }

    public void e() {
        ObjectAnimator objectAnimator = this.f9373c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f9373c = null;
        }
        this.b = null;
    }

    @Nullable
    public Bundle f() {
        return this.a;
    }

    public void g(View view) {
        if (COUIFloatingButton.k0()) {
            if (this.a == null) {
                this.a = new Bundle();
            }
            this.a.putBoolean("view_seamless_open", true);
            this.a.putFloat("view_seamless_radius", view.getWidth() / 2.0f);
            this.a.putFloatArray("view_seamless_param", new float[]{400.0f, 1.1f, 250.0f, 0.85f});
            this.b = view;
            if (OplusViewSeamless.setSeamlessView(view, view.getContext(), this.a, new a())) {
                return;
            }
            this.a = null;
        }
    }
}
