package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 21)
public abstract class kkc {
    public final lkc a;
    public final Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13324c;
    public float d;

    public kkc(lkc lkcVar, Rect rect) {
        this.a = lkcVar;
        this.b = rect;
    }

    public static float b(Rect rect) {
        float fWidth = rect.width() / 2.0f;
        float fHeight = rect.height() / 2.0f;
        return (float) Math.sqrt((fWidth * fWidth) + (fHeight * fHeight));
    }

    public void a(Rect rect) {
        int iCeil = (int) Math.ceil(this.d);
        int i = -iCeil;
        rect.set(i, i, iCeil, iCeil);
    }

    public final void c() {
        this.a.invalidateSelf();
    }

    public void d() {
        if (this.f13324c) {
            return;
        }
        float fB = b(this.b);
        this.d = fB;
        f(fB);
    }

    public final void e() {
        if (this.f13324c) {
            return;
        }
        float fB = b(this.b);
        this.d = fB;
        f(fB);
    }

    public void f(float f) {
    }

    public final void g(float f) {
        if (f >= 0.0f) {
            this.f13324c = true;
            this.d = f;
        } else {
            this.d = b(this.b);
        }
        f(this.d);
    }
}
