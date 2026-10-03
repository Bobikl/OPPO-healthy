package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes13.dex */
public class dj0<T> {
    public final Future<T> a;

    public dj0(Future<T> future) {
        this.a = future;
    }

    public T a() {
        try {
            return this.a.get();
        } catch (InterruptedException unused) {
            return null;
        } catch (ExecutionException e2) {
            throw new GdxRuntimeException(e2.getCause());
        }
    }

    public boolean b() {
        return this.a.isDone();
    }
}
