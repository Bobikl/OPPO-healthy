package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public Object a;
    public final ObjectIdGenerator.IdKey b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<AbstractC0213a> f2255c;
    public com.fasterxml.jackson.annotation.a d;

    public a(ObjectIdGenerator.IdKey idKey) {
        this.b = idKey;
    }

    public void a(AbstractC0213a abstractC0213a) {
        if (this.f2255c == null) {
            this.f2255c = new LinkedList<>();
        }
        this.f2255c.add(abstractC0213a);
    }

    public void b(Object obj) throws IOException {
        this.d.a(this.b, obj);
        this.a = obj;
        Object obj2 = this.b.key;
        LinkedList<AbstractC0213a> linkedList = this.f2255c;
        if (linkedList != null) {
            Iterator<AbstractC0213a> it = linkedList.iterator();
            this.f2255c = null;
            while (it.hasNext()) {
                it.next().c(obj2, obj);
            }
        }
    }

    public ObjectIdGenerator.IdKey c() {
        return this.b;
    }

    public boolean d() {
        LinkedList<AbstractC0213a> linkedList = this.f2255c;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<AbstractC0213a> e() {
        LinkedList<AbstractC0213a> linkedList = this.f2255c;
        return linkedList == null ? Collections.emptyList().iterator() : linkedList.iterator();
    }

    public Object f() {
        Object objB = this.d.b(this.b);
        this.a = objB;
        return objB;
    }

    public void g(com.fasterxml.jackson.annotation.a aVar) {
        this.d = aVar;
    }

    public boolean h(DeserializationContext deserializationContext) {
        return false;
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0213a {
        public final UnresolvedForwardReference a;
        public final Class<?> b;

        public AbstractC0213a(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.a = unresolvedForwardReference;
            this.b = cls;
        }

        public Class<?> a() {
            return this.b;
        }

        public JsonLocation b() {
            return this.a.getLocation();
        }

        public abstract void c(Object obj, Object obj2) throws IOException;

        public boolean d(Object obj) {
            return obj.equals(this.a.getUnresolvedId());
        }

        public AbstractC0213a(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.a = unresolvedForwardReference;
            this.b = javaType.getRawClass();
        }
    }
}
