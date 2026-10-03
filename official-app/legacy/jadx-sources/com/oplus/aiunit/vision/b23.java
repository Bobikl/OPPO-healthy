package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface b23 {
    void a(z13 z13Var);

    default float b(z13 z13Var) {
        return 0.0f;
    }

    void c(z13 z13Var, Context context, ColorStateList colorStateList, float f, float f2, float f3, float f4, float f5);

    void d(z13 z13Var, float f);

    void e(z13 z13Var, float f);

    ColorStateList f(z13 z13Var);

    float g(z13 z13Var);

    float h(z13 z13Var);

    float i(z13 z13Var);

    void initStatic();

    float j(z13 z13Var);

    float k(z13 z13Var);

    void l(z13 z13Var, @Nullable ColorStateList colorStateList);

    void m(z13 z13Var, float f);

    void n(z13 z13Var);

    float o(z13 z13Var);

    default void p(z13 z13Var, float f) {
    }

    void q(z13 z13Var, float f);
}
