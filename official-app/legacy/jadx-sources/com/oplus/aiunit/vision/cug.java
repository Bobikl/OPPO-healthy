package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class cug {
    public final HashMap<qdk, yla<Object>> a = new HashMap<>(64);
    public final AtomicReference<wbf> b = new AtomicReference<>();

    public final synchronized wbf a() {
        wbf wbfVarB;
        wbfVarB = this.b.get();
        if (wbfVarB == null) {
            wbfVarB = wbf.b(this.a);
            this.b.set(wbfVarB);
        }
        return wbfVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(JavaType javaType, yla<Object> ylaVar, eug eugVar) throws JsonMappingException {
        synchronized (this) {
            if (this.a.put(new qdk(javaType, false), ylaVar) == null) {
                this.b.set(null);
            }
            if (ylaVar instanceof rsf) {
                ((rsf) ylaVar).resolve(eugVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Class<?> cls, JavaType javaType, yla<Object> ylaVar, eug eugVar) throws JsonMappingException {
        synchronized (this) {
            yla<Object> ylaVarPut = this.a.put(new qdk(cls, false), ylaVar);
            yla<Object> ylaVarPut2 = this.a.put(new qdk(javaType, false), ylaVar);
            if (ylaVarPut == null || ylaVarPut2 == null) {
                this.b.set(null);
            }
            if (ylaVar instanceof rsf) {
                ((rsf) ylaVar).resolve(eugVar);
            }
        }
    }

    public void d(JavaType javaType, yla<Object> ylaVar) {
        synchronized (this) {
            if (this.a.put(new qdk(javaType, true), ylaVar) == null) {
                this.b.set(null);
            }
        }
    }

    public void e(Class<?> cls, yla<Object> ylaVar) {
        synchronized (this) {
            if (this.a.put(new qdk(cls, true), ylaVar) == null) {
                this.b.set(null);
            }
        }
    }

    public synchronized void f() {
        this.a.clear();
    }

    public wbf g() {
        wbf wbfVar = this.b.get();
        return wbfVar != null ? wbfVar : a();
    }

    public synchronized int h() {
        return this.a.size();
    }

    public yla<Object> i(JavaType javaType) {
        yla<Object> ylaVar;
        synchronized (this) {
            ylaVar = this.a.get(new qdk(javaType, true));
        }
        return ylaVar;
    }

    public yla<Object> j(Class<?> cls) {
        yla<Object> ylaVar;
        synchronized (this) {
            ylaVar = this.a.get(new qdk(cls, true));
        }
        return ylaVar;
    }

    public yla<Object> k(JavaType javaType) {
        yla<Object> ylaVar;
        synchronized (this) {
            ylaVar = this.a.get(new qdk(javaType, false));
        }
        return ylaVar;
    }

    public yla<Object> l(Class<?> cls) {
        yla<Object> ylaVar;
        synchronized (this) {
            ylaVar = this.a.get(new qdk(cls, false));
        }
        return ylaVar;
    }
}
