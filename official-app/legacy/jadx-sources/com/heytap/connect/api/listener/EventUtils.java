package com.heytap.connect.api.listener;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/connect/api/listener/EventUtils;", "", "", "isSameConnect", "()Z", "", "lastEventTime", "J", "", "MIN_EVENT_DELAY_TIME", "I", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class EventUtils {

    @NotNull
    public static final EventUtils INSTANCE = new EventUtils();
    private static final int MIN_EVENT_DELAY_TIME = 100;
    private static long lastEventTime;

    private EventUtils() {
    }

    public final boolean isSameConnect() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - lastEventTime < 100;
        lastEventTime = jCurrentTimeMillis;
        return z;
    }
}
