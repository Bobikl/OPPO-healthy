package com.oplus.aiunit.vision;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class seb implements io.reactivex.rxjava3.disposables.a {
    public final AtomicBoolean i = new AtomicBoolean();

    public abstract void a();

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        if (this.i.compareAndSet(false, true)) {
            if (xn0.b()) {
                a();
            } else {
                f30.c().g(new Runnable() { // from class: com.oplus.aiunit.vision.reb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.a();
                    }
                });
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return this.i.get();
    }
}
