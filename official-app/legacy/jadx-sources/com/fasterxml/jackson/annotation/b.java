package com.fasterxml.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b implements a {
    public Map<ObjectIdGenerator.IdKey, Object> a;

    @Override // com.fasterxml.jackson.annotation.a
    public void a(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.a;
        if (map == null) {
            this.a = new HashMap();
        } else {
            Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
            }
        }
        this.a.put(idKey, obj);
    }

    @Override // com.fasterxml.jackson.annotation.a
    public Object b(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // com.fasterxml.jackson.annotation.a
    public a c(Object obj) {
        return new b();
    }

    @Override // com.fasterxml.jackson.annotation.a
    public boolean d(a aVar) {
        return aVar.getClass() == getClass();
    }
}
