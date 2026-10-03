package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableZip<T, R> extends kbd<R> {
    public final kdd<? extends T>[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Iterable<? extends kdd<? extends T>> f20489j;
    public final j08<? super Object[], ? extends R> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20490l;
    public final boolean m;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements cv5 {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final bed<? super R> downstream;
        final a<T, R>[] observers;
        final T[] row;
        final j08<? super Object[], ? extends R> zipper;

        public ZipCoordinator(bed<? super R> bedVar, j08<? super Object[], ? extends R> j08Var, int i, boolean z) {
            this.downstream = bedVar;
            this.zipper = j08Var;
            this.observers = new a[i];
            this.row = (T[]) new Object[i];
            this.delayError = z;
        }

        public void cancel() {
            clear();
            cancelSources();
        }

        public void cancelSources() {
            for (a<T, R> aVar : this.observers) {
                aVar.a();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, bed<? super R> bedVar, boolean z3, a<?, ?> aVar) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = aVar.f20492l;
                this.cancelled = true;
                cancel();
                if (th != null) {
                    bedVar.onError(th);
                } else {
                    bedVar.onComplete();
                }
                return true;
            }
            Throwable th2 = aVar.f20492l;
            if (th2 != null) {
                this.cancelled = true;
                cancel();
                bedVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            cancel();
            bedVar.onComplete();
            return true;
        }

        public void clear() {
            for (a<T, R> aVar : this.observers) {
                aVar.f20491j.clear();
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear();
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T, R>[] aVarArr = this.observers;
            bed<? super R> bedVar = this.downstream;
            T[] tArr = this.row;
            boolean z = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (a<T, R> aVar : aVarArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = aVar.k;
                        T tPoll = aVar.f20491j.poll();
                        boolean z3 = tPoll == null;
                        if (checkTerminated(z2, z3, bedVar, z, aVar)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (aVar.k && !z && (th = aVar.f20492l) != null) {
                        this.cancelled = true;
                        cancel();
                        bedVar.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        bedVar.onNext((Object) abd.d(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        cancel();
                        bedVar.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(kdd<? extends T>[] kddVarArr, int i) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2] = new a<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                kddVarArr[i3].subscribe(aVarArr[i3]);
            }
        }
    }

    public static final class a<T, R> implements bed<T> {
        public final ZipCoordinator<T, R> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final yki<T> f20491j;
        public volatile boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Throwable f20492l;
        public final AtomicReference<cv5> m = new AtomicReference<>();

        public a(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.i = zipCoordinator;
            this.f20491j = new yki<>(i);
        }

        public void a() {
            DisposableHelper.dispose(this.m);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.k = true;
            this.i.drain();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            this.f20492l = th;
            this.k = true;
            this.i.drain();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            this.f20491j.offer(t);
            this.i.drain();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this.m, cv5Var);
        }
    }

    public ObservableZip(kdd<? extends T>[] kddVarArr, Iterable<? extends kdd<? extends T>> iterable, j08<? super Object[], ? extends R> j08Var, int i, boolean z) {
        this.i = kddVarArr;
        this.f20489j = iterable;
        this.k = j08Var;
        this.f20490l = i;
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super R> bedVar) {
        int length;
        kdd<? extends T>[] kddVarArr = this.i;
        if (kddVarArr == null) {
            kddVarArr = new kbd[8];
            length = 0;
            for (kdd<? extends T> kddVar : this.f20489j) {
                if (length == kddVarArr.length) {
                    kdd<? extends T>[] kddVarArr2 = new kdd[(length >> 2) + length];
                    System.arraycopy(kddVarArr, 0, kddVarArr2, 0, length);
                    kddVarArr = kddVarArr2;
                }
                kddVarArr[length] = kddVar;
                length++;
            }
        } else {
            length = kddVarArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(bedVar);
        } else {
            new ZipCoordinator(bedVar, this.k, length, this.m).subscribe(kddVarArr, this.f20490l);
        }
    }
}
