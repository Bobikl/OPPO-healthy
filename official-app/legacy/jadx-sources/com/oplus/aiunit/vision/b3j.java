package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public class b3j {
    public static final Map<Class<?>, List<a3j>> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a[] f9575e = new a[4];
    public List<z2j> a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9576c;

    public static class a {
        public final List<a3j> a = new ArrayList();
        public final Map<Class, Object> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Class> f9577c = new HashMap();
        public final StringBuilder d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class<?> f9578e;
        public Class<?> f;
        public boolean g;

        public boolean a(Method method, Class<?> cls) {
            Object objPut = this.b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.b.put(cls, this);
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.d.setLength(0);
            this.d.append(method.getName());
            StringBuilder sb = this.d;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String string = this.d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f9577c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f9577c.put(string, clsPut);
            return false;
        }

        public void c(Class<?> cls) {
            this.f = cls;
            this.f9578e = cls;
            this.g = false;
        }

        public void d() {
            if (this.g) {
                this.f = null;
                return;
            }
            Class<? super Object> superclass = this.f.getSuperclass();
            this.f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f = null;
            }
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.f9577c.clear();
            this.d.setLength(0);
            this.f9578e = null;
            this.f = null;
            this.g = false;
        }
    }

    public b3j(List<z2j> list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.f9576c = z2;
    }

    public List<a3j> a(Class<?> cls) {
        Map<Class<?>, List<a3j>> map = d;
        List<a3j> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<a3j> listC = this.f9576c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<a3j> b(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final List<a3j> c(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f.getMethods();
            aVar.g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    u2j u2jVar = (u2j) method.getAnnotation(u2j.class);
                    if (u2jVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.a.add(new a3j(method, cls, u2jVar.threadMode(), u2jVar.priority(), u2jVar.sticky()));
                        }
                    }
                } else if (this.b && method.isAnnotationPresent(u2j.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.b && method.isAnnotationPresent(u2j.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<a3j> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.a);
        aVar.e();
        synchronized (f9575e) {
            for (int i = 0; i < 4; i++) {
                a[] aVarArr = f9575e;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
            }
        }
        return arrayList;
    }

    public final y2j f(a aVar) {
        aVar.getClass();
        List<z2j> list = this.a;
        if (list == null) {
            return null;
        }
        Iterator<z2j> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f);
        }
        return null;
    }

    public final a g() {
        synchronized (f9575e) {
            for (int i = 0; i < 4; i++) {
                a[] aVarArr = f9575e;
                a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
