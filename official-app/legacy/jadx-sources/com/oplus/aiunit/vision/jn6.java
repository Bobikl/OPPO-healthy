package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class jn6 {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        g4g.u(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<c3j> atomicReference, c3j c3jVar, Class<?> cls) {
        Objects.requireNonNull(c3jVar, "next is null");
        if (fue.a(atomicReference, null, c3jVar)) {
            return true;
        }
        c3jVar.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, io.reactivex.rxjava3.disposables.a aVar, Class<?> cls) {
        Objects.requireNonNull(aVar, "next is null");
        if (fue.a(atomicReference, null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
