package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.c60;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.j60;
import com.oplus.aiunit.vision.nc3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends a60 implements i {
    public static final C0214a w = new C0214a(null, Collections.emptyList(), Collections.emptyList());
    public final JavaType i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class<?> f2267j;
    public final TypeBindings k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<JavaType> f2268l;
    public final AnnotationIntrospector m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TypeFactory f2269n;
    public final f.a o;
    public final Class<?> p;
    public final boolean q;
    public final j60 r;
    public C0214a s;
    public c60 t;
    public List<AnnotatedField> u;
    public transient Boolean v;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.a$a, reason: collision with other inner class name */
    public static final class C0214a {
        public final AnnotatedConstructor a;
        public final List<AnnotatedConstructor> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<AnnotatedMethod> f2270c;

        public C0214a(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.a = annotatedConstructor;
            this.b = list;
            this.f2270c = list2;
        }
    }

    public a(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, j60 j60Var, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, f.a aVar, TypeFactory typeFactory, boolean z) {
        this.i = javaType;
        this.f2267j = cls;
        this.f2268l = list;
        this.p = cls2;
        this.r = j60Var;
        this.k = typeBindings;
        this.m = annotationIntrospector;
        this.o = aVar;
        this.f2269n = typeFactory;
        this.q = z;
    }

    @Override // com.fasterxml.jackson.databind.introspect.i
    public JavaType a(Type type) {
        return this.f2269n.resolveMemberType(type, this.k);
    }

    @Override // com.oplus.aiunit.vision.a60
    @Deprecated
    public Iterable<Annotation> annotations() {
        j60 j60Var = this.r;
        if (j60Var instanceof g60) {
            return ((g60) j60Var).c();
        }
        if ((j60Var instanceof AnnotationCollector.OneAnnotation) || (j60Var instanceof AnnotationCollector.TwoAnnotations)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    public final C0214a b() {
        C0214a c0214aP = this.s;
        if (c0214aP == null) {
            JavaType javaType = this.i;
            c0214aP = javaType == null ? w : c.p(this.m, this.f2269n, this, javaType, this.p, this.q);
            this.s = c0214aP;
        }
        return c0214aP;
    }

    public final List<AnnotatedField> c() {
        List<AnnotatedField> listEmptyList = this.u;
        if (listEmptyList == null) {
            JavaType javaType = this.i;
            listEmptyList = javaType == null ? Collections.emptyList() : d.m(this.m, this, this.o, this.f2269n, javaType, this.q);
            this.u = listEmptyList;
        }
        return listEmptyList;
    }

    public final c60 d() {
        c60 c60Var = this.t;
        if (c60Var == null) {
            JavaType javaType = this.i;
            c60Var = javaType == null ? new c60() : e.m(this.m, this, this.o, this.f2269n, javaType, this.f2268l, this.p, this.q);
            this.t = c60Var;
        }
        return c60Var;
    }

    public Iterable<AnnotatedField> e() {
        return c();
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return nc3.H(obj, a.class) && ((a) obj).f2267j == this.f2267j;
    }

    public AnnotatedMethod f(String str, Class<?>[] clsArr) {
        return d().a(str, clsArr);
    }

    @Override // com.oplus.aiunit.vision.a60
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Class<?> getAnnotated() {
        return this.f2267j;
    }

    @Override // com.oplus.aiunit.vision.a60
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.r.get(cls);
    }

    @Override // com.oplus.aiunit.vision.a60
    public int getModifiers() {
        return this.f2267j.getModifiers();
    }

    @Override // com.oplus.aiunit.vision.a60
    public String getName() {
        return this.f2267j.getName();
    }

    @Override // com.oplus.aiunit.vision.a60
    public Class<?> getRawType() {
        return this.f2267j;
    }

    @Override // com.oplus.aiunit.vision.a60
    public JavaType getType() {
        return this.i;
    }

    public j60 h() {
        return this.r;
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean hasAnnotation(Class<?> cls) {
        return this.r.has(cls);
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.r.hasOneOf(clsArr);
    }

    @Override // com.oplus.aiunit.vision.a60
    public int hashCode() {
        return this.f2267j.getName().hashCode();
    }

    public List<AnnotatedConstructor> i() {
        return b().b;
    }

    public AnnotatedConstructor j() {
        return b().a;
    }

    public List<AnnotatedMethod> k() {
        return b().f2270c;
    }

    public boolean l() {
        return this.r.size() > 0;
    }

    public boolean m() {
        Boolean boolValueOf = this.v;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(nc3.Q(this.f2267j));
            this.v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public Iterable<AnnotatedMethod> n() {
        return d();
    }

    @Override // com.oplus.aiunit.vision.a60
    public String toString() {
        return "[AnnotedClass " + this.f2267j.getName() + "]";
    }

    public a(Class<?> cls) {
        this.i = null;
        this.f2267j = cls;
        this.f2268l = Collections.emptyList();
        this.p = null;
        this.r = AnnotationCollector.d();
        this.k = TypeBindings.emptyBindings();
        this.m = null;
        this.o = null;
        this.f2269n = null;
        this.q = false;
    }
}
