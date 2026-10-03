package autodispose2;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.do0;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        g4g.u(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<c3j> atomicReference, c3j c3jVar, Class<?> cls) {
        do0.a(c3jVar, "next is null");
        if (fue.a(atomicReference, null, c3jVar)) {
            return true;
        }
        c3jVar.cancel();
        if (atomicReference.get() == AutoSubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, io.reactivex.rxjava3.disposables.a aVar, Class<?> cls) {
        do0.a(aVar, "next is null");
        if (fue.a(atomicReference, null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == AutoDisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
