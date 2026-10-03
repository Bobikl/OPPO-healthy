package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/partner/bean/TaskDetail;", "", "taskConfig", "Lcom/heytap/sports/partner/bean/TaskConfig;", "statList", "", "Lcom/heytap/sports/partner/bean/TaskStat;", "(Lcom/heytap/sports/partner/bean/TaskConfig;Ljava/util/List;)V", "getStatList", "()Ljava/util/List;", "getTaskConfig", "()Lcom/heytap/sports/partner/bean/TaskConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TaskDetail {
    public static final int $stable = 8;

    @NotNull
    private final List<TaskStat> statList;

    @NotNull
    private final TaskConfig taskConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public TaskDetail() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskDetail copy$default(TaskDetail taskDetail, TaskConfig taskConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            taskConfig = taskDetail.taskConfig;
        }
        if ((i & 2) != 0) {
            list = taskDetail.statList;
        }
        return taskDetail.copy(taskConfig, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    @NotNull
    public final List<TaskStat> component2() {
        return this.statList;
    }

    @NotNull
    public final TaskDetail copy(@NotNull TaskConfig taskConfig, @NotNull List<TaskStat> statList) {
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        Intrinsics.checkNotNullParameter(statList, "statList");
        return new TaskDetail(taskConfig, statList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskDetail)) {
            return false;
        }
        TaskDetail taskDetail = (TaskDetail) other;
        return Intrinsics.areEqual(this.taskConfig, taskDetail.taskConfig) && Intrinsics.areEqual(this.statList, taskDetail.statList);
    }

    @NotNull
    public final List<TaskStat> getStatList() {
        return this.statList;
    }

    @NotNull
    public final TaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    public int hashCode() {
        return (this.taskConfig.hashCode() * 31) + this.statList.hashCode();
    }

    @NotNull
    public String toString() {
        return "TaskDetail(taskConfig=" + this.taskConfig + ", statList=" + this.statList + ")";
    }

    public TaskDetail(@NotNull TaskConfig taskConfig, @NotNull List<TaskStat> statList) {
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        Intrinsics.checkNotNullParameter(statList, "statList");
        this.taskConfig = taskConfig;
        this.statList = statList;
    }

    public /* synthetic */ TaskDetail(TaskConfig taskConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TaskConfig(0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191, null) : taskConfig, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
