package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class tia {
    public final Map<ona, com.bumptech.glide.load.engine.g<?>> a = new HashMap();
    public final Map<ona, com.bumptech.glide.load.engine.g<?>> b = new HashMap();

    public com.bumptech.glide.load.engine.g<?> a(ona onaVar, boolean z) {
        return b(z).get(onaVar);
    }

    public final Map<ona, com.bumptech.glide.load.engine.g<?>> b(boolean z) {
        return z ? this.b : this.a;
    }

    public void c(ona onaVar, com.bumptech.glide.load.engine.g<?> gVar) {
        b(gVar.p()).put(onaVar, gVar);
    }

    public void d(ona onaVar, com.bumptech.glide.load.engine.g<?> gVar) {
        Map<ona, com.bumptech.glide.load.engine.g<?>> mapB = b(gVar.p());
        if (gVar.equals(mapB.get(onaVar))) {
            mapB.remove(onaVar);
        }
    }
}
