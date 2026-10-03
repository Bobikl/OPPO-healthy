package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class xde {
    public static final List<xde> d = new ArrayList();
    public Object a;
    public d3j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xde f18589c;

    public xde(Object obj, d3j d3jVar) {
        this.a = obj;
        this.b = d3jVar;
    }

    public static xde a(d3j d3jVar, Object obj) {
        List<xde> list = d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new xde(obj, d3jVar);
            }
            xde xdeVarRemove = list.remove(size - 1);
            xdeVarRemove.a = obj;
            xdeVarRemove.b = d3jVar;
            xdeVarRemove.f18589c = null;
            return xdeVarRemove;
        }
    }

    public static void b(xde xdeVar) {
        xdeVar.a = null;
        xdeVar.b = null;
        xdeVar.f18589c = null;
        List<xde> list = d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(xdeVar);
            }
        }
    }
}
