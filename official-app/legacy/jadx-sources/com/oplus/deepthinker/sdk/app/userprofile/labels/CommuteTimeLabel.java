package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/CommuteTimeLabel;", "", "generateTime", "", "clusterTag", "", "timeClusters", "", "Lcom/oplus/deepthinker/sdk/app/userprofile/labels/TimeCluster;", "(JILjava/util/List;)V", "getClusterTag", "()I", "setClusterTag", "(I)V", "getGenerateTime", "()J", "setGenerateTime", "(J)V", "getTimeClusters", "()Ljava/util/List;", "setTimeClusters", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CommuteTimeLabel {
    private int clusterTag;
    private long generateTime;

    @NotNull
    private List<TimeCluster> timeClusters;

    public CommuteTimeLabel() {
        this(0L, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommuteTimeLabel copy$default(CommuteTimeLabel commuteTimeLabel, long j2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = commuteTimeLabel.generateTime;
        }
        if ((i2 & 2) != 0) {
            i = commuteTimeLabel.clusterTag;
        }
        if ((i2 & 4) != 0) {
            list = commuteTimeLabel.timeClusters;
        }
        return commuteTimeLabel.copy(j2, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getClusterTag() {
        return this.clusterTag;
    }

    @NotNull
    public final List<TimeCluster> component3() {
        return this.timeClusters;
    }

    @NotNull
    public final CommuteTimeLabel copy(long generateTime, int clusterTag, @NotNull List<TimeCluster> timeClusters) {
        Intrinsics.checkNotNullParameter(timeClusters, "timeClusters");
        return new CommuteTimeLabel(generateTime, clusterTag, timeClusters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommuteTimeLabel)) {
            return false;
        }
        CommuteTimeLabel commuteTimeLabel = (CommuteTimeLabel) other;
        return this.generateTime == commuteTimeLabel.generateTime && this.clusterTag == commuteTimeLabel.clusterTag && Intrinsics.areEqual(this.timeClusters, commuteTimeLabel.timeClusters);
    }

    public final int getClusterTag() {
        return this.clusterTag;
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final List<TimeCluster> getTimeClusters() {
        return this.timeClusters;
    }

    public int hashCode() {
        return (((Long.hashCode(this.generateTime) * 31) + Integer.hashCode(this.clusterTag)) * 31) + this.timeClusters.hashCode();
    }

    public final void setClusterTag(int i) {
        this.clusterTag = i;
    }

    public final void setGenerateTime(long j2) {
        this.generateTime = j2;
    }

    public final void setTimeClusters(@NotNull List<TimeCluster> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.timeClusters = list;
    }

    @NotNull
    public String toString() {
        return "CommuteTimeLabel(generateTime=" + this.generateTime + ", clusterTag=" + this.clusterTag + ", timeClusters=" + this.timeClusters + ')';
    }

    public CommuteTimeLabel(long j2, int i, @NotNull List<TimeCluster> timeClusters) {
        Intrinsics.checkNotNullParameter(timeClusters, "timeClusters");
        this.generateTime = j2;
        this.clusterTag = i;
        this.timeClusters = timeClusters;
    }

    public /* synthetic */ CommuteTimeLabel(long j2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
