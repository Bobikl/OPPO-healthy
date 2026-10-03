package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class g60 implements j60 {
    public HashMap<Class<?>, Annotation> i;

    public g60() {
    }

    public g60(HashMap<Class<?>, Annotation> map) {
        this.i = map;
    }

    public static g60 d(g60 g60Var, g60 g60Var2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (g60Var == null || (map = g60Var.i) == null || map.isEmpty()) {
            return g60Var2;
        }
        if (g60Var2 == null || (map2 = g60Var2.i) == null || map2.isEmpty()) {
            return g60Var;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : g60Var2.i.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : g60Var.i.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new g60(map3);
    }

    public static g60 e(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new g60(map);
    }

    public final boolean a(Annotation annotation) {
        if (this.i == null) {
            this.i = new HashMap<>();
        }
        Annotation annotationPut = this.i.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }

    public boolean b(Annotation annotation) {
        return a(annotation);
    }

    public Iterable<Annotation> c() {
        HashMap<Class<?>, Annotation> map = this.i;
        return (map == null || map.size() == 0) ? Collections.emptyList() : this.i.values();
    }

    @Override // com.oplus.aiunit.vision.j60
    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.i;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // com.oplus.aiunit.vision.j60
    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this.i;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // com.oplus.aiunit.vision.j60
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.i != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.i.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.j60
    public int size() {
        HashMap<Class<?>, Annotation> map = this.i;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this.i;
        return map == null ? "[null]" : map.toString();
    }
}
