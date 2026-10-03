package io.reactivex.rxjava3.internal.disposables;

import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public enum DisposableHelper implements a {
    DISPOSED;

    public static boolean replace(AtomicReference<a> atomicReference, a aVar) {
        a aVar2;
        do {
            aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
        } while (!fue.a(atomicReference, aVar2, aVar));
        return true;
    }

    public static void reportDisposableSet() {
        g4g.u(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<a> atomicReference, a aVar) {
        a aVar2;
        do {
            aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
        } while (!fue.a(atomicReference, aVar2, aVar));
        if (aVar2 == null) {
            return true;
        }
        aVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<a> atomicReference, a aVar) {
        Objects.requireNonNull(aVar, "d is null");
        if (fue.a(atomicReference, null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<a> atomicReference, a aVar) {
        if (fue.a(atomicReference, null, aVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        aVar.dispose();
        return false;
    }

    public static boolean validate(a aVar, a aVar2) {
        if (aVar2 == null) {
            g4g.u(new NullPointerException("next is null"));
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<a> atomicReference) {
        a andSet;
        a aVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (aVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(a aVar) {
        return aVar == DISPOSED;
    }
}
