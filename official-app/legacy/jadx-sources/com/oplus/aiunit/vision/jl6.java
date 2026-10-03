package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;

/* JADX INFO: loaded from: classes11.dex */
public class jl6 extends ufa {
    public final String k;

    public jl6(int i, int i2, String str) {
        super(i, i2);
        this.k = str;
    }

    public String d() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.ufa
    public String toString() {
        return super.toString() + HttpUtils.EQUAL_SIGN + this.k;
    }
}
