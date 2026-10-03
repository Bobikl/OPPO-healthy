package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptyComponent implements vu7<Object>, aed<Object>, lob<Object>, l6h<Object>, as3, c3j, a {
    INSTANCE;

    public static <T> aed<T> asObserver() {
        return INSTANCE;
    }

    public static <T> v2j<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        g4g.u(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        aVar.dispose();
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(Object obj) {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        c3jVar.cancel();
    }
}
