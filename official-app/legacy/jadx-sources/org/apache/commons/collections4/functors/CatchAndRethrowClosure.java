package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class CatchAndRethrowClosure<E> implements Closure<E> {
    @Override // org.apache.commons.collections4.Closure
    public void execute(E e2) {
        try {
            executeAndThrow(e2);
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Throwable th) {
            throw new FunctorException(th);
        }
    }

    public abstract void executeAndThrow(E e2) throws Throwable;
}
