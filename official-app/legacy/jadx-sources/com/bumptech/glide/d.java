package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    public final Map<Class<?>, Object> a;

    public static final class a {
        public final Map<Class<?>, Object> a = new HashMap();

        public d b() {
            return new d(this);
        }
    }

    public d(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public boolean a(Class<Object> cls) {
        return this.a.containsKey(cls);
    }
}
