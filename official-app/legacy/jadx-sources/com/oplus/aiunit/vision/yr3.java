package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
@IgnoreJRERequirement
public final class yr3 extends zr2.a {
    public static final zr2.a a = new yr3();

    @IgnoreJRERequirement
    public static final class a<R> implements zr2<R, CompletableFuture<R>> {
        public final Type a;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.yr3$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0947a implements at2<R> {
            public final CompletableFuture<R> i;

            public C0947a(CompletableFuture<R> completableFuture) {
                this.i = completableFuture;
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onFailure(xr2<R> xr2Var, Throwable th) {
                this.i.completeExceptionally(th);
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onResponse(xr2<R> xr2Var, ztf<R> ztfVar) {
                if (ztfVar.g()) {
                    this.i.complete(ztfVar.a());
                } else {
                    this.i.completeExceptionally(new HttpException(ztfVar));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // com.oplus.aiunit.vision.zr2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> adapt(xr2<R> xr2Var) {
            b bVar = new b(xr2Var);
            xr2Var.h(new C0947a(bVar));
            return bVar;
        }

        @Override // com.oplus.aiunit.vision.zr2
        public Type responseType() {
            return this.a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {
        public final xr2<?> i;

        public b(xr2<?> xr2Var) {
            this.i = xr2Var;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.i.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements zr2<R, CompletableFuture<ztf<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        public class a implements at2<R> {
            public final CompletableFuture<ztf<R>> i;

            public a(CompletableFuture<ztf<R>> completableFuture) {
                this.i = completableFuture;
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onFailure(xr2<R> xr2Var, Throwable th) {
                this.i.completeExceptionally(th);
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onResponse(xr2<R> xr2Var, ztf<R> ztfVar) {
                this.i.complete(ztfVar);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // com.oplus.aiunit.vision.zr2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<ztf<R>> adapt(xr2<R> xr2Var) {
            b bVar = new b(xr2Var);
            xr2Var.h(new a(bVar));
            return bVar;
        }

        @Override // com.oplus.aiunit.vision.zr2
        public Type responseType() {
            return this.a;
        }
    }

    @Override // com.oplus.aiunit.vision.zr2.a
    @Nullable
    public zr2<?, ?> get(Type type, Annotation[] annotationArr, evf evfVar) {
        if (zr2.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = zr2.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (zr2.a.getRawType(parameterUpperBound) != ztf.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(zr2.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
