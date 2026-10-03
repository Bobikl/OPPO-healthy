package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBuffer$BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements bed<T>, cv5 {
    private static final long serialVersionUID = -8223395059921494546L;
    final Callable<U> bufferSupplier;
    final ArrayDeque<U> buffers = new ArrayDeque<>();
    final int count;
    final bed<? super U> downstream;
    long index;
    final int skip;
    cv5 upstream;

    public ObservableBuffer$BufferSkipObserver(bed<? super U> bedVar, int i, int i2, Callable<U> callable) {
        this.downstream = bedVar;
        this.count = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        while (!this.buffers.isEmpty()) {
            this.downstream.onNext(this.buffers.poll());
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.buffers.clear();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        long j2 = this.index;
        this.index = 1 + j2;
        if (j2 % ((long) this.skip) == 0) {
            try {
                this.buffers.offer((U) ((Collection) abd.d(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
            } catch (Throwable th) {
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

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
