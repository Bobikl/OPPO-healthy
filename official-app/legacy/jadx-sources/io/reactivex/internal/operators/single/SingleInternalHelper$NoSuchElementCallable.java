package io.reactivex.internal.operators.single;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
enum SingleInternalHelper$NoSuchElementCallable implements Callable<NoSuchElementException> {
    INSTANCE;

    @Override // java.util.concurrent.Callable
    public NoSuchElementException call() throws Exception {
        return new NoSuchElementException();
    }
}
