package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class evf {
    public final Map<Method, mvg<?>> a = new ConcurrentHashMap();
    public final wr2.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uk9 f11092c;
    public final List<ma4.a> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<zr2.a> f11093e;

    @Nullable
    public final Executor f;
    public final boolean g;

    public class a implements InvocationHandler {
        public final vke i = vke.f();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object[] f11094j = new Object[0];
        public final /* synthetic */ Class k;

        public a(Class cls) {
            this.k = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f11094j;
            }
            return this.i.h(method) ? this.i.g(method, this.k, obj, objArr) : evf.this.c(method).a(objArr);
        }
    }

    public evf(wr2.a aVar, uk9 uk9Var, List<ma4.a> list, List<zr2.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.f11092c = uk9Var;
        this.d = list;
        this.f11093e = list2;
        this.f = executor;
        this.g = z;
    }

    public zr2<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public mvg<?> c(Method method) {
        mvg<?> mvgVarB;
        mvg<?> mvgVar = this.a.get(method);
        if (mvgVar != null) {
            return mvgVar;
        }
        synchronized (this.a) {
            mvgVarB = this.a.get(method);
            if (mvgVarB == null) {
                mvgVarB = mvg.b(this, method);
                this.a.put(method, mvgVarB);
            }
        }
        return mvgVarB;
    }

    public zr2<?, ?> d(@Nullable zr2.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f11093e.indexOf(aVar) + 1;
        int size = this.f11093e.size();
        for (int i = iIndexOf; i < size; i++) {
            zr2<?, ?> zr2Var = this.f11093e.get(i).get(type, annotationArr, this);
            if (zr2Var != null) {
                return zr2Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f11093e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f11093e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f11093e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ma4<T, gqf> e(@Nullable ma4.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            ma4<T, gqf> ma4Var = (ma4<T, gqf>) this.d.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (ma4Var != null) {
                return ma4Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ma4<cuf, T> f(@Nullable ma4.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = iIndexOf; i < size; i++) {
            ma4<cuf, T> ma4Var = (ma4<cuf, T>) this.d.get(i).responseBodyConverter(type, annotationArr, this);
            if (ma4Var != null) {
                return ma4Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ma4<T, gqf> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> ma4<cuf, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> ma4<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ma4<T, String> ma4Var = (ma4<T, String>) this.d.get(i).stringConverter(type, annotationArr, this);
            if (ma4Var != null) {
                return ma4Var;
            }
        }
        return n82.d.a;
    }

    public final void j(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.g) {
            vke vkeVarF = vke.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!vkeVarF.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public static final class b {
        public final vke a;

        @Nullable
        public wr2.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public uk9 f11096c;
        public final List<ma4.a> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<zr2.a> f11097e;

        @Nullable
        public Executor f;
        public boolean g;

        public b(vke vkeVar) {
            this.d = new ArrayList();
            this.f11097e = new ArrayList();
            this.a = vkeVar;
        }

        public b a(zr2.a aVar) {
            List<zr2.a> list = this.f11097e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(ma4.a aVar) {
            List<ma4.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(uk9 uk9Var) {
            Objects.requireNonNull(uk9Var, "baseUrl == null");
            List<String> listP = uk9Var.p();
            if ("".equals(listP.get(listP.size() - 1))) {
                this.f11096c = uk9Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + uk9Var);
        }

        public b d(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return c(uk9.i(str));
        }

        public evf e() {
            if (this.f11096c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            wr2.a efdVar = this.b;
            if (efdVar == null) {
                efdVar = new efd();
            }
            wr2.a aVar = efdVar;
            Executor executorB = this.f;
            if (executorB == null) {
                executorB = this.a.b();
            }
            Executor executor = executorB;
            ArrayList arrayList = new ArrayList(this.f11097e);
            arrayList.addAll(this.a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.d());
            arrayList2.add(new n82());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.a.c());
            return new evf(aVar, this.f11096c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.g);
        }

        public b f(wr2.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b g(efd efdVar) {
            Objects.requireNonNull(efdVar, "client == null");
            return f(efdVar);
        }

        public b() {
            this(vke.f());
        }
    }
}
