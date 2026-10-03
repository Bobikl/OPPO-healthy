package autodispose2;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.do0;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.yn0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
enum AutoSubscriptionHelper implements c3j {
    CANCELLED;

    public static void deferredRequest(AtomicReference<c3j> atomicReference, AtomicLong atomicLong, long j2) {
        c3j c3jVar = atomicReference.get();
        if (c3jVar != null) {
            c3jVar.request(j2);
            return;
        }
        if (validate(j2)) {
            yn0.a(atomicLong, j2);
            c3j c3jVar2 = atomicReference.get();
            if (c3jVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    c3jVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<c3j> atomicReference, AtomicLong atomicLong, c3j c3jVar) {
        if (!setOnce(atomicReference, c3jVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        c3jVar.request(andSet);
        return true;
    }

    public static boolean isCancelled(c3j c3jVar) {
        return c3jVar == CANCELLED;
    }

    public static boolean replace(AtomicReference<c3j> atomicReference, c3j c3jVar) {
        c3j c3jVar2;
        do {
            c3jVar2 = atomicReference.get();
            if (c3jVar2 == CANCELLED) {
                if (c3jVar == null) {
                    return false;
                }
                c3jVar.cancel();
                return false;
            }
        } while (!fue.a(atomicReference, c3jVar2, c3jVar));
        return true;
    }

    public static void reportMoreProduced(long j2) {
        g4g.u(new IllegalStateException("More produced than requested: " + j2));
    }

    public static void reportSubscriptionSet() {
        g4g.u(new IllegalStateException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<c3j> atomicReference, c3j c3jVar) {
        c3j c3jVar2;
        do {
            c3jVar2 = atomicReference.get();
            if (c3jVar2 == CANCELLED) {
                if (c3jVar == null) {
                    return false;
                }
                c3jVar.cancel();
                return false;
            }
        } while (!fue.a(atomicReference, c3jVar2, c3jVar));
        if (c3jVar2 == null) {
            return true;
        }
        c3jVar2.cancel();
        return true;
    }

    public static boolean setIfNotSet(AtomicReference<c3j> atomicReference, c3j c3jVar) {
        do0.a(c3jVar, "s is null");
        return fue.a(atomicReference, null, c3jVar);
    }

    public static boolean setOnce(AtomicReference<c3j> atomicReference, c3j c3jVar) {
        do0.a(c3jVar, "s is null");
        if (fue.a(atomicReference, null, c3jVar)) {
            return true;
        }
        c3jVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(c3j c3jVar, c3j c3jVar2) {
        if (c3jVar2 == null) {
            g4g.u(new NullPointerException("next is null"));
            return false;
        }
        if (c3jVar == null) {
            return true;
        }
        c3jVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
    }

    public static boolean cancel(AtomicReference<c3j> atomicReference) {
        c3j andSet;
        c3j c3jVar = atomicReference.get();
        AutoSubscriptionHelper autoSubscriptionHelper = CANCELLED;
        if (c3jVar == autoSubscriptionHelper || (andSet = atomicReference.getAndSet(autoSubscriptionHelper)) == autoSubscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j2) {
        if (j2 > 0) {
            return true;
        }
        g4g.u(new IllegalArgumentException("n > 0 required but it was " + j2));
        return false;
    }
}
