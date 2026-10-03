package io.netty.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public interface Timer {
    Timeout newTimeout(TimerTask timerTask, long j2, TimeUnit timeUnit);

    Set<Timeout> stop();
}
