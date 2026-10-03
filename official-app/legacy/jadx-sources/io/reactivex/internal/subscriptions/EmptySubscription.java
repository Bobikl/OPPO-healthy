package io.reactivex.internal.subscriptions;

import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptySubscription implements h7f<Object> {
    INSTANCE;

    public static void complete(v2j<?> v2jVar) {
        v2jVar.onSubscribe(INSTANCE);
        v2jVar.onComplete();
    }

    public static void error(Throwable th, v2j<?> v2jVar) {
        v2jVar.onSubscribe(INSTANCE);
        v2jVar.onError(th);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
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
    public Object poll() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.validate(j2);
    }

    @Override // com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
