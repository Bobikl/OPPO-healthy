package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class hm2 extends LayerDrawable implements oy9 {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12199j;
    public dk2 k;

    public hm2(@NonNull Drawable[] drawableArr) {
        super(drawableArr);
        this.i = true;
        this.f12199j = false;
    }

    public void a() {
        this.f12199j = false;
        dk2 dk2Var = this.k;
        if (dk2Var != null) {
            dk2Var.l(null);
        }
    }

    public void b(View view) {
        c(view, 0);
    }

    public void c(View view, int i) {
        this.f12199j = true;
        dk2 dk2Var = this.k;
        if (dk2Var == null) {
            this.k = new dk2(view, i);
        } else {
            dk2Var.l(view);
            this.k.m(i);
        }
    }

    public void d(boolean z) {
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof c56) {
                if (z) {
                    ((c56) drawable).j();
                } else {
                    ((c56) drawable).b();
                }
            }
        }
    }

    public void e(boolean z) {
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof c56) {
                if (z) {
                    ((c56) drawable).c();
                } else {
                    ((c56) drawable).i();
                }
            }
        }
    }

    public void f(int i, boolean z, boolean z2, boolean z3) {
        for (int i2 = 0; i2 < getNumberOfLayers(); i2++) {
            Object drawable = getDrawable(i2);
            if (drawable instanceof c56) {
                ((c56) drawable).d(i, z, z2, z3);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void g(boolean z) {
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof oy9) {
                ((oy9) drawable).g(z);
            }
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void h(Context context) {
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof oy9) {
                ((oy9) drawable).h(context);
            }
        }
    }

    public void i(boolean z) {
        dk2 dk2Var;
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof c56) {
                if (z) {
                    ((c56) drawable).a();
                } else {
                    ((c56) drawable).f();
                }
            }
        }
        if (this.i && this.f12199j && (dk2Var = this.k) != null) {
            dk2Var.e(z);
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public void j(Drawable drawable) {
        if (drawable == this) {
            bj2.c("StateEffectDrawable", "Set view background failed! Should not set LayerDrawable itself as its child recusively!");
        } else {
            setDrawableByLayerId(getId(0), drawable);
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == 16842910) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.i) {
            this.i = z;
            if (!z) {
                dk2 dk2Var = this.k;
                if (dk2Var != null) {
                    dk2Var.e(false);
                }
                reset();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // com.oplus.aiunit.vision.oy9
    public void reset() {
        for (int i = 0; i < getNumberOfLayers(); i++) {
            Object drawable = getDrawable(i);
            if (drawable instanceof oy9) {
                ((oy9) drawable).reset();
            }
        }
    }
}
