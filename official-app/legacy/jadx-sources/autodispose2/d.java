package autodispose2;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static void a(aed<?> aedVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                aedVar.onError(thTerminate);
            } else {
                aedVar.onComplete();
            }
        }
    }

    public static void b(v2j<?> v2jVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                v2jVar.onError(thTerminate);
            } else {
                v2jVar.onComplete();
            }
        }
    }

    public static void c(aed<?> aedVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            g4g.u(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            aedVar.onError(atomicThrowable.terminate());
        }
    }

    public static void d(v2j<?> v2jVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            g4g.u(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            v2jVar.onError(atomicThrowable.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean e(aed<? super T> aedVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            aedVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    aedVar.onError(thTerminate);
                } else {
                    aedVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(v2j<? super T> v2jVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            v2jVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    v2jVar.onError(thTerminate);
                } else {
                    v2jVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
