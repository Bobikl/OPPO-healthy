package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operation.timeline.TimelineNode;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f0k, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/f0k;", "", "", "Lcom/heytap/health/operation/timeline/TimelineNode;", "a", "Lcom/oplus/aiunit/vision/enj;", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "nodes", "d", UTraceSQLiteHelperKt.COL_TAGS, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TimelineData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<TimelineNode> nodes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<enj> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public TimelineData(@NotNull List<? extends TimelineNode> nodes, @NotNull List<? extends enj> tags) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.nodes = nodes;
        this.tags = tags;
    }

    @NotNull
    public final List<TimelineNode> a() {
        return this.nodes;
    }

    @NotNull
    public final List<enj> b() {
        return this.tags;
    }

    @NotNull
    public final List<TimelineNode> c() {
        return this.nodes;
    }

    @NotNull
    public final List<enj> d() {
        return this.tags;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineData)) {
            return false;
        }
        TimelineData timelineData = (TimelineData) other;
        return Intrinsics.areEqual(this.nodes, timelineData.nodes) && Intrinsics.areEqual(this.tags, timelineData.tags);
    }

    public int hashCode() {
        return (this.nodes.hashCode() * 31) + this.tags.hashCode();
    }

    @NotNull
    public String toString() {
        return "TimelineData(nodes=" + this.nodes + ", tags=" + this.tags + ")";
    }
}
