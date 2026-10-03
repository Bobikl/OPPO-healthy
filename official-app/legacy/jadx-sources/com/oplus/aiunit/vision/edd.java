package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class edd<T> extends ynb<T> {
    public final kdd<T> i;

    public static final class a<T> implements bed<T>, cv5 {
        public final mob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public cv5 f10875j;
        public T k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10876l;

        public a(mob<? super T> mobVar) {
            this.i = mobVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f10875j.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f10875j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            if (this.f10876l) {
                return;
            }
            this.f10876l = true;
            T t = this.k;
            this.k = null;
            if (t == null) {
                this.i.onComplete();
            } else {
                this.i.onSuccess(t);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (this.f10876l) {
                h4g.r(th);
            } else {
                this.f10876l = true;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.f10876l) {
                return;
            }
            if (this.k == null) {
                this.k = t;
                return;
            }
            this.f10876l = true;
            this.f10875j.dispose();
            this.i.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.f10875j, cv5Var)) {
                this.f10875j = cv5Var;
                this.i.onSubscribe(this);
            }
        }
    }

    public edd(kdd<T> kddVar) {
        this.i = kddVar;
    }

    @Override // com.oplus.aiunit.vision.ynb
    public void b(mob<? super T> mobVar) {
        this.i.subscribe(new a(mobVar));
    }
}
