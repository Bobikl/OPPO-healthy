package com.heytap.health.watch.notification.impl.pull;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watch/notification/impl/pull/PullConfig;", "", "pollInterval", "", "notifyIdList", "", "", "(JLjava/util/List;)V", "getNotifyIdList", "()Ljava/util/List;", "getPollInterval", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PullConfig {

    @NotNull
    private final List<Integer> notifyIdList;
    private final long pollInterval;

    public PullConfig(long j2, @NotNull List<Integer> notifyIdList) {
        Intrinsics.checkNotNullParameter(notifyIdList, "notifyIdList");
        this.pollInterval = j2;
        this.notifyIdList = notifyIdList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PullConfig copy$default(PullConfig pullConfig, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = pullConfig.pollInterval;
        }
        if ((i & 2) != 0) {
            list = pullConfig.notifyIdList;
        }
        return pullConfig.copy(j2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPollInterval() {
        return this.pollInterval;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.notifyIdList;
    }

    @NotNull
    public final PullConfig copy(long pollInterval, @NotNull List<Integer> notifyIdList) {
        Intrinsics.checkNotNullParameter(notifyIdList, "notifyIdList");
        return new PullConfig(pollInterval, notifyIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullConfig)) {
            return false;
        }
        PullConfig pullConfig = (PullConfig) other;
        return this.pollInterval == pullConfig.pollInterval && Intrinsics.areEqual(this.notifyIdList, pullConfig.notifyIdList);
    }

    @NotNull
    public final List<Integer> getNotifyIdList() {
        return this.notifyIdList;
    }

    public final long getPollInterval() {
        return this.pollInterval;
    }

    public int hashCode() {
        return (Long.hashCode(this.pollInterval) * 31) + this.notifyIdList.hashCode();
    }

    @NotNull
    public String toString() {
        return "PullConfig(pollInterval=" + this.pollInterval + ", notifyIdList=" + this.notifyIdList + ")";
    }
}
