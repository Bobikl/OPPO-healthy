package com.oplus.aiunit.vision;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
public class ika implements pka {
    public pka a;

    public static final class a {
        public static ika a = new ika();
    }

    public static ika c() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.pka
    public String a(Object obj) {
        pka pkaVar = this.a;
        if (pkaVar == null) {
            return null;
        }
        return pkaVar.a(obj);
    }

    @Override // com.oplus.aiunit.vision.pka
    public <T> T b(String str, Type type) {
        pka pkaVar = this.a;
        if (pkaVar == null) {
            return null;
        }
        return (T) pkaVar.b(str, type);
    }

    public void d(pka pkaVar) {
        this.a = pkaVar;
    }

    public ika() {
    }
}
