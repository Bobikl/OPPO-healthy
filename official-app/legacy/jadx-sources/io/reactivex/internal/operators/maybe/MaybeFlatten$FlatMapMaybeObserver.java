package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatten$FlatMapMaybeObserver<T, R> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 4375739915521278546L;
    final mob<? super R> downstream;
    final j08<? super T, ? extends qob<? extends R>> mapper;
    cv5 upstream;

    public final class a implements mob<R> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(MaybeFlatten$FlatMapMaybeObserver.this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(R r) {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onSuccess(r);
        }
    }

    public MaybeFlatten$FlatMapMaybeObserver(mob<? super R> mobVar, j08<? super T, ? extends qob<? extends R>> j08Var) {
        this.downstream = mobVar;
        this.mapper = j08Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        try {
            qob qobVar = (qob) abd.d(this.mapper.apply(t), "The mapper returned a null MaybeSource");
            if (isDisposed()) {
                return;
            }
            qobVar.a(new a());
        } catch (Exception e2) {
            iu6.b(e2);
            this.downstream.onError(e2);
        }
    }
}
