package autodispose2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return ExceptionHelper.a(this, th);
    }

    public Throwable terminate() {
        return ExceptionHelper.b(this);
    }
}
