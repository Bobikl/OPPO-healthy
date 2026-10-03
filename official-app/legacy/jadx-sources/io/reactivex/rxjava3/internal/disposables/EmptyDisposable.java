package io.reactivex.rxjava3.internal.disposables;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptyDisposable implements a7f<Object> {
    INSTANCE,
    NEVER;

    public static void complete(aed<?> aedVar) {
        aedVar.onSubscribe(INSTANCE);
        aedVar.onComplete();
    }

    public static void error(Throwable th, aed<?> aedVar) {
        aedVar.onSubscribe(INSTANCE);
        aedVar.onError(th);
    }

    @Override // com.oplus.aiunit.vision.f4h
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.f4h
    public Object poll() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(lob<?> lobVar) {
        lobVar.onSubscribe(INSTANCE);
        lobVar.onComplete();
    }

    public static void error(Throwable th, as3 as3Var) {
        as3Var.onSubscribe(INSTANCE);
        as3Var.onError(th);
    }

    public static void complete(as3 as3Var) {
        as3Var.onSubscribe(INSTANCE);
        as3Var.onComplete();
    }

    public static void error(Throwable th, l6h<?> l6hVar) {
        l6hVar.onSubscribe(INSTANCE);
        l6hVar.onError(th);
    }

    public static void error(Throwable th, lob<?> lobVar) {
        lobVar.onSubscribe(INSTANCE);
        lobVar.onError(th);
    }
}
