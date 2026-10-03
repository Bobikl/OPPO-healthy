package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapNotification$FlatMapMaybeObserver<T, R> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 4375739915521278546L;
    final mob<? super R> downstream;
    final Callable<? extends qob<? extends R>> onCompleteSupplier;
    final j08<? super Throwable, ? extends qob<? extends R>> onErrorMapper;
    final j08<? super T, ? extends qob<? extends R>> onSuccessMapper;
    cv5 upstream;

    public final class a implements mob<R> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(MaybeFlatMapNotification$FlatMapMaybeObserver.this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(R r) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onSuccess(r);
        }
    }

    public MaybeFlatMapNotification$FlatMapMaybeObserver(mob<? super R> mobVar, j08<? super T, ? extends qob<? extends R>> j08Var, j08<? super Throwable, ? extends qob<? extends R>> j08Var2, Callable<? extends qob<? extends R>> callable) {
        this.downstream = mobVar;
        this.onSuccessMapper = j08Var;
        this.onErrorMapper = j08Var2;
        this.onCompleteSupplier = callable;
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
        try {
            ((qob) abd.d(this.onCompleteSupplier.call(), "The onCompleteSupplier returned a null MaybeSource")).a(new a());
        } catch (Exception e2) {
            iu6.b(e2);
            this.downstream.onError(e2);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        try {
            ((qob) abd.d(this.onErrorMapper.apply(th), "The onErrorMapper returned a null MaybeSource")).a(new a());
        } catch (Exception e2) {
            iu6.b(e2);
            this.downstream.onError(new CompositeException(th, e2));
        }
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
            ((qob) abd.d(this.onSuccessMapper.apply(t), "The onSuccessMapper returned a null MaybeSource")).a(new a());
        } catch (Exception e2) {
            iu6.b(e2);
            this.downstream.onError(e2);
        }
    }
}
