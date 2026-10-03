package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.ytg;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableDebounceTimed<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20557j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f20558l;

    public static final class DebounceEmitter<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements Runnable, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final a<T> parent;
        final T value;

        public DebounceEmitter(T t, long j2, a<T> aVar) {
            this.value = t;
            this.idx = j2;
            this.parent = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this.idx, this.value, this);
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.replace(this, aVar);
        }
    }

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f20559j;
        public final TimeUnit k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final cfg.c f20560l;
        public io.reactivex.rxjava3.disposables.a m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f20561n;
        public volatile long o;
        public boolean p;

        public a(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg.c cVar) {
            this.i = aedVar;
            this.f20559j = j2;
            this.k = timeUnit;
            this.f20560l = cVar;
        }

        public void a(long j2, T t, DebounceEmitter<T> debounceEmitter) {
            if (j2 == this.o) {
                this.i.onNext(t);
                debounceEmitter.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.m.dispose();
            this.f20560l.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f20560l.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.p) {
                return;
            }
            this.p = true;
            io.reactivex.rxjava3.disposables.a aVar = this.f20561n;
            if (aVar != null) {
                aVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) aVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.i.onComplete();
            this.f20560l.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.p) {
                g4g.u(th);
                return;
            }
            io.reactivex.rxjava3.disposables.a aVar = this.f20561n;
            if (aVar != null) {
                aVar.dispose();
            }
            this.p = true;
            this.i.onError(th);
            this.f20560l.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.p) {
                return;
            }
            long j2 = this.o + 1;
            this.o = j2;
            io.reactivex.rxjava3.disposables.a aVar = this.f20561n;
            if (aVar != null) {
                aVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t, j2, this);
            this.f20561n = debounceEmitter;
            debounceEmitter.setResource(this.f20560l.c(debounceEmitter, this.f20559j, this.k));
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.m, aVar)) {
                this.m = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(jdd<T> jddVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
        super(jddVar);
        this.f20557j = j2;
        this.k = timeUnit;
        this.f20558l = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(new ytg(aedVar), this.f20557j, this.k, this.f20558l.c()));
    }
}
