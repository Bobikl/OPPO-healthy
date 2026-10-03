package com.heytap.health.community.utils;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/community/utils/CommunitySp;", "", "()V", "hasTipShown", "", "getHasTipShown", "()I", "setHasTipShown", "(I)V", "latestFollowPostId", "", "getLatestFollowPostId", "()J", "setLatestFollowPostId", "(J)V", "saturationConfig", "", "getSaturationConfig", "()Ljava/lang/String;", "setSaturationConfig", "(Ljava/lang/String;)V", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommunitySp {
    private int hasTipShown = -1;
    private long latestFollowPostId;

    @Nullable
    private String saturationConfig;

    public final int getHasTipShown() {
        return this.hasTipShown;
    }

    public final long getLatestFollowPostId() {
        return this.latestFollowPostId;
    }

    @Nullable
    public final String getSaturationConfig() {
        return this.saturationConfig;
    }

    public final void setHasTipShown(int i) {
        this.hasTipShown = i;
    }

    public final void setLatestFollowPostId(long j2) {
        this.latestFollowPostId = j2;
    }

    public final void setSaturationConfig(@Nullable String str) {
        this.saturationConfig = str;
    }
}
