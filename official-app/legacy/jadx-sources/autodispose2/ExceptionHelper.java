package autodispose2;

import com.oplus.aiunit.vision.fue;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ExceptionHelper {
    public static final Throwable a = new Termination();

    public static final class Termination extends Throwable {
        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == a) {
                return false;
            }
        } while (!fue.a(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }
}
