package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.drs.core.upload.upload.ChannelTaskTriggerReason;
import com.oplus.drs.core.upload.upload.ChannelType;

/* JADX INFO: loaded from: classes6.dex */
public final class t73 {
    public final ChannelType a;
    public final ChannelTaskTriggerReason b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16914c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16915e;

    public t73(@NonNull ChannelType channelType, @NonNull ChannelTaskTriggerReason channelTaskTriggerReason, long j2, boolean z, boolean z2) {
        this.a = channelType;
        this.b = channelTaskTriggerReason;
        this.f16914c = j2;
        this.d = z;
        this.f16915e = z2;
    }

    @NonNull
    public static t73 a(@NonNull ChannelType channelType) {
        return new t73(channelType, ChannelTaskTriggerReason.DEBUG_TRIGGER, System.currentTimeMillis(), true, false);
    }

    @NonNull
    public static t73 b(@NonNull ChannelType channelType, @NonNull ChannelTaskTriggerReason channelTaskTriggerReason) {
        return new t73(channelType, channelTaskTriggerReason, System.currentTimeMillis(), false, false);
    }

    @NonNull
    public static t73 c(@NonNull ChannelType channelType) {
        return new t73(channelType, ChannelTaskTriggerReason.SCHEDULED_RETRY, System.currentTimeMillis(), false, true);
    }

    public String toString() {
        return "ChannelTaskRequest{channelType=" + this.a + ", triggerReason=" + this.b + ", requestTimeMs=" + this.f16914c + ", skipGateCheck=" + this.d + ", scheduledRun=" + this.f16915e + "}";
    }
}
