package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class dk2 {
    public static final int BORDERLESS_BUTTON_PRESS_FEEDBACK = 1;
    public static final int CARD_PRESS_FEEDBACK = 0;
    public static final float DEFAULT_SPRING_BOUNCE = 0.0f;
    public static final float DEFAULT_SPRING_RESPONSE = 0.3f;
    public static final int FILL_BUTTON_PRESS_FEEDBACK = 2;
    public static final int UNJUMPABLE_CARD_PRESS_FEEDBACK = 0;
    public static final PathInterpolator k = new ti2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final FloatPropertyCompat<dk2> f10595l = new a("viewScaleTransition");
    public boolean a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10596c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10597e;
    public float f;
    public View g;
    public b h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.coui.appcompat.animation.dynamicanimation.b f10598j;

    public class a extends FloatPropertyCompat<dk2> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(dk2 dk2Var) {
            return dk2Var.g();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(dk2 dk2Var, float f) {
            dk2Var.k(f);
        }
    }

    public interface b {
        default int getTargetHeight() {
            return 0;
        }

        default int getTargetWidth() {
            return 0;
        }

        default void onScaleUpdate(float f) {
        }
    }

    public dk2(@NonNull View view) {
        this(view, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        k(f);
    }

    public final void d() {
        if (this.f10598j != null) {
            return;
        }
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.3f);
        com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, f10595l);
        this.f10598j = bVar;
        bVar.E(cVar);
        this.f10598j.b(new COUIDynamicAnimation.r() { // from class: com.oplus.aiunit.vision.ck2
            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
            public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                this.a.i(cOUIDynamicAnimation, f, f2);
            }
        });
    }

    public void e(boolean z) {
        if (this.a) {
            d();
            this.f10598j.x(z ? 10000.0f : 0.0f);
        }
    }

    public final float f() {
        int targetWidth;
        int targetHeight;
        View view = this.g;
        if (view != null) {
            targetWidth = view.getWidth();
            targetHeight = this.g.getHeight();
        } else {
            b bVar = this.h;
            if (bVar == null) {
                return 1.0f;
            }
            targetWidth = bVar.getTargetWidth();
            targetHeight = this.h.getTargetHeight();
        }
        float f = this.b * this.f10596c;
        if (f <= 0.0f) {
            f = targetWidth * targetHeight;
        }
        float f2 = this.d;
        if (f <= f2) {
            return 0.92f;
        }
        float f3 = this.f10597e;
        if (f >= f3) {
            return 0.98f;
        }
        return (k.getInterpolation((f - f2) / (f3 - f2)) * 0.060000002f) + 0.92f;
    }

    public final float g() {
        return this.f;
    }

    public final float h() {
        return 1.0f - ((1.0f - f()) * (this.f / 10000.0f));
    }

    public void j(b bVar) {
        this.h = bVar;
    }

    public final void k(float f) {
        if (this.g == null && this.h == null) {
            bj2.g("COUIPressFeedbackHelper", "press effect target is null!");
            return;
        }
        float fH = h();
        this.f = f;
        View view = this.g;
        if (view == null) {
            b bVar = this.h;
            if (bVar != null) {
                bVar.onScaleUpdate(fH);
                return;
            }
            return;
        }
        view.setPivotX(view.getWidth() / 2.0f);
        View view2 = this.g;
        view2.setPivotY(view2.getHeight() / 2.0f);
        this.g.setScaleX(fH);
        this.g.setScaleY(fH);
    }

    public void l(View view) {
        this.g = view;
    }

    public void m(int i) {
        this.i = i;
    }

    public final void n(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_min_end_value_size);
        this.d = dimensionPixelOffset * dimensionPixelOffset;
        this.f10597e = context.getResources().getDimensionPixelOffset(R$dimen.coui_max_end_value_width) * context.getResources().getDimensionPixelOffset(R$dimen.coui_max_end_value_height);
    }

    public dk2(View view, int i) {
        this.a = true;
        this.b = 0.0f;
        this.f10596c = 0.0f;
        this.d = 0.0f;
        this.f10597e = 0.0f;
        this.i = i;
        l(view);
        n(view.getContext());
    }

    public dk2(Context context) {
        this(context, 0);
    }

    public dk2(Context context, int i) {
        this.a = true;
        this.b = 0.0f;
        this.f10596c = 0.0f;
        this.d = 0.0f;
        this.f10597e = 0.0f;
        this.i = i;
        n(context);
    }
}
