package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueDisposable<R> implements lob<T>, l6h<T> {
    private static final long serialVersionUID = 7363336003027148283L;
    AutoCloseable close;
    volatile boolean disposed;
    final aed<? super R> downstream;
    volatile Iterator<? extends R> iterator;
    final d08<? super T, ? extends Stream<? extends R>> mapper;
    boolean once;
    boolean outputFused;
    a upstream;

    public MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver(aed<? super R> aedVar, d08<? super T, ? extends Stream<? extends R>> d08Var) {
        this.downstream = aedVar;
        this.mapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public void clear() {
        this.iterator = null;
        AutoCloseable autoCloseable = this.close;
        this.close = null;
        close(autoCloseable);
    }

    public void close(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        if (this.outputFused) {
            return;
        }
        drain();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super R> aedVar = this.downstream;
        Iterator<? extends R> it = this.iterator;
        int iAddAndGet = 1;
        while (true) {
            if (this.disposed) {
                clear();
            } else if (this.outputFused) {
                aedVar.onNext(null);
                aedVar.onComplete();
            } else {
                try {
                    R next = it.next();
                    if (!this.disposed) {
                        aedVar.onNext(next);
                        if (!this.disposed) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.disposed && !zHasNext) {
                                    aedVar.onComplete();
                                    this.disposed = true;
                                }
                            } catch (Throwable th) {
                                hu6.b(th);
                                aedVar.onError(th);
                                this.disposed = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    aedVar.onError(th2);
                    this.disposed = true;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        Iterator<? extends R> it = this.iterator;
        if (it == null) {
            return true;
        }
        if (!this.once || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            Stream<? extends R> streamApply = this.mapper.apply(t);
            Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
            Stream<? extends R> stream = streamApply;
            Iterator<? extends R> it = stream.iterator();
            if (!it.hasNext()) {
                this.downstream.onComplete();
                close(stream);
            } else {
                this.iterator = it;
                this.close = stream;
                drain();
            }
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public R poll() throws Throwable {
        Iterator<? extends R> it = this.iterator;
        if (it == null) {
            return null;
        }
        if (!this.once) {
            this.once = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
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
