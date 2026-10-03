package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.fue;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ExceptionHelper {
    public static final Throwable TERMINATED = new Termination();

    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == TERMINATED) {
                return false;
            }
        } while (!fue.a(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(d(str));
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw b(str);
    }

    public static String d(String str) {
        return str + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static Throwable e(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = TERMINATED;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception f(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String g(long j2, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j2 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException h(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
