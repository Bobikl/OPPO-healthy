package com.heytap.store.business.component.entity;

import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/business/component/entity/LiveReportEntity;", "", SensorsBean.RESERVE_PLACE, "", "(Ljava/lang/String;)V", "getReserve_place", "()Ljava/lang/String;", "setReserve_place", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveReportEntity {

    @NotNull
    private String reserve_place;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveReportEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LiveReportEntity copy$default(LiveReportEntity liveReportEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveReportEntity.reserve_place;
        }
        return liveReportEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReserve_place() {
        return this.reserve_place;
    }

    @NotNull
    public final LiveReportEntity copy(@NotNull String reserve_place) {
        Intrinsics.checkNotNullParameter(reserve_place, "reserve_place");
        return new LiveReportEntity(reserve_place);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiveReportEntity) && Intrinsics.areEqual(this.reserve_place, ((LiveReportEntity) other).reserve_place);
    }

    @NotNull
    public final String getReserve_place() {
        return this.reserve_place;
    }

    public int hashCode() {
        return this.reserve_place.hashCode();
    }

    public final void setReserve_place(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserve_place = str;
    }

    @NotNull
    public String toString() {
        return "LiveReportEntity(reserve_place=" + this.reserve_place + ')';
    }

    public LiveReportEntity(@NotNull String reserve_place) {
        Intrinsics.checkNotNullParameter(reserve_place, "reserve_place");
        this.reserve_place = reserve_place;
    }

    public /* synthetic */ LiveReportEntity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
