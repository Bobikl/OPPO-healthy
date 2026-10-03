package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBuffer$BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -8223395059921494546L;
    final f4j<U> bufferSupplier;
    final ArrayDeque<U> buffers = new ArrayDeque<>();
    final int count;
    final aed<? super U> downstream;
    long index;
    final int skip;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableBuffer$BufferSkipObserver(aed<? super U> aedVar, int i, int i2, f4j<U> f4jVar) {
        this.downstream = aedVar;
        this.count = i;
        this.skip = i2;
        this.bufferSupplier = f4jVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        while (!this.buffers.isEmpty()) {
            this.downstream.onNext(this.buffers.poll());
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.buffers.clear();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        long j2 = this.index;
        this.index = 1 + j2;
        if (j2 % ((long) this.skip) == 0) {
            try {
                this.buffers.offer((U) ((Collection) ExceptionHelper.c(this.bufferSupplier.get(), "The bufferSupplier returned a null Collection.")));
            } catch (Throwable th) {
                hu6.b(th);
                this.buffers.clear();
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
        }
        Iterator<U> it = this.buffers.iterator();
        while (it.hasNext()) {
            U next = it.next();
            next.add(t);
            if (this.count <= next.size()) {
                it.remove();
                this.downstream.onNext(next);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
