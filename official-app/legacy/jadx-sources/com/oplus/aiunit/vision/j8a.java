package com.oplus.aiunit.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class j8a implements i8a {
    public final List<b95> a;
    public final Map<String, oxa> b;

    public j8a(List<b95> list, Map<String, oxa> map) {
        this.a = list;
        this.b = map;
    }

    @Override // com.oplus.aiunit.vision.i8a
    public oxa a(String str) {
        return this.b.get(str);
    }

    @Override // com.oplus.aiunit.vision.i8a
    public List<b95> b() {
        return this.a;
    }
}
