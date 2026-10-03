package io.reactivex.internal.disposables;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.mob;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptyDisposable implements b7f<Object> {
    INSTANCE,
    NEVER;

    public static void complete(bed<?> bedVar) {
        bedVar.onSubscribe(INSTANCE);
        bedVar.onComplete();
    }

    public static void error(Throwable th, bed<?> bedVar) {
        bedVar.onSubscribe(INSTANCE);
        bedVar.onError(th);
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.g4h
    public Object poll() throws Exception {
        return null;
    }

    @Override // com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(mob<?> mobVar) {
        mobVar.onSubscribe(INSTANCE);
        mobVar.onComplete();
    }

    public static void error(Throwable th, bs3 bs3Var) {
        bs3Var.onSubscribe(INSTANCE);
        bs3Var.onError(th);
    }

    public static void complete(bs3 bs3Var) {
        bs3Var.onSubscribe(INSTANCE);
        bs3Var.onComplete();
    }

    public static void error(Throwable th, m6h<?> m6hVar) {
        m6hVar.onSubscribe(INSTANCE);
        m6hVar.onError(th);
    }

    public static void error(Throwable th, mob<?> mobVar) {
        mobVar.onSubscribe(INSTANCE);
        mobVar.onError(th);
    }
}
