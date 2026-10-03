package com.oplus.aiunit.vision;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class v2f implements wpf {
    public final ConcurrentHashMap<String, t76> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, p2f> b = new ConcurrentHashMap<>();

    @Override // com.oplus.aiunit.vision.wpf
    public t76 a(String str) {
        return this.a.get(str);
    }

    @Override // com.oplus.aiunit.vision.wpf
    public p2f b(String str) {
        return this.b.get(str);
    }
}
