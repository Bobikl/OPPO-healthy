package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapIterableObservable$FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements m6h<T> {
    private static final long serialVersionUID = -8938804753851907758L;
    volatile boolean cancelled;
    final bed<? super R> downstream;
    volatile Iterator<? extends R> it;
    final j08<? super T, ? extends Iterable<? extends R>> mapper;
    boolean outputFused;
    cv5 upstream;

    public SingleFlatMapIterableObservable$FlatMapIterableObserver(bed<? super R> bedVar, j08<? super T, ? extends Iterable<? extends R>> j08Var) {
        this.downstream = bedVar;
        this.mapper = j08Var;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.it = null;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.it == null;
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        bed<? super R> bedVar = this.downstream;
        try {
            Iterator<? extends R> it = this.mapper.apply(t).iterator();
            if (!it.hasNext()) {
                bedVar.onComplete();
                return;
            }
            if (this.outputFused) {
                this.it = it;
                bedVar.onNext(null);
                bedVar.onComplete();
                return;
            }
            while (!this.cancelled) {
                try {
                    bedVar.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            bedVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        iu6.b(th);
                        bedVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    iu6.b(th2);
                    bedVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            iu6.b(th3);
            this.downstream.onError(th3);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public R poll() throws Exception {
        Iterator<? extends R> it = this.it;
        if (it == null) {
            return null;
        }
        R r = (R) abd.d(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.it = null;
        }
        return r;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
