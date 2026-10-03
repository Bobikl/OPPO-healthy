package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class dd1 extends n92 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10511c;

    public dd1(int i) {
        super(i);
        this.f10511c = i;
    }

    @Override // com.oplus.aiunit.vision.n92, com.oplus.aiunit.vision.ia2
    /* JADX INFO: renamed from: d */
    public Integer b(z92 z92Var) {
        v92 v92VarA = z92Var.a(this.f10511c);
        if (v92VarA != null && !TextUtils.isEmpty(v92VarA.getResult())) {
            String result = v92VarA.getResult();
            try {
                return Integer.valueOf(e1j.f(e1j.e(result.substring(0, 8))) - e1j.f(e1j.e(result.substring(16, 24))));
            } catch (Exception e2) {
                t6b.d(getClass().getName(), "BeiJingCommonBusBalanceParser" + e2.getMessage());
            }
        }
        return null;
    }
}
