package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.ax2;
import com.oplus.aiunit.vision.cs3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.pr3;
import com.oplus.aiunit.vision.ur3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableCreate extends pr3 {
    public final cs3 i;

    public static final class Emitter extends AtomicReference<a> implements ur3, a {
        private static final long serialVersionUID = -2467358622224974244L;
        final as3 downstream;

        public Emitter(as3 as3Var) {
            this.downstream = as3Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.ur3
        public void onComplete() {
            a andSet;
            a aVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            g4g.u(th);
        }

        public void setCancellable(ax2 ax2Var) {
            setDisposable(new CancellableDisposable(ax2Var));
        }

        public void setDisposable(a aVar) {
            DisposableHelper.set(this, aVar);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }

        public boolean tryOnError(Throwable th) {
            a andSet;
            if (th == null) {
                th = ExceptionHelper.b("onError called with a null Throwable.");
            }
            a aVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public CompletableCreate(cs3 cs3Var) {
        this.i = cs3Var;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        Emitter emitter = new Emitter(as3Var);
        as3Var.onSubscribe(emitter);
        try {
            this.i.a(emitter);
        } catch (Throwable th) {
            hu6.b(th);
            emitter.onError(th);
        }
    }
}
