package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class m5e extends w3 {
    public m5e(i11 i11Var) {
        super(i11Var);
    }

    @Override // com.oplus.aiunit.vision.w3
    @NonNull
    public qd4 d() {
        return new qd4(this.b.e().getHandPaintWfUnique(), 2, lo9.TAG_DEFAULT_CREATION_PAINT, this.b.m().V());
    }

    @Override // com.oplus.aiunit.vision.w3
    public String e(k11 k11Var, String str, int i) {
        i5e i5eVar = (i5e) k11Var;
        return i5eVar.c() + "-" + i5eVar.b() + "-" + (i + 1);
    }
}
