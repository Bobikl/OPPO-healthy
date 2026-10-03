package com.oplus.aiunit.vision;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class ic {
    public static volatile ic b;
    public final Executor a;

    public ic(Executor executor) {
        this.a = executor;
    }

    public static ic b() {
        if (b == null) {
            synchronized (ic.class) {
                if (b == null) {
                    b = new ic();
                }
            }
        }
        return b;
    }

    public Executor a() {
        return this.a;
    }

    public ic() {
        this(Executors.newSingleThreadExecutor());
    }
}
