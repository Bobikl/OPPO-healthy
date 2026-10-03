package com.oplus.aiunit.vision;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class kn6 {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        h4g.r(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<cv5> atomicReference, cv5 cv5Var, Class<?> cls) {
        abd.d(cv5Var, "next is null");
        if (fue.a(atomicReference, null, cv5Var)) {
            return true;
        }
        cv5Var.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<c3j> atomicReference, c3j c3jVar, Class<?> cls) {
        abd.d(c3jVar, "next is null");
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
}
