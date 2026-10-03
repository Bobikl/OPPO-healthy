package com.oplus.aiunit.vision;

import O0O.O00;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class su7 {

    public static final class a<T, R> extends wt7<R> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final T f16755j;
        public final d08<? super T, ? extends k3f<? extends R>> k;

        public a(T t, d08<? super T, ? extends k3f<? extends R>> d08Var) {
            this.f16755j = t;
            this.k = d08Var;
        }

        @Override // com.oplus.aiunit.vision.wt7
        public void z(v2j<? super R> v2jVar) {
            try {
                k3f<? extends R> k3fVarApply = this.k.apply(this.f16755j);
                Objects.requireNonNull(k3fVarApply, "The mapper returned a null Publisher");
                k3f<? extends R> k3fVar = k3fVarApply;
                if (!(k3fVar instanceof f4j)) {
                    k3fVar.subscribe(v2jVar);
                    return;
                }
                try {
                    Object obj = ((f4j) k3fVar).get();
                    if (obj == null) {
                        EmptySubscription.complete(v2jVar);
                    } else {
                        v2jVar.onSubscribe(new ScalarSubscription(v2jVar, obj));
                    }
                } catch (Throwable th) {
                    hu6.b(th);
                    EmptySubscription.error(th, v2jVar);
                }
            } catch (Throwable th2) {
                hu6.b(th2);
                EmptySubscription.error(th2, v2jVar);
            }
        }
    }

    public static <T, U> wt7<U> a(T t, d08<? super T, ? extends k3f<? extends U>> d08Var) {
        return g4g.o(new a(t, d08Var));
    }

    public static <T, R> boolean b(k3f<T> k3fVar, v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var) {
        if (!(k3fVar instanceof f4j)) {
            return false;
        }
        try {
            O00 o00 = (Object) ((f4j) k3fVar).get();
            if (o00 == null) {
                EmptySubscription.complete(v2jVar);
                return true;
            }
            try {
                k3f<? extends R> k3fVarApply = d08Var.apply(o00);
                Objects.requireNonNull(k3fVarApply, "The mapper returned a null Publisher");
                k3f<? extends R> k3fVar2 = k3fVarApply;
                if (k3fVar2 instanceof f4j) {
                    try {
                        Object obj = ((f4j) k3fVar2).get();
                        if (obj == null) {
                            EmptySubscription.complete(v2jVar);
                            return true;
                        }
                        v2jVar.onSubscribe(new ScalarSubscription(v2jVar, obj));
                    } catch (Throwable th) {
                        hu6.b(th);
                        EmptySubscription.error(th, v2jVar);
                        return true;
                    }
                } else {
                    k3fVar2.subscribe(v2jVar);
                }
                return true;
            } catch (Throwable th2) {
                hu6.b(th2);
                EmptySubscription.error(th2, v2jVar);
                return true;
            }
        } catch (Throwable th3) {
            hu6.b(th3);
            EmptySubscription.error(th3, v2jVar);
            return true;
        }
    }
}
