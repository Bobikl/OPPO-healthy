package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class c60 implements Iterable<AnnotatedMethod> {
    public Map<dsb, AnnotatedMethod> i;

    public c60() {
    }

    public c60(Map<dsb, AnnotatedMethod> map) {
        this.i = map;
    }

    public AnnotatedMethod a(String str, Class<?>[] clsArr) {
        Map<dsb, AnnotatedMethod> map = this.i;
        if (map == null) {
            return null;
        }
        return map.get(new dsb(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotatedMethod> iterator() {
        Map<dsb, AnnotatedMethod> map = this.i;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }
}
