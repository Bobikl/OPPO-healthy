package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.od1;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeEqualSingle$EqualCoordinator<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a {
    final l6h<? super Boolean> downstream;
    final od1<? super T, ? super T> isEqual;
    final MaybeEqualSingle$EqualObserver<T> observer1;
    final MaybeEqualSingle$EqualObserver<T> observer2;

    public MaybeEqualSingle$EqualCoordinator(l6h<? super Boolean> l6hVar, od1<? super T, ? super T> od1Var) {
        super(2);
        this.downstream = l6hVar;
        this.isEqual = od1Var;
        this.observer1 = new MaybeEqualSingle$EqualObserver<>(this);
        this.observer2 = new MaybeEqualSingle$EqualObserver<>(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.observer1.dispose();
        this.observer2.dispose();
    }

    public void done() {
        if (decrementAndGet() == 0) {
            Object obj = this.observer1.value;
            Object obj2 = this.observer2.value;
            if (obj == null || obj2 == null) {
                this.downstream.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                return;
            }
            try {
                this.downstream.onSuccess(Boolean.valueOf(this.isEqual.a(obj, obj2)));
            } catch (Throwable th) {
                hu6.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public void error(MaybeEqualSingle$EqualObserver<T> maybeEqualSingle$EqualObserver, Throwable th) {
        if (getAndSet(0) <= 0) {
            g4g.u(th);
            return;
        }
        MaybeEqualSingle$EqualObserver<T> maybeEqualSingle$EqualObserver2 = this.observer1;
        if (maybeEqualSingle$EqualObserver == maybeEqualSingle$EqualObserver2) {
            this.observer2.dispose();
        } else {
            maybeEqualSingle$EqualObserver2.dispose();
        }
        this.downstream.onError(th);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.observer1.get());
    }

    public void subscribe(pob<? extends T> pobVar, pob<? extends T> pobVar2) {
        pobVar.a(this.observer1);
        pobVar2.a(this.observer2);
    }
}
