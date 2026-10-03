package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class nki {
    public static final nki b = new nki(true);
    public final Map<mki, String> a = new HashMap();

    public nki(boolean z) {
        if (z) {
            a(mki.defaultConfig, "default config");
        }
    }

    public static nki c() {
        return b;
    }

    public boolean a(mki mkiVar, String str) {
        if (mkiVar == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        if (str == null) {
            throw new IllegalArgumentException("configName is required");
        }
        if (this.a.containsKey(mkiVar)) {
            return false;
        }
        this.a.put(mkiVar, str);
        return true;
    }

    public Map<mki, String> b() {
        return Collections.unmodifiableMap(this.a);
    }
}
