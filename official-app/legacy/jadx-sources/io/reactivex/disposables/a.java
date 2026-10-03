package io.reactivex.disposables;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static cv5 a() {
        return EmptyDisposable.INSTANCE;
    }

    public static cv5 b(Runnable runnable) {
        abd.d(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }
}
