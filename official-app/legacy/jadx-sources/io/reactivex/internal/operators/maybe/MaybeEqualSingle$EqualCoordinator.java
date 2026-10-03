package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.pd1;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeEqualSingle$EqualCoordinator<T> extends AtomicInteger implements cv5 {
    final m6h<? super Boolean> downstream;
    final pd1<? super T, ? super T> isEqual;
    final MaybeEqualSingle$EqualObserver<T> observer1;
    final MaybeEqualSingle$EqualObserver<T> observer2;

    public MaybeEqualSingle$EqualCoordinator(m6h<? super Boolean> m6hVar, pd1<? super T, ? super T> pd1Var) {
        super(2);
        this.downstream = m6hVar;
        this.isEqual = pd1Var;
        this.observer1 = new MaybeEqualSingle$EqualObserver<>(this);
        this.observer2 = new MaybeEqualSingle$EqualObserver<>(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
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
                iu6.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public void error(MaybeEqualSingle$EqualObserver<T> maybeEqualSingle$EqualObserver, Throwable th) {
        if (getAndSet(0) <= 0) {
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.observer1.get());
    }

    public void subscribe(qob<? extends T> qobVar, qob<? extends T> qobVar2) {
        qobVar.a(this.observer1);
        qobVar2.a(this.observer2);
    }
}
