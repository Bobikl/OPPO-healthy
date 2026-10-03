package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.glutils.HdpiMode;

/* JADX INFO: loaded from: classes13.dex */
public class rh8 {
    public static HdpiMode a = HdpiMode.Logical;

    public static void a(int i, int i2, int i3, int i4) {
        if (a != HdpiMode.Logical || (x38.graphics.getWidth() == x38.graphics.d() && x38.graphics.getHeight() == x38.graphics.h())) {
            x38.gl.l(i, i2, i3, i4);
        } else {
            x38.gl.l(b(i), c(i2), b(i3), c(i4));
        }
    }

    public static int b(int i) {
        return (int) ((i * x38.graphics.d()) / x38.graphics.getWidth());
    }

    public static int c(int i) {
        return (int) ((i * x38.graphics.h()) / x38.graphics.getHeight());
    }
}
