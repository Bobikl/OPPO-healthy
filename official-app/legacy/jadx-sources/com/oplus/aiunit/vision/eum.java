package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes12.dex */
public class eum {
    public Stack<com.alipay.sdk.m.x.e> a = new Stack<>();

    public void a() {
        if (c()) {
            return;
        }
        Iterator<com.alipay.sdk.m.x.e> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.a.clear();
    }

    public void b(com.alipay.sdk.m.x.e eVar) {
        this.a.push(eVar);
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public com.alipay.sdk.m.x.e d() {
        return this.a.pop();
    }
}
