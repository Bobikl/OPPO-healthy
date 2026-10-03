package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;

/* JADX INFO: loaded from: classes8.dex */
public class mgf {
    public yv9 a;

    public mgf(a6k a6kVar) {
        if (GlobalConfigHelper.INSTANCE.f()) {
            this.a = new kgf(a6kVar);
        } else {
            this.a = new lgf();
        }
    }

    public yv9 a() {
        return this.a;
    }
}
