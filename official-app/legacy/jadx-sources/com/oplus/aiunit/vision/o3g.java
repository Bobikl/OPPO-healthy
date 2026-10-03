package com.oplus.aiunit.vision;

import rx.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public class o3g<T, K> extends f3g {
    public final a6<T, K> b;

    public o3g(a6<T, K> a6Var) {
        this(a6Var, null);
    }

    public o3g(a6<T, K> a6Var, Scheduler scheduler) {
        super(scheduler);
        this.b = a6Var;
    }
}
