package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes11.dex */
public class btj {
    public final char[] a;
    public final bw7 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cjf f9852c;

    public btj(String str, bw7 bw7Var, ow7 ow7Var) {
        this.a = str.toCharArray();
        this.b = bw7Var;
        Paint paint = new Paint(1);
        paint.setTypeface(bw7Var.g());
        paint.setTextSize(bw7Var.e());
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        this.f9852c = new cjf.a(rect.left, rect.top, rect.width(), rect.height());
    }

    public void a(tb8 tb8Var, int i, int i2) {
        bw7 bw7VarI = tb8Var.i();
        bw7 bw7Var = this.b;
        boolean z = bw7Var != bw7VarI;
        if (z) {
            tb8Var.d(bw7Var);
        }
        char[] cArr = this.a;
        tb8Var.k(cArr, 0, cArr.length, i, i2);
        if (z) {
            tb8Var.d(bw7VarI);
        }
    }

    public cjf b() {
        return this.f9852c;
    }
}
