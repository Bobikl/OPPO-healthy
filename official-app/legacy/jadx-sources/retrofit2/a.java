package retrofit2;

import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.dfd;
import com.oplus.aiunit.vision.e8h;
import com.oplus.aiunit.vision.evf;
import com.oplus.aiunit.vision.ma4;
import com.oplus.aiunit.vision.mvg;
import com.oplus.aiunit.vision.oqf;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.aiunit.vision.zr2;
import com.oplus.aiunit.vision.ztf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<ResponseT, ReturnT> extends mvg<ReturnT> {
    public final oqf a;
    public final wr2.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma4<cuf, ResponseT> f20834c;

    /* JADX INFO: renamed from: retrofit2.a$a, reason: collision with other inner class name */
    public static final class C1057a<ResponseT, ReturnT> extends a<ResponseT, ReturnT> {
        public final zr2<ResponseT, ReturnT> d;

        public C1057a(oqf oqfVar, wr2.a aVar, ma4<cuf, ResponseT> ma4Var, zr2<ResponseT, ReturnT> zr2Var) {
            super(oqfVar, aVar, ma4Var);
            this.d = zr2Var;
        }

        @Override // retrofit2.a
        public ReturnT c(xr2<ResponseT> xr2Var, Object[] objArr) {
            return this.d.adapt(xr2Var);
        }
    }

    public static final class b<ResponseT> extends a<ResponseT, Object> {
        public final zr2<ResponseT, xr2<ResponseT>> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f20835e;

        public b(oqf oqfVar, wr2.a aVar, ma4<cuf, ResponseT> ma4Var, zr2<ResponseT, xr2<ResponseT>> zr2Var, boolean z) {
            super(oqfVar, aVar, ma4Var);
            this.d = zr2Var;
            this.f20835e = z;
        }

        @Override // retrofit2.a
        public Object c(xr2<ResponseT> xr2Var, Object[] objArr) {
            xr2<ResponseT> xr2VarAdapt = this.d.adapt(xr2Var);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f20835e ? KotlinExtensions.b(xr2VarAdapt, continuation) : KotlinExtensions.a(xr2VarAdapt, continuation);
            } catch (Exception e2) {
                return KotlinExtensions.d(e2, continuation);
            }
        }
    }

    public static final class c<ResponseT> extends a<ResponseT, Object> {
        public final zr2<ResponseT, xr2<ResponseT>> d;

        public c(oqf oqfVar, wr2.a aVar, ma4<cuf, ResponseT> ma4Var, zr2<ResponseT, xr2<ResponseT>> zr2Var) {
            super(oqfVar, aVar, ma4Var);
            this.d = zr2Var;
        }

        @Override // retrofit2.a
        public Object c(xr2<ResponseT> xr2Var, Object[] objArr) {
            xr2<ResponseT> xr2VarAdapt = this.d.adapt(xr2Var);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.c(xr2VarAdapt, continuation);
            } catch (Exception e2) {
                return KotlinExtensions.d(e2, continuation);
            }
        }
    }

    public a(oqf oqfVar, wr2.a aVar, ma4<cuf, ResponseT> ma4Var) {
        this.a = oqfVar;
        this.b = aVar;
        this.f20834c = ma4Var;
    }

    public static <ResponseT, ReturnT> zr2<ResponseT, ReturnT> d(evf evfVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (zr2<ResponseT, ReturnT>) evfVar.a(type, annotationArr);
        } catch (RuntimeException e2) {
            throw Utils.n(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> ma4<cuf, ResponseT> e(evf evfVar, Method method, Type type) {
        try {
            return evfVar.h(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw Utils.n(method, e2, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> a<ResponseT, ReturnT> f(evf evfVar, Method method, oqf oqfVar) {
        Type genericReturnType;
        boolean z;
        boolean z2 = oqfVar.k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = Utils.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.h(typeF) == ztf.class && (typeF instanceof ParameterizedType)) {
                typeF = Utils.g(0, (ParameterizedType) typeF);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, xr2.class, typeF);
            annotations = e8h.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        zr2 zr2VarD = d(evfVar, method, genericReturnType, annotations);
        Type typeResponseType = zr2VarD.responseType();
        if (typeResponseType == ytf.class) {
            throw Utils.m(method, "'" + Utils.h(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == ztf.class) {
            throw Utils.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (oqfVar.f15022c.equals("HEAD") && !Void.class.equals(typeResponseType)) {
            throw Utils.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        ma4 ma4VarE = e(evfVar, method, typeResponseType);
        wr2.a aVar = evfVar.b;
        if (z2) {
            return z ? new c(oqfVar, aVar, ma4VarE, zr2VarD) : new b(oqfVar, aVar, ma4VarE, zr2VarD, false);
        }
        return new C1057a(oqfVar, aVar, ma4VarE, zr2VarD);
    }

    @Override // com.oplus.aiunit.vision.mvg
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new dfd(this.a, objArr, this.b, this.f20834c), objArr);
    }

    @Nullable
    public abstract ReturnT c(xr2<ResponseT> xr2Var, Object[] objArr);
}
