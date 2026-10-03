package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class pi1 {
    public static void a() {
        if (h4g.j()) {
            if ((Thread.currentThread() instanceof huc) || h4g.p()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
