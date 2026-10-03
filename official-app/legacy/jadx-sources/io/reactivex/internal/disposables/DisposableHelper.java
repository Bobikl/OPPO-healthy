package io.reactivex.internal.disposables;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public enum DisposableHelper implements cv5 {
    DISPOSED;

    public static boolean replace(AtomicReference<cv5> atomicReference, cv5 cv5Var) {
        cv5 cv5Var2;
        do {
            cv5Var2 = atomicReference.get();
            if (cv5Var2 == DISPOSED) {
                if (cv5Var == null) {
                    return false;
                }
                cv5Var.dispose();
                return false;
            }
        } while (!fue.a(atomicReference, cv5Var2, cv5Var));
        return true;
    }

    public static void reportDisposableSet() {
        h4g.r(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<cv5> atomicReference, cv5 cv5Var) {
        cv5 cv5Var2;
        do {
            cv5Var2 = atomicReference.get();
            if (cv5Var2 == DISPOSED) {
                if (cv5Var == null) {
                    return false;
                }
                cv5Var.dispose();
                return false;
            }
        } while (!fue.a(atomicReference, cv5Var2, cv5Var));
        if (cv5Var2 == null) {
            return true;
        }
        cv5Var2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<cv5> atomicReference, cv5 cv5Var) {
        abd.d(cv5Var, "d is null");
        if (fue.a(atomicReference, null, cv5Var)) {
            return true;
        }
        cv5Var.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<cv5> atomicReference, cv5 cv5Var) {
        if (fue.a(atomicReference, null, cv5Var)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        cv5Var.dispose();
        return false;
    }

    public static boolean validate(cv5 cv5Var, cv5 cv5Var2) {
        if (cv5Var2 == null) {
            h4g.r(new NullPointerException("next is null"));
            return false;
        }
        if (cv5Var == null) {
            return true;
        }
        cv5Var2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<cv5> atomicReference) {
        cv5 andSet;
        cv5 cv5Var = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (cv5Var == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(cv5 cv5Var) {
        return cv5Var == DISPOSED;
    }
}
