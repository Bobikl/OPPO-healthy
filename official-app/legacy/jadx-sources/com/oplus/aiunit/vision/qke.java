package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public abstract class qke implements pke {
    @Override // com.oplus.aiunit.vision.pke
    public Set<String> a() {
        if (c() != null) {
            return c().keySet();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.pke
    public String[] b(String str) {
        if (c() != null) {
            return c().get(str);
        }
        return null;
    }

    public abstract Map<String, String[]> c();
}
