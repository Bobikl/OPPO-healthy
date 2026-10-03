package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class wbf {
    public final a[] a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18207c;

    public static final class a {
        public final yla<Object> a;
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f18208c;
        public final JavaType d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18209e;

        public a(a aVar, qdk qdkVar, yla<Object> ylaVar) {
            this.b = aVar;
            this.a = ylaVar;
            this.f18209e = qdkVar.c();
            this.f18208c = qdkVar.a();
            this.d = qdkVar.b();
        }

        public boolean a(JavaType javaType) {
            return this.f18209e && javaType.equals(this.d);
        }

        public boolean b(Class<?> cls) {
            return this.f18208c == cls && this.f18209e;
        }

        public boolean c(JavaType javaType) {
            return !this.f18209e && javaType.equals(this.d);
        }

        public boolean d(Class<?> cls) {
            return this.f18208c == cls && !this.f18209e;
        }
    }

    public wbf(Map<qdk, yla<Object>> map) {
        int iA = a(map.size());
        this.b = iA;
        this.f18207c = iA - 1;
        a[] aVarArr = new a[iA];
        for (Map.Entry<qdk, yla<Object>> entry : map.entrySet()) {
            qdk key = entry.getKey();
            int iHashCode = key.hashCode() & this.f18207c;
            aVarArr[iHashCode] = new a(aVarArr[iHashCode], key, entry.getValue());
        }
        this.a = aVarArr;
    }

    public static final int a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public static wbf b(HashMap<qdk, yla<Object>> map) {
        return new wbf(map);
    }

    public yla<Object> c(JavaType javaType) {
        a aVar = this.a[this.f18207c & qdk.d(javaType)];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(javaType)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(javaType));
        return aVar.a;
    }

    public yla<Object> d(Class<?> cls) {
        a aVar = this.a[this.f18207c & qdk.e(cls)];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(cls)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(cls));
        return aVar.a;
    }

    public yla<Object> e(JavaType javaType) {
        a aVar = this.a[this.f18207c & qdk.f(javaType)];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(javaType)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(javaType));
        return aVar.a;
    }

    public yla<Object> f(Class<?> cls) {
        a aVar = this.a[this.f18207c & qdk.g(cls)];
        if (aVar == null) {
            return null;
        }
        if (aVar.d(cls)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.d(cls));
        return aVar.a;
    }
}
