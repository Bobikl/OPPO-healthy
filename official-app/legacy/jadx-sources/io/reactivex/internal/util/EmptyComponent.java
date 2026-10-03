package io.reactivex.internal.util;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptyComponent implements wu7<Object>, bed<Object>, mob<Object>, m6h<Object>, bs3, c3j, cv5 {
    INSTANCE;

    public static <T> bed<T> asObserver() {
        return INSTANCE;
    }

    public static <T> v2j<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        h4g.r(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        cv5Var.dispose();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(Object obj) {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        c3jVar.cancel();
    }
}
