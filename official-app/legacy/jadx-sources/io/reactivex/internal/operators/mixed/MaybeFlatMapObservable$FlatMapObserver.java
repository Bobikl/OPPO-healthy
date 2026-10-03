package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapObservable$FlatMapObserver<T, R> extends AtomicReference<cv5> implements bed<R>, mob<T>, cv5 {
    private static final long serialVersionUID = -8948264376121066672L;
    final bed<? super R> downstream;
    final j08<? super T, ? extends kdd<? extends R>> mapper;

    public MaybeFlatMapObservable$FlatMapObserver(bed<? super R> bedVar, j08<? super T, ? extends kdd<? extends R>> j08Var) {
        this.downstream = bedVar;
        this.mapper = j08Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        try {
            ((kdd) abd.d(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }
}
