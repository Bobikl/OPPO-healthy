package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class nmm extends jaf.a {
    public Map<String, String> a = new HashMap();
    public Map<String, String> b = new HashMap();
    public Map<String, String> c = null;
    public Map<String, String> d = null;
    public kt2 e;
    public String f;

    public nmm(String str, String str2) {
        i(str);
        j(str2);
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.c a() {
        return new eum(this);
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a b(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a c(String str, String str2) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a d(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a e(String str, String str2) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a f(kt2 kt2Var) {
        this.e = kt2Var;
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a g(String str) {
        this.f = str;
        return this;
    }

    @Override // com.oplus.aiunit.vision.jaf.a
    public jaf.a h() {
        this.b.put("sgtp", erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
        return this;
    }

    public final jaf.a i(String str) {
        this.b.put("origin", str);
        return this;
    }

    public final jaf.a j(String str) {
        this.b.put("secret", str);
        return this;
    }
}
