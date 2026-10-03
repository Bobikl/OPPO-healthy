package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/health_archives/bean/DeletePlanRequestBean;", "", "dataIdList", "", "", "(Ljava/util/List;)V", "getDataIdList", "()Ljava/util/List;", "setDataIdList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeletePlanRequestBean {

    @Nullable
    private List<String> dataIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public DeletePlanRequestBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeletePlanRequestBean copy$default(DeletePlanRequestBean deletePlanRequestBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deletePlanRequestBean.dataIdList;
        }
        return deletePlanRequestBean.copy(list);
    }

    @Nullable
    public final List<String> component1() {
        return this.dataIdList;
    }

    @NotNull
    public final DeletePlanRequestBean copy(@Nullable List<String> dataIdList) {
        return new DeletePlanRequestBean(dataIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeletePlanRequestBean) && Intrinsics.areEqual(this.dataIdList, ((DeletePlanRequestBean) other).dataIdList);
    }

    @Nullable
    public final List<String> getDataIdList() {
        return this.dataIdList;
    }

    public int hashCode() {
        List<String> list = this.dataIdList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setDataIdList(@Nullable List<String> list) {
        this.dataIdList = list;
    }

    @NotNull
    public String toString() {
        return "DeletePlanRequestBean(dataIdList=" + this.dataIdList + ")";
    }

    public DeletePlanRequestBean(@Nullable List<String> list) {
        this.dataIdList = list;
    }

    public /* synthetic */ DeletePlanRequestBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
