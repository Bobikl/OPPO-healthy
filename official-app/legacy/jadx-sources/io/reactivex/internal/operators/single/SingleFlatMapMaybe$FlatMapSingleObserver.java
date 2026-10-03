package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.b6h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapMaybe$FlatMapSingleObserver<T, R> extends AtomicReference<cv5> implements m6h<T>, cv5 {
    private static final long serialVersionUID = -5843758257109742742L;
    final mob<? super R> downstream;
    final j08<? super T, ? extends qob<? extends R>> mapper;

    public SingleFlatMapMaybe$FlatMapSingleObserver(mob<? super R> mobVar, j08<? super T, ? extends qob<? extends R>> j08Var) {
        this.downstream = mobVar;
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

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        try {
            qob qobVar = (qob) abd.d(this.mapper.apply(t), "The mapper returned a null MaybeSource");
            if (isDisposed()) {
                return;
            }
            qobVar.a(new b6h(this, this.downstream));
        } catch (Throwable th) {
            iu6.b(th);
            onError(th);
        }
    }
}
