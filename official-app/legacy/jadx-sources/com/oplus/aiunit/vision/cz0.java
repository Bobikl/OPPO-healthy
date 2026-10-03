package com.oplus.aiunit.vision;

import com.heytap.health.base.track.NxTrackHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public interface cz0 {
    public static final AtomicInteger launch_type = new AtomicInteger(Integer.MIN_VALUE);

    default void j6() {
        AtomicInteger atomicInteger = launch_type;
        if (atomicInteger.get() != Integer.MIN_VALUE) {
            NxTrackHelper.R(com.heytap.health.base.track.a.h("visitFrom", atomicInteger));
            atomicInteger.set(Integer.MIN_VALUE);
        }
    }

    default void v3() {
        com.heytap.health.base.track.a.d();
    }
}
