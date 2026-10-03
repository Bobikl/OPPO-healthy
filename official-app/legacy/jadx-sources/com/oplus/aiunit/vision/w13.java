package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(21)
public class w13 implements b23 {
    @Override // com.oplus.aiunit.vision.b23
    public void a(z13 z13Var) {
        m(z13Var, g(z13Var));
    }

    @Override // com.oplus.aiunit.vision.b23
    public float b(z13 z13Var) {
        return r(z13Var).d();
    }

    @Override // com.oplus.aiunit.vision.b23
    public void c(z13 z13Var, Context context, ColorStateList colorStateList, float f, float f2, float f3, float f4, float f5) {
        z13Var.setCardBackground(new dyf(colorStateList, f, f4, f5));
        View cardView = z13Var.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        m(z13Var, f3);
    }

    @Override // com.oplus.aiunit.vision.b23
    public void d(z13 z13Var, float f) {
        r(z13Var).p(f);
    }

    @Override // com.oplus.aiunit.vision.b23
    public void e(z13 z13Var, float f) {
        z13Var.getCardView().setElevation(f);
    }

    @Override // com.oplus.aiunit.vision.b23
    public ColorStateList f(z13 z13Var) {
        return r(z13Var).e();
    }

    @Override // com.oplus.aiunit.vision.b23
    public float g(z13 z13Var) {
        return r(z13Var).f();
    }

    @Override // com.oplus.aiunit.vision.b23
    public float h(z13 z13Var) {
        return r(z13Var).g();
    }

    @Override // com.oplus.aiunit.vision.b23
    public float i(z13 z13Var) {
        return z13Var.getCardView().getElevation();
    }

    @Override // com.oplus.aiunit.vision.b23
    public void initStatic() {
    }

    @Override // com.oplus.aiunit.vision.b23
    public float j(z13 z13Var) {
        return h(z13Var) * 2.0f;
    }

    @Override // com.oplus.aiunit.vision.b23
    public float k(z13 z13Var) {
        return h(z13Var) * 2.0f;
    }

    @Override // com.oplus.aiunit.vision.b23
    public void l(z13 z13Var, @Nullable ColorStateList colorStateList) {
        r(z13Var).m(colorStateList);
    }

    @Override // com.oplus.aiunit.vision.b23
    public void m(z13 z13Var, float f) {
        r(z13Var).n(f, z13Var.getUseCompatPadding(), z13Var.getPreventCornerOverlap());
        s(z13Var);
    }

    @Override // com.oplus.aiunit.vision.b23
    public void n(z13 z13Var) {
        m(z13Var, g(z13Var));
    }

    @Override // com.oplus.aiunit.vision.b23
    public float o(z13 z13Var) {
        return r(z13Var).h();
    }

    @Override // com.oplus.aiunit.vision.b23
    public void p(z13 z13Var, float f) {
        r(z13Var).l(f);
    }

    @Override // com.oplus.aiunit.vision.b23
    public void q(z13 z13Var, float f) {
        r(z13Var).o(f);
    }

    public final dyf r(z13 z13Var) {
        return (dyf) z13Var.getCardBackground();
    }

    public void s(z13 z13Var) {
        if (!z13Var.getUseCompatPadding()) {
            z13Var.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fG = g(z13Var);
        float fH = h(z13Var);
        int iCeil = (int) Math.ceil(eyf.a(fG, fH, z13Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(eyf.b(fG, fH, z13Var.getPreventCornerOverlap()));
        z13Var.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
