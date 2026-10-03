package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bx2;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fu7;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableCreate$BaseEmitter<T> extends AtomicLong implements fu7<T>, c3j {
    private static final long serialVersionUID = 7326289992464377023L;
    final v2j<? super T> downstream;
    final SequentialDisposable serial = new SequentialDisposable();

    public FlowableCreate$BaseEmitter(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public final void cancel() {
        this.serial.dispose();
        onUnsubscribed();
    }

    public void complete() {
        if (isCancelled()) {
            return;
        }
        try {
            this.downstream.onComplete();
        } finally {
            this.serial.dispose();
        }
    }

    public boolean error(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isCancelled()) {
            return false;
        }
        try {
            this.downstream.onError(th);
            return true;
        } finally {
            this.serial.dispose();
        }
    }

    public final boolean isCancelled() {
        return this.serial.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onComplete() {
        complete();
    }

    @Override // com.oplus.aiunit.vision.ll6
    public final void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        h4g.r(th);
    }

    @Override // com.oplus.aiunit.vision.ll6
    public abstract /* synthetic */ void onNext(Object obj);

    public void onRequested() {
    }

    public void onUnsubscribed() {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this, j2);
            onRequested();
        }
    }

    public final long requested() {
        return get();
    }

    public final fu7<T> serialize() {
        return new FlowableCreate$SerializedEmitter(this);
    }

    public final void setCancellable(bx2 bx2Var) {
        setDisposable(new CancellableDisposable(bx2Var));
    }

    public final void setDisposable(cv5 cv5Var) {
        this.serial.update(cv5Var);
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }

    public boolean tryOnError(Throwable th) {
        return error(th);
    }
}
