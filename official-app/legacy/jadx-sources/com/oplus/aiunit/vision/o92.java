package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class o92 implements ia2<Integer> {
    public static final o92 b = new o92();
    public int a;

    public o92() {
        this.a = 1200;
    }

    @Override // com.oplus.aiunit.vision.ia2
    public int a() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.ia2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer b(z92 z92Var) {
        v92 v92VarA = z92Var.a(this.a);
        if (v92VarA == null || TextUtils.isEmpty(v92VarA.getResult())) {
            return null;
        }
        String result = v92VarA.getResult();
        return Integer.valueOf(e1j.f(e1j.e(result.substring(0, result.length() - 4))));
    }

    public o92(int i) {
        this.a = i;
    }
}
