package io.reactivex.rxjava3.internal.subscriptions;

import com.oplus.aiunit.vision.c3j;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<c3j> implements a {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        c3j andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                c3j c3jVar = get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (c3jVar != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public c3j replaceResource(int i, c3j c3jVar) {
        c3j c3jVar2;
        do {
            c3jVar2 = get(i);
            if (c3jVar2 == SubscriptionHelper.CANCELLED) {
                if (c3jVar == null) {
                    return null;
                }
                c3jVar.cancel();
                return null;
            }
        } while (!compareAndSet(i, c3jVar2, c3jVar));
        return c3jVar2;
    }

    public boolean setResource(int i, c3j c3jVar) {
        c3j c3jVar2;
        do {
            c3jVar2 = get(i);
            if (c3jVar2 == SubscriptionHelper.CANCELLED) {
                if (c3jVar == null) {
                    return false;
                }
                c3jVar.cancel();
                return false;
            }
        } while (!compareAndSet(i, c3jVar2, c3jVar));
        if (c3jVar2 == null) {
            return true;
        }
        c3jVar2.cancel();
        return true;
    }
}
