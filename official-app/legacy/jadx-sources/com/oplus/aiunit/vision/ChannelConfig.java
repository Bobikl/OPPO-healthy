package com.oplus.aiunit.vision;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b73, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/b73;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "channelId", "b", "channelName", "", "c", "[Ljava/lang/Integer;", "()[Ljava/lang/Integer;", "notifyIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Integer;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ChannelConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String channelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Integer[] notifyIds;

    public ChannelConfig(@NotNull String channelId, @NotNull String channelName, @NotNull Integer[] notifyIds) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(notifyIds, "notifyIds");
        this.channelId = channelId;
        this.channelName = channelName;
        this.notifyIds = notifyIds;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer[] getNotifyIds() {
        return this.notifyIds;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ChannelConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.base.notification.ChannelConfig");
        ChannelConfig channelConfig = (ChannelConfig) other;
        return Intrinsics.areEqual(this.channelId, channelConfig.channelId) && Intrinsics.areEqual(this.channelName, channelConfig.channelName) && Arrays.equals(this.notifyIds, channelConfig.notifyIds);
    }

    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.channelName.hashCode()) * 31) + Arrays.hashCode(this.notifyIds);
    }

    @NotNull
    public String toString() {
        return "ChannelConfig(channelId=" + this.channelId + ", channelName=" + this.channelName + ", notifyIds=" + Arrays.toString(this.notifyIds) + ")";
    }
}
