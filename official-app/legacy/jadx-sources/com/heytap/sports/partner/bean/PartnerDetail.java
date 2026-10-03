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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/partner/bean/PartnerDetail;", "", "members", "", "Lcom/heytap/sports/partner/bean/MemberInfo;", "userTasks", "Lcom/heytap/sports/partner/bean/UserTask;", "taskConfig", "Lcom/heytap/sports/partner/bean/TaskConfig;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMembers", "()Ljava/util/List;", "getTaskConfig", "getUserTasks", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartnerDetail {
    public static final int $stable = 8;

    @NotNull
    private final List<MemberInfo> members;

    @NotNull
    private final List<TaskConfig> taskConfig;

    @NotNull
    private final List<UserTask> userTasks;

    public PartnerDetail() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerDetail copy$default(PartnerDetail partnerDetail, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = partnerDetail.members;
        }
        if ((i & 2) != 0) {
            list2 = partnerDetail.userTasks;
        }
        if ((i & 4) != 0) {
            list3 = partnerDetail.taskConfig;
        }
        return partnerDetail.copy(list, list2, list3);
    }

    @NotNull
    public final List<MemberInfo> component1() {
        return this.members;
    }

    @NotNull
    public final List<UserTask> component2() {
        return this.userTasks;
    }

    @NotNull
    public final List<TaskConfig> component3() {
        return this.taskConfig;
    }

    @NotNull
    public final PartnerDetail copy(@NotNull List<MemberInfo> members, @NotNull List<UserTask> userTasks, @NotNull List<TaskConfig> taskConfig) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(userTasks, "userTasks");
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        return new PartnerDetail(members, userTasks, taskConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerDetail)) {
            return false;
        }
        PartnerDetail partnerDetail = (PartnerDetail) other;
        return Intrinsics.areEqual(this.members, partnerDetail.members) && Intrinsics.areEqual(this.userTasks, partnerDetail.userTasks) && Intrinsics.areEqual(this.taskConfig, partnerDetail.taskConfig);
    }

    @NotNull
    public final List<MemberInfo> getMembers() {
        return this.members;
    }

    @NotNull
    public final List<TaskConfig> getTaskConfig() {
        return this.taskConfig;
    }

    @NotNull
    public final List<UserTask> getUserTasks() {
        return this.userTasks;
    }

    public int hashCode() {
        return (((this.members.hashCode() * 31) + this.userTasks.hashCode()) * 31) + this.taskConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "PartnerDetail(members=" + this.members + ", userTasks=" + this.userTasks + ", taskConfig=" + this.taskConfig + ")";
    }

    public PartnerDetail(@NotNull List<MemberInfo> members, @NotNull List<UserTask> userTasks, @NotNull List<TaskConfig> taskConfig) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(userTasks, "userTasks");
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        this.members = members;
        this.userTasks = userTasks;
        this.taskConfig = taskConfig;
    }

    public /* synthetic */ PartnerDetail(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
