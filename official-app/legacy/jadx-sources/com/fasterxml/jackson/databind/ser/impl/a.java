package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.yla;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public final boolean a;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.a$a, reason: collision with other inner class name */
    public static final class C0215a extends a {
        public final Class<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f2286c;
        public final yla<Object> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final yla<Object> f2287e;

        public C0215a(a aVar, Class<?> cls, yla<Object> ylaVar, Class<?> cls2, yla<Object> ylaVar2) {
            super(aVar);
            this.b = cls;
            this.d = ylaVar;
            this.f2286c = cls2;
            this.f2287e = ylaVar2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a j(Class<?> cls, yla<Object> ylaVar) {
            return new c(this, new f[]{new f(this.b, this.d), new f(this.f2286c, this.f2287e), new f(cls, ylaVar)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public yla<Object> k(Class<?> cls) {
            if (cls == this.b) {
                return this.d;
            }
            if (cls == this.f2286c) {
                return this.f2287e;
            }
            return null;
        }
    }

    public static final class b extends a {
        public static final b FOR_PROPERTIES = new b(false);
        public static final b FOR_ROOT_VALUES = new b(true);

        public b(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a j(Class<?> cls, yla<Object> ylaVar) {
            return new e(this, cls, ylaVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public yla<Object> k(Class<?> cls) {
            return null;
        }
    }

    public static final class c extends a {
        public final f[] b;

        public c(a aVar, f[] fVarArr) {
            super(aVar);
            this.b = fVarArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a j(Class<?> cls, yla<Object> ylaVar) {
            f[] fVarArr = this.b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.a ? new e(this, cls, ylaVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, ylaVar);
            return new c(this, fVarArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public yla<Object> k(Class<?> cls) {
            f[] fVarArr = this.b;
            f fVar = fVarArr[0];
            if (fVar.a == cls) {
                return fVar.b;
            }
            f fVar2 = fVarArr[1];
            if (fVar2.a == cls) {
                return fVar2.b;
            }
            f fVar3 = fVarArr[2];
            if (fVar3.a == cls) {
                return fVar3.b;
            }
            switch (fVarArr.length) {
                case 8:
                    f fVar4 = fVarArr[7];
                    if (fVar4.a == cls) {
                        return fVar4.b;
                    }
                case 7:
                    f fVar5 = fVarArr[6];
                    if (fVar5.a == cls) {
                        return fVar5.b;
                    }
                case 6:
                    f fVar6 = fVarArr[5];
                    if (fVar6.a == cls) {
                        return fVar6.b;
                    }
                case 5:
                    f fVar7 = fVarArr[4];
                    if (fVar7.a == cls) {
                        return fVar7.b;
                    }
                case 4:
                    f fVar8 = fVarArr[3];
                    if (fVar8.a == cls) {
                        return fVar8.b;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public static final class d {
        public final yla<Object> a;
        public final a b;

        public d(yla<Object> ylaVar, a aVar) {
            this.a = ylaVar;
            this.b = aVar;
        }
    }

    public static final class e extends a {
        public final Class<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yla<Object> f2288c;

        public e(a aVar, Class<?> cls, yla<Object> ylaVar) {
            super(aVar);
            this.b = cls;
            this.f2288c = ylaVar;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a j(Class<?> cls, yla<Object> ylaVar) {
            return new C0215a(this, this.b, this.f2288c, cls, ylaVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public yla<Object> k(Class<?> cls) {
            if (cls == this.b) {
                return this.f2288c;
            }
            return null;
        }
    }

    public static final class f {
        public final Class<?> a;
        public final yla<Object> b;

        public f(Class<?> cls, yla<Object> ylaVar) {
            this.a = cls;
            this.b = ylaVar;
        }
    }

    public a(boolean z) {
        this.a = z;
    }

    public static a c() {
        return b.FOR_PROPERTIES;
    }

    public static a d() {
        return b.FOR_ROOT_VALUES;
    }

    public final d a(JavaType javaType, yla<Object> ylaVar) {
        return new d(ylaVar, j(javaType.getRawClass(), ylaVar));
    }

    public final d b(Class<?> cls, yla<Object> ylaVar) {
        return new d(ylaVar, j(cls, ylaVar));
    }

    public final d e(Class<?> cls, eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarFindKeySerializer = eugVar.findKeySerializer(cls, beanProperty);
        return new d(ylaVarFindKeySerializer, j(cls, ylaVarFindKeySerializer));
    }

    public final d f(JavaType javaType, eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarFindPrimaryPropertySerializer = eugVar.findPrimaryPropertySerializer(javaType, beanProperty);
        return new d(ylaVarFindPrimaryPropertySerializer, j(javaType.getRawClass(), ylaVarFindPrimaryPropertySerializer));
    }

    public final d g(Class<?> cls, eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarFindPrimaryPropertySerializer = eugVar.findPrimaryPropertySerializer(cls, beanProperty);
        return new d(ylaVarFindPrimaryPropertySerializer, j(cls, ylaVarFindPrimaryPropertySerializer));
    }

    public final d h(JavaType javaType, eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarFindContentValueSerializer = eugVar.findContentValueSerializer(javaType, beanProperty);
        return new d(ylaVarFindContentValueSerializer, j(javaType.getRawClass(), ylaVarFindContentValueSerializer));
    }

    public final d i(Class<?> cls, eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarFindContentValueSerializer = eugVar.findContentValueSerializer(cls, beanProperty);
        return new d(ylaVarFindContentValueSerializer, j(cls, ylaVarFindContentValueSerializer));
    }

    public abstract a j(Class<?> cls, yla<Object> ylaVar);

    public abstract yla<Object> k(Class<?> cls);

    public a(a aVar) {
        this.a = aVar.a;
    }
}
