package com.fasterxml.jackson.databind.introspect;

import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.j60;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AnnotationCollector {
    public static final j60 b = new NoAnnotations();
    public final Object a;

    public static class NoAnnotations implements j60, Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.oplus.aiunit.vision.j60
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.j60
        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements j60, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }

        @Override // com.oplus.aiunit.vision.j60
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return (A) this._value;
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean has(Class<?> cls) {
            return this._type == cls;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.oplus.aiunit.vision.j60
        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements j60, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }

        @Override // com.oplus.aiunit.vision.j60
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return (A) this._value1;
            }
            if (this._type2 == cls) {
                return (A) this._value2;
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean has(Class<?> cls) {
            return this._type1 == cls || this._type2 == cls;
        }

        @Override // com.oplus.aiunit.vision.j60
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.oplus.aiunit.vision.j60
        public int size() {
            return 2;
        }
    }

    public static class a extends AnnotationCollector {
        public static final a instance = new a(null);

        public a(Object obj) {
            super(obj);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            return new c(this.a, annotation.annotationType(), annotation);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public g60 b() {
            return new g60();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public j60 c() {
            return AnnotationCollector.b;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return false;
        }
    }

    public static class b extends AnnotationCollector {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap<Class<?>, Annotation> f2262c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.f2262c = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            this.f2262c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public g60 b() {
            g60 g60Var = new g60();
            Iterator<Annotation> it = this.f2262c.values().iterator();
            while (it.hasNext()) {
                g60Var.b(it.next());
            }
            return g60Var;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public j60 c() {
            if (this.f2262c.size() != 2) {
                return new g60(this.f2262c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.f2262c.entrySet().iterator();
            Map.Entry<Class<?>, Annotation> next = it.next();
            Map.Entry<Class<?>, Annotation> next2 = it.next();
            return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return this.f2262c.containsKey(annotation.annotationType());
        }
    }

    public static class c extends AnnotationCollector {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f2263c;
        public Annotation d;

        public c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.f2263c = cls;
            this.d = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.f2263c;
            if (cls != clsAnnotationType) {
                return new b(this.a, cls, this.d, clsAnnotationType, annotation);
            }
            this.d = annotation;
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public g60 b() {
            return g60.e(this.f2263c, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public j60 c() {
            return new OneAnnotation(this.f2263c, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return annotation.annotationType() == this.f2263c;
        }
    }

    public AnnotationCollector(Object obj) {
        this.a = obj;
    }

    public static j60 d() {
        return b;
    }

    public static AnnotationCollector e() {
        return a.instance;
    }

    public abstract AnnotationCollector a(Annotation annotation);

    public abstract g60 b();

    public abstract j60 c();

    public abstract boolean f(Annotation annotation);
}
