package io.reactivex.rxjava3.disposables;

import com.oplus.aiunit.vision.Cdo;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static a d() {
        return EmptyDisposable.INSTANCE;
    }

    static a e() {
        return i(Functions.EMPTY_RUNNABLE);
    }

    static a i(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    static a m(Cdo cdo) {
        Objects.requireNonNull(cdo, "action is null");
        return new ActionDisposable(cdo);
    }

    void dispose();

    boolean isDisposed();
}
