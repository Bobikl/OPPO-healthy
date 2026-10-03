package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.ml6;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean isTerminated() {
        return get() == ExceptionHelper.TERMINATED;
    }

    public Throwable terminate() {
        return ExceptionHelper.e(this);
    }

    public boolean tryAddThrowable(Throwable th) {
        return ExceptionHelper.a(this, th);
    }

    public boolean tryAddThrowableOrReport(Throwable th) {
        if (tryAddThrowable(th)) {
            return true;
        }
        g4g.u(th);
        return false;
    }

    public void tryTerminateAndReport() {
        Throwable thTerminate = terminate();
        if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
            return;
        }
        g4g.u(thTerminate);
    }

    public void tryTerminateConsumer(v2j<?> v2jVar) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            v2jVar.onComplete();
        } else if (thTerminate != ExceptionHelper.TERMINATED) {
            v2jVar.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(aed<?> aedVar) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            aedVar.onComplete();
        } else if (thTerminate != ExceptionHelper.TERMINATED) {
            aedVar.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(lob<?> lobVar) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            lobVar.onComplete();
        } else if (thTerminate != ExceptionHelper.TERMINATED) {
            lobVar.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(l6h<?> l6hVar) {
        Throwable thTerminate = terminate();
        if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
            return;
        }
        l6hVar.onError(thTerminate);
    }

    public void tryTerminateConsumer(as3 as3Var) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            as3Var.onComplete();
        } else if (thTerminate != ExceptionHelper.TERMINATED) {
            as3Var.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(ml6<?> ml6Var) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            ml6Var.onComplete();
        } else if (thTerminate != ExceptionHelper.TERMINATED) {
            ml6Var.onError(thTerminate);
        }
    }
}
