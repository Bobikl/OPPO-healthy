package com.heytap.health.insight;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/insight/CommonSpContent;", "", "type", "", "ssoid", "lastTime", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getLastTime", "()J", "getSsoid", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CommonSpContent {
    public static final int $stable = 0;
    private final long lastTime;

    @NotNull
    private final String ssoid;

    @NotNull
    private final String type;

    public CommonSpContent(@NotNull String type, @NotNull String ssoid, long j2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.type = type;
        this.ssoid = ssoid;
        this.lastTime = j2;
    }

    public static /* synthetic */ CommonSpContent copy$default(CommonSpContent commonSpContent, String str, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonSpContent.type;
        }
        if ((i & 2) != 0) {
            str2 = commonSpContent.ssoid;
        }
        if ((i & 4) != 0) {
            j2 = commonSpContent.lastTime;
        }
        return commonSpContent.copy(str, str2, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final CommonSpContent copy(@NotNull String type, @NotNull String ssoid, long lastTime) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new CommonSpContent(type, ssoid, lastTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSpContent)) {
            return false;
        }
        CommonSpContent commonSpContent = (CommonSpContent) other;
        return Intrinsics.areEqual(this.type, commonSpContent.type) && Intrinsics.areEqual(this.ssoid, commonSpContent.ssoid) && this.lastTime == commonSpContent.lastTime;
    }

    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.ssoid.hashCode()) * 31) + Long.hashCode(this.lastTime);
    }

    @NotNull
    public String toString() {
        return "CommonSpContent(type=" + this.type + ", ssoid=" + this.ssoid + ", lastTime=" + this.lastTime + ")";
    }
}
