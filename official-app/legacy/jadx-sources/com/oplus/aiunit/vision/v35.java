package com.oplus.aiunit.vision;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public final class v35 extends zr2.a {

    @Nullable
    public final Executor a;

    public class a implements zr2<Object, xr2<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // com.oplus.aiunit.vision.zr2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xr2<Object> adapt(xr2<Object> xr2Var) {
            Executor executor = this.b;
            return executor == null ? xr2Var : new b(executor, xr2Var);
        }

        @Override // com.oplus.aiunit.vision.zr2
        public Type responseType() {
            return this.a;
        }
    }

    public static final class b<T> implements xr2<T> {
        public final Executor i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xr2<T> f17689j;

        public class a implements at2<T> {
            public final /* synthetic */ at2 i;

            public a(at2 at2Var) {
                this.i = at2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c(at2 at2Var, Throwable th) {
                at2Var.onFailure(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void d(at2 at2Var, ztf ztfVar) {
                if (b.this.f17689j.isCanceled()) {
                    at2Var.onFailure(b.this, new IOException("Canceled"));
                } else {
                    at2Var.onResponse(b.this, ztfVar);
                }
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onFailure(xr2<T> xr2Var, final Throwable th) {
                Executor executor = b.this.i;
                final at2 at2Var = this.i;
                executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.x35
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.c(at2Var, th);
                    }
                });
            }

            @Override // com.oplus.aiunit.vision.at2
            public void onResponse(xr2<T> xr2Var, final ztf<T> ztfVar) {
                Executor executor = b.this.i;
                final at2 at2Var = this.i;
                executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.w35
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.d(at2Var, ztfVar);
                    }
                });
            }
        }

        public b(Executor executor, xr2<T> xr2Var) {
            this.i = executor;
            this.f17689j = xr2Var;
        }

        @Override // com.oplus.aiunit.vision.xr2
        public void cancel() {
            this.f17689j.cancel();
        }

        @Override // com.oplus.aiunit.vision.xr2
        public ztf<T> execute() throws IOException {
            return this.f17689j.execute();
        }

        @Override // com.oplus.aiunit.vision.xr2
        public void h(at2<T> at2Var) {
            Objects.requireNonNull(at2Var, "callback == null");
            this.f17689j.h(new a(at2Var));
        }

        @Override // com.oplus.aiunit.vision.xr2
        public boolean isCanceled() {
            return this.f17689j.isCanceled();
        }

        @Override // com.oplus.aiunit.vision.xr2
        public Request request() {
            return this.f17689j.request();
        }

        @Override // com.oplus.aiunit.vision.xr2
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public xr2<T> m5145clone() {
            return new b(this.i, this.f17689j.m5145clone());
        }
    }

    public v35(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // com.oplus.aiunit.vision.zr2.a
    @Nullable
    public zr2<?, ?> get(Type type, Annotation[] annotationArr, evf evfVar) {
        if (zr2.a.getRawType(type) != xr2.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(Utils.g(0, (ParameterizedType) type), Utils.l(annotationArr, d8h.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
