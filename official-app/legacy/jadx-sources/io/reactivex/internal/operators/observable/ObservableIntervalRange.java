package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.d9k;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableIntervalRange extends kbd<Long> {
    public final zeg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20481j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f20482l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TimeUnit f20483n;

    public static final class IntervalRangeObserver extends AtomicReference<cv5> implements cv5, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final bed<? super Long> downstream;
        final long end;

        public IntervalRangeObserver(bed<? super Long> bedVar, long j2, long j3) {
            this.downstream = bedVar;
            this.count = j2;
            this.end = j3;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j2 = this.count;
            this.downstream.onNext(Long.valueOf(j2));
            if (j2 != this.end) {
                this.count = j2 + 1;
            } else {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
            }
        }

        public void setResource(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableIntervalRange(long j2, long j3, long j4, long j5, TimeUnit timeUnit, zeg zegVar) {
        this.f20482l = j4;
        this.m = j5;
        this.f20483n = timeUnit;
        this.i = zegVar;
        this.f20481j = j2;
        this.k = j3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super Long> bedVar) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(bedVar, this.f20481j, this.k);
        bedVar.onSubscribe(intervalRangeObserver);
        zeg zegVar = this.i;
        if (!(zegVar instanceof d9k)) {
            intervalRangeObserver.setResource(zegVar.e(intervalRangeObserver, this.f20482l, this.m, this.f20483n));
            return;
        }
        zeg.c cVarA = zegVar.a();
        intervalRangeObserver.setResource(cVarA);
        cVarA.d(intervalRangeObserver, this.f20482l, this.m, this.f20483n);
    }
}
