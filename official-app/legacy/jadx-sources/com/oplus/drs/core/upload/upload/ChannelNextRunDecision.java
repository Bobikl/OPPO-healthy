package com.oplus.drs.core.upload.upload;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChannelNextRunDecision {
    public static final ChannelNextRunDecision NONE = new ChannelNextRunDecision(Action.NONE, 0);

    @NonNull
    public final Action a;
    public final long b;

    public enum Action {
        NONE,
        IMMEDIATE_FOLLOW_UP,
        IMMEDIATE_RETRY,
        DELAY_RETRY,
        WAIT_FOR_RECOVERY,
        STOP_RETRY
    }

    public ChannelNextRunDecision(@NonNull Action action, long j2) {
        this.a = action;
        this.b = Math.max(0L, j2);
    }

    public String toString() {
        return "ChannelNextRunDecision{action=" + this.a + ", delayMs=" + this.b + "}";
    }
}
