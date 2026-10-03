package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class ed3 extends w3 {
    public ed3(i11 i11Var) {
        super(i11Var);
    }

    @Override // com.oplus.aiunit.vision.w3
    @NonNull
    public qd4 d() {
        return new qd4(this.b.e().getClassicWfUnique(), 5, lo9.TAG_DEFAULT_CREATION_CLASSIC, this.b.m().x());
    }

    @Override // com.oplus.aiunit.vision.w3
    public String e(k11 k11Var, String str, int i) {
        return ((dd3) k11Var).b().getSeriesId();
    }
}
