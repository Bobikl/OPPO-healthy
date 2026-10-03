package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapIterableObservable$FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements l6h<T> {
    private static final long serialVersionUID = -8938804753851907758L;
    volatile boolean cancelled;
    final aed<? super R> downstream;
    volatile Iterator<? extends R> it;
    final d08<? super T, ? extends Iterable<? extends R>> mapper;
    boolean outputFused;
    a upstream;

    public SingleFlatMapIterableObservable$FlatMapIterableObserver(aed<? super R> aedVar, d08<? super T, ? extends Iterable<? extends R>> d08Var) {
        this.downstream = aedVar;
        this.mapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public void clear() {
        this.it = null;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.it == null;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        aed<? super R> aedVar = this.downstream;
        try {
            Iterator<? extends R> it = this.mapper.apply(t).iterator();
            if (!it.hasNext()) {
                aedVar.onComplete();
                return;
            }
            if (this.outputFused) {
                this.it = it;
                aedVar.onNext(null);
                aedVar.onComplete();
                return;
            }
            while (!this.cancelled) {
                try {
                    aedVar.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            aedVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        hu6.b(th);
                        aedVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    aedVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            hu6.b(th3);
            this.downstream.onError(th3);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public R poll() {
        Iterator<? extends R> it = this.it;
        if (it == null) {
            return null;
        }
        R next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.it = null;
        }
        return next;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
