package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.oplus.aiunit.vision.bca;
import com.oplus.aiunit.vision.c14;
import com.oplus.aiunit.vision.dh0;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.kc3;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.y6f;
import com.oplus.aiunit.vision.y97;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1301e;
    public boolean f;
    public boolean h;
    public InterfaceC0171d i;
    public String a = "class";
    public boolean b = true;
    public boolean g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i<Class, k<String, a>> f1302j = new i<>();
    public final i<String, Class> k = new i<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i<Class, String> f1303l = new i<>();
    public final i<Class, InterfaceC0171d> m = new i<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i<Class, Object[]> f1304n = new i<>();
    public final Object[] o = {null};
    public final Object[] p = {null};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JsonWriter$OutputType f1300c = JsonWriter$OutputType.minimal;

    public static class a {
        public final y97 a;
        public Class b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1305c;

        public a(y97 y97Var) {
            this.a = y97Var;
            this.b = y97Var.c((kc3.f(i.class, y97Var.e()) || kc3.f(Map.class, y97Var.e())) ? 1 : 0);
            this.f1305c = y97Var.g(Deprecated.class);
        }
    }

    public static abstract class b<T> implements InterfaceC0171d<T> {
    }

    public interface c {
        void b(d dVar, JsonValue jsonValue);
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.d$d, reason: collision with other inner class name */
    public interface InterfaceC0171d<T> {
        T a(d dVar, JsonValue jsonValue, Class cls);
    }

    public void a(String str, Class cls) {
        this.k.h(str, cls);
        this.f1303l.h(cls, str);
    }

    public final String b(Enum r1) {
        return this.g ? r1.name() : r1.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Object obj, Object obj2) {
        k<String, a> kVarF = f(obj2.getClass());
        i.a<String, a> it = f(obj.getClass()).iterator();
        while (it.hasNext()) {
            i.b next = it.next();
            a aVar = kVarF.get(next.a);
            y97 y97Var = ((a) next.b).a;
            if (aVar == null) {
                throw new SerializationException("To object is missing field: " + ((String) next.a));
            }
            try {
                aVar.a.k(obj2, y97Var.a(obj));
            } catch (ReflectionException e2) {
                throw new SerializationException("Error copying field: " + y97Var.d(), e2);
            }
        }
    }

    public <T> T d(Class<T> cls, kb7 kb7Var) {
        try {
            return (T) k(cls, null, new e().a(kb7Var));
        } catch (Exception e2) {
            throw new SerializationException("Error reading file: " + kb7Var, e2);
        }
    }

    public Class e(String str) {
        return this.k.get(str);
    }

    public final k<String, a> f(Class cls) {
        k<String, a> kVar = this.f1302j.get(cls);
        if (kVar != null) {
            return kVar;
        }
        wg0 wg0Var = new wg0();
        for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
            wg0Var.a(superclass);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = wg0Var.f18241j - 1; i >= 0; i--) {
            Collections.addAll(arrayList, kc3.d((Class) wg0Var.get(i)));
        }
        k<String, a> kVar2 = new k<>(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            y97 y97Var = (y97) arrayList.get(i2);
            if (!y97Var.j() && !y97Var.h() && !y97Var.i()) {
                if (!y97Var.f()) {
                    try {
                        y97Var.l(true);
                    } catch (RuntimeException unused) {
                    }
                }
                kVar2.h(y97Var.d(), new a(y97Var));
            }
        }
        r(cls, kVar2.w);
        this.f1302j.h(cls, kVar2);
        return kVar2;
    }

    public boolean g(Class cls, String str) {
        return false;
    }

    public Object h(Class cls) {
        try {
            return kc3.i(cls);
        } catch (Exception e2) {
            e = e2;
            try {
                c14 c14VarC = kc3.c(cls, new Class[0]);
                c14VarC.c(true);
                return c14VarC.b(new Object[0]);
            } catch (ReflectionException unused) {
                if (kc3.f(Enum.class, cls)) {
                    if (cls.getEnumConstants() == null) {
                        cls = cls.getSuperclass();
                    }
                    return cls.getEnumConstants()[0];
                }
                if (cls.isArray()) {
                    throw new SerializationException("Encountered JSON object when expected array of type: " + cls.getName(), e);
                }
                if (!kc3.g(cls) || kc3.h(cls)) {
                    throw new SerializationException("Class cannot be created (missing no-arg constructor): " + cls.getName(), e);
                }
                throw new SerializationException("Class cannot be created (non-static member class): " + cls.getName(), e);
            } catch (SecurityException unused2) {
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e);
            } catch (Exception e3) {
                e = e3;
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e);
            }
        }
    }

    public void i(Object obj, JsonValue jsonValue) {
        Class<?> cls = obj.getClass();
        k<String, a> kVarF = f(cls);
        for (JsonValue jsonValue2 = jsonValue.f1284n; jsonValue2 != null; jsonValue2 = jsonValue2.p) {
            a aVar = kVarF.get(jsonValue2.name().replace(" ", "_"));
            if (aVar == null) {
                if (!jsonValue2.m.equals(this.a) && !this.d && !g(cls, jsonValue2.m)) {
                    SerializationException serializationException = new SerializationException("Field not found: " + jsonValue2.m + " (" + cls.getName() + ")");
                    serializationException.addTrace(jsonValue2.O());
                    throw serializationException;
                }
            } else if (!this.f1301e || this.f || !aVar.f1305c) {
                y97 y97Var = aVar.a;
                try {
                    y97Var.k(obj, k(y97Var.e(), aVar.b, jsonValue2));
                } catch (SerializationException e2) {
                    e2.addTrace(y97Var.d() + " (" + cls.getName() + ")");
                    throw e2;
                } catch (ReflectionException e3) {
                    throw new SerializationException("Error accessing field: " + y97Var.d() + " (" + cls.getName() + ")", e3);
                } catch (RuntimeException e4) {
                    SerializationException serializationException2 = new SerializationException(e4);
                    serializationException2.addTrace(jsonValue2.O());
                    serializationException2.addTrace(y97Var.d() + " (" + cls.getName() + ")");
                    throw serializationException2;
                }
            }
        }
    }

    public <T> T j(Class<T> cls, JsonValue jsonValue) {
        return (T) k(cls, null, jsonValue);
    }

    /* JADX WARN: Code duplicated, block: B:224:0x036a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x0370  */
    /* JADX WARN: Code duplicated, block: B:231:0x0378  */
    /* JADX WARN: Code duplicated, block: B:235:0x038e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0396  */
    /* JADX WARN: Code duplicated, block: B:304:0x044e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:309:0x036c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x030f, code lost:
    
        if (r2 != r4) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v79, types: [com.oplus.aiunit.vision.y6f] */
    /* JADX WARN: Type inference failed for: r1v83, types: [com.oplus.aiunit.vision.wg0] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.badlogic.gdx.utils.d] */
    /* JADX WARN: Type inference failed for: r23v0, types: [T, com.badlogic.gdx.utils.JsonValue] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.badlogic.gdx.utils.d$c] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v29, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v30, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, com.badlogic.gdx.utils.a] */
    /* JADX WARN: Type inference failed for: r4v32, types: [T, com.oplus.aiunit.vision.bca] */
    /* JADX WARN: Type inference failed for: r4v33, types: [T, com.badlogic.gdx.utils.f] */
    /* JADX WARN: Type inference failed for: r4v34, types: [T, com.badlogic.gdx.utils.c] */
    /* JADX WARN: Type inference failed for: r4v35, types: [T, com.badlogic.gdx.utils.j] */
    /* JADX WARN: Type inference failed for: r4v36, types: [T, com.badlogic.gdx.utils.g] */
    /* JADX WARN: Type inference failed for: r4v37, types: [T, com.badlogic.gdx.utils.h] */
    /* JADX WARN: Type inference failed for: r4v38, types: [T, com.badlogic.gdx.utils.i] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.badlogic.gdx.utils.JsonValue, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.badlogic.gdx.utils.JsonValue] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.badlogic.gdx.utils.JsonValue, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v23, types: [com.badlogic.gdx.utils.d$d] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T k(Class<T> cls, Class cls2, JsonValue jsonValue) {
        Class cls3;
        ?? r5;
        Class<T> cls4;
        ?? Z;
        ?? jsonValue2;
        ?? r4;
        Class<T> cls5;
        ?? jsonValue3;
        ?? r7;
        Class<T> clsA;
        if (jsonValue == 0) {
            return null;
        }
        if (jsonValue.B()) {
            String str = this.a;
            cls3 = Enum.class;
            String strQ = str == null ? null : jsonValue.q(str, null);
            if (strQ != null) {
                Class<T> clsE = e(strQ);
                if (clsE == null) {
                    try {
                        clsA = kc3.a(strQ);
                    } catch (ReflectionException e2) {
                        throw new SerializationException(e2);
                    }
                } else {
                    clsA = clsE;
                }
            } else {
                clsA = cls;
            }
            if (clsA == null) {
                InterfaceC0171d interfaceC0171d = this.i;
                return interfaceC0171d != null ? (T) interfaceC0171d.a(this, jsonValue, clsA) : jsonValue;
            }
            if (this.a == null || !kc3.f(Collection.class, clsA)) {
                InterfaceC0171d interfaceC0171d2 = this.m.get(clsA);
                if (interfaceC0171d2 != null) {
                    return (T) interfaceC0171d2.a(this, jsonValue, clsA);
                }
                if (clsA == String.class || clsA == Integer.class || clsA == Boolean.class || clsA == Float.class || clsA == Long.class || clsA == Double.class || clsA == Short.class || clsA == Byte.class || clsA == Character.class || kc3.f(cls3, clsA)) {
                    return (T) l("value", clsA, jsonValue);
                }
                ?? r6 = (T) h(clsA);
                if (r6 instanceof c) {
                    ((c) r6).b(this, jsonValue);
                    return r6;
                }
                if (r6 instanceof i) {
                    ?? r8 = (T) ((i) r6);
                    for (JsonValue jsonValue4 = jsonValue.f1284n; jsonValue4 != null; jsonValue4 = jsonValue4.p) {
                        r8.h(jsonValue4.m, k(cls2, null, jsonValue4));
                    }
                    return r8;
                }
                if (r6 instanceof h) {
                    ?? r9 = (T) ((h) r6);
                    for (JsonValue jsonValue5 = jsonValue.f1284n; jsonValue5 != null; jsonValue5 = jsonValue5.p) {
                        r9.i(jsonValue5.m, ((Integer) k(Integer.class, null, jsonValue5)).intValue());
                    }
                    return r9;
                }
                if (r6 instanceof g) {
                    ?? r10 = (T) ((g) r6);
                    for (JsonValue jsonValue6 = jsonValue.f1284n; jsonValue6 != null; jsonValue6 = jsonValue6.p) {
                        r10.g(jsonValue6.m, ((Float) k(Float.class, null, jsonValue6)).floatValue());
                    }
                    return r10;
                }
                if (r6 instanceof j) {
                    ?? r11 = (T) ((j) r6);
                    for (JsonValue jsonValueM = jsonValue.m("values"); jsonValueM != null; jsonValueM = jsonValueM.p) {
                        r11.add(k(cls2, null, jsonValueM));
                    }
                    return r11;
                }
                if (r6 instanceof com.badlogic.gdx.utils.c) {
                    ?? r12 = (T) ((com.badlogic.gdx.utils.c) r6);
                    for (JsonValue jsonValue7 = jsonValue.f1284n; jsonValue7 != null; jsonValue7 = jsonValue7.p) {
                        r12.e(Integer.parseInt(jsonValue7.m), k(cls2, null, jsonValue7));
                    }
                    return r12;
                }
                if (r6 instanceof f) {
                    ?? r13 = (T) ((f) r6);
                    for (JsonValue jsonValue8 = jsonValue.f1284n; jsonValue8 != null; jsonValue8 = jsonValue8.p) {
                        r13.f(Long.parseLong(jsonValue8.m), k(cls2, null, jsonValue8));
                    }
                    return r13;
                }
                if (r6 instanceof bca) {
                    ?? r14 = (T) ((bca) r6);
                    for (JsonValue jsonValueM2 = jsonValue.m("values"); jsonValueM2 != null; jsonValueM2 = jsonValueM2.p) {
                        r14.a(jsonValueM2.f());
                    }
                    return r14;
                }
                if (r6 instanceof com.badlogic.gdx.utils.a) {
                    ?? r15 = (T) ((com.badlogic.gdx.utils.a) r6);
                    for (JsonValue jsonValue9 = jsonValue.f1284n; jsonValue9 != null; jsonValue9 = jsonValue9.p) {
                        r15.c(jsonValue9.m, k(cls2, null, jsonValue9));
                    }
                    return r15;
                }
                if (!(r6 instanceof Map)) {
                    i(r6, jsonValue);
                    return r6;
                }
                ?? r16 = (T) ((Map) r6);
                for (JsonValue jsonValue10 = jsonValue.f1284n; jsonValue10 != null; jsonValue10 = jsonValue10.p) {
                    if (!jsonValue10.m.equals(this.a)) {
                        r16.put(jsonValue10.m, k(cls2, null, jsonValue10));
                    }
                }
                return r16;
            }
            JsonValue jsonValueL = jsonValue.l("items");
            if (jsonValueL == null) {
                throw new SerializationException("Unable to convert object to collection: " + jsonValueL + " (" + clsA.getName() + ")");
            }
            r5 = jsonValueL;
            cls4 = clsA;
        } else {
            cls3 = Enum.class;
            r5 = jsonValue;
            cls4 = cls;
        }
        if (cls4 != null) {
            InterfaceC0171d interfaceC0171d3 = this.m.get(cls4);
            if (interfaceC0171d3 != 0) {
                return (T) interfaceC0171d3.a(this, r5, cls4);
            }
            if (kc3.f(c.class, cls4)) {
                T t = (T) h(cls4);
                ((c) t).b(this, r5);
                return t;
            }
        }
        int i = 0;
        if (r5.t()) {
            if (cls4 == null || cls4 == Object.class) {
                cls4 = wg0.class;
            }
            if (kc3.f(wg0.class, cls4)) {
                Object obj = cls4 == wg0.class ? (T) new wg0() : (T) ((wg0) h(cls4));
                for (JsonValue jsonValue11 = r5.f1284n; jsonValue11 != null; jsonValue11 = jsonValue11.p) {
                    ((wg0) obj).a(k(cls2, null, jsonValue11));
                }
                return (T) obj;
            }
            if (kc3.f(y6f.class, cls4)) {
                Object obj2 = cls4 == y6f.class ? (T) new y6f() : (T) ((y6f) h(cls4));
                for (JsonValue jsonValue12 = r5.f1284n; jsonValue12 != null; jsonValue12 = jsonValue12.p) {
                    ((y6f) obj2).addLast(k(cls2, null, jsonValue12));
                }
                return (T) obj2;
            }
            if (kc3.f(Collection.class, cls4)) {
                T t2 = cls4.isInterface() ? (T) new ArrayList() : (T) ((Collection) h(cls4));
                for (JsonValue jsonValue13 = r5.f1284n; jsonValue13 != null; jsonValue13 = jsonValue13.p) {
                    ((Collection) t2).add(k(cls2, null, jsonValue13));
                }
                return t2;
            }
            if (!cls4.isArray()) {
                throw new SerializationException("Unable to convert value to required type: " + r5 + " (" + cls4.getName() + ")");
            }
            Class<?> componentType = cls4.getComponentType();
            if (cls2 == 0) {
                cls2 = componentType;
            }
            T t3 = (T) dh0.a(componentType, r5.r);
            JsonValue jsonValue14 = r5.f1284n;
            while (jsonValue14 != null) {
                dh0.b(t3, i, k(cls2, null, jsonValue14));
                jsonValue14 = jsonValue14.p;
                i++;
            }
            return t3;
        }
        Z = r5.z();
        if (Z != 0) {
            try {
                if (cls4 != null) {
                    try {
                        if (cls4 != Float.TYPE && cls4 != Float.class) {
                            if (cls4 != Integer.TYPE && cls4 != Integer.class) {
                                if (cls4 != Long.TYPE && cls4 != Long.class) {
                                    if (cls4 != Double.TYPE && cls4 != Double.class) {
                                        if (cls4 == String.class) {
                                            return (T) r5.j();
                                        }
                                        if (cls4 != Short.TYPE && cls4 != Short.class) {
                                            if (cls4 != Byte.TYPE) {
                                                Z = Byte.class;
                                            }
                                            return (T) Byte.valueOf(r5.b());
                                        }
                                        return (T) Short.valueOf(r5.h());
                                    }
                                    return (T) Double.valueOf(r5.c());
                                }
                                return (T) Long.valueOf(r5.g());
                            }
                            return (T) Integer.valueOf(r5.f());
                        }
                    } catch (NumberFormatException unused) {
                        Z = Byte.class;
                    }
                }
                return (T) Float.valueOf(r5.d());
            } catch (NumberFormatException unused2) {
            }
        } else {
            r4 = Byte.class;
            jsonValue2 = r5;
        }
        if (!jsonValue2.u()) {
            cls5 = Boolean.class;
            jsonValue3 = jsonValue2;
        } else {
            if (cls4 != null) {
                cls5 = Boolean.class;
                return (T) Boolean.valueOf(jsonValue2.a());
            }
            try {
                if (cls4 != Boolean.TYPE) {
                    cls5 = Boolean.class;
                    if (cls4 == cls5) {
                    }
                    jsonValue3 = new JsonValue(jsonValue2.j());
                } else {
                    cls5 = Boolean.class;
                }
                try {
                    return (T) Boolean.valueOf(jsonValue2.a());
                } catch (NumberFormatException unused3) {
                }
            } catch (NumberFormatException unused4) {
                cls5 = Boolean.class;
            }
        }
        if (jsonValue3.C()) {
            return null;
        }
        r7 = (T) jsonValue3.j();
        if (cls4 != null || cls4 == String.class) {
            return r7;
        }
        try {
            if (cls4 != Integer.TYPE && cls4 != Integer.class) {
                if (cls4 != Float.TYPE && cls4 != Float.class) {
                    if (cls4 != Long.TYPE && cls4 != Long.class) {
                        if (cls4 != Double.TYPE && cls4 != Double.class) {
                            if (cls4 != Short.TYPE && cls4 != Short.class) {
                                if (cls4 == Byte.TYPE || cls4 == r4) {
                                    return (T) Byte.valueOf((String) r7);
                                }
                                if (cls4 == Boolean.TYPE || cls4 == cls5) {
                                    return (T) Boolean.valueOf((String) r7);
                                }
                                if (cls4 == Character.TYPE || cls4 == Character.class) {
                                    return (T) Character.valueOf(r7.charAt(0));
                                }
                                if (kc3.f(cls3, cls4)) {
                                    Object[] objArr = (Enum[]) cls4.getEnumConstants();
                                    int length = objArr.length;
                                    while (i < length) {
                                        ?? r17 = (T) objArr[i];
                                        if (r7.equals(b(r17))) {
                                            return r17;
                                        }
                                        i++;
                                    }
                                }
                                if (cls4 == CharSequence.class) {
                                    return r7;
                                }
                                throw new SerializationException("Unable to convert value to required type: " + jsonValue3 + " (" + cls4.getName() + ")");
                            }
                            return (T) Short.valueOf((String) r7);
                        }
                        return (T) Double.valueOf((String) r7);
                    }
                    return (T) Long.valueOf((String) r7);
                }
                return (T) Float.valueOf((String) r7);
            }
            return (T) Integer.valueOf((String) r7);
        } catch (NumberFormatException unused5) {
        }
        jsonValue2 = new JsonValue(r5.j());
        r4 = Z;
        if (!jsonValue2.u()) {
            if (cls4 != null) {
                cls5 = Boolean.class;
                return (T) Boolean.valueOf(jsonValue2.a());
            }
            if (cls4 != Boolean.TYPE) {
                cls5 = Boolean.class;
                if (cls4 == cls5) {
                }
                jsonValue3 = new JsonValue(jsonValue2.j());
            } else {
                cls5 = Boolean.class;
            }
            return (T) Boolean.valueOf(jsonValue2.a());
        }
        cls5 = Boolean.class;
        jsonValue3 = jsonValue2;
        if (jsonValue3.C()) {
            return null;
        }
        r7 = (T) jsonValue3.j();
        if (cls4 != null) {
        }
        return r7;
    }

    public <T> T l(String str, Class<T> cls, JsonValue jsonValue) {
        return (T) k(cls, null, jsonValue.l(str));
    }

    public <T> T m(String str, Class<T> cls, Class cls2, JsonValue jsonValue) {
        return (T) k(cls, cls2, jsonValue.l(str));
    }

    public <T> T n(String str, Class<T> cls, T t, JsonValue jsonValue) {
        JsonValue jsonValueL = jsonValue.l(str);
        return jsonValueL == null ? t : (T) k(cls, null, jsonValueL);
    }

    public <T> void o(Class<T> cls, InterfaceC0171d<T> interfaceC0171d) {
        this.m.h(cls, interfaceC0171d);
    }

    public void p(String str) {
        this.a = str;
    }

    public void q(boolean z) {
        this.b = z;
    }

    public void r(Class cls, wg0<String> wg0Var) {
        if (this.h) {
            wg0Var.l();
        }
    }
}
