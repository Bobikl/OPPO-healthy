package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class fjg {
    public static void a(float f, float f2, float f3, float f4, boolean z) {
        b(f, f2, f3, f4, z, false);
    }

    public static void b(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        x38.gl.P(f, f2, f3, f4);
        int i = z ? 16640 : 16384;
        if (z2 && x38.graphics.e().h) {
            i |= 32768;
        }
        x38.gl.g(i);
    }

    public static void c(mk3 mk3Var) {
        a(mk3Var.a, mk3Var.b, mk3Var.f14109c, mk3Var.d, false);
    }
}
